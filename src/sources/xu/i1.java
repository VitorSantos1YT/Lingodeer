package xu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i1 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ i1[] $VALUES;
    public static final i1 COURSE_PREFERENCES_RESET;

    static {
        i1 i1Var = new i1("COURSE_PREFERENCES_RESET", 0);
        COURSE_PREFERENCES_RESET = i1Var;
        i1[] i1VarArr = {i1Var};
        $VALUES = i1VarArr;
        $ENTRIES = ub.a.U(i1VarArr);
    }

    public static i1 valueOf(String str) {
        return (i1) Enum.valueOf(i1.class, str);
    }

    public static i1[] values() {
        return (i1[]) $VALUES.clone();
    }
}
