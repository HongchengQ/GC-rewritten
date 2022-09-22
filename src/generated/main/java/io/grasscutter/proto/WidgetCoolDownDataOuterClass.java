// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WidgetCoolDownData.proto

package io.grasscutter.proto;

public final class WidgetCoolDownDataOuterClass {
  private WidgetCoolDownDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WidgetCoolDownDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WidgetCoolDownData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_success = 5;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>uint64 cool_down_time = 4;</code>
     * @return The coolDownTime.
     */
    long getCoolDownTime();

    /**
     * <code>uint32 id = 15;</code>
     * @return The id.
     */
    int getId();
  }
  /**
   * Protobuf type {@code WidgetCoolDownData}
   */
  public static final class WidgetCoolDownData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WidgetCoolDownData)
      WidgetCoolDownDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WidgetCoolDownData.newBuilder() to construct.
    private WidgetCoolDownData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WidgetCoolDownData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WidgetCoolDownData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WidgetCoolDownData(
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

              coolDownTime_ = input.readUInt64();
              break;
            }
            case 40: {

              isSuccess_ = input.readBool();
              break;
            }
            case 120: {

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
      return io.grasscutter.proto.WidgetCoolDownDataOuterClass.internal_static_WidgetCoolDownData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.WidgetCoolDownDataOuterClass.internal_static_WidgetCoolDownData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.class, io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder.class);
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 5;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 5;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int COOL_DOWN_TIME_FIELD_NUMBER = 4;
    private long coolDownTime_;
    /**
     * <code>uint64 cool_down_time = 4;</code>
     * @return The coolDownTime.
     */
    @java.lang.Override
    public long getCoolDownTime() {
      return coolDownTime_;
    }

    public static final int ID_FIELD_NUMBER = 15;
    private int id_;
    /**
     * <code>uint32 id = 15;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
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
      if (coolDownTime_ != 0L) {
        output.writeUInt64(4, coolDownTime_);
      }
      if (isSuccess_ != false) {
        output.writeBool(5, isSuccess_);
      }
      if (id_ != 0) {
        output.writeUInt32(15, id_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (coolDownTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, coolDownTime_);
      }
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isSuccess_);
      }
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, id_);
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
      if (!(obj instanceof io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData other = (io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData) obj;

      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (getCoolDownTime()
          != other.getCoolDownTime()) return false;
      if (getId()
          != other.getId()) return false;
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
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + COOL_DOWN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCoolDownTime());
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData prototype) {
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
     * Protobuf type {@code WidgetCoolDownData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WidgetCoolDownData)
        io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.WidgetCoolDownDataOuterClass.internal_static_WidgetCoolDownData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.WidgetCoolDownDataOuterClass.internal_static_WidgetCoolDownData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.class, io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder.class);
      }

      // Construct using io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.newBuilder()
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
        isSuccess_ = false;

        coolDownTime_ = 0L;

        id_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.WidgetCoolDownDataOuterClass.internal_static_WidgetCoolDownData_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData getDefaultInstanceForType() {
        return io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData build() {
        io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData buildPartial() {
        io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData result = new io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData(this);
        result.isSuccess_ = isSuccess_;
        result.coolDownTime_ = coolDownTime_;
        result.id_ = id_;
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
        if (other instanceof io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData) {
          return mergeFrom((io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData other) {
        if (other == io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.getDefaultInstance()) return this;
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getCoolDownTime() != 0L) {
          setCoolDownTime(other.getCoolDownTime());
        }
        if (other.getId() != 0) {
          setId(other.getId());
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
        io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 5;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 5;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private long coolDownTime_ ;
      /**
       * <code>uint64 cool_down_time = 4;</code>
       * @return The coolDownTime.
       */
      @java.lang.Override
      public long getCoolDownTime() {
        return coolDownTime_;
      }
      /**
       * <code>uint64 cool_down_time = 4;</code>
       * @param value The coolDownTime to set.
       * @return This builder for chaining.
       */
      public Builder setCoolDownTime(long value) {
        
        coolDownTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 cool_down_time = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoolDownTime() {
        
        coolDownTime_ = 0L;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 15;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 15;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WidgetCoolDownData)
    }

    // @@protoc_insertion_point(class_scope:WidgetCoolDownData)
    private static final io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData();
    }

    public static io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WidgetCoolDownData>
        PARSER = new com.google.protobuf.AbstractParser<WidgetCoolDownData>() {
      @java.lang.Override
      public WidgetCoolDownData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WidgetCoolDownData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WidgetCoolDownData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WidgetCoolDownData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WidgetCoolDownData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WidgetCoolDownData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030WidgetCoolDownData.proto\"L\n\022WidgetCool" +
      "DownData\022\022\n\nis_success\030\005 \001(\010\022\026\n\016cool_dow" +
      "n_time\030\004 \001(\004\022\n\n\002id\030\017 \001(\rB\026\n\024io.grasscutt" +
      "er.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WidgetCoolDownData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WidgetCoolDownData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WidgetCoolDownData_descriptor,
        new java.lang.String[] { "IsSuccess", "CoolDownTime", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
