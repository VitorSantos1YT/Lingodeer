package fb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    private static final /* synthetic */ w[] $VALUES;
    public static final w CONNECTED;
    public static final w METERED;
    public static final w NOT_REQUIRED;
    public static final w NOT_ROAMING;
    public static final w TEMPORARILY_UNMETERED;
    public static final w UNMETERED;

    static {
        w wVar = new w("NOT_REQUIRED", 0);
        NOT_REQUIRED = wVar;
        w wVar2 = new w("CONNECTED", 1);
        CONNECTED = wVar2;
        w wVar3 = new w("UNMETERED", 2);
        UNMETERED = wVar3;
        w wVar4 = new w("NOT_ROAMING", 3);
        NOT_ROAMING = wVar4;
        w wVar5 = new w("METERED", 4);
        METERED = wVar5;
        w wVar6 = new w("TEMPORARILY_UNMETERED", 5);
        TEMPORARILY_UNMETERED = wVar6;
        $VALUES = new w[]{wVar, wVar2, wVar3, wVar4, wVar5, wVar6};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}
