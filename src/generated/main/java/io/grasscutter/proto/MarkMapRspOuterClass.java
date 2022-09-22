// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MarkMapRsp.proto

package io.grasscutter.proto;

public final class MarkMapRspOuterClass {
  private MarkMapRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MarkMapRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MarkMapRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .MapMarkPoint mark_list = 8;</code>
     */
    java.util.List<io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint> 
        getMarkListList();
    /**
     * <code>repeated .MapMarkPoint mark_list = 8;</code>
     */
    io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint getMarkList(int index);
    /**
     * <code>repeated .MapMarkPoint mark_list = 8;</code>
     */
    int getMarkListCount();
    /**
     * <code>repeated .MapMarkPoint mark_list = 8;</code>
     */
    java.util.List<? extends io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPointOrBuilder> 
        getMarkListOrBuilderList();
    /**
     * <code>repeated .MapMarkPoint mark_list = 8;</code>
     */
    io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPointOrBuilder getMarkListOrBuilder(
        int index);

    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 3079
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code MarkMapRsp}
   */
  public static final class MarkMapRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MarkMapRsp)
      MarkMapRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MarkMapRsp.newBuilder() to construct.
    private MarkMapRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MarkMapRsp() {
      markList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MarkMapRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MarkMapRsp(
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
            case 66: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                markList_ = new java.util.ArrayList<io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint>();
                mutable_bitField0_ |= 0x00000001;
              }
              markList_.add(
                  input.readMessage(io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint.parser(), extensionRegistry));
              break;
            }
            case 88: {

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
          markList_ = java.util.Collections.unmodifiableList(markList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.MarkMapRspOuterClass.internal_static_MarkMapRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.MarkMapRspOuterClass.internal_static_MarkMapRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp.class, io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp.Builder.class);
    }

    public static final int MARK_LIST_FIELD_NUMBER = 8;
    private java.util.List<io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint> markList_;
    /**
     * <code>repeated .MapMarkPoint mark_list = 8;</code>
     */
    @java.lang.Override
    public java.util.List<io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint> getMarkListList() {
      return markList_;
    }
    /**
     * <code>repeated .MapMarkPoint mark_list = 8;</code>
     */
    @java.lang.Override
    public java.util.List<? extends io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPointOrBuilder> 
        getMarkListOrBuilderList() {
      return markList_;
    }
    /**
     * <code>repeated .MapMarkPoint mark_list = 8;</code>
     */
    @java.lang.Override
    public int getMarkListCount() {
      return markList_.size();
    }
    /**
     * <code>repeated .MapMarkPoint mark_list = 8;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint getMarkList(int index) {
      return markList_.get(index);
    }
    /**
     * <code>repeated .MapMarkPoint mark_list = 8;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPointOrBuilder getMarkListOrBuilder(
        int index) {
      return markList_.get(index);
    }

    public static final int RETCODE_FIELD_NUMBER = 11;
    private int retcode_;
    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      for (int i = 0; i < markList_.size(); i++) {
        output.writeMessage(8, markList_.get(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(11, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < markList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, markList_.get(i));
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, retcode_);
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
      if (!(obj instanceof io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp other = (io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp) obj;

      if (!getMarkListList()
          .equals(other.getMarkListList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (getMarkListCount() > 0) {
        hash = (37 * hash) + MARK_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMarkListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp prototype) {
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
     * CmdId: 3079
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code MarkMapRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MarkMapRsp)
        io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.MarkMapRspOuterClass.internal_static_MarkMapRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.MarkMapRspOuterClass.internal_static_MarkMapRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp.class, io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp.Builder.class);
      }

      // Construct using io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp.newBuilder()
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
          getMarkListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (markListBuilder_ == null) {
          markList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          markListBuilder_.clear();
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.MarkMapRspOuterClass.internal_static_MarkMapRsp_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp getDefaultInstanceForType() {
        return io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp build() {
        io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp buildPartial() {
        io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp result = new io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp(this);
        int from_bitField0_ = bitField0_;
        if (markListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            markList_ = java.util.Collections.unmodifiableList(markList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.markList_ = markList_;
        } else {
          result.markList_ = markListBuilder_.build();
        }
        result.retcode_ = retcode_;
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
        if (other instanceof io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp) {
          return mergeFrom((io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp other) {
        if (other == io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp.getDefaultInstance()) return this;
        if (markListBuilder_ == null) {
          if (!other.markList_.isEmpty()) {
            if (markList_.isEmpty()) {
              markList_ = other.markList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMarkListIsMutable();
              markList_.addAll(other.markList_);
            }
            onChanged();
          }
        } else {
          if (!other.markList_.isEmpty()) {
            if (markListBuilder_.isEmpty()) {
              markListBuilder_.dispose();
              markListBuilder_ = null;
              markList_ = other.markList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              markListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMarkListFieldBuilder() : null;
            } else {
              markListBuilder_.addAllMessages(other.markList_);
            }
          }
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint> markList_ =
        java.util.Collections.emptyList();
      private void ensureMarkListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          markList_ = new java.util.ArrayList<io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint>(markList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint, io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint.Builder, io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPointOrBuilder> markListBuilder_;

      /**
       * <code>repeated .MapMarkPoint mark_list = 8;</code>
       */
      public java.util.List<io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint> getMarkListList() {
        if (markListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(markList_);
        } else {
          return markListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MapMarkPoint mark_list = 8;</code>
       */
      public int getMarkListCount() {
        if (markListBuilder_ == null) {
          return markList_.size();
        } else {
          return markListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MapMarkPoint mark_list = 8;</code>
       */
      public io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint getMarkList(int index) {
        if (markListBuilder_ == null) {
          return markList_.get(index);
        } else {
          return markListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MapMarkPoint mark_list = 8;</code>
       */
      public Builder setMarkList(
          int index, io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint value) {
        if (markListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMarkListIsMutable();
          markList_.set(index, value);
          onChanged();
        } else {
          markListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkPoint mark_list = 8;</code>
       */
      public Builder setMarkList(
          int index, io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint.Builder builderForValue) {
        if (markListBuilder_ == null) {
          ensureMarkListIsMutable();
          markList_.set(index, builderForValue.build());
          onChanged();
        } else {
          markListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkPoint mark_list = 8;</code>
       */
      public Builder addMarkList(io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint value) {
        if (markListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMarkListIsMutable();
          markList_.add(value);
          onChanged();
        } else {
          markListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkPoint mark_list = 8;</code>
       */
      public Builder addMarkList(
          int index, io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint value) {
        if (markListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMarkListIsMutable();
          markList_.add(index, value);
          onChanged();
        } else {
          markListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkPoint mark_list = 8;</code>
       */
      public Builder addMarkList(
          io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint.Builder builderForValue) {
        if (markListBuilder_ == null) {
          ensureMarkListIsMutable();
          markList_.add(builderForValue.build());
          onChanged();
        } else {
          markListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkPoint mark_list = 8;</code>
       */
      public Builder addMarkList(
          int index, io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint.Builder builderForValue) {
        if (markListBuilder_ == null) {
          ensureMarkListIsMutable();
          markList_.add(index, builderForValue.build());
          onChanged();
        } else {
          markListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkPoint mark_list = 8;</code>
       */
      public Builder addAllMarkList(
          java.lang.Iterable<? extends io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint> values) {
        if (markListBuilder_ == null) {
          ensureMarkListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, markList_);
          onChanged();
        } else {
          markListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkPoint mark_list = 8;</code>
       */
      public Builder clearMarkList() {
        if (markListBuilder_ == null) {
          markList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          markListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkPoint mark_list = 8;</code>
       */
      public Builder removeMarkList(int index) {
        if (markListBuilder_ == null) {
          ensureMarkListIsMutable();
          markList_.remove(index);
          onChanged();
        } else {
          markListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkPoint mark_list = 8;</code>
       */
      public io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint.Builder getMarkListBuilder(
          int index) {
        return getMarkListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MapMarkPoint mark_list = 8;</code>
       */
      public io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPointOrBuilder getMarkListOrBuilder(
          int index) {
        if (markListBuilder_ == null) {
          return markList_.get(index);  } else {
          return markListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MapMarkPoint mark_list = 8;</code>
       */
      public java.util.List<? extends io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPointOrBuilder> 
           getMarkListOrBuilderList() {
        if (markListBuilder_ != null) {
          return markListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(markList_);
        }
      }
      /**
       * <code>repeated .MapMarkPoint mark_list = 8;</code>
       */
      public io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint.Builder addMarkListBuilder() {
        return getMarkListFieldBuilder().addBuilder(
            io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance());
      }
      /**
       * <code>repeated .MapMarkPoint mark_list = 8;</code>
       */
      public io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint.Builder addMarkListBuilder(
          int index) {
        return getMarkListFieldBuilder().addBuilder(
            index, io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance());
      }
      /**
       * <code>repeated .MapMarkPoint mark_list = 8;</code>
       */
      public java.util.List<io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint.Builder> 
           getMarkListBuilderList() {
        return getMarkListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint, io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint.Builder, io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPointOrBuilder> 
          getMarkListFieldBuilder() {
        if (markListBuilder_ == null) {
          markListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint, io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPoint.Builder, io.grasscutter.proto.MapMarkPointOuterClass.MapMarkPointOrBuilder>(
                  markList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          markList_ = null;
        }
        return markListBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 11;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MarkMapRsp)
    }

    // @@protoc_insertion_point(class_scope:MarkMapRsp)
    private static final io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp();
    }

    public static io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MarkMapRsp>
        PARSER = new com.google.protobuf.AbstractParser<MarkMapRsp>() {
      @java.lang.Override
      public MarkMapRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MarkMapRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MarkMapRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MarkMapRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.MarkMapRspOuterClass.MarkMapRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MarkMapRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MarkMapRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020MarkMapRsp.proto\032\022MapMarkPoint.proto\"?" +
      "\n\nMarkMapRsp\022 \n\tmark_list\030\010 \003(\0132\r.MapMar" +
      "kPoint\022\017\n\007retcode\030\013 \001(\005B\026\n\024io.grasscutte" +
      "r.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.MapMarkPointOuterClass.getDescriptor(),
        });
    internal_static_MarkMapRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MarkMapRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MarkMapRsp_descriptor,
        new java.lang.String[] { "MarkList", "Retcode", });
    io.grasscutter.proto.MapMarkPointOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
