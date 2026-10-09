package ex;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f25960a;

    static {
        int[] iArr = new int[nx.c.values().length];
        f25960a = iArr;
        try {
            iArr[nx.c.BOUNDARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f25960a[nx.c.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
