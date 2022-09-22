// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeEffigyFirstPassRewardReq.proto

package io.grasscutter.proto;

public final class TakeEffigyFirstPassRewardReqOuterClass {
  private TakeEffigyFirstPassRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeEffigyFirstPassRewardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeEffigyFirstPassRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 challenge_id = 6;</code>
     * @return The challengeId.
     */
    int getChallengeId();
  }
  /**
   * <pre>
   * CmdId: 2196
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code TakeEffigyFirstPassRewardReq}
   */
  public static final class TakeEffigyFirstPassRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeEffigyFirstPassRewardReq)
      TakeEffigyFirstPassRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeEffigyFirstPassRewardReq.newBuilder() to construct.
    private TakeEffigyFirstPassRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeEffigyFirstPassRewardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeEffigyFirstPassRewardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TakeEffigyFirstPassRewardReq(
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
            case 48: {

              challengeId_ = input.readUInt32();
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
      return io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.internal_static_TakeEffigyFirstPassRewardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.internal_static_TakeEffigyFirstPassRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq.class, io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq.Builder.class);
    }

    public static final int CHALLENGE_ID_FIELD_NUMBER = 6;
    private int challengeId_;
    /**
     * <code>uint32 challenge_id = 6;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
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
      if (challengeId_ != 0) {
        output.writeUInt32(6, challengeId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (challengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, challengeId_);
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
      if (!(obj instanceof io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq other = (io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq) obj;

      if (getChallengeId()
          != other.getChallengeId()) return false;
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
      hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq prototype) {
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
     * CmdId: 2196
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code TakeEffigyFirstPassRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeEffigyFirstPassRewardReq)
        io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.internal_static_TakeEffigyFirstPassRewardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.internal_static_TakeEffigyFirstPassRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq.class, io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq.Builder.class);
      }

      // Construct using io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq.newBuilder()
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
        challengeId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.internal_static_TakeEffigyFirstPassRewardReq_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq getDefaultInstanceForType() {
        return io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq build() {
        io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq buildPartial() {
        io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq result = new io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq(this);
        result.challengeId_ = challengeId_;
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
        if (other instanceof io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq) {
          return mergeFrom((io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq other) {
        if (other == io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq.getDefaultInstance()) return this;
        if (other.getChallengeId() != 0) {
          setChallengeId(other.getChallengeId());
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
        io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int challengeId_ ;
      /**
       * <code>uint32 challenge_id = 6;</code>
       * @return The challengeId.
       */
      @java.lang.Override
      public int getChallengeId() {
        return challengeId_;
      }
      /**
       * <code>uint32 challenge_id = 6;</code>
       * @param value The challengeId to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeId(int value) {
        
        challengeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeId() {
        
        challengeId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TakeEffigyFirstPassRewardReq)
    }

    // @@protoc_insertion_point(class_scope:TakeEffigyFirstPassRewardReq)
    private static final io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq();
    }

    public static io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeEffigyFirstPassRewardReq>
        PARSER = new com.google.protobuf.AbstractParser<TakeEffigyFirstPassRewardReq>() {
      @java.lang.Override
      public TakeEffigyFirstPassRewardReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TakeEffigyFirstPassRewardReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TakeEffigyFirstPassRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeEffigyFirstPassRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.TakeEffigyFirstPassRewardReqOuterClass.TakeEffigyFirstPassRewardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeEffigyFirstPassRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeEffigyFirstPassRewardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"TakeEffigyFirstPassRewardReq.proto\"4\n\034" +
      "TakeEffigyFirstPassRewardReq\022\024\n\014challeng" +
      "e_id\030\006 \001(\rB\026\n\024io.grasscutter.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TakeEffigyFirstPassRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeEffigyFirstPassRewardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeEffigyFirstPassRewardReq_descriptor,
        new java.lang.String[] { "ChallengeId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
