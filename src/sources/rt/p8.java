package rt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p8 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ p8[] $VALUES;
    public static final p8 ALL;
    public static final p8 SHUFFLE_20;
    public static final p8 SHUFFLE_40;
    public static final p8 WEAK_ONLY;

    static {
        p8 p8Var = new p8("ALL", 0);
        ALL = p8Var;
        p8 p8Var2 = new p8("SHUFFLE_20", 1);
        SHUFFLE_20 = p8Var2;
        p8 p8Var3 = new p8("SHUFFLE_40", 2);
        SHUFFLE_40 = p8Var3;
        p8 p8Var4 = new p8("WEAK_ONLY", 3);
        WEAK_ONLY = p8Var4;
        p8[] p8VarArr = {p8Var, p8Var2, p8Var3, p8Var4};
        $VALUES = p8VarArr;
        $ENTRIES = ub.a.U(p8VarArr);
    }

    public static p8 valueOf(String str) {
        return (p8) Enum.valueOf(p8.class, str);
    }

    public static p8[] values() {
        return (p8[]) $VALUES.clone();
    }
}
