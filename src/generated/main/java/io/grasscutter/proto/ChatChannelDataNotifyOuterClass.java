// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChatChannelDataNotify.proto

package io.grasscutter.proto;

public final class ChatChannelDataNotifyOuterClass {
  private ChatChannelDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChatChannelDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChatChannelDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 channel_list = 3;</code>
     * @return A list containing the channelList.
     */
    java.util.List<java.lang.Integer> getChannelListList();
    /**
     * <code>repeated uint32 channel_list = 3;</code>
     * @return The count of channelList.
     */
    int getChannelListCount();
    /**
     * <code>repeated uint32 channel_list = 3;</code>
     * @param index The index of the element to return.
     * @return The channelList at the given index.
     */
    int getChannelList(int index);
  }
  /**
   * <pre>
   * CmdId: 4998
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code ChatChannelDataNotify}
   */
  public static final class ChatChannelDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChatChannelDataNotify)
      ChatChannelDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChatChannelDataNotify.newBuilder() to construct.
    private ChatChannelDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChatChannelDataNotify() {
      channelList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChatChannelDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChatChannelDataNotify(
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
            case 24: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                channelList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              channelList_.addInt(input.readUInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                channelList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                channelList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
          channelList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.ChatChannelDataNotifyOuterClass.internal_static_ChatChannelDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.ChatChannelDataNotifyOuterClass.internal_static_ChatChannelDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify.class, io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify.Builder.class);
    }

    public static final int CHANNEL_LIST_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList channelList_;
    /**
     * <code>repeated uint32 channel_list = 3;</code>
     * @return A list containing the channelList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getChannelListList() {
      return channelList_;
    }
    /**
     * <code>repeated uint32 channel_list = 3;</code>
     * @return The count of channelList.
     */
    public int getChannelListCount() {
      return channelList_.size();
    }
    /**
     * <code>repeated uint32 channel_list = 3;</code>
     * @param index The index of the element to return.
     * @return The channelList at the given index.
     */
    public int getChannelList(int index) {
      return channelList_.getInt(index);
    }
    private int channelListMemoizedSerializedSize = -1;

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
      if (getChannelListList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(channelListMemoizedSerializedSize);
      }
      for (int i = 0; i < channelList_.size(); i++) {
        output.writeUInt32NoTag(channelList_.getInt(i));
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
        for (int i = 0; i < channelList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(channelList_.getInt(i));
        }
        size += dataSize;
        if (!getChannelListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        channelListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify other = (io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify) obj;

      if (!getChannelListList()
          .equals(other.getChannelListList())) return false;
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
      if (getChannelListCount() > 0) {
        hash = (37 * hash) + CHANNEL_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getChannelListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify prototype) {
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
     * CmdId: 4998
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code ChatChannelDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChatChannelDataNotify)
        io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.ChatChannelDataNotifyOuterClass.internal_static_ChatChannelDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.ChatChannelDataNotifyOuterClass.internal_static_ChatChannelDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify.class, io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify.newBuilder()
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
        channelList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.ChatChannelDataNotifyOuterClass.internal_static_ChatChannelDataNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify build() {
        io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify buildPartial() {
        io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify result = new io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          channelList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.channelList_ = channelList_;
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
        if (other instanceof io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify) {
          return mergeFrom((io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify other) {
        if (other == io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify.getDefaultInstance()) return this;
        if (!other.channelList_.isEmpty()) {
          if (channelList_.isEmpty()) {
            channelList_ = other.channelList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureChannelListIsMutable();
            channelList_.addAll(other.channelList_);
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
        io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList channelList_ = emptyIntList();
      private void ensureChannelListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          channelList_ = mutableCopy(channelList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 channel_list = 3;</code>
       * @return A list containing the channelList.
       */
      public java.util.List<java.lang.Integer>
          getChannelListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(channelList_) : channelList_;
      }
      /**
       * <code>repeated uint32 channel_list = 3;</code>
       * @return The count of channelList.
       */
      public int getChannelListCount() {
        return channelList_.size();
      }
      /**
       * <code>repeated uint32 channel_list = 3;</code>
       * @param index The index of the element to return.
       * @return The channelList at the given index.
       */
      public int getChannelList(int index) {
        return channelList_.getInt(index);
      }
      /**
       * <code>repeated uint32 channel_list = 3;</code>
       * @param index The index to set the value at.
       * @param value The channelList to set.
       * @return This builder for chaining.
       */
      public Builder setChannelList(
          int index, int value) {
        ensureChannelListIsMutable();
        channelList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 channel_list = 3;</code>
       * @param value The channelList to add.
       * @return This builder for chaining.
       */
      public Builder addChannelList(int value) {
        ensureChannelListIsMutable();
        channelList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 channel_list = 3;</code>
       * @param values The channelList to add.
       * @return This builder for chaining.
       */
      public Builder addAllChannelList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureChannelListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, channelList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 channel_list = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearChannelList() {
        channelList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:ChatChannelDataNotify)
    }

    // @@protoc_insertion_point(class_scope:ChatChannelDataNotify)
    private static final io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify();
    }

    public static io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChatChannelDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<ChatChannelDataNotify>() {
      @java.lang.Override
      public ChatChannelDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChatChannelDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChatChannelDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChatChannelDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.ChatChannelDataNotifyOuterClass.ChatChannelDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChatChannelDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChatChannelDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ChatChannelDataNotify.proto\"-\n\025ChatCha" +
      "nnelDataNotify\022\024\n\014channel_list\030\003 \003(\rB\026\n\024" +
      "io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChatChannelDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChatChannelDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChatChannelDataNotify_descriptor,
        new java.lang.String[] { "ChannelList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
