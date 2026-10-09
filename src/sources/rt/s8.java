package rt;

import mf.sOm.txBUGYhC;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s8 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ s8[] $VALUES;
    public static final s8 PRACTICE_MODEL;
    public static final s8 SELECTION;

    public static s8 valueOf(String str) {
        return (s8) Enum.valueOf(s8.class, str);
    }

    public static s8[] values() {
        return (s8[]) $VALUES.clone();
    }

    static {
        s8 s8Var = new s8("SELECTION", 0);
        SELECTION = s8Var;
        s8 s8Var2 = new s8(txBUGYhC.oSaafRiJRr, 1);
        PRACTICE_MODEL = s8Var2;
        s8[] s8VarArr = {s8Var, s8Var2};
        $VALUES = s8VarArr;
        $ENTRIES = ub.a.U(s8VarArr);
    }
}
