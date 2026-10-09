package rt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class of {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ of[] $VALUES;
    public static final of ORIGINAL;
    public static final of REQUEUED;

    static {
        of ofVar = new of("ORIGINAL", 0);
        ORIGINAL = ofVar;
        of ofVar2 = new of("REQUEUED", 1);
        REQUEUED = ofVar2;
        of[] ofVarArr = {ofVar, ofVar2};
        $VALUES = ofVarArr;
        $ENTRIES = ub.a.U(ofVarArr);
    }

    public static of valueOf(String str) {
        return (of) Enum.valueOf(of.class, str);
    }

    public static of[] values() {
        return (of[]) $VALUES.clone();
    }
}
