// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarGainFlycloakNotify.proto

package io.grasscutter.proto;

public final class AvatarGainFlycloakNotifyOuterClass {
  private AvatarGainFlycloakNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarGainFlycloakNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarGainFlycloakNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 flycloak_id = 3;</code>
     * @return The flycloakId.
     */
    int getFlycloakId();
  }
  /**
   * <pre>
   * CmdId: 1656
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code AvatarGainFlycloakNotify}
   */
  public static final class AvatarGainFlycloakNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarGainFlycloakNotify)
      AvatarGainFlycloakNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarGainFlycloakNotify.newBuilder() to construct.
    private AvatarGainFlycloakNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarGainFlycloakNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarGainFlycloakNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarGainFlycloakNotify(
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

              flycloakId_ = input.readUInt32();
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
      return io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.internal_static_AvatarGainFlycloakNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.internal_static_AvatarGainFlycloakNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify.class, io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify.Builder.class);
    }

    public static final int FLYCLOAK_ID_FIELD_NUMBER = 3;
    private int flycloakId_;
    /**
     * <code>uint32 flycloak_id = 3;</code>
     * @return The flycloakId.
     */
    @java.lang.Override
    public int getFlycloakId() {
      return flycloakId_;
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
      if (flycloakId_ != 0) {
        output.writeUInt32(3, flycloakId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (flycloakId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, flycloakId_);
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
      if (!(obj instanceof io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify other = (io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify) obj;

      if (getFlycloakId()
          != other.getFlycloakId()) return false;
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
      hash = (37 * hash) + FLYCLOAK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFlycloakId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify prototype) {
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
     * CmdId: 1656
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code AvatarGainFlycloakNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarGainFlycloakNotify)
        io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.internal_static_AvatarGainFlycloakNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.internal_static_AvatarGainFlycloakNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify.class, io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify.newBuilder()
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
        flycloakId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.internal_static_AvatarGainFlycloakNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify build() {
        io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify buildPartial() {
        io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify result = new io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify(this);
        result.flycloakId_ = flycloakId_;
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
        if (other instanceof io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify) {
          return mergeFrom((io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify other) {
        if (other == io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify.getDefaultInstance()) return this;
        if (other.getFlycloakId() != 0) {
          setFlycloakId(other.getFlycloakId());
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
        io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int flycloakId_ ;
      /**
       * <code>uint32 flycloak_id = 3;</code>
       * @return The flycloakId.
       */
      @java.lang.Override
      public int getFlycloakId() {
        return flycloakId_;
      }
      /**
       * <code>uint32 flycloak_id = 3;</code>
       * @param value The flycloakId to set.
       * @return This builder for chaining.
       */
      public Builder setFlycloakId(int value) {
        
        flycloakId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 flycloak_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearFlycloakId() {
        
        flycloakId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AvatarGainFlycloakNotify)
    }

    // @@protoc_insertion_point(class_scope:AvatarGainFlycloakNotify)
    private static final io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify();
    }

    public static io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarGainFlycloakNotify>
        PARSER = new com.google.protobuf.AbstractParser<AvatarGainFlycloakNotify>() {
      @java.lang.Override
      public AvatarGainFlycloakNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarGainFlycloakNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarGainFlycloakNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarGainFlycloakNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarGainFlycloakNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarGainFlycloakNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036AvatarGainFlycloakNotify.proto\"/\n\030Avat" +
      "arGainFlycloakNotify\022\023\n\013flycloak_id\030\003 \001(" +
      "\rB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarGainFlycloakNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarGainFlycloakNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarGainFlycloakNotify_descriptor,
        new java.lang.String[] { "FlycloakId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
