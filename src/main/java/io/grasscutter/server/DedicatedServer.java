package io.grasscutter.server;

import io.grasscutter.Grasscutter;
import io.grasscutter.server.game.GameServer;
import io.grasscutter.server.http.HttpServer;
import io.grasscutter.utils.EncodingUtils;
import io.grasscutter.utils.constants.Log;
import io.grasscutter.utils.objects.lang.Language;
import io.grasscutter.utils.objects.lang.TextContainer;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.util.Arrays;
import lombok.Getter;
import org.slf4j.Logger;

/* Manages server-related aspects. */
public final class DedicatedServer {
    @Getter private static DedicatedServer instance;
    @Getter private static GameServer gameServer;
    @Getter private static HttpServer httpServer;
    @Getter private final Logger logger;

    private final ServerThread thread;

    public DedicatedServer(Logger logger, GameServer gameServer, HttpServer httpServer) {
        // Set the dedicated servers.
        DedicatedServer.gameServer = gameServer;
        DedicatedServer.httpServer = httpServer;

        // Set the dedicated server instance.
        DedicatedServer.instance = this;
        // Set the dedicated server logger.
        this.logger = logger;

        // Create the server thread.
        this.thread = new ServerThread(this);
    }

    /** Performs a global server tick. */
    public void tick() {}

    /** Starts both game & HTTP servers. */
    public void start() {
        // Start the dedicated servers.
        DedicatedServer.gameServer.start();
        DedicatedServer.httpServer.start();

        // Start the dedicated server thread.
        this.thread.start();
    }

    /** Stops both game & HTTP servers. */
    public void stop() {
        // Stop the dedicated servers.
        DedicatedServer.gameServer.interrupt();
        DedicatedServer.httpServer.stop();

        // Stop the dedicated server thread.
        this.thread.end();
    }

    /** Performs a server reload. */
    public void reload() {
        Log.info(this.logger, new TextContainer("server.dedicated.reload.start"));
        var startupTime = System.currentTimeMillis();

        // Reload the server internals.
        Grasscutter.loadConfig();

        var languageData = Grasscutter.loadLanguage();
        if (!languageData.isValid()) {
            Grasscutter.getLogger().error("Failed to load language data.");
            return;
        }
        Grasscutter.setServerLanguage(new Language(languageData));

        // Reload the dedicated servers.
        DedicatedServer.gameServer.reload();
        DedicatedServer.httpServer.reload();

        // Log the time it took to reload.
        var time = EncodingUtils.toSeconds(System.currentTimeMillis() - startupTime);
        Log.info(this.logger, new TextContainer("server.dedicated.reload.done", time));
    }

    /**
     * Dumps information about all active threads.
     *
     * @return {@link ThreadInfo} as a string.
     */
    public String dumpThreads() {
        var threads = ManagementFactory.getThreadMXBean().dumpAllThreads(true, true);

        var builder = new StringBuilder();
        Arrays.stream(threads).forEach(thread -> builder.append('\n').append(thread));

        return builder.toString();
    }
}