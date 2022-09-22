// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BattlePassMissionDelNotify.proto

package io.grasscutter.proto;

public final class BattlePassMissionDelNotifyOuterClass {
  private BattlePassMissionDelNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BattlePassMissionDelNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BattlePassMissionDelNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 del_mission_id_list = 10;</code>
     * @return A list containing the delMissionIdList.
     */
    java.util.List<java.lang.Integer> getDelMissionIdListList();
    /**
     * <code>repeated uint32 del_mission_id_list = 10;</code>
     * @return The count of delMissionIdList.
     */
    int getDelMissionIdListCount();
    /**
     * <code>repeated uint32 del_mission_id_list = 10;</code>
     * @param index The index of the element to return.
     * @return The delMissionIdList at the given index.
     */
    int getDelMissionIdList(int index);
  }
  /**
   * <pre>
   * CmdId: 2625
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code BattlePassMissionDelNotify}
   */
  public static final class BattlePassMissionDelNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BattlePassMissionDelNotify)
      BattlePassMissionDelNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BattlePassMissionDelNotify.newBuilder() to construct.
    private BattlePassMissionDelNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BattlePassMissionDelNotify() {
      delMissionIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BattlePassMissionDelNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BattlePassMissionDelNotify(
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
            case 80: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                delMissionIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              delMissionIdList_.addInt(input.readUInt32());
              break;
            }
            case 82: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                delMissionIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                delMissionIdList_.addInt(input.readUInt32());
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
          delMissionIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.internal_static_BattlePassMissionDelNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.internal_static_BattlePassMissionDelNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify.class, io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify.Builder.class);
    }

    public static final int DEL_MISSION_ID_LIST_FIELD_NUMBER = 10;
    private com.google.protobuf.Internal.IntList delMissionIdList_;
    /**
     * <code>repeated uint32 del_mission_id_list = 10;</code>
     * @return A list containing the delMissionIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getDelMissionIdListList() {
      return delMissionIdList_;
    }
    /**
     * <code>repeated uint32 del_mission_id_list = 10;</code>
     * @return The count of delMissionIdList.
     */
    public int getDelMissionIdListCount() {
      return delMissionIdList_.size();
    }
    /**
     * <code>repeated uint32 del_mission_id_list = 10;</code>
     * @param index The index of the element to return.
     * @return The delMissionIdList at the given index.
     */
    public int getDelMissionIdList(int index) {
      return delMissionIdList_.getInt(index);
    }
    private int delMissionIdListMemoizedSerializedSize = -1;

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
      if (getDelMissionIdListList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(delMissionIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < delMissionIdList_.size(); i++) {
        output.writeUInt32NoTag(delMissionIdList_.getInt(i));
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
        for (int i = 0; i < delMissionIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(delMissionIdList_.getInt(i));
        }
        size += dataSize;
        if (!getDelMissionIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        delMissionIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify other = (io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify) obj;

      if (!getDelMissionIdListList()
          .equals(other.getDelMissionIdListList())) return false;
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
      if (getDelMissionIdListCount() > 0) {
        hash = (37 * hash) + DEL_MISSION_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getDelMissionIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify prototype) {
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
     * CmdId: 2625
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code BattlePassMissionDelNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BattlePassMissionDelNotify)
        io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.internal_static_BattlePassMissionDelNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.internal_static_BattlePassMissionDelNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify.class, io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify.newBuilder()
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
        delMissionIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.internal_static_BattlePassMissionDelNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify build() {
        io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify buildPartial() {
        io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify result = new io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          delMissionIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.delMissionIdList_ = delMissionIdList_;
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
        if (other instanceof io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify) {
          return mergeFrom((io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify other) {
        if (other == io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify.getDefaultInstance()) return this;
        if (!other.delMissionIdList_.isEmpty()) {
          if (delMissionIdList_.isEmpty()) {
            delMissionIdList_ = other.delMissionIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDelMissionIdListIsMutable();
            delMissionIdList_.addAll(other.delMissionIdList_);
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
        io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList delMissionIdList_ = emptyIntList();
      private void ensureDelMissionIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          delMissionIdList_ = mutableCopy(delMissionIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 del_mission_id_list = 10;</code>
       * @return A list containing the delMissionIdList.
       */
      public java.util.List<java.lang.Integer>
          getDelMissionIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(delMissionIdList_) : delMissionIdList_;
      }
      /**
       * <code>repeated uint32 del_mission_id_list = 10;</code>
       * @return The count of delMissionIdList.
       */
      public int getDelMissionIdListCount() {
        return delMissionIdList_.size();
      }
      /**
       * <code>repeated uint32 del_mission_id_list = 10;</code>
       * @param index The index of the element to return.
       * @return The delMissionIdList at the given index.
       */
      public int getDelMissionIdList(int index) {
        return delMissionIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 del_mission_id_list = 10;</code>
       * @param index The index to set the value at.
       * @param value The delMissionIdList to set.
       * @return This builder for chaining.
       */
      public Builder setDelMissionIdList(
          int index, int value) {
        ensureDelMissionIdListIsMutable();
        delMissionIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 del_mission_id_list = 10;</code>
       * @param value The delMissionIdList to add.
       * @return This builder for chaining.
       */
      public Builder addDelMissionIdList(int value) {
        ensureDelMissionIdListIsMutable();
        delMissionIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 del_mission_id_list = 10;</code>
       * @param values The delMissionIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllDelMissionIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureDelMissionIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, delMissionIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 del_mission_id_list = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearDelMissionIdList() {
        delMissionIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:BattlePassMissionDelNotify)
    }

    // @@protoc_insertion_point(class_scope:BattlePassMissionDelNotify)
    private static final io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify();
    }

    public static io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BattlePassMissionDelNotify>
        PARSER = new com.google.protobuf.AbstractParser<BattlePassMissionDelNotify>() {
      @java.lang.Override
      public BattlePassMissionDelNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BattlePassMissionDelNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BattlePassMissionDelNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BattlePassMissionDelNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.BattlePassMissionDelNotifyOuterClass.BattlePassMissionDelNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BattlePassMissionDelNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BattlePassMissionDelNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n BattlePassMissionDelNotify.proto\"9\n\032Ba" +
      "ttlePassMissionDelNotify\022\033\n\023del_mission_" +
      "id_list\030\n \003(\rB\026\n\024io.grasscutter.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BattlePassMissionDelNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BattlePassMissionDelNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BattlePassMissionDelNotify_descriptor,
        new java.lang.String[] { "DelMissionIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
