// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InBattleMechanicusBuildingInfo.proto

package io.grasscutter.proto;

public final class InBattleMechanicusBuildingInfoOuterClass {
  private InBattleMechanicusBuildingInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InBattleMechanicusBuildingInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InBattleMechanicusBuildingInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 building_id = 8;</code>
     * @return The buildingId.
     */
    int getBuildingId();

    /**
     * <code>uint32 level = 7;</code>
     * @return The level.
     */
    int getLevel();

    /**
     * <code>uint32 cost_points = 2;</code>
     * @return The costPoints.
     */
    int getCostPoints();

    /**
     * <code>uint32 refund_points = 11;</code>
     * @return The refundPoints.
     */
    int getRefundPoints();
  }
  /**
   * Protobuf type {@code InBattleMechanicusBuildingInfo}
   */
  public static final class InBattleMechanicusBuildingInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InBattleMechanicusBuildingInfo)
      InBattleMechanicusBuildingInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InBattleMechanicusBuildingInfo.newBuilder() to construct.
    private InBattleMechanicusBuildingInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InBattleMechanicusBuildingInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InBattleMechanicusBuildingInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private InBattleMechanicusBuildingInfo(
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

              costPoints_ = input.readUInt32();
              break;
            }
            case 56: {

              level_ = input.readUInt32();
              break;
            }
            case 64: {

              buildingId_ = input.readUInt32();
              break;
            }
            case 88: {

              refundPoints_ = input.readUInt32();
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
      return io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.internal_static_InBattleMechanicusBuildingInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.internal_static_InBattleMechanicusBuildingInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo.class, io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo.Builder.class);
    }

    public static final int BUILDING_ID_FIELD_NUMBER = 8;
    private int buildingId_;
    /**
     * <code>uint32 building_id = 8;</code>
     * @return The buildingId.
     */
    @java.lang.Override
    public int getBuildingId() {
      return buildingId_;
    }

    public static final int LEVEL_FIELD_NUMBER = 7;
    private int level_;
    /**
     * <code>uint32 level = 7;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
    }

    public static final int COST_POINTS_FIELD_NUMBER = 2;
    private int costPoints_;
    /**
     * <code>uint32 cost_points = 2;</code>
     * @return The costPoints.
     */
    @java.lang.Override
    public int getCostPoints() {
      return costPoints_;
    }

    public static final int REFUND_POINTS_FIELD_NUMBER = 11;
    private int refundPoints_;
    /**
     * <code>uint32 refund_points = 11;</code>
     * @return The refundPoints.
     */
    @java.lang.Override
    public int getRefundPoints() {
      return refundPoints_;
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
      if (costPoints_ != 0) {
        output.writeUInt32(2, costPoints_);
      }
      if (level_ != 0) {
        output.writeUInt32(7, level_);
      }
      if (buildingId_ != 0) {
        output.writeUInt32(8, buildingId_);
      }
      if (refundPoints_ != 0) {
        output.writeUInt32(11, refundPoints_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (costPoints_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, costPoints_);
      }
      if (level_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, level_);
      }
      if (buildingId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, buildingId_);
      }
      if (refundPoints_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, refundPoints_);
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
      if (!(obj instanceof io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo other = (io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo) obj;

      if (getBuildingId()
          != other.getBuildingId()) return false;
      if (getLevel()
          != other.getLevel()) return false;
      if (getCostPoints()
          != other.getCostPoints()) return false;
      if (getRefundPoints()
          != other.getRefundPoints()) return false;
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
      hash = (37 * hash) + BUILDING_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBuildingId();
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
      hash = (37 * hash) + COST_POINTS_FIELD_NUMBER;
      hash = (53 * hash) + getCostPoints();
      hash = (37 * hash) + REFUND_POINTS_FIELD_NUMBER;
      hash = (53 * hash) + getRefundPoints();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo prototype) {
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
     * Protobuf type {@code InBattleMechanicusBuildingInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InBattleMechanicusBuildingInfo)
        io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.internal_static_InBattleMechanicusBuildingInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.internal_static_InBattleMechanicusBuildingInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo.class, io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo.Builder.class);
      }

      // Construct using io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo.newBuilder()
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
        buildingId_ = 0;

        level_ = 0;

        costPoints_ = 0;

        refundPoints_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.internal_static_InBattleMechanicusBuildingInfo_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo getDefaultInstanceForType() {
        return io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo build() {
        io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo buildPartial() {
        io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo result = new io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo(this);
        result.buildingId_ = buildingId_;
        result.level_ = level_;
        result.costPoints_ = costPoints_;
        result.refundPoints_ = refundPoints_;
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
        if (other instanceof io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo) {
          return mergeFrom((io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo other) {
        if (other == io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo.getDefaultInstance()) return this;
        if (other.getBuildingId() != 0) {
          setBuildingId(other.getBuildingId());
        }
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
        }
        if (other.getCostPoints() != 0) {
          setCostPoints(other.getCostPoints());
        }
        if (other.getRefundPoints() != 0) {
          setRefundPoints(other.getRefundPoints());
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
        io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int buildingId_ ;
      /**
       * <code>uint32 building_id = 8;</code>
       * @return The buildingId.
       */
      @java.lang.Override
      public int getBuildingId() {
        return buildingId_;
      }
      /**
       * <code>uint32 building_id = 8;</code>
       * @param value The buildingId to set.
       * @return This builder for chaining.
       */
      public Builder setBuildingId(int value) {
        
        buildingId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 building_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuildingId() {
        
        buildingId_ = 0;
        onChanged();
        return this;
      }

      private int level_ ;
      /**
       * <code>uint32 level = 7;</code>
       * @return The level.
       */
      @java.lang.Override
      public int getLevel() {
        return level_;
      }
      /**
       * <code>uint32 level = 7;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {
        
        level_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        
        level_ = 0;
        onChanged();
        return this;
      }

      private int costPoints_ ;
      /**
       * <code>uint32 cost_points = 2;</code>
       * @return The costPoints.
       */
      @java.lang.Override
      public int getCostPoints() {
        return costPoints_;
      }
      /**
       * <code>uint32 cost_points = 2;</code>
       * @param value The costPoints to set.
       * @return This builder for chaining.
       */
      public Builder setCostPoints(int value) {
        
        costPoints_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cost_points = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostPoints() {
        
        costPoints_ = 0;
        onChanged();
        return this;
      }

      private int refundPoints_ ;
      /**
       * <code>uint32 refund_points = 11;</code>
       * @return The refundPoints.
       */
      @java.lang.Override
      public int getRefundPoints() {
        return refundPoints_;
      }
      /**
       * <code>uint32 refund_points = 11;</code>
       * @param value The refundPoints to set.
       * @return This builder for chaining.
       */
      public Builder setRefundPoints(int value) {
        
        refundPoints_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 refund_points = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearRefundPoints() {
        
        refundPoints_ = 0;
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


      // @@protoc_insertion_point(builder_scope:InBattleMechanicusBuildingInfo)
    }

    // @@protoc_insertion_point(class_scope:InBattleMechanicusBuildingInfo)
    private static final io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo();
    }

    public static io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InBattleMechanicusBuildingInfo>
        PARSER = new com.google.protobuf.AbstractParser<InBattleMechanicusBuildingInfo>() {
      @java.lang.Override
      public InBattleMechanicusBuildingInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InBattleMechanicusBuildingInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InBattleMechanicusBuildingInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InBattleMechanicusBuildingInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.InBattleMechanicusBuildingInfoOuterClass.InBattleMechanicusBuildingInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InBattleMechanicusBuildingInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InBattleMechanicusBuildingInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$InBattleMechanicusBuildingInfo.proto\"p" +
      "\n\036InBattleMechanicusBuildingInfo\022\023\n\013buil" +
      "ding_id\030\010 \001(\r\022\r\n\005level\030\007 \001(\r\022\023\n\013cost_poi" +
      "nts\030\002 \001(\r\022\025\n\rrefund_points\030\013 \001(\rB\026\n\024io.g" +
      "rasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InBattleMechanicusBuildingInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InBattleMechanicusBuildingInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InBattleMechanicusBuildingInfo_descriptor,
        new java.lang.String[] { "BuildingId", "Level", "CostPoints", "RefundPoints", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
