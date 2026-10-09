package e4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f24825a;

    static {
        int[] iArr = new int[d4.c.values().length];
        f24825a = iArr;
        try {
            iArr[d4.c.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f24825a[d4.c.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f24825a[d4.c.TOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f24825a[d4.c.BASELINE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f24825a[d4.c.BOTTOM.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
