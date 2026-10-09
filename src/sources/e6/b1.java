package e6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {
    private static final /* synthetic */ b1[] $VALUES;
    public static final b1 Expand;
    public static final b1 Fixed;
    public static final b1 MatchParent;
    public static final b1 Wrap;

    static {
        b1 b1Var = new b1("Wrap", 0);
        Wrap = b1Var;
        b1 b1Var2 = new b1("Fixed", 1);
        Fixed = b1Var2;
        b1 b1Var3 = new b1("Expand", 2);
        Expand = b1Var3;
        b1 b1Var4 = new b1("MatchParent", 3);
        MatchParent = b1Var4;
        $VALUES = new b1[]{b1Var, b1Var2, b1Var3, b1Var4};
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) $VALUES.clone();
    }
}
