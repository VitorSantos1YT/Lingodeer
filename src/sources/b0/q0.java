package b0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ q0[] $VALUES;
    public static final q0 Default;
    public static final q0 PreventUserInput;
    public static final q0 UserInput;

    static {
        q0 q0Var = new q0("Default", 0);
        Default = q0Var;
        q0 q0Var2 = new q0("UserInput", 1);
        UserInput = q0Var2;
        q0 q0Var3 = new q0("PreventUserInput", 2);
        PreventUserInput = q0Var3;
        q0[] q0VarArr = {q0Var, q0Var2, q0Var3};
        $VALUES = q0VarArr;
        $ENTRIES = ub.a.U(q0VarArr);
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) $VALUES.clone();
    }
}
