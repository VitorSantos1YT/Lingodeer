package rt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r4 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ r4[] $VALUES;
    public static final r4 IMMERSION;
    public static final r4 RELAXED;

    static {
        r4 r4Var = new r4("IMMERSION", 0);
        IMMERSION = r4Var;
        r4 r4Var2 = new r4("RELAXED", 1);
        RELAXED = r4Var2;
        r4[] r4VarArr = {r4Var, r4Var2};
        $VALUES = r4VarArr;
        $ENTRIES = ub.a.U(r4VarArr);
    }

    public static yy.a a() {
        return $ENTRIES;
    }

    public static r4 valueOf(String str) {
        return (r4) Enum.valueOf(r4.class, str);
    }

    public static r4[] values() {
        return (r4[]) $VALUES.clone();
    }
}
