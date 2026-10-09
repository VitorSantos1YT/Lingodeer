package s2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;
    public static final x Dispatching;
    public static final x NotDispatching;
    public static final x Unknown;

    static {
        x xVar = new x("Unknown", 0);
        Unknown = xVar;
        x xVar2 = new x("Dispatching", 1);
        Dispatching = xVar2;
        x xVar3 = new x("NotDispatching", 2);
        NotDispatching = xVar3;
        x[] xVarArr = {xVar, xVar2, xVar3};
        $VALUES = xVarArr;
        $ENTRIES = ub.a.U(xVarArr);
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }
}
