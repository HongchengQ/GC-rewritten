// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetMapMarkTipsRsp.proto

package io.grasscutter.proto;

public final class GetMapMarkTipsRspOuterClass {
  private GetMapMarkTipsRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetMapMarkTipsRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetMapMarkTipsRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
     */
    java.util.List<io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo> 
        getMarkTipsListList();
    /**
     * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
     */
    io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo getMarkTipsList(int index);
    /**
     * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
     */
    int getMarkTipsListCount();
    /**
     * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
     */
    java.util.List<? extends io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfoOrBuilder> 
        getMarkTipsListOrBuilderList();
    /**
     * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
     */
    io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfoOrBuilder getMarkTipsListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 3327
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code GetMapMarkTipsRsp}
   */
  public static final class GetMapMarkTipsRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetMapMarkTipsRsp)
      GetMapMarkTipsRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetMapMarkTipsRsp.newBuilder() to construct.
    private GetMapMarkTipsRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetMapMarkTipsRsp() {
      markTipsList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetMapMarkTipsRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetMapMarkTipsRsp(
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

              retcode_ = input.readInt32();
              break;
            }
            case 90: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                markTipsList_ = new java.util.ArrayList<io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              markTipsList_.add(
                  input.readMessage(io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.parser(), extensionRegistry));
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
          markTipsList_ = java.util.Collections.unmodifiableList(markTipsList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.GetMapMarkTipsRspOuterClass.internal_static_GetMapMarkTipsRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.GetMapMarkTipsRspOuterClass.internal_static_GetMapMarkTipsRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp.class, io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_;
    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int MARK_TIPS_LIST_FIELD_NUMBER = 11;
    private java.util.List<io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo> markTipsList_;
    /**
     * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo> getMarkTipsListList() {
      return markTipsList_;
    }
    /**
     * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<? extends io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfoOrBuilder> 
        getMarkTipsListOrBuilderList() {
      return markTipsList_;
    }
    /**
     * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
     */
    @java.lang.Override
    public int getMarkTipsListCount() {
      return markTipsList_.size();
    }
    /**
     * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo getMarkTipsList(int index) {
      return markTipsList_.get(index);
    }
    /**
     * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfoOrBuilder getMarkTipsListOrBuilder(
        int index) {
      return markTipsList_.get(index);
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
      if (retcode_ != 0) {
        output.writeInt32(7, retcode_);
      }
      for (int i = 0; i < markTipsList_.size(); i++) {
        output.writeMessage(11, markTipsList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, retcode_);
      }
      for (int i = 0; i < markTipsList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, markTipsList_.get(i));
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
      if (!(obj instanceof io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp other = (io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getMarkTipsListList()
          .equals(other.getMarkTipsListList())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getMarkTipsListCount() > 0) {
        hash = (37 * hash) + MARK_TIPS_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMarkTipsListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp prototype) {
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
     * CmdId: 3327
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code GetMapMarkTipsRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetMapMarkTipsRsp)
        io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.GetMapMarkTipsRspOuterClass.internal_static_GetMapMarkTipsRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.GetMapMarkTipsRspOuterClass.internal_static_GetMapMarkTipsRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp.class, io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp.Builder.class);
      }

      // Construct using io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp.newBuilder()
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
          getMarkTipsListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        if (markTipsListBuilder_ == null) {
          markTipsList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          markTipsListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.GetMapMarkTipsRspOuterClass.internal_static_GetMapMarkTipsRsp_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp getDefaultInstanceForType() {
        return io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp build() {
        io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp buildPartial() {
        io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp result = new io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (markTipsListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            markTipsList_ = java.util.Collections.unmodifiableList(markTipsList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.markTipsList_ = markTipsList_;
        } else {
          result.markTipsList_ = markTipsListBuilder_.build();
        }
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
        if (other instanceof io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp) {
          return mergeFrom((io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp other) {
        if (other == io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (markTipsListBuilder_ == null) {
          if (!other.markTipsList_.isEmpty()) {
            if (markTipsList_.isEmpty()) {
              markTipsList_ = other.markTipsList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMarkTipsListIsMutable();
              markTipsList_.addAll(other.markTipsList_);
            }
            onChanged();
          }
        } else {
          if (!other.markTipsList_.isEmpty()) {
            if (markTipsListBuilder_.isEmpty()) {
              markTipsListBuilder_.dispose();
              markTipsListBuilder_ = null;
              markTipsList_ = other.markTipsList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              markTipsListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMarkTipsListFieldBuilder() : null;
            } else {
              markTipsListBuilder_.addAllMessages(other.markTipsList_);
            }
          }
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
        io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo> markTipsList_ =
        java.util.Collections.emptyList();
      private void ensureMarkTipsListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          markTipsList_ = new java.util.ArrayList<io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo>(markTipsList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo, io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.Builder, io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfoOrBuilder> markTipsListBuilder_;

      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public java.util.List<io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo> getMarkTipsListList() {
        if (markTipsListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(markTipsList_);
        } else {
          return markTipsListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public int getMarkTipsListCount() {
        if (markTipsListBuilder_ == null) {
          return markTipsList_.size();
        } else {
          return markTipsListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo getMarkTipsList(int index) {
        if (markTipsListBuilder_ == null) {
          return markTipsList_.get(index);
        } else {
          return markTipsListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public Builder setMarkTipsList(
          int index, io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo value) {
        if (markTipsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMarkTipsListIsMutable();
          markTipsList_.set(index, value);
          onChanged();
        } else {
          markTipsListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public Builder setMarkTipsList(
          int index, io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.Builder builderForValue) {
        if (markTipsListBuilder_ == null) {
          ensureMarkTipsListIsMutable();
          markTipsList_.set(index, builderForValue.build());
          onChanged();
        } else {
          markTipsListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public Builder addMarkTipsList(io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo value) {
        if (markTipsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMarkTipsListIsMutable();
          markTipsList_.add(value);
          onChanged();
        } else {
          markTipsListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public Builder addMarkTipsList(
          int index, io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo value) {
        if (markTipsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMarkTipsListIsMutable();
          markTipsList_.add(index, value);
          onChanged();
        } else {
          markTipsListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public Builder addMarkTipsList(
          io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.Builder builderForValue) {
        if (markTipsListBuilder_ == null) {
          ensureMarkTipsListIsMutable();
          markTipsList_.add(builderForValue.build());
          onChanged();
        } else {
          markTipsListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public Builder addMarkTipsList(
          int index, io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.Builder builderForValue) {
        if (markTipsListBuilder_ == null) {
          ensureMarkTipsListIsMutable();
          markTipsList_.add(index, builderForValue.build());
          onChanged();
        } else {
          markTipsListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public Builder addAllMarkTipsList(
          java.lang.Iterable<? extends io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo> values) {
        if (markTipsListBuilder_ == null) {
          ensureMarkTipsListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, markTipsList_);
          onChanged();
        } else {
          markTipsListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public Builder clearMarkTipsList() {
        if (markTipsListBuilder_ == null) {
          markTipsList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          markTipsListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public Builder removeMarkTipsList(int index) {
        if (markTipsListBuilder_ == null) {
          ensureMarkTipsListIsMutable();
          markTipsList_.remove(index);
          onChanged();
        } else {
          markTipsListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.Builder getMarkTipsListBuilder(
          int index) {
        return getMarkTipsListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfoOrBuilder getMarkTipsListOrBuilder(
          int index) {
        if (markTipsListBuilder_ == null) {
          return markTipsList_.get(index);  } else {
          return markTipsListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public java.util.List<? extends io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfoOrBuilder> 
           getMarkTipsListOrBuilderList() {
        if (markTipsListBuilder_ != null) {
          return markTipsListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(markTipsList_);
        }
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.Builder addMarkTipsListBuilder() {
        return getMarkTipsListFieldBuilder().addBuilder(
            io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.Builder addMarkTipsListBuilder(
          int index) {
        return getMarkTipsListFieldBuilder().addBuilder(
            index, io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public java.util.List<io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.Builder> 
           getMarkTipsListBuilderList() {
        return getMarkTipsListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo, io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.Builder, io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfoOrBuilder> 
          getMarkTipsListFieldBuilder() {
        if (markTipsListBuilder_ == null) {
          markTipsListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo, io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.Builder, io.grasscutter.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfoOrBuilder>(
                  markTipsList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          markTipsList_ = null;
        }
        return markTipsListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GetMapMarkTipsRsp)
    }

    // @@protoc_insertion_point(class_scope:GetMapMarkTipsRsp)
    private static final io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp();
    }

    public static io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetMapMarkTipsRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetMapMarkTipsRsp>() {
      @java.lang.Override
      public GetMapMarkTipsRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetMapMarkTipsRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetMapMarkTipsRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetMapMarkTipsRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetMapMarkTipsRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetMapMarkTipsRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027GetMapMarkTipsRsp.proto\032\025MapMarkTipsIn" +
      "fo.proto\"N\n\021GetMapMarkTipsRsp\022\017\n\007retcode" +
      "\030\007 \001(\005\022(\n\016mark_tips_list\030\013 \003(\0132\020.MapMark" +
      "TipsInfoB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.MapMarkTipsInfoOuterClass.getDescriptor(),
        });
    internal_static_GetMapMarkTipsRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetMapMarkTipsRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetMapMarkTipsRsp_descriptor,
        new java.lang.String[] { "Retcode", "MarkTipsList", });
    io.grasscutter.proto.MapMarkTipsInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
