// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QueryPathRsp.proto

package emu.grasscutter.net.proto;

public final class QueryPathRspOuterClass {
  private QueryPathRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QueryPathRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QueryPathRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 query_id = 6;</code>
     * @return The queryId.
     */
    int getQueryId();

    /**
     * <code>repeated .Vector corners = 1;</code>
     */
    java.util.List<emu.grasscutter.net.proto.VectorOuterClass.Vector> 
        getCornersList();
    /**
     * <code>repeated .Vector corners = 1;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getCorners(int index);
    /**
     * <code>repeated .Vector corners = 1;</code>
     */
    int getCornersCount();
    /**
     * <code>repeated .Vector corners = 1;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
        getCornersOrBuilderList();
    /**
     * <code>repeated .Vector corners = 1;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCornersOrBuilder(
        int index);

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <pre>
     * Obf: LFJGAFPHNNE
     * </pre>
     *
     * <code>.PathStatusType query_status = 15;</code>
     * @return The enum numeric value on the wire for queryStatus.
     */
    int getQueryStatusValue();
    /**
     * <pre>
     * Obf: LFJGAFPHNNE
     * </pre>
     *
     * <code>.PathStatusType query_status = 15;</code>
     * @return The queryStatus.
     */
    emu.grasscutter.net.proto.PathStatusTypeOuterClass.PathStatusType getQueryStatus();
  }
  /**
   * <pre>
   * CmdId: 2319
   * Obf: EDKMFDJCIHL
   * </pre>
   *
   * Protobuf type {@code QueryPathRsp}
   */
  public static final class QueryPathRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QueryPathRsp)
      QueryPathRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QueryPathRsp.newBuilder() to construct.
    private QueryPathRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QueryPathRsp() {
      corners_ = java.util.Collections.emptyList();
      queryStatus_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QueryPathRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private QueryPathRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                corners_ = new java.util.ArrayList<emu.grasscutter.net.proto.VectorOuterClass.Vector>();
                mutable_bitField0_ |= 0x00000001;
              }
              corners_.add(
                  input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry));
              break;
            }
            case 48: {

              queryId_ = input.readInt32();
              break;
            }
            case 64: {

              retcode_ = input.readInt32();
              break;
            }
            case 120: {
              int rawValue = input.readEnum();

              queryStatus_ = rawValue;
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          corners_ = java.util.Collections.unmodifiableList(corners_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.QueryPathRspOuterClass.internal_static_QueryPathRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.QueryPathRspOuterClass.internal_static_QueryPathRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp.class, emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp.Builder.class);
    }

    public static final int QUERY_ID_FIELD_NUMBER = 6;
    private int queryId_;
    /**
     * <code>int32 query_id = 6;</code>
     * @return The queryId.
     */
    @java.lang.Override
    public int getQueryId() {
      return queryId_;
    }

    public static final int CORNERS_FIELD_NUMBER = 1;
    private java.util.List<emu.grasscutter.net.proto.VectorOuterClass.Vector> corners_;
    /**
     * <code>repeated .Vector corners = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.VectorOuterClass.Vector> getCornersList() {
      return corners_;
    }
    /**
     * <code>repeated .Vector corners = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
        getCornersOrBuilderList() {
      return corners_;
    }
    /**
     * <code>repeated .Vector corners = 1;</code>
     */
    @java.lang.Override
    public int getCornersCount() {
      return corners_.size();
    }
    /**
     * <code>repeated .Vector corners = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getCorners(int index) {
      return corners_.get(index);
    }
    /**
     * <code>repeated .Vector corners = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCornersOrBuilder(
        int index) {
      return corners_.get(index);
    }

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_;
    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int QUERY_STATUS_FIELD_NUMBER = 15;
    private int queryStatus_;
    /**
     * <pre>
     * Obf: LFJGAFPHNNE
     * </pre>
     *
     * <code>.PathStatusType query_status = 15;</code>
     * @return The enum numeric value on the wire for queryStatus.
     */
    @java.lang.Override public int getQueryStatusValue() {
      return queryStatus_;
    }
    /**
     * <pre>
     * Obf: LFJGAFPHNNE
     * </pre>
     *
     * <code>.PathStatusType query_status = 15;</code>
     * @return The queryStatus.
     */
    @java.lang.Override public emu.grasscutter.net.proto.PathStatusTypeOuterClass.PathStatusType getQueryStatus() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.PathStatusTypeOuterClass.PathStatusType result = emu.grasscutter.net.proto.PathStatusTypeOuterClass.PathStatusType.valueOf(queryStatus_);
      return result == null ? emu.grasscutter.net.proto.PathStatusTypeOuterClass.PathStatusType.UNRECOGNIZED : result;
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
      for (int i = 0; i < corners_.size(); i++) {
        output.writeMessage(1, corners_.get(i));
      }
      if (queryId_ != 0) {
        output.writeInt32(6, queryId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      if (queryStatus_ != emu.grasscutter.net.proto.PathStatusTypeOuterClass.PathStatusType.PATH_STATUS_TYPE_FAIL.getNumber()) {
        output.writeEnum(15, queryStatus_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < corners_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, corners_.get(i));
      }
      if (queryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, queryId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
      }
      if (queryStatus_ != emu.grasscutter.net.proto.PathStatusTypeOuterClass.PathStatusType.PATH_STATUS_TYPE_FAIL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(15, queryStatus_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp other = (emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp) obj;

      if (getQueryId()
          != other.getQueryId()) return false;
      if (!getCornersList()
          .equals(other.getCornersList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (queryStatus_ != other.queryStatus_) return false;
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
      hash = (37 * hash) + QUERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQueryId();
      if (getCornersCount() > 0) {
        hash = (37 * hash) + CORNERS_FIELD_NUMBER;
        hash = (53 * hash) + getCornersList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + QUERY_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + queryStatus_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp prototype) {
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
     * CmdId: 2319
     * Obf: EDKMFDJCIHL
     * </pre>
     *
     * Protobuf type {@code QueryPathRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QueryPathRsp)
        emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.QueryPathRspOuterClass.internal_static_QueryPathRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.QueryPathRspOuterClass.internal_static_QueryPathRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp.class, emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp.newBuilder()
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
          getCornersFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        queryId_ = 0;

        if (cornersBuilder_ == null) {
          corners_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          cornersBuilder_.clear();
        }
        retcode_ = 0;

        queryStatus_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.QueryPathRspOuterClass.internal_static_QueryPathRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp build() {
        emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp buildPartial() {
        emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp result = new emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp(this);
        int from_bitField0_ = bitField0_;
        result.queryId_ = queryId_;
        if (cornersBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            corners_ = java.util.Collections.unmodifiableList(corners_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.corners_ = corners_;
        } else {
          result.corners_ = cornersBuilder_.build();
        }
        result.retcode_ = retcode_;
        result.queryStatus_ = queryStatus_;
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
        if (other instanceof emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp) {
          return mergeFrom((emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp other) {
        if (other == emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp.getDefaultInstance()) return this;
        if (other.getQueryId() != 0) {
          setQueryId(other.getQueryId());
        }
        if (cornersBuilder_ == null) {
          if (!other.corners_.isEmpty()) {
            if (corners_.isEmpty()) {
              corners_ = other.corners_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureCornersIsMutable();
              corners_.addAll(other.corners_);
            }
            onChanged();
          }
        } else {
          if (!other.corners_.isEmpty()) {
            if (cornersBuilder_.isEmpty()) {
              cornersBuilder_.dispose();
              cornersBuilder_ = null;
              corners_ = other.corners_;
              bitField0_ = (bitField0_ & ~0x00000001);
              cornersBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCornersFieldBuilder() : null;
            } else {
              cornersBuilder_.addAllMessages(other.corners_);
            }
          }
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.queryStatus_ != 0) {
          setQueryStatusValue(other.getQueryStatusValue());
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
        emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int queryId_ ;
      /**
       * <code>int32 query_id = 6;</code>
       * @return The queryId.
       */
      @java.lang.Override
      public int getQueryId() {
        return queryId_;
      }
      /**
       * <code>int32 query_id = 6;</code>
       * @param value The queryId to set.
       * @return This builder for chaining.
       */
      public Builder setQueryId(int value) {
        
        queryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 query_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearQueryId() {
        
        queryId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.VectorOuterClass.Vector> corners_ =
        java.util.Collections.emptyList();
      private void ensureCornersIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          corners_ = new java.util.ArrayList<emu.grasscutter.net.proto.VectorOuterClass.Vector>(corners_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> cornersBuilder_;

      /**
       * <code>repeated .Vector corners = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.VectorOuterClass.Vector> getCornersList() {
        if (cornersBuilder_ == null) {
          return java.util.Collections.unmodifiableList(corners_);
        } else {
          return cornersBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Vector corners = 1;</code>
       */
      public int getCornersCount() {
        if (cornersBuilder_ == null) {
          return corners_.size();
        } else {
          return cornersBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Vector corners = 1;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getCorners(int index) {
        if (cornersBuilder_ == null) {
          return corners_.get(index);
        } else {
          return cornersBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Vector corners = 1;</code>
       */
      public Builder setCorners(
          int index, emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (cornersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCornersIsMutable();
          corners_.set(index, value);
          onChanged();
        } else {
          cornersBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Vector corners = 1;</code>
       */
      public Builder setCorners(
          int index, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (cornersBuilder_ == null) {
          ensureCornersIsMutable();
          corners_.set(index, builderForValue.build());
          onChanged();
        } else {
          cornersBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Vector corners = 1;</code>
       */
      public Builder addCorners(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (cornersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCornersIsMutable();
          corners_.add(value);
          onChanged();
        } else {
          cornersBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Vector corners = 1;</code>
       */
      public Builder addCorners(
          int index, emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (cornersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCornersIsMutable();
          corners_.add(index, value);
          onChanged();
        } else {
          cornersBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Vector corners = 1;</code>
       */
      public Builder addCorners(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (cornersBuilder_ == null) {
          ensureCornersIsMutable();
          corners_.add(builderForValue.build());
          onChanged();
        } else {
          cornersBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Vector corners = 1;</code>
       */
      public Builder addCorners(
          int index, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (cornersBuilder_ == null) {
          ensureCornersIsMutable();
          corners_.add(index, builderForValue.build());
          onChanged();
        } else {
          cornersBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Vector corners = 1;</code>
       */
      public Builder addAllCorners(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.VectorOuterClass.Vector> values) {
        if (cornersBuilder_ == null) {
          ensureCornersIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, corners_);
          onChanged();
        } else {
          cornersBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Vector corners = 1;</code>
       */
      public Builder clearCorners() {
        if (cornersBuilder_ == null) {
          corners_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          cornersBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Vector corners = 1;</code>
       */
      public Builder removeCorners(int index) {
        if (cornersBuilder_ == null) {
          ensureCornersIsMutable();
          corners_.remove(index);
          onChanged();
        } else {
          cornersBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Vector corners = 1;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getCornersBuilder(
          int index) {
        return getCornersFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Vector corners = 1;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCornersOrBuilder(
          int index) {
        if (cornersBuilder_ == null) {
          return corners_.get(index);  } else {
          return cornersBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Vector corners = 1;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
           getCornersOrBuilderList() {
        if (cornersBuilder_ != null) {
          return cornersBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(corners_);
        }
      }
      /**
       * <code>repeated .Vector corners = 1;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder addCornersBuilder() {
        return getCornersFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance());
      }
      /**
       * <code>repeated .Vector corners = 1;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder addCornersBuilder(
          int index) {
        return getCornersFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance());
      }
      /**
       * <code>repeated .Vector corners = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder> 
           getCornersBuilderList() {
        return getCornersFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getCornersFieldBuilder() {
        if (cornersBuilder_ == null) {
          cornersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  corners_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          corners_ = null;
        }
        return cornersBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int queryStatus_ = 0;
      /**
       * <pre>
       * Obf: LFJGAFPHNNE
       * </pre>
       *
       * <code>.PathStatusType query_status = 15;</code>
       * @return The enum numeric value on the wire for queryStatus.
       */
      @java.lang.Override public int getQueryStatusValue() {
        return queryStatus_;
      }
      /**
       * <pre>
       * Obf: LFJGAFPHNNE
       * </pre>
       *
       * <code>.PathStatusType query_status = 15;</code>
       * @param value The enum numeric value on the wire for queryStatus to set.
       * @return This builder for chaining.
       */
      public Builder setQueryStatusValue(int value) {
        
        queryStatus_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Obf: LFJGAFPHNNE
       * </pre>
       *
       * <code>.PathStatusType query_status = 15;</code>
       * @return The queryStatus.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.PathStatusTypeOuterClass.PathStatusType getQueryStatus() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.PathStatusTypeOuterClass.PathStatusType result = emu.grasscutter.net.proto.PathStatusTypeOuterClass.PathStatusType.valueOf(queryStatus_);
        return result == null ? emu.grasscutter.net.proto.PathStatusTypeOuterClass.PathStatusType.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       * Obf: LFJGAFPHNNE
       * </pre>
       *
       * <code>.PathStatusType query_status = 15;</code>
       * @param value The queryStatus to set.
       * @return This builder for chaining.
       */
      public Builder setQueryStatus(emu.grasscutter.net.proto.PathStatusTypeOuterClass.PathStatusType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        queryStatus_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Obf: LFJGAFPHNNE
       * </pre>
       *
       * <code>.PathStatusType query_status = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearQueryStatus() {
        
        queryStatus_ = 0;
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


      // @@protoc_insertion_point(builder_scope:QueryPathRsp)
    }

    // @@protoc_insertion_point(class_scope:QueryPathRsp)
    private static final emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp();
    }

    public static emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QueryPathRsp>
        PARSER = new com.google.protobuf.AbstractParser<QueryPathRsp>() {
      @java.lang.Override
      public QueryPathRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new QueryPathRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<QueryPathRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QueryPathRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.QueryPathRspOuterClass.QueryPathRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QueryPathRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QueryPathRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022QueryPathRsp.proto\032\024PathStatusType.pro" +
      "to\032\014Vector.proto\"r\n\014QueryPathRsp\022\020\n\010quer" +
      "y_id\030\006 \001(\005\022\030\n\007corners\030\001 \003(\0132\007.Vector\022\017\n\007" +
      "retcode\030\010 \001(\005\022%\n\014query_status\030\017 \001(\0162\017.Pa" +
      "thStatusTypeB\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.PathStatusTypeOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_QueryPathRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QueryPathRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QueryPathRsp_descriptor,
        new java.lang.String[] { "QueryId", "Corners", "Retcode", "QueryStatus", });
    emu.grasscutter.net.proto.PathStatusTypeOuterClass.getDescriptor();
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
