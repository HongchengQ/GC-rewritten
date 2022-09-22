// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GadgetInteractRsp.proto

package io.grasscutter.proto;

public final class GadgetInteractRspOuterClass {
  private GadgetInteractRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GadgetInteractRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GadgetInteractRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gadget_entity_id = 10;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();

    /**
     * <code>.InteractType interact_type = 2;</code>
     * @return The enum numeric value on the wire for interactType.
     */
    int getInteractTypeValue();
    /**
     * <code>.InteractType interact_type = 2;</code>
     * @return The interactType.
     */
    io.grasscutter.proto.InteractTypeOuterClass.InteractType getInteractType();

    /**
     * <code>.InterOpType op_type = 3;</code>
     * @return The enum numeric value on the wire for opType.
     */
    int getOpTypeValue();
    /**
     * <code>.InterOpType op_type = 3;</code>
     * @return The opType.
     */
    io.grasscutter.proto.InterOpTypeOuterClass.InterOpType getOpType();

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 gadget_id = 15;</code>
     * @return The gadgetId.
     */
    int getGadgetId();
  }
  /**
   * <pre>
   * CmdId: 898
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code GadgetInteractRsp}
   */
  public static final class GadgetInteractRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GadgetInteractRsp)
      GadgetInteractRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GadgetInteractRsp.newBuilder() to construct.
    private GadgetInteractRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GadgetInteractRsp() {
      interactType_ = 0;
      opType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GadgetInteractRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GadgetInteractRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
              int rawValue = input.readEnum();

              interactType_ = rawValue;
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              opType_ = rawValue;
              break;
            }
            case 56: {

              retcode_ = input.readInt32();
              break;
            }
            case 80: {

              gadgetEntityId_ = input.readUInt32();
              break;
            }
            case 120: {

              gadgetId_ = input.readUInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.GadgetInteractRspOuterClass.internal_static_GadgetInteractRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.GadgetInteractRspOuterClass.internal_static_GadgetInteractRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp.class, io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp.Builder.class);
    }

    public static final int GADGET_ENTITY_ID_FIELD_NUMBER = 10;
    private int gadgetEntityId_;
    /**
     * <code>uint32 gadget_entity_id = 10;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
    }

    public static final int INTERACT_TYPE_FIELD_NUMBER = 2;
    private int interactType_;
    /**
     * <code>.InteractType interact_type = 2;</code>
     * @return The enum numeric value on the wire for interactType.
     */
    @java.lang.Override public int getInteractTypeValue() {
      return interactType_;
    }
    /**
     * <code>.InteractType interact_type = 2;</code>
     * @return The interactType.
     */
    @java.lang.Override public io.grasscutter.proto.InteractTypeOuterClass.InteractType getInteractType() {
      @SuppressWarnings("deprecation")
      io.grasscutter.proto.InteractTypeOuterClass.InteractType result = io.grasscutter.proto.InteractTypeOuterClass.InteractType.valueOf(interactType_);
      return result == null ? io.grasscutter.proto.InteractTypeOuterClass.InteractType.UNRECOGNIZED : result;
    }

    public static final int OP_TYPE_FIELD_NUMBER = 3;
    private int opType_;
    /**
     * <code>.InterOpType op_type = 3;</code>
     * @return The enum numeric value on the wire for opType.
     */
    @java.lang.Override public int getOpTypeValue() {
      return opType_;
    }
    /**
     * <code>.InterOpType op_type = 3;</code>
     * @return The opType.
     */
    @java.lang.Override public io.grasscutter.proto.InterOpTypeOuterClass.InterOpType getOpType() {
      @SuppressWarnings("deprecation")
      io.grasscutter.proto.InterOpTypeOuterClass.InterOpType result = io.grasscutter.proto.InterOpTypeOuterClass.InterOpType.valueOf(opType_);
      return result == null ? io.grasscutter.proto.InterOpTypeOuterClass.InterOpType.UNRECOGNIZED : result;
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_;
    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int GADGET_ID_FIELD_NUMBER = 15;
    private int gadgetId_;
    /**
     * <code>uint32 gadget_id = 15;</code>
     * @return The gadgetId.
     */
    @java.lang.Override
    public int getGadgetId() {
      return gadgetId_;
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
      if (interactType_ != io.grasscutter.proto.InteractTypeOuterClass.InteractType.INTERACT_TYPE_NONE.getNumber()) {
        output.writeEnum(2, interactType_);
      }
      if (opType_ != io.grasscutter.proto.InterOpTypeOuterClass.InterOpType.INTER_OP_TYPE_FINISH.getNumber()) {
        output.writeEnum(3, opType_);
      }
      if (retcode_ != 0) {
        output.writeInt32(7, retcode_);
      }
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(10, gadgetEntityId_);
      }
      if (gadgetId_ != 0) {
        output.writeUInt32(15, gadgetId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (interactType_ != io.grasscutter.proto.InteractTypeOuterClass.InteractType.INTERACT_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, interactType_);
      }
      if (opType_ != io.grasscutter.proto.InterOpTypeOuterClass.InterOpType.INTER_OP_TYPE_FINISH.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, opType_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, retcode_);
      }
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, gadgetEntityId_);
      }
      if (gadgetId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, gadgetId_);
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
      if (!(obj instanceof io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp other = (io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp) obj;

      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
      if (interactType_ != other.interactType_) return false;
      if (opType_ != other.opType_) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getGadgetId()
          != other.getGadgetId()) return false;
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
      hash = (37 * hash) + GADGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      hash = (37 * hash) + INTERACT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + interactType_;
      hash = (37 * hash) + OP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + opType_;
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + GADGET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp prototype) {
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
     * CmdId: 898
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code GadgetInteractRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GadgetInteractRsp)
        io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.GadgetInteractRspOuterClass.internal_static_GadgetInteractRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.GadgetInteractRspOuterClass.internal_static_GadgetInteractRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp.class, io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp.Builder.class);
      }

      // Construct using io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp.newBuilder()
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
        gadgetEntityId_ = 0;

        interactType_ = 0;

        opType_ = 0;

        retcode_ = 0;

        gadgetId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.GadgetInteractRspOuterClass.internal_static_GadgetInteractRsp_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp getDefaultInstanceForType() {
        return io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp build() {
        io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp buildPartial() {
        io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp result = new io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp(this);
        result.gadgetEntityId_ = gadgetEntityId_;
        result.interactType_ = interactType_;
        result.opType_ = opType_;
        result.retcode_ = retcode_;
        result.gadgetId_ = gadgetId_;
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
        if (other instanceof io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp) {
          return mergeFrom((io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp other) {
        if (other == io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp.getDefaultInstance()) return this;
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
        }
        if (other.interactType_ != 0) {
          setInteractTypeValue(other.getInteractTypeValue());
        }
        if (other.opType_ != 0) {
          setOpTypeValue(other.getOpTypeValue());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getGadgetId() != 0) {
          setGadgetId(other.getGadgetId());
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
        io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int gadgetEntityId_ ;
      /**
       * <code>uint32 gadget_entity_id = 10;</code>
       * @return The gadgetEntityId.
       */
      @java.lang.Override
      public int getGadgetEntityId() {
        return gadgetEntityId_;
      }
      /**
       * <code>uint32 gadget_entity_id = 10;</code>
       * @param value The gadgetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityId(int value) {
        
        gadgetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_entity_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityId() {
        
        gadgetEntityId_ = 0;
        onChanged();
        return this;
      }

      private int interactType_ = 0;
      /**
       * <code>.InteractType interact_type = 2;</code>
       * @return The enum numeric value on the wire for interactType.
       */
      @java.lang.Override public int getInteractTypeValue() {
        return interactType_;
      }
      /**
       * <code>.InteractType interact_type = 2;</code>
       * @param value The enum numeric value on the wire for interactType to set.
       * @return This builder for chaining.
       */
      public Builder setInteractTypeValue(int value) {
        
        interactType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.InteractType interact_type = 2;</code>
       * @return The interactType.
       */
      @java.lang.Override
      public io.grasscutter.proto.InteractTypeOuterClass.InteractType getInteractType() {
        @SuppressWarnings("deprecation")
        io.grasscutter.proto.InteractTypeOuterClass.InteractType result = io.grasscutter.proto.InteractTypeOuterClass.InteractType.valueOf(interactType_);
        return result == null ? io.grasscutter.proto.InteractTypeOuterClass.InteractType.UNRECOGNIZED : result;
      }
      /**
       * <code>.InteractType interact_type = 2;</code>
       * @param value The interactType to set.
       * @return This builder for chaining.
       */
      public Builder setInteractType(io.grasscutter.proto.InteractTypeOuterClass.InteractType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        interactType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.InteractType interact_type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearInteractType() {
        
        interactType_ = 0;
        onChanged();
        return this;
      }

      private int opType_ = 0;
      /**
       * <code>.InterOpType op_type = 3;</code>
       * @return The enum numeric value on the wire for opType.
       */
      @java.lang.Override public int getOpTypeValue() {
        return opType_;
      }
      /**
       * <code>.InterOpType op_type = 3;</code>
       * @param value The enum numeric value on the wire for opType to set.
       * @return This builder for chaining.
       */
      public Builder setOpTypeValue(int value) {
        
        opType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.InterOpType op_type = 3;</code>
       * @return The opType.
       */
      @java.lang.Override
      public io.grasscutter.proto.InterOpTypeOuterClass.InterOpType getOpType() {
        @SuppressWarnings("deprecation")
        io.grasscutter.proto.InterOpTypeOuterClass.InterOpType result = io.grasscutter.proto.InterOpTypeOuterClass.InterOpType.valueOf(opType_);
        return result == null ? io.grasscutter.proto.InterOpTypeOuterClass.InterOpType.UNRECOGNIZED : result;
      }
      /**
       * <code>.InterOpType op_type = 3;</code>
       * @param value The opType to set.
       * @return This builder for chaining.
       */
      public Builder setOpType(io.grasscutter.proto.InterOpTypeOuterClass.InterOpType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        opType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.InterOpType op_type = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpType() {
        
        opType_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int gadgetId_ ;
      /**
       * <code>uint32 gadget_id = 15;</code>
       * @return The gadgetId.
       */
      @java.lang.Override
      public int getGadgetId() {
        return gadgetId_;
      }
      /**
       * <code>uint32 gadget_id = 15;</code>
       * @param value The gadgetId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetId(int value) {
        
        gadgetId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetId() {
        
        gadgetId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GadgetInteractRsp)
    }

    // @@protoc_insertion_point(class_scope:GadgetInteractRsp)
    private static final io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp();
    }

    public static io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GadgetInteractRsp>
        PARSER = new com.google.protobuf.AbstractParser<GadgetInteractRsp>() {
      @java.lang.Override
      public GadgetInteractRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GadgetInteractRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GadgetInteractRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GadgetInteractRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.GadgetInteractRspOuterClass.GadgetInteractRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GadgetInteractRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GadgetInteractRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027GadgetInteractRsp.proto\032\021InterOpType.p" +
      "roto\032\022InteractType.proto\"\226\001\n\021GadgetInter" +
      "actRsp\022\030\n\020gadget_entity_id\030\n \001(\r\022$\n\rinte" +
      "ract_type\030\002 \001(\0162\r.InteractType\022\035\n\007op_typ" +
      "e\030\003 \001(\0162\014.InterOpType\022\017\n\007retcode\030\007 \001(\005\022\021" +
      "\n\tgadget_id\030\017 \001(\rB\026\n\024io.grasscutter.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.InterOpTypeOuterClass.getDescriptor(),
          io.grasscutter.proto.InteractTypeOuterClass.getDescriptor(),
        });
    internal_static_GadgetInteractRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GadgetInteractRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GadgetInteractRsp_descriptor,
        new java.lang.String[] { "GadgetEntityId", "InteractType", "OpType", "Retcode", "GadgetId", });
    io.grasscutter.proto.InterOpTypeOuterClass.getDescriptor();
    io.grasscutter.proto.InteractTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
