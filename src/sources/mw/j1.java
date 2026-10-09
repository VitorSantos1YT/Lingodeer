package mw;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NO_ERROR' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j1 {
    private static final /* synthetic */ j1[] $VALUES;
    public static final j1 CANCEL;
    public static final j1 COMPRESSION_ERROR;
    public static final j1 CONNECT_ERROR;
    public static final j1 ENHANCE_YOUR_CALM;
    public static final j1 FLOW_CONTROL_ERROR;
    public static final j1 FRAME_SIZE_ERROR;
    public static final j1 HTTP_1_1_REQUIRED;
    public static final j1 INADEQUATE_SECURITY;
    public static final j1 INTERNAL_ERROR;
    public static final j1 NO_ERROR;
    public static final j1 PROTOCOL_ERROR;
    public static final j1 REFUSED_STREAM;
    public static final j1 SETTINGS_TIMEOUT;
    public static final j1 STREAM_CLOSED;
    private static final j1[] codeMap;
    private final int code;
    private final lw.q1 status;

    static {
        lw.q1 q1Var = lw.q1.m;
        j1 j1Var = new j1("NO_ERROR", 0, 0, q1Var);
        NO_ERROR = j1Var;
        lw.q1 q1Var2 = lw.q1.f40441l;
        j1 j1Var2 = new j1("PROTOCOL_ERROR", 1, 1, q1Var2);
        PROTOCOL_ERROR = j1Var2;
        j1 j1Var3 = new j1("INTERNAL_ERROR", 2, 2, q1Var2);
        INTERNAL_ERROR = j1Var3;
        j1 j1Var4 = new j1("FLOW_CONTROL_ERROR", 3, 3, q1Var2);
        FLOW_CONTROL_ERROR = j1Var4;
        j1 j1Var5 = new j1("SETTINGS_TIMEOUT", 4, 4, q1Var2);
        SETTINGS_TIMEOUT = j1Var5;
        j1 j1Var6 = new j1("STREAM_CLOSED", 5, 5, q1Var2);
        STREAM_CLOSED = j1Var6;
        j1 j1Var7 = new j1("FRAME_SIZE_ERROR", 6, 6, q1Var2);
        FRAME_SIZE_ERROR = j1Var7;
        j1 j1Var8 = new j1("REFUSED_STREAM", 7, 7, q1Var);
        REFUSED_STREAM = j1Var8;
        j1 j1Var9 = new j1("CANCEL", 8, 8, lw.q1.f40435f);
        CANCEL = j1Var9;
        j1 j1Var10 = new j1("COMPRESSION_ERROR", 9, 9, q1Var2);
        COMPRESSION_ERROR = j1Var10;
        j1 j1Var11 = new j1("CONNECT_ERROR", 10, 10, q1Var2);
        CONNECT_ERROR = j1Var11;
        j1 j1Var12 = new j1("ENHANCE_YOUR_CALM", 11, 11, lw.q1.f40439j.h("Bandwidth exhausted"));
        ENHANCE_YOUR_CALM = j1Var12;
        j1 j1Var13 = new j1("INADEQUATE_SECURITY", 12, 12, lw.q1.f40438i.h("Permission denied as protocol is not secure enough to call"));
        INADEQUATE_SECURITY = j1Var13;
        j1 j1Var14 = new j1("HTTP_1_1_REQUIRED", 13, 13, lw.q1.f40436g);
        HTTP_1_1_REQUIRED = j1Var14;
        $VALUES = new j1[]{j1Var, j1Var2, j1Var3, j1Var4, j1Var5, j1Var6, j1Var7, j1Var8, j1Var9, j1Var10, j1Var11, j1Var12, j1Var13, j1Var14};
        j1[] j1VarArrValues = values();
        j1[] j1VarArr = new j1[j1VarArrValues[j1VarArrValues.length - 1].code + 1];
        for (j1 j1Var15 : j1VarArrValues) {
            j1VarArr[j1Var15.code] = j1Var15;
        }
        codeMap = j1VarArr;
    }

    public j1(String str, int i11, int i12, lw.q1 q1Var) {
        super(str, i11);
        this.code = i12;
        String str2 = "HTTP/2 error code: " + name();
        this.status = q1Var.h(q1Var.f40445b != null ? ep.a.k(defpackage.e.r(str2, " ("), q1Var.f40445b, ")") : str2);
    }

    public static lw.q1 a(long j11) {
        j1[] j1VarArr = codeMap;
        j1 j1Var = (j11 >= ((long) j1VarArr.length) || j11 < 0) ? null : j1VarArr[(int) j11];
        if (j1Var != null) {
            return j1Var.status;
        }
        return lw.q1.d(INTERNAL_ERROR.status.f40444a.c()).h("Unrecognized HTTP/2 error code: " + j11);
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) $VALUES.clone();
    }
}
