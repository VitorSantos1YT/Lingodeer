package z2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ k2[] $VALUES;
    public static final k2 Hidden;
    public static final k2 Shown;

    static {
        k2 k2Var = new k2("Shown", 0);
        Shown = k2Var;
        k2 k2Var2 = new k2("Hidden", 1);
        Hidden = k2Var2;
        k2[] k2VarArr = {k2Var, k2Var2};
        $VALUES = k2VarArr;
        $ENTRIES = ub.a.U(k2VarArr);
    }

    public static k2 valueOf(String str) {
        return (k2) Enum.valueOf(k2.class, str);
    }

    public static k2[] values() {
        return (k2[]) $VALUES.clone();
    }
}
