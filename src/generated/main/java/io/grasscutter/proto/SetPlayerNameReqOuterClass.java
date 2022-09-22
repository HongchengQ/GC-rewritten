// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetPlayerNameReq.proto

package io.grasscutter.proto;

public final class SetPlayerNameReqOuterClass {
  private SetPlayerNameReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetPlayerNameReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetPlayerNameReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string nick_name = 1;</code>
     * @return The nickName.
     */
    java.lang.String getNickName();
    /**
     * <code>string nick_name = 1;</code>
     * @return The bytes for nickName.
     */
    com.google.protobuf.ByteString
        getNickNameBytes();
  }
  /**
   * <pre>
   * CmdId: 153
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code SetPlayerNameReq}
   */
  public static final class SetPlayerNameReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetPlayerNameReq)
      SetPlayerNameReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetPlayerNameReq.newBuilder() to construct.
    private SetPlayerNameReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetPlayerNameReq() {
      nickName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetPlayerNameReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetPlayerNameReq(
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
              java.lang.String s = input.readStringRequireUtf8();

              nickName_ = s;
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
      return io.grasscutter.proto.SetPlayerNameReqOuterClass.internal_static_SetPlayerNameReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.SetPlayerNameReqOuterClass.internal_static_SetPlayerNameReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq.class, io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq.Builder.class);
    }

    public static final int NICK_NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object nickName_;
    /**
     * <code>string nick_name = 1;</code>
     * @return The nickName.
     */
    @java.lang.Override
    public java.lang.String getNickName() {
      java.lang.Object ref = nickName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nickName_ = s;
        return s;
      }
    }
    /**
     * <code>string nick_name = 1;</code>
     * @return The bytes for nickName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNickNameBytes() {
      java.lang.Object ref = nickName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nickName_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nickName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nickName_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nickName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nickName_);
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
      if (!(obj instanceof io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq other = (io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq) obj;

      if (!getNickName()
          .equals(other.getNickName())) return false;
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
      hash = (37 * hash) + NICK_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getNickName().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq prototype) {
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
     * CmdId: 153
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code SetPlayerNameReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetPlayerNameReq)
        io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.SetPlayerNameReqOuterClass.internal_static_SetPlayerNameReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.SetPlayerNameReqOuterClass.internal_static_SetPlayerNameReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq.class, io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq.Builder.class);
      }

      // Construct using io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq.newBuilder()
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
        nickName_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.SetPlayerNameReqOuterClass.internal_static_SetPlayerNameReq_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq getDefaultInstanceForType() {
        return io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq build() {
        io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq buildPartial() {
        io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq result = new io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq(this);
        result.nickName_ = nickName_;
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
        if (other instanceof io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq) {
          return mergeFrom((io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq other) {
        if (other == io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq.getDefaultInstance()) return this;
        if (!other.getNickName().isEmpty()) {
          nickName_ = other.nickName_;
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
        io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object nickName_ = "";
      /**
       * <code>string nick_name = 1;</code>
       * @return The nickName.
       */
      public java.lang.String getNickName() {
        java.lang.Object ref = nickName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          nickName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string nick_name = 1;</code>
       * @return The bytes for nickName.
       */
      public com.google.protobuf.ByteString
          getNickNameBytes() {
        java.lang.Object ref = nickName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nickName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string nick_name = 1;</code>
       * @param value The nickName to set.
       * @return This builder for chaining.
       */
      public Builder setNickName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        nickName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string nick_name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearNickName() {
        
        nickName_ = getDefaultInstance().getNickName();
        onChanged();
        return this;
      }
      /**
       * <code>string nick_name = 1;</code>
       * @param value The bytes for nickName to set.
       * @return This builder for chaining.
       */
      public Builder setNickNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        nickName_ = value;
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


      // @@protoc_insertion_point(builder_scope:SetPlayerNameReq)
    }

    // @@protoc_insertion_point(class_scope:SetPlayerNameReq)
    private static final io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq();
    }

    public static io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetPlayerNameReq>
        PARSER = new com.google.protobuf.AbstractParser<SetPlayerNameReq>() {
      @java.lang.Override
      public SetPlayerNameReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetPlayerNameReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SetPlayerNameReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetPlayerNameReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetPlayerNameReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetPlayerNameReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026SetPlayerNameReq.proto\"%\n\020SetPlayerNam" +
      "eReq\022\021\n\tnick_name\030\001 \001(\tB\026\n\024io.grasscutte" +
      "r.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SetPlayerNameReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetPlayerNameReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetPlayerNameReq_descriptor,
        new java.lang.String[] { "NickName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
