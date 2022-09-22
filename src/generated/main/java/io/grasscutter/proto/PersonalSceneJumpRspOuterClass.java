// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PersonalSceneJumpRsp.proto

package io.grasscutter.proto;

public final class PersonalSceneJumpRspOuterClass {
  private PersonalSceneJumpRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PersonalSceneJumpRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PersonalSceneJumpRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dest_scene_id = 5;</code>
     * @return The destSceneId.
     */
    int getDestSceneId();

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.Vector dest_pos = 11;</code>
     * @return Whether the destPos field is set.
     */
    boolean hasDestPos();
    /**
     * <code>.Vector dest_pos = 11;</code>
     * @return The destPos.
     */
    io.grasscutter.proto.VectorOuterClass.Vector getDestPos();
    /**
     * <code>.Vector dest_pos = 11;</code>
     */
    io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getDestPosOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 280
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code PersonalSceneJumpRsp}
   */
  public static final class PersonalSceneJumpRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PersonalSceneJumpRsp)
      PersonalSceneJumpRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PersonalSceneJumpRsp.newBuilder() to construct.
    private PersonalSceneJumpRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PersonalSceneJumpRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PersonalSceneJumpRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PersonalSceneJumpRsp(
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
            case 40: {

              destSceneId_ = input.readUInt32();
              break;
            }
            case 64: {

              retcode_ = input.readInt32();
              break;
            }
            case 90: {
              io.grasscutter.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (destPos_ != null) {
                subBuilder = destPos_.toBuilder();
              }
              destPos_ = input.readMessage(io.grasscutter.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(destPos_);
                destPos_ = subBuilder.buildPartial();
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
      return io.grasscutter.proto.PersonalSceneJumpRspOuterClass.internal_static_PersonalSceneJumpRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.PersonalSceneJumpRspOuterClass.internal_static_PersonalSceneJumpRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp.class, io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp.Builder.class);
    }

    public static final int DEST_SCENE_ID_FIELD_NUMBER = 5;
    private int destSceneId_;
    /**
     * <code>uint32 dest_scene_id = 5;</code>
     * @return The destSceneId.
     */
    @java.lang.Override
    public int getDestSceneId() {
      return destSceneId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_;
    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int DEST_POS_FIELD_NUMBER = 11;
    private io.grasscutter.proto.VectorOuterClass.Vector destPos_;
    /**
     * <code>.Vector dest_pos = 11;</code>
     * @return Whether the destPos field is set.
     */
    @java.lang.Override
    public boolean hasDestPos() {
      return destPos_ != null;
    }
    /**
     * <code>.Vector dest_pos = 11;</code>
     * @return The destPos.
     */
    @java.lang.Override
    public io.grasscutter.proto.VectorOuterClass.Vector getDestPos() {
      return destPos_ == null ? io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : destPos_;
    }
    /**
     * <code>.Vector dest_pos = 11;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getDestPosOrBuilder() {
      return getDestPos();
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
      if (destSceneId_ != 0) {
        output.writeUInt32(5, destSceneId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      if (destPos_ != null) {
        output.writeMessage(11, getDestPos());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (destSceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, destSceneId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
      }
      if (destPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getDestPos());
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
      if (!(obj instanceof io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp other = (io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp) obj;

      if (getDestSceneId()
          != other.getDestSceneId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (hasDestPos() != other.hasDestPos()) return false;
      if (hasDestPos()) {
        if (!getDestPos()
            .equals(other.getDestPos())) return false;
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
      hash = (37 * hash) + DEST_SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDestSceneId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (hasDestPos()) {
        hash = (37 * hash) + DEST_POS_FIELD_NUMBER;
        hash = (53 * hash) + getDestPos().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp prototype) {
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
     * CmdId: 280
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code PersonalSceneJumpRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PersonalSceneJumpRsp)
        io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.PersonalSceneJumpRspOuterClass.internal_static_PersonalSceneJumpRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.PersonalSceneJumpRspOuterClass.internal_static_PersonalSceneJumpRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp.class, io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp.Builder.class);
      }

      // Construct using io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp.newBuilder()
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
        destSceneId_ = 0;

        retcode_ = 0;

        if (destPosBuilder_ == null) {
          destPos_ = null;
        } else {
          destPos_ = null;
          destPosBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.PersonalSceneJumpRspOuterClass.internal_static_PersonalSceneJumpRsp_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp getDefaultInstanceForType() {
        return io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp build() {
        io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp buildPartial() {
        io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp result = new io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp(this);
        result.destSceneId_ = destSceneId_;
        result.retcode_ = retcode_;
        if (destPosBuilder_ == null) {
          result.destPos_ = destPos_;
        } else {
          result.destPos_ = destPosBuilder_.build();
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
        if (other instanceof io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp) {
          return mergeFrom((io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp other) {
        if (other == io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp.getDefaultInstance()) return this;
        if (other.getDestSceneId() != 0) {
          setDestSceneId(other.getDestSceneId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.hasDestPos()) {
          mergeDestPos(other.getDestPos());
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
        io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int destSceneId_ ;
      /**
       * <code>uint32 dest_scene_id = 5;</code>
       * @return The destSceneId.
       */
      @java.lang.Override
      public int getDestSceneId() {
        return destSceneId_;
      }
      /**
       * <code>uint32 dest_scene_id = 5;</code>
       * @param value The destSceneId to set.
       * @return This builder for chaining.
       */
      public Builder setDestSceneId(int value) {
        
        destSceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dest_scene_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearDestSceneId() {
        
        destSceneId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private io.grasscutter.proto.VectorOuterClass.Vector destPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder> destPosBuilder_;
      /**
       * <code>.Vector dest_pos = 11;</code>
       * @return Whether the destPos field is set.
       */
      public boolean hasDestPos() {
        return destPosBuilder_ != null || destPos_ != null;
      }
      /**
       * <code>.Vector dest_pos = 11;</code>
       * @return The destPos.
       */
      public io.grasscutter.proto.VectorOuterClass.Vector getDestPos() {
        if (destPosBuilder_ == null) {
          return destPos_ == null ? io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : destPos_;
        } else {
          return destPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector dest_pos = 11;</code>
       */
      public Builder setDestPos(io.grasscutter.proto.VectorOuterClass.Vector value) {
        if (destPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          destPos_ = value;
          onChanged();
        } else {
          destPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector dest_pos = 11;</code>
       */
      public Builder setDestPos(
          io.grasscutter.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (destPosBuilder_ == null) {
          destPos_ = builderForValue.build();
          onChanged();
        } else {
          destPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector dest_pos = 11;</code>
       */
      public Builder mergeDestPos(io.grasscutter.proto.VectorOuterClass.Vector value) {
        if (destPosBuilder_ == null) {
          if (destPos_ != null) {
            destPos_ =
              io.grasscutter.proto.VectorOuterClass.Vector.newBuilder(destPos_).mergeFrom(value).buildPartial();
          } else {
            destPos_ = value;
          }
          onChanged();
        } else {
          destPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector dest_pos = 11;</code>
       */
      public Builder clearDestPos() {
        if (destPosBuilder_ == null) {
          destPos_ = null;
          onChanged();
        } else {
          destPos_ = null;
          destPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector dest_pos = 11;</code>
       */
      public io.grasscutter.proto.VectorOuterClass.Vector.Builder getDestPosBuilder() {
        
        onChanged();
        return getDestPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector dest_pos = 11;</code>
       */
      public io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getDestPosOrBuilder() {
        if (destPosBuilder_ != null) {
          return destPosBuilder_.getMessageOrBuilder();
        } else {
          return destPos_ == null ?
              io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : destPos_;
        }
      }
      /**
       * <code>.Vector dest_pos = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder> 
          getDestPosFieldBuilder() {
        if (destPosBuilder_ == null) {
          destPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder>(
                  getDestPos(),
                  getParentForChildren(),
                  isClean());
          destPos_ = null;
        }
        return destPosBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PersonalSceneJumpRsp)
    }

    // @@protoc_insertion_point(class_scope:PersonalSceneJumpRsp)
    private static final io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp();
    }

    public static io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PersonalSceneJumpRsp>
        PARSER = new com.google.protobuf.AbstractParser<PersonalSceneJumpRsp>() {
      @java.lang.Override
      public PersonalSceneJumpRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PersonalSceneJumpRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PersonalSceneJumpRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PersonalSceneJumpRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PersonalSceneJumpRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PersonalSceneJumpRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032PersonalSceneJumpRsp.proto\032\014Vector.pro" +
      "to\"Y\n\024PersonalSceneJumpRsp\022\025\n\rdest_scene" +
      "_id\030\005 \001(\r\022\017\n\007retcode\030\010 \001(\005\022\031\n\010dest_pos\030\013" +
      " \001(\0132\007.VectorB\026\n\024io.grasscutter.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_PersonalSceneJumpRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PersonalSceneJumpRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PersonalSceneJumpRsp_descriptor,
        new java.lang.String[] { "DestSceneId", "Retcode", "DestPos", });
    io.grasscutter.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
