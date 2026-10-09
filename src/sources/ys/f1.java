package ys;

import com.lingodeer.data.model.uistate.CourseTestSummaryItemStatus;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f57997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f57998b;

    static {
        int[] iArr = new int[z0.values().length];
        try {
            iArr[z0.TopItem.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z0.MiddleItem.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[z0.BottomItem.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[z0.FullItem.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f57997a = iArr;
        int[] iArr2 = new int[CourseTestSummaryItemStatus.values().length];
        try {
            iArr2[CourseTestSummaryItemStatus.CORRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[CourseTestSummaryItemStatus.WRONG.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[CourseTestSummaryItemStatus.SKIPPED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f57998b = iArr2;
    }
}
