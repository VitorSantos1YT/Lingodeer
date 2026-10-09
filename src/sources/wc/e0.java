package wc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    private static final /* synthetic */ e0[] $VALUES;
    public static final e0 AUTOMATIC;
    public static final e0 HARDWARE;
    public static final e0 SOFTWARE;

    static {
        e0 e0Var = new e0("AUTOMATIC", 0);
        AUTOMATIC = e0Var;
        e0 e0Var2 = new e0("HARDWARE", 1);
        HARDWARE = e0Var2;
        e0 e0Var3 = new e0("SOFTWARE", 2);
        SOFTWARE = e0Var3;
        $VALUES = new e0[]{e0Var, e0Var2, e0Var3};
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }
}
