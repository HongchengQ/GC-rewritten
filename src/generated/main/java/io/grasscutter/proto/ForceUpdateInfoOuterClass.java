// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ForceUpdateInfo.proto

package io.grasscutter.proto;

public final class ForceUpdateInfoOuterClass {
  private ForceUpdateInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ForceUpdateInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ForceUpdateInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string force_update_url = 1;</code>
     * @return The forceUpdateUrl.
     */
    java.lang.String getForceUpdateUrl();
    /**
     * <code>string force_update_url = 1;</code>
     * @return The bytes for forceUpdateUrl.
     */
    com.google.protobuf.ByteString
        getForceUpdateUrlBytes();
  }
  /**
   * Protobuf type {@code ForceUpdateInfo}
   */
  public static final class ForceUpdateInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ForceUpdateInfo)
      ForceUpdateInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ForceUpdateInfo.newBuilder() to construct.
    private ForceUpdateInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ForceUpdateInfo() {
      forceUpdateUrl_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ForceUpdateInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ForceUpdateInfo(
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

              forceUpdateUrl_ = s;
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
      return io.grasscutter.proto.ForceUpdateInfoOuterClass.internal_static_ForceUpdateInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.ForceUpdateInfoOuterClass.internal_static_ForceUpdateInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo.class, io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo.Builder.class);
    }

    public static final int FORCE_UPDATE_URL_FIELD_NUMBER = 1;
    private volatile java.lang.Object forceUpdateUrl_;
    /**
     * <code>string force_update_url = 1;</code>
     * @return The forceUpdateUrl.
     */
    @java.lang.Override
    public java.lang.String getForceUpdateUrl() {
      java.lang.Object ref = forceUpdateUrl_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        forceUpdateUrl_ = s;
        return s;
      }
    }
    /**
     * <code>string force_update_url = 1;</code>
     * @return The bytes for forceUpdateUrl.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getForceUpdateUrlBytes() {
      java.lang.Object ref = forceUpdateUrl_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        forceUpdateUrl_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(forceUpdateUrl_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, forceUpdateUrl_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(forceUpdateUrl_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, forceUpdateUrl_);
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
      if (!(obj instanceof io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo other = (io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo) obj;

      if (!getForceUpdateUrl()
          .equals(other.getForceUpdateUrl())) return false;
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
      hash = (37 * hash) + FORCE_UPDATE_URL_FIELD_NUMBER;
      hash = (53 * hash) + getForceUpdateUrl().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo prototype) {
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
     * Protobuf type {@code ForceUpdateInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ForceUpdateInfo)
        io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.ForceUpdateInfoOuterClass.internal_static_ForceUpdateInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.ForceUpdateInfoOuterClass.internal_static_ForceUpdateInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo.class, io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo.Builder.class);
      }

      // Construct using io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo.newBuilder()
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
        forceUpdateUrl_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.ForceUpdateInfoOuterClass.internal_static_ForceUpdateInfo_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo getDefaultInstanceForType() {
        return io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo build() {
        io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo buildPartial() {
        io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo result = new io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo(this);
        result.forceUpdateUrl_ = forceUpdateUrl_;
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
        if (other instanceof io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo) {
          return mergeFrom((io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo other) {
        if (other == io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo.getDefaultInstance()) return this;
        if (!other.getForceUpdateUrl().isEmpty()) {
          forceUpdateUrl_ = other.forceUpdateUrl_;
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
        io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object forceUpdateUrl_ = "";
      /**
       * <code>string force_update_url = 1;</code>
       * @return The forceUpdateUrl.
       */
      public java.lang.String getForceUpdateUrl() {
        java.lang.Object ref = forceUpdateUrl_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          forceUpdateUrl_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string force_update_url = 1;</code>
       * @return The bytes for forceUpdateUrl.
       */
      public com.google.protobuf.ByteString
          getForceUpdateUrlBytes() {
        java.lang.Object ref = forceUpdateUrl_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          forceUpdateUrl_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string force_update_url = 1;</code>
       * @param value The forceUpdateUrl to set.
       * @return This builder for chaining.
       */
      public Builder setForceUpdateUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        forceUpdateUrl_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string force_update_url = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearForceUpdateUrl() {
        
        forceUpdateUrl_ = getDefaultInstance().getForceUpdateUrl();
        onChanged();
        return this;
      }
      /**
       * <code>string force_update_url = 1;</code>
       * @param value The bytes for forceUpdateUrl to set.
       * @return This builder for chaining.
       */
      public Builder setForceUpdateUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        forceUpdateUrl_ = value;
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


      // @@protoc_insertion_point(builder_scope:ForceUpdateInfo)
    }

    // @@protoc_insertion_point(class_scope:ForceUpdateInfo)
    private static final io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo();
    }

    public static io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ForceUpdateInfo>
        PARSER = new com.google.protobuf.AbstractParser<ForceUpdateInfo>() {
      @java.lang.Override
      public ForceUpdateInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ForceUpdateInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ForceUpdateInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ForceUpdateInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.ForceUpdateInfoOuterClass.ForceUpdateInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ForceUpdateInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ForceUpdateInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025ForceUpdateInfo.proto\"+\n\017ForceUpdateIn" +
      "fo\022\030\n\020force_update_url\030\001 \001(\tB\026\n\024io.grass" +
      "cutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ForceUpdateInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ForceUpdateInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ForceUpdateInfo_descriptor,
        new java.lang.String[] { "ForceUpdateUrl", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
