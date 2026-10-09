package wt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t DAY;
    public static final t HOUR;
    public static final t MIN;
    public static final t MONTH;
    public static final t YEAR;

    static {
        t tVar = new t("MIN", 0);
        MIN = tVar;
        t tVar2 = new t("HOUR", 1);
        HOUR = tVar2;
        t tVar3 = new t("DAY", 2);
        DAY = tVar3;
        t tVar4 = new t("MONTH", 3);
        MONTH = tVar4;
        t tVar5 = new t("YEAR", 4);
        YEAR = tVar5;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4, tVar5};
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
