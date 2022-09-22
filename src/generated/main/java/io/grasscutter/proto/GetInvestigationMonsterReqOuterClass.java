// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetInvestigationMonsterReq.proto

package io.grasscutter.proto;

public final class GetInvestigationMonsterReqOuterClass {
  private GetInvestigationMonsterReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetInvestigationMonsterReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetInvestigationMonsterReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 city_id_list = 3;</code>
     * @return A list containing the cityIdList.
     */
    java.util.List<java.lang.Integer> getCityIdListList();
    /**
     * <code>repeated uint32 city_id_list = 3;</code>
     * @return The count of cityIdList.
     */
    int getCityIdListCount();
    /**
     * <code>repeated uint32 city_id_list = 3;</code>
     * @param index The index of the element to return.
     * @return The cityIdList at the given index.
     */
    int getCityIdList(int index);

    /**
     * <code>bool Unk2700_DEMFDHNFBBJ = 4;</code>
     * @return The unk2700DEMFDHNFBBJ.
     */
    boolean getUnk2700DEMFDHNFBBJ();
  }
  /**
   * <pre>
   * CmdId: 1901
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code GetInvestigationMonsterReq}
   */
  public static final class GetInvestigationMonsterReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetInvestigationMonsterReq)
      GetInvestigationMonsterReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetInvestigationMonsterReq.newBuilder() to construct.
    private GetInvestigationMonsterReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetInvestigationMonsterReq() {
      cityIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetInvestigationMonsterReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetInvestigationMonsterReq(
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
                cityIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              cityIdList_.addInt(input.readUInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                cityIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                cityIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 32: {

              unk2700DEMFDHNFBBJ_ = input.readBool();
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
          cityIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.internal_static_GetInvestigationMonsterReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.internal_static_GetInvestigationMonsterReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq.class, io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq.Builder.class);
    }

    public static final int CITY_ID_LIST_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList cityIdList_;
    /**
     * <code>repeated uint32 city_id_list = 3;</code>
     * @return A list containing the cityIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCityIdListList() {
      return cityIdList_;
    }
    /**
     * <code>repeated uint32 city_id_list = 3;</code>
     * @return The count of cityIdList.
     */
    public int getCityIdListCount() {
      return cityIdList_.size();
    }
    /**
     * <code>repeated uint32 city_id_list = 3;</code>
     * @param index The index of the element to return.
     * @return The cityIdList at the given index.
     */
    public int getCityIdList(int index) {
      return cityIdList_.getInt(index);
    }
    private int cityIdListMemoizedSerializedSize = -1;

    public static final int UNK2700_DEMFDHNFBBJ_FIELD_NUMBER = 4;
    private boolean unk2700DEMFDHNFBBJ_;
    /**
     * <code>bool Unk2700_DEMFDHNFBBJ = 4;</code>
     * @return The unk2700DEMFDHNFBBJ.
     */
    @java.lang.Override
    public boolean getUnk2700DEMFDHNFBBJ() {
      return unk2700DEMFDHNFBBJ_;
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
      if (getCityIdListList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(cityIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < cityIdList_.size(); i++) {
        output.writeUInt32NoTag(cityIdList_.getInt(i));
      }
      if (unk2700DEMFDHNFBBJ_ != false) {
        output.writeBool(4, unk2700DEMFDHNFBBJ_);
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
        for (int i = 0; i < cityIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(cityIdList_.getInt(i));
        }
        size += dataSize;
        if (!getCityIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        cityIdListMemoizedSerializedSize = dataSize;
      }
      if (unk2700DEMFDHNFBBJ_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, unk2700DEMFDHNFBBJ_);
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
      if (!(obj instanceof io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq other = (io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq) obj;

      if (!getCityIdListList()
          .equals(other.getCityIdListList())) return false;
      if (getUnk2700DEMFDHNFBBJ()
          != other.getUnk2700DEMFDHNFBBJ()) return false;
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
      if (getCityIdListCount() > 0) {
        hash = (37 * hash) + CITY_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCityIdListList().hashCode();
      }
      hash = (37 * hash) + UNK2700_DEMFDHNFBBJ_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk2700DEMFDHNFBBJ());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq prototype) {
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
     * CmdId: 1901
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code GetInvestigationMonsterReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetInvestigationMonsterReq)
        io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.internal_static_GetInvestigationMonsterReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.internal_static_GetInvestigationMonsterReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq.class, io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq.Builder.class);
      }

      // Construct using io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq.newBuilder()
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
        cityIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        unk2700DEMFDHNFBBJ_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.internal_static_GetInvestigationMonsterReq_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq getDefaultInstanceForType() {
        return io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq build() {
        io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq buildPartial() {
        io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq result = new io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          cityIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cityIdList_ = cityIdList_;
        result.unk2700DEMFDHNFBBJ_ = unk2700DEMFDHNFBBJ_;
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
        if (other instanceof io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq) {
          return mergeFrom((io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq other) {
        if (other == io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq.getDefaultInstance()) return this;
        if (!other.cityIdList_.isEmpty()) {
          if (cityIdList_.isEmpty()) {
            cityIdList_ = other.cityIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCityIdListIsMutable();
            cityIdList_.addAll(other.cityIdList_);
          }
          onChanged();
        }
        if (other.getUnk2700DEMFDHNFBBJ() != false) {
          setUnk2700DEMFDHNFBBJ(other.getUnk2700DEMFDHNFBBJ());
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
        io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList cityIdList_ = emptyIntList();
      private void ensureCityIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          cityIdList_ = mutableCopy(cityIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 city_id_list = 3;</code>
       * @return A list containing the cityIdList.
       */
      public java.util.List<java.lang.Integer>
          getCityIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(cityIdList_) : cityIdList_;
      }
      /**
       * <code>repeated uint32 city_id_list = 3;</code>
       * @return The count of cityIdList.
       */
      public int getCityIdListCount() {
        return cityIdList_.size();
      }
      /**
       * <code>repeated uint32 city_id_list = 3;</code>
       * @param index The index of the element to return.
       * @return The cityIdList at the given index.
       */
      public int getCityIdList(int index) {
        return cityIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 city_id_list = 3;</code>
       * @param index The index to set the value at.
       * @param value The cityIdList to set.
       * @return This builder for chaining.
       */
      public Builder setCityIdList(
          int index, int value) {
        ensureCityIdListIsMutable();
        cityIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 city_id_list = 3;</code>
       * @param value The cityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addCityIdList(int value) {
        ensureCityIdListIsMutable();
        cityIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 city_id_list = 3;</code>
       * @param values The cityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllCityIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCityIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cityIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 city_id_list = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCityIdList() {
        cityIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private boolean unk2700DEMFDHNFBBJ_ ;
      /**
       * <code>bool Unk2700_DEMFDHNFBBJ = 4;</code>
       * @return The unk2700DEMFDHNFBBJ.
       */
      @java.lang.Override
      public boolean getUnk2700DEMFDHNFBBJ() {
        return unk2700DEMFDHNFBBJ_;
      }
      /**
       * <code>bool Unk2700_DEMFDHNFBBJ = 4;</code>
       * @param value The unk2700DEMFDHNFBBJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700DEMFDHNFBBJ(boolean value) {
        
        unk2700DEMFDHNFBBJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk2700_DEMFDHNFBBJ = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700DEMFDHNFBBJ() {
        
        unk2700DEMFDHNFBBJ_ = false;
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


      // @@protoc_insertion_point(builder_scope:GetInvestigationMonsterReq)
    }

    // @@protoc_insertion_point(class_scope:GetInvestigationMonsterReq)
    private static final io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq();
    }

    public static io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetInvestigationMonsterReq>
        PARSER = new com.google.protobuf.AbstractParser<GetInvestigationMonsterReq>() {
      @java.lang.Override
      public GetInvestigationMonsterReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetInvestigationMonsterReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetInvestigationMonsterReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetInvestigationMonsterReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetInvestigationMonsterReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetInvestigationMonsterReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n GetInvestigationMonsterReq.proto\"O\n\032Ge" +
      "tInvestigationMonsterReq\022\024\n\014city_id_list" +
      "\030\003 \003(\r\022\033\n\023Unk2700_DEMFDHNFBBJ\030\004 \001(\010B\026\n\024i" +
      "o.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetInvestigationMonsterReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetInvestigationMonsterReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetInvestigationMonsterReq_descriptor,
        new java.lang.String[] { "CityIdList", "Unk2700DEMFDHNFBBJ", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
