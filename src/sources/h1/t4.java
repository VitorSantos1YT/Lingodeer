package h1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t4 {
    private static final /* synthetic */ t4[] $VALUES;
    public static final t4 InnerCircle;
    public static final t4 Selector;

    static {
        t4 t4Var = new t4("Selector", 0);
        Selector = t4Var;
        t4 t4Var2 = new t4("InnerCircle", 1);
        InnerCircle = t4Var2;
        $VALUES = new t4[]{t4Var, t4Var2};
    }

    public static t4 valueOf(String str) {
        return (t4) Enum.valueOf(t4.class, str);
    }

    public static t4[] values() {
        return (t4[]) $VALUES.clone();
    }
}
