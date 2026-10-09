package androidx.glance.appwidget.protobuf;

import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import java.lang.reflect.Type;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;

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
public final class s {
    private static final /* synthetic */ s[] $VALUES;
    public static final s BOOL;
    public static final s BOOL_LIST;
    public static final s BOOL_LIST_PACKED;
    public static final s BYTES;
    public static final s BYTES_LIST;
    public static final s DOUBLE;
    public static final s DOUBLE_LIST;
    public static final s DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final s ENUM;
    public static final s ENUM_LIST;
    public static final s ENUM_LIST_PACKED;
    public static final s FIXED32;
    public static final s FIXED32_LIST;
    public static final s FIXED32_LIST_PACKED;
    public static final s FIXED64;
    public static final s FIXED64_LIST;
    public static final s FIXED64_LIST_PACKED;
    public static final s FLOAT;
    public static final s FLOAT_LIST;
    public static final s FLOAT_LIST_PACKED;
    public static final s GROUP;
    public static final s GROUP_LIST;
    public static final s INT32;
    public static final s INT32_LIST;
    public static final s INT32_LIST_PACKED;
    public static final s INT64;
    public static final s INT64_LIST;
    public static final s INT64_LIST_PACKED;
    public static final s MAP;
    public static final s MESSAGE;
    public static final s MESSAGE_LIST;
    public static final s SFIXED32;
    public static final s SFIXED32_LIST;
    public static final s SFIXED32_LIST_PACKED;
    public static final s SFIXED64;
    public static final s SFIXED64_LIST;
    public static final s SFIXED64_LIST_PACKED;
    public static final s SINT32;
    public static final s SINT32_LIST;
    public static final s SINT32_LIST_PACKED;
    public static final s SINT64;
    public static final s SINT64_LIST;
    public static final s SINT64_LIST_PACKED;
    public static final s STRING;
    public static final s STRING_LIST;
    public static final s UINT32;
    public static final s UINT32_LIST;
    public static final s UINT32_LIST_PACKED;
    public static final s UINT64;
    public static final s UINT64_LIST;
    public static final s UINT64_LIST_PACKED;
    private static final s[] VALUES;
    private final r collection;
    private final Class<?> elementType;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f1993id;
    private final c0 javaType;
    private final boolean primitiveScalar;

    public s(String str, int i11, int i12, r rVar, c0 c0Var) {
        int i13;
        super(str, i11);
        this.f1993id = i12;
        this.collection = rVar;
        this.javaType = c0Var;
        int i14 = q.f1989a[rVar.ordinal()];
        if (i14 == 1 || i14 == 2) {
            this.elementType = c0Var.a();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (rVar != r.SCALAR || (i13 = q.f1990b[c0Var.ordinal()]) == 1 || i13 == 2 || i13 == 3) ? false : true;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }

    public final int a() {
        return this.f1993id;
    }

    static {
        r rVar = r.SCALAR;
        c0 c0Var = c0.DOUBLE;
        s sVar = new s("DOUBLE", 0, 0, rVar, c0Var);
        DOUBLE = sVar;
        c0 c0Var2 = c0.FLOAT;
        s sVar2 = new s("FLOAT", 1, 1, rVar, c0Var2);
        FLOAT = sVar2;
        c0 c0Var3 = c0.LONG;
        s sVar3 = new s("INT64", 2, 2, rVar, c0Var3);
        INT64 = sVar3;
        s sVar4 = new s("UINT64", 3, 3, rVar, c0Var3);
        UINT64 = sVar4;
        c0 c0Var4 = c0.INT;
        s sVar5 = new s("INT32", 4, 4, rVar, c0Var4);
        INT32 = sVar5;
        s sVar6 = new s("FIXED64", 5, 5, rVar, c0Var3);
        FIXED64 = sVar6;
        s sVar7 = new s("FIXED32", 6, 6, rVar, c0Var4);
        FIXED32 = sVar7;
        c0 c0Var5 = c0.BOOLEAN;
        s sVar8 = new s("BOOL", 7, 7, rVar, c0Var5);
        BOOL = sVar8;
        c0 c0Var6 = c0.STRING;
        s sVar9 = new s("STRING", 8, 8, rVar, c0Var6);
        STRING = sVar9;
        c0 c0Var7 = c0.MESSAGE;
        s sVar10 = new s("MESSAGE", 9, 9, rVar, c0Var7);
        MESSAGE = sVar10;
        c0 c0Var8 = c0.BYTE_STRING;
        s sVar11 = new s("BYTES", 10, 10, rVar, c0Var8);
        BYTES = sVar11;
        s sVar12 = new s("UINT32", 11, 11, rVar, c0Var4);
        UINT32 = sVar12;
        c0 c0Var9 = c0.ENUM;
        s sVar13 = new s("ENUM", 12, 12, rVar, c0Var9);
        ENUM = sVar13;
        s sVar14 = new s("SFIXED32", 13, 13, rVar, c0Var4);
        SFIXED32 = sVar14;
        s sVar15 = new s("SFIXED64", 14, 14, rVar, c0Var3);
        SFIXED64 = sVar15;
        s sVar16 = new s("SINT32", 15, 15, rVar, c0Var4);
        SINT32 = sVar16;
        s sVar17 = new s("SINT64", 16, 16, rVar, c0Var3);
        SINT64 = sVar17;
        s sVar18 = new s("GROUP", 17, 17, rVar, c0Var7);
        GROUP = sVar18;
        r rVar2 = r.VECTOR;
        s sVar19 = new s("DOUBLE_LIST", 18, 18, rVar2, c0Var);
        DOUBLE_LIST = sVar19;
        s sVar20 = new s("FLOAT_LIST", 19, 19, rVar2, c0Var2);
        FLOAT_LIST = sVar20;
        s sVar21 = new s("INT64_LIST", 20, 20, rVar2, c0Var3);
        INT64_LIST = sVar21;
        s sVar22 = new s("UINT64_LIST", 21, 21, rVar2, c0Var3);
        UINT64_LIST = sVar22;
        s sVar23 = new s("INT32_LIST", 22, 22, rVar2, c0Var4);
        INT32_LIST = sVar23;
        s sVar24 = new s("FIXED64_LIST", 23, 23, rVar2, c0Var3);
        FIXED64_LIST = sVar24;
        s sVar25 = new s("FIXED32_LIST", 24, 24, rVar2, c0Var4);
        FIXED32_LIST = sVar25;
        s sVar26 = new s("BOOL_LIST", 25, 25, rVar2, c0Var5);
        BOOL_LIST = sVar26;
        s sVar27 = new s("STRING_LIST", 26, 26, rVar2, c0Var6);
        STRING_LIST = sVar27;
        s sVar28 = new s("MESSAGE_LIST", 27, 27, rVar2, c0Var7);
        MESSAGE_LIST = sVar28;
        s sVar29 = new s("BYTES_LIST", 28, 28, rVar2, c0Var8);
        BYTES_LIST = sVar29;
        s sVar30 = new s("UINT32_LIST", 29, 29, rVar2, c0Var4);
        UINT32_LIST = sVar30;
        s sVar31 = new s("ENUM_LIST", 30, 30, rVar2, c0Var9);
        ENUM_LIST = sVar31;
        s sVar32 = new s("SFIXED32_LIST", 31, 31, rVar2, c0Var4);
        SFIXED32_LIST = sVar32;
        s sVar33 = new s("SFIXED64_LIST", 32, 32, rVar2, c0Var3);
        SFIXED64_LIST = sVar33;
        s sVar34 = new s("SINT32_LIST", 33, 33, rVar2, c0Var4);
        SINT32_LIST = sVar34;
        s sVar35 = new s("SINT64_LIST", 34, 34, rVar2, c0Var3);
        SINT64_LIST = sVar35;
        r rVar3 = r.PACKED_VECTOR;
        s sVar36 = new s("DOUBLE_LIST_PACKED", 35, 35, rVar3, c0Var);
        DOUBLE_LIST_PACKED = sVar36;
        s sVar37 = new s("FLOAT_LIST_PACKED", 36, 36, rVar3, c0Var2);
        FLOAT_LIST_PACKED = sVar37;
        s sVar38 = new s("INT64_LIST_PACKED", 37, 37, rVar3, c0Var3);
        INT64_LIST_PACKED = sVar38;
        s sVar39 = new s("UINT64_LIST_PACKED", 38, 38, rVar3, c0Var3);
        UINT64_LIST_PACKED = sVar39;
        s sVar40 = new s(ualZoVVCQs.TTadGXHkw, 39, 39, rVar3, c0Var4);
        INT32_LIST_PACKED = sVar40;
        s sVar41 = new s("FIXED64_LIST_PACKED", 40, 40, rVar3, c0Var3);
        FIXED64_LIST_PACKED = sVar41;
        s sVar42 = new s("FIXED32_LIST_PACKED", 41, 41, rVar3, c0Var4);
        FIXED32_LIST_PACKED = sVar42;
        s sVar43 = new s("BOOL_LIST_PACKED", 42, 42, rVar3, c0Var5);
        BOOL_LIST_PACKED = sVar43;
        s sVar44 = new s("UINT32_LIST_PACKED", 43, 43, rVar3, c0Var4);
        UINT32_LIST_PACKED = sVar44;
        s sVar45 = new s("ENUM_LIST_PACKED", 44, 44, rVar3, c0Var9);
        ENUM_LIST_PACKED = sVar45;
        s sVar46 = new s("SFIXED32_LIST_PACKED", 45, 45, rVar3, c0Var4);
        SFIXED32_LIST_PACKED = sVar46;
        s sVar47 = new s("SFIXED64_LIST_PACKED", 46, 46, rVar3, c0Var3);
        SFIXED64_LIST_PACKED = sVar47;
        s sVar48 = new s("SINT32_LIST_PACKED", 47, 47, rVar3, c0Var4);
        SINT32_LIST_PACKED = sVar48;
        s sVar49 = new s("SINT64_LIST_PACKED", 48, 48, rVar3, c0Var3);
        SINT64_LIST_PACKED = sVar49;
        s sVar50 = new s("GROUP_LIST", 49, 49, rVar2, c0Var7);
        GROUP_LIST = sVar50;
        s sVar51 = new s(OYAvlbfUyD.oMnSomvX, 50, 50, r.MAP, c0.VOID);
        MAP = sVar51;
        $VALUES = new s[]{sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9, sVar10, sVar11, sVar12, sVar13, sVar14, sVar15, sVar16, sVar17, sVar18, sVar19, sVar20, sVar21, sVar22, sVar23, sVar24, sVar25, sVar26, sVar27, sVar28, sVar29, sVar30, sVar31, sVar32, sVar33, sVar34, sVar35, sVar36, sVar37, sVar38, sVar39, sVar40, sVar41, sVar42, sVar43, sVar44, sVar45, sVar46, sVar47, sVar48, sVar49, sVar50, sVar51};
        EMPTY_TYPES = new Type[0];
        s[] sVarArrValues = values();
        VALUES = new s[sVarArrValues.length];
        for (s sVar52 : sVarArrValues) {
            VALUES[sVar52.f1993id] = sVar52;
        }
    }
}
