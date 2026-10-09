package y2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ e0[] $VALUES;
    public static final e0 Idle;
    public static final e0 LayingOut;
    public static final e0 LookaheadLayingOut;
    public static final e0 LookaheadMeasuring;
    public static final e0 Measuring;

    static {
        e0 e0Var = new e0("Measuring", 0);
        Measuring = e0Var;
        e0 e0Var2 = new e0("LookaheadMeasuring", 1);
        LookaheadMeasuring = e0Var2;
        e0 e0Var3 = new e0("LayingOut", 2);
        LayingOut = e0Var3;
        e0 e0Var4 = new e0("LookaheadLayingOut", 3);
        LookaheadLayingOut = e0Var4;
        e0 e0Var5 = new e0("Idle", 4);
        Idle = e0Var5;
        e0[] e0VarArr = {e0Var, e0Var2, e0Var3, e0Var4, e0Var5};
        $VALUES = e0VarArr;
        $ENTRIES = ub.a.U(e0VarArr);
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }
}
