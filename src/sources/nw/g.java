package nw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f44206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f44207b;

    static {
        int[] iArr = new int[h.values().length];
        f44207b = iArr;
        try {
            iArr[h.PLAINTEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f44207b[h.TLS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[f.values().length];
        f44206a = iArr2;
        try {
            iArr2[f.TLS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f44206a[f.PLAINTEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
