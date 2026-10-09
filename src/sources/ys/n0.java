package ys;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ n0[] $VALUES;
    public static final n0 ACCURACY;
    public static final n0 TIME;
    public static final n0 XP;

    static {
        n0 n0Var = new n0("XP", 0);
        XP = n0Var;
        n0 n0Var2 = new n0("ACCURACY", 1);
        ACCURACY = n0Var2;
        n0 n0Var3 = new n0("TIME", 2);
        TIME = n0Var3;
        n0[] n0VarArr = {n0Var, n0Var2, n0Var3};
        $VALUES = n0VarArr;
        $ENTRIES = ub.a.U(n0VarArr);
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }
}
