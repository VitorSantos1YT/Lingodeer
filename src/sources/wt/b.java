package wt;

import com.lingodeer.data.model.LessonType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f55235a;

    static {
        int[] iArr = new int[LessonType.values().length];
        try {
            iArr[LessonType.TypeLesson.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LessonType.TypeDialogueWarmUp.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LessonType.TypeDialoguePractice.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LessonType.TypeDialogueSpeaking.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LessonType.TypeCoffeeBreak.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f55235a = iArr;
    }
}
