package mw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h2 {
    private static final /* synthetic */ h2[] $VALUES;
    public static final h2 DISCONNECTED;
    public static final h2 IDLE;
    public static final h2 IDLE_AND_PING_SENT;
    public static final h2 PING_DELAYED;
    public static final h2 PING_SCHEDULED;
    public static final h2 PING_SENT;

    static {
        h2 h2Var = new h2("IDLE", 0);
        IDLE = h2Var;
        h2 h2Var2 = new h2("PING_SCHEDULED", 1);
        PING_SCHEDULED = h2Var2;
        h2 h2Var3 = new h2("PING_DELAYED", 2);
        PING_DELAYED = h2Var3;
        h2 h2Var4 = new h2("PING_SENT", 3);
        PING_SENT = h2Var4;
        h2 h2Var5 = new h2("IDLE_AND_PING_SENT", 4);
        IDLE_AND_PING_SENT = h2Var5;
        h2 h2Var6 = new h2("DISCONNECTED", 5);
        DISCONNECTED = h2Var6;
        $VALUES = new h2[]{h2Var, h2Var2, h2Var3, h2Var4, h2Var5, h2Var6};
    }

    public static h2 valueOf(String str) {
        return (h2) Enum.valueOf(h2.class, str);
    }

    public static h2[] values() {
        return (h2[]) $VALUES.clone();
    }
}
