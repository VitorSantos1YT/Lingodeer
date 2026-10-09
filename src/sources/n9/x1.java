package n9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 {
    private static final /* synthetic */ x1[] $VALUES;
    public static final x1 LAUNCH_INITIAL_REFRESH;
    public static final x1 SKIP_INITIAL_REFRESH;

    static {
        x1 x1Var = new x1("LAUNCH_INITIAL_REFRESH", 0);
        LAUNCH_INITIAL_REFRESH = x1Var;
        x1 x1Var2 = new x1("SKIP_INITIAL_REFRESH", 1);
        SKIP_INITIAL_REFRESH = x1Var2;
        $VALUES = new x1[]{x1Var, x1Var2};
    }

    public static x1 valueOf(String str) {
        return (x1) Enum.valueOf(x1.class, str);
    }

    public static x1[] values() {
        return (x1[]) $VALUES.clone();
    }
}
