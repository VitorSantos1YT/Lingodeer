package ds;

import com.lingodeer.data.model.LessonState;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23594a;

    static {
        int[] iArr = new int[LessonState.values().length];
        try {
            iArr[LessonState.StateLocked.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LessonState.StateOpen.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LessonState.StateRedo.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f23594a = iArr;
    }
}
