// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtSyncTransform.proto

package io.grasscutter.proto;

public final class EvtSyncTransformOuterClass {
  private EvtSyncTransformOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtSyncTransformOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtSyncTransform)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 15;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.Vector entity_pos = 6;</code>
     * @return Whether the entityPos field is set.
     */
    boolean hasEntityPos();
    /**
     * <code>.Vector entity_pos = 6;</code>
     * @return The entityPos.
     */
    io.grasscutter.proto.VectorOuterClass.Vector getEntityPos();
    /**
     * <code>.Vector entity_pos = 6;</code>
     */
    io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getEntityPosOrBuilder();

    /**
     * <code>.Vector entity_rot = 1;</code>
     * @return Whether the entityRot field is set.
     */
    boolean hasEntityRot();
    /**
     * <code>.Vector entity_rot = 1;</code>
     * @return The entityRot.
     */
    io.grasscutter.proto.VectorOuterClass.Vector getEntityRot();
    /**
     * <code>.Vector entity_rot = 1;</code>
     */
    io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getEntityRotOrBuilder();
  }
  /**
   * Protobuf type {@code EvtSyncTransform}
   */
  public static final class EvtSyncTransform extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtSyncTransform)
      EvtSyncTransformOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtSyncTransform.newBuilder() to construct.
    private EvtSyncTransform(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtSyncTransform() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtSyncTransform();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtSyncTransform(
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
            case 10: {
              io.grasscutter.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (entityRot_ != null) {
                subBuilder = entityRot_.toBuilder();
              }
              entityRot_ = input.readMessage(io.grasscutter.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(entityRot_);
                entityRot_ = subBuilder.buildPartial();
              }

              break;
            }
            case 50: {
              io.grasscutter.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (entityPos_ != null) {
                subBuilder = entityPos_.toBuilder();
              }
              entityPos_ = input.readMessage(io.grasscutter.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(entityPos_);
                entityPos_ = subBuilder.buildPartial();
              }

              break;
            }
            case 120: {

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
      return io.grasscutter.proto.EvtSyncTransformOuterClass.internal_static_EvtSyncTransform_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.EvtSyncTransformOuterClass.internal_static_EvtSyncTransform_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform.class, io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 15;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 15;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int ENTITY_POS_FIELD_NUMBER = 6;
    private io.grasscutter.proto.VectorOuterClass.Vector entityPos_;
    /**
     * <code>.Vector entity_pos = 6;</code>
     * @return Whether the entityPos field is set.
     */
    @java.lang.Override
    public boolean hasEntityPos() {
      return entityPos_ != null;
    }
    /**
     * <code>.Vector entity_pos = 6;</code>
     * @return The entityPos.
     */
    @java.lang.Override
    public io.grasscutter.proto.VectorOuterClass.Vector getEntityPos() {
      return entityPos_ == null ? io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : entityPos_;
    }
    /**
     * <code>.Vector entity_pos = 6;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getEntityPosOrBuilder() {
      return getEntityPos();
    }

    public static final int ENTITY_ROT_FIELD_NUMBER = 1;
    private io.grasscutter.proto.VectorOuterClass.Vector entityRot_;
    /**
     * <code>.Vector entity_rot = 1;</code>
     * @return Whether the entityRot field is set.
     */
    @java.lang.Override
    public boolean hasEntityRot() {
      return entityRot_ != null;
    }
    /**
     * <code>.Vector entity_rot = 1;</code>
     * @return The entityRot.
     */
    @java.lang.Override
    public io.grasscutter.proto.VectorOuterClass.Vector getEntityRot() {
      return entityRot_ == null ? io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : entityRot_;
    }
    /**
     * <code>.Vector entity_rot = 1;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getEntityRotOrBuilder() {
      return getEntityRot();
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
      if (entityRot_ != null) {
        output.writeMessage(1, getEntityRot());
      }
      if (entityPos_ != null) {
        output.writeMessage(6, getEntityPos());
      }
      if (entityId_ != 0) {
        output.writeUInt32(15, entityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityRot_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getEntityRot());
      }
      if (entityPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getEntityPos());
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, entityId_);
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
      if (!(obj instanceof io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform other = (io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (hasEntityPos() != other.hasEntityPos()) return false;
      if (hasEntityPos()) {
        if (!getEntityPos()
            .equals(other.getEntityPos())) return false;
      }
      if (hasEntityRot() != other.hasEntityRot()) return false;
      if (hasEntityRot()) {
        if (!getEntityRot()
            .equals(other.getEntityRot())) return false;
      }
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
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (hasEntityPos()) {
        hash = (37 * hash) + ENTITY_POS_FIELD_NUMBER;
        hash = (53 * hash) + getEntityPos().hashCode();
      }
      if (hasEntityRot()) {
        hash = (37 * hash) + ENTITY_ROT_FIELD_NUMBER;
        hash = (53 * hash) + getEntityRot().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform prototype) {
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
     * Protobuf type {@code EvtSyncTransform}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtSyncTransform)
        io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransformOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.EvtSyncTransformOuterClass.internal_static_EvtSyncTransform_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.EvtSyncTransformOuterClass.internal_static_EvtSyncTransform_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform.class, io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform.Builder.class);
      }

      // Construct using io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform.newBuilder()
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
        entityId_ = 0;

        if (entityPosBuilder_ == null) {
          entityPos_ = null;
        } else {
          entityPos_ = null;
          entityPosBuilder_ = null;
        }
        if (entityRotBuilder_ == null) {
          entityRot_ = null;
        } else {
          entityRot_ = null;
          entityRotBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.EvtSyncTransformOuterClass.internal_static_EvtSyncTransform_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform getDefaultInstanceForType() {
        return io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform build() {
        io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform buildPartial() {
        io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform result = new io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform(this);
        result.entityId_ = entityId_;
        if (entityPosBuilder_ == null) {
          result.entityPos_ = entityPos_;
        } else {
          result.entityPos_ = entityPosBuilder_.build();
        }
        if (entityRotBuilder_ == null) {
          result.entityRot_ = entityRot_;
        } else {
          result.entityRot_ = entityRotBuilder_.build();
        }
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
        if (other instanceof io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform) {
          return mergeFrom((io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform other) {
        if (other == io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.hasEntityPos()) {
          mergeEntityPos(other.getEntityPos());
        }
        if (other.hasEntityRot()) {
          mergeEntityRot(other.getEntityRot());
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
        io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 15;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 15;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private io.grasscutter.proto.VectorOuterClass.Vector entityPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder> entityPosBuilder_;
      /**
       * <code>.Vector entity_pos = 6;</code>
       * @return Whether the entityPos field is set.
       */
      public boolean hasEntityPos() {
        return entityPosBuilder_ != null || entityPos_ != null;
      }
      /**
       * <code>.Vector entity_pos = 6;</code>
       * @return The entityPos.
       */
      public io.grasscutter.proto.VectorOuterClass.Vector getEntityPos() {
        if (entityPosBuilder_ == null) {
          return entityPos_ == null ? io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : entityPos_;
        } else {
          return entityPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector entity_pos = 6;</code>
       */
      public Builder setEntityPos(io.grasscutter.proto.VectorOuterClass.Vector value) {
        if (entityPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          entityPos_ = value;
          onChanged();
        } else {
          entityPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector entity_pos = 6;</code>
       */
      public Builder setEntityPos(
          io.grasscutter.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (entityPosBuilder_ == null) {
          entityPos_ = builderForValue.build();
          onChanged();
        } else {
          entityPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector entity_pos = 6;</code>
       */
      public Builder mergeEntityPos(io.grasscutter.proto.VectorOuterClass.Vector value) {
        if (entityPosBuilder_ == null) {
          if (entityPos_ != null) {
            entityPos_ =
              io.grasscutter.proto.VectorOuterClass.Vector.newBuilder(entityPos_).mergeFrom(value).buildPartial();
          } else {
            entityPos_ = value;
          }
          onChanged();
        } else {
          entityPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector entity_pos = 6;</code>
       */
      public Builder clearEntityPos() {
        if (entityPosBuilder_ == null) {
          entityPos_ = null;
          onChanged();
        } else {
          entityPos_ = null;
          entityPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector entity_pos = 6;</code>
       */
      public io.grasscutter.proto.VectorOuterClass.Vector.Builder getEntityPosBuilder() {
        
        onChanged();
        return getEntityPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector entity_pos = 6;</code>
       */
      public io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getEntityPosOrBuilder() {
        if (entityPosBuilder_ != null) {
          return entityPosBuilder_.getMessageOrBuilder();
        } else {
          return entityPos_ == null ?
              io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : entityPos_;
        }
      }
      /**
       * <code>.Vector entity_pos = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder> 
          getEntityPosFieldBuilder() {
        if (entityPosBuilder_ == null) {
          entityPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder>(
                  getEntityPos(),
                  getParentForChildren(),
                  isClean());
          entityPos_ = null;
        }
        return entityPosBuilder_;
      }

      private io.grasscutter.proto.VectorOuterClass.Vector entityRot_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder> entityRotBuilder_;
      /**
       * <code>.Vector entity_rot = 1;</code>
       * @return Whether the entityRot field is set.
       */
      public boolean hasEntityRot() {
        return entityRotBuilder_ != null || entityRot_ != null;
      }
      /**
       * <code>.Vector entity_rot = 1;</code>
       * @return The entityRot.
       */
      public io.grasscutter.proto.VectorOuterClass.Vector getEntityRot() {
        if (entityRotBuilder_ == null) {
          return entityRot_ == null ? io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : entityRot_;
        } else {
          return entityRotBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector entity_rot = 1;</code>
       */
      public Builder setEntityRot(io.grasscutter.proto.VectorOuterClass.Vector value) {
        if (entityRotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          entityRot_ = value;
          onChanged();
        } else {
          entityRotBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector entity_rot = 1;</code>
       */
      public Builder setEntityRot(
          io.grasscutter.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (entityRotBuilder_ == null) {
          entityRot_ = builderForValue.build();
          onChanged();
        } else {
          entityRotBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector entity_rot = 1;</code>
       */
      public Builder mergeEntityRot(io.grasscutter.proto.VectorOuterClass.Vector value) {
        if (entityRotBuilder_ == null) {
          if (entityRot_ != null) {
            entityRot_ =
              io.grasscutter.proto.VectorOuterClass.Vector.newBuilder(entityRot_).mergeFrom(value).buildPartial();
          } else {
            entityRot_ = value;
          }
          onChanged();
        } else {
          entityRotBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector entity_rot = 1;</code>
       */
      public Builder clearEntityRot() {
        if (entityRotBuilder_ == null) {
          entityRot_ = null;
          onChanged();
        } else {
          entityRot_ = null;
          entityRotBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector entity_rot = 1;</code>
       */
      public io.grasscutter.proto.VectorOuterClass.Vector.Builder getEntityRotBuilder() {
        
        onChanged();
        return getEntityRotFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector entity_rot = 1;</code>
       */
      public io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getEntityRotOrBuilder() {
        if (entityRotBuilder_ != null) {
          return entityRotBuilder_.getMessageOrBuilder();
        } else {
          return entityRot_ == null ?
              io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : entityRot_;
        }
      }
      /**
       * <code>.Vector entity_rot = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder> 
          getEntityRotFieldBuilder() {
        if (entityRotBuilder_ == null) {
          entityRotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder>(
                  getEntityRot(),
                  getParentForChildren(),
                  isClean());
          entityRot_ = null;
        }
        return entityRotBuilder_;
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


      // @@protoc_insertion_point(builder_scope:EvtSyncTransform)
    }

    // @@protoc_insertion_point(class_scope:EvtSyncTransform)
    private static final io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform();
    }

    public static io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtSyncTransform>
        PARSER = new com.google.protobuf.AbstractParser<EvtSyncTransform>() {
      @java.lang.Override
      public EvtSyncTransform parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtSyncTransform(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtSyncTransform> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtSyncTransform> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.EvtSyncTransformOuterClass.EvtSyncTransform getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtSyncTransform_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtSyncTransform_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026EvtSyncTransform.proto\032\014Vector.proto\"_" +
      "\n\020EvtSyncTransform\022\021\n\tentity_id\030\017 \001(\r\022\033\n" +
      "\nentity_pos\030\006 \001(\0132\007.Vector\022\033\n\nentity_rot" +
      "\030\001 \001(\0132\007.VectorB\026\n\024io.grasscutter.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_EvtSyncTransform_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtSyncTransform_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtSyncTransform_descriptor,
        new java.lang.String[] { "EntityId", "EntityPos", "EntityRot", });
    io.grasscutter.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
