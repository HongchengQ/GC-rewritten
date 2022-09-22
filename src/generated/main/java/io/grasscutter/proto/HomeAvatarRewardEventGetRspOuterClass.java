// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeAvatarRewardEventGetRsp.proto

package io.grasscutter.proto;

public final class HomeAvatarRewardEventGetRspOuterClass {
  private HomeAvatarRewardEventGetRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeAvatarRewardEventGetRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeAvatarRewardEventGetRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ItemParam item_list = 4;</code>
     */
    java.util.List<io.grasscutter.proto.ItemParamOuterClass.ItemParam> 
        getItemListList();
    /**
     * <code>repeated .ItemParam item_list = 4;</code>
     */
    io.grasscutter.proto.ItemParamOuterClass.ItemParam getItemList(int index);
    /**
     * <code>repeated .ItemParam item_list = 4;</code>
     */
    int getItemListCount();
    /**
     * <code>repeated .ItemParam item_list = 4;</code>
     */
    java.util.List<? extends io.grasscutter.proto.ItemParamOuterClass.ItemParamOrBuilder> 
        getItemListOrBuilderList();
    /**
     * <code>repeated .ItemParam item_list = 4;</code>
     */
    io.grasscutter.proto.ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(
        int index);

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 event_id = 8;</code>
     * @return The eventId.
     */
    int getEventId();
  }
  /**
   * <pre>
   * CmdId: 4833
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code HomeAvatarRewardEventGetRsp}
   */
  public static final class HomeAvatarRewardEventGetRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeAvatarRewardEventGetRsp)
      HomeAvatarRewardEventGetRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeAvatarRewardEventGetRsp.newBuilder() to construct.
    private HomeAvatarRewardEventGetRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeAvatarRewardEventGetRsp() {
      itemList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeAvatarRewardEventGetRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeAvatarRewardEventGetRsp(
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
            case 34: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                itemList_ = new java.util.ArrayList<io.grasscutter.proto.ItemParamOuterClass.ItemParam>();
                mutable_bitField0_ |= 0x00000001;
              }
              itemList_.add(
                  input.readMessage(io.grasscutter.proto.ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
              break;
            }
            case 64: {

              eventId_ = input.readUInt32();
              break;
            }
            case 112: {

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
          itemList_ = java.util.Collections.unmodifiableList(itemList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.internal_static_HomeAvatarRewardEventGetRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.internal_static_HomeAvatarRewardEventGetRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp.class, io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp.Builder.class);
    }

    public static final int ITEM_LIST_FIELD_NUMBER = 4;
    private java.util.List<io.grasscutter.proto.ItemParamOuterClass.ItemParam> itemList_;
    /**
     * <code>repeated .ItemParam item_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<io.grasscutter.proto.ItemParamOuterClass.ItemParam> getItemListList() {
      return itemList_;
    }
    /**
     * <code>repeated .ItemParam item_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends io.grasscutter.proto.ItemParamOuterClass.ItemParamOrBuilder> 
        getItemListOrBuilderList() {
      return itemList_;
    }
    /**
     * <code>repeated .ItemParam item_list = 4;</code>
     */
    @java.lang.Override
    public int getItemListCount() {
      return itemList_.size();
    }
    /**
     * <code>repeated .ItemParam item_list = 4;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.ItemParamOuterClass.ItemParam getItemList(int index) {
      return itemList_.get(index);
    }
    /**
     * <code>repeated .ItemParam item_list = 4;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(
        int index) {
      return itemList_.get(index);
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int EVENT_ID_FIELD_NUMBER = 8;
    private int eventId_;
    /**
     * <code>uint32 event_id = 8;</code>
     * @return The eventId.
     */
    @java.lang.Override
    public int getEventId() {
      return eventId_;
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
      for (int i = 0; i < itemList_.size(); i++) {
        output.writeMessage(4, itemList_.get(i));
      }
      if (eventId_ != 0) {
        output.writeUInt32(8, eventId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < itemList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, itemList_.get(i));
      }
      if (eventId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, eventId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
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
      if (!(obj instanceof io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp other = (io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp) obj;

      if (!getItemListList()
          .equals(other.getItemListList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getEventId()
          != other.getEventId()) return false;
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
      if (getItemListCount() > 0) {
        hash = (37 * hash) + ITEM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getItemListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + EVENT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEventId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp prototype) {
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
     * CmdId: 4833
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code HomeAvatarRewardEventGetRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeAvatarRewardEventGetRsp)
        io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.internal_static_HomeAvatarRewardEventGetRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.internal_static_HomeAvatarRewardEventGetRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp.class, io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp.Builder.class);
      }

      // Construct using io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp.newBuilder()
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
          getItemListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (itemListBuilder_ == null) {
          itemList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          itemListBuilder_.clear();
        }
        retcode_ = 0;

        eventId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.internal_static_HomeAvatarRewardEventGetRsp_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp getDefaultInstanceForType() {
        return io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp build() {
        io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp buildPartial() {
        io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp result = new io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp(this);
        int from_bitField0_ = bitField0_;
        if (itemListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            itemList_ = java.util.Collections.unmodifiableList(itemList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.itemList_ = itemList_;
        } else {
          result.itemList_ = itemListBuilder_.build();
        }
        result.retcode_ = retcode_;
        result.eventId_ = eventId_;
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
        if (other instanceof io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp) {
          return mergeFrom((io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp other) {
        if (other == io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp.getDefaultInstance()) return this;
        if (itemListBuilder_ == null) {
          if (!other.itemList_.isEmpty()) {
            if (itemList_.isEmpty()) {
              itemList_ = other.itemList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureItemListIsMutable();
              itemList_.addAll(other.itemList_);
            }
            onChanged();
          }
        } else {
          if (!other.itemList_.isEmpty()) {
            if (itemListBuilder_.isEmpty()) {
              itemListBuilder_.dispose();
              itemListBuilder_ = null;
              itemList_ = other.itemList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              itemListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getItemListFieldBuilder() : null;
            } else {
              itemListBuilder_.addAllMessages(other.itemList_);
            }
          }
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getEventId() != 0) {
          setEventId(other.getEventId());
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
        io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<io.grasscutter.proto.ItemParamOuterClass.ItemParam> itemList_ =
        java.util.Collections.emptyList();
      private void ensureItemListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          itemList_ = new java.util.ArrayList<io.grasscutter.proto.ItemParamOuterClass.ItemParam>(itemList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.ItemParamOuterClass.ItemParam, io.grasscutter.proto.ItemParamOuterClass.ItemParam.Builder, io.grasscutter.proto.ItemParamOuterClass.ItemParamOrBuilder> itemListBuilder_;

      /**
       * <code>repeated .ItemParam item_list = 4;</code>
       */
      public java.util.List<io.grasscutter.proto.ItemParamOuterClass.ItemParam> getItemListList() {
        if (itemListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(itemList_);
        } else {
          return itemListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ItemParam item_list = 4;</code>
       */
      public int getItemListCount() {
        if (itemListBuilder_ == null) {
          return itemList_.size();
        } else {
          return itemListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ItemParam item_list = 4;</code>
       */
      public io.grasscutter.proto.ItemParamOuterClass.ItemParam getItemList(int index) {
        if (itemListBuilder_ == null) {
          return itemList_.get(index);
        } else {
          return itemListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ItemParam item_list = 4;</code>
       */
      public Builder setItemList(
          int index, io.grasscutter.proto.ItemParamOuterClass.ItemParam value) {
        if (itemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemListIsMutable();
          itemList_.set(index, value);
          onChanged();
        } else {
          itemListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 4;</code>
       */
      public Builder setItemList(
          int index, io.grasscutter.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 4;</code>
       */
      public Builder addItemList(io.grasscutter.proto.ItemParamOuterClass.ItemParam value) {
        if (itemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemListIsMutable();
          itemList_.add(value);
          onChanged();
        } else {
          itemListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 4;</code>
       */
      public Builder addItemList(
          int index, io.grasscutter.proto.ItemParamOuterClass.ItemParam value) {
        if (itemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemListIsMutable();
          itemList_.add(index, value);
          onChanged();
        } else {
          itemListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 4;</code>
       */
      public Builder addItemList(
          io.grasscutter.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.add(builderForValue.build());
          onChanged();
        } else {
          itemListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 4;</code>
       */
      public Builder addItemList(
          int index, io.grasscutter.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 4;</code>
       */
      public Builder addAllItemList(
          java.lang.Iterable<? extends io.grasscutter.proto.ItemParamOuterClass.ItemParam> values) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, itemList_);
          onChanged();
        } else {
          itemListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 4;</code>
       */
      public Builder clearItemList() {
        if (itemListBuilder_ == null) {
          itemList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          itemListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 4;</code>
       */
      public Builder removeItemList(int index) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.remove(index);
          onChanged();
        } else {
          itemListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 4;</code>
       */
      public io.grasscutter.proto.ItemParamOuterClass.ItemParam.Builder getItemListBuilder(
          int index) {
        return getItemListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ItemParam item_list = 4;</code>
       */
      public io.grasscutter.proto.ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(
          int index) {
        if (itemListBuilder_ == null) {
          return itemList_.get(index);  } else {
          return itemListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ItemParam item_list = 4;</code>
       */
      public java.util.List<? extends io.grasscutter.proto.ItemParamOuterClass.ItemParamOrBuilder> 
           getItemListOrBuilderList() {
        if (itemListBuilder_ != null) {
          return itemListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(itemList_);
        }
      }
      /**
       * <code>repeated .ItemParam item_list = 4;</code>
       */
      public io.grasscutter.proto.ItemParamOuterClass.ItemParam.Builder addItemListBuilder() {
        return getItemListFieldBuilder().addBuilder(
            io.grasscutter.proto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam item_list = 4;</code>
       */
      public io.grasscutter.proto.ItemParamOuterClass.ItemParam.Builder addItemListBuilder(
          int index) {
        return getItemListFieldBuilder().addBuilder(
            index, io.grasscutter.proto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam item_list = 4;</code>
       */
      public java.util.List<io.grasscutter.proto.ItemParamOuterClass.ItemParam.Builder> 
           getItemListBuilderList() {
        return getItemListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.ItemParamOuterClass.ItemParam, io.grasscutter.proto.ItemParamOuterClass.ItemParam.Builder, io.grasscutter.proto.ItemParamOuterClass.ItemParamOrBuilder> 
          getItemListFieldBuilder() {
        if (itemListBuilder_ == null) {
          itemListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              io.grasscutter.proto.ItemParamOuterClass.ItemParam, io.grasscutter.proto.ItemParamOuterClass.ItemParam.Builder, io.grasscutter.proto.ItemParamOuterClass.ItemParamOrBuilder>(
                  itemList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          itemList_ = null;
        }
        return itemListBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int eventId_ ;
      /**
       * <code>uint32 event_id = 8;</code>
       * @return The eventId.
       */
      @java.lang.Override
      public int getEventId() {
        return eventId_;
      }
      /**
       * <code>uint32 event_id = 8;</code>
       * @param value The eventId to set.
       * @return This builder for chaining.
       */
      public Builder setEventId(int value) {
        
        eventId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 event_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearEventId() {
        
        eventId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeAvatarRewardEventGetRsp)
    }

    // @@protoc_insertion_point(class_scope:HomeAvatarRewardEventGetRsp)
    private static final io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp();
    }

    public static io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeAvatarRewardEventGetRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomeAvatarRewardEventGetRsp>() {
      @java.lang.Override
      public HomeAvatarRewardEventGetRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeAvatarRewardEventGetRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeAvatarRewardEventGetRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeAvatarRewardEventGetRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.HomeAvatarRewardEventGetRspOuterClass.HomeAvatarRewardEventGetRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeAvatarRewardEventGetRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeAvatarRewardEventGetRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!HomeAvatarRewardEventGetRsp.proto\032\017Ite" +
      "mParam.proto\"_\n\033HomeAvatarRewardEventGet" +
      "Rsp\022\035\n\titem_list\030\004 \003(\0132\n.ItemParam\022\017\n\007re" +
      "tcode\030\016 \001(\005\022\020\n\010event_id\030\010 \001(\rB\026\n\024io.gras" +
      "scutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.ItemParamOuterClass.getDescriptor(),
        });
    internal_static_HomeAvatarRewardEventGetRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeAvatarRewardEventGetRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeAvatarRewardEventGetRsp_descriptor,
        new java.lang.String[] { "ItemList", "Retcode", "EventId", });
    io.grasscutter.proto.ItemParamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
