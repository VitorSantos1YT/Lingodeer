package mw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f42621a;

    static {
        int[] iArr = new int[lw.n.values().length];
        f42621a = iArr;
        try {
            iArr[lw.n.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f42621a[lw.n.CONNECTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f42621a[lw.n.READY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f42621a[lw.n.TRANSIENT_FAILURE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f42621a[lw.n.SHUTDOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
