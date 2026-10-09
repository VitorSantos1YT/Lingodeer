package rt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 rt.r8[], still in use, count: 1, list:
  (r0v1 rt.r8[]) from 0x0038: INVOKE (r0v1 rt.r8[]) STATIC call: ub.a.U(java.lang.Enum[]):yy.b A[MD:(java.lang.Enum[]):yy.b (m), WRAPPED] (LINE:57)
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
/* JADX INFO: loaded from: classes4.dex */
public final class r8 {
    COMPREHENSIVE(0),
    LISTENING(1),
    SPEAKING(2),
    SPELLING(3),
    WORD_MATCH(4);

    private static final /* synthetic */ yy.a $ENTRIES;
    public static final q8 Companion = new q8();
    private final int value;

    static {
        $ENTRIES = ub.a.U(new r8[]{r0, r1, r2, r3, r4});
    }

    public r8(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static yy.a a() {
        return $ENTRIES;
    }

    public static r8 valueOf(String str) {
        return (r8) Enum.valueOf(r8.class, str);
    }

    public static r8[] values() {
        return (r8[]) $VALUES.clone();
    }

    public final int b() {
        return this.value;
    }
}
