package rt;

import com.lingodeer.data.model.CoursePracticeType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f49450a;

    static {
        int[] iArr = new int[CoursePracticeType.values().length];
        try {
            iArr[CoursePracticeType.COURSE_PRACTICE_LISTENING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CoursePracticeType.COURSE_PRACTICE_SPEAKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CoursePracticeType.COURSE_PRACTICE_SPELLING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CoursePracticeType.COURSE_PRACTICE_COMPREHENSIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f49450a = iArr;
    }
}
