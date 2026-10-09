package w2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t Max;
    public static final t Min;

    static {
        t tVar = new t("Min", 0);
        Min = tVar;
        t tVar2 = new t("Max", 1);
        Max = tVar2;
        t[] tVarArr = {tVar, tVar2};
        $VALUES = tVarArr;
        $ENTRIES = ub.a.U(tVarArr);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
