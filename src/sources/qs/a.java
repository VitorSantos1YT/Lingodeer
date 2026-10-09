package qs;

import com.lingodeer.data.model.CourseQuestionPreferenceKey;
import ht.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f48310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f48311b;

    static {
        int[] iArr = new int[r.values().length];
        try {
            iArr[r.M5.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r.M9.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r.M10.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f48310a = iArr;
        int[] iArr2 = new int[CourseQuestionPreferenceKey.values().length];
        try {
            iArr2[CourseQuestionPreferenceKey.VOCAB_M9.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        f48311b = iArr2;
    }
}
