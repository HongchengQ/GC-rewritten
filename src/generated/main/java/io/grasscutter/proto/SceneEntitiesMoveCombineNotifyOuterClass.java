// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneEntitiesMoveCombineNotify.proto

package io.grasscutter.proto;

public final class SceneEntitiesMoveCombineNotifyOuterClass {
  private SceneEntitiesMoveCombineNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneEntitiesMoveCombineNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneEntitiesMoveCombineNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
     */
    java.util.List<io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo> 
        getEntityMoveInfoListList();
    /**
     * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
     */
    io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo getEntityMoveInfoList(int index);
    /**
     * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
     */
    int getEntityMoveInfoListCount();
    /**
     * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
     */
    java.util.List<? extends io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfoOrBuilder> 
        getEntityMoveInfoListOrBuilderList();
    /**
     * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
     */
    io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfoOrBuilder getEntityMoveInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 3387
   * EnetChannelId: 1
   * EnetIsReliable: false
   * </pre>
   *
   * Protobuf type {@code SceneEntitiesMoveCombineNotify}
   */
  public static final class SceneEntitiesMoveCombineNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneEntitiesMoveCombineNotify)
      SceneEntitiesMoveCombineNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneEntitiesMoveCombineNotify.newBuilder() to construct.
    private SceneEntitiesMoveCombineNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneEntitiesMoveCombineNotify() {
      entityMoveInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneEntitiesMoveCombineNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneEntitiesMoveCombineNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                entityMoveInfoList_ = new java.util.ArrayList<io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              entityMoveInfoList_.add(
                  input.readMessage(io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          entityMoveInfoList_ = java.util.Collections.unmodifiableList(entityMoveInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.internal_static_SceneEntitiesMoveCombineNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.internal_static_SceneEntitiesMoveCombineNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify.class, io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify.Builder.class);
    }

    public static final int ENTITY_MOVE_INFO_LIST_FIELD_NUMBER = 8;
    private java.util.List<io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo> entityMoveInfoList_;
    /**
     * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
     */
    @java.lang.Override
    public java.util.List<io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo> getEntityMoveInfoListList() {
      return entityMoveInfoList_;
    }
    /**
     * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
     */
    @java.lang.Override
    public java.util.List<? extends io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfoOrBuilder> 
        getEntityMoveInfoListOrBuilderList() {
      return entityMoveInfoList_;
    }
    /**
     * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
     */
    @java.lang.Override
    public int getEntityMoveInfoListCount() {
      return entityMoveInfoList_.size();
    }
    /**
     * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo getEntityMoveInfoList(int index) {
      return entityMoveInfoList_.get(index);
    }
    /**
     * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfoOrBuilder getEntityMoveInfoListOrBuilder(
        int index) {
      return entityMoveInfoList_.get(index);
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
      for (int i = 0; i < entityMoveInfoList_.size(); i++) {
        output.writeMessage(8, entityMoveInfoList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < entityMoveInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, entityMoveInfoList_.get(i));
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
      if (!(obj instanceof io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify other = (io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify) obj;

      if (!getEntityMoveInfoListList()
          .equals(other.getEntityMoveInfoListList())) return false;
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
      if (getEntityMoveInfoListCount() > 0) {
        hash = (37 * hash) + ENTITY_MOVE_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getEntityMoveInfoListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify prototype) {
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
     * CmdId: 3387
     * EnetChannelId: 1
     * EnetIsReliable: false
     * </pre>
     *
     * Protobuf type {@code SceneEntitiesMoveCombineNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneEntitiesMoveCombineNotify)
        io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.internal_static_SceneEntitiesMoveCombineNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.internal_static_SceneEntitiesMoveCombineNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify.class, io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify.newBuilder()
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
          getEntityMoveInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (entityMoveInfoListBuilder_ == null) {
          entityMoveInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          entityMoveInfoListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.internal_static_SceneEntitiesMoveCombineNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify build() {
        io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify buildPartial() {
        io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify result = new io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify(this);
        int from_bitField0_ = bitField0_;
        if (entityMoveInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            entityMoveInfoList_ = java.util.Collections.unmodifiableList(entityMoveInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.entityMoveInfoList_ = entityMoveInfoList_;
        } else {
          result.entityMoveInfoList_ = entityMoveInfoListBuilder_.build();
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
        if (other instanceof io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify) {
          return mergeFrom((io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify other) {
        if (other == io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify.getDefaultInstance()) return this;
        if (entityMoveInfoListBuilder_ == null) {
          if (!other.entityMoveInfoList_.isEmpty()) {
            if (entityMoveInfoList_.isEmpty()) {
              entityMoveInfoList_ = other.entityMoveInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureEntityMoveInfoListIsMutable();
              entityMoveInfoList_.addAll(other.entityMoveInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.entityMoveInfoList_.isEmpty()) {
            if (entityMoveInfoListBuilder_.isEmpty()) {
              entityMoveInfoListBuilder_.dispose();
              entityMoveInfoListBuilder_ = null;
              entityMoveInfoList_ = other.entityMoveInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              entityMoveInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getEntityMoveInfoListFieldBuilder() : null;
            } else {
              entityMoveInfoListBuilder_.addAllMessages(other.entityMoveInfoList_);
            }
          }
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
        io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo> entityMoveInfoList_ =
        java.util.Collections.emptyList();
      private void ensureEntityMoveInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          entityMoveInfoList_ = new java.util.ArrayList<io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo>(entityMoveInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo, io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo.Builder, io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfoOrBuilder> entityMoveInfoListBuilder_;

      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
       */
      public java.util.List<io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo> getEntityMoveInfoListList() {
        if (entityMoveInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(entityMoveInfoList_);
        } else {
          return entityMoveInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
       */
      public int getEntityMoveInfoListCount() {
        if (entityMoveInfoListBuilder_ == null) {
          return entityMoveInfoList_.size();
        } else {
          return entityMoveInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
       */
      public io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo getEntityMoveInfoList(int index) {
        if (entityMoveInfoListBuilder_ == null) {
          return entityMoveInfoList_.get(index);
        } else {
          return entityMoveInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
       */
      public Builder setEntityMoveInfoList(
          int index, io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo value) {
        if (entityMoveInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntityMoveInfoListIsMutable();
          entityMoveInfoList_.set(index, value);
          onChanged();
        } else {
          entityMoveInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
       */
      public Builder setEntityMoveInfoList(
          int index, io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo.Builder builderForValue) {
        if (entityMoveInfoListBuilder_ == null) {
          ensureEntityMoveInfoListIsMutable();
          entityMoveInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          entityMoveInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
       */
      public Builder addEntityMoveInfoList(io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo value) {
        if (entityMoveInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntityMoveInfoListIsMutable();
          entityMoveInfoList_.add(value);
          onChanged();
        } else {
          entityMoveInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
       */
      public Builder addEntityMoveInfoList(
          int index, io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo value) {
        if (entityMoveInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntityMoveInfoListIsMutable();
          entityMoveInfoList_.add(index, value);
          onChanged();
        } else {
          entityMoveInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
       */
      public Builder addEntityMoveInfoList(
          io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo.Builder builderForValue) {
        if (entityMoveInfoListBuilder_ == null) {
          ensureEntityMoveInfoListIsMutable();
          entityMoveInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          entityMoveInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
       */
      public Builder addEntityMoveInfoList(
          int index, io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo.Builder builderForValue) {
        if (entityMoveInfoListBuilder_ == null) {
          ensureEntityMoveInfoListIsMutable();
          entityMoveInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          entityMoveInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
       */
      public Builder addAllEntityMoveInfoList(
          java.lang.Iterable<? extends io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo> values) {
        if (entityMoveInfoListBuilder_ == null) {
          ensureEntityMoveInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, entityMoveInfoList_);
          onChanged();
        } else {
          entityMoveInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
       */
      public Builder clearEntityMoveInfoList() {
        if (entityMoveInfoListBuilder_ == null) {
          entityMoveInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          entityMoveInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
       */
      public Builder removeEntityMoveInfoList(int index) {
        if (entityMoveInfoListBuilder_ == null) {
          ensureEntityMoveInfoListIsMutable();
          entityMoveInfoList_.remove(index);
          onChanged();
        } else {
          entityMoveInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
       */
      public io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo.Builder getEntityMoveInfoListBuilder(
          int index) {
        return getEntityMoveInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
       */
      public io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfoOrBuilder getEntityMoveInfoListOrBuilder(
          int index) {
        if (entityMoveInfoListBuilder_ == null) {
          return entityMoveInfoList_.get(index);  } else {
          return entityMoveInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
       */
      public java.util.List<? extends io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfoOrBuilder> 
           getEntityMoveInfoListOrBuilderList() {
        if (entityMoveInfoListBuilder_ != null) {
          return entityMoveInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(entityMoveInfoList_);
        }
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
       */
      public io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo.Builder addEntityMoveInfoListBuilder() {
        return getEntityMoveInfoListFieldBuilder().addBuilder(
            io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
       */
      public io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo.Builder addEntityMoveInfoListBuilder(
          int index) {
        return getEntityMoveInfoListFieldBuilder().addBuilder(
            index, io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 8;</code>
       */
      public java.util.List<io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo.Builder> 
           getEntityMoveInfoListBuilderList() {
        return getEntityMoveInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo, io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo.Builder, io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfoOrBuilder> 
          getEntityMoveInfoListFieldBuilder() {
        if (entityMoveInfoListBuilder_ == null) {
          entityMoveInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo, io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfo.Builder, io.grasscutter.proto.EntityMoveInfoOuterClass.EntityMoveInfoOrBuilder>(
                  entityMoveInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          entityMoveInfoList_ = null;
        }
        return entityMoveInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SceneEntitiesMoveCombineNotify)
    }

    // @@protoc_insertion_point(class_scope:SceneEntitiesMoveCombineNotify)
    private static final io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify();
    }

    public static io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneEntitiesMoveCombineNotify>
        PARSER = new com.google.protobuf.AbstractParser<SceneEntitiesMoveCombineNotify>() {
      @java.lang.Override
      public SceneEntitiesMoveCombineNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneEntitiesMoveCombineNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneEntitiesMoveCombineNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneEntitiesMoveCombineNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.SceneEntitiesMoveCombineNotifyOuterClass.SceneEntitiesMoveCombineNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneEntitiesMoveCombineNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneEntitiesMoveCombineNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$SceneEntitiesMoveCombineNotify.proto\032\024" +
      "EntityMoveInfo.proto\"P\n\036SceneEntitiesMov" +
      "eCombineNotify\022.\n\025entity_move_info_list\030" +
      "\010 \003(\0132\017.EntityMoveInfoB\026\n\024io.grasscutter" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.EntityMoveInfoOuterClass.getDescriptor(),
        });
    internal_static_SceneEntitiesMoveCombineNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneEntitiesMoveCombineNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneEntitiesMoveCombineNotify_descriptor,
        new java.lang.String[] { "EntityMoveInfoList", });
    io.grasscutter.proto.EntityMoveInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
