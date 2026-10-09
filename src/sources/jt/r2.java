package jt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r2 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ r2[] $VALUES;
    public static final r2 SHENG_MU;
    public static final r2 TONE;
    public static final r2 UNKNOWN;
    public static final r2 YU_MU;

    static {
        r2 r2Var = new r2("SHENG_MU", 0);
        SHENG_MU = r2Var;
        r2 r2Var2 = new r2("YU_MU", 1);
        YU_MU = r2Var2;
        r2 r2Var3 = new r2("TONE", 2);
        TONE = r2Var3;
        r2 r2Var4 = new r2("UNKNOWN", 3);
        UNKNOWN = r2Var4;
        r2[] r2VarArr = {r2Var, r2Var2, r2Var3, r2Var4};
        $VALUES = r2VarArr;
        $ENTRIES = ub.a.U(r2VarArr);
    }

    public static r2 valueOf(String str) {
        return (r2) Enum.valueOf(r2.class, str);
    }

    public static r2[] values() {
        return (r2[]) $VALUES.clone();
    }
}
