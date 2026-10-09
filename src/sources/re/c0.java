package re;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    private static final /* synthetic */ c0[] $VALUES;
    public static final c0 DELETE;
    public static final c0 GET;
    public static final c0 POST;

    static {
        c0 c0Var = new c0("GET", 0);
        GET = c0Var;
        c0 c0Var2 = new c0("POST", 1);
        POST = c0Var2;
        c0 c0Var3 = new c0("DELETE", 2);
        DELETE = c0Var3;
        $VALUES = new c0[]{c0Var, c0Var2, c0Var3};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) $VALUES.clone();
    }
}
