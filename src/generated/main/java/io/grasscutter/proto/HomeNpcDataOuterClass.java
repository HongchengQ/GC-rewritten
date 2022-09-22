// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeNpcData.proto

package io.grasscutter.proto;

public final class HomeNpcDataOuterClass {
  private HomeNpcDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeNpcDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeNpcData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 avatar_id = 14;</code>
     * @return The avatarId.
     */
    int getAvatarId();

    /**
     * <code>.Vector spawn_pos = 15;</code>
     * @return Whether the spawnPos field is set.
     */
    boolean hasSpawnPos();
    /**
     * <code>.Vector spawn_pos = 15;</code>
     * @return The spawnPos.
     */
    io.grasscutter.proto.VectorOuterClass.Vector getSpawnPos();
    /**
     * <code>.Vector spawn_pos = 15;</code>
     */
    io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder();

    /**
     * <code>uint32 costume_id = 3;</code>
     * @return The costumeId.
     */
    int getCostumeId();

    /**
     * <code>.Vector spawn_rot = 13;</code>
     * @return Whether the spawnRot field is set.
     */
    boolean hasSpawnRot();
    /**
     * <code>.Vector spawn_rot = 13;</code>
     * @return The spawnRot.
     */
    io.grasscutter.proto.VectorOuterClass.Vector getSpawnRot();
    /**
     * <code>.Vector spawn_rot = 13;</code>
     */
    io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getSpawnRotOrBuilder();
  }
  /**
   * Protobuf type {@code HomeNpcData}
   */
  public static final class HomeNpcData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeNpcData)
      HomeNpcDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeNpcData.newBuilder() to construct.
    private HomeNpcData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeNpcData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeNpcData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeNpcData(
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
            case 24: {

              costumeId_ = input.readUInt32();
              break;
            }
            case 106: {
              io.grasscutter.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (spawnRot_ != null) {
                subBuilder = spawnRot_.toBuilder();
              }
              spawnRot_ = input.readMessage(io.grasscutter.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(spawnRot_);
                spawnRot_ = subBuilder.buildPartial();
              }

              break;
            }
            case 112: {

              avatarId_ = input.readUInt32();
              break;
            }
            case 122: {
              io.grasscutter.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (spawnPos_ != null) {
                subBuilder = spawnPos_.toBuilder();
              }
              spawnPos_ = input.readMessage(io.grasscutter.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(spawnPos_);
                spawnPos_ = subBuilder.buildPartial();
              }

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
      return io.grasscutter.proto.HomeNpcDataOuterClass.internal_static_HomeNpcData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.HomeNpcDataOuterClass.internal_static_HomeNpcData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData.class, io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData.Builder.class);
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 14;
    private int avatarId_;
    /**
     * <code>uint32 avatar_id = 14;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
    }

    public static final int SPAWN_POS_FIELD_NUMBER = 15;
    private io.grasscutter.proto.VectorOuterClass.Vector spawnPos_;
    /**
     * <code>.Vector spawn_pos = 15;</code>
     * @return Whether the spawnPos field is set.
     */
    @java.lang.Override
    public boolean hasSpawnPos() {
      return spawnPos_ != null;
    }
    /**
     * <code>.Vector spawn_pos = 15;</code>
     * @return The spawnPos.
     */
    @java.lang.Override
    public io.grasscutter.proto.VectorOuterClass.Vector getSpawnPos() {
      return spawnPos_ == null ? io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnPos_;
    }
    /**
     * <code>.Vector spawn_pos = 15;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder() {
      return getSpawnPos();
    }

    public static final int COSTUME_ID_FIELD_NUMBER = 3;
    private int costumeId_;
    /**
     * <code>uint32 costume_id = 3;</code>
     * @return The costumeId.
     */
    @java.lang.Override
    public int getCostumeId() {
      return costumeId_;
    }

    public static final int SPAWN_ROT_FIELD_NUMBER = 13;
    private io.grasscutter.proto.VectorOuterClass.Vector spawnRot_;
    /**
     * <code>.Vector spawn_rot = 13;</code>
     * @return Whether the spawnRot field is set.
     */
    @java.lang.Override
    public boolean hasSpawnRot() {
      return spawnRot_ != null;
    }
    /**
     * <code>.Vector spawn_rot = 13;</code>
     * @return The spawnRot.
     */
    @java.lang.Override
    public io.grasscutter.proto.VectorOuterClass.Vector getSpawnRot() {
      return spawnRot_ == null ? io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnRot_;
    }
    /**
     * <code>.Vector spawn_rot = 13;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getSpawnRotOrBuilder() {
      return getSpawnRot();
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
      if (costumeId_ != 0) {
        output.writeUInt32(3, costumeId_);
      }
      if (spawnRot_ != null) {
        output.writeMessage(13, getSpawnRot());
      }
      if (avatarId_ != 0) {
        output.writeUInt32(14, avatarId_);
      }
      if (spawnPos_ != null) {
        output.writeMessage(15, getSpawnPos());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (costumeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, costumeId_);
      }
      if (spawnRot_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getSpawnRot());
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, avatarId_);
      }
      if (spawnPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getSpawnPos());
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
      if (!(obj instanceof io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData other = (io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData) obj;

      if (getAvatarId()
          != other.getAvatarId()) return false;
      if (hasSpawnPos() != other.hasSpawnPos()) return false;
      if (hasSpawnPos()) {
        if (!getSpawnPos()
            .equals(other.getSpawnPos())) return false;
      }
      if (getCostumeId()
          != other.getCostumeId()) return false;
      if (hasSpawnRot() != other.hasSpawnRot()) return false;
      if (hasSpawnRot()) {
        if (!getSpawnRot()
            .equals(other.getSpawnRot())) return false;
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
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      if (hasSpawnPos()) {
        hash = (37 * hash) + SPAWN_POS_FIELD_NUMBER;
        hash = (53 * hash) + getSpawnPos().hashCode();
      }
      hash = (37 * hash) + COSTUME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCostumeId();
      if (hasSpawnRot()) {
        hash = (37 * hash) + SPAWN_ROT_FIELD_NUMBER;
        hash = (53 * hash) + getSpawnRot().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData prototype) {
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
     * Protobuf type {@code HomeNpcData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeNpcData)
        io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.HomeNpcDataOuterClass.internal_static_HomeNpcData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.HomeNpcDataOuterClass.internal_static_HomeNpcData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData.class, io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData.Builder.class);
      }

      // Construct using io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData.newBuilder()
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
        avatarId_ = 0;

        if (spawnPosBuilder_ == null) {
          spawnPos_ = null;
        } else {
          spawnPos_ = null;
          spawnPosBuilder_ = null;
        }
        costumeId_ = 0;

        if (spawnRotBuilder_ == null) {
          spawnRot_ = null;
        } else {
          spawnRot_ = null;
          spawnRotBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.HomeNpcDataOuterClass.internal_static_HomeNpcData_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData getDefaultInstanceForType() {
        return io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData build() {
        io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData buildPartial() {
        io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData result = new io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData(this);
        result.avatarId_ = avatarId_;
        if (spawnPosBuilder_ == null) {
          result.spawnPos_ = spawnPos_;
        } else {
          result.spawnPos_ = spawnPosBuilder_.build();
        }
        result.costumeId_ = costumeId_;
        if (spawnRotBuilder_ == null) {
          result.spawnRot_ = spawnRot_;
        } else {
          result.spawnRot_ = spawnRotBuilder_.build();
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
        if (other instanceof io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData) {
          return mergeFrom((io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData other) {
        if (other == io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData.getDefaultInstance()) return this;
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
        }
        if (other.hasSpawnPos()) {
          mergeSpawnPos(other.getSpawnPos());
        }
        if (other.getCostumeId() != 0) {
          setCostumeId(other.getCostumeId());
        }
        if (other.hasSpawnRot()) {
          mergeSpawnRot(other.getSpawnRot());
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
        io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 14;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 14;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
        onChanged();
        return this;
      }

      private io.grasscutter.proto.VectorOuterClass.Vector spawnPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder> spawnPosBuilder_;
      /**
       * <code>.Vector spawn_pos = 15;</code>
       * @return Whether the spawnPos field is set.
       */
      public boolean hasSpawnPos() {
        return spawnPosBuilder_ != null || spawnPos_ != null;
      }
      /**
       * <code>.Vector spawn_pos = 15;</code>
       * @return The spawnPos.
       */
      public io.grasscutter.proto.VectorOuterClass.Vector getSpawnPos() {
        if (spawnPosBuilder_ == null) {
          return spawnPos_ == null ? io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnPos_;
        } else {
          return spawnPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector spawn_pos = 15;</code>
       */
      public Builder setSpawnPos(io.grasscutter.proto.VectorOuterClass.Vector value) {
        if (spawnPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spawnPos_ = value;
          onChanged();
        } else {
          spawnPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector spawn_pos = 15;</code>
       */
      public Builder setSpawnPos(
          io.grasscutter.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (spawnPosBuilder_ == null) {
          spawnPos_ = builderForValue.build();
          onChanged();
        } else {
          spawnPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector spawn_pos = 15;</code>
       */
      public Builder mergeSpawnPos(io.grasscutter.proto.VectorOuterClass.Vector value) {
        if (spawnPosBuilder_ == null) {
          if (spawnPos_ != null) {
            spawnPos_ =
              io.grasscutter.proto.VectorOuterClass.Vector.newBuilder(spawnPos_).mergeFrom(value).buildPartial();
          } else {
            spawnPos_ = value;
          }
          onChanged();
        } else {
          spawnPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector spawn_pos = 15;</code>
       */
      public Builder clearSpawnPos() {
        if (spawnPosBuilder_ == null) {
          spawnPos_ = null;
          onChanged();
        } else {
          spawnPos_ = null;
          spawnPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector spawn_pos = 15;</code>
       */
      public io.grasscutter.proto.VectorOuterClass.Vector.Builder getSpawnPosBuilder() {
        
        onChanged();
        return getSpawnPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector spawn_pos = 15;</code>
       */
      public io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder() {
        if (spawnPosBuilder_ != null) {
          return spawnPosBuilder_.getMessageOrBuilder();
        } else {
          return spawnPos_ == null ?
              io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnPos_;
        }
      }
      /**
       * <code>.Vector spawn_pos = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder> 
          getSpawnPosFieldBuilder() {
        if (spawnPosBuilder_ == null) {
          spawnPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder>(
                  getSpawnPos(),
                  getParentForChildren(),
                  isClean());
          spawnPos_ = null;
        }
        return spawnPosBuilder_;
      }

      private int costumeId_ ;
      /**
       * <code>uint32 costume_id = 3;</code>
       * @return The costumeId.
       */
      @java.lang.Override
      public int getCostumeId() {
        return costumeId_;
      }
      /**
       * <code>uint32 costume_id = 3;</code>
       * @param value The costumeId to set.
       * @return This builder for chaining.
       */
      public Builder setCostumeId(int value) {
        
        costumeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 costume_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostumeId() {
        
        costumeId_ = 0;
        onChanged();
        return this;
      }

      private io.grasscutter.proto.VectorOuterClass.Vector spawnRot_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder> spawnRotBuilder_;
      /**
       * <code>.Vector spawn_rot = 13;</code>
       * @return Whether the spawnRot field is set.
       */
      public boolean hasSpawnRot() {
        return spawnRotBuilder_ != null || spawnRot_ != null;
      }
      /**
       * <code>.Vector spawn_rot = 13;</code>
       * @return The spawnRot.
       */
      public io.grasscutter.proto.VectorOuterClass.Vector getSpawnRot() {
        if (spawnRotBuilder_ == null) {
          return spawnRot_ == null ? io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnRot_;
        } else {
          return spawnRotBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector spawn_rot = 13;</code>
       */
      public Builder setSpawnRot(io.grasscutter.proto.VectorOuterClass.Vector value) {
        if (spawnRotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spawnRot_ = value;
          onChanged();
        } else {
          spawnRotBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector spawn_rot = 13;</code>
       */
      public Builder setSpawnRot(
          io.grasscutter.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (spawnRotBuilder_ == null) {
          spawnRot_ = builderForValue.build();
          onChanged();
        } else {
          spawnRotBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector spawn_rot = 13;</code>
       */
      public Builder mergeSpawnRot(io.grasscutter.proto.VectorOuterClass.Vector value) {
        if (spawnRotBuilder_ == null) {
          if (spawnRot_ != null) {
            spawnRot_ =
              io.grasscutter.proto.VectorOuterClass.Vector.newBuilder(spawnRot_).mergeFrom(value).buildPartial();
          } else {
            spawnRot_ = value;
          }
          onChanged();
        } else {
          spawnRotBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector spawn_rot = 13;</code>
       */
      public Builder clearSpawnRot() {
        if (spawnRotBuilder_ == null) {
          spawnRot_ = null;
          onChanged();
        } else {
          spawnRot_ = null;
          spawnRotBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector spawn_rot = 13;</code>
       */
      public io.grasscutter.proto.VectorOuterClass.Vector.Builder getSpawnRotBuilder() {
        
        onChanged();
        return getSpawnRotFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector spawn_rot = 13;</code>
       */
      public io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getSpawnRotOrBuilder() {
        if (spawnRotBuilder_ != null) {
          return spawnRotBuilder_.getMessageOrBuilder();
        } else {
          return spawnRot_ == null ?
              io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnRot_;
        }
      }
      /**
       * <code>.Vector spawn_rot = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder> 
          getSpawnRotFieldBuilder() {
        if (spawnRotBuilder_ == null) {
          spawnRotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder>(
                  getSpawnRot(),
                  getParentForChildren(),
                  isClean());
          spawnRot_ = null;
        }
        return spawnRotBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HomeNpcData)
    }

    // @@protoc_insertion_point(class_scope:HomeNpcData)
    private static final io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData();
    }

    public static io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeNpcData>
        PARSER = new com.google.protobuf.AbstractParser<HomeNpcData>() {
      @java.lang.Override
      public HomeNpcData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeNpcData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeNpcData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeNpcData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.HomeNpcDataOuterClass.HomeNpcData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeNpcData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeNpcData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021HomeNpcData.proto\032\014Vector.proto\"l\n\013Hom" +
      "eNpcData\022\021\n\tavatar_id\030\016 \001(\r\022\032\n\tspawn_pos" +
      "\030\017 \001(\0132\007.Vector\022\022\n\ncostume_id\030\003 \001(\r\022\032\n\ts" +
      "pawn_rot\030\r \001(\0132\007.VectorB\026\n\024io.grasscutte" +
      "r.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_HomeNpcData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeNpcData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeNpcData_descriptor,
        new java.lang.String[] { "AvatarId", "SpawnPos", "CostumeId", "SpawnRot", });
    io.grasscutter.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
