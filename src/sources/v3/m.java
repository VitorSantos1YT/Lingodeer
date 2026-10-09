package v3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m Ltr;
    public static final m Rtl;

    static {
        m mVar = new m("Ltr", 0);
        Ltr = mVar;
        m mVar2 = new m("Rtl", 1);
        Rtl = mVar2;
        m[] mVarArr = {mVar, mVar2};
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
