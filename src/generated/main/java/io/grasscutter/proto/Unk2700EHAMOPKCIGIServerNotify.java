// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_EHAMOPKCIGI_ServerNotify.proto

package io.grasscutter.proto;

public final class Unk2700EHAMOPKCIGIServerNotify {
  private Unk2700EHAMOPKCIGIServerNotify() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_EHAMOPKCIGI_ServerNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_EHAMOPKCIGI_ServerNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gallery_id = 11;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>.Unk2700_KNGDOIDOFFB settle_info = 12;</code>
     * @return Whether the settleInfo field is set.
     */
    boolean hasSettleInfo();
    /**
     * <code>.Unk2700_KNGDOIDOFFB settle_info = 12;</code>
     * @return The settleInfo.
     */
    io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB getSettleInfo();
    /**
     * <code>.Unk2700_KNGDOIDOFFB settle_info = 12;</code>
     */
    io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFBOrBuilder getSettleInfoOrBuilder();

    /**
     * <code>uint32 Unk2700_HAOPLFPOLFM = 7;</code>
     * @return The unk2700HAOPLFPOLFM.
     */
    int getUnk2700HAOPLFPOLFM();

    /**
     * <code>bool is_new_record = 2;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();
  }
  /**
   * <pre>
   * CmdId: 4805
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_EHAMOPKCIGI_ServerNotify}
   */
  public static final class Unk2700_EHAMOPKCIGI_ServerNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_EHAMOPKCIGI_ServerNotify)
      Unk2700_EHAMOPKCIGI_ServerNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_EHAMOPKCIGI_ServerNotify.newBuilder() to construct.
    private Unk2700_EHAMOPKCIGI_ServerNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_EHAMOPKCIGI_ServerNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_EHAMOPKCIGI_ServerNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_EHAMOPKCIGI_ServerNotify(
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

              isNewRecord_ = input.readBool();
              break;
            }
            case 56: {

              unk2700HAOPLFPOLFM_ = input.readUInt32();
              break;
            }
            case 88: {

              galleryId_ = input.readUInt32();
              break;
            }
            case 98: {
              io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB.Builder subBuilder = null;
              if (settleInfo_ != null) {
                subBuilder = settleInfo_.toBuilder();
              }
              settleInfo_ = input.readMessage(io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(settleInfo_);
                settleInfo_ = subBuilder.buildPartial();
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
      return io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.internal_static_Unk2700_EHAMOPKCIGI_ServerNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.internal_static_Unk2700_EHAMOPKCIGI_ServerNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify.class, io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify.Builder.class);
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 11;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 11;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int SETTLE_INFO_FIELD_NUMBER = 12;
    private io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB settleInfo_;
    /**
     * <code>.Unk2700_KNGDOIDOFFB settle_info = 12;</code>
     * @return Whether the settleInfo field is set.
     */
    @java.lang.Override
    public boolean hasSettleInfo() {
      return settleInfo_ != null;
    }
    /**
     * <code>.Unk2700_KNGDOIDOFFB settle_info = 12;</code>
     * @return The settleInfo.
     */
    @java.lang.Override
    public io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB getSettleInfo() {
      return settleInfo_ == null ? io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB.getDefaultInstance() : settleInfo_;
    }
    /**
     * <code>.Unk2700_KNGDOIDOFFB settle_info = 12;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFBOrBuilder getSettleInfoOrBuilder() {
      return getSettleInfo();
    }

    public static final int UNK2700_HAOPLFPOLFM_FIELD_NUMBER = 7;
    private int unk2700HAOPLFPOLFM_;
    /**
     * <code>uint32 Unk2700_HAOPLFPOLFM = 7;</code>
     * @return The unk2700HAOPLFPOLFM.
     */
    @java.lang.Override
    public int getUnk2700HAOPLFPOLFM() {
      return unk2700HAOPLFPOLFM_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 2;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 2;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
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
      if (isNewRecord_ != false) {
        output.writeBool(2, isNewRecord_);
      }
      if (unk2700HAOPLFPOLFM_ != 0) {
        output.writeUInt32(7, unk2700HAOPLFPOLFM_);
      }
      if (galleryId_ != 0) {
        output.writeUInt32(11, galleryId_);
      }
      if (settleInfo_ != null) {
        output.writeMessage(12, getSettleInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isNewRecord_);
      }
      if (unk2700HAOPLFPOLFM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, unk2700HAOPLFPOLFM_);
      }
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, galleryId_);
      }
      if (settleInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getSettleInfo());
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
      if (!(obj instanceof io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify other = (io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify) obj;

      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (hasSettleInfo() != other.hasSettleInfo()) return false;
      if (hasSettleInfo()) {
        if (!getSettleInfo()
            .equals(other.getSettleInfo())) return false;
      }
      if (getUnk2700HAOPLFPOLFM()
          != other.getUnk2700HAOPLFPOLFM()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
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
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      if (hasSettleInfo()) {
        hash = (37 * hash) + SETTLE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getSettleInfo().hashCode();
      }
      hash = (37 * hash) + UNK2700_HAOPLFPOLFM_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700HAOPLFPOLFM();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify prototype) {
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
     * CmdId: 4805
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_EHAMOPKCIGI_ServerNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_EHAMOPKCIGI_ServerNotify)
        io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.internal_static_Unk2700_EHAMOPKCIGI_ServerNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.internal_static_Unk2700_EHAMOPKCIGI_ServerNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify.class, io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify.newBuilder()
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
        galleryId_ = 0;

        if (settleInfoBuilder_ == null) {
          settleInfo_ = null;
        } else {
          settleInfo_ = null;
          settleInfoBuilder_ = null;
        }
        unk2700HAOPLFPOLFM_ = 0;

        isNewRecord_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.internal_static_Unk2700_EHAMOPKCIGI_ServerNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify build() {
        io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify buildPartial() {
        io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify result = new io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify(this);
        result.galleryId_ = galleryId_;
        if (settleInfoBuilder_ == null) {
          result.settleInfo_ = settleInfo_;
        } else {
          result.settleInfo_ = settleInfoBuilder_.build();
        }
        result.unk2700HAOPLFPOLFM_ = unk2700HAOPLFPOLFM_;
        result.isNewRecord_ = isNewRecord_;
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
        if (other instanceof io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify) {
          return mergeFrom((io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify other) {
        if (other == io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify.getDefaultInstance()) return this;
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.hasSettleInfo()) {
          mergeSettleInfo(other.getSettleInfo());
        }
        if (other.getUnk2700HAOPLFPOLFM() != 0) {
          setUnk2700HAOPLFPOLFM(other.getUnk2700HAOPLFPOLFM());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
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
        io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 11;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 11;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
        onChanged();
        return this;
      }

      private io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB settleInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB, io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB.Builder, io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFBOrBuilder> settleInfoBuilder_;
      /**
       * <code>.Unk2700_KNGDOIDOFFB settle_info = 12;</code>
       * @return Whether the settleInfo field is set.
       */
      public boolean hasSettleInfo() {
        return settleInfoBuilder_ != null || settleInfo_ != null;
      }
      /**
       * <code>.Unk2700_KNGDOIDOFFB settle_info = 12;</code>
       * @return The settleInfo.
       */
      public io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB getSettleInfo() {
        if (settleInfoBuilder_ == null) {
          return settleInfo_ == null ? io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB.getDefaultInstance() : settleInfo_;
        } else {
          return settleInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.Unk2700_KNGDOIDOFFB settle_info = 12;</code>
       */
      public Builder setSettleInfo(io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB value) {
        if (settleInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          settleInfo_ = value;
          onChanged();
        } else {
          settleInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Unk2700_KNGDOIDOFFB settle_info = 12;</code>
       */
      public Builder setSettleInfo(
          io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB.Builder builderForValue) {
        if (settleInfoBuilder_ == null) {
          settleInfo_ = builderForValue.build();
          onChanged();
        } else {
          settleInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Unk2700_KNGDOIDOFFB settle_info = 12;</code>
       */
      public Builder mergeSettleInfo(io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB value) {
        if (settleInfoBuilder_ == null) {
          if (settleInfo_ != null) {
            settleInfo_ =
              io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB.newBuilder(settleInfo_).mergeFrom(value).buildPartial();
          } else {
            settleInfo_ = value;
          }
          onChanged();
        } else {
          settleInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Unk2700_KNGDOIDOFFB settle_info = 12;</code>
       */
      public Builder clearSettleInfo() {
        if (settleInfoBuilder_ == null) {
          settleInfo_ = null;
          onChanged();
        } else {
          settleInfo_ = null;
          settleInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Unk2700_KNGDOIDOFFB settle_info = 12;</code>
       */
      public io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB.Builder getSettleInfoBuilder() {
        
        onChanged();
        return getSettleInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.Unk2700_KNGDOIDOFFB settle_info = 12;</code>
       */
      public io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFBOrBuilder getSettleInfoOrBuilder() {
        if (settleInfoBuilder_ != null) {
          return settleInfoBuilder_.getMessageOrBuilder();
        } else {
          return settleInfo_ == null ?
              io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB.getDefaultInstance() : settleInfo_;
        }
      }
      /**
       * <code>.Unk2700_KNGDOIDOFFB settle_info = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB, io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB.Builder, io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFBOrBuilder> 
          getSettleInfoFieldBuilder() {
        if (settleInfoBuilder_ == null) {
          settleInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB, io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB.Builder, io.grasscutter.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFBOrBuilder>(
                  getSettleInfo(),
                  getParentForChildren(),
                  isClean());
          settleInfo_ = null;
        }
        return settleInfoBuilder_;
      }

      private int unk2700HAOPLFPOLFM_ ;
      /**
       * <code>uint32 Unk2700_HAOPLFPOLFM = 7;</code>
       * @return The unk2700HAOPLFPOLFM.
       */
      @java.lang.Override
      public int getUnk2700HAOPLFPOLFM() {
        return unk2700HAOPLFPOLFM_;
      }
      /**
       * <code>uint32 Unk2700_HAOPLFPOLFM = 7;</code>
       * @param value The unk2700HAOPLFPOLFM to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700HAOPLFPOLFM(int value) {
        
        unk2700HAOPLFPOLFM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_HAOPLFPOLFM = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700HAOPLFPOLFM() {
        
        unk2700HAOPLFPOLFM_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 2;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 2;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_EHAMOPKCIGI_ServerNotify)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_EHAMOPKCIGI_ServerNotify)
    private static final io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify();
    }

    public static io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_EHAMOPKCIGI_ServerNotify>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_EHAMOPKCIGI_ServerNotify>() {
      @java.lang.Override
      public Unk2700_EHAMOPKCIGI_ServerNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_EHAMOPKCIGI_ServerNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_EHAMOPKCIGI_ServerNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_EHAMOPKCIGI_ServerNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.Unk2700EHAMOPKCIGIServerNotify.Unk2700_EHAMOPKCIGI_ServerNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_EHAMOPKCIGI_ServerNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_EHAMOPKCIGI_ServerNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&Unk2700_EHAMOPKCIGI_ServerNotify.proto" +
      "\032\031Unk2700_KNGDOIDOFFB.proto\"\225\001\n Unk2700_" +
      "EHAMOPKCIGI_ServerNotify\022\022\n\ngallery_id\030\013" +
      " \001(\r\022)\n\013settle_info\030\014 \001(\0132\024.Unk2700_KNGD" +
      "OIDOFFB\022\033\n\023Unk2700_HAOPLFPOLFM\030\007 \001(\r\022\025\n\r" +
      "is_new_record\030\002 \001(\010B\026\n\024io.grasscutter.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.Unk2700KNGDOIDOFFB.getDescriptor(),
        });
    internal_static_Unk2700_EHAMOPKCIGI_ServerNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_EHAMOPKCIGI_ServerNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_EHAMOPKCIGI_ServerNotify_descriptor,
        new java.lang.String[] { "GalleryId", "SettleInfo", "Unk2700HAOPLFPOLFM", "IsNewRecord", });
    io.grasscutter.proto.Unk2700KNGDOIDOFFB.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
