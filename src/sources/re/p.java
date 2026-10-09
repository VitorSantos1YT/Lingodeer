package re;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    private static final /* synthetic */ p[] $VALUES;
    public static final p LOGIN_RECOVERABLE;
    public static final p OTHER;
    public static final p TRANSIENT;

    static {
        p pVar = new p("LOGIN_RECOVERABLE", 0);
        LOGIN_RECOVERABLE = pVar;
        p pVar2 = new p("OTHER", 1);
        OTHER = pVar2;
        p pVar3 = new p("TRANSIENT", 2);
        TRANSIENT = pVar3;
        $VALUES = new p[]{pVar, pVar2, pVar3};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
