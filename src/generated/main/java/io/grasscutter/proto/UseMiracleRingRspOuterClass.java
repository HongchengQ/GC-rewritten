// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UseMiracleRingRsp.proto

package io.grasscutter.proto;

public final class UseMiracleRingRspOuterClass {
  private UseMiracleRingRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UseMiracleRingRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UseMiracleRingRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 miracle_ring_op_type = 7;</code>
     * @return The miracleRingOpType.
     */
    int getMiracleRingOpType();
  }
  /**
   * <pre>
   * CmdId: 5218
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code UseMiracleRingRsp}
   */
  public static final class UseMiracleRingRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UseMiracleRingRsp)
      UseMiracleRingRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UseMiracleRingRsp.newBuilder() to construct.
    private UseMiracleRingRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UseMiracleRingRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UseMiracleRingRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UseMiracleRingRsp(
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
            case 56: {

              miracleRingOpType_ = input.readUInt32();
              break;
            }
            case 88: {

              retcode_ = input.readInt32();
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
      return io.grasscutter.proto.UseMiracleRingRspOuterClass.internal_static_UseMiracleRingRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.UseMiracleRingRspOuterClass.internal_static_UseMiracleRingRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp.class, io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 11;
    private int retcode_;
    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int MIRACLE_RING_OP_TYPE_FIELD_NUMBER = 7;
    private int miracleRingOpType_;
    /**
     * <code>uint32 miracle_ring_op_type = 7;</code>
     * @return The miracleRingOpType.
     */
    @java.lang.Override
    public int getMiracleRingOpType() {
      return miracleRingOpType_;
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
      if (miracleRingOpType_ != 0) {
        output.writeUInt32(7, miracleRingOpType_);
      }
      if (retcode_ != 0) {
        output.writeInt32(11, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (miracleRingOpType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, miracleRingOpType_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, retcode_);
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
      if (!(obj instanceof io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp other = (io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getMiracleRingOpType()
          != other.getMiracleRingOpType()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + MIRACLE_RING_OP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getMiracleRingOpType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp prototype) {
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
     * CmdId: 5218
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code UseMiracleRingRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UseMiracleRingRsp)
        io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.UseMiracleRingRspOuterClass.internal_static_UseMiracleRingRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.UseMiracleRingRspOuterClass.internal_static_UseMiracleRingRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp.class, io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp.Builder.class);
      }

      // Construct using io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp.newBuilder()
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
        retcode_ = 0;

        miracleRingOpType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.UseMiracleRingRspOuterClass.internal_static_UseMiracleRingRsp_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp getDefaultInstanceForType() {
        return io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp build() {
        io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp buildPartial() {
        io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp result = new io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp(this);
        result.retcode_ = retcode_;
        result.miracleRingOpType_ = miracleRingOpType_;
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
        if (other instanceof io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp) {
          return mergeFrom((io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp other) {
        if (other == io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getMiracleRingOpType() != 0) {
          setMiracleRingOpType(other.getMiracleRingOpType());
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
        io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 11;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int miracleRingOpType_ ;
      /**
       * <code>uint32 miracle_ring_op_type = 7;</code>
       * @return The miracleRingOpType.
       */
      @java.lang.Override
      public int getMiracleRingOpType() {
        return miracleRingOpType_;
      }
      /**
       * <code>uint32 miracle_ring_op_type = 7;</code>
       * @param value The miracleRingOpType to set.
       * @return This builder for chaining.
       */
      public Builder setMiracleRingOpType(int value) {
        
        miracleRingOpType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 miracle_ring_op_type = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearMiracleRingOpType() {
        
        miracleRingOpType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:UseMiracleRingRsp)
    }

    // @@protoc_insertion_point(class_scope:UseMiracleRingRsp)
    private static final io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp();
    }

    public static io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UseMiracleRingRsp>
        PARSER = new com.google.protobuf.AbstractParser<UseMiracleRingRsp>() {
      @java.lang.Override
      public UseMiracleRingRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UseMiracleRingRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UseMiracleRingRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UseMiracleRingRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.UseMiracleRingRspOuterClass.UseMiracleRingRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UseMiracleRingRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UseMiracleRingRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027UseMiracleRingRsp.proto\"B\n\021UseMiracleR" +
      "ingRsp\022\017\n\007retcode\030\013 \001(\005\022\034\n\024miracle_ring_" +
      "op_type\030\007 \001(\rB\026\n\024io.grasscutter.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UseMiracleRingRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UseMiracleRingRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UseMiracleRingRsp_descriptor,
        new java.lang.String[] { "Retcode", "MiracleRingOpType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
