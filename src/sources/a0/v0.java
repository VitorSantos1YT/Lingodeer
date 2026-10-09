package a0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ v0[] $VALUES;
    public static final v0 PostExit;
    public static final v0 PreEnter;
    public static final v0 Visible;

    static {
        v0 v0Var = new v0("PreEnter", 0);
        PreEnter = v0Var;
        v0 v0Var2 = new v0("Visible", 1);
        Visible = v0Var2;
        v0 v0Var3 = new v0("PostExit", 2);
        PostExit = v0Var3;
        v0[] v0VarArr = {v0Var, v0Var2, v0Var3};
        $VALUES = v0VarArr;
        $ENTRIES = ub.a.U(v0VarArr);
    }

    public static v0 valueOf(String str) {
        return (v0) Enum.valueOf(v0.class, str);
    }

    public static v0[] values() {
        return (v0[]) $VALUES.clone();
    }
}
