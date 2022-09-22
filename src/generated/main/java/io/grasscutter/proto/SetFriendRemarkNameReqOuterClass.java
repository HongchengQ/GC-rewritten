// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetFriendRemarkNameReq.proto

package io.grasscutter.proto;

public final class SetFriendRemarkNameReqOuterClass {
  private SetFriendRemarkNameReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetFriendRemarkNameReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetFriendRemarkNameReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 uid = 10;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>string remark_name = 8;</code>
     * @return The remarkName.
     */
    java.lang.String getRemarkName();
    /**
     * <code>string remark_name = 8;</code>
     * @return The bytes for remarkName.
     */
    com.google.protobuf.ByteString
        getRemarkNameBytes();
  }
  /**
   * <pre>
   * CmdId: 4042
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code SetFriendRemarkNameReq}
   */
  public static final class SetFriendRemarkNameReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetFriendRemarkNameReq)
      SetFriendRemarkNameReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetFriendRemarkNameReq.newBuilder() to construct.
    private SetFriendRemarkNameReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetFriendRemarkNameReq() {
      remarkName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetFriendRemarkNameReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetFriendRemarkNameReq(
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
            case 66: {
              java.lang.String s = input.readStringRequireUtf8();

              remarkName_ = s;
              break;
            }
            case 80: {

              uid_ = input.readUInt32();
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
      return io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.internal_static_SetFriendRemarkNameReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.internal_static_SetFriendRemarkNameReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq.class, io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 10;
    private int uid_;
    /**
     * <code>uint32 uid = 10;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int REMARK_NAME_FIELD_NUMBER = 8;
    private volatile java.lang.Object remarkName_;
    /**
     * <code>string remark_name = 8;</code>
     * @return The remarkName.
     */
    @java.lang.Override
    public java.lang.String getRemarkName() {
      java.lang.Object ref = remarkName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        remarkName_ = s;
        return s;
      }
    }
    /**
     * <code>string remark_name = 8;</code>
     * @return The bytes for remarkName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRemarkNameBytes() {
      java.lang.Object ref = remarkName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        remarkName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(remarkName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, remarkName_);
      }
      if (uid_ != 0) {
        output.writeUInt32(10, uid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(remarkName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, remarkName_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, uid_);
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
      if (!(obj instanceof io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq other = (io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq) obj;

      if (getUid()
          != other.getUid()) return false;
      if (!getRemarkName()
          .equals(other.getRemarkName())) return false;
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
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + REMARK_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getRemarkName().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq prototype) {
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
     * CmdId: 4042
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code SetFriendRemarkNameReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetFriendRemarkNameReq)
        io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.internal_static_SetFriendRemarkNameReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.internal_static_SetFriendRemarkNameReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq.class, io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq.Builder.class);
      }

      // Construct using io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq.newBuilder()
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
        uid_ = 0;

        remarkName_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.internal_static_SetFriendRemarkNameReq_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq getDefaultInstanceForType() {
        return io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq build() {
        io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq buildPartial() {
        io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq result = new io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq(this);
        result.uid_ = uid_;
        result.remarkName_ = remarkName_;
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
        if (other instanceof io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq) {
          return mergeFrom((io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq other) {
        if (other == io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (!other.getRemarkName().isEmpty()) {
          remarkName_ = other.remarkName_;
          onChanged();
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
        io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 10;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 10;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object remarkName_ = "";
      /**
       * <code>string remark_name = 8;</code>
       * @return The remarkName.
       */
      public java.lang.String getRemarkName() {
        java.lang.Object ref = remarkName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          remarkName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string remark_name = 8;</code>
       * @return The bytes for remarkName.
       */
      public com.google.protobuf.ByteString
          getRemarkNameBytes() {
        java.lang.Object ref = remarkName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          remarkName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string remark_name = 8;</code>
       * @param value The remarkName to set.
       * @return This builder for chaining.
       */
      public Builder setRemarkName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        remarkName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string remark_name = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRemarkName() {
        
        remarkName_ = getDefaultInstance().getRemarkName();
        onChanged();
        return this;
      }
      /**
       * <code>string remark_name = 8;</code>
       * @param value The bytes for remarkName to set.
       * @return This builder for chaining.
       */
      public Builder setRemarkNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        remarkName_ = value;
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


      // @@protoc_insertion_point(builder_scope:SetFriendRemarkNameReq)
    }

    // @@protoc_insertion_point(class_scope:SetFriendRemarkNameReq)
    private static final io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq();
    }

    public static io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetFriendRemarkNameReq>
        PARSER = new com.google.protobuf.AbstractParser<SetFriendRemarkNameReq>() {
      @java.lang.Override
      public SetFriendRemarkNameReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetFriendRemarkNameReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SetFriendRemarkNameReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetFriendRemarkNameReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetFriendRemarkNameReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetFriendRemarkNameReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SetFriendRemarkNameReq.proto\":\n\026SetFri" +
      "endRemarkNameReq\022\013\n\003uid\030\n \001(\r\022\023\n\013remark_" +
      "name\030\010 \001(\tB\026\n\024io.grasscutter.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SetFriendRemarkNameReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetFriendRemarkNameReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetFriendRemarkNameReq_descriptor,
        new java.lang.String[] { "Uid", "RemarkName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
