// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CardProductRewardNotify.proto

package io.grasscutter.proto;

public final class CardProductRewardNotifyOuterClass {
  private CardProductRewardNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CardProductRewardNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CardProductRewardNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 hcoin = 6;</code>
     * @return The hcoin.
     */
    int getHcoin();

    /**
     * <code>string product_id = 14;</code>
     * @return The productId.
     */
    java.lang.String getProductId();
    /**
     * <code>string product_id = 14;</code>
     * @return The bytes for productId.
     */
    com.google.protobuf.ByteString
        getProductIdBytes();

    /**
     * <code>uint32 remain_days = 1;</code>
     * @return The remainDays.
     */
    int getRemainDays();
  }
  /**
   * <pre>
   * CmdId: 4107
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code CardProductRewardNotify}
   */
  public static final class CardProductRewardNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CardProductRewardNotify)
      CardProductRewardNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CardProductRewardNotify.newBuilder() to construct.
    private CardProductRewardNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CardProductRewardNotify() {
      productId_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CardProductRewardNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CardProductRewardNotify(
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
            case 8: {

              remainDays_ = input.readUInt32();
              break;
            }
            case 48: {

              hcoin_ = input.readUInt32();
              break;
            }
            case 114: {
              java.lang.String s = input.readStringRequireUtf8();

              productId_ = s;
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
      return io.grasscutter.proto.CardProductRewardNotifyOuterClass.internal_static_CardProductRewardNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.CardProductRewardNotifyOuterClass.internal_static_CardProductRewardNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify.class, io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify.Builder.class);
    }

    public static final int HCOIN_FIELD_NUMBER = 6;
    private int hcoin_;
    /**
     * <code>uint32 hcoin = 6;</code>
     * @return The hcoin.
     */
    @java.lang.Override
    public int getHcoin() {
      return hcoin_;
    }

    public static final int PRODUCT_ID_FIELD_NUMBER = 14;
    private volatile java.lang.Object productId_;
    /**
     * <code>string product_id = 14;</code>
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
     * <code>string product_id = 14;</code>
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

    public static final int REMAIN_DAYS_FIELD_NUMBER = 1;
    private int remainDays_;
    /**
     * <code>uint32 remain_days = 1;</code>
     * @return The remainDays.
     */
    @java.lang.Override
    public int getRemainDays() {
      return remainDays_;
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
      if (remainDays_ != 0) {
        output.writeUInt32(1, remainDays_);
      }
      if (hcoin_ != 0) {
        output.writeUInt32(6, hcoin_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(productId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 14, productId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (remainDays_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, remainDays_);
      }
      if (hcoin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, hcoin_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(productId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(14, productId_);
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
      if (!(obj instanceof io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify other = (io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify) obj;

      if (getHcoin()
          != other.getHcoin()) return false;
      if (!getProductId()
          .equals(other.getProductId())) return false;
      if (getRemainDays()
          != other.getRemainDays()) return false;
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
      hash = (37 * hash) + HCOIN_FIELD_NUMBER;
      hash = (53 * hash) + getHcoin();
      hash = (37 * hash) + PRODUCT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getProductId().hashCode();
      hash = (37 * hash) + REMAIN_DAYS_FIELD_NUMBER;
      hash = (53 * hash) + getRemainDays();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify prototype) {
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
     * CmdId: 4107
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code CardProductRewardNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CardProductRewardNotify)
        io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.CardProductRewardNotifyOuterClass.internal_static_CardProductRewardNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.CardProductRewardNotifyOuterClass.internal_static_CardProductRewardNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify.class, io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify.newBuilder()
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
        hcoin_ = 0;

        productId_ = "";

        remainDays_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.CardProductRewardNotifyOuterClass.internal_static_CardProductRewardNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify build() {
        io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify buildPartial() {
        io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify result = new io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify(this);
        result.hcoin_ = hcoin_;
        result.productId_ = productId_;
        result.remainDays_ = remainDays_;
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
        if (other instanceof io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify) {
          return mergeFrom((io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify other) {
        if (other == io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify.getDefaultInstance()) return this;
        if (other.getHcoin() != 0) {
          setHcoin(other.getHcoin());
        }
        if (!other.getProductId().isEmpty()) {
          productId_ = other.productId_;
          onChanged();
        }
        if (other.getRemainDays() != 0) {
          setRemainDays(other.getRemainDays());
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
        io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int hcoin_ ;
      /**
       * <code>uint32 hcoin = 6;</code>
       * @return The hcoin.
       */
      @java.lang.Override
      public int getHcoin() {
        return hcoin_;
      }
      /**
       * <code>uint32 hcoin = 6;</code>
       * @param value The hcoin to set.
       * @return This builder for chaining.
       */
      public Builder setHcoin(int value) {
        
        hcoin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 hcoin = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearHcoin() {
        
        hcoin_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object productId_ = "";
      /**
       * <code>string product_id = 14;</code>
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
       * <code>string product_id = 14;</code>
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
       * <code>string product_id = 14;</code>
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
       * <code>string product_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearProductId() {
        
        productId_ = getDefaultInstance().getProductId();
        onChanged();
        return this;
      }
      /**
       * <code>string product_id = 14;</code>
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

      private int remainDays_ ;
      /**
       * <code>uint32 remain_days = 1;</code>
       * @return The remainDays.
       */
      @java.lang.Override
      public int getRemainDays() {
        return remainDays_;
      }
      /**
       * <code>uint32 remain_days = 1;</code>
       * @param value The remainDays to set.
       * @return This builder for chaining.
       */
      public Builder setRemainDays(int value) {
        
        remainDays_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 remain_days = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRemainDays() {
        
        remainDays_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CardProductRewardNotify)
    }

    // @@protoc_insertion_point(class_scope:CardProductRewardNotify)
    private static final io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify();
    }

    public static io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CardProductRewardNotify>
        PARSER = new com.google.protobuf.AbstractParser<CardProductRewardNotify>() {
      @java.lang.Override
      public CardProductRewardNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CardProductRewardNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CardProductRewardNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CardProductRewardNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CardProductRewardNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CardProductRewardNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035CardProductRewardNotify.proto\"Q\n\027CardP" +
      "roductRewardNotify\022\r\n\005hcoin\030\006 \001(\r\022\022\n\npro" +
      "duct_id\030\016 \001(\t\022\023\n\013remain_days\030\001 \001(\rB\026\n\024io" +
      ".grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CardProductRewardNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CardProductRewardNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CardProductRewardNotify_descriptor,
        new java.lang.String[] { "Hcoin", "ProductId", "RemainDays", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
