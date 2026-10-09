package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1825a;

    static {
        int[] iArr = new int[n2.values().length];
        try {
            iArr[n2.ADDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n2.REMOVING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n2.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f1825a = iArr;
    }
}
