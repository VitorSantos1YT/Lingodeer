package mw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f42528a;

    static {
        int[] iArr = new int[lw.e.values().length];
        f42528a = iArr;
        try {
            iArr[lw.e.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f42528a[lw.e.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f42528a[lw.e.INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
