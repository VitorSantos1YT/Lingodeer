package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class w7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f50577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f50578b;

    static {
        int[] iArr = new int[p8.values().length];
        try {
            iArr[p8.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p8.SHUFFLE_20.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p8.SHUFFLE_40.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[p8.WEAK_ONLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f50577a = iArr;
        int[] iArr2 = new int[x8.values().length];
        try {
            iArr2[x8.CHARACTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[x8.WORD.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[x8.SENTENCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[x8.EXTENT_WORD.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f50578b = iArr2;
    }
}
