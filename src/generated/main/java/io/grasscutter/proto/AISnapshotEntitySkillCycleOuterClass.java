// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AISnapshotEntitySkillCycle.proto

package io.grasscutter.proto;

public final class AISnapshotEntitySkillCycleOuterClass {
  private AISnapshotEntitySkillCycleOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AISnapshotEntitySkillCycleOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AISnapshotEntitySkillCycle)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool failed = 12;</code>
     * @return The failed.
     */
    boolean getFailed();

    /**
     * <code>bool trydoskill = 8;</code>
     * @return The trydoskill.
     */
    boolean getTrydoskill();

    /**
     * <code>bool success = 9;</code>
     * @return The success.
     */
    boolean getSuccess();

    /**
     * <code>bool selected = 1;</code>
     * @return The selected.
     */
    boolean getSelected();

    /**
     * <code>uint32 skill_id = 2;</code>
     * @return The skillId.
     */
    int getSkillId();
  }
  /**
   * Protobuf type {@code AISnapshotEntitySkillCycle}
   */
  public static final class AISnapshotEntitySkillCycle extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AISnapshotEntitySkillCycle)
      AISnapshotEntitySkillCycleOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AISnapshotEntitySkillCycle.newBuilder() to construct.
    private AISnapshotEntitySkillCycle(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AISnapshotEntitySkillCycle() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AISnapshotEntitySkillCycle();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AISnapshotEntitySkillCycle(
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
            case 8: {

              selected_ = input.readBool();
              break;
            }
            case 16: {

              skillId_ = input.readUInt32();
              break;
            }
            case 64: {

              trydoskill_ = input.readBool();
              break;
            }
            case 72: {

              success_ = input.readBool();
              break;
            }
            case 96: {

              failed_ = input.readBool();
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
      return io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.internal_static_AISnapshotEntitySkillCycle_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.internal_static_AISnapshotEntitySkillCycle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle.class, io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle.Builder.class);
    }

    public static final int FAILED_FIELD_NUMBER = 12;
    private boolean failed_;
    /**
     * <code>bool failed = 12;</code>
     * @return The failed.
     */
    @java.lang.Override
    public boolean getFailed() {
      return failed_;
    }

    public static final int TRYDOSKILL_FIELD_NUMBER = 8;
    private boolean trydoskill_;
    /**
     * <code>bool trydoskill = 8;</code>
     * @return The trydoskill.
     */
    @java.lang.Override
    public boolean getTrydoskill() {
      return trydoskill_;
    }

    public static final int SUCCESS_FIELD_NUMBER = 9;
    private boolean success_;
    /**
     * <code>bool success = 9;</code>
     * @return The success.
     */
    @java.lang.Override
    public boolean getSuccess() {
      return success_;
    }

    public static final int SELECTED_FIELD_NUMBER = 1;
    private boolean selected_;
    /**
     * <code>bool selected = 1;</code>
     * @return The selected.
     */
    @java.lang.Override
    public boolean getSelected() {
      return selected_;
    }

    public static final int SKILL_ID_FIELD_NUMBER = 2;
    private int skillId_;
    /**
     * <code>uint32 skill_id = 2;</code>
     * @return The skillId.
     */
    @java.lang.Override
    public int getSkillId() {
      return skillId_;
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
      if (selected_ != false) {
        output.writeBool(1, selected_);
      }
      if (skillId_ != 0) {
        output.writeUInt32(2, skillId_);
      }
      if (trydoskill_ != false) {
        output.writeBool(8, trydoskill_);
      }
      if (success_ != false) {
        output.writeBool(9, success_);
      }
      if (failed_ != false) {
        output.writeBool(12, failed_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (selected_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, selected_);
      }
      if (skillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, skillId_);
      }
      if (trydoskill_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, trydoskill_);
      }
      if (success_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, success_);
      }
      if (failed_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, failed_);
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
      if (!(obj instanceof io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle other = (io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle) obj;

      if (getFailed()
          != other.getFailed()) return false;
      if (getTrydoskill()
          != other.getTrydoskill()) return false;
      if (getSuccess()
          != other.getSuccess()) return false;
      if (getSelected()
          != other.getSelected()) return false;
      if (getSkillId()
          != other.getSkillId()) return false;
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
      hash = (37 * hash) + FAILED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getFailed());
      hash = (37 * hash) + TRYDOSKILL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getTrydoskill());
      hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getSuccess());
      hash = (37 * hash) + SELECTED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getSelected());
      hash = (37 * hash) + SKILL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle prototype) {
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
     * Protobuf type {@code AISnapshotEntitySkillCycle}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AISnapshotEntitySkillCycle)
        io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.internal_static_AISnapshotEntitySkillCycle_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.internal_static_AISnapshotEntitySkillCycle_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle.class, io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle.Builder.class);
      }

      // Construct using io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle.newBuilder()
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
        failed_ = false;

        trydoskill_ = false;

        success_ = false;

        selected_ = false;

        skillId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.internal_static_AISnapshotEntitySkillCycle_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle getDefaultInstanceForType() {
        return io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle build() {
        io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle buildPartial() {
        io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle result = new io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle(this);
        result.failed_ = failed_;
        result.trydoskill_ = trydoskill_;
        result.success_ = success_;
        result.selected_ = selected_;
        result.skillId_ = skillId_;
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
        if (other instanceof io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle) {
          return mergeFrom((io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle other) {
        if (other == io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle.getDefaultInstance()) return this;
        if (other.getFailed() != false) {
          setFailed(other.getFailed());
        }
        if (other.getTrydoskill() != false) {
          setTrydoskill(other.getTrydoskill());
        }
        if (other.getSuccess() != false) {
          setSuccess(other.getSuccess());
        }
        if (other.getSelected() != false) {
          setSelected(other.getSelected());
        }
        if (other.getSkillId() != 0) {
          setSkillId(other.getSkillId());
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
        io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean failed_ ;
      /**
       * <code>bool failed = 12;</code>
       * @return The failed.
       */
      @java.lang.Override
      public boolean getFailed() {
        return failed_;
      }
      /**
       * <code>bool failed = 12;</code>
       * @param value The failed to set.
       * @return This builder for chaining.
       */
      public Builder setFailed(boolean value) {
        
        failed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool failed = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearFailed() {
        
        failed_ = false;
        onChanged();
        return this;
      }

      private boolean trydoskill_ ;
      /**
       * <code>bool trydoskill = 8;</code>
       * @return The trydoskill.
       */
      @java.lang.Override
      public boolean getTrydoskill() {
        return trydoskill_;
      }
      /**
       * <code>bool trydoskill = 8;</code>
       * @param value The trydoskill to set.
       * @return This builder for chaining.
       */
      public Builder setTrydoskill(boolean value) {
        
        trydoskill_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool trydoskill = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearTrydoskill() {
        
        trydoskill_ = false;
        onChanged();
        return this;
      }

      private boolean success_ ;
      /**
       * <code>bool success = 9;</code>
       * @return The success.
       */
      @java.lang.Override
      public boolean getSuccess() {
        return success_;
      }
      /**
       * <code>bool success = 9;</code>
       * @param value The success to set.
       * @return This builder for chaining.
       */
      public Builder setSuccess(boolean value) {
        
        success_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool success = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearSuccess() {
        
        success_ = false;
        onChanged();
        return this;
      }

      private boolean selected_ ;
      /**
       * <code>bool selected = 1;</code>
       * @return The selected.
       */
      @java.lang.Override
      public boolean getSelected() {
        return selected_;
      }
      /**
       * <code>bool selected = 1;</code>
       * @param value The selected to set.
       * @return This builder for chaining.
       */
      public Builder setSelected(boolean value) {
        
        selected_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool selected = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSelected() {
        
        selected_ = false;
        onChanged();
        return this;
      }

      private int skillId_ ;
      /**
       * <code>uint32 skill_id = 2;</code>
       * @return The skillId.
       */
      @java.lang.Override
      public int getSkillId() {
        return skillId_;
      }
      /**
       * <code>uint32 skill_id = 2;</code>
       * @param value The skillId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillId(int value) {
        
        skillId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skill_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillId() {
        
        skillId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AISnapshotEntitySkillCycle)
    }

    // @@protoc_insertion_point(class_scope:AISnapshotEntitySkillCycle)
    private static final io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle();
    }

    public static io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AISnapshotEntitySkillCycle>
        PARSER = new com.google.protobuf.AbstractParser<AISnapshotEntitySkillCycle>() {
      @java.lang.Override
      public AISnapshotEntitySkillCycle parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AISnapshotEntitySkillCycle(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AISnapshotEntitySkillCycle> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AISnapshotEntitySkillCycle> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.AISnapshotEntitySkillCycleOuterClass.AISnapshotEntitySkillCycle getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AISnapshotEntitySkillCycle_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AISnapshotEntitySkillCycle_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n AISnapshotEntitySkillCycle.proto\"u\n\032AI" +
      "SnapshotEntitySkillCycle\022\016\n\006failed\030\014 \001(\010" +
      "\022\022\n\ntrydoskill\030\010 \001(\010\022\017\n\007success\030\t \001(\010\022\020\n" +
      "\010selected\030\001 \001(\010\022\020\n\010skill_id\030\002 \001(\rB\026\n\024io." +
      "grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AISnapshotEntitySkillCycle_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AISnapshotEntitySkillCycle_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AISnapshotEntitySkillCycle_descriptor,
        new java.lang.String[] { "Failed", "Trydoskill", "Success", "Selected", "SkillId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
