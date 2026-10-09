package mh;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 mh.b[], still in use, count: 1, list:
  (r0v1 mh.b[]) from 0x005b: INVOKE (r0v1 mh.b[]) STATIC call: ub.a.U(java.lang.Enum[]):yy.b A[MD:(java.lang.Enum[]):yy.b (m), WRAPPED] (LINE:92)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    BEGINNER_I("DF1", 0, 1),
    BEGINNER_II("DF2", 1, 2),
    INTERMEDIATE_I("DF3", 2, 3),
    INTERMEDIATE_II("DF4", 3, 4);

    private static final /* synthetic */ yy.a $ENTRIES;
    public static final a Companion = new a();
    private final long color;
    private final String displayName;
    private final int order;

    static {
        $ENTRIES = ub.a.U(new b[]{r0, r1, r2, r3});
    }

    public b(String str, int i11, int i12) {
        super(str, i11);
        this.displayName = str;
        this.color = j;
        this.order = i12;
    }

    public static yy.a c() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final long a() {
        return this.color;
    }

    public final String b() {
        return this.displayName;
    }

    public final int e() {
        return this.order;
    }
}
