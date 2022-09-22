// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetLimitOptimizationNotify.proto

package io.grasscutter.proto;

public final class SetLimitOptimizationNotifyOuterClass {
  private SetLimitOptimizationNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetLimitOptimizationNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetLimitOptimizationNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_active = 3;</code>
     * @return The isActive.
     */
    boolean getIsActive();
  }
  /**
   * <pre>
   * CmdId: 8851
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code SetLimitOptimizationNotify}
   */
  public static final class SetLimitOptimizationNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetLimitOptimizationNotify)
      SetLimitOptimizationNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetLimitOptimizationNotify.newBuilder() to construct.
    private SetLimitOptimizationNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetLimitOptimizationNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetLimitOptimizationNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetLimitOptimizationNotify(
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
            case 24: {

              isActive_ = input.readBool();
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
      return io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.internal_static_SetLimitOptimizationNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.internal_static_SetLimitOptimizationNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify.class, io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify.Builder.class);
    }

    public static final int IS_ACTIVE_FIELD_NUMBER = 3;
    private boolean isActive_;
    /**
     * <code>bool is_active = 3;</code>
     * @return The isActive.
     */
    @java.lang.Override
    public boolean getIsActive() {
      return isActive_;
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
      if (isActive_ != false) {
        output.writeBool(3, isActive_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isActive_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isActive_);
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
      if (!(obj instanceof io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify other = (io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify) obj;

      if (getIsActive()
          != other.getIsActive()) return false;
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
      hash = (37 * hash) + IS_ACTIVE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsActive());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify prototype) {
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
     * CmdId: 8851
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code SetLimitOptimizationNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetLimitOptimizationNotify)
        io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.internal_static_SetLimitOptimizationNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.internal_static_SetLimitOptimizationNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify.class, io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify.newBuilder()
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
        isActive_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.internal_static_SetLimitOptimizationNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify build() {
        io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify buildPartial() {
        io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify result = new io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify(this);
        result.isActive_ = isActive_;
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
        if (other instanceof io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify) {
          return mergeFrom((io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify other) {
        if (other == io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify.getDefaultInstance()) return this;
        if (other.getIsActive() != false) {
          setIsActive(other.getIsActive());
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
        io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isActive_ ;
      /**
       * <code>bool is_active = 3;</code>
       * @return The isActive.
       */
      @java.lang.Override
      public boolean getIsActive() {
        return isActive_;
      }
      /**
       * <code>bool is_active = 3;</code>
       * @param value The isActive to set.
       * @return This builder for chaining.
       */
      public Builder setIsActive(boolean value) {
        
        isActive_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_active = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsActive() {
        
        isActive_ = false;
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


      // @@protoc_insertion_point(builder_scope:SetLimitOptimizationNotify)
    }

    // @@protoc_insertion_point(class_scope:SetLimitOptimizationNotify)
    private static final io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify();
    }

    public static io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetLimitOptimizationNotify>
        PARSER = new com.google.protobuf.AbstractParser<SetLimitOptimizationNotify>() {
      @java.lang.Override
      public SetLimitOptimizationNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetLimitOptimizationNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SetLimitOptimizationNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetLimitOptimizationNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.SetLimitOptimizationNotifyOuterClass.SetLimitOptimizationNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetLimitOptimizationNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetLimitOptimizationNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n SetLimitOptimizationNotify.proto\"/\n\032Se" +
      "tLimitOptimizationNotify\022\021\n\tis_active\030\003 " +
      "\001(\010B\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SetLimitOptimizationNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetLimitOptimizationNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetLimitOptimizationNotify_descriptor,
        new java.lang.String[] { "IsActive", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
