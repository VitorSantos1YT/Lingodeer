package w9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r AUTOMATIC;
    public static final r TRUNCATE;
    public static final r WRITE_AHEAD_LOGGING;

    static {
        r rVar = new r("AUTOMATIC", 0);
        AUTOMATIC = rVar;
        r rVar2 = new r("TRUNCATE", 1);
        TRUNCATE = rVar2;
        r rVar3 = new r("WRITE_AHEAD_LOGGING", 2);
        WRITE_AHEAD_LOGGING = rVar3;
        r[] rVarArr = {rVar, rVar2, rVar3};
        $VALUES = rVarArr;
        $ENTRIES = ub.a.U(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
