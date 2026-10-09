package y2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ m1[] $VALUES;
    public static final m1 Max;
    public static final m1 Min;

    static {
        m1 m1Var = new m1("Min", 0);
        Min = m1Var;
        m1 m1Var2 = new m1("Max", 1);
        Max = m1Var2;
        m1[] m1VarArr = {m1Var, m1Var2};
        $VALUES = m1VarArr;
        $ENTRIES = ub.a.U(m1VarArr);
    }

    public static m1 valueOf(String str) {
        return (m1) Enum.valueOf(m1.class, str);
    }

    public static m1[] values() {
        return (m1[]) $VALUES.clone();
    }
}
