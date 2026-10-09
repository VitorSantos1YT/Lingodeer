package s2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m Final;
    public static final m Initial;
    public static final m Main;

    static {
        m mVar = new m("Initial", 0);
        Initial = mVar;
        m mVar2 = new m("Main", 1);
        Main = mVar2;
        m mVar3 = new m("Final", 2);
        Final = mVar3;
        m[] mVarArr = {mVar, mVar2, mVar3};
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
