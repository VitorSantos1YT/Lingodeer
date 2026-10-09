package lw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 {
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 CT_ERROR;
    public static final a0 CT_INFO;
    public static final a0 CT_UNKNOWN;
    public static final a0 CT_WARNING;

    static {
        a0 a0Var = new a0("CT_UNKNOWN", 0);
        CT_UNKNOWN = a0Var;
        a0 a0Var2 = new a0("CT_INFO", 1);
        CT_INFO = a0Var2;
        a0 a0Var3 = new a0("CT_WARNING", 2);
        CT_WARNING = a0Var3;
        a0 a0Var4 = new a0("CT_ERROR", 3);
        CT_ERROR = a0Var4;
        $VALUES = new a0[]{a0Var, a0Var2, a0Var3, a0Var4};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }
}
