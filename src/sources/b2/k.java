package b2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k VIEW_APPEAR;
    public static final k VIEW_DISAPPEAR;

    static {
        k kVar = new k("VIEW_APPEAR", 0);
        VIEW_APPEAR = kVar;
        k kVar2 = new k("VIEW_DISAPPEAR", 1);
        VIEW_DISAPPEAR = kVar2;
        k[] kVarArr = {kVar, kVar2};
        $VALUES = kVarArr;
        $ENTRIES = ub.a.U(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
