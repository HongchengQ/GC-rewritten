// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChangeWorldToSingleModeRsp.proto

package io.grasscutter.proto;

public final class ChangeWorldToSingleModeRspOuterClass {
  private ChangeWorldToSingleModeRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChangeWorldToSingleModeRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChangeWorldToSingleModeRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 quit_mp_valid_time = 15;</code>
     * @return The quitMpValidTime.
     */
    int getQuitMpValidTime();

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 3282
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code ChangeWorldToSingleModeRsp}
   */
  public static final class ChangeWorldToSingleModeRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChangeWorldToSingleModeRsp)
      ChangeWorldToSingleModeRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChangeWorldToSingleModeRsp.newBuilder() to construct.
    private ChangeWorldToSingleModeRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChangeWorldToSingleModeRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChangeWorldToSingleModeRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChangeWorldToSingleModeRsp(
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
            case 32: {

              retcode_ = input.readInt32();
              break;
            }
            case 120: {

              quitMpValidTime_ = input.readUInt32();
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
      return io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.internal_static_ChangeWorldToSingleModeRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.internal_static_ChangeWorldToSingleModeRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp.class, io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp.Builder.class);
    }

    public static final int QUIT_MP_VALID_TIME_FIELD_NUMBER = 15;
    private int quitMpValidTime_;
    /**
     * <code>uint32 quit_mp_valid_time = 15;</code>
     * @return The quitMpValidTime.
     */
    @java.lang.Override
    public int getQuitMpValidTime() {
      return quitMpValidTime_;
    }

    public static final int RETCODE_FIELD_NUMBER = 4;
    private int retcode_;
    /**
     * <code>int32 retcode = 4;</code>
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
        output.writeInt32(4, retcode_);
      }
      if (quitMpValidTime_ != 0) {
        output.writeUInt32(15, quitMpValidTime_);
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
          .computeInt32Size(4, retcode_);
      }
      if (quitMpValidTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, quitMpValidTime_);
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
      if (!(obj instanceof io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp other = (io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp) obj;

      if (getQuitMpValidTime()
          != other.getQuitMpValidTime()) return false;
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
      hash = (37 * hash) + QUIT_MP_VALID_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getQuitMpValidTime();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp prototype) {
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
     * CmdId: 3282
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code ChangeWorldToSingleModeRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChangeWorldToSingleModeRsp)
        io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.internal_static_ChangeWorldToSingleModeRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.internal_static_ChangeWorldToSingleModeRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp.class, io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp.Builder.class);
      }

      // Construct using io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp.newBuilder()
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
        quitMpValidTime_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.internal_static_ChangeWorldToSingleModeRsp_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp getDefaultInstanceForType() {
        return io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp build() {
        io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp buildPartial() {
        io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp result = new io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp(this);
        result.quitMpValidTime_ = quitMpValidTime_;
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
        if (other instanceof io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp) {
          return mergeFrom((io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp other) {
        if (other == io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp.getDefaultInstance()) return this;
        if (other.getQuitMpValidTime() != 0) {
          setQuitMpValidTime(other.getQuitMpValidTime());
        }
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
        io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int quitMpValidTime_ ;
      /**
       * <code>uint32 quit_mp_valid_time = 15;</code>
       * @return The quitMpValidTime.
       */
      @java.lang.Override
      public int getQuitMpValidTime() {
        return quitMpValidTime_;
      }
      /**
       * <code>uint32 quit_mp_valid_time = 15;</code>
       * @param value The quitMpValidTime to set.
       * @return This builder for chaining.
       */
      public Builder setQuitMpValidTime(int value) {
        
        quitMpValidTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 quit_mp_valid_time = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuitMpValidTime() {
        
        quitMpValidTime_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 4;</code>
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


      // @@protoc_insertion_point(builder_scope:ChangeWorldToSingleModeRsp)
    }

    // @@protoc_insertion_point(class_scope:ChangeWorldToSingleModeRsp)
    private static final io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp();
    }

    public static io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChangeWorldToSingleModeRsp>
        PARSER = new com.google.protobuf.AbstractParser<ChangeWorldToSingleModeRsp>() {
      @java.lang.Override
      public ChangeWorldToSingleModeRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChangeWorldToSingleModeRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChangeWorldToSingleModeRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChangeWorldToSingleModeRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.ChangeWorldToSingleModeRspOuterClass.ChangeWorldToSingleModeRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChangeWorldToSingleModeRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChangeWorldToSingleModeRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ChangeWorldToSingleModeRsp.proto\"I\n\032Ch" +
      "angeWorldToSingleModeRsp\022\032\n\022quit_mp_vali" +
      "d_time\030\017 \001(\r\022\017\n\007retcode\030\004 \001(\005B\026\n\024io.gras" +
      "scutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChangeWorldToSingleModeRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChangeWorldToSingleModeRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChangeWorldToSingleModeRsp_descriptor,
        new java.lang.String[] { "QuitMpValidTime", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
