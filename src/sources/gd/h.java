package gd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;
    public static final h ADD;
    public static final h INVERT;
    public static final h LUMA;
    public static final h LUMA_INVERTED;
    public static final h NONE;
    public static final h UNKNOWN;

    static {
        h hVar = new h("NONE", 0);
        NONE = hVar;
        h hVar2 = new h("ADD", 1);
        ADD = hVar2;
        h hVar3 = new h("INVERT", 2);
        INVERT = hVar3;
        h hVar4 = new h("LUMA", 3);
        LUMA = hVar4;
        h hVar5 = new h("LUMA_INVERTED", 4);
        LUMA_INVERTED = hVar5;
        h hVar6 = new h("UNKNOWN", 5);
        UNKNOWN = hVar6;
        $VALUES = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
