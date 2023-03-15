package io.grasscutter.utils.enums.game;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.stream.Stream;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ItemUseReason {
    ITEM_USE_NONE(0),
    ITEM_USE_ACCEPT_QUEST(1),
    ITEM_USE_TRIGGER_ABILITY(2),
    ITEM_USE_GAIN_AVATAR(3),
    ITEM_USE_ADD_EXP(4),
    ITEM_USE_RELIVE_AVATAR(5),
    ITEM_USE_ADD_BIG_TALENT_POINT(6),
    ITEM_USE_ADD_PERSIST_STAMINA(7),
    ITEM_USE_ADD_TEMPORARY_STAMINA(8),
    ITEM_USE_ADD_CUR_STAMINA(9),
    ITEM_USE_ADD_CUR_HP(10),
    ITEM_USE_ADD_ELEM_ENERGY(11),
    ITEM_USE_ADD_ALL_ENERGY(12),
    ITEM_USE_ADD_DUNGEON_COND_TIME(13),
    ITEM_USE_ADD_WEAPON_EXP(14),
    ITEM_USE_ADD_SERVER_BUFF(15),
    ITEM_USE_DEL_SERVER_BUFF(16),
    ITEM_USE_UNLOCK_COOK_RECIPE(17),
    ITEM_USE_OPEN_RANDOM_CHEST(20),
    ITEM_USE_MAKE_GADGET(24),
    ITEM_USE_ADD_ITEM(25),
    ITEM_USE_GRANT_SELECT_REWARD(26),
    ITEM_USE_ADD_SELECT_ITEM(27),
    ITEM_USE_GAIN_FLYCLOAK(28),
    ITEM_USE_GAIN_NAME_CARD(29),
    ITEM_USE_UNLOCK_PAID_BATTLE_PASS_NORMAL(30),
    ITEM_USE_GAIN_CARD_PRODUCT(31),
    ITEM_USE_UNLOCK_FORGE(32),
    ITEM_USE_UNLOCK_COMBINE(33),
    ITEM_USE_UNLOCK_CODEX(34),
    ITEM_USE_CHEST_SELECT_ITEM(35),
    ITEM_USE_GAIN_RESIN_CARD_PRODUCT(36),
    ITEM_USE_ADD_RELIQUARY_EXP(37),
    ITEM_USE_UNLOCK_FURNITURE_FORMULA(38),
    ITEM_USE_UNLOCK_FURNITURE_SUITE(39),
    ITEM_USE_ADD_CHANNELLER_SLAB_BUFF(40),
    ITEM_USE_GAIN_COSTUME(41),
    ITEM_USE_ADD_TREASURE_MAP_BONUS_REGION_FRAGMENT(42),
    ITEM_USE_COMBINE_ITEM(43),
    ITEM_USE_UNLOCK_HOME_MODULE(44),
    ITEM_USE_UNLOCK_HOME_BGM(45),
    ITEM_USE_ADD_REGIONAL_PLAY_VAR(46);

    private static final Int2ObjectMap<ItemUseReason> map = new Int2ObjectOpenHashMap<>();

    private final int value;

    static {
        // Cache the values.
        Stream.of(ItemUseReason.values()).forEach(entry -> map.put(entry.getValue(), entry));
    }

    /**
     * Fetches a use reason by its value.
     *
     * @param value The value of the use reason.
     * @return The use reason.
     */
    public static ItemUseReason fetch(int value) {
        return map.getOrDefault(value, ITEM_USE_NONE);
    }
}
