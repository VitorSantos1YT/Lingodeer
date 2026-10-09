package se;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    private static final /* synthetic */ l[] $VALUES;
    public static final l AUTO;
    public static final l EXPLICIT_ONLY;

    static {
        l lVar = new l("AUTO", 0);
        AUTO = lVar;
        l lVar2 = new l("EXPLICIT_ONLY", 1);
        EXPLICIT_ONLY = lVar2;
        $VALUES = new l[]{lVar, lVar2};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
