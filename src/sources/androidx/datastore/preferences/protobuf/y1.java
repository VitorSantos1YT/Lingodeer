package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class y1 {
    private static final /* synthetic */ y1[] $VALUES;
    public static final y1 BOOL;
    public static final y1 BYTES;
    public static final y1 DOUBLE;
    public static final y1 ENUM;
    public static final y1 FIXED32;
    public static final y1 FIXED64;
    public static final y1 FLOAT;
    public static final y1 GROUP;
    public static final y1 INT32;
    public static final y1 INT64;
    public static final y1 MESSAGE;
    public static final y1 SFIXED32;
    public static final y1 SFIXED64;
    public static final y1 SINT32;
    public static final y1 SINT64;
    public static final y1 STRING;
    public static final y1 UINT32;
    public static final y1 UINT64;
    private final z1 javaType;
    private final int wireType;

    static {
        y1 y1Var = new y1("DOUBLE", 0, z1.DOUBLE, 1);
        DOUBLE = y1Var;
        y1 y1Var2 = new y1("FLOAT", 1, z1.FLOAT, 5);
        FLOAT = y1Var2;
        z1 z1Var = z1.LONG;
        y1 y1Var3 = new y1("INT64", 2, z1Var, 0);
        INT64 = y1Var3;
        y1 y1Var4 = new y1("UINT64", 3, z1Var, 0);
        UINT64 = y1Var4;
        z1 z1Var2 = z1.INT;
        y1 y1Var5 = new y1("INT32", 4, z1Var2, 0);
        INT32 = y1Var5;
        y1 y1Var6 = new y1("FIXED64", 5, z1Var, 1);
        FIXED64 = y1Var6;
        y1 y1Var7 = new y1("FIXED32", 6, z1Var2, 5);
        FIXED32 = y1Var7;
        y1 y1Var8 = new y1("BOOL", 7, z1.BOOLEAN, 0);
        BOOL = y1Var8;
        u1 u1Var = new u1("STRING", 8, z1.STRING, 2);
        STRING = u1Var;
        z1 z1Var3 = z1.MESSAGE;
        v1 v1Var = new v1("GROUP", 9, z1Var3, 3);
        GROUP = v1Var;
        w1 w1Var = new w1("MESSAGE", 10, z1Var3, 2);
        MESSAGE = w1Var;
        x1 x1Var = new x1("BYTES", 11, z1.BYTE_STRING, 2);
        BYTES = x1Var;
        y1 y1Var9 = new y1("UINT32", 12, z1Var2, 0);
        UINT32 = y1Var9;
        y1 y1Var10 = new y1("ENUM", 13, z1.ENUM, 0);
        ENUM = y1Var10;
        y1 y1Var11 = new y1("SFIXED32", 14, z1Var2, 5);
        SFIXED32 = y1Var11;
        y1 y1Var12 = new y1("SFIXED64", 15, z1Var, 1);
        SFIXED64 = y1Var12;
        y1 y1Var13 = new y1("SINT32", 16, z1Var2, 0);
        SINT32 = y1Var13;
        y1 y1Var14 = new y1("SINT64", 17, z1Var, 0);
        SINT64 = y1Var14;
        $VALUES = new y1[]{y1Var, y1Var2, y1Var3, y1Var4, y1Var5, y1Var6, y1Var7, y1Var8, u1Var, v1Var, w1Var, x1Var, y1Var9, y1Var10, y1Var11, y1Var12, y1Var13, y1Var14};
    }

    public y1(String str, int i11, z1 z1Var, int i12) {
        super(str, i11);
        this.javaType = z1Var;
        this.wireType = i12;
    }

    public static y1 valueOf(String str) {
        return (y1) Enum.valueOf(y1.class, str);
    }

    public static y1[] values() {
        return (y1[]) $VALUES.clone();
    }

    public final z1 a() {
        return this.javaType;
    }

    public final int b() {
        return this.wireType;
    }
}
