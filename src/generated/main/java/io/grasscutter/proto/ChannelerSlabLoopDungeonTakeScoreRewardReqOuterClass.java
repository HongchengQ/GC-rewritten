// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChannelerSlabLoopDungeonTakeScoreRewardReq.proto

package io.grasscutter.proto;

public final class ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass {
  private ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChannelerSlabLoopDungeonTakeScoreRewardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChannelerSlabLoopDungeonTakeScoreRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 reward_index = 8;</code>
     * @return The rewardIndex.
     */
    int getRewardIndex();
  }
  /**
   * <pre>
   * CmdId: 8684
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code ChannelerSlabLoopDungeonTakeScoreRewardReq}
   */
  public static final class ChannelerSlabLoopDungeonTakeScoreRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChannelerSlabLoopDungeonTakeScoreRewardReq)
      ChannelerSlabLoopDungeonTakeScoreRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChannelerSlabLoopDungeonTakeScoreRewardReq.newBuilder() to construct.
    private ChannelerSlabLoopDungeonTakeScoreRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChannelerSlabLoopDungeonTakeScoreRewardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChannelerSlabLoopDungeonTakeScoreRewardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChannelerSlabLoopDungeonTakeScoreRewardReq(
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

              rewardIndex_ = input.readUInt32();
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
      return io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.internal_static_ChannelerSlabLoopDungeonTakeScoreRewardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.internal_static_ChannelerSlabLoopDungeonTakeScoreRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq.class, io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq.Builder.class);
    }

    public static final int REWARD_INDEX_FIELD_NUMBER = 8;
    private int rewardIndex_;
    /**
     * <code>uint32 reward_index = 8;</code>
     * @return The rewardIndex.
     */
    @java.lang.Override
    public int getRewardIndex() {
      return rewardIndex_;
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
      if (rewardIndex_ != 0) {
        output.writeUInt32(8, rewardIndex_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (rewardIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, rewardIndex_);
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
      if (!(obj instanceof io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq other = (io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq) obj;

      if (getRewardIndex()
          != other.getRewardIndex()) return false;
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
      hash = (37 * hash) + REWARD_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getRewardIndex();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq prototype) {
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
     * CmdId: 8684
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code ChannelerSlabLoopDungeonTakeScoreRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChannelerSlabLoopDungeonTakeScoreRewardReq)
        io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.internal_static_ChannelerSlabLoopDungeonTakeScoreRewardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.internal_static_ChannelerSlabLoopDungeonTakeScoreRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq.class, io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq.Builder.class);
      }

      // Construct using io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq.newBuilder()
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
        rewardIndex_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.internal_static_ChannelerSlabLoopDungeonTakeScoreRewardReq_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq getDefaultInstanceForType() {
        return io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq build() {
        io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq buildPartial() {
        io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq result = new io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq(this);
        result.rewardIndex_ = rewardIndex_;
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
        if (other instanceof io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq) {
          return mergeFrom((io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq other) {
        if (other == io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq.getDefaultInstance()) return this;
        if (other.getRewardIndex() != 0) {
          setRewardIndex(other.getRewardIndex());
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
        io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int rewardIndex_ ;
      /**
       * <code>uint32 reward_index = 8;</code>
       * @return The rewardIndex.
       */
      @java.lang.Override
      public int getRewardIndex() {
        return rewardIndex_;
      }
      /**
       * <code>uint32 reward_index = 8;</code>
       * @param value The rewardIndex to set.
       * @return This builder for chaining.
       */
      public Builder setRewardIndex(int value) {
        
        rewardIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reward_index = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardIndex() {
        
        rewardIndex_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChannelerSlabLoopDungeonTakeScoreRewardReq)
    }

    // @@protoc_insertion_point(class_scope:ChannelerSlabLoopDungeonTakeScoreRewardReq)
    private static final io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq();
    }

    public static io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChannelerSlabLoopDungeonTakeScoreRewardReq>
        PARSER = new com.google.protobuf.AbstractParser<ChannelerSlabLoopDungeonTakeScoreRewardReq>() {
      @java.lang.Override
      public ChannelerSlabLoopDungeonTakeScoreRewardReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChannelerSlabLoopDungeonTakeScoreRewardReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChannelerSlabLoopDungeonTakeScoreRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChannelerSlabLoopDungeonTakeScoreRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.ChannelerSlabLoopDungeonTakeScoreRewardReqOuterClass.ChannelerSlabLoopDungeonTakeScoreRewardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChannelerSlabLoopDungeonTakeScoreRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChannelerSlabLoopDungeonTakeScoreRewardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0ChannelerSlabLoopDungeonTakeScoreRewar" +
      "dReq.proto\"B\n*ChannelerSlabLoopDungeonTa" +
      "keScoreRewardReq\022\024\n\014reward_index\030\010 \001(\rB\026" +
      "\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChannelerSlabLoopDungeonTakeScoreRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChannelerSlabLoopDungeonTakeScoreRewardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChannelerSlabLoopDungeonTakeScoreRewardReq_descriptor,
        new java.lang.String[] { "RewardIndex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
