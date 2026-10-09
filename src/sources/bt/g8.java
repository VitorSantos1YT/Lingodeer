package bt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g8 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ g8[] $VALUES;
    public static final g8 Left;
    public static final g8 Right;

    static {
        g8 g8Var = new g8("Left", 0);
        Left = g8Var;
        g8 g8Var2 = new g8("Right", 1);
        Right = g8Var2;
        g8[] g8VarArr = {g8Var, g8Var2};
        $VALUES = g8VarArr;
        $ENTRIES = ub.a.U(g8VarArr);
    }

    public static g8 valueOf(String str) {
        return (g8) Enum.valueOf(g8.class, str);
    }

    public static g8[] values() {
        return (g8[]) $VALUES.clone();
    }
}
