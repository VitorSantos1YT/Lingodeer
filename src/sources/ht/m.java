package ht;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m CORRECT;
    public static final m CORRECT_AFTER_RETRY;
    public static final m RETRY;
    public static final m WRONG;

    static {
        m mVar = new m("CORRECT", 0);
        CORRECT = mVar;
        m mVar2 = new m("CORRECT_AFTER_RETRY", 1);
        CORRECT_AFTER_RETRY = mVar2;
        m mVar3 = new m("RETRY", 2);
        RETRY = mVar3;
        m mVar4 = new m("WRONG", 3);
        WRONG = mVar4;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4};
        $VALUES = mVarArr;
        $ENTRIES = ub.a.U(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
