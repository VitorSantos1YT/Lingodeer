package yg;

import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p ANNUALLY;
    public static final p LIFETIME;
    public static final p MONTHLY;
    public static final p SIX_MONTHS;

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }

    static {
        p pVar = new p("ANNUALLY", 0);
        ANNUALLY = pVar;
        p pVar2 = new p("SIX_MONTHS", 1);
        SIX_MONTHS = pVar2;
        p pVar3 = new p("MONTHLY", 2);
        MONTHLY = pVar3;
        p pVar4 = new p(bjXGJ.ObpQBDhFDkVCHVO, 3);
        LIFETIME = pVar4;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4};
        $VALUES = pVarArr;
        $ENTRIES = ub.a.U(pVarArr);
    }
}
