package tg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ b0[] $VALUES;
    public static final b0 Danger;
    public static final b0 Primary;
    public static final b0 Secondary;
    public static final b0 Success;
    public static final b0 Warning;

    static {
        b0 b0Var = new b0("Primary", 0);
        Primary = b0Var;
        b0 b0Var2 = new b0("Secondary", 1);
        Secondary = b0Var2;
        b0 b0Var3 = new b0("Success", 2);
        Success = b0Var3;
        b0 b0Var4 = new b0("Danger", 3);
        Danger = b0Var4;
        b0 b0Var5 = new b0("Warning", 4);
        Warning = b0Var5;
        b0[] b0VarArr = {b0Var, b0Var2, b0Var3, b0Var4, b0Var5};
        $VALUES = b0VarArr;
        $ENTRIES = ub.a.U(b0VarArr);
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }
}
