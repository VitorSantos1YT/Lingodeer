package jr;

import com.lingodeer.data.model.CoursePracticeType;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 jr.a0[], still in use, count: 1, list:
  (r0v1 jr.a0[]) from 0x004e: INVOKE (r0v1 jr.a0[]) STATIC call: ub.a.U(java.lang.Enum[]):yy.b A[MD:(java.lang.Enum[]):yy.b (m), WRAPPED] (LINE:79)
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
public final class a0 {
    StoryReading(CoursePracticeType.COURSE_STORY_READING.getValue()),
    StorySpeaking(CoursePracticeType.COURSE_STORY_SPEAKING.getValue()),
    StoryLeaderboard(CoursePracticeType.COURSE_STORY_LEADERBOARD.getValue()),
    StoryReadingFinish("story_reading_finish"),
    StorySpeakingFinish("story_speaking_finish");

    private static final /* synthetic */ yy.a $ENTRIES;
    private final String route;

    static {
        $ENTRIES = ub.a.U(a0VarArr);
    }

    public a0(String str) {
        super(str, i);
        this.route = str;
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }

    public final String a() {
        return this.route;
    }
}
