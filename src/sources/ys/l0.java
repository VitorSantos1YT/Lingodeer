package ys;

import com.lingodeer.data.model.CoursePracticeType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f58127a;

    static {
        int[] iArr = new int[CoursePracticeType.values().length];
        try {
            iArr[CoursePracticeType.COURSE_DIALOG_SPEAKING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CoursePracticeType.COURSE_DIALOG_PRACTICE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f58127a = iArr;
    }
}
