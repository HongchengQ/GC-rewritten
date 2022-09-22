// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EntityForceSyncReq.proto

package io.grasscutter.proto;

public final class EntityForceSyncReqOuterClass {
  private EntityForceSyncReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EntityForceSyncReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EntityForceSyncReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 room_id = 1;</code>
     * @return The roomId.
     */
    int getRoomId();

    /**
     * <code>.MotionInfo motion_info = 11;</code>
     * @return Whether the motionInfo field is set.
     */
    boolean hasMotionInfo();
    /**
     * <code>.MotionInfo motion_info = 11;</code>
     * @return The motionInfo.
     */
    io.grasscutter.proto.MotionInfoOuterClass.MotionInfo getMotionInfo();
    /**
     * <code>.MotionInfo motion_info = 11;</code>
     */
    io.grasscutter.proto.MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder();

    /**
     * <code>uint32 entity_id = 13;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint32 scene_time = 12;</code>
     * @return The sceneTime.
     */
    int getSceneTime();
  }
  /**
   * <pre>
   * CmdId: 274
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code EntityForceSyncReq}
   */
  public static final class EntityForceSyncReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EntityForceSyncReq)
      EntityForceSyncReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EntityForceSyncReq.newBuilder() to construct.
    private EntityForceSyncReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EntityForceSyncReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EntityForceSyncReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EntityForceSyncReq(
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
            case 8: {

              roomId_ = input.readUInt32();
              break;
            }
            case 90: {
              io.grasscutter.proto.MotionInfoOuterClass.MotionInfo.Builder subBuilder = null;
              if (motionInfo_ != null) {
                subBuilder = motionInfo_.toBuilder();
              }
              motionInfo_ = input.readMessage(io.grasscutter.proto.MotionInfoOuterClass.MotionInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(motionInfo_);
                motionInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 96: {

              sceneTime_ = input.readUInt32();
              break;
            }
            case 104: {

              entityId_ = input.readUInt32();
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
      return io.grasscutter.proto.EntityForceSyncReqOuterClass.internal_static_EntityForceSyncReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.EntityForceSyncReqOuterClass.internal_static_EntityForceSyncReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq.class, io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq.Builder.class);
    }

    public static final int ROOM_ID_FIELD_NUMBER = 1;
    private int roomId_;
    /**
     * <code>uint32 room_id = 1;</code>
     * @return The roomId.
     */
    @java.lang.Override
    public int getRoomId() {
      return roomId_;
    }

    public static final int MOTION_INFO_FIELD_NUMBER = 11;
    private io.grasscutter.proto.MotionInfoOuterClass.MotionInfo motionInfo_;
    /**
     * <code>.MotionInfo motion_info = 11;</code>
     * @return Whether the motionInfo field is set.
     */
    @java.lang.Override
    public boolean hasMotionInfo() {
      return motionInfo_ != null;
    }
    /**
     * <code>.MotionInfo motion_info = 11;</code>
     * @return The motionInfo.
     */
    @java.lang.Override
    public io.grasscutter.proto.MotionInfoOuterClass.MotionInfo getMotionInfo() {
      return motionInfo_ == null ? io.grasscutter.proto.MotionInfoOuterClass.MotionInfo.getDefaultInstance() : motionInfo_;
    }
    /**
     * <code>.MotionInfo motion_info = 11;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder() {
      return getMotionInfo();
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 13;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 13;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int SCENE_TIME_FIELD_NUMBER = 12;
    private int sceneTime_;
    /**
     * <code>uint32 scene_time = 12;</code>
     * @return The sceneTime.
     */
    @java.lang.Override
    public int getSceneTime() {
      return sceneTime_;
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
      if (roomId_ != 0) {
        output.writeUInt32(1, roomId_);
      }
      if (motionInfo_ != null) {
        output.writeMessage(11, getMotionInfo());
      }
      if (sceneTime_ != 0) {
        output.writeUInt32(12, sceneTime_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(13, entityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (roomId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, roomId_);
      }
      if (motionInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getMotionInfo());
      }
      if (sceneTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, sceneTime_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, entityId_);
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
      if (!(obj instanceof io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq other = (io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq) obj;

      if (getRoomId()
          != other.getRoomId()) return false;
      if (hasMotionInfo() != other.hasMotionInfo()) return false;
      if (hasMotionInfo()) {
        if (!getMotionInfo()
            .equals(other.getMotionInfo())) return false;
      }
      if (getEntityId()
          != other.getEntityId()) return false;
      if (getSceneTime()
          != other.getSceneTime()) return false;
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
      hash = (37 * hash) + ROOM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRoomId();
      if (hasMotionInfo()) {
        hash = (37 * hash) + MOTION_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getMotionInfo().hashCode();
      }
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + SCENE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getSceneTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq prototype) {
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
     * CmdId: 274
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code EntityForceSyncReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EntityForceSyncReq)
        io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.EntityForceSyncReqOuterClass.internal_static_EntityForceSyncReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.EntityForceSyncReqOuterClass.internal_static_EntityForceSyncReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq.class, io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq.Builder.class);
      }

      // Construct using io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq.newBuilder()
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
        roomId_ = 0;

        if (motionInfoBuilder_ == null) {
          motionInfo_ = null;
        } else {
          motionInfo_ = null;
          motionInfoBuilder_ = null;
        }
        entityId_ = 0;

        sceneTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.EntityForceSyncReqOuterClass.internal_static_EntityForceSyncReq_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq getDefaultInstanceForType() {
        return io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq build() {
        io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq buildPartial() {
        io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq result = new io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq(this);
        result.roomId_ = roomId_;
        if (motionInfoBuilder_ == null) {
          result.motionInfo_ = motionInfo_;
        } else {
          result.motionInfo_ = motionInfoBuilder_.build();
        }
        result.entityId_ = entityId_;
        result.sceneTime_ = sceneTime_;
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
        if (other instanceof io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq) {
          return mergeFrom((io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq other) {
        if (other == io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq.getDefaultInstance()) return this;
        if (other.getRoomId() != 0) {
          setRoomId(other.getRoomId());
        }
        if (other.hasMotionInfo()) {
          mergeMotionInfo(other.getMotionInfo());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getSceneTime() != 0) {
          setSceneTime(other.getSceneTime());
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
        io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int roomId_ ;
      /**
       * <code>uint32 room_id = 1;</code>
       * @return The roomId.
       */
      @java.lang.Override
      public int getRoomId() {
        return roomId_;
      }
      /**
       * <code>uint32 room_id = 1;</code>
       * @param value The roomId to set.
       * @return This builder for chaining.
       */
      public Builder setRoomId(int value) {
        
        roomId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 room_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRoomId() {
        
        roomId_ = 0;
        onChanged();
        return this;
      }

      private io.grasscutter.proto.MotionInfoOuterClass.MotionInfo motionInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.MotionInfoOuterClass.MotionInfo, io.grasscutter.proto.MotionInfoOuterClass.MotionInfo.Builder, io.grasscutter.proto.MotionInfoOuterClass.MotionInfoOrBuilder> motionInfoBuilder_;
      /**
       * <code>.MotionInfo motion_info = 11;</code>
       * @return Whether the motionInfo field is set.
       */
      public boolean hasMotionInfo() {
        return motionInfoBuilder_ != null || motionInfo_ != null;
      }
      /**
       * <code>.MotionInfo motion_info = 11;</code>
       * @return The motionInfo.
       */
      public io.grasscutter.proto.MotionInfoOuterClass.MotionInfo getMotionInfo() {
        if (motionInfoBuilder_ == null) {
          return motionInfo_ == null ? io.grasscutter.proto.MotionInfoOuterClass.MotionInfo.getDefaultInstance() : motionInfo_;
        } else {
          return motionInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.MotionInfo motion_info = 11;</code>
       */
      public Builder setMotionInfo(io.grasscutter.proto.MotionInfoOuterClass.MotionInfo value) {
        if (motionInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          motionInfo_ = value;
          onChanged();
        } else {
          motionInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.MotionInfo motion_info = 11;</code>
       */
      public Builder setMotionInfo(
          io.grasscutter.proto.MotionInfoOuterClass.MotionInfo.Builder builderForValue) {
        if (motionInfoBuilder_ == null) {
          motionInfo_ = builderForValue.build();
          onChanged();
        } else {
          motionInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.MotionInfo motion_info = 11;</code>
       */
      public Builder mergeMotionInfo(io.grasscutter.proto.MotionInfoOuterClass.MotionInfo value) {
        if (motionInfoBuilder_ == null) {
          if (motionInfo_ != null) {
            motionInfo_ =
              io.grasscutter.proto.MotionInfoOuterClass.MotionInfo.newBuilder(motionInfo_).mergeFrom(value).buildPartial();
          } else {
            motionInfo_ = value;
          }
          onChanged();
        } else {
          motionInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.MotionInfo motion_info = 11;</code>
       */
      public Builder clearMotionInfo() {
        if (motionInfoBuilder_ == null) {
          motionInfo_ = null;
          onChanged();
        } else {
          motionInfo_ = null;
          motionInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.MotionInfo motion_info = 11;</code>
       */
      public io.grasscutter.proto.MotionInfoOuterClass.MotionInfo.Builder getMotionInfoBuilder() {
        
        onChanged();
        return getMotionInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.MotionInfo motion_info = 11;</code>
       */
      public io.grasscutter.proto.MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder() {
        if (motionInfoBuilder_ != null) {
          return motionInfoBuilder_.getMessageOrBuilder();
        } else {
          return motionInfo_ == null ?
              io.grasscutter.proto.MotionInfoOuterClass.MotionInfo.getDefaultInstance() : motionInfo_;
        }
      }
      /**
       * <code>.MotionInfo motion_info = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.MotionInfoOuterClass.MotionInfo, io.grasscutter.proto.MotionInfoOuterClass.MotionInfo.Builder, io.grasscutter.proto.MotionInfoOuterClass.MotionInfoOrBuilder> 
          getMotionInfoFieldBuilder() {
        if (motionInfoBuilder_ == null) {
          motionInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.MotionInfoOuterClass.MotionInfo, io.grasscutter.proto.MotionInfoOuterClass.MotionInfo.Builder, io.grasscutter.proto.MotionInfoOuterClass.MotionInfoOrBuilder>(
                  getMotionInfo(),
                  getParentForChildren(),
                  isClean());
          motionInfo_ = null;
        }
        return motionInfoBuilder_;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 13;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 13;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int sceneTime_ ;
      /**
       * <code>uint32 scene_time = 12;</code>
       * @return The sceneTime.
       */
      @java.lang.Override
      public int getSceneTime() {
        return sceneTime_;
      }
      /**
       * <code>uint32 scene_time = 12;</code>
       * @param value The sceneTime to set.
       * @return This builder for chaining.
       */
      public Builder setSceneTime(int value) {
        
        sceneTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_time = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneTime() {
        
        sceneTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EntityForceSyncReq)
    }

    // @@protoc_insertion_point(class_scope:EntityForceSyncReq)
    private static final io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq();
    }

    public static io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EntityForceSyncReq>
        PARSER = new com.google.protobuf.AbstractParser<EntityForceSyncReq>() {
      @java.lang.Override
      public EntityForceSyncReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EntityForceSyncReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EntityForceSyncReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EntityForceSyncReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.EntityForceSyncReqOuterClass.EntityForceSyncReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EntityForceSyncReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EntityForceSyncReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030EntityForceSyncReq.proto\032\020MotionInfo.p" +
      "roto\"n\n\022EntityForceSyncReq\022\017\n\007room_id\030\001 " +
      "\001(\r\022 \n\013motion_info\030\013 \001(\0132\013.MotionInfo\022\021\n" +
      "\tentity_id\030\r \001(\r\022\022\n\nscene_time\030\014 \001(\rB\026\n\024" +
      "io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.MotionInfoOuterClass.getDescriptor(),
        });
    internal_static_EntityForceSyncReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EntityForceSyncReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EntityForceSyncReq_descriptor,
        new java.lang.String[] { "RoomId", "MotionInfo", "EntityId", "SceneTime", });
    io.grasscutter.proto.MotionInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
