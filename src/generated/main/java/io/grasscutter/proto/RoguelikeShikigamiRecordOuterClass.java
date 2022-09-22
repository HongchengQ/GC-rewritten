// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoguelikeShikigamiRecord.proto

package io.grasscutter.proto;

public final class RoguelikeShikigamiRecordOuterClass {
  private RoguelikeShikigamiRecordOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoguelikeShikigamiRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RoguelikeShikigamiRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 id = 6;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>uint32 level = 3;</code>
     * @return The level.
     */
    int getLevel();
  }
  /**
   * Protobuf type {@code RoguelikeShikigamiRecord}
   */
  public static final class RoguelikeShikigamiRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RoguelikeShikigamiRecord)
      RoguelikeShikigamiRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RoguelikeShikigamiRecord.newBuilder() to construct.
    private RoguelikeShikigamiRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RoguelikeShikigamiRecord() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RoguelikeShikigamiRecord();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RoguelikeShikigamiRecord(
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

              level_ = input.readUInt32();
              break;
            }
            case 48: {

              id_ = input.readUInt32();
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
      return io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.internal_static_RoguelikeShikigamiRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.internal_static_RoguelikeShikigamiRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord.class, io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 6;
    private int id_;
    /**
     * <code>uint32 id = 6;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int LEVEL_FIELD_NUMBER = 3;
    private int level_;
    /**
     * <code>uint32 level = 3;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
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
      if (level_ != 0) {
        output.writeUInt32(3, level_);
      }
      if (id_ != 0) {
        output.writeUInt32(6, id_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (level_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, level_);
      }
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, id_);
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
      if (!(obj instanceof io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord other = (io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord) obj;

      if (getId()
          != other.getId()) return false;
      if (getLevel()
          != other.getLevel()) return false;
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord prototype) {
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
     * Protobuf type {@code RoguelikeShikigamiRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RoguelikeShikigamiRecord)
        io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.internal_static_RoguelikeShikigamiRecord_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.internal_static_RoguelikeShikigamiRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord.class, io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord.Builder.class);
      }

      // Construct using io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord.newBuilder()
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
        id_ = 0;

        level_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.internal_static_RoguelikeShikigamiRecord_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord getDefaultInstanceForType() {
        return io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord build() {
        io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord buildPartial() {
        io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord result = new io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord(this);
        result.id_ = id_;
        result.level_ = level_;
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
        if (other instanceof io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord) {
          return mergeFrom((io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord other) {
        if (other == io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
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
        io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 6;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 6;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private int level_ ;
      /**
       * <code>uint32 level = 3;</code>
       * @return The level.
       */
      @java.lang.Override
      public int getLevel() {
        return level_;
      }
      /**
       * <code>uint32 level = 3;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {
        
        level_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        
        level_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RoguelikeShikigamiRecord)
    }

    // @@protoc_insertion_point(class_scope:RoguelikeShikigamiRecord)
    private static final io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord();
    }

    public static io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RoguelikeShikigamiRecord>
        PARSER = new com.google.protobuf.AbstractParser<RoguelikeShikigamiRecord>() {
      @java.lang.Override
      public RoguelikeShikigamiRecord parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RoguelikeShikigamiRecord(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RoguelikeShikigamiRecord> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoguelikeShikigamiRecord> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoguelikeShikigamiRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoguelikeShikigamiRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036RoguelikeShikigamiRecord.proto\"5\n\030Rogu" +
      "elikeShikigamiRecord\022\n\n\002id\030\006 \001(\r\022\r\n\005leve" +
      "l\030\003 \001(\rB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RoguelikeShikigamiRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RoguelikeShikigamiRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoguelikeShikigamiRecord_descriptor,
        new java.lang.String[] { "Id", "Level", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
