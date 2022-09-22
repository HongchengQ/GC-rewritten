// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OneofGatherPointDetectorData.proto

package io.grasscutter.proto;

public final class OneofGatherPointDetectorDataOuterClass {
  private OneofGatherPointDetectorDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OneofGatherPointDetectorDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OneofGatherPointDetectorData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector hint_center_pos = 7;</code>
     * @return Whether the hintCenterPos field is set.
     */
    boolean hasHintCenterPos();
    /**
     * <code>.Vector hint_center_pos = 7;</code>
     * @return The hintCenterPos.
     */
    io.grasscutter.proto.VectorOuterClass.Vector getHintCenterPos();
    /**
     * <code>.Vector hint_center_pos = 7;</code>
     */
    io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getHintCenterPosOrBuilder();

    /**
     * <code>uint32 hint_radius = 14;</code>
     * @return The hintRadius.
     */
    int getHintRadius();

    /**
     * <code>uint32 material_id = 10;</code>
     * @return The materialId.
     */
    int getMaterialId();

    /**
     * <code>uint32 config_id = 6;</code>
     * @return The configId.
     */
    int getConfigId();

    /**
     * <code>uint32 group_id = 13;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>bool is_all_collected = 4;</code>
     * @return The isAllCollected.
     */
    boolean getIsAllCollected();

    /**
     * <code>bool is_hint_valid = 15;</code>
     * @return The isHintValid.
     */
    boolean getIsHintValid();
  }
  /**
   * Protobuf type {@code OneofGatherPointDetectorData}
   */
  public static final class OneofGatherPointDetectorData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OneofGatherPointDetectorData)
      OneofGatherPointDetectorDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OneofGatherPointDetectorData.newBuilder() to construct.
    private OneofGatherPointDetectorData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OneofGatherPointDetectorData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OneofGatherPointDetectorData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OneofGatherPointDetectorData(
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
            case 32: {

              isAllCollected_ = input.readBool();
              break;
            }
            case 48: {

              configId_ = input.readUInt32();
              break;
            }
            case 58: {
              io.grasscutter.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (hintCenterPos_ != null) {
                subBuilder = hintCenterPos_.toBuilder();
              }
              hintCenterPos_ = input.readMessage(io.grasscutter.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(hintCenterPos_);
                hintCenterPos_ = subBuilder.buildPartial();
              }

              break;
            }
            case 80: {

              materialId_ = input.readUInt32();
              break;
            }
            case 104: {

              groupId_ = input.readUInt32();
              break;
            }
            case 112: {

              hintRadius_ = input.readUInt32();
              break;
            }
            case 120: {

              isHintValid_ = input.readBool();
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
      return io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.internal_static_OneofGatherPointDetectorData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.internal_static_OneofGatherPointDetectorData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.class, io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder.class);
    }

    public static final int HINT_CENTER_POS_FIELD_NUMBER = 7;
    private io.grasscutter.proto.VectorOuterClass.Vector hintCenterPos_;
    /**
     * <code>.Vector hint_center_pos = 7;</code>
     * @return Whether the hintCenterPos field is set.
     */
    @java.lang.Override
    public boolean hasHintCenterPos() {
      return hintCenterPos_ != null;
    }
    /**
     * <code>.Vector hint_center_pos = 7;</code>
     * @return The hintCenterPos.
     */
    @java.lang.Override
    public io.grasscutter.proto.VectorOuterClass.Vector getHintCenterPos() {
      return hintCenterPos_ == null ? io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : hintCenterPos_;
    }
    /**
     * <code>.Vector hint_center_pos = 7;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getHintCenterPosOrBuilder() {
      return getHintCenterPos();
    }

    public static final int HINT_RADIUS_FIELD_NUMBER = 14;
    private int hintRadius_;
    /**
     * <code>uint32 hint_radius = 14;</code>
     * @return The hintRadius.
     */
    @java.lang.Override
    public int getHintRadius() {
      return hintRadius_;
    }

    public static final int MATERIAL_ID_FIELD_NUMBER = 10;
    private int materialId_;
    /**
     * <code>uint32 material_id = 10;</code>
     * @return The materialId.
     */
    @java.lang.Override
    public int getMaterialId() {
      return materialId_;
    }

    public static final int CONFIG_ID_FIELD_NUMBER = 6;
    private int configId_;
    /**
     * <code>uint32 config_id = 6;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
    }

    public static final int GROUP_ID_FIELD_NUMBER = 13;
    private int groupId_;
    /**
     * <code>uint32 group_id = 13;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int IS_ALL_COLLECTED_FIELD_NUMBER = 4;
    private boolean isAllCollected_;
    /**
     * <code>bool is_all_collected = 4;</code>
     * @return The isAllCollected.
     */
    @java.lang.Override
    public boolean getIsAllCollected() {
      return isAllCollected_;
    }

    public static final int IS_HINT_VALID_FIELD_NUMBER = 15;
    private boolean isHintValid_;
    /**
     * <code>bool is_hint_valid = 15;</code>
     * @return The isHintValid.
     */
    @java.lang.Override
    public boolean getIsHintValid() {
      return isHintValid_;
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
      if (isAllCollected_ != false) {
        output.writeBool(4, isAllCollected_);
      }
      if (configId_ != 0) {
        output.writeUInt32(6, configId_);
      }
      if (hintCenterPos_ != null) {
        output.writeMessage(7, getHintCenterPos());
      }
      if (materialId_ != 0) {
        output.writeUInt32(10, materialId_);
      }
      if (groupId_ != 0) {
        output.writeUInt32(13, groupId_);
      }
      if (hintRadius_ != 0) {
        output.writeUInt32(14, hintRadius_);
      }
      if (isHintValid_ != false) {
        output.writeBool(15, isHintValid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isAllCollected_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isAllCollected_);
      }
      if (configId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, configId_);
      }
      if (hintCenterPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getHintCenterPos());
      }
      if (materialId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, materialId_);
      }
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, groupId_);
      }
      if (hintRadius_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, hintRadius_);
      }
      if (isHintValid_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isHintValid_);
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
      if (!(obj instanceof io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData other = (io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData) obj;

      if (hasHintCenterPos() != other.hasHintCenterPos()) return false;
      if (hasHintCenterPos()) {
        if (!getHintCenterPos()
            .equals(other.getHintCenterPos())) return false;
      }
      if (getHintRadius()
          != other.getHintRadius()) return false;
      if (getMaterialId()
          != other.getMaterialId()) return false;
      if (getConfigId()
          != other.getConfigId()) return false;
      if (getGroupId()
          != other.getGroupId()) return false;
      if (getIsAllCollected()
          != other.getIsAllCollected()) return false;
      if (getIsHintValid()
          != other.getIsHintValid()) return false;
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
      if (hasHintCenterPos()) {
        hash = (37 * hash) + HINT_CENTER_POS_FIELD_NUMBER;
        hash = (53 * hash) + getHintCenterPos().hashCode();
      }
      hash = (37 * hash) + HINT_RADIUS_FIELD_NUMBER;
      hash = (53 * hash) + getHintRadius();
      hash = (37 * hash) + MATERIAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMaterialId();
      hash = (37 * hash) + CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getConfigId();
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (37 * hash) + IS_ALL_COLLECTED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAllCollected());
      hash = (37 * hash) + IS_HINT_VALID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsHintValid());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData prototype) {
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
     * Protobuf type {@code OneofGatherPointDetectorData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OneofGatherPointDetectorData)
        io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.internal_static_OneofGatherPointDetectorData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.internal_static_OneofGatherPointDetectorData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.class, io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder.class);
      }

      // Construct using io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.newBuilder()
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
        if (hintCenterPosBuilder_ == null) {
          hintCenterPos_ = null;
        } else {
          hintCenterPos_ = null;
          hintCenterPosBuilder_ = null;
        }
        hintRadius_ = 0;

        materialId_ = 0;

        configId_ = 0;

        groupId_ = 0;

        isAllCollected_ = false;

        isHintValid_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.internal_static_OneofGatherPointDetectorData_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData getDefaultInstanceForType() {
        return io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData build() {
        io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData buildPartial() {
        io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData result = new io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData(this);
        if (hintCenterPosBuilder_ == null) {
          result.hintCenterPos_ = hintCenterPos_;
        } else {
          result.hintCenterPos_ = hintCenterPosBuilder_.build();
        }
        result.hintRadius_ = hintRadius_;
        result.materialId_ = materialId_;
        result.configId_ = configId_;
        result.groupId_ = groupId_;
        result.isAllCollected_ = isAllCollected_;
        result.isHintValid_ = isHintValid_;
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
        if (other instanceof io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData) {
          return mergeFrom((io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData other) {
        if (other == io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.getDefaultInstance()) return this;
        if (other.hasHintCenterPos()) {
          mergeHintCenterPos(other.getHintCenterPos());
        }
        if (other.getHintRadius() != 0) {
          setHintRadius(other.getHintRadius());
        }
        if (other.getMaterialId() != 0) {
          setMaterialId(other.getMaterialId());
        }
        if (other.getConfigId() != 0) {
          setConfigId(other.getConfigId());
        }
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.getIsAllCollected() != false) {
          setIsAllCollected(other.getIsAllCollected());
        }
        if (other.getIsHintValid() != false) {
          setIsHintValid(other.getIsHintValid());
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
        io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private io.grasscutter.proto.VectorOuterClass.Vector hintCenterPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder> hintCenterPosBuilder_;
      /**
       * <code>.Vector hint_center_pos = 7;</code>
       * @return Whether the hintCenterPos field is set.
       */
      public boolean hasHintCenterPos() {
        return hintCenterPosBuilder_ != null || hintCenterPos_ != null;
      }
      /**
       * <code>.Vector hint_center_pos = 7;</code>
       * @return The hintCenterPos.
       */
      public io.grasscutter.proto.VectorOuterClass.Vector getHintCenterPos() {
        if (hintCenterPosBuilder_ == null) {
          return hintCenterPos_ == null ? io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : hintCenterPos_;
        } else {
          return hintCenterPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector hint_center_pos = 7;</code>
       */
      public Builder setHintCenterPos(io.grasscutter.proto.VectorOuterClass.Vector value) {
        if (hintCenterPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          hintCenterPos_ = value;
          onChanged();
        } else {
          hintCenterPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector hint_center_pos = 7;</code>
       */
      public Builder setHintCenterPos(
          io.grasscutter.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (hintCenterPosBuilder_ == null) {
          hintCenterPos_ = builderForValue.build();
          onChanged();
        } else {
          hintCenterPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector hint_center_pos = 7;</code>
       */
      public Builder mergeHintCenterPos(io.grasscutter.proto.VectorOuterClass.Vector value) {
        if (hintCenterPosBuilder_ == null) {
          if (hintCenterPos_ != null) {
            hintCenterPos_ =
              io.grasscutter.proto.VectorOuterClass.Vector.newBuilder(hintCenterPos_).mergeFrom(value).buildPartial();
          } else {
            hintCenterPos_ = value;
          }
          onChanged();
        } else {
          hintCenterPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector hint_center_pos = 7;</code>
       */
      public Builder clearHintCenterPos() {
        if (hintCenterPosBuilder_ == null) {
          hintCenterPos_ = null;
          onChanged();
        } else {
          hintCenterPos_ = null;
          hintCenterPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector hint_center_pos = 7;</code>
       */
      public io.grasscutter.proto.VectorOuterClass.Vector.Builder getHintCenterPosBuilder() {
        
        onChanged();
        return getHintCenterPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector hint_center_pos = 7;</code>
       */
      public io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getHintCenterPosOrBuilder() {
        if (hintCenterPosBuilder_ != null) {
          return hintCenterPosBuilder_.getMessageOrBuilder();
        } else {
          return hintCenterPos_ == null ?
              io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : hintCenterPos_;
        }
      }
      /**
       * <code>.Vector hint_center_pos = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder> 
          getHintCenterPosFieldBuilder() {
        if (hintCenterPosBuilder_ == null) {
          hintCenterPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder>(
                  getHintCenterPos(),
                  getParentForChildren(),
                  isClean());
          hintCenterPos_ = null;
        }
        return hintCenterPosBuilder_;
      }

      private int hintRadius_ ;
      /**
       * <code>uint32 hint_radius = 14;</code>
       * @return The hintRadius.
       */
      @java.lang.Override
      public int getHintRadius() {
        return hintRadius_;
      }
      /**
       * <code>uint32 hint_radius = 14;</code>
       * @param value The hintRadius to set.
       * @return This builder for chaining.
       */
      public Builder setHintRadius(int value) {
        
        hintRadius_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 hint_radius = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearHintRadius() {
        
        hintRadius_ = 0;
        onChanged();
        return this;
      }

      private int materialId_ ;
      /**
       * <code>uint32 material_id = 10;</code>
       * @return The materialId.
       */
      @java.lang.Override
      public int getMaterialId() {
        return materialId_;
      }
      /**
       * <code>uint32 material_id = 10;</code>
       * @param value The materialId to set.
       * @return This builder for chaining.
       */
      public Builder setMaterialId(int value) {
        
        materialId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 material_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaterialId() {
        
        materialId_ = 0;
        onChanged();
        return this;
      }

      private int configId_ ;
      /**
       * <code>uint32 config_id = 6;</code>
       * @return The configId.
       */
      @java.lang.Override
      public int getConfigId() {
        return configId_;
      }
      /**
       * <code>uint32 config_id = 6;</code>
       * @param value The configId to set.
       * @return This builder for chaining.
       */
      public Builder setConfigId(int value) {
        
        configId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 config_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigId() {
        
        configId_ = 0;
        onChanged();
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 13;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 13;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
        onChanged();
        return this;
      }

      private boolean isAllCollected_ ;
      /**
       * <code>bool is_all_collected = 4;</code>
       * @return The isAllCollected.
       */
      @java.lang.Override
      public boolean getIsAllCollected() {
        return isAllCollected_;
      }
      /**
       * <code>bool is_all_collected = 4;</code>
       * @param value The isAllCollected to set.
       * @return This builder for chaining.
       */
      public Builder setIsAllCollected(boolean value) {
        
        isAllCollected_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_all_collected = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAllCollected() {
        
        isAllCollected_ = false;
        onChanged();
        return this;
      }

      private boolean isHintValid_ ;
      /**
       * <code>bool is_hint_valid = 15;</code>
       * @return The isHintValid.
       */
      @java.lang.Override
      public boolean getIsHintValid() {
        return isHintValid_;
      }
      /**
       * <code>bool is_hint_valid = 15;</code>
       * @param value The isHintValid to set.
       * @return This builder for chaining.
       */
      public Builder setIsHintValid(boolean value) {
        
        isHintValid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_hint_valid = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsHintValid() {
        
        isHintValid_ = false;
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


      // @@protoc_insertion_point(builder_scope:OneofGatherPointDetectorData)
    }

    // @@protoc_insertion_point(class_scope:OneofGatherPointDetectorData)
    private static final io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData();
    }

    public static io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OneofGatherPointDetectorData>
        PARSER = new com.google.protobuf.AbstractParser<OneofGatherPointDetectorData>() {
      @java.lang.Override
      public OneofGatherPointDetectorData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OneofGatherPointDetectorData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OneofGatherPointDetectorData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OneofGatherPointDetectorData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OneofGatherPointDetectorData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OneofGatherPointDetectorData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"OneofGatherPointDetectorData.proto\032\014Ve" +
      "ctor.proto\"\300\001\n\034OneofGatherPointDetectorD" +
      "ata\022 \n\017hint_center_pos\030\007 \001(\0132\007.Vector\022\023\n" +
      "\013hint_radius\030\016 \001(\r\022\023\n\013material_id\030\n \001(\r\022" +
      "\021\n\tconfig_id\030\006 \001(\r\022\020\n\010group_id\030\r \001(\r\022\030\n\020" +
      "is_all_collected\030\004 \001(\010\022\025\n\ris_hint_valid\030" +
      "\017 \001(\010B\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_OneofGatherPointDetectorData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OneofGatherPointDetectorData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OneofGatherPointDetectorData_descriptor,
        new java.lang.String[] { "HintCenterPos", "HintRadius", "MaterialId", "ConfigId", "GroupId", "IsAllCollected", "IsHintValid", });
    io.grasscutter.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
