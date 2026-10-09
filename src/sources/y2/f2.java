package y2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ f2[] $VALUES;
    public static final f2 CancelTraversal;
    public static final f2 ContinueTraversal;
    public static final f2 SkipSubtreeAndContinueTraversal;

    static {
        f2 f2Var = new f2("ContinueTraversal", 0);
        ContinueTraversal = f2Var;
        f2 f2Var2 = new f2("SkipSubtreeAndContinueTraversal", 1);
        SkipSubtreeAndContinueTraversal = f2Var2;
        f2 f2Var3 = new f2("CancelTraversal", 2);
        CancelTraversal = f2Var3;
        f2[] f2VarArr = {f2Var, f2Var2, f2Var3};
        $VALUES = f2VarArr;
        $ENTRIES = ub.a.U(f2VarArr);
    }

    public static f2 valueOf(String str) {
        return (f2) Enum.valueOf(f2.class, str);
    }

    public static f2[] values() {
        return (f2[]) $VALUES.clone();
    }
}
