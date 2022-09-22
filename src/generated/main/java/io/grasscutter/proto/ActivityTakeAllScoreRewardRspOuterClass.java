// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityTakeAllScoreRewardRsp.proto

package io.grasscutter.proto;

public final class ActivityTakeAllScoreRewardRspOuterClass {
  private ActivityTakeAllScoreRewardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivityTakeAllScoreRewardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityTakeAllScoreRewardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 reward_config_list = 14;</code>
     * @return A list containing the rewardConfigList.
     */
    java.util.List<java.lang.Integer> getRewardConfigListList();
    /**
     * <code>repeated uint32 reward_config_list = 14;</code>
     * @return The count of rewardConfigList.
     */
    int getRewardConfigListCount();
    /**
     * <code>repeated uint32 reward_config_list = 14;</code>
     * @param index The index of the element to return.
     * @return The rewardConfigList at the given index.
     */
    int getRewardConfigList(int index);

    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 activity_id = 7;</code>
     * @return The activityId.
     */
    int getActivityId();
  }
  /**
   * <pre>
   * CmdId: 8043
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code ActivityTakeAllScoreRewardRsp}
   */
  public static final class ActivityTakeAllScoreRewardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivityTakeAllScoreRewardRsp)
      ActivityTakeAllScoreRewardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivityTakeAllScoreRewardRsp.newBuilder() to construct.
    private ActivityTakeAllScoreRewardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivityTakeAllScoreRewardRsp() {
      rewardConfigList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivityTakeAllScoreRewardRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ActivityTakeAllScoreRewardRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 56: {

              activityId_ = input.readUInt32();
              break;
            }
            case 112: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                rewardConfigList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              rewardConfigList_.addInt(input.readUInt32());
              break;
            }
            case 114: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                rewardConfigList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                rewardConfigList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 120: {

              retcode_ = input.readInt32();
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          rewardConfigList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.internal_static_ActivityTakeAllScoreRewardRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.internal_static_ActivityTakeAllScoreRewardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp.class, io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp.Builder.class);
    }

    public static final int REWARD_CONFIG_LIST_FIELD_NUMBER = 14;
    private com.google.protobuf.Internal.IntList rewardConfigList_;
    /**
     * <code>repeated uint32 reward_config_list = 14;</code>
     * @return A list containing the rewardConfigList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getRewardConfigListList() {
      return rewardConfigList_;
    }
    /**
     * <code>repeated uint32 reward_config_list = 14;</code>
     * @return The count of rewardConfigList.
     */
    public int getRewardConfigListCount() {
      return rewardConfigList_.size();
    }
    /**
     * <code>repeated uint32 reward_config_list = 14;</code>
     * @param index The index of the element to return.
     * @return The rewardConfigList at the given index.
     */
    public int getRewardConfigList(int index) {
      return rewardConfigList_.getInt(index);
    }
    private int rewardConfigListMemoizedSerializedSize = -1;

    public static final int RETCODE_FIELD_NUMBER = 15;
    private int retcode_;
    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int ACTIVITY_ID_FIELD_NUMBER = 7;
    private int activityId_;
    /**
     * <code>uint32 activity_id = 7;</code>
     * @return The activityId.
     */
    @java.lang.Override
    public int getActivityId() {
      return activityId_;
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
      getSerializedSize();
      if (activityId_ != 0) {
        output.writeUInt32(7, activityId_);
      }
      if (getRewardConfigListList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(rewardConfigListMemoizedSerializedSize);
      }
      for (int i = 0; i < rewardConfigList_.size(); i++) {
        output.writeUInt32NoTag(rewardConfigList_.getInt(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(15, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (activityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, activityId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < rewardConfigList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(rewardConfigList_.getInt(i));
        }
        size += dataSize;
        if (!getRewardConfigListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        rewardConfigListMemoizedSerializedSize = dataSize;
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, retcode_);
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
      if (!(obj instanceof io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp other = (io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp) obj;

      if (!getRewardConfigListList()
          .equals(other.getRewardConfigListList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getActivityId()
          != other.getActivityId()) return false;
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
      if (getRewardConfigListCount() > 0) {
        hash = (37 * hash) + REWARD_CONFIG_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRewardConfigListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + ACTIVITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getActivityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp prototype) {
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
     * CmdId: 8043
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code ActivityTakeAllScoreRewardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityTakeAllScoreRewardRsp)
        io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.internal_static_ActivityTakeAllScoreRewardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.internal_static_ActivityTakeAllScoreRewardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp.class, io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp.Builder.class);
      }

      // Construct using io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp.newBuilder()
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
        rewardConfigList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;

        activityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.internal_static_ActivityTakeAllScoreRewardRsp_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp getDefaultInstanceForType() {
        return io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp build() {
        io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp buildPartial() {
        io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp result = new io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          rewardConfigList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rewardConfigList_ = rewardConfigList_;
        result.retcode_ = retcode_;
        result.activityId_ = activityId_;
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
        if (other instanceof io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp) {
          return mergeFrom((io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp other) {
        if (other == io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp.getDefaultInstance()) return this;
        if (!other.rewardConfigList_.isEmpty()) {
          if (rewardConfigList_.isEmpty()) {
            rewardConfigList_ = other.rewardConfigList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRewardConfigListIsMutable();
            rewardConfigList_.addAll(other.rewardConfigList_);
          }
          onChanged();
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getActivityId() != 0) {
          setActivityId(other.getActivityId());
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
        io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList rewardConfigList_ = emptyIntList();
      private void ensureRewardConfigListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          rewardConfigList_ = mutableCopy(rewardConfigList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 reward_config_list = 14;</code>
       * @return A list containing the rewardConfigList.
       */
      public java.util.List<java.lang.Integer>
          getRewardConfigListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(rewardConfigList_) : rewardConfigList_;
      }
      /**
       * <code>repeated uint32 reward_config_list = 14;</code>
       * @return The count of rewardConfigList.
       */
      public int getRewardConfigListCount() {
        return rewardConfigList_.size();
      }
      /**
       * <code>repeated uint32 reward_config_list = 14;</code>
       * @param index The index of the element to return.
       * @return The rewardConfigList at the given index.
       */
      public int getRewardConfigList(int index) {
        return rewardConfigList_.getInt(index);
      }
      /**
       * <code>repeated uint32 reward_config_list = 14;</code>
       * @param index The index to set the value at.
       * @param value The rewardConfigList to set.
       * @return This builder for chaining.
       */
      public Builder setRewardConfigList(
          int index, int value) {
        ensureRewardConfigListIsMutable();
        rewardConfigList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 reward_config_list = 14;</code>
       * @param value The rewardConfigList to add.
       * @return This builder for chaining.
       */
      public Builder addRewardConfigList(int value) {
        ensureRewardConfigListIsMutable();
        rewardConfigList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 reward_config_list = 14;</code>
       * @param values The rewardConfigList to add.
       * @return This builder for chaining.
       */
      public Builder addAllRewardConfigList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureRewardConfigListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rewardConfigList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 reward_config_list = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardConfigList() {
        rewardConfigList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 15;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int activityId_ ;
      /**
       * <code>uint32 activity_id = 7;</code>
       * @return The activityId.
       */
      @java.lang.Override
      public int getActivityId() {
        return activityId_;
      }
      /**
       * <code>uint32 activity_id = 7;</code>
       * @param value The activityId to set.
       * @return This builder for chaining.
       */
      public Builder setActivityId(int value) {
        
        activityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 activity_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearActivityId() {
        
        activityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ActivityTakeAllScoreRewardRsp)
    }

    // @@protoc_insertion_point(class_scope:ActivityTakeAllScoreRewardRsp)
    private static final io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp();
    }

    public static io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivityTakeAllScoreRewardRsp>
        PARSER = new com.google.protobuf.AbstractParser<ActivityTakeAllScoreRewardRsp>() {
      @java.lang.Override
      public ActivityTakeAllScoreRewardRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ActivityTakeAllScoreRewardRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ActivityTakeAllScoreRewardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityTakeAllScoreRewardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.ActivityTakeAllScoreRewardRspOuterClass.ActivityTakeAllScoreRewardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityTakeAllScoreRewardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityTakeAllScoreRewardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#ActivityTakeAllScoreRewardRsp.proto\"a\n" +
      "\035ActivityTakeAllScoreRewardRsp\022\032\n\022reward" +
      "_config_list\030\016 \003(\r\022\017\n\007retcode\030\017 \001(\005\022\023\n\013a" +
      "ctivity_id\030\007 \001(\rB\026\n\024io.grasscutter.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ActivityTakeAllScoreRewardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityTakeAllScoreRewardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityTakeAllScoreRewardRsp_descriptor,
        new java.lang.String[] { "RewardConfigList", "Retcode", "ActivityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
