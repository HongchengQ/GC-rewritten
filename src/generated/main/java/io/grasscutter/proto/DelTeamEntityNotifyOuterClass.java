// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DelTeamEntityNotify.proto

package io.grasscutter.proto;

public final class DelTeamEntityNotifyOuterClass {
  private DelTeamEntityNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DelTeamEntityNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DelTeamEntityNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 del_entity_id_list = 15;</code>
     * @return A list containing the delEntityIdList.
     */
    java.util.List<java.lang.Integer> getDelEntityIdListList();
    /**
     * <code>repeated uint32 del_entity_id_list = 15;</code>
     * @return The count of delEntityIdList.
     */
    int getDelEntityIdListCount();
    /**
     * <code>repeated uint32 del_entity_id_list = 15;</code>
     * @param index The index of the element to return.
     * @return The delEntityIdList at the given index.
     */
    int getDelEntityIdList(int index);

    /**
     * <code>uint32 scene_id = 8;</code>
     * @return The sceneId.
     */
    int getSceneId();
  }
  /**
   * <pre>
   * CmdId: 302
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code DelTeamEntityNotify}
   */
  public static final class DelTeamEntityNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DelTeamEntityNotify)
      DelTeamEntityNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DelTeamEntityNotify.newBuilder() to construct.
    private DelTeamEntityNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DelTeamEntityNotify() {
      delEntityIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DelTeamEntityNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DelTeamEntityNotify(
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
            case 64: {

              sceneId_ = input.readUInt32();
              break;
            }
            case 120: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                delEntityIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              delEntityIdList_.addInt(input.readUInt32());
              break;
            }
            case 122: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                delEntityIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                delEntityIdList_.addInt(input.readUInt32());
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
          delEntityIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.DelTeamEntityNotifyOuterClass.internal_static_DelTeamEntityNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.DelTeamEntityNotifyOuterClass.internal_static_DelTeamEntityNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify.class, io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify.Builder.class);
    }

    public static final int DEL_ENTITY_ID_LIST_FIELD_NUMBER = 15;
    private com.google.protobuf.Internal.IntList delEntityIdList_;
    /**
     * <code>repeated uint32 del_entity_id_list = 15;</code>
     * @return A list containing the delEntityIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getDelEntityIdListList() {
      return delEntityIdList_;
    }
    /**
     * <code>repeated uint32 del_entity_id_list = 15;</code>
     * @return The count of delEntityIdList.
     */
    public int getDelEntityIdListCount() {
      return delEntityIdList_.size();
    }
    /**
     * <code>repeated uint32 del_entity_id_list = 15;</code>
     * @param index The index of the element to return.
     * @return The delEntityIdList at the given index.
     */
    public int getDelEntityIdList(int index) {
      return delEntityIdList_.getInt(index);
    }
    private int delEntityIdListMemoizedSerializedSize = -1;

    public static final int SCENE_ID_FIELD_NUMBER = 8;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 8;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
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
      if (sceneId_ != 0) {
        output.writeUInt32(8, sceneId_);
      }
      if (getDelEntityIdListList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(delEntityIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < delEntityIdList_.size(); i++) {
        output.writeUInt32NoTag(delEntityIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, sceneId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < delEntityIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(delEntityIdList_.getInt(i));
        }
        size += dataSize;
        if (!getDelEntityIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        delEntityIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify other = (io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify) obj;

      if (!getDelEntityIdListList()
          .equals(other.getDelEntityIdListList())) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
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
      if (getDelEntityIdListCount() > 0) {
        hash = (37 * hash) + DEL_ENTITY_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getDelEntityIdListList().hashCode();
      }
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify prototype) {
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
     * CmdId: 302
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code DelTeamEntityNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DelTeamEntityNotify)
        io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.DelTeamEntityNotifyOuterClass.internal_static_DelTeamEntityNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.DelTeamEntityNotifyOuterClass.internal_static_DelTeamEntityNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify.class, io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify.newBuilder()
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
        delEntityIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        sceneId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.DelTeamEntityNotifyOuterClass.internal_static_DelTeamEntityNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify build() {
        io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify buildPartial() {
        io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify result = new io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          delEntityIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.delEntityIdList_ = delEntityIdList_;
        result.sceneId_ = sceneId_;
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
        if (other instanceof io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify) {
          return mergeFrom((io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify other) {
        if (other == io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify.getDefaultInstance()) return this;
        if (!other.delEntityIdList_.isEmpty()) {
          if (delEntityIdList_.isEmpty()) {
            delEntityIdList_ = other.delEntityIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDelEntityIdListIsMutable();
            delEntityIdList_.addAll(other.delEntityIdList_);
          }
          onChanged();
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
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
        io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList delEntityIdList_ = emptyIntList();
      private void ensureDelEntityIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          delEntityIdList_ = mutableCopy(delEntityIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 del_entity_id_list = 15;</code>
       * @return A list containing the delEntityIdList.
       */
      public java.util.List<java.lang.Integer>
          getDelEntityIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(delEntityIdList_) : delEntityIdList_;
      }
      /**
       * <code>repeated uint32 del_entity_id_list = 15;</code>
       * @return The count of delEntityIdList.
       */
      public int getDelEntityIdListCount() {
        return delEntityIdList_.size();
      }
      /**
       * <code>repeated uint32 del_entity_id_list = 15;</code>
       * @param index The index of the element to return.
       * @return The delEntityIdList at the given index.
       */
      public int getDelEntityIdList(int index) {
        return delEntityIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 del_entity_id_list = 15;</code>
       * @param index The index to set the value at.
       * @param value The delEntityIdList to set.
       * @return This builder for chaining.
       */
      public Builder setDelEntityIdList(
          int index, int value) {
        ensureDelEntityIdListIsMutable();
        delEntityIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 del_entity_id_list = 15;</code>
       * @param value The delEntityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addDelEntityIdList(int value) {
        ensureDelEntityIdListIsMutable();
        delEntityIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 del_entity_id_list = 15;</code>
       * @param values The delEntityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllDelEntityIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureDelEntityIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, delEntityIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 del_entity_id_list = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearDelEntityIdList() {
        delEntityIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 8;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 8;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DelTeamEntityNotify)
    }

    // @@protoc_insertion_point(class_scope:DelTeamEntityNotify)
    private static final io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify();
    }

    public static io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DelTeamEntityNotify>
        PARSER = new com.google.protobuf.AbstractParser<DelTeamEntityNotify>() {
      @java.lang.Override
      public DelTeamEntityNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DelTeamEntityNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DelTeamEntityNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DelTeamEntityNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DelTeamEntityNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DelTeamEntityNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031DelTeamEntityNotify.proto\"C\n\023DelTeamEn" +
      "tityNotify\022\032\n\022del_entity_id_list\030\017 \003(\r\022\020" +
      "\n\010scene_id\030\010 \001(\rB\026\n\024io.grasscutter.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DelTeamEntityNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DelTeamEntityNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DelTeamEntityNotify_descriptor,
        new java.lang.String[] { "DelEntityIdList", "SceneId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
