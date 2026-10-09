package w6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d FINISHED;
    public static final d PENDING;
    public static final d RUNNING;

    static {
        d dVar = new d("PENDING", 0);
        PENDING = dVar;
        d dVar2 = new d("RUNNING", 1);
        RUNNING = dVar2;
        d dVar3 = new d("FINISHED", 2);
        FINISHED = dVar3;
        $VALUES = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
