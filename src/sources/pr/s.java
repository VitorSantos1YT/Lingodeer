package pr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f47096a;

    static {
        int[] iArr = new int[qr.a.values().length];
        try {
            iArr[qr.a.BIG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qr.a.MIDDLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qr.a.MIDDLE_SMALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[qr.a.EXTRA_SMALL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f47096a = iArr;
    }
}
