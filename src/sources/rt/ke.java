package rt;

import com.lingodeer.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 rt.ke[], still in use, count: 1, list:
  (r0v1 rt.ke[]) from 0x002d: INVOKE (r0v1 rt.ke[]) STATIC call: ub.a.U(java.lang.Enum[]):yy.b A[MD:(java.lang.Enum[]):yy.b (m), WRAPPED] (LINE:46)
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
public final class ke {
    WORDS_EXPRESSION(R.string.srs_future_reviews_tab_words_expressions),
    CHARACTER(R.string.characters),
    HIDDEN(R.string.srs_future_reviews_tab_hidden);

    private static final /* synthetic */ yy.a $ENTRIES;
    private final int labelRes;

    static {
        $ENTRIES = ub.a.U(keVarArr);
    }

    public ke(int i11) {
        super(str, i);
        this.labelRes = i11;
    }

    public static ke valueOf(String str) {
        return (ke) Enum.valueOf(ke.class, str);
    }

    public static ke[] values() {
        return (ke[]) $VALUES.clone();
    }

    public final int a() {
        return this.labelRes;
    }
}
