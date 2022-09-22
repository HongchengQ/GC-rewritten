// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_MHMBDFKOOLJ_ClientNotify.proto

package io.grasscutter.proto;

public final class Unk2700MHMBDFKOOLJClientNotify {
  private Unk2700MHMBDFKOOLJClientNotify() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_MHMBDFKOOLJ_ClientNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_MHMBDFKOOLJ_ClientNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 6234
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_MHMBDFKOOLJ_ClientNotify}
   */
  public static final class Unk2700_MHMBDFKOOLJ_ClientNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_MHMBDFKOOLJ_ClientNotify)
      Unk2700_MHMBDFKOOLJ_ClientNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_MHMBDFKOOLJ_ClientNotify.newBuilder() to construct.
    private Unk2700_MHMBDFKOOLJ_ClientNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_MHMBDFKOOLJ_ClientNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_MHMBDFKOOLJ_ClientNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_MHMBDFKOOLJ_ClientNotify(
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
            case 120: {

              retcode_ = input.readInt32();
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
      return io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.internal_static_Unk2700_MHMBDFKOOLJ_ClientNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.internal_static_Unk2700_MHMBDFKOOLJ_ClientNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify.class, io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 15;
    private int retcode_;
    /**
     * <code>int32 retcode = 15;</code>
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
        output.writeInt32(15, retcode_);
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
          .computeInt32Size(15, retcode_);
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
      if (!(obj instanceof io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify other = (io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify) obj;

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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify prototype) {
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
     * CmdId: 6234
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_MHMBDFKOOLJ_ClientNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_MHMBDFKOOLJ_ClientNotify)
        io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.internal_static_Unk2700_MHMBDFKOOLJ_ClientNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.internal_static_Unk2700_MHMBDFKOOLJ_ClientNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify.class, io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify.newBuilder()
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
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.internal_static_Unk2700_MHMBDFKOOLJ_ClientNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify build() {
        io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify buildPartial() {
        io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify result = new io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify(this);
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
        if (other instanceof io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify) {
          return mergeFrom((io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify other) {
        if (other == io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify.getDefaultInstance()) return this;
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
        io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 15;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 15;</code>
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


      // @@protoc_insertion_point(builder_scope:Unk2700_MHMBDFKOOLJ_ClientNotify)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_MHMBDFKOOLJ_ClientNotify)
    private static final io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify();
    }

    public static io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_MHMBDFKOOLJ_ClientNotify>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_MHMBDFKOOLJ_ClientNotify>() {
      @java.lang.Override
      public Unk2700_MHMBDFKOOLJ_ClientNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_MHMBDFKOOLJ_ClientNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_MHMBDFKOOLJ_ClientNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_MHMBDFKOOLJ_ClientNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.Unk2700MHMBDFKOOLJClientNotify.Unk2700_MHMBDFKOOLJ_ClientNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_MHMBDFKOOLJ_ClientNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_MHMBDFKOOLJ_ClientNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&Unk2700_MHMBDFKOOLJ_ClientNotify.proto" +
      "\"3\n Unk2700_MHMBDFKOOLJ_ClientNotify\022\017\n\007" +
      "retcode\030\017 \001(\005B\026\n\024io.grasscutter.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_MHMBDFKOOLJ_ClientNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_MHMBDFKOOLJ_ClientNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_MHMBDFKOOLJ_ClientNotify_descriptor,
        new java.lang.String[] { "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
