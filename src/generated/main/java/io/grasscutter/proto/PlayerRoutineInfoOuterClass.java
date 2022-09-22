// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerRoutineInfo.proto

package io.grasscutter.proto;

public final class PlayerRoutineInfoOuterClass {
  private PlayerRoutineInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerRoutineInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerRoutineInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 routine_type = 8;</code>
     * @return The routineType.
     */
    int getRoutineType();

    /**
     * <code>uint32 finished_num = 15;</code>
     * @return The finishedNum.
     */
    int getFinishedNum();
  }
  /**
   * Protobuf type {@code PlayerRoutineInfo}
   */
  public static final class PlayerRoutineInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerRoutineInfo)
      PlayerRoutineInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerRoutineInfo.newBuilder() to construct.
    private PlayerRoutineInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerRoutineInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerRoutineInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerRoutineInfo(
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
            case 64: {

              routineType_ = input.readUInt32();
              break;
            }
            case 120: {

              finishedNum_ = input.readUInt32();
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
      return io.grasscutter.proto.PlayerRoutineInfoOuterClass.internal_static_PlayerRoutineInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.PlayerRoutineInfoOuterClass.internal_static_PlayerRoutineInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo.class, io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo.Builder.class);
    }

    public static final int ROUTINE_TYPE_FIELD_NUMBER = 8;
    private int routineType_;
    /**
     * <code>uint32 routine_type = 8;</code>
     * @return The routineType.
     */
    @java.lang.Override
    public int getRoutineType() {
      return routineType_;
    }

    public static final int FINISHED_NUM_FIELD_NUMBER = 15;
    private int finishedNum_;
    /**
     * <code>uint32 finished_num = 15;</code>
     * @return The finishedNum.
     */
    @java.lang.Override
    public int getFinishedNum() {
      return finishedNum_;
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
      if (routineType_ != 0) {
        output.writeUInt32(8, routineType_);
      }
      if (finishedNum_ != 0) {
        output.writeUInt32(15, finishedNum_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (routineType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, routineType_);
      }
      if (finishedNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, finishedNum_);
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
      if (!(obj instanceof io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo other = (io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo) obj;

      if (getRoutineType()
          != other.getRoutineType()) return false;
      if (getFinishedNum()
          != other.getFinishedNum()) return false;
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
      hash = (37 * hash) + ROUTINE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getRoutineType();
      hash = (37 * hash) + FINISHED_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getFinishedNum();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo prototype) {
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
     * Protobuf type {@code PlayerRoutineInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerRoutineInfo)
        io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.PlayerRoutineInfoOuterClass.internal_static_PlayerRoutineInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.PlayerRoutineInfoOuterClass.internal_static_PlayerRoutineInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo.class, io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo.Builder.class);
      }

      // Construct using io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo.newBuilder()
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
        routineType_ = 0;

        finishedNum_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.PlayerRoutineInfoOuterClass.internal_static_PlayerRoutineInfo_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo getDefaultInstanceForType() {
        return io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo build() {
        io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo buildPartial() {
        io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo result = new io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo(this);
        result.routineType_ = routineType_;
        result.finishedNum_ = finishedNum_;
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
        if (other instanceof io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo) {
          return mergeFrom((io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo other) {
        if (other == io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo.getDefaultInstance()) return this;
        if (other.getRoutineType() != 0) {
          setRoutineType(other.getRoutineType());
        }
        if (other.getFinishedNum() != 0) {
          setFinishedNum(other.getFinishedNum());
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
        io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int routineType_ ;
      /**
       * <code>uint32 routine_type = 8;</code>
       * @return The routineType.
       */
      @java.lang.Override
      public int getRoutineType() {
        return routineType_;
      }
      /**
       * <code>uint32 routine_type = 8;</code>
       * @param value The routineType to set.
       * @return This builder for chaining.
       */
      public Builder setRoutineType(int value) {
        
        routineType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 routine_type = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRoutineType() {
        
        routineType_ = 0;
        onChanged();
        return this;
      }

      private int finishedNum_ ;
      /**
       * <code>uint32 finished_num = 15;</code>
       * @return The finishedNum.
       */
      @java.lang.Override
      public int getFinishedNum() {
        return finishedNum_;
      }
      /**
       * <code>uint32 finished_num = 15;</code>
       * @param value The finishedNum to set.
       * @return This builder for chaining.
       */
      public Builder setFinishedNum(int value) {
        
        finishedNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finished_num = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishedNum() {
        
        finishedNum_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerRoutineInfo)
    }

    // @@protoc_insertion_point(class_scope:PlayerRoutineInfo)
    private static final io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo();
    }

    public static io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerRoutineInfo>
        PARSER = new com.google.protobuf.AbstractParser<PlayerRoutineInfo>() {
      @java.lang.Override
      public PlayerRoutineInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerRoutineInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerRoutineInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerRoutineInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerRoutineInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerRoutineInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027PlayerRoutineInfo.proto\"?\n\021PlayerRouti" +
      "neInfo\022\024\n\014routine_type\030\010 \001(\r\022\024\n\014finished" +
      "_num\030\017 \001(\rB\026\n\024io.grasscutter.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerRoutineInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerRoutineInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerRoutineInfo_descriptor,
        new java.lang.String[] { "RoutineType", "FinishedNum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
