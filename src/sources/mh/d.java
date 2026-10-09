package mh;

import androidx.drawerlayout.widget.ktFt.FpIL;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v21 mh.d[], still in use, count: 1, list:
  (r0v21 mh.d[]) from 0x0132: INVOKE (r0v21 mh.d[]) STATIC call: ub.a.U(java.lang.Enum[]):yy.b A[MD:(java.lang.Enum[]):yy.b (m), WRAPPED] (LINE:308)
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
public final class d {
    ART_AND_CRAFTS("CT1"),
    EDUCATION("CT2"),
    HISTORY("CT3"),
    ENTERTAINMENT("CT4"),
    HEALTH("CT5"),
    LANGUAGE("CT6"),
    LIFE_STYLE("CT7"),
    PEOPLE("CT8"),
    SPORTS("CT9"),
    TRAVEL("CT10"),
    FOOD("CT11"),
    NEWS_AND_MEDIA("CT12"),
    CULTURE("CT13"),
    SHOPPING("CT14"),
    FRIENDS("CT15"),
    FAMILY("CT16"),
    RELATIONSHIP("CT17"),
    BUSINESS(FpIL.Yty),
    WEATHER("CT19"),
    TRANSPORTATION("CT20"),
    OTHERS("CT21");

    private static final /* synthetic */ yy.a $ENTRIES;
    public static final c Companion = new c();
    private final String displayName;
    private final Integer iconResId;

    public d(String str) {
        super(str, i);
        this.displayName = str;
        this.iconResId = null;
    }

    public static yy.a b() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final String a() {
        return this.displayName;
    }

    static {
        $ENTRIES = ub.a.U(new d[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1, r0, r1, r0, r1});
    }
}
