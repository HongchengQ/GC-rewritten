// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_MPPAHFFHIPI_ServerNotify.proto

package io.grasscutter.proto;

public final class Unk2700MPPAHFFHIPIServerNotify {
  private Unk2700MPPAHFFHIPIServerNotify() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_MPPAHFFHIPI_ServerNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_MPPAHFFHIPI_ServerNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 match_id = 9;</code>
     * @return The matchId.
     */
    int getMatchId();
  }
  /**
   * <pre>
   * CmdId: 4187
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_MPPAHFFHIPI_ServerNotify}
   */
  public static final class Unk2700_MPPAHFFHIPI_ServerNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_MPPAHFFHIPI_ServerNotify)
      Unk2700_MPPAHFFHIPI_ServerNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_MPPAHFFHIPI_ServerNotify.newBuilder() to construct.
    private Unk2700_MPPAHFFHIPI_ServerNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_MPPAHFFHIPI_ServerNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_MPPAHFFHIPI_ServerNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_MPPAHFFHIPI_ServerNotify(
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
            case 72: {

              matchId_ = input.readUInt32();
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
      return io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.internal_static_Unk2700_MPPAHFFHIPI_ServerNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.internal_static_Unk2700_MPPAHFFHIPI_ServerNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify.class, io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify.Builder.class);
    }

    public static final int MATCH_ID_FIELD_NUMBER = 9;
    private int matchId_;
    /**
     * <code>uint32 match_id = 9;</code>
     * @return The matchId.
     */
    @java.lang.Override
    public int getMatchId() {
      return matchId_;
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
      if (matchId_ != 0) {
        output.writeUInt32(9, matchId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (matchId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, matchId_);
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
      if (!(obj instanceof io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify other = (io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify) obj;

      if (getMatchId()
          != other.getMatchId()) return false;
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
      hash = (37 * hash) + MATCH_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMatchId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify prototype) {
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
     * CmdId: 4187
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_MPPAHFFHIPI_ServerNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_MPPAHFFHIPI_ServerNotify)
        io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.internal_static_Unk2700_MPPAHFFHIPI_ServerNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.internal_static_Unk2700_MPPAHFFHIPI_ServerNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify.class, io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify.newBuilder()
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
        matchId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.internal_static_Unk2700_MPPAHFFHIPI_ServerNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify build() {
        io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify buildPartial() {
        io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify result = new io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify(this);
        result.matchId_ = matchId_;
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
        if (other instanceof io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify) {
          return mergeFrom((io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify other) {
        if (other == io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify.getDefaultInstance()) return this;
        if (other.getMatchId() != 0) {
          setMatchId(other.getMatchId());
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
        io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int matchId_ ;
      /**
       * <code>uint32 match_id = 9;</code>
       * @return The matchId.
       */
      @java.lang.Override
      public int getMatchId() {
        return matchId_;
      }
      /**
       * <code>uint32 match_id = 9;</code>
       * @param value The matchId to set.
       * @return This builder for chaining.
       */
      public Builder setMatchId(int value) {
        
        matchId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 match_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearMatchId() {
        
        matchId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_MPPAHFFHIPI_ServerNotify)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_MPPAHFFHIPI_ServerNotify)
    private static final io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify();
    }

    public static io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_MPPAHFFHIPI_ServerNotify>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_MPPAHFFHIPI_ServerNotify>() {
      @java.lang.Override
      public Unk2700_MPPAHFFHIPI_ServerNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_MPPAHFFHIPI_ServerNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_MPPAHFFHIPI_ServerNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_MPPAHFFHIPI_ServerNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.Unk2700MPPAHFFHIPIServerNotify.Unk2700_MPPAHFFHIPI_ServerNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_MPPAHFFHIPI_ServerNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_MPPAHFFHIPI_ServerNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&Unk2700_MPPAHFFHIPI_ServerNotify.proto" +
      "\"4\n Unk2700_MPPAHFFHIPI_ServerNotify\022\020\n\010" +
      "match_id\030\t \001(\rB\026\n\024io.grasscutter.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_MPPAHFFHIPI_ServerNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_MPPAHFFHIPI_ServerNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_MPPAHFFHIPI_ServerNotify_descriptor,
        new java.lang.String[] { "MatchId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
