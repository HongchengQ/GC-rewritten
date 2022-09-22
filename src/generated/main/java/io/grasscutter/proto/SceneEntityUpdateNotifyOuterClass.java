// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneEntityUpdateNotify.proto

package io.grasscutter.proto;

public final class SceneEntityUpdateNotifyOuterClass {
  private SceneEntityUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneEntityUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneEntityUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 param = 10;</code>
     * @return The param.
     */
    int getParam();

    /**
     * <code>.VisionType appear_type = 13;</code>
     * @return The enum numeric value on the wire for appearType.
     */
    int getAppearTypeValue();
    /**
     * <code>.VisionType appear_type = 13;</code>
     * @return The appearType.
     */
    io.grasscutter.proto.VisionTypeOuterClass.VisionType getAppearType();

    /**
     * <code>repeated .SceneEntityInfo entity_list = 5;</code>
     */
    java.util.List<io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo> 
        getEntityListList();
    /**
     * <code>repeated .SceneEntityInfo entity_list = 5;</code>
     */
    io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo getEntityList(int index);
    /**
     * <code>repeated .SceneEntityInfo entity_list = 5;</code>
     */
    int getEntityListCount();
    /**
     * <code>repeated .SceneEntityInfo entity_list = 5;</code>
     */
    java.util.List<? extends io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder> 
        getEntityListOrBuilderList();
    /**
     * <code>repeated .SceneEntityInfo entity_list = 5;</code>
     */
    io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder getEntityListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 3412
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code SceneEntityUpdateNotify}
   */
  public static final class SceneEntityUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneEntityUpdateNotify)
      SceneEntityUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneEntityUpdateNotify.newBuilder() to construct.
    private SceneEntityUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneEntityUpdateNotify() {
      appearType_ = 0;
      entityList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneEntityUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneEntityUpdateNotify(
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
            case 42: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                entityList_ = new java.util.ArrayList<io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              entityList_.add(
                  input.readMessage(io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo.parser(), extensionRegistry));
              break;
            }
            case 80: {

              param_ = input.readUInt32();
              break;
            }
            case 104: {
              int rawValue = input.readEnum();

              appearType_ = rawValue;
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
          entityList_ = java.util.Collections.unmodifiableList(entityList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.internal_static_SceneEntityUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.internal_static_SceneEntityUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify.class, io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify.Builder.class);
    }

    public static final int PARAM_FIELD_NUMBER = 10;
    private int param_;
    /**
     * <code>uint32 param = 10;</code>
     * @return The param.
     */
    @java.lang.Override
    public int getParam() {
      return param_;
    }

    public static final int APPEAR_TYPE_FIELD_NUMBER = 13;
    private int appearType_;
    /**
     * <code>.VisionType appear_type = 13;</code>
     * @return The enum numeric value on the wire for appearType.
     */
    @java.lang.Override public int getAppearTypeValue() {
      return appearType_;
    }
    /**
     * <code>.VisionType appear_type = 13;</code>
     * @return The appearType.
     */
    @java.lang.Override public io.grasscutter.proto.VisionTypeOuterClass.VisionType getAppearType() {
      @SuppressWarnings("deprecation")
      io.grasscutter.proto.VisionTypeOuterClass.VisionType result = io.grasscutter.proto.VisionTypeOuterClass.VisionType.valueOf(appearType_);
      return result == null ? io.grasscutter.proto.VisionTypeOuterClass.VisionType.UNRECOGNIZED : result;
    }

    public static final int ENTITY_LIST_FIELD_NUMBER = 5;
    private java.util.List<io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo> entityList_;
    /**
     * <code>repeated .SceneEntityInfo entity_list = 5;</code>
     */
    @java.lang.Override
    public java.util.List<io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo> getEntityListList() {
      return entityList_;
    }
    /**
     * <code>repeated .SceneEntityInfo entity_list = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder> 
        getEntityListOrBuilderList() {
      return entityList_;
    }
    /**
     * <code>repeated .SceneEntityInfo entity_list = 5;</code>
     */
    @java.lang.Override
    public int getEntityListCount() {
      return entityList_.size();
    }
    /**
     * <code>repeated .SceneEntityInfo entity_list = 5;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo getEntityList(int index) {
      return entityList_.get(index);
    }
    /**
     * <code>repeated .SceneEntityInfo entity_list = 5;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder getEntityListOrBuilder(
        int index) {
      return entityList_.get(index);
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
      for (int i = 0; i < entityList_.size(); i++) {
        output.writeMessage(5, entityList_.get(i));
      }
      if (param_ != 0) {
        output.writeUInt32(10, param_);
      }
      if (appearType_ != io.grasscutter.proto.VisionTypeOuterClass.VisionType.VISION_TYPE_NONE.getNumber()) {
        output.writeEnum(13, appearType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < entityList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, entityList_.get(i));
      }
      if (param_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, param_);
      }
      if (appearType_ != io.grasscutter.proto.VisionTypeOuterClass.VisionType.VISION_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(13, appearType_);
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
      if (!(obj instanceof io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify other = (io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify) obj;

      if (getParam()
          != other.getParam()) return false;
      if (appearType_ != other.appearType_) return false;
      if (!getEntityListList()
          .equals(other.getEntityListList())) return false;
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
      hash = (37 * hash) + PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getParam();
      hash = (37 * hash) + APPEAR_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + appearType_;
      if (getEntityListCount() > 0) {
        hash = (37 * hash) + ENTITY_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getEntityListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify prototype) {
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
     * CmdId: 3412
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code SceneEntityUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneEntityUpdateNotify)
        io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.internal_static_SceneEntityUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.internal_static_SceneEntityUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify.class, io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify.newBuilder()
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
          getEntityListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        param_ = 0;

        appearType_ = 0;

        if (entityListBuilder_ == null) {
          entityList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          entityListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.internal_static_SceneEntityUpdateNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify build() {
        io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify buildPartial() {
        io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify result = new io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify(this);
        int from_bitField0_ = bitField0_;
        result.param_ = param_;
        result.appearType_ = appearType_;
        if (entityListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            entityList_ = java.util.Collections.unmodifiableList(entityList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.entityList_ = entityList_;
        } else {
          result.entityList_ = entityListBuilder_.build();
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
        if (other instanceof io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify) {
          return mergeFrom((io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify other) {
        if (other == io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify.getDefaultInstance()) return this;
        if (other.getParam() != 0) {
          setParam(other.getParam());
        }
        if (other.appearType_ != 0) {
          setAppearTypeValue(other.getAppearTypeValue());
        }
        if (entityListBuilder_ == null) {
          if (!other.entityList_.isEmpty()) {
            if (entityList_.isEmpty()) {
              entityList_ = other.entityList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureEntityListIsMutable();
              entityList_.addAll(other.entityList_);
            }
            onChanged();
          }
        } else {
          if (!other.entityList_.isEmpty()) {
            if (entityListBuilder_.isEmpty()) {
              entityListBuilder_.dispose();
              entityListBuilder_ = null;
              entityList_ = other.entityList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              entityListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getEntityListFieldBuilder() : null;
            } else {
              entityListBuilder_.addAllMessages(other.entityList_);
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
        io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int param_ ;
      /**
       * <code>uint32 param = 10;</code>
       * @return The param.
       */
      @java.lang.Override
      public int getParam() {
        return param_;
      }
      /**
       * <code>uint32 param = 10;</code>
       * @param value The param to set.
       * @return This builder for chaining.
       */
      public Builder setParam(int value) {
        
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam() {
        
        param_ = 0;
        onChanged();
        return this;
      }

      private int appearType_ = 0;
      /**
       * <code>.VisionType appear_type = 13;</code>
       * @return The enum numeric value on the wire for appearType.
       */
      @java.lang.Override public int getAppearTypeValue() {
        return appearType_;
      }
      /**
       * <code>.VisionType appear_type = 13;</code>
       * @param value The enum numeric value on the wire for appearType to set.
       * @return This builder for chaining.
       */
      public Builder setAppearTypeValue(int value) {
        
        appearType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.VisionType appear_type = 13;</code>
       * @return The appearType.
       */
      @java.lang.Override
      public io.grasscutter.proto.VisionTypeOuterClass.VisionType getAppearType() {
        @SuppressWarnings("deprecation")
        io.grasscutter.proto.VisionTypeOuterClass.VisionType result = io.grasscutter.proto.VisionTypeOuterClass.VisionType.valueOf(appearType_);
        return result == null ? io.grasscutter.proto.VisionTypeOuterClass.VisionType.UNRECOGNIZED : result;
      }
      /**
       * <code>.VisionType appear_type = 13;</code>
       * @param value The appearType to set.
       * @return This builder for chaining.
       */
      public Builder setAppearType(io.grasscutter.proto.VisionTypeOuterClass.VisionType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        appearType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.VisionType appear_type = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearAppearType() {
        
        appearType_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo> entityList_ =
        java.util.Collections.emptyList();
      private void ensureEntityListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          entityList_ = new java.util.ArrayList<io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo>(entityList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo, io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder, io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder> entityListBuilder_;

      /**
       * <code>repeated .SceneEntityInfo entity_list = 5;</code>
       */
      public java.util.List<io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo> getEntityListList() {
        if (entityListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(entityList_);
        } else {
          return entityListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 5;</code>
       */
      public int getEntityListCount() {
        if (entityListBuilder_ == null) {
          return entityList_.size();
        } else {
          return entityListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 5;</code>
       */
      public io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo getEntityList(int index) {
        if (entityListBuilder_ == null) {
          return entityList_.get(index);
        } else {
          return entityListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 5;</code>
       */
      public Builder setEntityList(
          int index, io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo value) {
        if (entityListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntityListIsMutable();
          entityList_.set(index, value);
          onChanged();
        } else {
          entityListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 5;</code>
       */
      public Builder setEntityList(
          int index, io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder builderForValue) {
        if (entityListBuilder_ == null) {
          ensureEntityListIsMutable();
          entityList_.set(index, builderForValue.build());
          onChanged();
        } else {
          entityListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 5;</code>
       */
      public Builder addEntityList(io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo value) {
        if (entityListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntityListIsMutable();
          entityList_.add(value);
          onChanged();
        } else {
          entityListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 5;</code>
       */
      public Builder addEntityList(
          int index, io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo value) {
        if (entityListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntityListIsMutable();
          entityList_.add(index, value);
          onChanged();
        } else {
          entityListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 5;</code>
       */
      public Builder addEntityList(
          io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder builderForValue) {
        if (entityListBuilder_ == null) {
          ensureEntityListIsMutable();
          entityList_.add(builderForValue.build());
          onChanged();
        } else {
          entityListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 5;</code>
       */
      public Builder addEntityList(
          int index, io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder builderForValue) {
        if (entityListBuilder_ == null) {
          ensureEntityListIsMutable();
          entityList_.add(index, builderForValue.build());
          onChanged();
        } else {
          entityListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 5;</code>
       */
      public Builder addAllEntityList(
          java.lang.Iterable<? extends io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo> values) {
        if (entityListBuilder_ == null) {
          ensureEntityListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, entityList_);
          onChanged();
        } else {
          entityListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 5;</code>
       */
      public Builder clearEntityList() {
        if (entityListBuilder_ == null) {
          entityList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          entityListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 5;</code>
       */
      public Builder removeEntityList(int index) {
        if (entityListBuilder_ == null) {
          ensureEntityListIsMutable();
          entityList_.remove(index);
          onChanged();
        } else {
          entityListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 5;</code>
       */
      public io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder getEntityListBuilder(
          int index) {
        return getEntityListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 5;</code>
       */
      public io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder getEntityListOrBuilder(
          int index) {
        if (entityListBuilder_ == null) {
          return entityList_.get(index);  } else {
          return entityListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 5;</code>
       */
      public java.util.List<? extends io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder> 
           getEntityListOrBuilderList() {
        if (entityListBuilder_ != null) {
          return entityListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(entityList_);
        }
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 5;</code>
       */
      public io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder addEntityListBuilder() {
        return getEntityListFieldBuilder().addBuilder(
            io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 5;</code>
       */
      public io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder addEntityListBuilder(
          int index) {
        return getEntityListFieldBuilder().addBuilder(
            index, io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 5;</code>
       */
      public java.util.List<io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder> 
           getEntityListBuilderList() {
        return getEntityListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo, io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder, io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder> 
          getEntityListFieldBuilder() {
        if (entityListBuilder_ == null) {
          entityListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo, io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder, io.grasscutter.proto.SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder>(
                  entityList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          entityList_ = null;
        }
        return entityListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SceneEntityUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:SceneEntityUpdateNotify)
    private static final io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify();
    }

    public static io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneEntityUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<SceneEntityUpdateNotify>() {
      @java.lang.Override
      public SceneEntityUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneEntityUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneEntityUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneEntityUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneEntityUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneEntityUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035SceneEntityUpdateNotify.proto\032\025SceneEn" +
      "tityInfo.proto\032\020VisionType.proto\"q\n\027Scen" +
      "eEntityUpdateNotify\022\r\n\005param\030\n \001(\r\022 \n\013ap" +
      "pear_type\030\r \001(\0162\013.VisionType\022%\n\013entity_l" +
      "ist\030\005 \003(\0132\020.SceneEntityInfoB\026\n\024io.grassc" +
      "utter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.SceneEntityInfoOuterClass.getDescriptor(),
          io.grasscutter.proto.VisionTypeOuterClass.getDescriptor(),
        });
    internal_static_SceneEntityUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneEntityUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneEntityUpdateNotify_descriptor,
        new java.lang.String[] { "Param", "AppearType", "EntityList", });
    io.grasscutter.proto.SceneEntityInfoOuterClass.getDescriptor();
    io.grasscutter.proto.VisionTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
