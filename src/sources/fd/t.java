package fd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    private static final /* synthetic */ t[] $VALUES;
    public static final t BUTT;
    public static final t ROUND;
    public static final t UNKNOWN;

    static {
        t tVar = new t("BUTT", 0);
        BUTT = tVar;
        t tVar2 = new t("ROUND", 1);
        ROUND = tVar2;
        t tVar3 = new t("UNKNOWN", 2);
        UNKNOWN = tVar3;
        $VALUES = new t[]{tVar, tVar2, tVar3};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
