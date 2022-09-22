// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientGadgetInfo.proto

package io.grasscutter.proto;

public final class ClientGadgetInfoOuterClass {
  private ClientGadgetInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ClientGadgetInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ClientGadgetInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 camp_id = 1;</code>
     * @return The campId.
     */
    int getCampId();

    /**
     * <code>uint32 camp_type = 2;</code>
     * @return The campType.
     */
    int getCampType();

    /**
     * <code>uint64 guid = 3;</code>
     * @return The guid.
     */
    long getGuid();

    /**
     * <code>uint32 owner_entity_id = 4;</code>
     * @return The ownerEntityId.
     */
    int getOwnerEntityId();

    /**
     * <code>uint32 target_entity_id = 5;</code>
     * @return The targetEntityId.
     */
    int getTargetEntityId();

    /**
     * <code>bool async_load = 6;</code>
     * @return The asyncLoad.
     */
    boolean getAsyncLoad();

    /**
     * <code>bool Unk2700_JBOPENAGGAF = 7;</code>
     * @return The unk2700JBOPENAGGAF.
     */
    boolean getUnk2700JBOPENAGGAF();

    /**
     * <code>repeated uint32 Unk2700_BELOIHEIEAN = 8;</code>
     * @return A list containing the unk2700BELOIHEIEAN.
     */
    java.util.List<java.lang.Integer> getUnk2700BELOIHEIEANList();
    /**
     * <code>repeated uint32 Unk2700_BELOIHEIEAN = 8;</code>
     * @return The count of unk2700BELOIHEIEAN.
     */
    int getUnk2700BELOIHEIEANCount();
    /**
     * <code>repeated uint32 Unk2700_BELOIHEIEAN = 8;</code>
     * @param index The index of the element to return.
     * @return The unk2700BELOIHEIEAN at the given index.
     */
    int getUnk2700BELOIHEIEAN(int index);
  }
  /**
   * Protobuf type {@code ClientGadgetInfo}
   */
  public static final class ClientGadgetInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ClientGadgetInfo)
      ClientGadgetInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ClientGadgetInfo.newBuilder() to construct.
    private ClientGadgetInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ClientGadgetInfo() {
      unk2700BELOIHEIEAN_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ClientGadgetInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ClientGadgetInfo(
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
            case 8: {

              campId_ = input.readUInt32();
              break;
            }
            case 16: {

              campType_ = input.readUInt32();
              break;
            }
            case 24: {

              guid_ = input.readUInt64();
              break;
            }
            case 32: {

              ownerEntityId_ = input.readUInt32();
              break;
            }
            case 40: {

              targetEntityId_ = input.readUInt32();
              break;
            }
            case 48: {

              asyncLoad_ = input.readBool();
              break;
            }
            case 56: {

              unk2700JBOPENAGGAF_ = input.readBool();
              break;
            }
            case 64: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700BELOIHEIEAN_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              unk2700BELOIHEIEAN_.addInt(input.readUInt32());
              break;
            }
            case 66: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                unk2700BELOIHEIEAN_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                unk2700BELOIHEIEAN_.addInt(input.readUInt32());
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
          unk2700BELOIHEIEAN_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.ClientGadgetInfoOuterClass.internal_static_ClientGadgetInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.ClientGadgetInfoOuterClass.internal_static_ClientGadgetInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo.class, io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo.Builder.class);
    }

    public static final int CAMP_ID_FIELD_NUMBER = 1;
    private int campId_;
    /**
     * <code>uint32 camp_id = 1;</code>
     * @return The campId.
     */
    @java.lang.Override
    public int getCampId() {
      return campId_;
    }

    public static final int CAMP_TYPE_FIELD_NUMBER = 2;
    private int campType_;
    /**
     * <code>uint32 camp_type = 2;</code>
     * @return The campType.
     */
    @java.lang.Override
    public int getCampType() {
      return campType_;
    }

    public static final int GUID_FIELD_NUMBER = 3;
    private long guid_;
    /**
     * <code>uint64 guid = 3;</code>
     * @return The guid.
     */
    @java.lang.Override
    public long getGuid() {
      return guid_;
    }

    public static final int OWNER_ENTITY_ID_FIELD_NUMBER = 4;
    private int ownerEntityId_;
    /**
     * <code>uint32 owner_entity_id = 4;</code>
     * @return The ownerEntityId.
     */
    @java.lang.Override
    public int getOwnerEntityId() {
      return ownerEntityId_;
    }

    public static final int TARGET_ENTITY_ID_FIELD_NUMBER = 5;
    private int targetEntityId_;
    /**
     * <code>uint32 target_entity_id = 5;</code>
     * @return The targetEntityId.
     */
    @java.lang.Override
    public int getTargetEntityId() {
      return targetEntityId_;
    }

    public static final int ASYNC_LOAD_FIELD_NUMBER = 6;
    private boolean asyncLoad_;
    /**
     * <code>bool async_load = 6;</code>
     * @return The asyncLoad.
     */
    @java.lang.Override
    public boolean getAsyncLoad() {
      return asyncLoad_;
    }

    public static final int UNK2700_JBOPENAGGAF_FIELD_NUMBER = 7;
    private boolean unk2700JBOPENAGGAF_;
    /**
     * <code>bool Unk2700_JBOPENAGGAF = 7;</code>
     * @return The unk2700JBOPENAGGAF.
     */
    @java.lang.Override
    public boolean getUnk2700JBOPENAGGAF() {
      return unk2700JBOPENAGGAF_;
    }

    public static final int UNK2700_BELOIHEIEAN_FIELD_NUMBER = 8;
    private com.google.protobuf.Internal.IntList unk2700BELOIHEIEAN_;
    /**
     * <code>repeated uint32 Unk2700_BELOIHEIEAN = 8;</code>
     * @return A list containing the unk2700BELOIHEIEAN.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk2700BELOIHEIEANList() {
      return unk2700BELOIHEIEAN_;
    }
    /**
     * <code>repeated uint32 Unk2700_BELOIHEIEAN = 8;</code>
     * @return The count of unk2700BELOIHEIEAN.
     */
    public int getUnk2700BELOIHEIEANCount() {
      return unk2700BELOIHEIEAN_.size();
    }
    /**
     * <code>repeated uint32 Unk2700_BELOIHEIEAN = 8;</code>
     * @param index The index of the element to return.
     * @return The unk2700BELOIHEIEAN at the given index.
     */
    public int getUnk2700BELOIHEIEAN(int index) {
      return unk2700BELOIHEIEAN_.getInt(index);
    }
    private int unk2700BELOIHEIEANMemoizedSerializedSize = -1;

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
      if (campId_ != 0) {
        output.writeUInt32(1, campId_);
      }
      if (campType_ != 0) {
        output.writeUInt32(2, campType_);
      }
      if (guid_ != 0L) {
        output.writeUInt64(3, guid_);
      }
      if (ownerEntityId_ != 0) {
        output.writeUInt32(4, ownerEntityId_);
      }
      if (targetEntityId_ != 0) {
        output.writeUInt32(5, targetEntityId_);
      }
      if (asyncLoad_ != false) {
        output.writeBool(6, asyncLoad_);
      }
      if (unk2700JBOPENAGGAF_ != false) {
        output.writeBool(7, unk2700JBOPENAGGAF_);
      }
      if (getUnk2700BELOIHEIEANList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(unk2700BELOIHEIEANMemoizedSerializedSize);
      }
      for (int i = 0; i < unk2700BELOIHEIEAN_.size(); i++) {
        output.writeUInt32NoTag(unk2700BELOIHEIEAN_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (campId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, campId_);
      }
      if (campType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, campType_);
      }
      if (guid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, guid_);
      }
      if (ownerEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, ownerEntityId_);
      }
      if (targetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, targetEntityId_);
      }
      if (asyncLoad_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, asyncLoad_);
      }
      if (unk2700JBOPENAGGAF_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, unk2700JBOPENAGGAF_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < unk2700BELOIHEIEAN_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk2700BELOIHEIEAN_.getInt(i));
        }
        size += dataSize;
        if (!getUnk2700BELOIHEIEANList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk2700BELOIHEIEANMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo other = (io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo) obj;

      if (getCampId()
          != other.getCampId()) return false;
      if (getCampType()
          != other.getCampType()) return false;
      if (getGuid()
          != other.getGuid()) return false;
      if (getOwnerEntityId()
          != other.getOwnerEntityId()) return false;
      if (getTargetEntityId()
          != other.getTargetEntityId()) return false;
      if (getAsyncLoad()
          != other.getAsyncLoad()) return false;
      if (getUnk2700JBOPENAGGAF()
          != other.getUnk2700JBOPENAGGAF()) return false;
      if (!getUnk2700BELOIHEIEANList()
          .equals(other.getUnk2700BELOIHEIEANList())) return false;
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
      hash = (37 * hash) + CAMP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCampId();
      hash = (37 * hash) + CAMP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getCampType();
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getGuid());
      hash = (37 * hash) + OWNER_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getOwnerEntityId();
      hash = (37 * hash) + TARGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetEntityId();
      hash = (37 * hash) + ASYNC_LOAD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getAsyncLoad());
      hash = (37 * hash) + UNK2700_JBOPENAGGAF_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk2700JBOPENAGGAF());
      if (getUnk2700BELOIHEIEANCount() > 0) {
        hash = (37 * hash) + UNK2700_BELOIHEIEAN_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700BELOIHEIEANList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo prototype) {
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
     * Protobuf type {@code ClientGadgetInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ClientGadgetInfo)
        io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.ClientGadgetInfoOuterClass.internal_static_ClientGadgetInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.ClientGadgetInfoOuterClass.internal_static_ClientGadgetInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo.class, io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo.Builder.class);
      }

      // Construct using io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo.newBuilder()
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
        campId_ = 0;

        campType_ = 0;

        guid_ = 0L;

        ownerEntityId_ = 0;

        targetEntityId_ = 0;

        asyncLoad_ = false;

        unk2700JBOPENAGGAF_ = false;

        unk2700BELOIHEIEAN_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.ClientGadgetInfoOuterClass.internal_static_ClientGadgetInfo_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo getDefaultInstanceForType() {
        return io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo build() {
        io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo buildPartial() {
        io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo result = new io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo(this);
        int from_bitField0_ = bitField0_;
        result.campId_ = campId_;
        result.campType_ = campType_;
        result.guid_ = guid_;
        result.ownerEntityId_ = ownerEntityId_;
        result.targetEntityId_ = targetEntityId_;
        result.asyncLoad_ = asyncLoad_;
        result.unk2700JBOPENAGGAF_ = unk2700JBOPENAGGAF_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk2700BELOIHEIEAN_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk2700BELOIHEIEAN_ = unk2700BELOIHEIEAN_;
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
        if (other instanceof io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo) {
          return mergeFrom((io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo other) {
        if (other == io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo.getDefaultInstance()) return this;
        if (other.getCampId() != 0) {
          setCampId(other.getCampId());
        }
        if (other.getCampType() != 0) {
          setCampType(other.getCampType());
        }
        if (other.getGuid() != 0L) {
          setGuid(other.getGuid());
        }
        if (other.getOwnerEntityId() != 0) {
          setOwnerEntityId(other.getOwnerEntityId());
        }
        if (other.getTargetEntityId() != 0) {
          setTargetEntityId(other.getTargetEntityId());
        }
        if (other.getAsyncLoad() != false) {
          setAsyncLoad(other.getAsyncLoad());
        }
        if (other.getUnk2700JBOPENAGGAF() != false) {
          setUnk2700JBOPENAGGAF(other.getUnk2700JBOPENAGGAF());
        }
        if (!other.unk2700BELOIHEIEAN_.isEmpty()) {
          if (unk2700BELOIHEIEAN_.isEmpty()) {
            unk2700BELOIHEIEAN_ = other.unk2700BELOIHEIEAN_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk2700BELOIHEIEANIsMutable();
            unk2700BELOIHEIEAN_.addAll(other.unk2700BELOIHEIEAN_);
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
        io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int campId_ ;
      /**
       * <code>uint32 camp_id = 1;</code>
       * @return The campId.
       */
      @java.lang.Override
      public int getCampId() {
        return campId_;
      }
      /**
       * <code>uint32 camp_id = 1;</code>
       * @param value The campId to set.
       * @return This builder for chaining.
       */
      public Builder setCampId(int value) {
        
        campId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 camp_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCampId() {
        
        campId_ = 0;
        onChanged();
        return this;
      }

      private int campType_ ;
      /**
       * <code>uint32 camp_type = 2;</code>
       * @return The campType.
       */
      @java.lang.Override
      public int getCampType() {
        return campType_;
      }
      /**
       * <code>uint32 camp_type = 2;</code>
       * @param value The campType to set.
       * @return This builder for chaining.
       */
      public Builder setCampType(int value) {
        
        campType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 camp_type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCampType() {
        
        campType_ = 0;
        onChanged();
        return this;
      }

      private long guid_ ;
      /**
       * <code>uint64 guid = 3;</code>
       * @return The guid.
       */
      @java.lang.Override
      public long getGuid() {
        return guid_;
      }
      /**
       * <code>uint64 guid = 3;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(long value) {
        
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 guid = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        
        guid_ = 0L;
        onChanged();
        return this;
      }

      private int ownerEntityId_ ;
      /**
       * <code>uint32 owner_entity_id = 4;</code>
       * @return The ownerEntityId.
       */
      @java.lang.Override
      public int getOwnerEntityId() {
        return ownerEntityId_;
      }
      /**
       * <code>uint32 owner_entity_id = 4;</code>
       * @param value The ownerEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setOwnerEntityId(int value) {
        
        ownerEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 owner_entity_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearOwnerEntityId() {
        
        ownerEntityId_ = 0;
        onChanged();
        return this;
      }

      private int targetEntityId_ ;
      /**
       * <code>uint32 target_entity_id = 5;</code>
       * @return The targetEntityId.
       */
      @java.lang.Override
      public int getTargetEntityId() {
        return targetEntityId_;
      }
      /**
       * <code>uint32 target_entity_id = 5;</code>
       * @param value The targetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetEntityId(int value) {
        
        targetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_entity_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetEntityId() {
        
        targetEntityId_ = 0;
        onChanged();
        return this;
      }

      private boolean asyncLoad_ ;
      /**
       * <code>bool async_load = 6;</code>
       * @return The asyncLoad.
       */
      @java.lang.Override
      public boolean getAsyncLoad() {
        return asyncLoad_;
      }
      /**
       * <code>bool async_load = 6;</code>
       * @param value The asyncLoad to set.
       * @return This builder for chaining.
       */
      public Builder setAsyncLoad(boolean value) {
        
        asyncLoad_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool async_load = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearAsyncLoad() {
        
        asyncLoad_ = false;
        onChanged();
        return this;
      }

      private boolean unk2700JBOPENAGGAF_ ;
      /**
       * <code>bool Unk2700_JBOPENAGGAF = 7;</code>
       * @return The unk2700JBOPENAGGAF.
       */
      @java.lang.Override
      public boolean getUnk2700JBOPENAGGAF() {
        return unk2700JBOPENAGGAF_;
      }
      /**
       * <code>bool Unk2700_JBOPENAGGAF = 7;</code>
       * @param value The unk2700JBOPENAGGAF to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700JBOPENAGGAF(boolean value) {
        
        unk2700JBOPENAGGAF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk2700_JBOPENAGGAF = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700JBOPENAGGAF() {
        
        unk2700JBOPENAGGAF_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList unk2700BELOIHEIEAN_ = emptyIntList();
      private void ensureUnk2700BELOIHEIEANIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk2700BELOIHEIEAN_ = mutableCopy(unk2700BELOIHEIEAN_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk2700_BELOIHEIEAN = 8;</code>
       * @return A list containing the unk2700BELOIHEIEAN.
       */
      public java.util.List<java.lang.Integer>
          getUnk2700BELOIHEIEANList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk2700BELOIHEIEAN_) : unk2700BELOIHEIEAN_;
      }
      /**
       * <code>repeated uint32 Unk2700_BELOIHEIEAN = 8;</code>
       * @return The count of unk2700BELOIHEIEAN.
       */
      public int getUnk2700BELOIHEIEANCount() {
        return unk2700BELOIHEIEAN_.size();
      }
      /**
       * <code>repeated uint32 Unk2700_BELOIHEIEAN = 8;</code>
       * @param index The index of the element to return.
       * @return The unk2700BELOIHEIEAN at the given index.
       */
      public int getUnk2700BELOIHEIEAN(int index) {
        return unk2700BELOIHEIEAN_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk2700_BELOIHEIEAN = 8;</code>
       * @param index The index to set the value at.
       * @param value The unk2700BELOIHEIEAN to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700BELOIHEIEAN(
          int index, int value) {
        ensureUnk2700BELOIHEIEANIsMutable();
        unk2700BELOIHEIEAN_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2700_BELOIHEIEAN = 8;</code>
       * @param value The unk2700BELOIHEIEAN to add.
       * @return This builder for chaining.
       */
      public Builder addUnk2700BELOIHEIEAN(int value) {
        ensureUnk2700BELOIHEIEANIsMutable();
        unk2700BELOIHEIEAN_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2700_BELOIHEIEAN = 8;</code>
       * @param values The unk2700BELOIHEIEAN to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk2700BELOIHEIEAN(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk2700BELOIHEIEANIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk2700BELOIHEIEAN_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2700_BELOIHEIEAN = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700BELOIHEIEAN() {
        unk2700BELOIHEIEAN_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:ClientGadgetInfo)
    }

    // @@protoc_insertion_point(class_scope:ClientGadgetInfo)
    private static final io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo();
    }

    public static io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ClientGadgetInfo>
        PARSER = new com.google.protobuf.AbstractParser<ClientGadgetInfo>() {
      @java.lang.Override
      public ClientGadgetInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClientGadgetInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ClientGadgetInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClientGadgetInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientGadgetInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientGadgetInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026ClientGadgetInfo.proto\"\305\001\n\020ClientGadge" +
      "tInfo\022\017\n\007camp_id\030\001 \001(\r\022\021\n\tcamp_type\030\002 \001(" +
      "\r\022\014\n\004guid\030\003 \001(\004\022\027\n\017owner_entity_id\030\004 \001(\r" +
      "\022\030\n\020target_entity_id\030\005 \001(\r\022\022\n\nasync_load" +
      "\030\006 \001(\010\022\033\n\023Unk2700_JBOPENAGGAF\030\007 \001(\010\022\033\n\023U" +
      "nk2700_BELOIHEIEAN\030\010 \003(\rB\026\n\024io.grasscutt" +
      "er.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ClientGadgetInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClientGadgetInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientGadgetInfo_descriptor,
        new java.lang.String[] { "CampId", "CampType", "Guid", "OwnerEntityId", "TargetEntityId", "AsyncLoad", "Unk2700JBOPENAGGAF", "Unk2700BELOIHEIEAN", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
