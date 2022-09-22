// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MPLevelEntityInfo.proto

package io.grasscutter.proto;

public final class MPLevelEntityInfoOuterClass {
  private MPLevelEntityInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MPLevelEntityInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MPLevelEntityInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.AbilitySyncStateInfo ability_info = 2;</code>
     * @return Whether the abilityInfo field is set.
     */
    boolean hasAbilityInfo();
    /**
     * <code>.AbilitySyncStateInfo ability_info = 2;</code>
     * @return The abilityInfo.
     */
    io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAbilityInfo();
    /**
     * <code>.AbilitySyncStateInfo ability_info = 2;</code>
     */
    io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAbilityInfoOrBuilder();

    /**
     * <code>uint32 entity_id = 11;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint32 authority_peer_id = 3;</code>
     * @return The authorityPeerId.
     */
    int getAuthorityPeerId();
  }
  /**
   * Protobuf type {@code MPLevelEntityInfo}
   */
  public static final class MPLevelEntityInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MPLevelEntityInfo)
      MPLevelEntityInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MPLevelEntityInfo.newBuilder() to construct.
    private MPLevelEntityInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MPLevelEntityInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MPLevelEntityInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MPLevelEntityInfo(
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
            case 18: {
              io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder subBuilder = null;
              if (abilityInfo_ != null) {
                subBuilder = abilityInfo_.toBuilder();
              }
              abilityInfo_ = input.readMessage(io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(abilityInfo_);
                abilityInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 24: {

              authorityPeerId_ = input.readUInt32();
              break;
            }
            case 88: {

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
      return io.grasscutter.proto.MPLevelEntityInfoOuterClass.internal_static_MPLevelEntityInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.MPLevelEntityInfoOuterClass.internal_static_MPLevelEntityInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo.class, io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo.Builder.class);
    }

    public static final int ABILITY_INFO_FIELD_NUMBER = 2;
    private io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo abilityInfo_;
    /**
     * <code>.AbilitySyncStateInfo ability_info = 2;</code>
     * @return Whether the abilityInfo field is set.
     */
    @java.lang.Override
    public boolean hasAbilityInfo() {
      return abilityInfo_ != null;
    }
    /**
     * <code>.AbilitySyncStateInfo ability_info = 2;</code>
     * @return The abilityInfo.
     */
    @java.lang.Override
    public io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAbilityInfo() {
      return abilityInfo_ == null ? io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : abilityInfo_;
    }
    /**
     * <code>.AbilitySyncStateInfo ability_info = 2;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAbilityInfoOrBuilder() {
      return getAbilityInfo();
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 11;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 11;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int AUTHORITY_PEER_ID_FIELD_NUMBER = 3;
    private int authorityPeerId_;
    /**
     * <code>uint32 authority_peer_id = 3;</code>
     * @return The authorityPeerId.
     */
    @java.lang.Override
    public int getAuthorityPeerId() {
      return authorityPeerId_;
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
      if (abilityInfo_ != null) {
        output.writeMessage(2, getAbilityInfo());
      }
      if (authorityPeerId_ != 0) {
        output.writeUInt32(3, authorityPeerId_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(11, entityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (abilityInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getAbilityInfo());
      }
      if (authorityPeerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, authorityPeerId_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, entityId_);
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
      if (!(obj instanceof io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo other = (io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo) obj;

      if (hasAbilityInfo() != other.hasAbilityInfo()) return false;
      if (hasAbilityInfo()) {
        if (!getAbilityInfo()
            .equals(other.getAbilityInfo())) return false;
      }
      if (getEntityId()
          != other.getEntityId()) return false;
      if (getAuthorityPeerId()
          != other.getAuthorityPeerId()) return false;
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
      if (hasAbilityInfo()) {
        hash = (37 * hash) + ABILITY_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getAbilityInfo().hashCode();
      }
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + AUTHORITY_PEER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAuthorityPeerId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo prototype) {
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
     * Protobuf type {@code MPLevelEntityInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MPLevelEntityInfo)
        io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.MPLevelEntityInfoOuterClass.internal_static_MPLevelEntityInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.MPLevelEntityInfoOuterClass.internal_static_MPLevelEntityInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo.class, io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo.Builder.class);
      }

      // Construct using io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo.newBuilder()
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
        if (abilityInfoBuilder_ == null) {
          abilityInfo_ = null;
        } else {
          abilityInfo_ = null;
          abilityInfoBuilder_ = null;
        }
        entityId_ = 0;

        authorityPeerId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.MPLevelEntityInfoOuterClass.internal_static_MPLevelEntityInfo_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo getDefaultInstanceForType() {
        return io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo build() {
        io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo buildPartial() {
        io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo result = new io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo(this);
        if (abilityInfoBuilder_ == null) {
          result.abilityInfo_ = abilityInfo_;
        } else {
          result.abilityInfo_ = abilityInfoBuilder_.build();
        }
        result.entityId_ = entityId_;
        result.authorityPeerId_ = authorityPeerId_;
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
        if (other instanceof io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo) {
          return mergeFrom((io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo other) {
        if (other == io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo.getDefaultInstance()) return this;
        if (other.hasAbilityInfo()) {
          mergeAbilityInfo(other.getAbilityInfo());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getAuthorityPeerId() != 0) {
          setAuthorityPeerId(other.getAuthorityPeerId());
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
        io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo abilityInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> abilityInfoBuilder_;
      /**
       * <code>.AbilitySyncStateInfo ability_info = 2;</code>
       * @return Whether the abilityInfo field is set.
       */
      public boolean hasAbilityInfo() {
        return abilityInfoBuilder_ != null || abilityInfo_ != null;
      }
      /**
       * <code>.AbilitySyncStateInfo ability_info = 2;</code>
       * @return The abilityInfo.
       */
      public io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAbilityInfo() {
        if (abilityInfoBuilder_ == null) {
          return abilityInfo_ == null ? io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : abilityInfo_;
        } else {
          return abilityInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.AbilitySyncStateInfo ability_info = 2;</code>
       */
      public Builder setAbilityInfo(io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
        if (abilityInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          abilityInfo_ = value;
          onChanged();
        } else {
          abilityInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo ability_info = 2;</code>
       */
      public Builder setAbilityInfo(
          io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder builderForValue) {
        if (abilityInfoBuilder_ == null) {
          abilityInfo_ = builderForValue.build();
          onChanged();
        } else {
          abilityInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo ability_info = 2;</code>
       */
      public Builder mergeAbilityInfo(io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
        if (abilityInfoBuilder_ == null) {
          if (abilityInfo_ != null) {
            abilityInfo_ =
              io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder(abilityInfo_).mergeFrom(value).buildPartial();
          } else {
            abilityInfo_ = value;
          }
          onChanged();
        } else {
          abilityInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo ability_info = 2;</code>
       */
      public Builder clearAbilityInfo() {
        if (abilityInfoBuilder_ == null) {
          abilityInfo_ = null;
          onChanged();
        } else {
          abilityInfo_ = null;
          abilityInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo ability_info = 2;</code>
       */
      public io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder getAbilityInfoBuilder() {
        
        onChanged();
        return getAbilityInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.AbilitySyncStateInfo ability_info = 2;</code>
       */
      public io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAbilityInfoOrBuilder() {
        if (abilityInfoBuilder_ != null) {
          return abilityInfoBuilder_.getMessageOrBuilder();
        } else {
          return abilityInfo_ == null ?
              io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : abilityInfo_;
        }
      }
      /**
       * <code>.AbilitySyncStateInfo ability_info = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> 
          getAbilityInfoFieldBuilder() {
        if (abilityInfoBuilder_ == null) {
          abilityInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, io.grasscutter.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder>(
                  getAbilityInfo(),
                  getParentForChildren(),
                  isClean());
          abilityInfo_ = null;
        }
        return abilityInfoBuilder_;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 11;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 11;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int authorityPeerId_ ;
      /**
       * <code>uint32 authority_peer_id = 3;</code>
       * @return The authorityPeerId.
       */
      @java.lang.Override
      public int getAuthorityPeerId() {
        return authorityPeerId_;
      }
      /**
       * <code>uint32 authority_peer_id = 3;</code>
       * @param value The authorityPeerId to set.
       * @return This builder for chaining.
       */
      public Builder setAuthorityPeerId(int value) {
        
        authorityPeerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 authority_peer_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAuthorityPeerId() {
        
        authorityPeerId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MPLevelEntityInfo)
    }

    // @@protoc_insertion_point(class_scope:MPLevelEntityInfo)
    private static final io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo();
    }

    public static io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MPLevelEntityInfo>
        PARSER = new com.google.protobuf.AbstractParser<MPLevelEntityInfo>() {
      @java.lang.Override
      public MPLevelEntityInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MPLevelEntityInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MPLevelEntityInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MPLevelEntityInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MPLevelEntityInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MPLevelEntityInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027MPLevelEntityInfo.proto\032\032AbilitySyncSt" +
      "ateInfo.proto\"n\n\021MPLevelEntityInfo\022+\n\014ab" +
      "ility_info\030\002 \001(\0132\025.AbilitySyncStateInfo\022" +
      "\021\n\tentity_id\030\013 \001(\r\022\031\n\021authority_peer_id\030" +
      "\003 \001(\rB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.AbilitySyncStateInfoOuterClass.getDescriptor(),
        });
    internal_static_MPLevelEntityInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MPLevelEntityInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MPLevelEntityInfo_descriptor,
        new java.lang.String[] { "AbilityInfo", "EntityId", "AuthorityPeerId", });
    io.grasscutter.proto.AbilitySyncStateInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
