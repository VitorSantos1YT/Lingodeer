package d0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ l1[] $VALUES;
    public static final l1 Default;
    public static final l1 PreventUserInput;
    public static final l1 UserInput;

    static {
        l1 l1Var = new l1("Default", 0);
        Default = l1Var;
        l1 l1Var2 = new l1("UserInput", 1);
        UserInput = l1Var2;
        l1 l1Var3 = new l1("PreventUserInput", 2);
        PreventUserInput = l1Var3;
        l1[] l1VarArr = {l1Var, l1Var2, l1Var3};
        $VALUES = l1VarArr;
        $ENTRIES = ub.a.U(l1VarArr);
    }

    public static l1 valueOf(String str) {
        return (l1) Enum.valueOf(l1.class, str);
    }

    public static l1[] values() {
        return (l1[]) $VALUES.clone();
    }
}
