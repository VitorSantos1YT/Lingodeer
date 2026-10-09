package km;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r OnSurface;
    public static final r OnSurfaceVariant;
    public static final r Primary;
    public static final r PrimaryContainer;
    public static final r SrsNew;
    public static final r Surface;

    static {
        r rVar = new r("OnSurface", 0);
        OnSurface = rVar;
        r rVar2 = new r("OnSurfaceVariant", 1);
        OnSurfaceVariant = rVar2;
        r rVar3 = new r("Surface", 2);
        Surface = rVar3;
        r rVar4 = new r("Primary", 3);
        Primary = rVar4;
        r rVar5 = new r("PrimaryContainer", 4);
        PrimaryContainer = rVar5;
        r rVar6 = new r("SrsNew", 5);
        SrsNew = rVar6;
        r[] rVarArr = {rVar, rVar2, rVar3, rVar4, rVar5, rVar6};
        $VALUES = rVarArr;
        $ENTRIES = ub.a.U(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
