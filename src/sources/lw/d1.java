package lw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d1 {
    private static final /* synthetic */ d1[] $VALUES;
    public static final d1 BIDI_STREAMING;
    public static final d1 CLIENT_STREAMING;
    public static final d1 SERVER_STREAMING;
    public static final d1 UNARY;
    public static final d1 UNKNOWN;

    static {
        d1 d1Var = new d1("UNARY", 0);
        UNARY = d1Var;
        d1 d1Var2 = new d1("CLIENT_STREAMING", 1);
        CLIENT_STREAMING = d1Var2;
        d1 d1Var3 = new d1("SERVER_STREAMING", 2);
        SERVER_STREAMING = d1Var3;
        d1 d1Var4 = new d1("BIDI_STREAMING", 3);
        BIDI_STREAMING = d1Var4;
        d1 d1Var5 = new d1("UNKNOWN", 4);
        UNKNOWN = d1Var5;
        $VALUES = new d1[]{d1Var, d1Var2, d1Var3, d1Var4, d1Var5};
    }

    public static d1 valueOf(String str) {
        return (d1) Enum.valueOf(d1.class, str);
    }

    public static d1[] values() {
        return (d1[]) $VALUES.clone();
    }
}
