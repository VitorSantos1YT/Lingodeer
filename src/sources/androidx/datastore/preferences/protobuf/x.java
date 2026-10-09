package androidx.datastore.preferences.protobuf;

import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import com.google.type.bACG.scNRoQgKSYX;
import dl.ExOZ.xItStCyvVEZ;
import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
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
public final class x {
    private static final /* synthetic */ x[] $VALUES;
    public static final x BOOL;
    public static final x BOOL_LIST;
    public static final x BOOL_LIST_PACKED;
    public static final x BYTES;
    public static final x BYTES_LIST;
    public static final x DOUBLE;
    public static final x DOUBLE_LIST;
    public static final x DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final x ENUM;
    public static final x ENUM_LIST;
    public static final x ENUM_LIST_PACKED;
    public static final x FIXED32;
    public static final x FIXED32_LIST;
    public static final x FIXED32_LIST_PACKED;
    public static final x FIXED64;
    public static final x FIXED64_LIST;
    public static final x FIXED64_LIST_PACKED;
    public static final x FLOAT;
    public static final x FLOAT_LIST;
    public static final x FLOAT_LIST_PACKED;
    public static final x GROUP;
    public static final x GROUP_LIST;
    public static final x INT32;
    public static final x INT32_LIST;
    public static final x INT32_LIST_PACKED;
    public static final x INT64;
    public static final x INT64_LIST;
    public static final x INT64_LIST_PACKED;
    public static final x MAP;
    public static final x MESSAGE;
    public static final x MESSAGE_LIST;
    public static final x SFIXED32;
    public static final x SFIXED32_LIST;
    public static final x SFIXED32_LIST_PACKED;
    public static final x SFIXED64;
    public static final x SFIXED64_LIST;
    public static final x SFIXED64_LIST_PACKED;
    public static final x SINT32;
    public static final x SINT32_LIST;
    public static final x SINT32_LIST_PACKED;
    public static final x SINT64;
    public static final x SINT64_LIST;
    public static final x SINT64_LIST_PACKED;
    public static final x STRING;
    public static final x STRING_LIST;
    public static final x UINT32;
    public static final x UINT32_LIST;
    public static final x UINT32_LIST_PACKED;
    public static final x UINT64;
    public static final x UINT64_LIST;
    public static final x UINT64_LIST_PACKED;
    private static final x[] VALUES;
    private final w collection;
    private final Class<?> elementType;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f1577id;
    private final f0 javaType;
    private final boolean primitiveScalar;

    public x(String str, int i11, int i12, w wVar, f0 f0Var) {
        int i13;
        super(str, i11);
        this.f1577id = i12;
        this.collection = wVar;
        this.javaType = f0Var;
        int i14 = v.f1573a[wVar.ordinal()];
        if (i14 == 1 || i14 == 2) {
            this.elementType = f0Var.a();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (wVar != w.SCALAR || (i13 = v.f1574b[f0Var.ordinal()]) == 1 || i13 == 2 || i13 == 3) ? false : true;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }

    public final int a() {
        return this.f1577id;
    }

    static {
        w wVar = w.SCALAR;
        f0 f0Var = f0.DOUBLE;
        x xVar = new x("DOUBLE", 0, 0, wVar, f0Var);
        DOUBLE = xVar;
        f0 f0Var2 = f0.FLOAT;
        x xVar2 = new x("FLOAT", 1, 1, wVar, f0Var2);
        FLOAT = xVar2;
        f0 f0Var3 = f0.LONG;
        x xVar3 = new x("INT64", 2, 2, wVar, f0Var3);
        INT64 = xVar3;
        x xVar4 = new x("UINT64", 3, 3, wVar, f0Var3);
        UINT64 = xVar4;
        f0 f0Var4 = f0.INT;
        x xVar5 = new x("INT32", 4, 4, wVar, f0Var4);
        INT32 = xVar5;
        x xVar6 = new x("FIXED64", 5, 5, wVar, f0Var3);
        FIXED64 = xVar6;
        x xVar7 = new x("FIXED32", 6, 6, wVar, f0Var4);
        FIXED32 = xVar7;
        f0 f0Var5 = f0.BOOLEAN;
        x xVar8 = new x(kHfjNGauVgdF.HOrQSvv, 7, 7, wVar, f0Var5);
        BOOL = xVar8;
        f0 f0Var6 = f0.STRING;
        x xVar9 = new x("STRING", 8, 8, wVar, f0Var6);
        STRING = xVar9;
        f0 f0Var7 = f0.MESSAGE;
        x xVar10 = new x("MESSAGE", 9, 9, wVar, f0Var7);
        MESSAGE = xVar10;
        f0 f0Var8 = f0.BYTE_STRING;
        x xVar11 = new x("BYTES", 10, 10, wVar, f0Var8);
        BYTES = xVar11;
        x xVar12 = new x("UINT32", 11, 11, wVar, f0Var4);
        UINT32 = xVar12;
        f0 f0Var9 = f0.ENUM;
        x xVar13 = new x(xItStCyvVEZ.xhQHpBbTB, 12, 12, wVar, f0Var9);
        ENUM = xVar13;
        x xVar14 = new x("SFIXED32", 13, 13, wVar, f0Var4);
        SFIXED32 = xVar14;
        x xVar15 = new x("SFIXED64", 14, 14, wVar, f0Var3);
        SFIXED64 = xVar15;
        x xVar16 = new x("SINT32", 15, 15, wVar, f0Var4);
        SINT32 = xVar16;
        x xVar17 = new x("SINT64", 16, 16, wVar, f0Var3);
        SINT64 = xVar17;
        x xVar18 = new x("GROUP", 17, 17, wVar, f0Var7);
        GROUP = xVar18;
        w wVar2 = w.VECTOR;
        x xVar19 = new x("DOUBLE_LIST", 18, 18, wVar2, f0Var);
        DOUBLE_LIST = xVar19;
        x xVar20 = new x("FLOAT_LIST", 19, 19, wVar2, f0Var2);
        FLOAT_LIST = xVar20;
        x xVar21 = new x("INT64_LIST", 20, 20, wVar2, f0Var3);
        INT64_LIST = xVar21;
        x xVar22 = new x("UINT64_LIST", 21, 21, wVar2, f0Var3);
        UINT64_LIST = xVar22;
        x xVar23 = new x("INT32_LIST", 22, 22, wVar2, f0Var4);
        INT32_LIST = xVar23;
        x xVar24 = new x("FIXED64_LIST", 23, 23, wVar2, f0Var3);
        FIXED64_LIST = xVar24;
        x xVar25 = new x("FIXED32_LIST", 24, 24, wVar2, f0Var4);
        FIXED32_LIST = xVar25;
        x xVar26 = new x("BOOL_LIST", 25, 25, wVar2, f0Var5);
        BOOL_LIST = xVar26;
        x xVar27 = new x("STRING_LIST", 26, 26, wVar2, f0Var6);
        STRING_LIST = xVar27;
        x xVar28 = new x("MESSAGE_LIST", 27, 27, wVar2, f0Var7);
        MESSAGE_LIST = xVar28;
        x xVar29 = new x("BYTES_LIST", 28, 28, wVar2, f0Var8);
        BYTES_LIST = xVar29;
        x xVar30 = new x("UINT32_LIST", 29, 29, wVar2, f0Var4);
        UINT32_LIST = xVar30;
        x xVar31 = new x("ENUM_LIST", 30, 30, wVar2, f0Var9);
        ENUM_LIST = xVar31;
        x xVar32 = new x("SFIXED32_LIST", 31, 31, wVar2, f0Var4);
        SFIXED32_LIST = xVar32;
        x xVar33 = new x("SFIXED64_LIST", 32, 32, wVar2, f0Var3);
        SFIXED64_LIST = xVar33;
        x xVar34 = new x("SINT32_LIST", 33, 33, wVar2, f0Var4);
        SINT32_LIST = xVar34;
        x xVar35 = new x("SINT64_LIST", 34, 34, wVar2, f0Var3);
        SINT64_LIST = xVar35;
        w wVar3 = w.PACKED_VECTOR;
        x xVar36 = new x("DOUBLE_LIST_PACKED", 35, 35, wVar3, f0Var);
        DOUBLE_LIST_PACKED = xVar36;
        x xVar37 = new x("FLOAT_LIST_PACKED", 36, 36, wVar3, f0Var2);
        FLOAT_LIST_PACKED = xVar37;
        x xVar38 = new x("INT64_LIST_PACKED", 37, 37, wVar3, f0Var3);
        INT64_LIST_PACKED = xVar38;
        x xVar39 = new x("UINT64_LIST_PACKED", 38, 38, wVar3, f0Var3);
        UINT64_LIST_PACKED = xVar39;
        x xVar40 = new x("INT32_LIST_PACKED", 39, 39, wVar3, f0Var4);
        INT32_LIST_PACKED = xVar40;
        x xVar41 = new x("FIXED64_LIST_PACKED", 40, 40, wVar3, f0Var3);
        FIXED64_LIST_PACKED = xVar41;
        x xVar42 = new x(scNRoQgKSYX.EUFAFjArdmWNc, 41, 41, wVar3, f0Var4);
        FIXED32_LIST_PACKED = xVar42;
        x xVar43 = new x("BOOL_LIST_PACKED", 42, 42, wVar3, f0Var5);
        BOOL_LIST_PACKED = xVar43;
        x xVar44 = new x("UINT32_LIST_PACKED", 43, 43, wVar3, f0Var4);
        UINT32_LIST_PACKED = xVar44;
        x xVar45 = new x("ENUM_LIST_PACKED", 44, 44, wVar3, f0Var9);
        ENUM_LIST_PACKED = xVar45;
        x xVar46 = new x("SFIXED32_LIST_PACKED", 45, 45, wVar3, f0Var4);
        SFIXED32_LIST_PACKED = xVar46;
        x xVar47 = new x("SFIXED64_LIST_PACKED", 46, 46, wVar3, f0Var3);
        SFIXED64_LIST_PACKED = xVar47;
        x xVar48 = new x("SINT32_LIST_PACKED", 47, 47, wVar3, f0Var4);
        SINT32_LIST_PACKED = xVar48;
        x xVar49 = new x("SINT64_LIST_PACKED", 48, 48, wVar3, f0Var3);
        SINT64_LIST_PACKED = xVar49;
        x xVar50 = new x("GROUP_LIST", 49, 49, wVar2, f0Var7);
        GROUP_LIST = xVar50;
        x xVar51 = new x("MAP", 50, 50, w.MAP, f0.VOID);
        MAP = xVar51;
        $VALUES = new x[]{xVar, xVar2, xVar3, xVar4, xVar5, xVar6, xVar7, xVar8, xVar9, xVar10, xVar11, xVar12, xVar13, xVar14, xVar15, xVar16, xVar17, xVar18, xVar19, xVar20, xVar21, xVar22, xVar23, xVar24, xVar25, xVar26, xVar27, xVar28, xVar29, xVar30, xVar31, xVar32, xVar33, xVar34, xVar35, xVar36, xVar37, xVar38, xVar39, xVar40, xVar41, xVar42, xVar43, xVar44, xVar45, xVar46, xVar47, xVar48, xVar49, xVar50, xVar51};
        EMPTY_TYPES = new Type[0];
        x[] xVarArrValues = values();
        VALUES = new x[xVarArrValues.length];
        for (x xVar52 : xVarArrValues) {
            VALUES[xVar52.f1577id] = xVar52;
        }
    }
}
