package rt;

import com.lingodeer.data.model.LessonType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class ub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f50494a;

    static {
        int[] iArr = new int[LessonType.values().length];
        try {
            iArr[LessonType.TypeDialogueWarmUp.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LessonType.TypeDialoguePractice.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LessonType.TypeDialogueSpeaking.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f50494a = iArr;
    }
}
