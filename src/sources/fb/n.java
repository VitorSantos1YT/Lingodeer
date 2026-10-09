package fb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    private static final /* synthetic */ n[] $VALUES;
    public static final n APPEND;
    public static final n APPEND_OR_REPLACE;
    public static final n KEEP;
    public static final n REPLACE;

    static {
        n nVar = new n("REPLACE", 0);
        REPLACE = nVar;
        n nVar2 = new n("KEEP", 1);
        KEEP = nVar2;
        n nVar3 = new n("APPEND", 2);
        APPEND = nVar3;
        n nVar4 = new n("APPEND_OR_REPLACE", 3);
        APPEND_OR_REPLACE = nVar4;
        $VALUES = new n[]{nVar, nVar2, nVar3, nVar4};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
