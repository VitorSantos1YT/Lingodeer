package lf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    private static final /* synthetic */ g0[] $VALUES;
    public static final g0 ERROR;
    public static final g0 LOADING;
    public static final g0 NOT_LOADED;
    public static final g0 SUCCESS;

    static {
        g0 g0Var = new g0("NOT_LOADED", 0);
        NOT_LOADED = g0Var;
        g0 g0Var2 = new g0("LOADING", 1);
        LOADING = g0Var2;
        g0 g0Var3 = new g0("SUCCESS", 2);
        SUCCESS = g0Var3;
        g0 g0Var4 = new g0("ERROR", 3);
        ERROR = g0Var4;
        $VALUES = new g0[]{g0Var, g0Var2, g0Var3, g0Var4};
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }
}
