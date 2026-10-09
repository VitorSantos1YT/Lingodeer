package y2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ g0[] $VALUES;
    public static final g0 InLayoutBlock;
    public static final g0 InMeasureBlock;
    public static final g0 NotUsed;

    static {
        g0 g0Var = new g0("InMeasureBlock", 0);
        InMeasureBlock = g0Var;
        g0 g0Var2 = new g0("InLayoutBlock", 1);
        InLayoutBlock = g0Var2;
        g0 g0Var3 = new g0("NotUsed", 2);
        NotUsed = g0Var3;
        g0[] g0VarArr = {g0Var, g0Var2, g0Var3};
        $VALUES = g0VarArr;
        $ENTRIES = ub.a.U(g0VarArr);
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }
}
