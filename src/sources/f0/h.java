package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f26287a;

    static {
        int[] iArr = new int[h1.values().length];
        try {
            iArr[h1.Vertical.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h1.Horizontal.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f26287a = iArr;
    }
}
