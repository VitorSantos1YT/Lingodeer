package f0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ h1[] $VALUES;
    public static final h1 Horizontal;
    public static final h1 Vertical;

    static {
        h1 h1Var = new h1("Vertical", 0);
        Vertical = h1Var;
        h1 h1Var2 = new h1("Horizontal", 1);
        Horizontal = h1Var2;
        h1[] h1VarArr = {h1Var, h1Var2};
        $VALUES = h1VarArr;
        $ENTRIES = ub.a.U(h1VarArr);
    }

    public static h1 valueOf(String str) {
        return (h1) Enum.valueOf(h1.class, str);
    }

    public static h1[] values() {
        return (h1[]) $VALUES.clone();
    }
}
