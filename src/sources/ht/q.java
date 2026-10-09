package ht;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q CHECKING;
    public static final q CORRECT;
    public static final q DEFAULT;
    public static final q REVISING;
    public static final q SELECTED;
    public static final q WRONG;

    static {
        q qVar = new q("DEFAULT", 0);
        DEFAULT = qVar;
        q qVar2 = new q("SELECTED", 1);
        SELECTED = qVar2;
        q qVar3 = new q("CHECKING", 2);
        CHECKING = qVar3;
        q qVar4 = new q("REVISING", 3);
        REVISING = qVar4;
        q qVar5 = new q("CORRECT", 4);
        CORRECT = qVar5;
        q qVar6 = new q("WRONG", 5);
        WRONG = qVar6;
        q[] qVarArr = {qVar, qVar2, qVar3, qVar4, qVar5, qVar6};
        $VALUES = qVarArr;
        $ENTRIES = ub.a.U(qVarArr);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
