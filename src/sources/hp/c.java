package hp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f33687a;

    static {
        int[] iArr = new int[ip.b.values().length];
        try {
            iArr[ip.b.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ip.b.LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ip.b.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f33687a = iArr;
    }
}
