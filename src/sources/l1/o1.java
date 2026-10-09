package l1;

import zp.sBa.anrPHlQ;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ o1[] $VALUES;
    public static final o1 Applied;
    public static final o1 ApplyPending;
    public static final o1 Cancelled;
    public static final o1 InitialPending;
    public static final o1 Invalid;
    public static final o1 RecomposePending;
    public static final o1 Recomposing;

    public static o1 valueOf(String str) {
        return (o1) Enum.valueOf(o1.class, str);
    }

    public static o1[] values() {
        return (o1[]) $VALUES.clone();
    }

    static {
        o1 o1Var = new o1("Invalid", 0);
        Invalid = o1Var;
        o1 o1Var2 = new o1("Cancelled", 1);
        Cancelled = o1Var2;
        o1 o1Var3 = new o1("InitialPending", 2);
        InitialPending = o1Var3;
        o1 o1Var4 = new o1("RecomposePending", 3);
        RecomposePending = o1Var4;
        o1 o1Var5 = new o1("Recomposing", 4);
        Recomposing = o1Var5;
        o1 o1Var6 = new o1("ApplyPending", 5);
        ApplyPending = o1Var6;
        o1 o1Var7 = new o1(anrPHlQ.WnidqMvK, 6);
        Applied = o1Var7;
        o1[] o1VarArr = {o1Var, o1Var2, o1Var3, o1Var4, o1Var5, o1Var6, o1Var7};
        $VALUES = o1VarArr;
        $ENTRIES = ub.a.U(o1VarArr);
    }
}
