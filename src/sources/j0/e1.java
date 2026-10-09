package j0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ e1[] $VALUES;
    public static final e1 Max;
    public static final e1 Min;

    static {
        e1 e1Var = new e1("Min", 0);
        Min = e1Var;
        e1 e1Var2 = new e1("Max", 1);
        Max = e1Var2;
        e1[] e1VarArr = {e1Var, e1Var2};
        $VALUES = e1VarArr;
        $ENTRIES = ub.a.U(e1VarArr);
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) $VALUES.clone();
    }
}
