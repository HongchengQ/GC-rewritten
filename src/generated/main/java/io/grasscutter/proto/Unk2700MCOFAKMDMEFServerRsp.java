// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_MCOFAKMDMEF_ServerRsp.proto

package io.grasscutter.proto;

public final class Unk2700MCOFAKMDMEFServerRsp {
  private Unk2700MCOFAKMDMEFServerRsp() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_MCOFAKMDMEF_ServerRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_MCOFAKMDMEF_ServerRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint64 Unk2700_AOOAAECDCOA = 15;</code>
     * @return A list containing the unk2700AOOAAECDCOA.
     */
    java.util.List<java.lang.Long> getUnk2700AOOAAECDCOAList();
    /**
     * <code>repeated uint64 Unk2700_AOOAAECDCOA = 15;</code>
     * @return The count of unk2700AOOAAECDCOA.
     */
    int getUnk2700AOOAAECDCOACount();
    /**
     * <code>repeated uint64 Unk2700_AOOAAECDCOA = 15;</code>
     * @param index The index of the element to return.
     * @return The unk2700AOOAAECDCOA at the given index.
     */
    long getUnk2700AOOAAECDCOA(int index);

    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.Unk2700_OPEBMJPOOBL Unk2700_KHBDAPGDOJA = 12;</code>
     * @return The enum numeric value on the wire for unk2700KHBDAPGDOJA.
     */
    int getUnk2700KHBDAPGDOJAValue();
    /**
     * <code>.Unk2700_OPEBMJPOOBL Unk2700_KHBDAPGDOJA = 12;</code>
     * @return The unk2700KHBDAPGDOJA.
     */
    io.grasscutter.proto.Unk2700OPEBMJPOOBL.Unk2700_OPEBMJPOOBL getUnk2700KHBDAPGDOJA();
  }
  /**
   * <pre>
   * CmdId: 6345
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_MCOFAKMDMEF_ServerRsp}
   */
  public static final class Unk2700_MCOFAKMDMEF_ServerRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_MCOFAKMDMEF_ServerRsp)
      Unk2700_MCOFAKMDMEF_ServerRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_MCOFAKMDMEF_ServerRsp.newBuilder() to construct.
    private Unk2700_MCOFAKMDMEF_ServerRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_MCOFAKMDMEF_ServerRsp() {
      unk2700AOOAAECDCOA_ = emptyLongList();
      unk2700KHBDAPGDOJA_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_MCOFAKMDMEF_ServerRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_MCOFAKMDMEF_ServerRsp(
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

              retcode_ = input.readInt32();
              break;
            }
            case 96: {
              int rawValue = input.readEnum();

              unk2700KHBDAPGDOJA_ = rawValue;
              break;
            }
            case 120: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700AOOAAECDCOA_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              unk2700AOOAAECDCOA_.addLong(input.readUInt64());
              break;
            }
            case 122: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                unk2700AOOAAECDCOA_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                unk2700AOOAAECDCOA_.addLong(input.readUInt64());
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
          unk2700AOOAAECDCOA_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.internal_static_Unk2700_MCOFAKMDMEF_ServerRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.internal_static_Unk2700_MCOFAKMDMEF_ServerRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp.class, io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp.Builder.class);
    }

    public static final int UNK2700_AOOAAECDCOA_FIELD_NUMBER = 15;
    private com.google.protobuf.Internal.LongList unk2700AOOAAECDCOA_;
    /**
     * <code>repeated uint64 Unk2700_AOOAAECDCOA = 15;</code>
     * @return A list containing the unk2700AOOAAECDCOA.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getUnk2700AOOAAECDCOAList() {
      return unk2700AOOAAECDCOA_;
    }
    /**
     * <code>repeated uint64 Unk2700_AOOAAECDCOA = 15;</code>
     * @return The count of unk2700AOOAAECDCOA.
     */
    public int getUnk2700AOOAAECDCOACount() {
      return unk2700AOOAAECDCOA_.size();
    }
    /**
     * <code>repeated uint64 Unk2700_AOOAAECDCOA = 15;</code>
     * @param index The index of the element to return.
     * @return The unk2700AOOAAECDCOA at the given index.
     */
    public long getUnk2700AOOAAECDCOA(int index) {
      return unk2700AOOAAECDCOA_.getLong(index);
    }
    private int unk2700AOOAAECDCOAMemoizedSerializedSize = -1;

    public static final int RETCODE_FIELD_NUMBER = 10;
    private int retcode_;
    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int UNK2700_KHBDAPGDOJA_FIELD_NUMBER = 12;
    private int unk2700KHBDAPGDOJA_;
    /**
     * <code>.Unk2700_OPEBMJPOOBL Unk2700_KHBDAPGDOJA = 12;</code>
     * @return The enum numeric value on the wire for unk2700KHBDAPGDOJA.
     */
    @java.lang.Override public int getUnk2700KHBDAPGDOJAValue() {
      return unk2700KHBDAPGDOJA_;
    }
    /**
     * <code>.Unk2700_OPEBMJPOOBL Unk2700_KHBDAPGDOJA = 12;</code>
     * @return The unk2700KHBDAPGDOJA.
     */
    @java.lang.Override public io.grasscutter.proto.Unk2700OPEBMJPOOBL.Unk2700_OPEBMJPOOBL getUnk2700KHBDAPGDOJA() {
      @SuppressWarnings("deprecation")
      io.grasscutter.proto.Unk2700OPEBMJPOOBL.Unk2700_OPEBMJPOOBL result = io.grasscutter.proto.Unk2700OPEBMJPOOBL.Unk2700_OPEBMJPOOBL.valueOf(unk2700KHBDAPGDOJA_);
      return result == null ? io.grasscutter.proto.Unk2700OPEBMJPOOBL.Unk2700_OPEBMJPOOBL.UNRECOGNIZED : result;
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
      if (retcode_ != 0) {
        output.writeInt32(10, retcode_);
      }
      if (unk2700KHBDAPGDOJA_ != io.grasscutter.proto.Unk2700OPEBMJPOOBL.Unk2700_OPEBMJPOOBL.Unk2700_OPEBMJPOOBL_NONE.getNumber()) {
        output.writeEnum(12, unk2700KHBDAPGDOJA_);
      }
      if (getUnk2700AOOAAECDCOAList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(unk2700AOOAAECDCOAMemoizedSerializedSize);
      }
      for (int i = 0; i < unk2700AOOAAECDCOA_.size(); i++) {
        output.writeUInt64NoTag(unk2700AOOAAECDCOA_.getLong(i));
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
          .computeInt32Size(10, retcode_);
      }
      if (unk2700KHBDAPGDOJA_ != io.grasscutter.proto.Unk2700OPEBMJPOOBL.Unk2700_OPEBMJPOOBL.Unk2700_OPEBMJPOOBL_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(12, unk2700KHBDAPGDOJA_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < unk2700AOOAAECDCOA_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(unk2700AOOAAECDCOA_.getLong(i));
        }
        size += dataSize;
        if (!getUnk2700AOOAAECDCOAList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk2700AOOAAECDCOAMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp other = (io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp) obj;

      if (!getUnk2700AOOAAECDCOAList()
          .equals(other.getUnk2700AOOAAECDCOAList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (unk2700KHBDAPGDOJA_ != other.unk2700KHBDAPGDOJA_) return false;
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
      if (getUnk2700AOOAAECDCOACount() > 0) {
        hash = (37 * hash) + UNK2700_AOOAAECDCOA_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700AOOAAECDCOAList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + UNK2700_KHBDAPGDOJA_FIELD_NUMBER;
      hash = (53 * hash) + unk2700KHBDAPGDOJA_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp prototype) {
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
     * CmdId: 6345
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_MCOFAKMDMEF_ServerRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_MCOFAKMDMEF_ServerRsp)
        io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.internal_static_Unk2700_MCOFAKMDMEF_ServerRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.internal_static_Unk2700_MCOFAKMDMEF_ServerRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp.class, io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp.Builder.class);
      }

      // Construct using io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp.newBuilder()
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
        unk2700AOOAAECDCOA_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;

        unk2700KHBDAPGDOJA_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.internal_static_Unk2700_MCOFAKMDMEF_ServerRsp_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp getDefaultInstanceForType() {
        return io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp build() {
        io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp buildPartial() {
        io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp result = new io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk2700AOOAAECDCOA_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk2700AOOAAECDCOA_ = unk2700AOOAAECDCOA_;
        result.retcode_ = retcode_;
        result.unk2700KHBDAPGDOJA_ = unk2700KHBDAPGDOJA_;
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
        if (other instanceof io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp) {
          return mergeFrom((io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp other) {
        if (other == io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp.getDefaultInstance()) return this;
        if (!other.unk2700AOOAAECDCOA_.isEmpty()) {
          if (unk2700AOOAAECDCOA_.isEmpty()) {
            unk2700AOOAAECDCOA_ = other.unk2700AOOAAECDCOA_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk2700AOOAAECDCOAIsMutable();
            unk2700AOOAAECDCOA_.addAll(other.unk2700AOOAAECDCOA_);
          }
          onChanged();
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.unk2700KHBDAPGDOJA_ != 0) {
          setUnk2700KHBDAPGDOJAValue(other.getUnk2700KHBDAPGDOJAValue());
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
        io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.LongList unk2700AOOAAECDCOA_ = emptyLongList();
      private void ensureUnk2700AOOAAECDCOAIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk2700AOOAAECDCOA_ = mutableCopy(unk2700AOOAAECDCOA_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint64 Unk2700_AOOAAECDCOA = 15;</code>
       * @return A list containing the unk2700AOOAAECDCOA.
       */
      public java.util.List<java.lang.Long>
          getUnk2700AOOAAECDCOAList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk2700AOOAAECDCOA_) : unk2700AOOAAECDCOA_;
      }
      /**
       * <code>repeated uint64 Unk2700_AOOAAECDCOA = 15;</code>
       * @return The count of unk2700AOOAAECDCOA.
       */
      public int getUnk2700AOOAAECDCOACount() {
        return unk2700AOOAAECDCOA_.size();
      }
      /**
       * <code>repeated uint64 Unk2700_AOOAAECDCOA = 15;</code>
       * @param index The index of the element to return.
       * @return The unk2700AOOAAECDCOA at the given index.
       */
      public long getUnk2700AOOAAECDCOA(int index) {
        return unk2700AOOAAECDCOA_.getLong(index);
      }
      /**
       * <code>repeated uint64 Unk2700_AOOAAECDCOA = 15;</code>
       * @param index The index to set the value at.
       * @param value The unk2700AOOAAECDCOA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700AOOAAECDCOA(
          int index, long value) {
        ensureUnk2700AOOAAECDCOAIsMutable();
        unk2700AOOAAECDCOA_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 Unk2700_AOOAAECDCOA = 15;</code>
       * @param value The unk2700AOOAAECDCOA to add.
       * @return This builder for chaining.
       */
      public Builder addUnk2700AOOAAECDCOA(long value) {
        ensureUnk2700AOOAAECDCOAIsMutable();
        unk2700AOOAAECDCOA_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 Unk2700_AOOAAECDCOA = 15;</code>
       * @param values The unk2700AOOAAECDCOA to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk2700AOOAAECDCOA(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureUnk2700AOOAAECDCOAIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk2700AOOAAECDCOA_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 Unk2700_AOOAAECDCOA = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700AOOAAECDCOA() {
        unk2700AOOAAECDCOA_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 10;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int unk2700KHBDAPGDOJA_ = 0;
      /**
       * <code>.Unk2700_OPEBMJPOOBL Unk2700_KHBDAPGDOJA = 12;</code>
       * @return The enum numeric value on the wire for unk2700KHBDAPGDOJA.
       */
      @java.lang.Override public int getUnk2700KHBDAPGDOJAValue() {
        return unk2700KHBDAPGDOJA_;
      }
      /**
       * <code>.Unk2700_OPEBMJPOOBL Unk2700_KHBDAPGDOJA = 12;</code>
       * @param value The enum numeric value on the wire for unk2700KHBDAPGDOJA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700KHBDAPGDOJAValue(int value) {
        
        unk2700KHBDAPGDOJA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2700_OPEBMJPOOBL Unk2700_KHBDAPGDOJA = 12;</code>
       * @return The unk2700KHBDAPGDOJA.
       */
      @java.lang.Override
      public io.grasscutter.proto.Unk2700OPEBMJPOOBL.Unk2700_OPEBMJPOOBL getUnk2700KHBDAPGDOJA() {
        @SuppressWarnings("deprecation")
        io.grasscutter.proto.Unk2700OPEBMJPOOBL.Unk2700_OPEBMJPOOBL result = io.grasscutter.proto.Unk2700OPEBMJPOOBL.Unk2700_OPEBMJPOOBL.valueOf(unk2700KHBDAPGDOJA_);
        return result == null ? io.grasscutter.proto.Unk2700OPEBMJPOOBL.Unk2700_OPEBMJPOOBL.UNRECOGNIZED : result;
      }
      /**
       * <code>.Unk2700_OPEBMJPOOBL Unk2700_KHBDAPGDOJA = 12;</code>
       * @param value The unk2700KHBDAPGDOJA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700KHBDAPGDOJA(io.grasscutter.proto.Unk2700OPEBMJPOOBL.Unk2700_OPEBMJPOOBL value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        unk2700KHBDAPGDOJA_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2700_OPEBMJPOOBL Unk2700_KHBDAPGDOJA = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700KHBDAPGDOJA() {
        
        unk2700KHBDAPGDOJA_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_MCOFAKMDMEF_ServerRsp)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_MCOFAKMDMEF_ServerRsp)
    private static final io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp();
    }

    public static io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_MCOFAKMDMEF_ServerRsp>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_MCOFAKMDMEF_ServerRsp>() {
      @java.lang.Override
      public Unk2700_MCOFAKMDMEF_ServerRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_MCOFAKMDMEF_ServerRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_MCOFAKMDMEF_ServerRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_MCOFAKMDMEF_ServerRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.Unk2700MCOFAKMDMEFServerRsp.Unk2700_MCOFAKMDMEF_ServerRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_MCOFAKMDMEF_ServerRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_MCOFAKMDMEF_ServerRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#Unk2700_MCOFAKMDMEF_ServerRsp.proto\032\031U" +
      "nk2700_OPEBMJPOOBL.proto\"\200\001\n\035Unk2700_MCO" +
      "FAKMDMEF_ServerRsp\022\033\n\023Unk2700_AOOAAECDCO" +
      "A\030\017 \003(\004\022\017\n\007retcode\030\n \001(\005\0221\n\023Unk2700_KHBD" +
      "APGDOJA\030\014 \001(\0162\024.Unk2700_OPEBMJPOOBLB\026\n\024i" +
      "o.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.Unk2700OPEBMJPOOBL.getDescriptor(),
        });
    internal_static_Unk2700_MCOFAKMDMEF_ServerRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_MCOFAKMDMEF_ServerRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_MCOFAKMDMEF_ServerRsp_descriptor,
        new java.lang.String[] { "Unk2700AOOAAECDCOA", "Retcode", "Unk2700KHBDAPGDOJA", });
    io.grasscutter.proto.Unk2700OPEBMJPOOBL.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
