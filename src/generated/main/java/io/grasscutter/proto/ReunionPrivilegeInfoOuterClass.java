// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReunionPrivilegeInfo.proto

package io.grasscutter.proto;

public final class ReunionPrivilegeInfoOuterClass {
  private ReunionPrivilegeInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReunionPrivilegeInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReunionPrivilegeInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 cur_day_count = 7;</code>
     * @return The curDayCount.
     */
    int getCurDayCount();

    /**
     * <code>uint32 total_count = 10;</code>
     * @return The totalCount.
     */
    int getTotalCount();

    /**
     * <code>uint32 privilege_id = 4;</code>
     * @return The privilegeId.
     */
    int getPrivilegeId();
  }
  /**
   * Protobuf type {@code ReunionPrivilegeInfo}
   */
  public static final class ReunionPrivilegeInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReunionPrivilegeInfo)
      ReunionPrivilegeInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReunionPrivilegeInfo.newBuilder() to construct.
    private ReunionPrivilegeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReunionPrivilegeInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReunionPrivilegeInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReunionPrivilegeInfo(
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

              privilegeId_ = input.readUInt32();
              break;
            }
            case 56: {

              curDayCount_ = input.readUInt32();
              break;
            }
            case 80: {

              totalCount_ = input.readUInt32();
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
      return io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.internal_static_ReunionPrivilegeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.internal_static_ReunionPrivilegeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.class, io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.Builder.class);
    }

    public static final int CUR_DAY_COUNT_FIELD_NUMBER = 7;
    private int curDayCount_;
    /**
     * <code>uint32 cur_day_count = 7;</code>
     * @return The curDayCount.
     */
    @java.lang.Override
    public int getCurDayCount() {
      return curDayCount_;
    }

    public static final int TOTAL_COUNT_FIELD_NUMBER = 10;
    private int totalCount_;
    /**
     * <code>uint32 total_count = 10;</code>
     * @return The totalCount.
     */
    @java.lang.Override
    public int getTotalCount() {
      return totalCount_;
    }

    public static final int PRIVILEGE_ID_FIELD_NUMBER = 4;
    private int privilegeId_;
    /**
     * <code>uint32 privilege_id = 4;</code>
     * @return The privilegeId.
     */
    @java.lang.Override
    public int getPrivilegeId() {
      return privilegeId_;
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
      if (privilegeId_ != 0) {
        output.writeUInt32(4, privilegeId_);
      }
      if (curDayCount_ != 0) {
        output.writeUInt32(7, curDayCount_);
      }
      if (totalCount_ != 0) {
        output.writeUInt32(10, totalCount_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (privilegeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, privilegeId_);
      }
      if (curDayCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, curDayCount_);
      }
      if (totalCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, totalCount_);
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
      if (!(obj instanceof io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo other = (io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo) obj;

      if (getCurDayCount()
          != other.getCurDayCount()) return false;
      if (getTotalCount()
          != other.getTotalCount()) return false;
      if (getPrivilegeId()
          != other.getPrivilegeId()) return false;
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
      hash = (37 * hash) + CUR_DAY_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCurDayCount();
      hash = (37 * hash) + TOTAL_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getTotalCount();
      hash = (37 * hash) + PRIVILEGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPrivilegeId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo prototype) {
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
     * Protobuf type {@code ReunionPrivilegeInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReunionPrivilegeInfo)
        io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.internal_static_ReunionPrivilegeInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.internal_static_ReunionPrivilegeInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.class, io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.Builder.class);
      }

      // Construct using io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.newBuilder()
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
        curDayCount_ = 0;

        totalCount_ = 0;

        privilegeId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.internal_static_ReunionPrivilegeInfo_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo getDefaultInstanceForType() {
        return io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo build() {
        io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo buildPartial() {
        io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo result = new io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo(this);
        result.curDayCount_ = curDayCount_;
        result.totalCount_ = totalCount_;
        result.privilegeId_ = privilegeId_;
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
        if (other instanceof io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo) {
          return mergeFrom((io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo other) {
        if (other == io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.getDefaultInstance()) return this;
        if (other.getCurDayCount() != 0) {
          setCurDayCount(other.getCurDayCount());
        }
        if (other.getTotalCount() != 0) {
          setTotalCount(other.getTotalCount());
        }
        if (other.getPrivilegeId() != 0) {
          setPrivilegeId(other.getPrivilegeId());
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
        io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int curDayCount_ ;
      /**
       * <code>uint32 cur_day_count = 7;</code>
       * @return The curDayCount.
       */
      @java.lang.Override
      public int getCurDayCount() {
        return curDayCount_;
      }
      /**
       * <code>uint32 cur_day_count = 7;</code>
       * @param value The curDayCount to set.
       * @return This builder for chaining.
       */
      public Builder setCurDayCount(int value) {
        
        curDayCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_day_count = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurDayCount() {
        
        curDayCount_ = 0;
        onChanged();
        return this;
      }

      private int totalCount_ ;
      /**
       * <code>uint32 total_count = 10;</code>
       * @return The totalCount.
       */
      @java.lang.Override
      public int getTotalCount() {
        return totalCount_;
      }
      /**
       * <code>uint32 total_count = 10;</code>
       * @param value The totalCount to set.
       * @return This builder for chaining.
       */
      public Builder setTotalCount(int value) {
        
        totalCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 total_count = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalCount() {
        
        totalCount_ = 0;
        onChanged();
        return this;
      }

      private int privilegeId_ ;
      /**
       * <code>uint32 privilege_id = 4;</code>
       * @return The privilegeId.
       */
      @java.lang.Override
      public int getPrivilegeId() {
        return privilegeId_;
      }
      /**
       * <code>uint32 privilege_id = 4;</code>
       * @param value The privilegeId to set.
       * @return This builder for chaining.
       */
      public Builder setPrivilegeId(int value) {
        
        privilegeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 privilege_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPrivilegeId() {
        
        privilegeId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ReunionPrivilegeInfo)
    }

    // @@protoc_insertion_point(class_scope:ReunionPrivilegeInfo)
    private static final io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo();
    }

    public static io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReunionPrivilegeInfo>
        PARSER = new com.google.protobuf.AbstractParser<ReunionPrivilegeInfo>() {
      @java.lang.Override
      public ReunionPrivilegeInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReunionPrivilegeInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReunionPrivilegeInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReunionPrivilegeInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReunionPrivilegeInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReunionPrivilegeInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032ReunionPrivilegeInfo.proto\"X\n\024ReunionP" +
      "rivilegeInfo\022\025\n\rcur_day_count\030\007 \001(\r\022\023\n\013t" +
      "otal_count\030\n \001(\r\022\024\n\014privilege_id\030\004 \001(\rB\026" +
      "\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ReunionPrivilegeInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReunionPrivilegeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReunionPrivilegeInfo_descriptor,
        new java.lang.String[] { "CurDayCount", "TotalCount", "PrivilegeId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
