package j0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ b0[] $VALUES;
    public static final b0 Both;
    public static final b0 Horizontal;
    public static final b0 Vertical;

    static {
        b0 b0Var = new b0("Vertical", 0);
        Vertical = b0Var;
        b0 b0Var2 = new b0("Horizontal", 1);
        Horizontal = b0Var2;
        b0 b0Var3 = new b0("Both", 2);
        Both = b0Var3;
        b0[] b0VarArr = {b0Var, b0Var2, b0Var3};
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
