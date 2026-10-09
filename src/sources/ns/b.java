package ns;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@c00.e
public final class b {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    private static final qy.h $cachedSerializer$delegate;
    public static final a Companion;
    public static final b MULTIPLE;
    public static final b ONE;
    public static final b ZERO;

    static {
        b bVar = new b("ZERO", 0);
        ZERO = bVar;
        b bVar2 = new b("ONE", 1);
        ONE = bVar2;
        b bVar3 = new b("MULTIPLE", 2);
        MULTIPLE = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = ub.a.U(bVarArr);
        Companion = new a();
        $cachedSerializer$delegate = com.bumptech.glide.d.u(qy.j.PUBLICATION, new ju.d(28));
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
