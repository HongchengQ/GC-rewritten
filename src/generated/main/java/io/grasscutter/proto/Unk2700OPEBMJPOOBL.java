// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_OPEBMJPOOBL.proto

package io.grasscutter.proto;

public final class Unk2700OPEBMJPOOBL {
  private Unk2700OPEBMJPOOBL() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code Unk2700_OPEBMJPOOBL}
   */
  public enum Unk2700_OPEBMJPOOBL
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Unk2700_OPEBMJPOOBL_NONE = 0;</code>
     */
    Unk2700_OPEBMJPOOBL_NONE(0),
    /**
     * <code>Unk2700_OPEBMJPOOBL_Unk2700_HONBFAOIDKK = 1;</code>
     */
    Unk2700_OPEBMJPOOBL_Unk2700_HONBFAOIDKK(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>Unk2700_OPEBMJPOOBL_NONE = 0;</code>
     */
    public static final int Unk2700_OPEBMJPOOBL_NONE_VALUE = 0;
    /**
     * <code>Unk2700_OPEBMJPOOBL_Unk2700_HONBFAOIDKK = 1;</code>
     */
    public static final int Unk2700_OPEBMJPOOBL_Unk2700_HONBFAOIDKK_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Unk2700_OPEBMJPOOBL valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Unk2700_OPEBMJPOOBL forNumber(int value) {
      switch (value) {
        case 0: return Unk2700_OPEBMJPOOBL_NONE;
        case 1: return Unk2700_OPEBMJPOOBL_Unk2700_HONBFAOIDKK;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Unk2700_OPEBMJPOOBL>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Unk2700_OPEBMJPOOBL> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Unk2700_OPEBMJPOOBL>() {
            public Unk2700_OPEBMJPOOBL findValueByNumber(int number) {
              return Unk2700_OPEBMJPOOBL.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return io.grasscutter.proto.Unk2700OPEBMJPOOBL.getDescriptor().getEnumTypes().get(0);
    }

    private static final Unk2700_OPEBMJPOOBL[] VALUES = values();

    public static Unk2700_OPEBMJPOOBL valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Unk2700_OPEBMJPOOBL(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Unk2700_OPEBMJPOOBL)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_OPEBMJPOOBL.proto*`\n\023Unk2700_O" +
      "PEBMJPOOBL\022\034\n\030Unk2700_OPEBMJPOOBL_NONE\020\000" +
      "\022+\n\'Unk2700_OPEBMJPOOBL_Unk2700_HONBFAOI" +
      "DKK\020\001B\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
