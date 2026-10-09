package h1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e9 {
    private static final /* synthetic */ e9[] $VALUES;
    public static final e9 ActionPerformed;
    public static final e9 Dismissed;

    static {
        e9 e9Var = new e9("Dismissed", 0);
        Dismissed = e9Var;
        e9 e9Var2 = new e9("ActionPerformed", 1);
        ActionPerformed = e9Var2;
        $VALUES = new e9[]{e9Var, e9Var2};
    }

    public static e9 valueOf(String str) {
        return (e9) Enum.valueOf(e9.class, str);
    }

    public static e9[] values() {
        return (e9[]) $VALUES.clone();
    }
}
