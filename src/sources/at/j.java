package at;

import com.lingodeer.data.model.LessonState;
import com.lingodeer.data.model.LessonType;
import com.lingodeer.data.model.StoryLessonType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f2889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f2890c;

    static {
        int[] iArr = new int[LessonState.values().length];
        try {
            iArr[LessonState.StateRedo.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LessonState.StateOpen.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LessonState.StateLocked.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f2888a = iArr;
        int[] iArr2 = new int[StoryLessonType.values().length];
        try {
            iArr2[StoryLessonType.TypeStoryReading.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[StoryLessonType.TypeStoryListening.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[StoryLessonType.TypeStoryLeaderBoard.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f2889b = iArr2;
        int[] iArr3 = new int[LessonType.values().length];
        try {
            iArr3[LessonType.TypeDialogueWarmUp.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[LessonType.TypeDialoguePractice.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[LessonType.TypeDialogueSpeaking.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[LessonType.TypeCoffeeBreak.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        f2890c = iArr3;
    }
}
