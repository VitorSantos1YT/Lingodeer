package g2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ o0[] $VALUES;
    public static final o0 Clockwise;
    public static final o0 CounterClockwise;

    static {
        o0 o0Var = new o0("CounterClockwise", 0);
        CounterClockwise = o0Var;
        o0 o0Var2 = new o0("Clockwise", 1);
        Clockwise = o0Var2;
        o0[] o0VarArr = {o0Var, o0Var2};
        $VALUES = o0VarArr;
        $ENTRIES = ub.a.U(o0VarArr);
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) $VALUES.clone();
    }
}
