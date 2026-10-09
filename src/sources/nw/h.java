package nw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;
    public static final h PLAINTEXT;
    public static final h TLS;

    static {
        h hVar = new h("TLS", 0);
        TLS = hVar;
        h hVar2 = new h("PLAINTEXT", 1);
        PLAINTEXT = hVar2;
        $VALUES = new h[]{hVar, hVar2};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
