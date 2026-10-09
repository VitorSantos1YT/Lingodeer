package fd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x {
    private static final /* synthetic */ x[] $VALUES;
    public static final x INDEX;
    public static final x PERCENT;

    static {
        x xVar = new x("PERCENT", 0);
        PERCENT = xVar;
        x xVar2 = new x("INDEX", 1);
        INDEX = xVar2;
        $VALUES = new x[]{xVar, xVar2};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }
}
