package qt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v16 qt.f[], still in use, count: 1, list:
  (r0v16 qt.f[]) from 0x00be: INVOKE (r0v16 qt.f[]) STATIC call: ub.a.U(java.lang.Enum[]):yy.b A[MD:(java.lang.Enum[]):yy.b (m), WRAPPED] (LINE:191)
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
public final class f {
    MODEL_0(0),
    MODEL_1(1),
    MODEL_2(2),
    MODEL_3(3),
    MODEL_4(4),
    MODEL_5(5),
    MODEL_6(6),
    MODEL_7(7),
    MODEL_8(8),
    MODEL_9(9),
    MODEL_10(10),
    MODEL_11(11),
    MODEL_12(12),
    MODEL_13(13),
    MODEL_14(14),
    MODEL_31(31);

    private static final /* synthetic */ yy.a $ENTRIES;
    public static final e Companion = new e();
    private final int value;

    static {
        $ENTRIES = ub.a.U(new f[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0});
    }

    public f(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static yy.a a() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final int b() {
        return this.value;
    }
}
