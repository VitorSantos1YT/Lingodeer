package y2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w LookaheadMeasurement;
    public static final w LookaheadPlacement;
    public static final w Measurement;
    public static final w Placement;

    static {
        w wVar = new w("LookaheadMeasurement", 0);
        LookaheadMeasurement = wVar;
        w wVar2 = new w("LookaheadPlacement", 1);
        LookaheadPlacement = wVar2;
        w wVar3 = new w("Measurement", 2);
        Measurement = wVar3;
        w wVar4 = new w("Placement", 3);
        Placement = wVar4;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4};
        $VALUES = wVarArr;
        $ENTRIES = ub.a.U(wVarArr);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}
