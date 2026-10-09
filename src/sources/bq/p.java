package bq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p StateLocked;
    public static final p StateOpen;
    public static final p StateRedo;

    static {
        p pVar = new p("StateLocked", 0);
        StateLocked = pVar;
        p pVar2 = new p("StateOpen", 1);
        StateOpen = pVar2;
        p pVar3 = new p("StateRedo", 2);
        StateRedo = pVar3;
        p[] pVarArr = {pVar, pVar2, pVar3};
        $VALUES = pVarArr;
        $ENTRIES = ub.a.U(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
