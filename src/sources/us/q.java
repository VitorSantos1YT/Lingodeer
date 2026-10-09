package us;

import com.lingodeer.course.smarttips.data.model.ElementType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f53130a;

    static {
        int[] iArr = new int[ElementType.values().length];
        try {
            iArr[ElementType.Text.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ElementType.SubText.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f53130a = iArr;
    }
}
