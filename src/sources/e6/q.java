package e6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f25018a;

    static {
        int[] iArr = new int[c6.p.values().length];
        try {
            iArr[c6.p.Visible.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c6.p.Invisible.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c6.p.Gone.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f25018a = iArr;
    }
}
