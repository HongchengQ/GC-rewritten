// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonRestartInviteNotify.proto

package io.grasscutter.proto;

public final class DungeonRestartInviteNotifyOuterClass {
  private DungeonRestartInviteNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonRestartInviteNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonRestartInviteNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 player_uid = 3;</code>
     * @return The playerUid.
     */
    int getPlayerUid();

    /**
     * <code>uint32 cd = 15;</code>
     * @return The cd.
     */
    int getCd();

    /**
     * <code>uint32 point_id = 13;</code>
     * @return The pointId.
     */
    int getPointId();

    /**
     * <code>uint32 dungeon_id = 10;</code>
     * @return The dungeonId.
     */
    int getDungeonId();
  }
  /**
   * <pre>
   * CmdId: 957
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code DungeonRestartInviteNotify}
   */
  public static final class DungeonRestartInviteNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonRestartInviteNotify)
      DungeonRestartInviteNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonRestartInviteNotify.newBuilder() to construct.
    private DungeonRestartInviteNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonRestartInviteNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonRestartInviteNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DungeonRestartInviteNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 24: {

              playerUid_ = input.readUInt32();
              break;
            }
            case 80: {

              dungeonId_ = input.readUInt32();
              break;
            }
            case 104: {

              pointId_ = input.readUInt32();
              break;
            }
            case 120: {

              cd_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.internal_static_DungeonRestartInviteNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.internal_static_DungeonRestartInviteNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify.class, io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify.Builder.class);
    }

    public static final int PLAYER_UID_FIELD_NUMBER = 3;
    private int playerUid_;
    /**
     * <code>uint32 player_uid = 3;</code>
     * @return The playerUid.
     */
    @java.lang.Override
    public int getPlayerUid() {
      return playerUid_;
    }

    public static final int CD_FIELD_NUMBER = 15;
    private int cd_;
    /**
     * <code>uint32 cd = 15;</code>
     * @return The cd.
     */
    @java.lang.Override
    public int getCd() {
      return cd_;
    }

    public static final int POINT_ID_FIELD_NUMBER = 13;
    private int pointId_;
    /**
     * <code>uint32 point_id = 13;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 10;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 10;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (playerUid_ != 0) {
        output.writeUInt32(3, playerUid_);
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(10, dungeonId_);
      }
      if (pointId_ != 0) {
        output.writeUInt32(13, pointId_);
      }
      if (cd_ != 0) {
        output.writeUInt32(15, cd_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (playerUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, playerUid_);
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, dungeonId_);
      }
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, pointId_);
      }
      if (cd_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, cd_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify other = (io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify) obj;

      if (getPlayerUid()
          != other.getPlayerUid()) return false;
      if (getCd()
          != other.getCd()) return false;
      if (getPointId()
          != other.getPointId()) return false;
      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + PLAYER_UID_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerUid();
      hash = (37 * hash) + CD_FIELD_NUMBER;
      hash = (53 * hash) + getCd();
      hash = (37 * hash) + POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 957
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code DungeonRestartInviteNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonRestartInviteNotify)
        io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.internal_static_DungeonRestartInviteNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.internal_static_DungeonRestartInviteNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify.class, io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        playerUid_ = 0;

        cd_ = 0;

        pointId_ = 0;

        dungeonId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.internal_static_DungeonRestartInviteNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify build() {
        io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify buildPartial() {
        io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify result = new io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify(this);
        result.playerUid_ = playerUid_;
        result.cd_ = cd_;
        result.pointId_ = pointId_;
        result.dungeonId_ = dungeonId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify) {
          return mergeFrom((io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify other) {
        if (other == io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify.getDefaultInstance()) return this;
        if (other.getPlayerUid() != 0) {
          setPlayerUid(other.getPlayerUid());
        }
        if (other.getCd() != 0) {
          setCd(other.getCd());
        }
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
        }
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int playerUid_ ;
      /**
       * <code>uint32 player_uid = 3;</code>
       * @return The playerUid.
       */
      @java.lang.Override
      public int getPlayerUid() {
        return playerUid_;
      }
      /**
       * <code>uint32 player_uid = 3;</code>
       * @param value The playerUid to set.
       * @return This builder for chaining.
       */
      public Builder setPlayerUid(int value) {
        
        playerUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 player_uid = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayerUid() {
        
        playerUid_ = 0;
        onChanged();
        return this;
      }

      private int cd_ ;
      /**
       * <code>uint32 cd = 15;</code>
       * @return The cd.
       */
      @java.lang.Override
      public int getCd() {
        return cd_;
      }
      /**
       * <code>uint32 cd = 15;</code>
       * @param value The cd to set.
       * @return This builder for chaining.
       */
      public Builder setCd(int value) {
        
        cd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cd = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearCd() {
        
        cd_ = 0;
        onChanged();
        return this;
      }

      private int pointId_ ;
      /**
       * <code>uint32 point_id = 13;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 point_id = 13;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {
        
        pointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {
        
        pointId_ = 0;
        onChanged();
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 10;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 10;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:DungeonRestartInviteNotify)
    }

    // @@protoc_insertion_point(class_scope:DungeonRestartInviteNotify)
    private static final io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify();
    }

    public static io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonRestartInviteNotify>
        PARSER = new com.google.protobuf.AbstractParser<DungeonRestartInviteNotify>() {
      @java.lang.Override
      public DungeonRestartInviteNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DungeonRestartInviteNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DungeonRestartInviteNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonRestartInviteNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.DungeonRestartInviteNotifyOuterClass.DungeonRestartInviteNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonRestartInviteNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonRestartInviteNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n DungeonRestartInviteNotify.proto\"b\n\032Du" +
      "ngeonRestartInviteNotify\022\022\n\nplayer_uid\030\003" +
      " \001(\r\022\n\n\002cd\030\017 \001(\r\022\020\n\010point_id\030\r \001(\r\022\022\n\ndu" +
      "ngeon_id\030\n \001(\rB\026\n\024io.grasscutter.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DungeonRestartInviteNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonRestartInviteNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonRestartInviteNotify_descriptor,
        new java.lang.String[] { "PlayerUid", "Cd", "PointId", "DungeonId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
