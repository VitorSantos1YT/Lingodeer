package se;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    private static final /* synthetic */ r[] $VALUES;
    public static final r NO_CONNECTIVITY;
    public static final r SERVER_ERROR;
    public static final r SUCCESS;
    public static final r UNKNOWN_ERROR;

    static {
        r rVar = new r("SUCCESS", 0);
        SUCCESS = rVar;
        r rVar2 = new r("SERVER_ERROR", 1);
        SERVER_ERROR = rVar2;
        r rVar3 = new r("NO_CONNECTIVITY", 2);
        NO_CONNECTIVITY = rVar3;
        r rVar4 = new r("UNKNOWN_ERROR", 3);
        UNKNOWN_ERROR = rVar4;
        $VALUES = new r[]{rVar, rVar2, rVar3, rVar4};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
