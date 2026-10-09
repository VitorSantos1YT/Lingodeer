package jt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l2 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ l2[] $VALUES;
    public static final l2 EXTRA;
    public static final l2 MATCH;
    public static final l2 MISSING;
    public static final l2 REPLACE;

    static {
        l2 l2Var = new l2("MATCH", 0);
        MATCH = l2Var;
        l2 l2Var2 = new l2("EXTRA", 1);
        EXTRA = l2Var2;
        l2 l2Var3 = new l2("MISSING", 2);
        MISSING = l2Var3;
        l2 l2Var4 = new l2("REPLACE", 3);
        REPLACE = l2Var4;
        l2[] l2VarArr = {l2Var, l2Var2, l2Var3, l2Var4};
        $VALUES = l2VarArr;
        $ENTRIES = ub.a.U(l2VarArr);
    }

    public static l2 valueOf(String str) {
        return (l2) Enum.valueOf(l2.class, str);
    }

    public static l2[] values() {
        return (l2[]) $VALUES.clone();
    }
}
