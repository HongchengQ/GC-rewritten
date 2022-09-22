// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeChooseModuleReq.proto

package io.grasscutter.proto;

public final class HomeChooseModuleReqOuterClass {
  private HomeChooseModuleReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeChooseModuleReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeChooseModuleReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 module_id = 9;</code>
     * @return The moduleId.
     */
    int getModuleId();
  }
  /**
   * <pre>
   * CmdId: 4524
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code HomeChooseModuleReq}
   */
  public static final class HomeChooseModuleReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeChooseModuleReq)
      HomeChooseModuleReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeChooseModuleReq.newBuilder() to construct.
    private HomeChooseModuleReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeChooseModuleReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeChooseModuleReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeChooseModuleReq(
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
            case 72: {

              moduleId_ = input.readUInt32();
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
      return io.grasscutter.proto.HomeChooseModuleReqOuterClass.internal_static_HomeChooseModuleReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.HomeChooseModuleReqOuterClass.internal_static_HomeChooseModuleReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq.class, io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq.Builder.class);
    }

    public static final int MODULE_ID_FIELD_NUMBER = 9;
    private int moduleId_;
    /**
     * <code>uint32 module_id = 9;</code>
     * @return The moduleId.
     */
    @java.lang.Override
    public int getModuleId() {
      return moduleId_;
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
      if (moduleId_ != 0) {
        output.writeUInt32(9, moduleId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (moduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, moduleId_);
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
      if (!(obj instanceof io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq other = (io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq) obj;

      if (getModuleId()
          != other.getModuleId()) return false;
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
      hash = (37 * hash) + MODULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getModuleId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq prototype) {
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
     * CmdId: 4524
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code HomeChooseModuleReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeChooseModuleReq)
        io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.HomeChooseModuleReqOuterClass.internal_static_HomeChooseModuleReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.HomeChooseModuleReqOuterClass.internal_static_HomeChooseModuleReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq.class, io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq.Builder.class);
      }

      // Construct using io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq.newBuilder()
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
        moduleId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.HomeChooseModuleReqOuterClass.internal_static_HomeChooseModuleReq_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq getDefaultInstanceForType() {
        return io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq build() {
        io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq buildPartial() {
        io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq result = new io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq(this);
        result.moduleId_ = moduleId_;
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
        if (other instanceof io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq) {
          return mergeFrom((io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq other) {
        if (other == io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq.getDefaultInstance()) return this;
        if (other.getModuleId() != 0) {
          setModuleId(other.getModuleId());
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
        io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int moduleId_ ;
      /**
       * <code>uint32 module_id = 9;</code>
       * @return The moduleId.
       */
      @java.lang.Override
      public int getModuleId() {
        return moduleId_;
      }
      /**
       * <code>uint32 module_id = 9;</code>
       * @param value The moduleId to set.
       * @return This builder for chaining.
       */
      public Builder setModuleId(int value) {
        
        moduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 module_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearModuleId() {
        
        moduleId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeChooseModuleReq)
    }

    // @@protoc_insertion_point(class_scope:HomeChooseModuleReq)
    private static final io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq();
    }

    public static io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeChooseModuleReq>
        PARSER = new com.google.protobuf.AbstractParser<HomeChooseModuleReq>() {
      @java.lang.Override
      public HomeChooseModuleReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeChooseModuleReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeChooseModuleReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeChooseModuleReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeChooseModuleReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeChooseModuleReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031HomeChooseModuleReq.proto\"(\n\023HomeChoos" +
      "eModuleReq\022\021\n\tmodule_id\030\t \001(\rB\026\n\024io.gras" +
      "scutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeChooseModuleReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeChooseModuleReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeChooseModuleReq_descriptor,
        new java.lang.String[] { "ModuleId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
