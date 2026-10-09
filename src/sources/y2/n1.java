package y2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ n1[] $VALUES;
    public static final n1 Height;
    public static final n1 Width;

    static {
        n1 n1Var = new n1("Width", 0);
        Width = n1Var;
        n1 n1Var2 = new n1("Height", 1);
        Height = n1Var2;
        n1[] n1VarArr = {n1Var, n1Var2};
        $VALUES = n1VarArr;
        $ENTRIES = ub.a.U(n1VarArr);
    }

    public static n1 valueOf(String str) {
        return (n1) Enum.valueOf(n1.class, str);
    }

    public static n1[] values() {
        return (n1[]) $VALUES.clone();
    }
}
