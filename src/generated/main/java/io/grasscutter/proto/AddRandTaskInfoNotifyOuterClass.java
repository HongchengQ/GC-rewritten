// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AddRandTaskInfoNotify.proto

package io.grasscutter.proto;

public final class AddRandTaskInfoNotifyOuterClass {
  private AddRandTaskInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AddRandTaskInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AddRandTaskInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 rand_task_id = 5;</code>
     * @return The randTaskId.
     */
    int getRandTaskId();

    /**
     * <code>.Vector pos = 13;</code>
     * @return Whether the pos field is set.
     */
    boolean hasPos();
    /**
     * <code>.Vector pos = 13;</code>
     * @return The pos.
     */
    io.grasscutter.proto.VectorOuterClass.Vector getPos();
    /**
     * <code>.Vector pos = 13;</code>
     */
    io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 119
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code AddRandTaskInfoNotify}
   */
  public static final class AddRandTaskInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AddRandTaskInfoNotify)
      AddRandTaskInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AddRandTaskInfoNotify.newBuilder() to construct.
    private AddRandTaskInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AddRandTaskInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AddRandTaskInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AddRandTaskInfoNotify(
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

              randTaskId_ = input.readUInt32();
              break;
            }
            case 106: {
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
      return io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.internal_static_AddRandTaskInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.internal_static_AddRandTaskInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify.class, io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify.Builder.class);
    }

    public static final int RAND_TASK_ID_FIELD_NUMBER = 5;
    private int randTaskId_;
    /**
     * <code>uint32 rand_task_id = 5;</code>
     * @return The randTaskId.
     */
    @java.lang.Override
    public int getRandTaskId() {
      return randTaskId_;
    }

    public static final int POS_FIELD_NUMBER = 13;
    private io.grasscutter.proto.VectorOuterClass.Vector pos_;
    /**
     * <code>.Vector pos = 13;</code>
     * @return Whether the pos field is set.
     */
    @java.lang.Override
    public boolean hasPos() {
      return pos_ != null;
    }
    /**
     * <code>.Vector pos = 13;</code>
     * @return The pos.
     */
    @java.lang.Override
    public io.grasscutter.proto.VectorOuterClass.Vector getPos() {
      return pos_ == null ? io.grasscutter.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
    }
    /**
     * <code>.Vector pos = 13;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
      return getPos();
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
      if (randTaskId_ != 0) {
        output.writeUInt32(5, randTaskId_);
      }
      if (pos_ != null) {
        output.writeMessage(13, getPos());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (randTaskId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, randTaskId_);
      }
      if (pos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getPos());
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
      if (!(obj instanceof io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify other = (io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify) obj;

      if (getRandTaskId()
          != other.getRandTaskId()) return false;
      if (hasPos() != other.hasPos()) return false;
      if (hasPos()) {
        if (!getPos()
            .equals(other.getPos())) return false;
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
      hash = (37 * hash) + RAND_TASK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRandTaskId();
      if (hasPos()) {
        hash = (37 * hash) + POS_FIELD_NUMBER;
        hash = (53 * hash) + getPos().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify prototype) {
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
     * CmdId: 119
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code AddRandTaskInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AddRandTaskInfoNotify)
        io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.internal_static_AddRandTaskInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.internal_static_AddRandTaskInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify.class, io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify.newBuilder()
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
        randTaskId_ = 0;

        if (posBuilder_ == null) {
          pos_ = null;
        } else {
          pos_ = null;
          posBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.internal_static_AddRandTaskInfoNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify build() {
        io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify buildPartial() {
        io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify result = new io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify(this);
        result.randTaskId_ = randTaskId_;
        if (posBuilder_ == null) {
          result.pos_ = pos_;
        } else {
          result.pos_ = posBuilder_.build();
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
        if (other instanceof io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify) {
          return mergeFrom((io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify other) {
        if (other == io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify.getDefaultInstance()) return this;
        if (other.getRandTaskId() != 0) {
          setRandTaskId(other.getRandTaskId());
        }
        if (other.hasPos()) {
          mergePos(other.getPos());
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
        io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int randTaskId_ ;
      /**
       * <code>uint32 rand_task_id = 5;</code>
       * @return The randTaskId.
       */
      @java.lang.Override
      public int getRandTaskId() {
        return randTaskId_;
      }
      /**
       * <code>uint32 rand_task_id = 5;</code>
       * @param value The randTaskId to set.
       * @return This builder for chaining.
       */
      public Builder setRandTaskId(int value) {
        
        randTaskId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rand_task_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRandTaskId() {
        
        randTaskId_ = 0;
        onChanged();
        return this;
      }

      private io.grasscutter.proto.VectorOuterClass.Vector pos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.VectorOuterClass.Vector, io.grasscutter.proto.VectorOuterClass.Vector.Builder, io.grasscutter.proto.VectorOuterClass.VectorOrBuilder> posBuilder_;
      /**
       * <code>.Vector pos = 13;</code>
       * @return Whether the pos field is set.
       */
      public boolean hasPos() {
        return posBuilder_ != null || pos_ != null;
      }
      /**
       * <code>.Vector pos = 13;</code>
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
       * <code>.Vector pos = 13;</code>
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
       * <code>.Vector pos = 13;</code>
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
       * <code>.Vector pos = 13;</code>
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
       * <code>.Vector pos = 13;</code>
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
       * <code>.Vector pos = 13;</code>
       */
      public io.grasscutter.proto.VectorOuterClass.Vector.Builder getPosBuilder() {
        
        onChanged();
        return getPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector pos = 13;</code>
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
       * <code>.Vector pos = 13;</code>
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


      // @@protoc_insertion_point(builder_scope:AddRandTaskInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:AddRandTaskInfoNotify)
    private static final io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify();
    }

    public static io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AddRandTaskInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<AddRandTaskInfoNotify>() {
      @java.lang.Override
      public AddRandTaskInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AddRandTaskInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AddRandTaskInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AddRandTaskInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.AddRandTaskInfoNotifyOuterClass.AddRandTaskInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AddRandTaskInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AddRandTaskInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033AddRandTaskInfoNotify.proto\032\014Vector.pr" +
      "oto\"C\n\025AddRandTaskInfoNotify\022\024\n\014rand_tas" +
      "k_id\030\005 \001(\r\022\024\n\003pos\030\r \001(\0132\007.VectorB\026\n\024io.g" +
      "rasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_AddRandTaskInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AddRandTaskInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AddRandTaskInfoNotify_descriptor,
        new java.lang.String[] { "RandTaskId", "Pos", });
    io.grasscutter.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
