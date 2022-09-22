// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneEntityMoveNotify.proto

package io.grasscutter.proto;

public final class SceneEntityMoveNotifyOuterClass {
  private SceneEntityMoveNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneEntityMoveNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneEntityMoveNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.MotionInfo motion_info = 6;</code>
     * @return Whether the motionInfo field is set.
     */
    boolean hasMotionInfo();
    /**
     * <code>.MotionInfo motion_info = 6;</code>
     * @return The motionInfo.
     */
    io.grasscutter.proto.MotionInfoOuterClass.MotionInfo getMotionInfo();
    /**
     * <code>.MotionInfo motion_info = 6;</code>
     */
    io.grasscutter.proto.MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder();

    /**
     * <code>uint32 entity_id = 8;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint32 scene_time = 15;</code>
     * @return The sceneTime.
     */
    int getSceneTime();

    /**
     * <code>uint32 reliable_seq = 2;</code>
     * @return The reliableSeq.
     */
    int getReliableSeq();
  }
  /**
   * <pre>
   * CmdId: 275
   * EnetChannelId: 1
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code SceneEntityMoveNotify}
   */
  public static final class SceneEntityMoveNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneEntityMoveNotify)
      SceneEntityMoveNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneEntityMoveNotify.newBuilder() to construct.
    private SceneEntityMoveNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneEntityMoveNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneEntityMoveNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneEntityMoveNotify(
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

              reliableSeq_ = input.readUInt32();
              break;
            }
            case 50: {
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
            case 64: {

              entityId_ = input.readUInt32();
              break;
            }
            case 120: {

              sceneTime_ = input.readUInt32();
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
      return io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.internal_static_SceneEntityMoveNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.internal_static_SceneEntityMoveNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify.class, io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify.Builder.class);
    }

    public static final int MOTION_INFO_FIELD_NUMBER = 6;
    private io.grasscutter.proto.MotionInfoOuterClass.MotionInfo motionInfo_;
    /**
     * <code>.MotionInfo motion_info = 6;</code>
     * @return Whether the motionInfo field is set.
     */
    @java.lang.Override
    public boolean hasMotionInfo() {
      return motionInfo_ != null;
    }
    /**
     * <code>.MotionInfo motion_info = 6;</code>
     * @return The motionInfo.
     */
    @java.lang.Override
    public io.grasscutter.proto.MotionInfoOuterClass.MotionInfo getMotionInfo() {
      return motionInfo_ == null ? io.grasscutter.proto.MotionInfoOuterClass.MotionInfo.getDefaultInstance() : motionInfo_;
    }
    /**
     * <code>.MotionInfo motion_info = 6;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder() {
      return getMotionInfo();
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 8;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 8;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int SCENE_TIME_FIELD_NUMBER = 15;
    private int sceneTime_;
    /**
     * <code>uint32 scene_time = 15;</code>
     * @return The sceneTime.
     */
    @java.lang.Override
    public int getSceneTime() {
      return sceneTime_;
    }

    public static final int RELIABLE_SEQ_FIELD_NUMBER = 2;
    private int reliableSeq_;
    /**
     * <code>uint32 reliable_seq = 2;</code>
     * @return The reliableSeq.
     */
    @java.lang.Override
    public int getReliableSeq() {
      return reliableSeq_;
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
      if (reliableSeq_ != 0) {
        output.writeUInt32(2, reliableSeq_);
      }
      if (motionInfo_ != null) {
        output.writeMessage(6, getMotionInfo());
      }
      if (entityId_ != 0) {
        output.writeUInt32(8, entityId_);
      }
      if (sceneTime_ != 0) {
        output.writeUInt32(15, sceneTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reliableSeq_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, reliableSeq_);
      }
      if (motionInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getMotionInfo());
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, entityId_);
      }
      if (sceneTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, sceneTime_);
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
      if (!(obj instanceof io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify other = (io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify) obj;

      if (hasMotionInfo() != other.hasMotionInfo()) return false;
      if (hasMotionInfo()) {
        if (!getMotionInfo()
            .equals(other.getMotionInfo())) return false;
      }
      if (getEntityId()
          != other.getEntityId()) return false;
      if (getSceneTime()
          != other.getSceneTime()) return false;
      if (getReliableSeq()
          != other.getReliableSeq()) return false;
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
      if (hasMotionInfo()) {
        hash = (37 * hash) + MOTION_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getMotionInfo().hashCode();
      }
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + SCENE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getSceneTime();
      hash = (37 * hash) + RELIABLE_SEQ_FIELD_NUMBER;
      hash = (53 * hash) + getReliableSeq();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify prototype) {
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
     * CmdId: 275
     * EnetChannelId: 1
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code SceneEntityMoveNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneEntityMoveNotify)
        io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.internal_static_SceneEntityMoveNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.internal_static_SceneEntityMoveNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify.class, io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify.newBuilder()
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
        if (motionInfoBuilder_ == null) {
          motionInfo_ = null;
        } else {
          motionInfo_ = null;
          motionInfoBuilder_ = null;
        }
        entityId_ = 0;

        sceneTime_ = 0;

        reliableSeq_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.internal_static_SceneEntityMoveNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify build() {
        io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify buildPartial() {
        io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify result = new io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify(this);
        if (motionInfoBuilder_ == null) {
          result.motionInfo_ = motionInfo_;
        } else {
          result.motionInfo_ = motionInfoBuilder_.build();
        }
        result.entityId_ = entityId_;
        result.sceneTime_ = sceneTime_;
        result.reliableSeq_ = reliableSeq_;
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
        if (other instanceof io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify) {
          return mergeFrom((io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify other) {
        if (other == io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify.getDefaultInstance()) return this;
        if (other.hasMotionInfo()) {
          mergeMotionInfo(other.getMotionInfo());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getSceneTime() != 0) {
          setSceneTime(other.getSceneTime());
        }
        if (other.getReliableSeq() != 0) {
          setReliableSeq(other.getReliableSeq());
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
        io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private io.grasscutter.proto.MotionInfoOuterClass.MotionInfo motionInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.MotionInfoOuterClass.MotionInfo, io.grasscutter.proto.MotionInfoOuterClass.MotionInfo.Builder, io.grasscutter.proto.MotionInfoOuterClass.MotionInfoOrBuilder> motionInfoBuilder_;
      /**
       * <code>.MotionInfo motion_info = 6;</code>
       * @return Whether the motionInfo field is set.
       */
      public boolean hasMotionInfo() {
        return motionInfoBuilder_ != null || motionInfo_ != null;
      }
      /**
       * <code>.MotionInfo motion_info = 6;</code>
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
       * <code>.MotionInfo motion_info = 6;</code>
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
       * <code>.MotionInfo motion_info = 6;</code>
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
       * <code>.MotionInfo motion_info = 6;</code>
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
       * <code>.MotionInfo motion_info = 6;</code>
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
       * <code>.MotionInfo motion_info = 6;</code>
       */
      public io.grasscutter.proto.MotionInfoOuterClass.MotionInfo.Builder getMotionInfoBuilder() {
        
        onChanged();
        return getMotionInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.MotionInfo motion_info = 6;</code>
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
       * <code>.MotionInfo motion_info = 6;</code>
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
       * <code>uint32 entity_id = 8;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 8;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int sceneTime_ ;
      /**
       * <code>uint32 scene_time = 15;</code>
       * @return The sceneTime.
       */
      @java.lang.Override
      public int getSceneTime() {
        return sceneTime_;
      }
      /**
       * <code>uint32 scene_time = 15;</code>
       * @param value The sceneTime to set.
       * @return This builder for chaining.
       */
      public Builder setSceneTime(int value) {
        
        sceneTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_time = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneTime() {
        
        sceneTime_ = 0;
        onChanged();
        return this;
      }

      private int reliableSeq_ ;
      /**
       * <code>uint32 reliable_seq = 2;</code>
       * @return The reliableSeq.
       */
      @java.lang.Override
      public int getReliableSeq() {
        return reliableSeq_;
      }
      /**
       * <code>uint32 reliable_seq = 2;</code>
       * @param value The reliableSeq to set.
       * @return This builder for chaining.
       */
      public Builder setReliableSeq(int value) {
        
        reliableSeq_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reliable_seq = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearReliableSeq() {
        
        reliableSeq_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneEntityMoveNotify)
    }

    // @@protoc_insertion_point(class_scope:SceneEntityMoveNotify)
    private static final io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify();
    }

    public static io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneEntityMoveNotify>
        PARSER = new com.google.protobuf.AbstractParser<SceneEntityMoveNotify>() {
      @java.lang.Override
      public SceneEntityMoveNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneEntityMoveNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneEntityMoveNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneEntityMoveNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneEntityMoveNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneEntityMoveNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033SceneEntityMoveNotify.proto\032\020MotionInf" +
      "o.proto\"v\n\025SceneEntityMoveNotify\022 \n\013moti" +
      "on_info\030\006 \001(\0132\013.MotionInfo\022\021\n\tentity_id\030" +
      "\010 \001(\r\022\022\n\nscene_time\030\017 \001(\r\022\024\n\014reliable_se" +
      "q\030\002 \001(\rB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.MotionInfoOuterClass.getDescriptor(),
        });
    internal_static_SceneEntityMoveNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneEntityMoveNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneEntityMoveNotify_descriptor,
        new java.lang.String[] { "MotionInfo", "EntityId", "SceneTime", "ReliableSeq", });
    io.grasscutter.proto.MotionInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
