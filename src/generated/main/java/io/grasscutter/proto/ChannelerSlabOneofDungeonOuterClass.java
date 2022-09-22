// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChannelerSlabOneofDungeon.proto

package io.grasscutter.proto;

public final class ChannelerSlabOneofDungeonOuterClass {
  private ChannelerSlabOneofDungeonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChannelerSlabOneofDungeonOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChannelerSlabOneofDungeon)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_done = 8;</code>
     * @return The isDone.
     */
    boolean getIsDone();

    /**
     * <code>uint32 dungeon_id = 12;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>uint32 reward_id = 13;</code>
     * @return The rewardId.
     */
    int getRewardId();
  }
  /**
   * Protobuf type {@code ChannelerSlabOneofDungeon}
   */
  public static final class ChannelerSlabOneofDungeon extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChannelerSlabOneofDungeon)
      ChannelerSlabOneofDungeonOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChannelerSlabOneofDungeon.newBuilder() to construct.
    private ChannelerSlabOneofDungeon(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChannelerSlabOneofDungeon() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChannelerSlabOneofDungeon();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChannelerSlabOneofDungeon(
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
            case 64: {

              isDone_ = input.readBool();
              break;
            }
            case 96: {

              dungeonId_ = input.readUInt32();
              break;
            }
            case 104: {

              rewardId_ = input.readUInt32();
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
      return io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.internal_static_ChannelerSlabOneofDungeon_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.internal_static_ChannelerSlabOneofDungeon_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon.class, io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon.Builder.class);
    }

    public static final int IS_DONE_FIELD_NUMBER = 8;
    private boolean isDone_;
    /**
     * <code>bool is_done = 8;</code>
     * @return The isDone.
     */
    @java.lang.Override
    public boolean getIsDone() {
      return isDone_;
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 12;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 12;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int REWARD_ID_FIELD_NUMBER = 13;
    private int rewardId_;
    /**
     * <code>uint32 reward_id = 13;</code>
     * @return The rewardId.
     */
    @java.lang.Override
    public int getRewardId() {
      return rewardId_;
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
      if (isDone_ != false) {
        output.writeBool(8, isDone_);
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(12, dungeonId_);
      }
      if (rewardId_ != 0) {
        output.writeUInt32(13, rewardId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isDone_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isDone_);
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, dungeonId_);
      }
      if (rewardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, rewardId_);
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
      if (!(obj instanceof io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon other = (io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon) obj;

      if (getIsDone()
          != other.getIsDone()) return false;
      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (getRewardId()
          != other.getRewardId()) return false;
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
      hash = (37 * hash) + IS_DONE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsDone());
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + REWARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRewardId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon prototype) {
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
     * Protobuf type {@code ChannelerSlabOneofDungeon}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChannelerSlabOneofDungeon)
        io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeonOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.internal_static_ChannelerSlabOneofDungeon_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.internal_static_ChannelerSlabOneofDungeon_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon.class, io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon.Builder.class);
      }

      // Construct using io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon.newBuilder()
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
        isDone_ = false;

        dungeonId_ = 0;

        rewardId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.internal_static_ChannelerSlabOneofDungeon_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon getDefaultInstanceForType() {
        return io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon build() {
        io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon buildPartial() {
        io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon result = new io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon(this);
        result.isDone_ = isDone_;
        result.dungeonId_ = dungeonId_;
        result.rewardId_ = rewardId_;
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
        if (other instanceof io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon) {
          return mergeFrom((io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon other) {
        if (other == io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon.getDefaultInstance()) return this;
        if (other.getIsDone() != false) {
          setIsDone(other.getIsDone());
        }
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.getRewardId() != 0) {
          setRewardId(other.getRewardId());
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
        io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isDone_ ;
      /**
       * <code>bool is_done = 8;</code>
       * @return The isDone.
       */
      @java.lang.Override
      public boolean getIsDone() {
        return isDone_;
      }
      /**
       * <code>bool is_done = 8;</code>
       * @param value The isDone to set.
       * @return This builder for chaining.
       */
      public Builder setIsDone(boolean value) {
        
        isDone_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_done = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsDone() {
        
        isDone_ = false;
        onChanged();
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 12;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 12;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private int rewardId_ ;
      /**
       * <code>uint32 reward_id = 13;</code>
       * @return The rewardId.
       */
      @java.lang.Override
      public int getRewardId() {
        return rewardId_;
      }
      /**
       * <code>uint32 reward_id = 13;</code>
       * @param value The rewardId to set.
       * @return This builder for chaining.
       */
      public Builder setRewardId(int value) {
        
        rewardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reward_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardId() {
        
        rewardId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChannelerSlabOneofDungeon)
    }

    // @@protoc_insertion_point(class_scope:ChannelerSlabOneofDungeon)
    private static final io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon();
    }

    public static io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChannelerSlabOneofDungeon>
        PARSER = new com.google.protobuf.AbstractParser<ChannelerSlabOneofDungeon>() {
      @java.lang.Override
      public ChannelerSlabOneofDungeon parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChannelerSlabOneofDungeon(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChannelerSlabOneofDungeon> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChannelerSlabOneofDungeon> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.ChannelerSlabOneofDungeonOuterClass.ChannelerSlabOneofDungeon getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChannelerSlabOneofDungeon_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChannelerSlabOneofDungeon_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037ChannelerSlabOneofDungeon.proto\"S\n\031Cha" +
      "nnelerSlabOneofDungeon\022\017\n\007is_done\030\010 \001(\010\022" +
      "\022\n\ndungeon_id\030\014 \001(\r\022\021\n\treward_id\030\r \001(\rB\026" +
      "\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChannelerSlabOneofDungeon_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChannelerSlabOneofDungeon_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChannelerSlabOneofDungeon_descriptor,
        new java.lang.String[] { "IsDone", "DungeonId", "RewardId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
