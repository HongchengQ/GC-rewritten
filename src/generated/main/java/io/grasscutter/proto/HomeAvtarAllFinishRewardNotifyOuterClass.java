// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeAvtarAllFinishRewardNotify.proto

package io.grasscutter.proto;

public final class HomeAvtarAllFinishRewardNotifyOuterClass {
  private HomeAvtarAllFinishRewardNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeAvtarAllFinishRewardNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeAvtarAllFinishRewardNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 event_id_list = 13;</code>
     * @return A list containing the eventIdList.
     */
    java.util.List<java.lang.Integer> getEventIdListList();
    /**
     * <code>repeated uint32 event_id_list = 13;</code>
     * @return The count of eventIdList.
     */
    int getEventIdListCount();
    /**
     * <code>repeated uint32 event_id_list = 13;</code>
     * @param index The index of the element to return.
     * @return The eventIdList at the given index.
     */
    int getEventIdList(int index);
  }
  /**
   * <pre>
   * CmdId: 4453
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code HomeAvtarAllFinishRewardNotify}
   */
  public static final class HomeAvtarAllFinishRewardNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeAvtarAllFinishRewardNotify)
      HomeAvtarAllFinishRewardNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeAvtarAllFinishRewardNotify.newBuilder() to construct.
    private HomeAvtarAllFinishRewardNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeAvtarAllFinishRewardNotify() {
      eventIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeAvtarAllFinishRewardNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeAvtarAllFinishRewardNotify(
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
                eventIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              eventIdList_.addInt(input.readUInt32());
              break;
            }
            case 106: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                eventIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                eventIdList_.addInt(input.readUInt32());
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
          eventIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.internal_static_HomeAvtarAllFinishRewardNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.internal_static_HomeAvtarAllFinishRewardNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify.class, io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify.Builder.class);
    }

    public static final int EVENT_ID_LIST_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList eventIdList_;
    /**
     * <code>repeated uint32 event_id_list = 13;</code>
     * @return A list containing the eventIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getEventIdListList() {
      return eventIdList_;
    }
    /**
     * <code>repeated uint32 event_id_list = 13;</code>
     * @return The count of eventIdList.
     */
    public int getEventIdListCount() {
      return eventIdList_.size();
    }
    /**
     * <code>repeated uint32 event_id_list = 13;</code>
     * @param index The index of the element to return.
     * @return The eventIdList at the given index.
     */
    public int getEventIdList(int index) {
      return eventIdList_.getInt(index);
    }
    private int eventIdListMemoizedSerializedSize = -1;

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
      if (getEventIdListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(eventIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < eventIdList_.size(); i++) {
        output.writeUInt32NoTag(eventIdList_.getInt(i));
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
        for (int i = 0; i < eventIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(eventIdList_.getInt(i));
        }
        size += dataSize;
        if (!getEventIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        eventIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify other = (io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify) obj;

      if (!getEventIdListList()
          .equals(other.getEventIdListList())) return false;
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
      if (getEventIdListCount() > 0) {
        hash = (37 * hash) + EVENT_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getEventIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify prototype) {
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
     * CmdId: 4453
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code HomeAvtarAllFinishRewardNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeAvtarAllFinishRewardNotify)
        io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.internal_static_HomeAvtarAllFinishRewardNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.internal_static_HomeAvtarAllFinishRewardNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify.class, io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify.newBuilder()
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
        eventIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.internal_static_HomeAvtarAllFinishRewardNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify build() {
        io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify buildPartial() {
        io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify result = new io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          eventIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.eventIdList_ = eventIdList_;
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
        if (other instanceof io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify) {
          return mergeFrom((io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify other) {
        if (other == io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify.getDefaultInstance()) return this;
        if (!other.eventIdList_.isEmpty()) {
          if (eventIdList_.isEmpty()) {
            eventIdList_ = other.eventIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEventIdListIsMutable();
            eventIdList_.addAll(other.eventIdList_);
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
        io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList eventIdList_ = emptyIntList();
      private void ensureEventIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          eventIdList_ = mutableCopy(eventIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 event_id_list = 13;</code>
       * @return A list containing the eventIdList.
       */
      public java.util.List<java.lang.Integer>
          getEventIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(eventIdList_) : eventIdList_;
      }
      /**
       * <code>repeated uint32 event_id_list = 13;</code>
       * @return The count of eventIdList.
       */
      public int getEventIdListCount() {
        return eventIdList_.size();
      }
      /**
       * <code>repeated uint32 event_id_list = 13;</code>
       * @param index The index of the element to return.
       * @return The eventIdList at the given index.
       */
      public int getEventIdList(int index) {
        return eventIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 event_id_list = 13;</code>
       * @param index The index to set the value at.
       * @param value The eventIdList to set.
       * @return This builder for chaining.
       */
      public Builder setEventIdList(
          int index, int value) {
        ensureEventIdListIsMutable();
        eventIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 event_id_list = 13;</code>
       * @param value The eventIdList to add.
       * @return This builder for chaining.
       */
      public Builder addEventIdList(int value) {
        ensureEventIdListIsMutable();
        eventIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 event_id_list = 13;</code>
       * @param values The eventIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllEventIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureEventIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, eventIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 event_id_list = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearEventIdList() {
        eventIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:HomeAvtarAllFinishRewardNotify)
    }

    // @@protoc_insertion_point(class_scope:HomeAvtarAllFinishRewardNotify)
    private static final io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify();
    }

    public static io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeAvtarAllFinishRewardNotify>
        PARSER = new com.google.protobuf.AbstractParser<HomeAvtarAllFinishRewardNotify>() {
      @java.lang.Override
      public HomeAvtarAllFinishRewardNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeAvtarAllFinishRewardNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeAvtarAllFinishRewardNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeAvtarAllFinishRewardNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.HomeAvtarAllFinishRewardNotifyOuterClass.HomeAvtarAllFinishRewardNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeAvtarAllFinishRewardNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeAvtarAllFinishRewardNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$HomeAvtarAllFinishRewardNotify.proto\"7" +
      "\n\036HomeAvtarAllFinishRewardNotify\022\025\n\reven" +
      "t_id_list\030\r \003(\rB\026\n\024io.grasscutter.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeAvtarAllFinishRewardNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeAvtarAllFinishRewardNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeAvtarAllFinishRewardNotify_descriptor,
        new java.lang.String[] { "EventIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
