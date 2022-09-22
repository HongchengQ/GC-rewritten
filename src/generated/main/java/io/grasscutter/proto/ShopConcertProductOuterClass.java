// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShopConcertProduct.proto

package io.grasscutter.proto;

public final class ShopConcertProductOuterClass {
  private ShopConcertProductOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ShopConcertProductOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ShopConcertProduct)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string product_id = 1;</code>
     * @return The productId.
     */
    java.lang.String getProductId();
    /**
     * <code>string product_id = 1;</code>
     * @return The bytes for productId.
     */
    com.google.protobuf.ByteString
        getProductIdBytes();

    /**
     * <code>string price_tier = 2;</code>
     * @return The priceTier.
     */
    java.lang.String getPriceTier();
    /**
     * <code>string price_tier = 2;</code>
     * @return The bytes for priceTier.
     */
    com.google.protobuf.ByteString
        getPriceTierBytes();

    /**
     * <code>uint32 obtain_count = 3;</code>
     * @return The obtainCount.
     */
    int getObtainCount();

    /**
     * <code>uint32 obtain_limit = 4;</code>
     * @return The obtainLimit.
     */
    int getObtainLimit();

    /**
     * <code>uint32 begin_time = 5;</code>
     * @return The beginTime.
     */
    int getBeginTime();

    /**
     * <code>uint32 end_time = 6;</code>
     * @return The endTime.
     */
    int getEndTime();

    /**
     * <code>uint32 buy_times = 7;</code>
     * @return The buyTimes.
     */
    int getBuyTimes();
  }
  /**
   * Protobuf type {@code ShopConcertProduct}
   */
  public static final class ShopConcertProduct extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ShopConcertProduct)
      ShopConcertProductOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ShopConcertProduct.newBuilder() to construct.
    private ShopConcertProduct(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ShopConcertProduct() {
      productId_ = "";
      priceTier_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ShopConcertProduct();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ShopConcertProduct(
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

              productId_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              priceTier_ = s;
              break;
            }
            case 24: {

              obtainCount_ = input.readUInt32();
              break;
            }
            case 32: {

              obtainLimit_ = input.readUInt32();
              break;
            }
            case 40: {

              beginTime_ = input.readUInt32();
              break;
            }
            case 48: {

              endTime_ = input.readUInt32();
              break;
            }
            case 56: {

              buyTimes_ = input.readUInt32();
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
      return io.grasscutter.proto.ShopConcertProductOuterClass.internal_static_ShopConcertProduct_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.ShopConcertProductOuterClass.internal_static_ShopConcertProduct_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct.class, io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct.Builder.class);
    }

    public static final int PRODUCT_ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object productId_;
    /**
     * <code>string product_id = 1;</code>
     * @return The productId.
     */
    @java.lang.Override
    public java.lang.String getProductId() {
      java.lang.Object ref = productId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productId_ = s;
        return s;
      }
    }
    /**
     * <code>string product_id = 1;</code>
     * @return The bytes for productId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getProductIdBytes() {
      java.lang.Object ref = productId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PRICE_TIER_FIELD_NUMBER = 2;
    private volatile java.lang.Object priceTier_;
    /**
     * <code>string price_tier = 2;</code>
     * @return The priceTier.
     */
    @java.lang.Override
    public java.lang.String getPriceTier() {
      java.lang.Object ref = priceTier_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        priceTier_ = s;
        return s;
      }
    }
    /**
     * <code>string price_tier = 2;</code>
     * @return The bytes for priceTier.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPriceTierBytes() {
      java.lang.Object ref = priceTier_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        priceTier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int OBTAIN_COUNT_FIELD_NUMBER = 3;
    private int obtainCount_;
    /**
     * <code>uint32 obtain_count = 3;</code>
     * @return The obtainCount.
     */
    @java.lang.Override
    public int getObtainCount() {
      return obtainCount_;
    }

    public static final int OBTAIN_LIMIT_FIELD_NUMBER = 4;
    private int obtainLimit_;
    /**
     * <code>uint32 obtain_limit = 4;</code>
     * @return The obtainLimit.
     */
    @java.lang.Override
    public int getObtainLimit() {
      return obtainLimit_;
    }

    public static final int BEGIN_TIME_FIELD_NUMBER = 5;
    private int beginTime_;
    /**
     * <code>uint32 begin_time = 5;</code>
     * @return The beginTime.
     */
    @java.lang.Override
    public int getBeginTime() {
      return beginTime_;
    }

    public static final int END_TIME_FIELD_NUMBER = 6;
    private int endTime_;
    /**
     * <code>uint32 end_time = 6;</code>
     * @return The endTime.
     */
    @java.lang.Override
    public int getEndTime() {
      return endTime_;
    }

    public static final int BUY_TIMES_FIELD_NUMBER = 7;
    private int buyTimes_;
    /**
     * <code>uint32 buy_times = 7;</code>
     * @return The buyTimes.
     */
    @java.lang.Override
    public int getBuyTimes() {
      return buyTimes_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(productId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, productId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(priceTier_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, priceTier_);
      }
      if (obtainCount_ != 0) {
        output.writeUInt32(3, obtainCount_);
      }
      if (obtainLimit_ != 0) {
        output.writeUInt32(4, obtainLimit_);
      }
      if (beginTime_ != 0) {
        output.writeUInt32(5, beginTime_);
      }
      if (endTime_ != 0) {
        output.writeUInt32(6, endTime_);
      }
      if (buyTimes_ != 0) {
        output.writeUInt32(7, buyTimes_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(productId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, productId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(priceTier_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, priceTier_);
      }
      if (obtainCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, obtainCount_);
      }
      if (obtainLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, obtainLimit_);
      }
      if (beginTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, beginTime_);
      }
      if (endTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, endTime_);
      }
      if (buyTimes_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, buyTimes_);
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
      if (!(obj instanceof io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct other = (io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct) obj;

      if (!getProductId()
          .equals(other.getProductId())) return false;
      if (!getPriceTier()
          .equals(other.getPriceTier())) return false;
      if (getObtainCount()
          != other.getObtainCount()) return false;
      if (getObtainLimit()
          != other.getObtainLimit()) return false;
      if (getBeginTime()
          != other.getBeginTime()) return false;
      if (getEndTime()
          != other.getEndTime()) return false;
      if (getBuyTimes()
          != other.getBuyTimes()) return false;
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
      hash = (37 * hash) + PRODUCT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getProductId().hashCode();
      hash = (37 * hash) + PRICE_TIER_FIELD_NUMBER;
      hash = (53 * hash) + getPriceTier().hashCode();
      hash = (37 * hash) + OBTAIN_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getObtainCount();
      hash = (37 * hash) + OBTAIN_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getObtainLimit();
      hash = (37 * hash) + BEGIN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getBeginTime();
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime();
      hash = (37 * hash) + BUY_TIMES_FIELD_NUMBER;
      hash = (53 * hash) + getBuyTimes();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct prototype) {
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
     * Protobuf type {@code ShopConcertProduct}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ShopConcertProduct)
        io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProductOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.ShopConcertProductOuterClass.internal_static_ShopConcertProduct_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.ShopConcertProductOuterClass.internal_static_ShopConcertProduct_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct.class, io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct.Builder.class);
      }

      // Construct using io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct.newBuilder()
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
        productId_ = "";

        priceTier_ = "";

        obtainCount_ = 0;

        obtainLimit_ = 0;

        beginTime_ = 0;

        endTime_ = 0;

        buyTimes_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.ShopConcertProductOuterClass.internal_static_ShopConcertProduct_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct getDefaultInstanceForType() {
        return io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct build() {
        io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct buildPartial() {
        io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct result = new io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct(this);
        result.productId_ = productId_;
        result.priceTier_ = priceTier_;
        result.obtainCount_ = obtainCount_;
        result.obtainLimit_ = obtainLimit_;
        result.beginTime_ = beginTime_;
        result.endTime_ = endTime_;
        result.buyTimes_ = buyTimes_;
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
        if (other instanceof io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct) {
          return mergeFrom((io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct other) {
        if (other == io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct.getDefaultInstance()) return this;
        if (!other.getProductId().isEmpty()) {
          productId_ = other.productId_;
          onChanged();
        }
        if (!other.getPriceTier().isEmpty()) {
          priceTier_ = other.priceTier_;
          onChanged();
        }
        if (other.getObtainCount() != 0) {
          setObtainCount(other.getObtainCount());
        }
        if (other.getObtainLimit() != 0) {
          setObtainLimit(other.getObtainLimit());
        }
        if (other.getBeginTime() != 0) {
          setBeginTime(other.getBeginTime());
        }
        if (other.getEndTime() != 0) {
          setEndTime(other.getEndTime());
        }
        if (other.getBuyTimes() != 0) {
          setBuyTimes(other.getBuyTimes());
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
        io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object productId_ = "";
      /**
       * <code>string product_id = 1;</code>
       * @return The productId.
       */
      public java.lang.String getProductId() {
        java.lang.Object ref = productId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          productId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string product_id = 1;</code>
       * @return The bytes for productId.
       */
      public com.google.protobuf.ByteString
          getProductIdBytes() {
        java.lang.Object ref = productId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          productId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string product_id = 1;</code>
       * @param value The productId to set.
       * @return This builder for chaining.
       */
      public Builder setProductId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        productId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string product_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearProductId() {
        
        productId_ = getDefaultInstance().getProductId();
        onChanged();
        return this;
      }
      /**
       * <code>string product_id = 1;</code>
       * @param value The bytes for productId to set.
       * @return This builder for chaining.
       */
      public Builder setProductIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        productId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object priceTier_ = "";
      /**
       * <code>string price_tier = 2;</code>
       * @return The priceTier.
       */
      public java.lang.String getPriceTier() {
        java.lang.Object ref = priceTier_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          priceTier_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string price_tier = 2;</code>
       * @return The bytes for priceTier.
       */
      public com.google.protobuf.ByteString
          getPriceTierBytes() {
        java.lang.Object ref = priceTier_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          priceTier_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string price_tier = 2;</code>
       * @param value The priceTier to set.
       * @return This builder for chaining.
       */
      public Builder setPriceTier(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        priceTier_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string price_tier = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPriceTier() {
        
        priceTier_ = getDefaultInstance().getPriceTier();
        onChanged();
        return this;
      }
      /**
       * <code>string price_tier = 2;</code>
       * @param value The bytes for priceTier to set.
       * @return This builder for chaining.
       */
      public Builder setPriceTierBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        priceTier_ = value;
        onChanged();
        return this;
      }

      private int obtainCount_ ;
      /**
       * <code>uint32 obtain_count = 3;</code>
       * @return The obtainCount.
       */
      @java.lang.Override
      public int getObtainCount() {
        return obtainCount_;
      }
      /**
       * <code>uint32 obtain_count = 3;</code>
       * @param value The obtainCount to set.
       * @return This builder for chaining.
       */
      public Builder setObtainCount(int value) {
        
        obtainCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 obtain_count = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearObtainCount() {
        
        obtainCount_ = 0;
        onChanged();
        return this;
      }

      private int obtainLimit_ ;
      /**
       * <code>uint32 obtain_limit = 4;</code>
       * @return The obtainLimit.
       */
      @java.lang.Override
      public int getObtainLimit() {
        return obtainLimit_;
      }
      /**
       * <code>uint32 obtain_limit = 4;</code>
       * @param value The obtainLimit to set.
       * @return This builder for chaining.
       */
      public Builder setObtainLimit(int value) {
        
        obtainLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 obtain_limit = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearObtainLimit() {
        
        obtainLimit_ = 0;
        onChanged();
        return this;
      }

      private int beginTime_ ;
      /**
       * <code>uint32 begin_time = 5;</code>
       * @return The beginTime.
       */
      @java.lang.Override
      public int getBeginTime() {
        return beginTime_;
      }
      /**
       * <code>uint32 begin_time = 5;</code>
       * @param value The beginTime to set.
       * @return This builder for chaining.
       */
      public Builder setBeginTime(int value) {
        
        beginTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 begin_time = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearBeginTime() {
        
        beginTime_ = 0;
        onChanged();
        return this;
      }

      private int endTime_ ;
      /**
       * <code>uint32 end_time = 6;</code>
       * @return The endTime.
       */
      @java.lang.Override
      public int getEndTime() {
        return endTime_;
      }
      /**
       * <code>uint32 end_time = 6;</code>
       * @param value The endTime to set.
       * @return This builder for chaining.
       */
      public Builder setEndTime(int value) {
        
        endTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 end_time = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndTime() {
        
        endTime_ = 0;
        onChanged();
        return this;
      }

      private int buyTimes_ ;
      /**
       * <code>uint32 buy_times = 7;</code>
       * @return The buyTimes.
       */
      @java.lang.Override
      public int getBuyTimes() {
        return buyTimes_;
      }
      /**
       * <code>uint32 buy_times = 7;</code>
       * @param value The buyTimes to set.
       * @return This builder for chaining.
       */
      public Builder setBuyTimes(int value) {
        
        buyTimes_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 buy_times = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuyTimes() {
        
        buyTimes_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ShopConcertProduct)
    }

    // @@protoc_insertion_point(class_scope:ShopConcertProduct)
    private static final io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct();
    }

    public static io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ShopConcertProduct>
        PARSER = new com.google.protobuf.AbstractParser<ShopConcertProduct>() {
      @java.lang.Override
      public ShopConcertProduct parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ShopConcertProduct(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ShopConcertProduct> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ShopConcertProduct> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.ShopConcertProductOuterClass.ShopConcertProduct getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ShopConcertProduct_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ShopConcertProduct_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030ShopConcertProduct.proto\"\241\001\n\022ShopConce" +
      "rtProduct\022\022\n\nproduct_id\030\001 \001(\t\022\022\n\nprice_t" +
      "ier\030\002 \001(\t\022\024\n\014obtain_count\030\003 \001(\r\022\024\n\014obtai" +
      "n_limit\030\004 \001(\r\022\022\n\nbegin_time\030\005 \001(\r\022\020\n\010end" +
      "_time\030\006 \001(\r\022\021\n\tbuy_times\030\007 \001(\rB\026\n\024io.gra" +
      "sscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ShopConcertProduct_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ShopConcertProduct_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ShopConcertProduct_descriptor,
        new java.lang.String[] { "ProductId", "PriceTier", "ObtainCount", "ObtainLimit", "BeginTime", "EndTime", "BuyTimes", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
