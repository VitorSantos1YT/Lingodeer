package ys;

import com.lingodeer.data.model.CourseAudioMode;
import com.lingodeer.data.model.CourseVisibilityMode;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f58257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f58258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f58259c;

    static {
        int[] iArr = new int[u.values().length];
        try {
            iArr[u.Root.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u.ScriptStyle.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u.CurrentQuestionPreferences.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f58257a = iArr;
        int[] iArr2 = new int[CourseAudioMode.values().length];
        try {
            iArr2[CourseAudioMode.TAP_TO_PLAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        f58258b = iArr2;
        int[] iArr3 = new int[CourseVisibilityMode.values().length];
        try {
            iArr3[CourseVisibilityMode.TAP_TO_REVEAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        f58259c = iArr3;
    }
}
