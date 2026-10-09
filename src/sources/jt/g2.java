package jt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g2 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ g2[] $VALUES;
    public static final g2 LEFT;
    public static final g2 NONE;
    public static final g2 RIGHT;

    static {
        g2 g2Var = new g2("LEFT", 0);
        LEFT = g2Var;
        g2 g2Var2 = new g2("RIGHT", 1);
        RIGHT = g2Var2;
        g2 g2Var3 = new g2("NONE", 2);
        NONE = g2Var3;
        g2[] g2VarArr = {g2Var, g2Var2, g2Var3};
        $VALUES = g2VarArr;
        $ENTRIES = ub.a.U(g2VarArr);
    }

    public static g2 valueOf(String str) {
        return (g2) Enum.valueOf(g2.class, str);
    }

    public static g2[] values() {
        return (g2[]) $VALUES.clone();
    }
}
