// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityInvocationFailNotify.proto

package io.grasscutter.proto;

public final class AbilityInvocationFailNotifyOuterClass {
  private AbilityInvocationFailNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityInvocationFailNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityInvocationFailNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string reason = 7;</code>
     * @return The reason.
     */
    java.lang.String getReason();
    /**
     * <code>string reason = 7;</code>
     * @return The bytes for reason.
     */
    com.google.protobuf.ByteString
        getReasonBytes();

    /**
     * <code>uint32 entity_id = 13;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.AbilityInvokeEntry invoke = 3;</code>
     * @return Whether the invoke field is set.
     */
    boolean hasInvoke();
    /**
     * <code>.AbilityInvokeEntry invoke = 3;</code>
     * @return The invoke.
     */
    io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry getInvoke();
    /**
     * <code>.AbilityInvokeEntry invoke = 3;</code>
     */
    io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder getInvokeOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 1107
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code AbilityInvocationFailNotify}
   */
  public static final class AbilityInvocationFailNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityInvocationFailNotify)
      AbilityInvocationFailNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityInvocationFailNotify.newBuilder() to construct.
    private AbilityInvocationFailNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityInvocationFailNotify() {
      reason_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityInvocationFailNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AbilityInvocationFailNotify(
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
            case 26: {
              io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder subBuilder = null;
              if (invoke_ != null) {
                subBuilder = invoke_.toBuilder();
              }
              invoke_ = input.readMessage(io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(invoke_);
                invoke_ = subBuilder.buildPartial();
              }

              break;
            }
            case 58: {
              java.lang.String s = input.readStringRequireUtf8();

              reason_ = s;
              break;
            }
            case 104: {

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
      return io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.internal_static_AbilityInvocationFailNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.internal_static_AbilityInvocationFailNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify.class, io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify.Builder.class);
    }

    public static final int REASON_FIELD_NUMBER = 7;
    private volatile java.lang.Object reason_;
    /**
     * <code>string reason = 7;</code>
     * @return The reason.
     */
    @java.lang.Override
    public java.lang.String getReason() {
      java.lang.Object ref = reason_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reason_ = s;
        return s;
      }
    }
    /**
     * <code>string reason = 7;</code>
     * @return The bytes for reason.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getReasonBytes() {
      java.lang.Object ref = reason_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reason_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 13;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 13;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int INVOKE_FIELD_NUMBER = 3;
    private io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry invoke_;
    /**
     * <code>.AbilityInvokeEntry invoke = 3;</code>
     * @return Whether the invoke field is set.
     */
    @java.lang.Override
    public boolean hasInvoke() {
      return invoke_ != null;
    }
    /**
     * <code>.AbilityInvokeEntry invoke = 3;</code>
     * @return The invoke.
     */
    @java.lang.Override
    public io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry getInvoke() {
      return invoke_ == null ? io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.getDefaultInstance() : invoke_;
    }
    /**
     * <code>.AbilityInvokeEntry invoke = 3;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder getInvokeOrBuilder() {
      return getInvoke();
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
      if (invoke_ != null) {
        output.writeMessage(3, getInvoke());
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reason_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, reason_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(13, entityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (invoke_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getInvoke());
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reason_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, reason_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, entityId_);
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
      if (!(obj instanceof io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify other = (io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify) obj;

      if (!getReason()
          .equals(other.getReason())) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
      if (hasInvoke() != other.hasInvoke()) return false;
      if (hasInvoke()) {
        if (!getInvoke()
            .equals(other.getInvoke())) return false;
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
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + getReason().hashCode();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (hasInvoke()) {
        hash = (37 * hash) + INVOKE_FIELD_NUMBER;
        hash = (53 * hash) + getInvoke().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify prototype) {
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
     * CmdId: 1107
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code AbilityInvocationFailNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityInvocationFailNotify)
        io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.internal_static_AbilityInvocationFailNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.internal_static_AbilityInvocationFailNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify.class, io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify.newBuilder()
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
        reason_ = "";

        entityId_ = 0;

        if (invokeBuilder_ == null) {
          invoke_ = null;
        } else {
          invoke_ = null;
          invokeBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.internal_static_AbilityInvocationFailNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify build() {
        io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify buildPartial() {
        io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify result = new io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify(this);
        result.reason_ = reason_;
        result.entityId_ = entityId_;
        if (invokeBuilder_ == null) {
          result.invoke_ = invoke_;
        } else {
          result.invoke_ = invokeBuilder_.build();
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
        if (other instanceof io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify) {
          return mergeFrom((io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify other) {
        if (other == io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify.getDefaultInstance()) return this;
        if (!other.getReason().isEmpty()) {
          reason_ = other.reason_;
          onChanged();
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.hasInvoke()) {
          mergeInvoke(other.getInvoke());
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
        io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object reason_ = "";
      /**
       * <code>string reason = 7;</code>
       * @return The reason.
       */
      public java.lang.String getReason() {
        java.lang.Object ref = reason_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          reason_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string reason = 7;</code>
       * @return The bytes for reason.
       */
      public com.google.protobuf.ByteString
          getReasonBytes() {
        java.lang.Object ref = reason_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          reason_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string reason = 7;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string reason = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = getDefaultInstance().getReason();
        onChanged();
        return this;
      }
      /**
       * <code>string reason = 7;</code>
       * @param value The bytes for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        reason_ = value;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 13;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 13;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry invoke_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry, io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder, io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder> invokeBuilder_;
      /**
       * <code>.AbilityInvokeEntry invoke = 3;</code>
       * @return Whether the invoke field is set.
       */
      public boolean hasInvoke() {
        return invokeBuilder_ != null || invoke_ != null;
      }
      /**
       * <code>.AbilityInvokeEntry invoke = 3;</code>
       * @return The invoke.
       */
      public io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry getInvoke() {
        if (invokeBuilder_ == null) {
          return invoke_ == null ? io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.getDefaultInstance() : invoke_;
        } else {
          return invokeBuilder_.getMessage();
        }
      }
      /**
       * <code>.AbilityInvokeEntry invoke = 3;</code>
       */
      public Builder setInvoke(io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry value) {
        if (invokeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          invoke_ = value;
          onChanged();
        } else {
          invokeBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AbilityInvokeEntry invoke = 3;</code>
       */
      public Builder setInvoke(
          io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder builderForValue) {
        if (invokeBuilder_ == null) {
          invoke_ = builderForValue.build();
          onChanged();
        } else {
          invokeBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AbilityInvokeEntry invoke = 3;</code>
       */
      public Builder mergeInvoke(io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry value) {
        if (invokeBuilder_ == null) {
          if (invoke_ != null) {
            invoke_ =
              io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.newBuilder(invoke_).mergeFrom(value).buildPartial();
          } else {
            invoke_ = value;
          }
          onChanged();
        } else {
          invokeBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AbilityInvokeEntry invoke = 3;</code>
       */
      public Builder clearInvoke() {
        if (invokeBuilder_ == null) {
          invoke_ = null;
          onChanged();
        } else {
          invoke_ = null;
          invokeBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AbilityInvokeEntry invoke = 3;</code>
       */
      public io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder getInvokeBuilder() {
        
        onChanged();
        return getInvokeFieldBuilder().getBuilder();
      }
      /**
       * <code>.AbilityInvokeEntry invoke = 3;</code>
       */
      public io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder getInvokeOrBuilder() {
        if (invokeBuilder_ != null) {
          return invokeBuilder_.getMessageOrBuilder();
        } else {
          return invoke_ == null ?
              io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.getDefaultInstance() : invoke_;
        }
      }
      /**
       * <code>.AbilityInvokeEntry invoke = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry, io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder, io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder> 
          getInvokeFieldBuilder() {
        if (invokeBuilder_ == null) {
          invokeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry, io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder, io.grasscutter.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder>(
                  getInvoke(),
                  getParentForChildren(),
                  isClean());
          invoke_ = null;
        }
        return invokeBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AbilityInvocationFailNotify)
    }

    // @@protoc_insertion_point(class_scope:AbilityInvocationFailNotify)
    private static final io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify();
    }

    public static io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityInvocationFailNotify>
        PARSER = new com.google.protobuf.AbstractParser<AbilityInvocationFailNotify>() {
      @java.lang.Override
      public AbilityInvocationFailNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AbilityInvocationFailNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AbilityInvocationFailNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityInvocationFailNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.AbilityInvocationFailNotifyOuterClass.AbilityInvocationFailNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityInvocationFailNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityInvocationFailNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!AbilityInvocationFailNotify.proto\032\030Abi" +
      "lityInvokeEntry.proto\"e\n\033AbilityInvocati" +
      "onFailNotify\022\016\n\006reason\030\007 \001(\t\022\021\n\tentity_i" +
      "d\030\r \001(\r\022#\n\006invoke\030\003 \001(\0132\023.AbilityInvokeE" +
      "ntryB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.AbilityInvokeEntryOuterClass.getDescriptor(),
        });
    internal_static_AbilityInvocationFailNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityInvocationFailNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityInvocationFailNotify_descriptor,
        new java.lang.String[] { "Reason", "EntityId", "Invoke", });
    io.grasscutter.proto.AbilityInvokeEntryOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
