package vt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e1 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ e1[] $VALUES;
    public static final e1 BOOKMARK;
    public static final e1 FLUENT;
    public static final e1 ME_USER;
    public static final e1 OLD_USER;
    public static final e1 REVIEW;
    public static final e1 SUB_LEARN;
    public static final e1 UNIT_LESSON;

    static {
        e1 e1Var = new e1("ME_USER", 0);
        ME_USER = e1Var;
        e1 e1Var2 = new e1("REVIEW", 1);
        REVIEW = e1Var2;
        e1 e1Var3 = new e1("BOOKMARK", 2);
        BOOKMARK = e1Var3;
        e1 e1Var4 = new e1("UNIT_LESSON", 3);
        UNIT_LESSON = e1Var4;
        e1 e1Var5 = new e1("SUB_LEARN", 4);
        SUB_LEARN = e1Var5;
        e1 e1Var6 = new e1("FLUENT", 5);
        FLUENT = e1Var6;
        e1 e1Var7 = new e1("OLD_USER", 6);
        OLD_USER = e1Var7;
        e1[] e1VarArr = {e1Var, e1Var2, e1Var3, e1Var4, e1Var5, e1Var6, e1Var7};
        $VALUES = e1VarArr;
        $ENTRIES = ub.a.U(e1VarArr);
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) $VALUES.clone();
    }
}
