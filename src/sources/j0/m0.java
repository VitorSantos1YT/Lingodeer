package j0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ m0[] $VALUES;
    public static final m0 Clip;
    public static final m0 ExpandIndicator;
    public static final m0 ExpandOrCollapseIndicator;
    public static final m0 Visible;

    static {
        m0 m0Var = new m0("Visible", 0);
        Visible = m0Var;
        m0 m0Var2 = new m0("Clip", 1);
        Clip = m0Var2;
        m0 m0Var3 = new m0("ExpandIndicator", 2);
        ExpandIndicator = m0Var3;
        m0 m0Var4 = new m0("ExpandOrCollapseIndicator", 3);
        ExpandOrCollapseIndicator = m0Var4;
        m0[] m0VarArr = {m0Var, m0Var2, m0Var3, m0Var4};
        $VALUES = m0VarArr;
        $ENTRIES = ub.a.U(m0VarArr);
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) $VALUES.clone();
    }
}
