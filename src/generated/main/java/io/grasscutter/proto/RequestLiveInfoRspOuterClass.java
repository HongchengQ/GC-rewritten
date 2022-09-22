// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RequestLiveInfoRsp.proto

package io.grasscutter.proto;

public final class RequestLiveInfoRspOuterClass {
  private RequestLiveInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RequestLiveInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RequestLiveInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string spare_live_url = 14;</code>
     * @return The spareLiveUrl.
     */
    java.lang.String getSpareLiveUrl();
    /**
     * <code>string spare_live_url = 14;</code>
     * @return The bytes for spareLiveUrl.
     */
    com.google.protobuf.ByteString
        getSpareLiveUrlBytes();

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>string live_url = 12;</code>
     * @return The liveUrl.
     */
    java.lang.String getLiveUrl();
    /**
     * <code>string live_url = 12;</code>
     * @return The bytes for liveUrl.
     */
    com.google.protobuf.ByteString
        getLiveUrlBytes();

    /**
     * <code>uint32 live_id = 2;</code>
     * @return The liveId.
     */
    int getLiveId();
  }
  /**
   * <pre>
   * CmdId: 888
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code RequestLiveInfoRsp}
   */
  public static final class RequestLiveInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RequestLiveInfoRsp)
      RequestLiveInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RequestLiveInfoRsp.newBuilder() to construct.
    private RequestLiveInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RequestLiveInfoRsp() {
      spareLiveUrl_ = "";
      liveUrl_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RequestLiveInfoRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RequestLiveInfoRsp(
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
            case 16: {

              liveId_ = input.readUInt32();
              break;
            }
            case 72: {

              retcode_ = input.readInt32();
              break;
            }
            case 98: {
              java.lang.String s = input.readStringRequireUtf8();

              liveUrl_ = s;
              break;
            }
            case 114: {
              java.lang.String s = input.readStringRequireUtf8();

              spareLiveUrl_ = s;
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
      return io.grasscutter.proto.RequestLiveInfoRspOuterClass.internal_static_RequestLiveInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.RequestLiveInfoRspOuterClass.internal_static_RequestLiveInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp.class, io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp.Builder.class);
    }

    public static final int SPARE_LIVE_URL_FIELD_NUMBER = 14;
    private volatile java.lang.Object spareLiveUrl_;
    /**
     * <code>string spare_live_url = 14;</code>
     * @return The spareLiveUrl.
     */
    @java.lang.Override
    public java.lang.String getSpareLiveUrl() {
      java.lang.Object ref = spareLiveUrl_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        spareLiveUrl_ = s;
        return s;
      }
    }
    /**
     * <code>string spare_live_url = 14;</code>
     * @return The bytes for spareLiveUrl.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSpareLiveUrlBytes() {
      java.lang.Object ref = spareLiveUrl_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        spareLiveUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RETCODE_FIELD_NUMBER = 9;
    private int retcode_;
    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int LIVE_URL_FIELD_NUMBER = 12;
    private volatile java.lang.Object liveUrl_;
    /**
     * <code>string live_url = 12;</code>
     * @return The liveUrl.
     */
    @java.lang.Override
    public java.lang.String getLiveUrl() {
      java.lang.Object ref = liveUrl_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        liveUrl_ = s;
        return s;
      }
    }
    /**
     * <code>string live_url = 12;</code>
     * @return The bytes for liveUrl.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getLiveUrlBytes() {
      java.lang.Object ref = liveUrl_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        liveUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LIVE_ID_FIELD_NUMBER = 2;
    private int liveId_;
    /**
     * <code>uint32 live_id = 2;</code>
     * @return The liveId.
     */
    @java.lang.Override
    public int getLiveId() {
      return liveId_;
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
      if (liveId_ != 0) {
        output.writeUInt32(2, liveId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(liveUrl_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 12, liveUrl_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(spareLiveUrl_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 14, spareLiveUrl_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (liveId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, liveId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(liveUrl_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, liveUrl_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(spareLiveUrl_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(14, spareLiveUrl_);
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
      if (!(obj instanceof io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp other = (io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp) obj;

      if (!getSpareLiveUrl()
          .equals(other.getSpareLiveUrl())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getLiveUrl()
          .equals(other.getLiveUrl())) return false;
      if (getLiveId()
          != other.getLiveId()) return false;
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
      hash = (37 * hash) + SPARE_LIVE_URL_FIELD_NUMBER;
      hash = (53 * hash) + getSpareLiveUrl().hashCode();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + LIVE_URL_FIELD_NUMBER;
      hash = (53 * hash) + getLiveUrl().hashCode();
      hash = (37 * hash) + LIVE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLiveId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp prototype) {
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
     * CmdId: 888
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code RequestLiveInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RequestLiveInfoRsp)
        io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.RequestLiveInfoRspOuterClass.internal_static_RequestLiveInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.RequestLiveInfoRspOuterClass.internal_static_RequestLiveInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp.class, io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp.Builder.class);
      }

      // Construct using io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp.newBuilder()
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
        spareLiveUrl_ = "";

        retcode_ = 0;

        liveUrl_ = "";

        liveId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.RequestLiveInfoRspOuterClass.internal_static_RequestLiveInfoRsp_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp getDefaultInstanceForType() {
        return io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp build() {
        io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp buildPartial() {
        io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp result = new io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp(this);
        result.spareLiveUrl_ = spareLiveUrl_;
        result.retcode_ = retcode_;
        result.liveUrl_ = liveUrl_;
        result.liveId_ = liveId_;
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
        if (other instanceof io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp) {
          return mergeFrom((io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp other) {
        if (other == io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp.getDefaultInstance()) return this;
        if (!other.getSpareLiveUrl().isEmpty()) {
          spareLiveUrl_ = other.spareLiveUrl_;
          onChanged();
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.getLiveUrl().isEmpty()) {
          liveUrl_ = other.liveUrl_;
          onChanged();
        }
        if (other.getLiveId() != 0) {
          setLiveId(other.getLiveId());
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
        io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object spareLiveUrl_ = "";
      /**
       * <code>string spare_live_url = 14;</code>
       * @return The spareLiveUrl.
       */
      public java.lang.String getSpareLiveUrl() {
        java.lang.Object ref = spareLiveUrl_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          spareLiveUrl_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string spare_live_url = 14;</code>
       * @return The bytes for spareLiveUrl.
       */
      public com.google.protobuf.ByteString
          getSpareLiveUrlBytes() {
        java.lang.Object ref = spareLiveUrl_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          spareLiveUrl_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string spare_live_url = 14;</code>
       * @param value The spareLiveUrl to set.
       * @return This builder for chaining.
       */
      public Builder setSpareLiveUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        spareLiveUrl_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string spare_live_url = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearSpareLiveUrl() {
        
        spareLiveUrl_ = getDefaultInstance().getSpareLiveUrl();
        onChanged();
        return this;
      }
      /**
       * <code>string spare_live_url = 14;</code>
       * @param value The bytes for spareLiveUrl to set.
       * @return This builder for chaining.
       */
      public Builder setSpareLiveUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        spareLiveUrl_ = value;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object liveUrl_ = "";
      /**
       * <code>string live_url = 12;</code>
       * @return The liveUrl.
       */
      public java.lang.String getLiveUrl() {
        java.lang.Object ref = liveUrl_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          liveUrl_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string live_url = 12;</code>
       * @return The bytes for liveUrl.
       */
      public com.google.protobuf.ByteString
          getLiveUrlBytes() {
        java.lang.Object ref = liveUrl_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          liveUrl_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string live_url = 12;</code>
       * @param value The liveUrl to set.
       * @return This builder for chaining.
       */
      public Builder setLiveUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        liveUrl_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string live_url = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearLiveUrl() {
        
        liveUrl_ = getDefaultInstance().getLiveUrl();
        onChanged();
        return this;
      }
      /**
       * <code>string live_url = 12;</code>
       * @param value The bytes for liveUrl to set.
       * @return This builder for chaining.
       */
      public Builder setLiveUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        liveUrl_ = value;
        onChanged();
        return this;
      }

      private int liveId_ ;
      /**
       * <code>uint32 live_id = 2;</code>
       * @return The liveId.
       */
      @java.lang.Override
      public int getLiveId() {
        return liveId_;
      }
      /**
       * <code>uint32 live_id = 2;</code>
       * @param value The liveId to set.
       * @return This builder for chaining.
       */
      public Builder setLiveId(int value) {
        
        liveId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 live_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearLiveId() {
        
        liveId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RequestLiveInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:RequestLiveInfoRsp)
    private static final io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp();
    }

    public static io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RequestLiveInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<RequestLiveInfoRsp>() {
      @java.lang.Override
      public RequestLiveInfoRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequestLiveInfoRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RequestLiveInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RequestLiveInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestLiveInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestLiveInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030RequestLiveInfoRsp.proto\"`\n\022RequestLiv" +
      "eInfoRsp\022\026\n\016spare_live_url\030\016 \001(\t\022\017\n\007retc" +
      "ode\030\t \001(\005\022\020\n\010live_url\030\014 \001(\t\022\017\n\007live_id\030\002" +
      " \001(\rB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RequestLiveInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RequestLiveInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestLiveInfoRsp_descriptor,
        new java.lang.String[] { "SpareLiveUrl", "Retcode", "LiveUrl", "LiveId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
