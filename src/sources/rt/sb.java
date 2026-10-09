package rt;

import com.lingodeer.data.model.StoryLessonType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class sb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f50386a;

    static {
        int[] iArr = new int[StoryLessonType.values().length];
        try {
            iArr[StoryLessonType.TypeStoryReading.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StoryLessonType.TypeStoryListening.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StoryLessonType.TypeStoryLeaderBoard.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f50386a = iArr;
    }
}
