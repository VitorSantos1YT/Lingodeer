package rt;

import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLevelType;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 rt.je[], still in use, count: 1, list:
  (r0v1 rt.je[]) from 0x00a4: INVOKE (r0v1 rt.je[]) STATIC call: ub.a.U(java.lang.Enum[]):yy.b A[MD:(java.lang.Enum[]):yy.b (m), WRAPPED] (LINE:165)
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
public final class je {
    DAYS_0(R.string.today, 0, 0),
    DAYS_1_7(R.string.srs_range_1_7d, 1, 7),
    DAYS_7_14(R.string.srs_range_7_14d, 7, 14),
    DAYS_14_30(R.string.srs_range_14_30d, 14, 30),
    MONTHS_1_3(R.string.srs_range_1_3mo, 30, 90),
    MONTHS_3_6(R.string.srs_range_3_6mo, 90, Integer.valueOf(AchievementLevelType.DAY_STREAK_LV_8)),
    MONTHS_6_12(R.string.srs_range_6_12mo, AchievementLevelType.DAY_STREAK_LV_8, Integer.valueOf(AchievementLevelType.DAY_STREAK_LV_10)),
    MONTHS_OVER_12(R.string.srs_range_over_12mo, 366, null);

    private static final /* synthetic */ yy.a $ENTRIES;
    private final int labelRes;
    private final Integer maxDaysInclusive;
    private final int minDaysInclusive;

    static {
        $ENTRIES = ub.a.U(jeVarArr);
    }

    public je(int i11, int i12, Integer num) {
        super(str, i);
        this.labelRes = i11;
        this.minDaysInclusive = i12;
        this.maxDaysInclusive = num;
    }

    public static yy.a a() {
        return $ENTRIES;
    }

    public static je valueOf(String str) {
        return (je) Enum.valueOf(je.class, str);
    }

    public static je[] values() {
        return (je[]) $VALUES.clone();
    }

    public final int b() {
        return this.labelRes;
    }

    public final Integer c() {
        return this.maxDaysInclusive;
    }

    public final int e() {
        return this.minDaysInclusive;
    }
}
