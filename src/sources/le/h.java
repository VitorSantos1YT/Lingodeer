package le;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;
    public static final h CLEARED;
    public static final h COMPLETE;
    public static final h FAILED;
    public static final h PENDING;
    public static final h RUNNING;
    public static final h WAITING_FOR_SIZE;

    static {
        h hVar = new h("PENDING", 0);
        PENDING = hVar;
        h hVar2 = new h("RUNNING", 1);
        RUNNING = hVar2;
        h hVar3 = new h("WAITING_FOR_SIZE", 2);
        WAITING_FOR_SIZE = hVar3;
        h hVar4 = new h("COMPLETE", 3);
        COMPLETE = hVar4;
        h hVar5 = new h("FAILED", 4);
        FAILED = hVar5;
        h hVar6 = new h("CLEARED", 5);
        CLEARED = hVar6;
        $VALUES = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
