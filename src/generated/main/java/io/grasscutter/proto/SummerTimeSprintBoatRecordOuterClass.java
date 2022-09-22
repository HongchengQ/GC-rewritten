// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SummerTimeSprintBoatRecord.proto

package io.grasscutter.proto;

public final class SummerTimeSprintBoatRecordOuterClass {
  private SummerTimeSprintBoatRecordOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SummerTimeSprintBoatRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SummerTimeSprintBoatRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 best_score = 3;</code>
     * @return The bestScore.
     */
    int getBestScore();

    /**
     * <code>uint32 start_time = 13;</code>
     * @return The startTime.
     */
    int getStartTime();

    /**
     * <code>bool is_touched = 7;</code>
     * @return The isTouched.
     */
    boolean getIsTouched();

    /**
     * <code>repeated uint32 watcher_id_list = 10;</code>
     * @return A list containing the watcherIdList.
     */
    java.util.List<java.lang.Integer> getWatcherIdListList();
    /**
     * <code>repeated uint32 watcher_id_list = 10;</code>
     * @return The count of watcherIdList.
     */
    int getWatcherIdListCount();
    /**
     * <code>repeated uint32 watcher_id_list = 10;</code>
     * @param index The index of the element to return.
     * @return The watcherIdList at the given index.
     */
    int getWatcherIdList(int index);

    /**
     * <code>uint32 group_id = 2;</code>
     * @return The groupId.
     */
    int getGroupId();
  }
  /**
   * Protobuf type {@code SummerTimeSprintBoatRecord}
   */
  public static final class SummerTimeSprintBoatRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SummerTimeSprintBoatRecord)
      SummerTimeSprintBoatRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SummerTimeSprintBoatRecord.newBuilder() to construct.
    private SummerTimeSprintBoatRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SummerTimeSprintBoatRecord() {
      watcherIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SummerTimeSprintBoatRecord();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SummerTimeSprintBoatRecord(
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
            case 16: {

              groupId_ = input.readUInt32();
              break;
            }
            case 24: {

              bestScore_ = input.readUInt32();
              break;
            }
            case 56: {

              isTouched_ = input.readBool();
              break;
            }
            case 80: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                watcherIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              watcherIdList_.addInt(input.readUInt32());
              break;
            }
            case 82: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                watcherIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                watcherIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 104: {

              startTime_ = input.readUInt32();
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
          watcherIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.internal_static_SummerTimeSprintBoatRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.internal_static_SummerTimeSprintBoatRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord.class, io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord.Builder.class);
    }

    public static final int BEST_SCORE_FIELD_NUMBER = 3;
    private int bestScore_;
    /**
     * <code>uint32 best_score = 3;</code>
     * @return The bestScore.
     */
    @java.lang.Override
    public int getBestScore() {
      return bestScore_;
    }

    public static final int START_TIME_FIELD_NUMBER = 13;
    private int startTime_;
    /**
     * <code>uint32 start_time = 13;</code>
     * @return The startTime.
     */
    @java.lang.Override
    public int getStartTime() {
      return startTime_;
    }

    public static final int IS_TOUCHED_FIELD_NUMBER = 7;
    private boolean isTouched_;
    /**
     * <code>bool is_touched = 7;</code>
     * @return The isTouched.
     */
    @java.lang.Override
    public boolean getIsTouched() {
      return isTouched_;
    }

    public static final int WATCHER_ID_LIST_FIELD_NUMBER = 10;
    private com.google.protobuf.Internal.IntList watcherIdList_;
    /**
     * <code>repeated uint32 watcher_id_list = 10;</code>
     * @return A list containing the watcherIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getWatcherIdListList() {
      return watcherIdList_;
    }
    /**
     * <code>repeated uint32 watcher_id_list = 10;</code>
     * @return The count of watcherIdList.
     */
    public int getWatcherIdListCount() {
      return watcherIdList_.size();
    }
    /**
     * <code>repeated uint32 watcher_id_list = 10;</code>
     * @param index The index of the element to return.
     * @return The watcherIdList at the given index.
     */
    public int getWatcherIdList(int index) {
      return watcherIdList_.getInt(index);
    }
    private int watcherIdListMemoizedSerializedSize = -1;

    public static final int GROUP_ID_FIELD_NUMBER = 2;
    private int groupId_;
    /**
     * <code>uint32 group_id = 2;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
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
      if (groupId_ != 0) {
        output.writeUInt32(2, groupId_);
      }
      if (bestScore_ != 0) {
        output.writeUInt32(3, bestScore_);
      }
      if (isTouched_ != false) {
        output.writeBool(7, isTouched_);
      }
      if (getWatcherIdListList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(watcherIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < watcherIdList_.size(); i++) {
        output.writeUInt32NoTag(watcherIdList_.getInt(i));
      }
      if (startTime_ != 0) {
        output.writeUInt32(13, startTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, groupId_);
      }
      if (bestScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, bestScore_);
      }
      if (isTouched_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isTouched_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < watcherIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(watcherIdList_.getInt(i));
        }
        size += dataSize;
        if (!getWatcherIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        watcherIdListMemoizedSerializedSize = dataSize;
      }
      if (startTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, startTime_);
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
      if (!(obj instanceof io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord other = (io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord) obj;

      if (getBestScore()
          != other.getBestScore()) return false;
      if (getStartTime()
          != other.getStartTime()) return false;
      if (getIsTouched()
          != other.getIsTouched()) return false;
      if (!getWatcherIdListList()
          .equals(other.getWatcherIdListList())) return false;
      if (getGroupId()
          != other.getGroupId()) return false;
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
      hash = (37 * hash) + BEST_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getBestScore();
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime();
      hash = (37 * hash) + IS_TOUCHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTouched());
      if (getWatcherIdListCount() > 0) {
        hash = (37 * hash) + WATCHER_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getWatcherIdListList().hashCode();
      }
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord prototype) {
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
     * Protobuf type {@code SummerTimeSprintBoatRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SummerTimeSprintBoatRecord)
        io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.internal_static_SummerTimeSprintBoatRecord_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.internal_static_SummerTimeSprintBoatRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord.class, io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord.Builder.class);
      }

      // Construct using io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord.newBuilder()
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
        bestScore_ = 0;

        startTime_ = 0;

        isTouched_ = false;

        watcherIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        groupId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.internal_static_SummerTimeSprintBoatRecord_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord getDefaultInstanceForType() {
        return io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord build() {
        io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord buildPartial() {
        io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord result = new io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord(this);
        int from_bitField0_ = bitField0_;
        result.bestScore_ = bestScore_;
        result.startTime_ = startTime_;
        result.isTouched_ = isTouched_;
        if (((bitField0_ & 0x00000001) != 0)) {
          watcherIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.watcherIdList_ = watcherIdList_;
        result.groupId_ = groupId_;
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
        if (other instanceof io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord) {
          return mergeFrom((io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord other) {
        if (other == io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord.getDefaultInstance()) return this;
        if (other.getBestScore() != 0) {
          setBestScore(other.getBestScore());
        }
        if (other.getStartTime() != 0) {
          setStartTime(other.getStartTime());
        }
        if (other.getIsTouched() != false) {
          setIsTouched(other.getIsTouched());
        }
        if (!other.watcherIdList_.isEmpty()) {
          if (watcherIdList_.isEmpty()) {
            watcherIdList_ = other.watcherIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWatcherIdListIsMutable();
            watcherIdList_.addAll(other.watcherIdList_);
          }
          onChanged();
        }
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
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
        io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int bestScore_ ;
      /**
       * <code>uint32 best_score = 3;</code>
       * @return The bestScore.
       */
      @java.lang.Override
      public int getBestScore() {
        return bestScore_;
      }
      /**
       * <code>uint32 best_score = 3;</code>
       * @param value The bestScore to set.
       * @return This builder for chaining.
       */
      public Builder setBestScore(int value) {
        
        bestScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 best_score = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearBestScore() {
        
        bestScore_ = 0;
        onChanged();
        return this;
      }

      private int startTime_ ;
      /**
       * <code>uint32 start_time = 13;</code>
       * @return The startTime.
       */
      @java.lang.Override
      public int getStartTime() {
        return startTime_;
      }
      /**
       * <code>uint32 start_time = 13;</code>
       * @param value The startTime to set.
       * @return This builder for chaining.
       */
      public Builder setStartTime(int value) {
        
        startTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 start_time = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartTime() {
        
        startTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isTouched_ ;
      /**
       * <code>bool is_touched = 7;</code>
       * @return The isTouched.
       */
      @java.lang.Override
      public boolean getIsTouched() {
        return isTouched_;
      }
      /**
       * <code>bool is_touched = 7;</code>
       * @param value The isTouched to set.
       * @return This builder for chaining.
       */
      public Builder setIsTouched(boolean value) {
        
        isTouched_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_touched = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTouched() {
        
        isTouched_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList watcherIdList_ = emptyIntList();
      private void ensureWatcherIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          watcherIdList_ = mutableCopy(watcherIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 watcher_id_list = 10;</code>
       * @return A list containing the watcherIdList.
       */
      public java.util.List<java.lang.Integer>
          getWatcherIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(watcherIdList_) : watcherIdList_;
      }
      /**
       * <code>repeated uint32 watcher_id_list = 10;</code>
       * @return The count of watcherIdList.
       */
      public int getWatcherIdListCount() {
        return watcherIdList_.size();
      }
      /**
       * <code>repeated uint32 watcher_id_list = 10;</code>
       * @param index The index of the element to return.
       * @return The watcherIdList at the given index.
       */
      public int getWatcherIdList(int index) {
        return watcherIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 watcher_id_list = 10;</code>
       * @param index The index to set the value at.
       * @param value The watcherIdList to set.
       * @return This builder for chaining.
       */
      public Builder setWatcherIdList(
          int index, int value) {
        ensureWatcherIdListIsMutable();
        watcherIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 watcher_id_list = 10;</code>
       * @param value The watcherIdList to add.
       * @return This builder for chaining.
       */
      public Builder addWatcherIdList(int value) {
        ensureWatcherIdListIsMutable();
        watcherIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 watcher_id_list = 10;</code>
       * @param values The watcherIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllWatcherIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureWatcherIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, watcherIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 watcher_id_list = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearWatcherIdList() {
        watcherIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 2;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 2;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SummerTimeSprintBoatRecord)
    }

    // @@protoc_insertion_point(class_scope:SummerTimeSprintBoatRecord)
    private static final io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord();
    }

    public static io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SummerTimeSprintBoatRecord>
        PARSER = new com.google.protobuf.AbstractParser<SummerTimeSprintBoatRecord>() {
      @java.lang.Override
      public SummerTimeSprintBoatRecord parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SummerTimeSprintBoatRecord(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SummerTimeSprintBoatRecord> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SummerTimeSprintBoatRecord> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SummerTimeSprintBoatRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SummerTimeSprintBoatRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n SummerTimeSprintBoatRecord.proto\"\203\001\n\032S" +
      "ummerTimeSprintBoatRecord\022\022\n\nbest_score\030" +
      "\003 \001(\r\022\022\n\nstart_time\030\r \001(\r\022\022\n\nis_touched\030" +
      "\007 \001(\010\022\027\n\017watcher_id_list\030\n \003(\r\022\020\n\010group_" +
      "id\030\002 \001(\rB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SummerTimeSprintBoatRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SummerTimeSprintBoatRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SummerTimeSprintBoatRecord_descriptor,
        new java.lang.String[] { "BestScore", "StartTime", "IsTouched", "WatcherIdList", "GroupId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
