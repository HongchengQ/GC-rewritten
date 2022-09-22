// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UpdatePlayerShowAvatarListReq.proto

package io.grasscutter.proto;

public final class UpdatePlayerShowAvatarListReqOuterClass {
  private UpdatePlayerShowAvatarListReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UpdatePlayerShowAvatarListReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UpdatePlayerShowAvatarListReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_show_avatar = 15;</code>
     * @return The isShowAvatar.
     */
    boolean getIsShowAvatar();

    /**
     * <code>repeated uint32 show_avatar_id_list = 13;</code>
     * @return A list containing the showAvatarIdList.
     */
    java.util.List<java.lang.Integer> getShowAvatarIdListList();
    /**
     * <code>repeated uint32 show_avatar_id_list = 13;</code>
     * @return The count of showAvatarIdList.
     */
    int getShowAvatarIdListCount();
    /**
     * <code>repeated uint32 show_avatar_id_list = 13;</code>
     * @param index The index of the element to return.
     * @return The showAvatarIdList at the given index.
     */
    int getShowAvatarIdList(int index);
  }
  /**
   * <pre>
   * CmdId: 4067
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code UpdatePlayerShowAvatarListReq}
   */
  public static final class UpdatePlayerShowAvatarListReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UpdatePlayerShowAvatarListReq)
      UpdatePlayerShowAvatarListReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UpdatePlayerShowAvatarListReq.newBuilder() to construct.
    private UpdatePlayerShowAvatarListReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UpdatePlayerShowAvatarListReq() {
      showAvatarIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UpdatePlayerShowAvatarListReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UpdatePlayerShowAvatarListReq(
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
            case 104: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                showAvatarIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              showAvatarIdList_.addInt(input.readUInt32());
              break;
            }
            case 106: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                showAvatarIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                showAvatarIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 120: {

              isShowAvatar_ = input.readBool();
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
          showAvatarIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.internal_static_UpdatePlayerShowAvatarListReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.internal_static_UpdatePlayerShowAvatarListReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq.class, io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq.Builder.class);
    }

    public static final int IS_SHOW_AVATAR_FIELD_NUMBER = 15;
    private boolean isShowAvatar_;
    /**
     * <code>bool is_show_avatar = 15;</code>
     * @return The isShowAvatar.
     */
    @java.lang.Override
    public boolean getIsShowAvatar() {
      return isShowAvatar_;
    }

    public static final int SHOW_AVATAR_ID_LIST_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList showAvatarIdList_;
    /**
     * <code>repeated uint32 show_avatar_id_list = 13;</code>
     * @return A list containing the showAvatarIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getShowAvatarIdListList() {
      return showAvatarIdList_;
    }
    /**
     * <code>repeated uint32 show_avatar_id_list = 13;</code>
     * @return The count of showAvatarIdList.
     */
    public int getShowAvatarIdListCount() {
      return showAvatarIdList_.size();
    }
    /**
     * <code>repeated uint32 show_avatar_id_list = 13;</code>
     * @param index The index of the element to return.
     * @return The showAvatarIdList at the given index.
     */
    public int getShowAvatarIdList(int index) {
      return showAvatarIdList_.getInt(index);
    }
    private int showAvatarIdListMemoizedSerializedSize = -1;

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
      if (getShowAvatarIdListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(showAvatarIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < showAvatarIdList_.size(); i++) {
        output.writeUInt32NoTag(showAvatarIdList_.getInt(i));
      }
      if (isShowAvatar_ != false) {
        output.writeBool(15, isShowAvatar_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < showAvatarIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(showAvatarIdList_.getInt(i));
        }
        size += dataSize;
        if (!getShowAvatarIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        showAvatarIdListMemoizedSerializedSize = dataSize;
      }
      if (isShowAvatar_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isShowAvatar_);
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
      if (!(obj instanceof io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq other = (io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq) obj;

      if (getIsShowAvatar()
          != other.getIsShowAvatar()) return false;
      if (!getShowAvatarIdListList()
          .equals(other.getShowAvatarIdListList())) return false;
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
      hash = (37 * hash) + IS_SHOW_AVATAR_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsShowAvatar());
      if (getShowAvatarIdListCount() > 0) {
        hash = (37 * hash) + SHOW_AVATAR_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getShowAvatarIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq prototype) {
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
     * CmdId: 4067
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code UpdatePlayerShowAvatarListReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UpdatePlayerShowAvatarListReq)
        io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.internal_static_UpdatePlayerShowAvatarListReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.internal_static_UpdatePlayerShowAvatarListReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq.class, io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq.Builder.class);
      }

      // Construct using io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq.newBuilder()
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
        isShowAvatar_ = false;

        showAvatarIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.internal_static_UpdatePlayerShowAvatarListReq_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq getDefaultInstanceForType() {
        return io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq build() {
        io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq buildPartial() {
        io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq result = new io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq(this);
        int from_bitField0_ = bitField0_;
        result.isShowAvatar_ = isShowAvatar_;
        if (((bitField0_ & 0x00000001) != 0)) {
          showAvatarIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.showAvatarIdList_ = showAvatarIdList_;
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
        if (other instanceof io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq) {
          return mergeFrom((io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq other) {
        if (other == io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq.getDefaultInstance()) return this;
        if (other.getIsShowAvatar() != false) {
          setIsShowAvatar(other.getIsShowAvatar());
        }
        if (!other.showAvatarIdList_.isEmpty()) {
          if (showAvatarIdList_.isEmpty()) {
            showAvatarIdList_ = other.showAvatarIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureShowAvatarIdListIsMutable();
            showAvatarIdList_.addAll(other.showAvatarIdList_);
          }
          onChanged();
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
        io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean isShowAvatar_ ;
      /**
       * <code>bool is_show_avatar = 15;</code>
       * @return The isShowAvatar.
       */
      @java.lang.Override
      public boolean getIsShowAvatar() {
        return isShowAvatar_;
      }
      /**
       * <code>bool is_show_avatar = 15;</code>
       * @param value The isShowAvatar to set.
       * @return This builder for chaining.
       */
      public Builder setIsShowAvatar(boolean value) {
        
        isShowAvatar_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_show_avatar = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsShowAvatar() {
        
        isShowAvatar_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList showAvatarIdList_ = emptyIntList();
      private void ensureShowAvatarIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          showAvatarIdList_ = mutableCopy(showAvatarIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 show_avatar_id_list = 13;</code>
       * @return A list containing the showAvatarIdList.
       */
      public java.util.List<java.lang.Integer>
          getShowAvatarIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(showAvatarIdList_) : showAvatarIdList_;
      }
      /**
       * <code>repeated uint32 show_avatar_id_list = 13;</code>
       * @return The count of showAvatarIdList.
       */
      public int getShowAvatarIdListCount() {
        return showAvatarIdList_.size();
      }
      /**
       * <code>repeated uint32 show_avatar_id_list = 13;</code>
       * @param index The index of the element to return.
       * @return The showAvatarIdList at the given index.
       */
      public int getShowAvatarIdList(int index) {
        return showAvatarIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 show_avatar_id_list = 13;</code>
       * @param index The index to set the value at.
       * @param value The showAvatarIdList to set.
       * @return This builder for chaining.
       */
      public Builder setShowAvatarIdList(
          int index, int value) {
        ensureShowAvatarIdListIsMutable();
        showAvatarIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 show_avatar_id_list = 13;</code>
       * @param value The showAvatarIdList to add.
       * @return This builder for chaining.
       */
      public Builder addShowAvatarIdList(int value) {
        ensureShowAvatarIdListIsMutable();
        showAvatarIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 show_avatar_id_list = 13;</code>
       * @param values The showAvatarIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllShowAvatarIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureShowAvatarIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, showAvatarIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 show_avatar_id_list = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearShowAvatarIdList() {
        showAvatarIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:UpdatePlayerShowAvatarListReq)
    }

    // @@protoc_insertion_point(class_scope:UpdatePlayerShowAvatarListReq)
    private static final io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq();
    }

    public static io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UpdatePlayerShowAvatarListReq>
        PARSER = new com.google.protobuf.AbstractParser<UpdatePlayerShowAvatarListReq>() {
      @java.lang.Override
      public UpdatePlayerShowAvatarListReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UpdatePlayerShowAvatarListReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UpdatePlayerShowAvatarListReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UpdatePlayerShowAvatarListReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdatePlayerShowAvatarListReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpdatePlayerShowAvatarListReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#UpdatePlayerShowAvatarListReq.proto\"T\n" +
      "\035UpdatePlayerShowAvatarListReq\022\026\n\016is_sho" +
      "w_avatar\030\017 \001(\010\022\033\n\023show_avatar_id_list\030\r " +
      "\003(\rB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UpdatePlayerShowAvatarListReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UpdatePlayerShowAvatarListReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdatePlayerShowAvatarListReq_descriptor,
        new java.lang.String[] { "IsShowAvatar", "ShowAvatarIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
