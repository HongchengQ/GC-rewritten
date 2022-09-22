// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExpeditionAssistInfo.proto

package io.grasscutter.proto;

public final class ExpeditionAssistInfoOuterClass {
  private ExpeditionAssistInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ExpeditionAssistInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ExpeditionAssistInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string online_id = 14;</code>
     * @return The onlineId.
     */
    java.lang.String getOnlineId();
    /**
     * <code>string online_id = 14;</code>
     * @return The bytes for onlineId.
     */
    com.google.protobuf.ByteString
        getOnlineIdBytes();

    /**
     * <code>uint32 assist_time = 1;</code>
     * @return The assistTime.
     */
    int getAssistTime();

    /**
     * <code>uint32 costume_id = 6;</code>
     * @return The costumeId.
     */
    int getCostumeId();

    /**
     * <code>string target_nick_name = 4;</code>
     * @return The targetNickName.
     */
    java.lang.String getTargetNickName();
    /**
     * <code>string target_nick_name = 4;</code>
     * @return The bytes for targetNickName.
     */
    com.google.protobuf.ByteString
        getTargetNickNameBytes();

    /**
     * <code>uint32 avatar_id = 12;</code>
     * @return The avatarId.
     */
    int getAvatarId();
  }
  /**
   * Protobuf type {@code ExpeditionAssistInfo}
   */
  public static final class ExpeditionAssistInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ExpeditionAssistInfo)
      ExpeditionAssistInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ExpeditionAssistInfo.newBuilder() to construct.
    private ExpeditionAssistInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ExpeditionAssistInfo() {
      onlineId_ = "";
      targetNickName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ExpeditionAssistInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ExpeditionAssistInfo(
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

              assistTime_ = input.readUInt32();
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              targetNickName_ = s;
              break;
            }
            case 48: {

              costumeId_ = input.readUInt32();
              break;
            }
            case 96: {

              avatarId_ = input.readUInt32();
              break;
            }
            case 114: {
              java.lang.String s = input.readStringRequireUtf8();

              onlineId_ = s;
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
      return io.grasscutter.proto.ExpeditionAssistInfoOuterClass.internal_static_ExpeditionAssistInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.ExpeditionAssistInfoOuterClass.internal_static_ExpeditionAssistInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo.class, io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo.Builder.class);
    }

    public static final int ONLINE_ID_FIELD_NUMBER = 14;
    private volatile java.lang.Object onlineId_;
    /**
     * <code>string online_id = 14;</code>
     * @return The onlineId.
     */
    @java.lang.Override
    public java.lang.String getOnlineId() {
      java.lang.Object ref = onlineId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        onlineId_ = s;
        return s;
      }
    }
    /**
     * <code>string online_id = 14;</code>
     * @return The bytes for onlineId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getOnlineIdBytes() {
      java.lang.Object ref = onlineId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        onlineId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ASSIST_TIME_FIELD_NUMBER = 1;
    private int assistTime_;
    /**
     * <code>uint32 assist_time = 1;</code>
     * @return The assistTime.
     */
    @java.lang.Override
    public int getAssistTime() {
      return assistTime_;
    }

    public static final int COSTUME_ID_FIELD_NUMBER = 6;
    private int costumeId_;
    /**
     * <code>uint32 costume_id = 6;</code>
     * @return The costumeId.
     */
    @java.lang.Override
    public int getCostumeId() {
      return costumeId_;
    }

    public static final int TARGET_NICK_NAME_FIELD_NUMBER = 4;
    private volatile java.lang.Object targetNickName_;
    /**
     * <code>string target_nick_name = 4;</code>
     * @return The targetNickName.
     */
    @java.lang.Override
    public java.lang.String getTargetNickName() {
      java.lang.Object ref = targetNickName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetNickName_ = s;
        return s;
      }
    }
    /**
     * <code>string target_nick_name = 4;</code>
     * @return The bytes for targetNickName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTargetNickNameBytes() {
      java.lang.Object ref = targetNickName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        targetNickName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 12;
    private int avatarId_;
    /**
     * <code>uint32 avatar_id = 12;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
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
      if (assistTime_ != 0) {
        output.writeUInt32(1, assistTime_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetNickName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, targetNickName_);
      }
      if (costumeId_ != 0) {
        output.writeUInt32(6, costumeId_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(12, avatarId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(onlineId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 14, onlineId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (assistTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, assistTime_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetNickName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, targetNickName_);
      }
      if (costumeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, costumeId_);
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, avatarId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(onlineId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(14, onlineId_);
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
      if (!(obj instanceof io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo other = (io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo) obj;

      if (!getOnlineId()
          .equals(other.getOnlineId())) return false;
      if (getAssistTime()
          != other.getAssistTime()) return false;
      if (getCostumeId()
          != other.getCostumeId()) return false;
      if (!getTargetNickName()
          .equals(other.getTargetNickName())) return false;
      if (getAvatarId()
          != other.getAvatarId()) return false;
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
      hash = (37 * hash) + ONLINE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getOnlineId().hashCode();
      hash = (37 * hash) + ASSIST_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getAssistTime();
      hash = (37 * hash) + COSTUME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCostumeId();
      hash = (37 * hash) + TARGET_NICK_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getTargetNickName().hashCode();
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo prototype) {
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
     * Protobuf type {@code ExpeditionAssistInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ExpeditionAssistInfo)
        io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.ExpeditionAssistInfoOuterClass.internal_static_ExpeditionAssistInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.ExpeditionAssistInfoOuterClass.internal_static_ExpeditionAssistInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo.class, io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo.Builder.class);
      }

      // Construct using io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo.newBuilder()
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
        onlineId_ = "";

        assistTime_ = 0;

        costumeId_ = 0;

        targetNickName_ = "";

        avatarId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.ExpeditionAssistInfoOuterClass.internal_static_ExpeditionAssistInfo_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo getDefaultInstanceForType() {
        return io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo build() {
        io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo buildPartial() {
        io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo result = new io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo(this);
        result.onlineId_ = onlineId_;
        result.assistTime_ = assistTime_;
        result.costumeId_ = costumeId_;
        result.targetNickName_ = targetNickName_;
        result.avatarId_ = avatarId_;
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
        if (other instanceof io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo) {
          return mergeFrom((io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo other) {
        if (other == io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo.getDefaultInstance()) return this;
        if (!other.getOnlineId().isEmpty()) {
          onlineId_ = other.onlineId_;
          onChanged();
        }
        if (other.getAssistTime() != 0) {
          setAssistTime(other.getAssistTime());
        }
        if (other.getCostumeId() != 0) {
          setCostumeId(other.getCostumeId());
        }
        if (!other.getTargetNickName().isEmpty()) {
          targetNickName_ = other.targetNickName_;
          onChanged();
        }
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
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
        io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object onlineId_ = "";
      /**
       * <code>string online_id = 14;</code>
       * @return The onlineId.
       */
      public java.lang.String getOnlineId() {
        java.lang.Object ref = onlineId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          onlineId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string online_id = 14;</code>
       * @return The bytes for onlineId.
       */
      public com.google.protobuf.ByteString
          getOnlineIdBytes() {
        java.lang.Object ref = onlineId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          onlineId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string online_id = 14;</code>
       * @param value The onlineId to set.
       * @return This builder for chaining.
       */
      public Builder setOnlineId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        onlineId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string online_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearOnlineId() {
        
        onlineId_ = getDefaultInstance().getOnlineId();
        onChanged();
        return this;
      }
      /**
       * <code>string online_id = 14;</code>
       * @param value The bytes for onlineId to set.
       * @return This builder for chaining.
       */
      public Builder setOnlineIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        onlineId_ = value;
        onChanged();
        return this;
      }

      private int assistTime_ ;
      /**
       * <code>uint32 assist_time = 1;</code>
       * @return The assistTime.
       */
      @java.lang.Override
      public int getAssistTime() {
        return assistTime_;
      }
      /**
       * <code>uint32 assist_time = 1;</code>
       * @param value The assistTime to set.
       * @return This builder for chaining.
       */
      public Builder setAssistTime(int value) {
        
        assistTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 assist_time = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAssistTime() {
        
        assistTime_ = 0;
        onChanged();
        return this;
      }

      private int costumeId_ ;
      /**
       * <code>uint32 costume_id = 6;</code>
       * @return The costumeId.
       */
      @java.lang.Override
      public int getCostumeId() {
        return costumeId_;
      }
      /**
       * <code>uint32 costume_id = 6;</code>
       * @param value The costumeId to set.
       * @return This builder for chaining.
       */
      public Builder setCostumeId(int value) {
        
        costumeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 costume_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostumeId() {
        
        costumeId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object targetNickName_ = "";
      /**
       * <code>string target_nick_name = 4;</code>
       * @return The targetNickName.
       */
      public java.lang.String getTargetNickName() {
        java.lang.Object ref = targetNickName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          targetNickName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string target_nick_name = 4;</code>
       * @return The bytes for targetNickName.
       */
      public com.google.protobuf.ByteString
          getTargetNickNameBytes() {
        java.lang.Object ref = targetNickName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          targetNickName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string target_nick_name = 4;</code>
       * @param value The targetNickName to set.
       * @return This builder for chaining.
       */
      public Builder setTargetNickName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        targetNickName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string target_nick_name = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetNickName() {
        
        targetNickName_ = getDefaultInstance().getTargetNickName();
        onChanged();
        return this;
      }
      /**
       * <code>string target_nick_name = 4;</code>
       * @param value The bytes for targetNickName to set.
       * @return This builder for chaining.
       */
      public Builder setTargetNickNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        targetNickName_ = value;
        onChanged();
        return this;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 12;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 12;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ExpeditionAssistInfo)
    }

    // @@protoc_insertion_point(class_scope:ExpeditionAssistInfo)
    private static final io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo();
    }

    public static io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ExpeditionAssistInfo>
        PARSER = new com.google.protobuf.AbstractParser<ExpeditionAssistInfo>() {
      @java.lang.Override
      public ExpeditionAssistInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ExpeditionAssistInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ExpeditionAssistInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExpeditionAssistInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ExpeditionAssistInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ExpeditionAssistInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032ExpeditionAssistInfo.proto\"\177\n\024Expediti" +
      "onAssistInfo\022\021\n\tonline_id\030\016 \001(\t\022\023\n\013assis" +
      "t_time\030\001 \001(\r\022\022\n\ncostume_id\030\006 \001(\r\022\030\n\020targ" +
      "et_nick_name\030\004 \001(\t\022\021\n\tavatar_id\030\014 \001(\rB\026\n" +
      "\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ExpeditionAssistInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ExpeditionAssistInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ExpeditionAssistInfo_descriptor,
        new java.lang.String[] { "OnlineId", "AssistTime", "CostumeId", "TargetNickName", "AvatarId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
