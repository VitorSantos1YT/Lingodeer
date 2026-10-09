package rt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 rt.x8[], still in use, count: 1, list:
  (r0v1 rt.x8[]) from 0x0030: INVOKE (r0v1 rt.x8[]) STATIC call: ub.a.U(java.lang.Enum[]):yy.b A[MD:(java.lang.Enum[]):yy.b (m), WRAPPED] (LINE:49)
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
public final class x8 {
    CHARACTER(2),
    WORD(0),
    SENTENCE(1),
    EXTENT_WORD(8);

    private static final /* synthetic */ yy.a $ENTRIES;
    private final int value;

    static {
        $ENTRIES = ub.a.U(x8VarArr);
    }

    public x8(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static x8 valueOf(String str) {
        return (x8) Enum.valueOf(x8.class, str);
    }

    public static x8[] values() {
        return (x8[]) $VALUES.clone();
    }

    public final int a() {
        return this.value;
    }
}
