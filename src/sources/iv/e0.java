package iv;

import com.lingodeer.data.model.SyllableLessonStatus;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f34712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f34713b;

    static {
        int[] iArr = new int[kv.s0.values().length];
        try {
            iArr[kv.s0.HIRAGANA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kv.s0.KATAKANA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[kv.s0.HANDWRITING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f34712a = iArr;
        int[] iArr2 = new int[SyllableLessonStatus.values().length];
        try {
            iArr2[SyllableLessonStatus.LOCKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SyllableLessonStatus.UNLOCKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SyllableLessonStatus.COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f34713b = iArr2;
    }
}
