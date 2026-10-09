package ns;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@c00.e
public final class q {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    private static final qy.h $cachedSerializer$delegate;
    public static final q CORRECT;
    public static final p Companion;
    public static final q RETRY;
    public static final q WRONG;

    static {
        q qVar = new q("CORRECT", 0);
        CORRECT = qVar;
        q qVar2 = new q("RETRY", 1);
        RETRY = qVar2;
        q qVar3 = new q("WRONG", 2);
        WRONG = qVar3;
        q[] qVarArr = {qVar, qVar2, qVar3};
        $VALUES = qVarArr;
        $ENTRIES = ub.a.U(qVarArr);
        Companion = new p();
        $cachedSerializer$delegate = com.bumptech.glide.d.u(qy.j.PUBLICATION, new d(2));
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
