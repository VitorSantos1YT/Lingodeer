package b0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ u0[] $VALUES;
    public static final u0 Restart;
    public static final u0 Reverse;

    static {
        u0 u0Var = new u0("Restart", 0);
        Restart = u0Var;
        u0 u0Var2 = new u0("Reverse", 1);
        Reverse = u0Var2;
        u0[] u0VarArr = {u0Var, u0Var2};
        $VALUES = u0VarArr;
        $ENTRIES = ub.a.U(u0VarArr);
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) $VALUES.clone();
    }
}
