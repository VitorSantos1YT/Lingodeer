package ch;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n CompleteFinish;
    public static final n None;
    public static final n ShowPrompt;

    static {
        n nVar = new n("ShowPrompt", 0);
        ShowPrompt = nVar;
        n nVar2 = new n("CompleteFinish", 1);
        CompleteFinish = nVar2;
        n nVar3 = new n("None", 2);
        None = nVar3;
        n[] nVarArr = {nVar, nVar2, nVar3};
        $VALUES = nVarArr;
        $ENTRIES = ub.a.U(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
