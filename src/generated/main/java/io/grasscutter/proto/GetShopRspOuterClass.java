// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetShopRsp.proto

package io.grasscutter.proto;

public final class GetShopRspOuterClass {
  private GetShopRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetShopRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetShopRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Shop shop = 11;</code>
     * @return Whether the shop field is set.
     */
    boolean hasShop();
    /**
     * <code>.Shop shop = 11;</code>
     * @return The shop.
     */
    io.grasscutter.proto.ShopOuterClass.Shop getShop();
    /**
     * <code>.Shop shop = 11;</code>
     */
    io.grasscutter.proto.ShopOuterClass.ShopOrBuilder getShopOrBuilder();

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 798
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code GetShopRsp}
   */
  public static final class GetShopRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetShopRsp)
      GetShopRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetShopRsp.newBuilder() to construct.
    private GetShopRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetShopRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetShopRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetShopRsp(
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

              retcode_ = input.readInt32();
              break;
            }
            case 90: {
              io.grasscutter.proto.ShopOuterClass.Shop.Builder subBuilder = null;
              if (shop_ != null) {
                subBuilder = shop_.toBuilder();
              }
              shop_ = input.readMessage(io.grasscutter.proto.ShopOuterClass.Shop.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(shop_);
                shop_ = subBuilder.buildPartial();
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
      return io.grasscutter.proto.GetShopRspOuterClass.internal_static_GetShopRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.GetShopRspOuterClass.internal_static_GetShopRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp.class, io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp.Builder.class);
    }

    public static final int SHOP_FIELD_NUMBER = 11;
    private io.grasscutter.proto.ShopOuterClass.Shop shop_;
    /**
     * <code>.Shop shop = 11;</code>
     * @return Whether the shop field is set.
     */
    @java.lang.Override
    public boolean hasShop() {
      return shop_ != null;
    }
    /**
     * <code>.Shop shop = 11;</code>
     * @return The shop.
     */
    @java.lang.Override
    public io.grasscutter.proto.ShopOuterClass.Shop getShop() {
      return shop_ == null ? io.grasscutter.proto.ShopOuterClass.Shop.getDefaultInstance() : shop_;
    }
    /**
     * <code>.Shop shop = 11;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.ShopOuterClass.ShopOrBuilder getShopOrBuilder() {
      return getShop();
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_;
    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (retcode_ != 0) {
        output.writeInt32(2, retcode_);
      }
      if (shop_ != null) {
        output.writeMessage(11, getShop());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, retcode_);
      }
      if (shop_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getShop());
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
      if (!(obj instanceof io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp other = (io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp) obj;

      if (hasShop() != other.hasShop()) return false;
      if (hasShop()) {
        if (!getShop()
            .equals(other.getShop())) return false;
      }
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (hasShop()) {
        hash = (37 * hash) + SHOP_FIELD_NUMBER;
        hash = (53 * hash) + getShop().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp prototype) {
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
     * CmdId: 798
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code GetShopRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetShopRsp)
        io.grasscutter.proto.GetShopRspOuterClass.GetShopRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.GetShopRspOuterClass.internal_static_GetShopRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.GetShopRspOuterClass.internal_static_GetShopRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp.class, io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp.Builder.class);
      }

      // Construct using io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp.newBuilder()
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
        if (shopBuilder_ == null) {
          shop_ = null;
        } else {
          shop_ = null;
          shopBuilder_ = null;
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.GetShopRspOuterClass.internal_static_GetShopRsp_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp getDefaultInstanceForType() {
        return io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp build() {
        io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp buildPartial() {
        io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp result = new io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp(this);
        if (shopBuilder_ == null) {
          result.shop_ = shop_;
        } else {
          result.shop_ = shopBuilder_.build();
        }
        result.retcode_ = retcode_;
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
        if (other instanceof io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp) {
          return mergeFrom((io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp other) {
        if (other == io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp.getDefaultInstance()) return this;
        if (other.hasShop()) {
          mergeShop(other.getShop());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private io.grasscutter.proto.ShopOuterClass.Shop shop_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.ShopOuterClass.Shop, io.grasscutter.proto.ShopOuterClass.Shop.Builder, io.grasscutter.proto.ShopOuterClass.ShopOrBuilder> shopBuilder_;
      /**
       * <code>.Shop shop = 11;</code>
       * @return Whether the shop field is set.
       */
      public boolean hasShop() {
        return shopBuilder_ != null || shop_ != null;
      }
      /**
       * <code>.Shop shop = 11;</code>
       * @return The shop.
       */
      public io.grasscutter.proto.ShopOuterClass.Shop getShop() {
        if (shopBuilder_ == null) {
          return shop_ == null ? io.grasscutter.proto.ShopOuterClass.Shop.getDefaultInstance() : shop_;
        } else {
          return shopBuilder_.getMessage();
        }
      }
      /**
       * <code>.Shop shop = 11;</code>
       */
      public Builder setShop(io.grasscutter.proto.ShopOuterClass.Shop value) {
        if (shopBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          shop_ = value;
          onChanged();
        } else {
          shopBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Shop shop = 11;</code>
       */
      public Builder setShop(
          io.grasscutter.proto.ShopOuterClass.Shop.Builder builderForValue) {
        if (shopBuilder_ == null) {
          shop_ = builderForValue.build();
          onChanged();
        } else {
          shopBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Shop shop = 11;</code>
       */
      public Builder mergeShop(io.grasscutter.proto.ShopOuterClass.Shop value) {
        if (shopBuilder_ == null) {
          if (shop_ != null) {
            shop_ =
              io.grasscutter.proto.ShopOuterClass.Shop.newBuilder(shop_).mergeFrom(value).buildPartial();
          } else {
            shop_ = value;
          }
          onChanged();
        } else {
          shopBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Shop shop = 11;</code>
       */
      public Builder clearShop() {
        if (shopBuilder_ == null) {
          shop_ = null;
          onChanged();
        } else {
          shop_ = null;
          shopBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Shop shop = 11;</code>
       */
      public io.grasscutter.proto.ShopOuterClass.Shop.Builder getShopBuilder() {
        
        onChanged();
        return getShopFieldBuilder().getBuilder();
      }
      /**
       * <code>.Shop shop = 11;</code>
       */
      public io.grasscutter.proto.ShopOuterClass.ShopOrBuilder getShopOrBuilder() {
        if (shopBuilder_ != null) {
          return shopBuilder_.getMessageOrBuilder();
        } else {
          return shop_ == null ?
              io.grasscutter.proto.ShopOuterClass.Shop.getDefaultInstance() : shop_;
        }
      }
      /**
       * <code>.Shop shop = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.ShopOuterClass.Shop, io.grasscutter.proto.ShopOuterClass.Shop.Builder, io.grasscutter.proto.ShopOuterClass.ShopOrBuilder> 
          getShopFieldBuilder() {
        if (shopBuilder_ == null) {
          shopBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.ShopOuterClass.Shop, io.grasscutter.proto.ShopOuterClass.Shop.Builder, io.grasscutter.proto.ShopOuterClass.ShopOrBuilder>(
                  getShop(),
                  getParentForChildren(),
                  isClean());
          shop_ = null;
        }
        return shopBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetShopRsp)
    }

    // @@protoc_insertion_point(class_scope:GetShopRsp)
    private static final io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp();
    }

    public static io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetShopRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetShopRsp>() {
      @java.lang.Override
      public GetShopRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetShopRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetShopRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetShopRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.GetShopRspOuterClass.GetShopRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetShopRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetShopRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020GetShopRsp.proto\032\nShop.proto\"2\n\nGetSho" +
      "pRsp\022\023\n\004shop\030\013 \001(\0132\005.Shop\022\017\n\007retcode\030\002 \001" +
      "(\005B\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.ShopOuterClass.getDescriptor(),
        });
    internal_static_GetShopRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetShopRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetShopRsp_descriptor,
        new java.lang.String[] { "Shop", "Retcode", });
    io.grasscutter.proto.ShopOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
