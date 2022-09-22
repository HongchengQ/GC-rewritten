// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChessEntranceInfo.proto

package io.grasscutter.proto;

public final class ChessEntranceInfoOuterClass {
  private ChessEntranceInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChessEntranceInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChessEntranceInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
     */
    java.util.List<io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo> 
        getMonsterInfoListList();
    /**
     * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
     */
    io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo getMonsterInfoList(int index);
    /**
     * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
     */
    int getMonsterInfoListCount();
    /**
     * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
     */
    java.util.List<? extends io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfoOrBuilder> 
        getMonsterInfoListOrBuilderList();
    /**
     * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
     */
    io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfoOrBuilder getMonsterInfoListOrBuilder(
        int index);

    /**
     * <code>uint32 entrance_index = 15;</code>
     * @return The entranceIndex.
     */
    int getEntranceIndex();

    /**
     * <code>uint32 entrance_point_id = 8;</code>
     * @return The entrancePointId.
     */
    int getEntrancePointId();
  }
  /**
   * Protobuf type {@code ChessEntranceInfo}
   */
  public static final class ChessEntranceInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChessEntranceInfo)
      ChessEntranceInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChessEntranceInfo.newBuilder() to construct.
    private ChessEntranceInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChessEntranceInfo() {
      monsterInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChessEntranceInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChessEntranceInfo(
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

              entrancePointId_ = input.readUInt32();
              break;
            }
            case 114: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                monsterInfoList_ = new java.util.ArrayList<io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              monsterInfoList_.add(
                  input.readMessage(io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo.parser(), extensionRegistry));
              break;
            }
            case 120: {

              entranceIndex_ = input.readUInt32();
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
          monsterInfoList_ = java.util.Collections.unmodifiableList(monsterInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.ChessEntranceInfoOuterClass.internal_static_ChessEntranceInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.ChessEntranceInfoOuterClass.internal_static_ChessEntranceInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo.class, io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo.Builder.class);
    }

    public static final int MONSTER_INFO_LIST_FIELD_NUMBER = 14;
    private java.util.List<io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo> monsterInfoList_;
    /**
     * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo> getMonsterInfoListList() {
      return monsterInfoList_;
    }
    /**
     * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<? extends io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfoOrBuilder> 
        getMonsterInfoListOrBuilderList() {
      return monsterInfoList_;
    }
    /**
     * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
     */
    @java.lang.Override
    public int getMonsterInfoListCount() {
      return monsterInfoList_.size();
    }
    /**
     * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo getMonsterInfoList(int index) {
      return monsterInfoList_.get(index);
    }
    /**
     * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfoOrBuilder getMonsterInfoListOrBuilder(
        int index) {
      return monsterInfoList_.get(index);
    }

    public static final int ENTRANCE_INDEX_FIELD_NUMBER = 15;
    private int entranceIndex_;
    /**
     * <code>uint32 entrance_index = 15;</code>
     * @return The entranceIndex.
     */
    @java.lang.Override
    public int getEntranceIndex() {
      return entranceIndex_;
    }

    public static final int ENTRANCE_POINT_ID_FIELD_NUMBER = 8;
    private int entrancePointId_;
    /**
     * <code>uint32 entrance_point_id = 8;</code>
     * @return The entrancePointId.
     */
    @java.lang.Override
    public int getEntrancePointId() {
      return entrancePointId_;
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
      if (entrancePointId_ != 0) {
        output.writeUInt32(8, entrancePointId_);
      }
      for (int i = 0; i < monsterInfoList_.size(); i++) {
        output.writeMessage(14, monsterInfoList_.get(i));
      }
      if (entranceIndex_ != 0) {
        output.writeUInt32(15, entranceIndex_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entrancePointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, entrancePointId_);
      }
      for (int i = 0; i < monsterInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, monsterInfoList_.get(i));
      }
      if (entranceIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, entranceIndex_);
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
      if (!(obj instanceof io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo other = (io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo) obj;

      if (!getMonsterInfoListList()
          .equals(other.getMonsterInfoListList())) return false;
      if (getEntranceIndex()
          != other.getEntranceIndex()) return false;
      if (getEntrancePointId()
          != other.getEntrancePointId()) return false;
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
      if (getMonsterInfoListCount() > 0) {
        hash = (37 * hash) + MONSTER_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMonsterInfoListList().hashCode();
      }
      hash = (37 * hash) + ENTRANCE_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getEntranceIndex();
      hash = (37 * hash) + ENTRANCE_POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntrancePointId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo prototype) {
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
     * Protobuf type {@code ChessEntranceInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChessEntranceInfo)
        io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.ChessEntranceInfoOuterClass.internal_static_ChessEntranceInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.ChessEntranceInfoOuterClass.internal_static_ChessEntranceInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo.class, io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo.Builder.class);
      }

      // Construct using io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo.newBuilder()
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
          getMonsterInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (monsterInfoListBuilder_ == null) {
          monsterInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          monsterInfoListBuilder_.clear();
        }
        entranceIndex_ = 0;

        entrancePointId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.ChessEntranceInfoOuterClass.internal_static_ChessEntranceInfo_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo getDefaultInstanceForType() {
        return io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo build() {
        io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo buildPartial() {
        io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo result = new io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo(this);
        int from_bitField0_ = bitField0_;
        if (monsterInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            monsterInfoList_ = java.util.Collections.unmodifiableList(monsterInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.monsterInfoList_ = monsterInfoList_;
        } else {
          result.monsterInfoList_ = monsterInfoListBuilder_.build();
        }
        result.entranceIndex_ = entranceIndex_;
        result.entrancePointId_ = entrancePointId_;
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
        if (other instanceof io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo) {
          return mergeFrom((io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo other) {
        if (other == io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo.getDefaultInstance()) return this;
        if (monsterInfoListBuilder_ == null) {
          if (!other.monsterInfoList_.isEmpty()) {
            if (monsterInfoList_.isEmpty()) {
              monsterInfoList_ = other.monsterInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMonsterInfoListIsMutable();
              monsterInfoList_.addAll(other.monsterInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.monsterInfoList_.isEmpty()) {
            if (monsterInfoListBuilder_.isEmpty()) {
              monsterInfoListBuilder_.dispose();
              monsterInfoListBuilder_ = null;
              monsterInfoList_ = other.monsterInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              monsterInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMonsterInfoListFieldBuilder() : null;
            } else {
              monsterInfoListBuilder_.addAllMessages(other.monsterInfoList_);
            }
          }
        }
        if (other.getEntranceIndex() != 0) {
          setEntranceIndex(other.getEntranceIndex());
        }
        if (other.getEntrancePointId() != 0) {
          setEntrancePointId(other.getEntrancePointId());
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
        io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo> monsterInfoList_ =
        java.util.Collections.emptyList();
      private void ensureMonsterInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          monsterInfoList_ = new java.util.ArrayList<io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo>(monsterInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo, io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo.Builder, io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfoOrBuilder> monsterInfoListBuilder_;

      /**
       * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
       */
      public java.util.List<io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo> getMonsterInfoListList() {
        if (monsterInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(monsterInfoList_);
        } else {
          return monsterInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
       */
      public int getMonsterInfoListCount() {
        if (monsterInfoListBuilder_ == null) {
          return monsterInfoList_.size();
        } else {
          return monsterInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
       */
      public io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo getMonsterInfoList(int index) {
        if (monsterInfoListBuilder_ == null) {
          return monsterInfoList_.get(index);
        } else {
          return monsterInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
       */
      public Builder setMonsterInfoList(
          int index, io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo value) {
        if (monsterInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMonsterInfoListIsMutable();
          monsterInfoList_.set(index, value);
          onChanged();
        } else {
          monsterInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
       */
      public Builder setMonsterInfoList(
          int index, io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo.Builder builderForValue) {
        if (monsterInfoListBuilder_ == null) {
          ensureMonsterInfoListIsMutable();
          monsterInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          monsterInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
       */
      public Builder addMonsterInfoList(io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo value) {
        if (monsterInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMonsterInfoListIsMutable();
          monsterInfoList_.add(value);
          onChanged();
        } else {
          monsterInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
       */
      public Builder addMonsterInfoList(
          int index, io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo value) {
        if (monsterInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMonsterInfoListIsMutable();
          monsterInfoList_.add(index, value);
          onChanged();
        } else {
          monsterInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
       */
      public Builder addMonsterInfoList(
          io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo.Builder builderForValue) {
        if (monsterInfoListBuilder_ == null) {
          ensureMonsterInfoListIsMutable();
          monsterInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          monsterInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
       */
      public Builder addMonsterInfoList(
          int index, io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo.Builder builderForValue) {
        if (monsterInfoListBuilder_ == null) {
          ensureMonsterInfoListIsMutable();
          monsterInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          monsterInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
       */
      public Builder addAllMonsterInfoList(
          java.lang.Iterable<? extends io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo> values) {
        if (monsterInfoListBuilder_ == null) {
          ensureMonsterInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, monsterInfoList_);
          onChanged();
        } else {
          monsterInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
       */
      public Builder clearMonsterInfoList() {
        if (monsterInfoListBuilder_ == null) {
          monsterInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          monsterInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
       */
      public Builder removeMonsterInfoList(int index) {
        if (monsterInfoListBuilder_ == null) {
          ensureMonsterInfoListIsMutable();
          monsterInfoList_.remove(index);
          onChanged();
        } else {
          monsterInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
       */
      public io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo.Builder getMonsterInfoListBuilder(
          int index) {
        return getMonsterInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
       */
      public io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfoOrBuilder getMonsterInfoListOrBuilder(
          int index) {
        if (monsterInfoListBuilder_ == null) {
          return monsterInfoList_.get(index);  } else {
          return monsterInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
       */
      public java.util.List<? extends io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfoOrBuilder> 
           getMonsterInfoListOrBuilderList() {
        if (monsterInfoListBuilder_ != null) {
          return monsterInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(monsterInfoList_);
        }
      }
      /**
       * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
       */
      public io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo.Builder addMonsterInfoListBuilder() {
        return getMonsterInfoListFieldBuilder().addBuilder(
            io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
       */
      public io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo.Builder addMonsterInfoListBuilder(
          int index) {
        return getMonsterInfoListFieldBuilder().addBuilder(
            index, io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .ChessMonsterInfo monster_info_list = 14;</code>
       */
      public java.util.List<io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo.Builder> 
           getMonsterInfoListBuilderList() {
        return getMonsterInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo, io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo.Builder, io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfoOrBuilder> 
          getMonsterInfoListFieldBuilder() {
        if (monsterInfoListBuilder_ == null) {
          monsterInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo, io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfo.Builder, io.grasscutter.proto.ChessMonsterInfoOuterClass.ChessMonsterInfoOrBuilder>(
                  monsterInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          monsterInfoList_ = null;
        }
        return monsterInfoListBuilder_;
      }

      private int entranceIndex_ ;
      /**
       * <code>uint32 entrance_index = 15;</code>
       * @return The entranceIndex.
       */
      @java.lang.Override
      public int getEntranceIndex() {
        return entranceIndex_;
      }
      /**
       * <code>uint32 entrance_index = 15;</code>
       * @param value The entranceIndex to set.
       * @return This builder for chaining.
       */
      public Builder setEntranceIndex(int value) {
        
        entranceIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entrance_index = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntranceIndex() {
        
        entranceIndex_ = 0;
        onChanged();
        return this;
      }

      private int entrancePointId_ ;
      /**
       * <code>uint32 entrance_point_id = 8;</code>
       * @return The entrancePointId.
       */
      @java.lang.Override
      public int getEntrancePointId() {
        return entrancePointId_;
      }
      /**
       * <code>uint32 entrance_point_id = 8;</code>
       * @param value The entrancePointId to set.
       * @return This builder for chaining.
       */
      public Builder setEntrancePointId(int value) {
        
        entrancePointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entrance_point_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntrancePointId() {
        
        entrancePointId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChessEntranceInfo)
    }

    // @@protoc_insertion_point(class_scope:ChessEntranceInfo)
    private static final io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo();
    }

    public static io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChessEntranceInfo>
        PARSER = new com.google.protobuf.AbstractParser<ChessEntranceInfo>() {
      @java.lang.Override
      public ChessEntranceInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChessEntranceInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChessEntranceInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChessEntranceInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.ChessEntranceInfoOuterClass.ChessEntranceInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChessEntranceInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChessEntranceInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ChessEntranceInfo.proto\032\026ChessMonsterI" +
      "nfo.proto\"t\n\021ChessEntranceInfo\022,\n\021monste" +
      "r_info_list\030\016 \003(\0132\021.ChessMonsterInfo\022\026\n\016" +
      "entrance_index\030\017 \001(\r\022\031\n\021entrance_point_i" +
      "d\030\010 \001(\rB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.ChessMonsterInfoOuterClass.getDescriptor(),
        });
    internal_static_ChessEntranceInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChessEntranceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChessEntranceInfo_descriptor,
        new java.lang.String[] { "MonsterInfoList", "EntranceIndex", "EntrancePointId", });
    io.grasscutter.proto.ChessMonsterInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
