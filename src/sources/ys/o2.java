package ys;

import com.lingodeer.data.model.uistate.CourseTestFinishSummaryType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f58199a;

    static {
        int[] iArr = new int[CourseTestFinishSummaryType.values().length];
        try {
            iArr[CourseTestFinishSummaryType.TEST_OUT_SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CourseTestFinishSummaryType.TEST_OUT_FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CourseTestFinishSummaryType.LESSON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f58199a = iArr;
    }
}
