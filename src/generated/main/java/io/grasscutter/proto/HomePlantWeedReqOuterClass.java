// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomePlantWeedReq.proto

package io.grasscutter.proto;

public final class HomePlantWeedReqOuterClass {
  private HomePlantWeedReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomePlantWeedReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomePlantWeedReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 field_guid = 9;</code>
     * @return The fieldGuid.
     */
    int getFieldGuid();

    /**
     * <code>uint32 index = 3;</code>
     * @return The index.
     */
    int getIndex();
  }
  /**
   * <pre>
   * CmdId: 4640
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code HomePlantWeedReq}
   */
  public static final class HomePlantWeedReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomePlantWeedReq)
      HomePlantWeedReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomePlantWeedReq.newBuilder() to construct.
    private HomePlantWeedReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomePlantWeedReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomePlantWeedReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomePlantWeedReq(
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

              index_ = input.readUInt32();
              break;
            }
            case 72: {

              fieldGuid_ = input.readUInt32();
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
      return io.grasscutter.proto.HomePlantWeedReqOuterClass.internal_static_HomePlantWeedReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.HomePlantWeedReqOuterClass.internal_static_HomePlantWeedReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq.class, io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq.Builder.class);
    }

    public static final int FIELD_GUID_FIELD_NUMBER = 9;
    private int fieldGuid_;
    /**
     * <code>uint32 field_guid = 9;</code>
     * @return The fieldGuid.
     */
    @java.lang.Override
    public int getFieldGuid() {
      return fieldGuid_;
    }

    public static final int INDEX_FIELD_NUMBER = 3;
    private int index_;
    /**
     * <code>uint32 index = 3;</code>
     * @return The index.
     */
    @java.lang.Override
    public int getIndex() {
      return index_;
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
      if (index_ != 0) {
        output.writeUInt32(3, index_);
      }
      if (fieldGuid_ != 0) {
        output.writeUInt32(9, fieldGuid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (index_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, index_);
      }
      if (fieldGuid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, fieldGuid_);
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
      if (!(obj instanceof io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq other = (io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq) obj;

      if (getFieldGuid()
          != other.getFieldGuid()) return false;
      if (getIndex()
          != other.getIndex()) return false;
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
      hash = (37 * hash) + FIELD_GUID_FIELD_NUMBER;
      hash = (53 * hash) + getFieldGuid();
      hash = (37 * hash) + INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getIndex();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq prototype) {
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
     * CmdId: 4640
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code HomePlantWeedReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomePlantWeedReq)
        io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.HomePlantWeedReqOuterClass.internal_static_HomePlantWeedReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.HomePlantWeedReqOuterClass.internal_static_HomePlantWeedReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq.class, io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq.Builder.class);
      }

      // Construct using io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq.newBuilder()
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
        fieldGuid_ = 0;

        index_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.HomePlantWeedReqOuterClass.internal_static_HomePlantWeedReq_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq getDefaultInstanceForType() {
        return io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq build() {
        io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq buildPartial() {
        io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq result = new io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq(this);
        result.fieldGuid_ = fieldGuid_;
        result.index_ = index_;
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
        if (other instanceof io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq) {
          return mergeFrom((io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq other) {
        if (other == io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq.getDefaultInstance()) return this;
        if (other.getFieldGuid() != 0) {
          setFieldGuid(other.getFieldGuid());
        }
        if (other.getIndex() != 0) {
          setIndex(other.getIndex());
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
        io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int fieldGuid_ ;
      /**
       * <code>uint32 field_guid = 9;</code>
       * @return The fieldGuid.
       */
      @java.lang.Override
      public int getFieldGuid() {
        return fieldGuid_;
      }
      /**
       * <code>uint32 field_guid = 9;</code>
       * @param value The fieldGuid to set.
       * @return This builder for chaining.
       */
      public Builder setFieldGuid(int value) {
        
        fieldGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 field_guid = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearFieldGuid() {
        
        fieldGuid_ = 0;
        onChanged();
        return this;
      }

      private int index_ ;
      /**
       * <code>uint32 index = 3;</code>
       * @return The index.
       */
      @java.lang.Override
      public int getIndex() {
        return index_;
      }
      /**
       * <code>uint32 index = 3;</code>
       * @param value The index to set.
       * @return This builder for chaining.
       */
      public Builder setIndex(int value) {
        
        index_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 index = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIndex() {
        
        index_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomePlantWeedReq)
    }

    // @@protoc_insertion_point(class_scope:HomePlantWeedReq)
    private static final io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq();
    }

    public static io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomePlantWeedReq>
        PARSER = new com.google.protobuf.AbstractParser<HomePlantWeedReq>() {
      @java.lang.Override
      public HomePlantWeedReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomePlantWeedReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomePlantWeedReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomePlantWeedReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.HomePlantWeedReqOuterClass.HomePlantWeedReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomePlantWeedReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomePlantWeedReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026HomePlantWeedReq.proto\"5\n\020HomePlantWee" +
      "dReq\022\022\n\nfield_guid\030\t \001(\r\022\r\n\005index\030\003 \001(\rB" +
      "\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomePlantWeedReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomePlantWeedReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomePlantWeedReq_descriptor,
        new java.lang.String[] { "FieldGuid", "Index", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
