package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f30142a;

    static {
        int[] iArr = new int[z3.a0.values().length];
        try {
            iArr[z3.a0.SecureOff.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z3.a0.SecureOn.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[z3.a0.Inherit.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f30142a = iArr;
    }
}
