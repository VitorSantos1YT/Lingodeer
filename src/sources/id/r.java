package id;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f34373a;

    static {
        int[] iArr = new int[gd.h.values().length];
        f34373a = iArr;
        try {
            iArr[gd.h.LUMA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f34373a[gd.h.LUMA_INVERTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
