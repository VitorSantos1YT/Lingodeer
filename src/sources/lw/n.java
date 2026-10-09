package lw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n {
    private static final /* synthetic */ n[] $VALUES;
    public static final n CONNECTING;
    public static final n IDLE;
    public static final n READY;
    public static final n SHUTDOWN;
    public static final n TRANSIENT_FAILURE;

    static {
        n nVar = new n("CONNECTING", 0);
        CONNECTING = nVar;
        n nVar2 = new n("READY", 1);
        READY = nVar2;
        n nVar3 = new n("TRANSIENT_FAILURE", 2);
        TRANSIENT_FAILURE = nVar3;
        n nVar4 = new n("IDLE", 3);
        IDLE = nVar4;
        n nVar5 = new n("SHUTDOWN", 4);
        SHUTDOWN = nVar5;
        $VALUES = new n[]{nVar, nVar2, nVar3, nVar4, nVar5};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
