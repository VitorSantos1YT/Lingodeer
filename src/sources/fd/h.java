package fd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;
    public static final h MASK_MODE_ADD;
    public static final h MASK_MODE_INTERSECT;
    public static final h MASK_MODE_NONE;
    public static final h MASK_MODE_SUBTRACT;

    static {
        h hVar = new h("MASK_MODE_ADD", 0);
        MASK_MODE_ADD = hVar;
        h hVar2 = new h("MASK_MODE_SUBTRACT", 1);
        MASK_MODE_SUBTRACT = hVar2;
        h hVar3 = new h("MASK_MODE_INTERSECT", 2);
        MASK_MODE_INTERSECT = hVar3;
        h hVar4 = new h("MASK_MODE_NONE", 3);
        MASK_MODE_NONE = hVar4;
        $VALUES = new h[]{hVar, hVar2, hVar3, hVar4};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
