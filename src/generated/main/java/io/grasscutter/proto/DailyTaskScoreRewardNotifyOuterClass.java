// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DailyTaskScoreRewardNotify.proto

package io.grasscutter.proto;

public final class DailyTaskScoreRewardNotifyOuterClass {
  private DailyTaskScoreRewardNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DailyTaskScoreRewardNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DailyTaskScoreRewardNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 reward_id = 14;</code>
     * @return The rewardId.
     */
    int getRewardId();
  }
  /**
   * <pre>
   * CmdId: 117
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code DailyTaskScoreRewardNotify}
   */
  public static final class DailyTaskScoreRewardNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DailyTaskScoreRewardNotify)
      DailyTaskScoreRewardNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DailyTaskScoreRewardNotify.newBuilder() to construct.
    private DailyTaskScoreRewardNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DailyTaskScoreRewardNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DailyTaskScoreRewardNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DailyTaskScoreRewardNotify(
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
            case 112: {

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
      return io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.internal_static_DailyTaskScoreRewardNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.internal_static_DailyTaskScoreRewardNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify.class, io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify.Builder.class);
    }

    public static final int REWARD_ID_FIELD_NUMBER = 14;
    private int rewardId_;
    /**
     * <code>uint32 reward_id = 14;</code>
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
      if (rewardId_ != 0) {
        output.writeUInt32(14, rewardId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (rewardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, rewardId_);
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
      if (!(obj instanceof io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify other = (io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify) obj;

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
      hash = (37 * hash) + REWARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRewardId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify prototype) {
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
     * CmdId: 117
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code DailyTaskScoreRewardNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DailyTaskScoreRewardNotify)
        io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.internal_static_DailyTaskScoreRewardNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.internal_static_DailyTaskScoreRewardNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify.class, io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify.newBuilder()
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
        rewardId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.internal_static_DailyTaskScoreRewardNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify build() {
        io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify buildPartial() {
        io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify result = new io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify(this);
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
        if (other instanceof io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify) {
          return mergeFrom((io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify other) {
        if (other == io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify.getDefaultInstance()) return this;
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
        io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int rewardId_ ;
      /**
       * <code>uint32 reward_id = 14;</code>
       * @return The rewardId.
       */
      @java.lang.Override
      public int getRewardId() {
        return rewardId_;
      }
      /**
       * <code>uint32 reward_id = 14;</code>
       * @param value The rewardId to set.
       * @return This builder for chaining.
       */
      public Builder setRewardId(int value) {
        
        rewardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reward_id = 14;</code>
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


      // @@protoc_insertion_point(builder_scope:DailyTaskScoreRewardNotify)
    }

    // @@protoc_insertion_point(class_scope:DailyTaskScoreRewardNotify)
    private static final io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify();
    }

    public static io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DailyTaskScoreRewardNotify>
        PARSER = new com.google.protobuf.AbstractParser<DailyTaskScoreRewardNotify>() {
      @java.lang.Override
      public DailyTaskScoreRewardNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DailyTaskScoreRewardNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DailyTaskScoreRewardNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DailyTaskScoreRewardNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.DailyTaskScoreRewardNotifyOuterClass.DailyTaskScoreRewardNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DailyTaskScoreRewardNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DailyTaskScoreRewardNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n DailyTaskScoreRewardNotify.proto\"/\n\032Da" +
      "ilyTaskScoreRewardNotify\022\021\n\treward_id\030\016 " +
      "\001(\rB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DailyTaskScoreRewardNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DailyTaskScoreRewardNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DailyTaskScoreRewardNotify_descriptor,
        new java.lang.String[] { "RewardId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
