package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f41596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f41597b;

    static {
        int[] iArr = new int[rt.v4.values().length];
        try {
            iArr[rt.v4.PREPARING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rt.v4.PLAYING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f41596a = iArr;
        int[] iArr2 = new int[rt.w4.values().length];
        try {
            iArr2[rt.w4.SENTENCES.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[rt.w4.WORDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[rt.w4.MIXED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f41597b = iArr2;
        int[] iArr3 = new int[rt.r4.values().length];
        try {
            iArr3[rt.r4.IMMERSION.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[rt.r4.RELAXED.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
