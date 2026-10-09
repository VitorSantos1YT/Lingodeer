package rt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s4 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ s4[] $VALUES;
    public static final s4 IN_ORDER;
    public static final s4 SHUFFLE;

    static {
        s4 s4Var = new s4("IN_ORDER", 0);
        IN_ORDER = s4Var;
        s4 s4Var2 = new s4("SHUFFLE", 1);
        SHUFFLE = s4Var2;
        s4[] s4VarArr = {s4Var, s4Var2};
        $VALUES = s4VarArr;
        $ENTRIES = ub.a.U(s4VarArr);
    }

    public static yy.a a() {
        return $ENTRIES;
    }

    public static s4 valueOf(String str) {
        return (s4) Enum.valueOf(s4.class, str);
    }

    public static s4[] values() {
        return (s4[]) $VALUES.clone();
    }
}
