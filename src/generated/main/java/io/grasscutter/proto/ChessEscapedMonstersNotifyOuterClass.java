// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChessEscapedMonstersNotify.proto

package io.grasscutter.proto;

public final class ChessEscapedMonstersNotifyOuterClass {
  private ChessEscapedMonstersNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChessEscapedMonstersNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChessEscapedMonstersNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 escaped_monsters = 14;</code>
     * @return The escapedMonsters.
     */
    int getEscapedMonsters();
  }
  /**
   * <pre>
   * CmdId: 5314
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code ChessEscapedMonstersNotify}
   */
  public static final class ChessEscapedMonstersNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChessEscapedMonstersNotify)
      ChessEscapedMonstersNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChessEscapedMonstersNotify.newBuilder() to construct.
    private ChessEscapedMonstersNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChessEscapedMonstersNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChessEscapedMonstersNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChessEscapedMonstersNotify(
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
            case 112: {

              escapedMonsters_ = input.readUInt32();
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
      return io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.internal_static_ChessEscapedMonstersNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.internal_static_ChessEscapedMonstersNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify.class, io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify.Builder.class);
    }

    public static final int ESCAPED_MONSTERS_FIELD_NUMBER = 14;
    private int escapedMonsters_;
    /**
     * <code>uint32 escaped_monsters = 14;</code>
     * @return The escapedMonsters.
     */
    @java.lang.Override
    public int getEscapedMonsters() {
      return escapedMonsters_;
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
      if (escapedMonsters_ != 0) {
        output.writeUInt32(14, escapedMonsters_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (escapedMonsters_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, escapedMonsters_);
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
      if (!(obj instanceof io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify other = (io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify) obj;

      if (getEscapedMonsters()
          != other.getEscapedMonsters()) return false;
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
      hash = (37 * hash) + ESCAPED_MONSTERS_FIELD_NUMBER;
      hash = (53 * hash) + getEscapedMonsters();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify prototype) {
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
     * CmdId: 5314
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code ChessEscapedMonstersNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChessEscapedMonstersNotify)
        io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.internal_static_ChessEscapedMonstersNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.internal_static_ChessEscapedMonstersNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify.class, io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify.newBuilder()
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
        escapedMonsters_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.internal_static_ChessEscapedMonstersNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify build() {
        io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify buildPartial() {
        io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify result = new io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify(this);
        result.escapedMonsters_ = escapedMonsters_;
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
        if (other instanceof io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify) {
          return mergeFrom((io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify other) {
        if (other == io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify.getDefaultInstance()) return this;
        if (other.getEscapedMonsters() != 0) {
          setEscapedMonsters(other.getEscapedMonsters());
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
        io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int escapedMonsters_ ;
      /**
       * <code>uint32 escaped_monsters = 14;</code>
       * @return The escapedMonsters.
       */
      @java.lang.Override
      public int getEscapedMonsters() {
        return escapedMonsters_;
      }
      /**
       * <code>uint32 escaped_monsters = 14;</code>
       * @param value The escapedMonsters to set.
       * @return This builder for chaining.
       */
      public Builder setEscapedMonsters(int value) {
        
        escapedMonsters_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 escaped_monsters = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearEscapedMonsters() {
        
        escapedMonsters_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChessEscapedMonstersNotify)
    }

    // @@protoc_insertion_point(class_scope:ChessEscapedMonstersNotify)
    private static final io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify();
    }

    public static io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChessEscapedMonstersNotify>
        PARSER = new com.google.protobuf.AbstractParser<ChessEscapedMonstersNotify>() {
      @java.lang.Override
      public ChessEscapedMonstersNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChessEscapedMonstersNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChessEscapedMonstersNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChessEscapedMonstersNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.ChessEscapedMonstersNotifyOuterClass.ChessEscapedMonstersNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChessEscapedMonstersNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChessEscapedMonstersNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ChessEscapedMonstersNotify.proto\"6\n\032Ch" +
      "essEscapedMonstersNotify\022\030\n\020escaped_mons" +
      "ters\030\016 \001(\rB\026\n\024io.grasscutter.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChessEscapedMonstersNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChessEscapedMonstersNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChessEscapedMonstersNotify_descriptor,
        new java.lang.String[] { "EscapedMonsters", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
