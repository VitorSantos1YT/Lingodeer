package ex;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f26028a;

    static {
        int[] iArr = new int[uw.a.values().length];
        f26028a = iArr;
        try {
            iArr[uw.a.MISSING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f26028a[uw.a.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f26028a[uw.a.DROP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f26028a[uw.a.LATEST.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
