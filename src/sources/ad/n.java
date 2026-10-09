package ad;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n Immediately;
    public static final n OnIterationFinish;

    static {
        n nVar = new n("Immediately", 0);
        Immediately = nVar;
        n nVar2 = new n("OnIterationFinish", 1);
        OnIterationFinish = nVar2;
        n[] nVarArr = {nVar, nVar2};
        $VALUES = nVarArr;
        $ENTRIES = ub.a.U(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
