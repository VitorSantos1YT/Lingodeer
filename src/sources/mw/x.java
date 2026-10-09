package mw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x {
    private static final /* synthetic */ x[] $VALUES;
    public static final x DROPPED;
    public static final x MISCARRIED;
    public static final x PROCESSED;
    public static final x REFUSED;

    static {
        x xVar = new x("PROCESSED", 0);
        PROCESSED = xVar;
        x xVar2 = new x("REFUSED", 1);
        REFUSED = xVar2;
        x xVar3 = new x("DROPPED", 2);
        DROPPED = xVar3;
        x xVar4 = new x("MISCARRIED", 3);
        MISCARRIED = xVar4;
        $VALUES = new x[]{xVar, xVar2, xVar3, xVar4};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }
}
