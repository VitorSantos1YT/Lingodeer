package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f31329a;

    static {
        int[] iArr = new int[i3.a.values().length];
        try {
            iArr[i3.a.On.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i3.a.Indeterminate.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i3.a.Off.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f31329a = iArr;
    }
}
