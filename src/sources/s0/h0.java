package s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ h0[] $VALUES;
    public static final h0 Cursor;
    public static final h0 None;
    public static final h0 Selection;

    static {
        h0 h0Var = new h0("None", 0);
        None = h0Var;
        h0 h0Var2 = new h0("Selection", 1);
        Selection = h0Var2;
        h0 h0Var3 = new h0("Cursor", 2);
        Cursor = h0Var3;
        h0[] h0VarArr = {h0Var, h0Var2, h0Var3};
        $VALUES = h0VarArr;
        $ENTRIES = ub.a.U(h0VarArr);
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }
}
