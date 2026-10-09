package rt;

import com.lingodeer.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 rt.me[], still in use, count: 1, list:
  (r0v1 rt.me[]) from 0x0020: INVOKE (r0v1 rt.me[]) STATIC call: ub.a.U(java.lang.Enum[]):yy.b A[MD:(java.lang.Enum[]):yy.b (m), WRAPPED] (LINE:33)
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
public final class me {
    NEXT_REVIEW_TIME(R.string.srs_future_reviews_mode_time),
    UNIT_LIST(R.string.srs_future_reviews_mode_unit);

    private static final /* synthetic */ yy.a $ENTRIES;
    private final int labelRes;

    static {
        $ENTRIES = ub.a.U(meVarArr);
    }

    public me(int i11) {
        super(str, i);
        this.labelRes = i11;
    }

    public static yy.a a() {
        return $ENTRIES;
    }

    public static me valueOf(String str) {
        return (me) Enum.valueOf(me.class, str);
    }

    public static me[] values() {
        return (me[]) $VALUES.clone();
    }

    public final int b() {
        return this.labelRes;
    }
}
