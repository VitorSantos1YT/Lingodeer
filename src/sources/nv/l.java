package nv;

import com.lingodeer.data.model.SyllableLessonStatus;
import com.lingodeer.syllable_ko.model.KOSyllableLessonType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f44156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f44157b;

    static {
        int[] iArr = new int[KOSyllableLessonType.values().length];
        try {
            iArr[KOSyllableLessonType.SYLLABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KOSyllableLessonType.SOUND_CHANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f44156a = iArr;
        int[] iArr2 = new int[SyllableLessonStatus.values().length];
        try {
            iArr2[SyllableLessonStatus.LOCKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[SyllableLessonStatus.UNLOCKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SyllableLessonStatus.COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f44157b = iArr2;
    }
}
