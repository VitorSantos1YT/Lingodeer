package h1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q8 {
    private static final /* synthetic */ q8[] $VALUES;
    public static final q8 Indefinite;
    public static final q8 Long;
    public static final q8 Short;

    static {
        q8 q8Var = new q8("Short", 0);
        Short = q8Var;
        q8 q8Var2 = new q8("Long", 1);
        Long = q8Var2;
        q8 q8Var3 = new q8("Indefinite", 2);
        Indefinite = q8Var3;
        $VALUES = new q8[]{q8Var, q8Var2, q8Var3};
    }

    public static q8 valueOf(String str) {
        return (q8) Enum.valueOf(q8.class, str);
    }

    public static q8[] values() {
        return (q8[]) $VALUES.clone();
    }
}
