// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlatformType.proto

package io.grasscutter.proto;

public final class PlatformTypeOuterClass {
  private PlatformTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code PlatformType}
   */
  public enum PlatformType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PLATFORM_TYPE_EDITOR = 0;</code>
     */
    PLATFORM_TYPE_EDITOR(0),
    /**
     * <code>PLATFORM_TYPE_IOS = 1;</code>
     */
    PLATFORM_TYPE_IOS(1),
    /**
     * <code>PLATFORM_TYPE_ANDROID = 2;</code>
     */
    PLATFORM_TYPE_ANDROID(2),
    /**
     * <code>PLATFORM_TYPE_PC = 3;</code>
     */
    PLATFORM_TYPE_PC(3),
    /**
     * <code>PLATFORM_TYPE_PS4 = 4;</code>
     */
    PLATFORM_TYPE_PS4(4),
    /**
     * <code>PLATFORM_TYPE_SERVER = 5;</code>
     */
    PLATFORM_TYPE_SERVER(5),
    /**
     * <code>PLATFORM_TYPE_CLOUD_ANDROID = 6;</code>
     */
    PLATFORM_TYPE_CLOUD_ANDROID(6),
    /**
     * <code>PLATFORM_TYPE_CLOUD_IOS = 7;</code>
     */
    PLATFORM_TYPE_CLOUD_IOS(7),
    /**
     * <code>PLATFORM_TYPE_PS5 = 8;</code>
     */
    PLATFORM_TYPE_PS5(8),
    /**
     * <code>PLATFORM_TYPE_CLOUD_WEB = 9;</code>
     */
    PLATFORM_TYPE_CLOUD_WEB(9),
    /**
     * <code>PLATFORM_TYPE_CLOUD_TV = 10;</code>
     */
    PLATFORM_TYPE_CLOUD_TV(10),
    /**
     * <code>PLATFORM_TYPE_Unk2700_IBBEKBJLMAJ = 11;</code>
     */
    PLATFORM_TYPE_Unk2700_IBBEKBJLMAJ(11),
    /**
     * <code>PLATFORM_TYPE_Unk2700_BCEICMDNIIG = 12;</code>
     */
    PLATFORM_TYPE_Unk2700_BCEICMDNIIG(12),
    /**
     * <code>PLATFORM_TYPE_Unk2800_EFNGHFNPMKM = 13;</code>
     */
    PLATFORM_TYPE_Unk2800_EFNGHFNPMKM(13),
    /**
     * <code>PLATFORM_TYPE_Unk2800_FNFHGPABLFB = 14;</code>
     */
    PLATFORM_TYPE_Unk2800_FNFHGPABLFB(14),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>PLATFORM_TYPE_EDITOR = 0;</code>
     */
    public static final int PLATFORM_TYPE_EDITOR_VALUE = 0;
    /**
     * <code>PLATFORM_TYPE_IOS = 1;</code>
     */
    public static final int PLATFORM_TYPE_IOS_VALUE = 1;
    /**
     * <code>PLATFORM_TYPE_ANDROID = 2;</code>
     */
    public static final int PLATFORM_TYPE_ANDROID_VALUE = 2;
    /**
     * <code>PLATFORM_TYPE_PC = 3;</code>
     */
    public static final int PLATFORM_TYPE_PC_VALUE = 3;
    /**
     * <code>PLATFORM_TYPE_PS4 = 4;</code>
     */
    public static final int PLATFORM_TYPE_PS4_VALUE = 4;
    /**
     * <code>PLATFORM_TYPE_SERVER = 5;</code>
     */
    public static final int PLATFORM_TYPE_SERVER_VALUE = 5;
    /**
     * <code>PLATFORM_TYPE_CLOUD_ANDROID = 6;</code>
     */
    public static final int PLATFORM_TYPE_CLOUD_ANDROID_VALUE = 6;
    /**
     * <code>PLATFORM_TYPE_CLOUD_IOS = 7;</code>
     */
    public static final int PLATFORM_TYPE_CLOUD_IOS_VALUE = 7;
    /**
     * <code>PLATFORM_TYPE_PS5 = 8;</code>
     */
    public static final int PLATFORM_TYPE_PS5_VALUE = 8;
    /**
     * <code>PLATFORM_TYPE_CLOUD_WEB = 9;</code>
     */
    public static final int PLATFORM_TYPE_CLOUD_WEB_VALUE = 9;
    /**
     * <code>PLATFORM_TYPE_CLOUD_TV = 10;</code>
     */
    public static final int PLATFORM_TYPE_CLOUD_TV_VALUE = 10;
    /**
     * <code>PLATFORM_TYPE_Unk2700_IBBEKBJLMAJ = 11;</code>
     */
    public static final int PLATFORM_TYPE_Unk2700_IBBEKBJLMAJ_VALUE = 11;
    /**
     * <code>PLATFORM_TYPE_Unk2700_BCEICMDNIIG = 12;</code>
     */
    public static final int PLATFORM_TYPE_Unk2700_BCEICMDNIIG_VALUE = 12;
    /**
     * <code>PLATFORM_TYPE_Unk2800_EFNGHFNPMKM = 13;</code>
     */
    public static final int PLATFORM_TYPE_Unk2800_EFNGHFNPMKM_VALUE = 13;
    /**
     * <code>PLATFORM_TYPE_Unk2800_FNFHGPABLFB = 14;</code>
     */
    public static final int PLATFORM_TYPE_Unk2800_FNFHGPABLFB_VALUE = 14;


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
    public static PlatformType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PlatformType forNumber(int value) {
      switch (value) {
        case 0: return PLATFORM_TYPE_EDITOR;
        case 1: return PLATFORM_TYPE_IOS;
        case 2: return PLATFORM_TYPE_ANDROID;
        case 3: return PLATFORM_TYPE_PC;
        case 4: return PLATFORM_TYPE_PS4;
        case 5: return PLATFORM_TYPE_SERVER;
        case 6: return PLATFORM_TYPE_CLOUD_ANDROID;
        case 7: return PLATFORM_TYPE_CLOUD_IOS;
        case 8: return PLATFORM_TYPE_PS5;
        case 9: return PLATFORM_TYPE_CLOUD_WEB;
        case 10: return PLATFORM_TYPE_CLOUD_TV;
        case 11: return PLATFORM_TYPE_Unk2700_IBBEKBJLMAJ;
        case 12: return PLATFORM_TYPE_Unk2700_BCEICMDNIIG;
        case 13: return PLATFORM_TYPE_Unk2800_EFNGHFNPMKM;
        case 14: return PLATFORM_TYPE_Unk2800_FNFHGPABLFB;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PlatformType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PlatformType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PlatformType>() {
            public PlatformType findValueByNumber(int number) {
              return PlatformType.forNumber(number);
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
      return io.grasscutter.proto.PlatformTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final PlatformType[] VALUES = values();

    public static PlatformType valueOf(
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

    private PlatformType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:PlatformType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022PlatformType.proto*\313\003\n\014PlatformType\022\030\n" +
      "\024PLATFORM_TYPE_EDITOR\020\000\022\025\n\021PLATFORM_TYPE" +
      "_IOS\020\001\022\031\n\025PLATFORM_TYPE_ANDROID\020\002\022\024\n\020PLA" +
      "TFORM_TYPE_PC\020\003\022\025\n\021PLATFORM_TYPE_PS4\020\004\022\030" +
      "\n\024PLATFORM_TYPE_SERVER\020\005\022\037\n\033PLATFORM_TYP" +
      "E_CLOUD_ANDROID\020\006\022\033\n\027PLATFORM_TYPE_CLOUD" +
      "_IOS\020\007\022\025\n\021PLATFORM_TYPE_PS5\020\010\022\033\n\027PLATFOR" +
      "M_TYPE_CLOUD_WEB\020\t\022\032\n\026PLATFORM_TYPE_CLOU" +
      "D_TV\020\n\022%\n!PLATFORM_TYPE_Unk2700_IBBEKBJL" +
      "MAJ\020\013\022%\n!PLATFORM_TYPE_Unk2700_BCEICMDNI" +
      "IG\020\014\022%\n!PLATFORM_TYPE_Unk2800_EFNGHFNPMK" +
      "M\020\r\022%\n!PLATFORM_TYPE_Unk2800_FNFHGPABLFB" +
      "\020\016B\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
