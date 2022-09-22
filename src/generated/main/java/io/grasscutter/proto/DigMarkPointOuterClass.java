// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DigMarkPoint.proto

package io.grasscutter.proto;

public final class DigMarkPointOuterClass {
  private DigMarkPointOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DigMarkPointOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DigMarkPoint)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector pos = 1;</code>
     * @return Whether the pos field is set.
     */
    boolean hasPos();
    /**
     * <code>.Vector pos = 1;</code>
     * @return The pos.
     */
    io.grasscutter.proto.VectorOuterClass.Vector getPos();
    /**
     * <code>.Vector pos = 1;</code>
     */
    io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder();

    /**
     * <code>uint32 bundle_id = 13;</code>
     * @return The bundleId.
     */
    int getBundleId();

    /**
     * <code>.Vector rot = 3;</code>
     * @return Whether the rot field is set.
     */
    boolean hasRot();
    /**
     * <code>.Vector rot = 3;</code>
     * @return The rot.
     */
    io.grasscutter.proto.VectorOuterClass.Vector getRot();
    /**
     * <code>.Vector rot = 3;</code>
     */
    io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getRotOrBuilder();
  }
  /**
   * Protobuf type {@code DigMarkPoint}
   */
  public static final class DigMarkPoint extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DigMarkPoint)
      DigMarkPointOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DigMarkPoint.newBuilder() to construct.
    private DigMarkPoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DigMarkPoint() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DigMarkPoint();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DigMarkPoint(
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
              if (pos_ != null) {
                subBuilder = pos_.toBuilder();
              }
              pos_ = input.readMessage(io.grasscutter.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(pos_);
                pos_ = subBuilder.buildPartial();
              }

              break;
            }
            case 26: {
              io.grasscutter.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (rot_ != null) {
                subBuilder = rot_.toBuilder();
              }
              rot_ = input.readMessage(io.grasscutter.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(rot_);
                rot_ = subBuilder.buildPartial();
              }

              break;
            }
            case 104: {

              bundleId_ = input.readUInt32();
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
      return io.grasscutter.proto.DigMarkPointOuterClass.internal_static_DigMarkPoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.DigMarkPointOuterClass.internal_static_DigMarkPoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint.class, io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint.Builder.class);
    }

    public static final int POS_FIELD_NUMBER = 1;
    private io.grasscutter.proto.VectorOuterClass.Vector pos_;
    /**
     * <code>.Vector pos = 1;</code>
     * @return Whether the pos field is set.
     */
    @java.lang.Override
    public boolean hasPos() {
      return pos_ != null;
    }
    /**
     * <code>.Vector pos = 1;</code>
     * @return The pos.
     */
    @java.lang.Override
    public io.grasscutter.proto.VectorOuterClass.Vector getPos() {
      return pos_ == null ? io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
    }
    /**
     * <code>.Vector pos = 1;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
      return getPos();
    }

    public static final int BUNDLE_ID_FIELD_NUMBER = 13;
    private int bundleId_;
    /**
     * <code>uint32 bundle_id = 13;</code>
     * @return The bundleId.
     */
    @java.lang.Override
    public int getBundleId() {
      return bundleId_;
    }

    public static final int ROT_FIELD_NUMBER = 3;
    private io.grasscutter.proto.VectorOuterClass.Vector rot_;
    /**
     * <code>.Vector rot = 3;</code>
     * @return Whether the rot field is set.
     */
    @java.lang.Override
    public boolean hasRot() {
      return rot_ != null;
    }
    /**
     * <code>.Vector rot = 3;</code>
     * @return The rot.
     */
    @java.lang.Override
    public io.grasscutter.proto.VectorOuterClass.Vector getRot() {
      return rot_ == null ? io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
    }
    /**
     * <code>.Vector rot = 3;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
      return getRot();
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
      if (pos_ != null) {
        output.writeMessage(1, getPos());
      }
      if (rot_ != null) {
        output.writeMessage(3, getRot());
      }
      if (bundleId_ != 0) {
        output.writeUInt32(13, bundleId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getPos());
      }
      if (rot_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getRot());
      }
      if (bundleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, bundleId_);
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
      if (!(obj instanceof io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint other = (io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint) obj;

      if (hasPos() != other.hasPos()) return false;
      if (hasPos()) {
        if (!getPos()
            .equals(other.getPos())) return false;
      }
      if (getBundleId()
          != other.getBundleId()) return false;
      if (hasRot() != other.hasRot()) return false;
      if (hasRot()) {
        if (!getRot()
            .equals(other.getRot())) return false;
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
      if (hasPos()) {
        hash = (37 * hash) + POS_FIELD_NUMBER;
        hash = (53 * hash) + getPos().hashCode();
      }
      hash = (37 * hash) + BUNDLE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBundleId();
      if (hasRot()) {
        hash = (37 * hash) + ROT_FIELD_NUMBER;
        hash = (53 * hash) + getRot().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint prototype) {
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
     * Protobuf type {@code DigMarkPoint}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DigMarkPoint)
        io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPointOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.DigMarkPointOuterClass.internal_static_DigMarkPoint_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.DigMarkPointOuterClass.internal_static_DigMarkPoint_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint.class, io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint.Builder.class);
      }

      // Construct using io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint.newBuilder()
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
        if (posBuilder_ == null) {
          pos_ = null;
        } else {
          pos_ = null;
          posBuilder_ = null;
        }
        bundleId_ = 0;

        if (rotBuilder_ == null) {
          rot_ = null;
        } else {
          rot_ = null;
          rotBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.DigMarkPointOuterClass.internal_static_DigMarkPoint_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint getDefaultInstanceForType() {
        return io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint build() {
        io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint buildPartial() {
        io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint result = new io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint(this);
        if (posBuilder_ == null) {
          result.pos_ = pos_;
        } else {
          result.pos_ = posBuilder_.build();
        }
        result.bundleId_ = bundleId_;
        if (rotBuilder_ == null) {
          result.rot_ = rot_;
        } else {
          result.rot_ = rotBuilder_.build();
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
        if (other instanceof io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint) {
          return mergeFrom((io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint other) {
        if (other == io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint.getDefaultInstance()) return this;
        if (other.hasPos()) {
          mergePos(other.getPos());
        }
        if (other.getBundleId() != 0) {
          setBundleId(other.getBundleId());
        }
        if (other.hasRot()) {
          mergeRot(other.getRot());
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
        io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private io.grasscutter.proto.VectorOuterClass.Vector pos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder> posBuilder_;
      /**
       * <code>.Vector pos = 1;</code>
       * @return Whether the pos field is set.
       */
      public boolean hasPos() {
        return posBuilder_ != null || pos_ != null;
      }
      /**
       * <code>.Vector pos = 1;</code>
       * @return The pos.
       */
      public io.grasscutter.proto.VectorOuterClass.Vector getPos() {
        if (posBuilder_ == null) {
          return pos_ == null ? io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        } else {
          return posBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector pos = 1;</code>
       */
      public Builder setPos(io.grasscutter.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pos_ = value;
          onChanged();
        } else {
          posBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector pos = 1;</code>
       */
      public Builder setPos(
          io.grasscutter.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (posBuilder_ == null) {
          pos_ = builderForValue.build();
          onChanged();
        } else {
          posBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector pos = 1;</code>
       */
      public Builder mergePos(io.grasscutter.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (pos_ != null) {
            pos_ =
              io.grasscutter.proto.VectorOuterClass.Vector.newBuilder(pos_).mergeFrom(value).buildPartial();
          } else {
            pos_ = value;
          }
          onChanged();
        } else {
          posBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector pos = 1;</code>
       */
      public Builder clearPos() {
        if (posBuilder_ == null) {
          pos_ = null;
          onChanged();
        } else {
          pos_ = null;
          posBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector pos = 1;</code>
       */
      public io.grasscutter.proto.VectorOuterClass.Vector.Builder getPosBuilder() {
        
        onChanged();
        return getPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector pos = 1;</code>
       */
      public io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
        if (posBuilder_ != null) {
          return posBuilder_.getMessageOrBuilder();
        } else {
          return pos_ == null ?
              io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        }
      }
      /**
       * <code>.Vector pos = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder> 
          getPosFieldBuilder() {
        if (posBuilder_ == null) {
          posBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder>(
                  getPos(),
                  getParentForChildren(),
                  isClean());
          pos_ = null;
        }
        return posBuilder_;
      }

      private int bundleId_ ;
      /**
       * <code>uint32 bundle_id = 13;</code>
       * @return The bundleId.
       */
      @java.lang.Override
      public int getBundleId() {
        return bundleId_;
      }
      /**
       * <code>uint32 bundle_id = 13;</code>
       * @param value The bundleId to set.
       * @return This builder for chaining.
       */
      public Builder setBundleId(int value) {
        
        bundleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bundle_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearBundleId() {
        
        bundleId_ = 0;
        onChanged();
        return this;
      }

      private io.grasscutter.proto.VectorOuterClass.Vector rot_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder> rotBuilder_;
      /**
       * <code>.Vector rot = 3;</code>
       * @return Whether the rot field is set.
       */
      public boolean hasRot() {
        return rotBuilder_ != null || rot_ != null;
      }
      /**
       * <code>.Vector rot = 3;</code>
       * @return The rot.
       */
      public io.grasscutter.proto.VectorOuterClass.Vector getRot() {
        if (rotBuilder_ == null) {
          return rot_ == null ? io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
        } else {
          return rotBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector rot = 3;</code>
       */
      public Builder setRot(io.grasscutter.proto.VectorOuterClass.Vector value) {
        if (rotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rot_ = value;
          onChanged();
        } else {
          rotBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector rot = 3;</code>
       */
      public Builder setRot(
          io.grasscutter.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (rotBuilder_ == null) {
          rot_ = builderForValue.build();
          onChanged();
        } else {
          rotBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector rot = 3;</code>
       */
      public Builder mergeRot(io.grasscutter.proto.VectorOuterClass.Vector value) {
        if (rotBuilder_ == null) {
          if (rot_ != null) {
            rot_ =
              io.grasscutter.proto.VectorOuterClass.Vector.newBuilder(rot_).mergeFrom(value).buildPartial();
          } else {
            rot_ = value;
          }
          onChanged();
        } else {
          rotBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector rot = 3;</code>
       */
      public Builder clearRot() {
        if (rotBuilder_ == null) {
          rot_ = null;
          onChanged();
        } else {
          rot_ = null;
          rotBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector rot = 3;</code>
       */
      public io.grasscutter.proto.VectorOuterClass.Vector.Builder getRotBuilder() {
        
        onChanged();
        return getRotFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector rot = 3;</code>
       */
      public io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
        if (rotBuilder_ != null) {
          return rotBuilder_.getMessageOrBuilder();
        } else {
          return rot_ == null ?
              io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
        }
      }
      /**
       * <code>.Vector rot = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder> 
          getRotFieldBuilder() {
        if (rotBuilder_ == null) {
          rotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder>(
                  getRot(),
                  getParentForChildren(),
                  isClean());
          rot_ = null;
        }
        return rotBuilder_;
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


      // @@protoc_insertion_point(builder_scope:DigMarkPoint)
    }

    // @@protoc_insertion_point(class_scope:DigMarkPoint)
    private static final io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint();
    }

    public static io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DigMarkPoint>
        PARSER = new com.google.protobuf.AbstractParser<DigMarkPoint>() {
      @java.lang.Override
      public DigMarkPoint parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DigMarkPoint(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DigMarkPoint> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DigMarkPoint> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.DigMarkPointOuterClass.DigMarkPoint getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DigMarkPoint_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DigMarkPoint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022DigMarkPoint.proto\032\014Vector.proto\"M\n\014Di" +
      "gMarkPoint\022\024\n\003pos\030\001 \001(\0132\007.Vector\022\021\n\tbund" +
      "le_id\030\r \001(\r\022\024\n\003rot\030\003 \001(\0132\007.VectorB\026\n\024io." +
      "grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_DigMarkPoint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DigMarkPoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DigMarkPoint_descriptor,
        new java.lang.String[] { "Pos", "BundleId", "Rot", });
    io.grasscutter.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
