package ch;

import com.lingodeer.data.model.CourseLessonPracticeType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7084a;

    static {
        int[] iArr = new int[CourseLessonPracticeType.values().length];
        try {
            iArr[CourseLessonPracticeType.CourseLessonStart.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CourseLessonPracticeType.CourseLessonRedo.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CourseLessonPracticeType.CourseLessonReview.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CourseLessonPracticeType.CourseLessonReviewListening.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CourseLessonPracticeType.CourseLessonReviewSpelling.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CourseLessonPracticeType.CourseLessonReviewSpeaking.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f7084a = iArr;
    }
}
