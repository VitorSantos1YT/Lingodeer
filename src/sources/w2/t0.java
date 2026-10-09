package w2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ t0[] $VALUES;
    public static final t0 Max;
    public static final t0 Min;

    static {
        t0 t0Var = new t0("Min", 0);
        Min = t0Var;
        t0 t0Var2 = new t0("Max", 1);
        Max = t0Var2;
        t0[] t0VarArr = {t0Var, t0Var2};
        $VALUES = t0VarArr;
        $ENTRIES = ub.a.U(t0VarArr);
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) $VALUES.clone();
    }
}
