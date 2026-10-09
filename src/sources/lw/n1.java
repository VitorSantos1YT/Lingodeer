package lw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n1 {
    private static final /* synthetic */ n1[] $VALUES;
    public static final n1 INTEGRITY;
    public static final n1 NONE;
    public static final n1 PRIVACY_AND_INTEGRITY;

    static {
        n1 n1Var = new n1("NONE", 0);
        NONE = n1Var;
        n1 n1Var2 = new n1("INTEGRITY", 1);
        INTEGRITY = n1Var2;
        n1 n1Var3 = new n1("PRIVACY_AND_INTEGRITY", 2);
        PRIVACY_AND_INTEGRITY = n1Var3;
        $VALUES = new n1[]{n1Var, n1Var2, n1Var3};
    }

    public static n1 valueOf(String str) {
        return (n1) Enum.valueOf(n1.class, str);
    }

    public static n1[] values() {
        return (n1[]) $VALUES.clone();
    }
}
