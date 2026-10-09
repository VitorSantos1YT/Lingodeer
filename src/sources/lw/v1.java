package lw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v1 {
    private static final /* synthetic */ v1[] $VALUES;
    public static final v1 CUSTOM_MANAGERS;
    public static final v1 FAKE;
    public static final v1 MTLS;

    static {
        v1 v1Var = new v1("FAKE", 0);
        FAKE = v1Var;
        v1 v1Var2 = new v1("MTLS", 1);
        MTLS = v1Var2;
        v1 v1Var3 = new v1("CUSTOM_MANAGERS", 2);
        CUSTOM_MANAGERS = v1Var3;
        $VALUES = new v1[]{v1Var, v1Var2, v1Var3};
    }

    public static v1 valueOf(String str) {
        return (v1) Enum.valueOf(v1.class, str);
    }

    public static v1[] values() {
        return (v1[]) $VALUES.clone();
    }
}
