package h1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o9 {
    private static final /* synthetic */ o9[] $VALUES;
    public static final o9 EndToStart;
    public static final o9 Settled;
    public static final o9 StartToEnd;

    static {
        o9 o9Var = new o9("StartToEnd", 0);
        StartToEnd = o9Var;
        o9 o9Var2 = new o9("EndToStart", 1);
        EndToStart = o9Var2;
        o9 o9Var3 = new o9("Settled", 2);
        Settled = o9Var3;
        $VALUES = new o9[]{o9Var, o9Var2, o9Var3};
    }

    public static o9 valueOf(String str) {
        return (o9) Enum.valueOf(o9.class, str);
    }

    public static o9[] values() {
        return (o9[]) $VALUES.clone();
    }
}
