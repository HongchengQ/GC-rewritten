// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetEntityClientDataNotify.proto

package io.grasscutter.proto;

public final class SetEntityClientDataNotifyOuterClass {
  private SetEntityClientDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetEntityClientDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetEntityClientDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 14;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.EntityClientData entity_client_data = 9;</code>
     * @return Whether the entityClientData field is set.
     */
    boolean hasEntityClientData();
    /**
     * <code>.EntityClientData entity_client_data = 9;</code>
     * @return The entityClientData.
     */
    io.grasscutter.proto.EntityClientDataOuterClass.EntityClientData getEntityClientData();
    /**
     * <code>.EntityClientData entity_client_data = 9;</code>
     */
    io.grasscutter.proto.EntityClientDataOuterClass.EntityClientDataOrBuilder getEntityClientDataOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 3146
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code SetEntityClientDataNotify}
   */
  public static final class SetEntityClientDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetEntityClientDataNotify)
      SetEntityClientDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetEntityClientDataNotify.newBuilder() to construct.
    private SetEntityClientDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetEntityClientDataNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetEntityClientDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetEntityClientDataNotify(
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
            case 74: {
              io.grasscutter.proto.EntityClientDataOuterClass.EntityClientData.Builder subBuilder = null;
              if (entityClientData_ != null) {
                subBuilder = entityClientData_.toBuilder();
              }
              entityClientData_ = input.readMessage(io.grasscutter.proto.EntityClientDataOuterClass.EntityClientData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(entityClientData_);
                entityClientData_ = subBuilder.buildPartial();
              }

              break;
            }
            case 112: {

              entityId_ = input.readUInt32();
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
      return io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.internal_static_SetEntityClientDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.internal_static_SetEntityClientDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify.class, io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 14;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 14;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int ENTITY_CLIENT_DATA_FIELD_NUMBER = 9;
    private io.grasscutter.proto.EntityClientDataOuterClass.EntityClientData entityClientData_;
    /**
     * <code>.EntityClientData entity_client_data = 9;</code>
     * @return Whether the entityClientData field is set.
     */
    @java.lang.Override
    public boolean hasEntityClientData() {
      return entityClientData_ != null;
    }
    /**
     * <code>.EntityClientData entity_client_data = 9;</code>
     * @return The entityClientData.
     */
    @java.lang.Override
    public io.grasscutter.proto.EntityClientDataOuterClass.EntityClientData getEntityClientData() {
      return entityClientData_ == null ? io.grasscutter.proto.EntityClientDataOuterClass.EntityClientData.getDefaultInstance() : entityClientData_;
    }
    /**
     * <code>.EntityClientData entity_client_data = 9;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.EntityClientDataOuterClass.EntityClientDataOrBuilder getEntityClientDataOrBuilder() {
      return getEntityClientData();
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
      if (entityClientData_ != null) {
        output.writeMessage(9, getEntityClientData());
      }
      if (entityId_ != 0) {
        output.writeUInt32(14, entityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityClientData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getEntityClientData());
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, entityId_);
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
      if (!(obj instanceof io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify other = (io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (hasEntityClientData() != other.hasEntityClientData()) return false;
      if (hasEntityClientData()) {
        if (!getEntityClientData()
            .equals(other.getEntityClientData())) return false;
      }
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
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (hasEntityClientData()) {
        hash = (37 * hash) + ENTITY_CLIENT_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getEntityClientData().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify prototype) {
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
     * CmdId: 3146
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code SetEntityClientDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetEntityClientDataNotify)
        io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.internal_static_SetEntityClientDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.internal_static_SetEntityClientDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify.class, io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify.newBuilder()
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
        entityId_ = 0;

        if (entityClientDataBuilder_ == null) {
          entityClientData_ = null;
        } else {
          entityClientData_ = null;
          entityClientDataBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.internal_static_SetEntityClientDataNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify build() {
        io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify buildPartial() {
        io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify result = new io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify(this);
        result.entityId_ = entityId_;
        if (entityClientDataBuilder_ == null) {
          result.entityClientData_ = entityClientData_;
        } else {
          result.entityClientData_ = entityClientDataBuilder_.build();
        }
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
        if (other instanceof io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify) {
          return mergeFrom((io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify other) {
        if (other == io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.hasEntityClientData()) {
          mergeEntityClientData(other.getEntityClientData());
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
        io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 14;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 14;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private io.grasscutter.proto.EntityClientDataOuterClass.EntityClientData entityClientData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.EntityClientDataOuterClass.EntityClientData, io.grasscutter.proto.EntityClientDataOuterClass.EntityClientData.Builder, io.grasscutter.proto.EntityClientDataOuterClass.EntityClientDataOrBuilder> entityClientDataBuilder_;
      /**
       * <code>.EntityClientData entity_client_data = 9;</code>
       * @return Whether the entityClientData field is set.
       */
      public boolean hasEntityClientData() {
        return entityClientDataBuilder_ != null || entityClientData_ != null;
      }
      /**
       * <code>.EntityClientData entity_client_data = 9;</code>
       * @return The entityClientData.
       */
      public io.grasscutter.proto.EntityClientDataOuterClass.EntityClientData getEntityClientData() {
        if (entityClientDataBuilder_ == null) {
          return entityClientData_ == null ? io.grasscutter.proto.EntityClientDataOuterClass.EntityClientData.getDefaultInstance() : entityClientData_;
        } else {
          return entityClientDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.EntityClientData entity_client_data = 9;</code>
       */
      public Builder setEntityClientData(io.grasscutter.proto.EntityClientDataOuterClass.EntityClientData value) {
        if (entityClientDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          entityClientData_ = value;
          onChanged();
        } else {
          entityClientDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.EntityClientData entity_client_data = 9;</code>
       */
      public Builder setEntityClientData(
          io.grasscutter.proto.EntityClientDataOuterClass.EntityClientData.Builder builderForValue) {
        if (entityClientDataBuilder_ == null) {
          entityClientData_ = builderForValue.build();
          onChanged();
        } else {
          entityClientDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.EntityClientData entity_client_data = 9;</code>
       */
      public Builder mergeEntityClientData(io.grasscutter.proto.EntityClientDataOuterClass.EntityClientData value) {
        if (entityClientDataBuilder_ == null) {
          if (entityClientData_ != null) {
            entityClientData_ =
              io.grasscutter.proto.EntityClientDataOuterClass.EntityClientData.newBuilder(entityClientData_).mergeFrom(value).buildPartial();
          } else {
            entityClientData_ = value;
          }
          onChanged();
        } else {
          entityClientDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.EntityClientData entity_client_data = 9;</code>
       */
      public Builder clearEntityClientData() {
        if (entityClientDataBuilder_ == null) {
          entityClientData_ = null;
          onChanged();
        } else {
          entityClientData_ = null;
          entityClientDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.EntityClientData entity_client_data = 9;</code>
       */
      public io.grasscutter.proto.EntityClientDataOuterClass.EntityClientData.Builder getEntityClientDataBuilder() {
        
        onChanged();
        return getEntityClientDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.EntityClientData entity_client_data = 9;</code>
       */
      public io.grasscutter.proto.EntityClientDataOuterClass.EntityClientDataOrBuilder getEntityClientDataOrBuilder() {
        if (entityClientDataBuilder_ != null) {
          return entityClientDataBuilder_.getMessageOrBuilder();
        } else {
          return entityClientData_ == null ?
              io.grasscutter.proto.EntityClientDataOuterClass.EntityClientData.getDefaultInstance() : entityClientData_;
        }
      }
      /**
       * <code>.EntityClientData entity_client_data = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.EntityClientDataOuterClass.EntityClientData, io.grasscutter.proto.EntityClientDataOuterClass.EntityClientData.Builder, io.grasscutter.proto.EntityClientDataOuterClass.EntityClientDataOrBuilder> 
          getEntityClientDataFieldBuilder() {
        if (entityClientDataBuilder_ == null) {
          entityClientDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.EntityClientDataOuterClass.EntityClientData, io.grasscutter.proto.EntityClientDataOuterClass.EntityClientData.Builder, io.grasscutter.proto.EntityClientDataOuterClass.EntityClientDataOrBuilder>(
                  getEntityClientData(),
                  getParentForChildren(),
                  isClean());
          entityClientData_ = null;
        }
        return entityClientDataBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SetEntityClientDataNotify)
    }

    // @@protoc_insertion_point(class_scope:SetEntityClientDataNotify)
    private static final io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify();
    }

    public static io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetEntityClientDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<SetEntityClientDataNotify>() {
      @java.lang.Override
      public SetEntityClientDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetEntityClientDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SetEntityClientDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetEntityClientDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetEntityClientDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetEntityClientDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037SetEntityClientDataNotify.proto\032\026Entit" +
      "yClientData.proto\"]\n\031SetEntityClientData" +
      "Notify\022\021\n\tentity_id\030\016 \001(\r\022-\n\022entity_clie" +
      "nt_data\030\t \001(\0132\021.EntityClientDataB\026\n\024io.g" +
      "rasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.EntityClientDataOuterClass.getDescriptor(),
        });
    internal_static_SetEntityClientDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetEntityClientDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetEntityClientDataNotify_descriptor,
        new java.lang.String[] { "EntityId", "EntityClientData", });
    io.grasscutter.proto.EntityClientDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
