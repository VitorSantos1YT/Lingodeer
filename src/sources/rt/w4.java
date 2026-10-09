package rt;

import aj.uZCn.evRpcb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w4 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ w4[] $VALUES;
    public static final w4 MIXED;
    public static final w4 SENTENCES;
    public static final w4 WORDS;

    public static yy.a a() {
        return $ENTRIES;
    }

    public static w4 valueOf(String str) {
        return (w4) Enum.valueOf(w4.class, str);
    }

    public static w4[] values() {
        return (w4[]) $VALUES.clone();
    }

    static {
        w4 w4Var = new w4("SENTENCES", 0);
        SENTENCES = w4Var;
        w4 w4Var2 = new w4(evRpcb.EOswWK, 1);
        WORDS = w4Var2;
        w4 w4Var3 = new w4("MIXED", 2);
        MIXED = w4Var3;
        w4[] w4VarArr = {w4Var, w4Var2, w4Var3};
        $VALUES = w4VarArr;
        $ENTRIES = ub.a.U(w4VarArr);
    }
}
