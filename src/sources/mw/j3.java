package mw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j3 {
    private static final /* synthetic */ j3[] $VALUES;
    public static final j3 BODY;
    public static final j3 HEADER;

    static {
        j3 j3Var = new j3("HEADER", 0);
        HEADER = j3Var;
        j3 j3Var2 = new j3("BODY", 1);
        BODY = j3Var2;
        $VALUES = new j3[]{j3Var, j3Var2};
    }

    public static j3 valueOf(String str) {
        return (j3) Enum.valueOf(j3.class, str);
    }

    public static j3[] values() {
        return (j3[]) $VALUES.clone();
    }
}
