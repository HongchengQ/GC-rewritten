// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityChangeNotify.proto

package io.grasscutter.proto;

public final class AbilityChangeNotifyOuterClass {
  private AbilityChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 1;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.AbilityControlBlock ability_control_block = 15;</code>
     * @return Whether the abilityControlBlock field is set.
     */
    boolean hasAbilityControlBlock();
    /**
     * <code>.AbilityControlBlock ability_control_block = 15;</code>
     * @return The abilityControlBlock.
     */
    io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlock getAbilityControlBlock();
    /**
     * <code>.AbilityControlBlock ability_control_block = 15;</code>
     */
    io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder getAbilityControlBlockOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 1131
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code AbilityChangeNotify}
   */
  public static final class AbilityChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityChangeNotify)
      AbilityChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityChangeNotify.newBuilder() to construct.
    private AbilityChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityChangeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AbilityChangeNotify(
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

              entityId_ = input.readUInt32();
              break;
            }
            case 122: {
              io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlock.Builder subBuilder = null;
              if (abilityControlBlock_ != null) {
                subBuilder = abilityControlBlock_.toBuilder();
              }
              abilityControlBlock_ = input.readMessage(io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlock.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(abilityControlBlock_);
                abilityControlBlock_ = subBuilder.buildPartial();
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
      return io.grasscutter.proto.AbilityChangeNotifyOuterClass.internal_static_AbilityChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.AbilityChangeNotifyOuterClass.internal_static_AbilityChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify.class, io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 1;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 1;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int ABILITY_CONTROL_BLOCK_FIELD_NUMBER = 15;
    private io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlock abilityControlBlock_;
    /**
     * <code>.AbilityControlBlock ability_control_block = 15;</code>
     * @return Whether the abilityControlBlock field is set.
     */
    @java.lang.Override
    public boolean hasAbilityControlBlock() {
      return abilityControlBlock_ != null;
    }
    /**
     * <code>.AbilityControlBlock ability_control_block = 15;</code>
     * @return The abilityControlBlock.
     */
    @java.lang.Override
    public io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlock getAbilityControlBlock() {
      return abilityControlBlock_ == null ? io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlock.getDefaultInstance() : abilityControlBlock_;
    }
    /**
     * <code>.AbilityControlBlock ability_control_block = 15;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder getAbilityControlBlockOrBuilder() {
      return getAbilityControlBlock();
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
      if (entityId_ != 0) {
        output.writeUInt32(1, entityId_);
      }
      if (abilityControlBlock_ != null) {
        output.writeMessage(15, getAbilityControlBlock());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, entityId_);
      }
      if (abilityControlBlock_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getAbilityControlBlock());
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
      if (!(obj instanceof io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify other = (io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (hasAbilityControlBlock() != other.hasAbilityControlBlock()) return false;
      if (hasAbilityControlBlock()) {
        if (!getAbilityControlBlock()
            .equals(other.getAbilityControlBlock())) return false;
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
      if (hasAbilityControlBlock()) {
        hash = (37 * hash) + ABILITY_CONTROL_BLOCK_FIELD_NUMBER;
        hash = (53 * hash) + getAbilityControlBlock().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify prototype) {
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
     * CmdId: 1131
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code AbilityChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityChangeNotify)
        io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.AbilityChangeNotifyOuterClass.internal_static_AbilityChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.AbilityChangeNotifyOuterClass.internal_static_AbilityChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify.class, io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify.newBuilder()
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

        if (abilityControlBlockBuilder_ == null) {
          abilityControlBlock_ = null;
        } else {
          abilityControlBlock_ = null;
          abilityControlBlockBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.AbilityChangeNotifyOuterClass.internal_static_AbilityChangeNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify build() {
        io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify buildPartial() {
        io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify result = new io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify(this);
        result.entityId_ = entityId_;
        if (abilityControlBlockBuilder_ == null) {
          result.abilityControlBlock_ = abilityControlBlock_;
        } else {
          result.abilityControlBlock_ = abilityControlBlockBuilder_.build();
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
        if (other instanceof io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify) {
          return mergeFrom((io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify other) {
        if (other == io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.hasAbilityControlBlock()) {
          mergeAbilityControlBlock(other.getAbilityControlBlock());
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
        io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify) e.getUnfinishedMessage();
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
       * <code>uint32 entity_id = 1;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 1;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlock abilityControlBlock_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlock, io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlock.Builder, io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder> abilityControlBlockBuilder_;
      /**
       * <code>.AbilityControlBlock ability_control_block = 15;</code>
       * @return Whether the abilityControlBlock field is set.
       */
      public boolean hasAbilityControlBlock() {
        return abilityControlBlockBuilder_ != null || abilityControlBlock_ != null;
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 15;</code>
       * @return The abilityControlBlock.
       */
      public io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlock getAbilityControlBlock() {
        if (abilityControlBlockBuilder_ == null) {
          return abilityControlBlock_ == null ? io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlock.getDefaultInstance() : abilityControlBlock_;
        } else {
          return abilityControlBlockBuilder_.getMessage();
        }
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 15;</code>
       */
      public Builder setAbilityControlBlock(io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlock value) {
        if (abilityControlBlockBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          abilityControlBlock_ = value;
          onChanged();
        } else {
          abilityControlBlockBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 15;</code>
       */
      public Builder setAbilityControlBlock(
          io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlock.Builder builderForValue) {
        if (abilityControlBlockBuilder_ == null) {
          abilityControlBlock_ = builderForValue.build();
          onChanged();
        } else {
          abilityControlBlockBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 15;</code>
       */
      public Builder mergeAbilityControlBlock(io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlock value) {
        if (abilityControlBlockBuilder_ == null) {
          if (abilityControlBlock_ != null) {
            abilityControlBlock_ =
              io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlock.newBuilder(abilityControlBlock_).mergeFrom(value).buildPartial();
          } else {
            abilityControlBlock_ = value;
          }
          onChanged();
        } else {
          abilityControlBlockBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 15;</code>
       */
      public Builder clearAbilityControlBlock() {
        if (abilityControlBlockBuilder_ == null) {
          abilityControlBlock_ = null;
          onChanged();
        } else {
          abilityControlBlock_ = null;
          abilityControlBlockBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 15;</code>
       */
      public io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlock.Builder getAbilityControlBlockBuilder() {
        
        onChanged();
        return getAbilityControlBlockFieldBuilder().getBuilder();
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 15;</code>
       */
      public io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder getAbilityControlBlockOrBuilder() {
        if (abilityControlBlockBuilder_ != null) {
          return abilityControlBlockBuilder_.getMessageOrBuilder();
        } else {
          return abilityControlBlock_ == null ?
              io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlock.getDefaultInstance() : abilityControlBlock_;
        }
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlock, io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlock.Builder, io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder> 
          getAbilityControlBlockFieldBuilder() {
        if (abilityControlBlockBuilder_ == null) {
          abilityControlBlockBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlock, io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlock.Builder, io.grasscutter.proto.AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder>(
                  getAbilityControlBlock(),
                  getParentForChildren(),
                  isClean());
          abilityControlBlock_ = null;
        }
        return abilityControlBlockBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AbilityChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:AbilityChangeNotify)
    private static final io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify();
    }

    public static io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<AbilityChangeNotify>() {
      @java.lang.Override
      public AbilityChangeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AbilityChangeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AbilityChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031AbilityChangeNotify.proto\032\031AbilityCont" +
      "rolBlock.proto\"]\n\023AbilityChangeNotify\022\021\n" +
      "\tentity_id\030\001 \001(\r\0223\n\025ability_control_bloc" +
      "k\030\017 \001(\0132\024.AbilityControlBlockB\026\n\024io.gras" +
      "scutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.AbilityControlBlockOuterClass.getDescriptor(),
        });
    internal_static_AbilityChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityChangeNotify_descriptor,
        new java.lang.String[] { "EntityId", "AbilityControlBlock", });
    io.grasscutter.proto.AbilityControlBlockOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
