package e2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f24713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f24714b;

    static {
        int[] iArr = new int[v3.m.values().length];
        try {
            iArr[v3.m.Ltr.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v3.m.Rtl.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f24713a = iArr;
        int[] iArr2 = new int[b0.values().length];
        try {
            iArr2[b0.Active.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[b0.ActiveParent.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[b0.Captured.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[b0.Inactive.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f24714b = iArr2;
    }
}
