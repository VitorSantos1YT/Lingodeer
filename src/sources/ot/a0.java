package ot;

import com.lingodeer.data.model.CoursePracticeType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f45739a;

    static {
        int[] iArr = new int[CoursePracticeType.values().length];
        try {
            iArr[CoursePracticeType.COURSE_PRACTICE_SPELLING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CoursePracticeType.COURSE_PRACTICE_CHARACTER_DRILL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CoursePracticeType.COURSE_PRACTICE_SPEAKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CoursePracticeType.COURSE_PRACTICE_LISTENING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f45739a = iArr;
    }
}
