package lf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f40097a;

    static {
        int[] iArr = new int[re.p.values().length];
        try {
            iArr[re.p.OTHER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[re.p.LOGIN_RECOVERABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[re.p.TRANSIENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f40097a = iArr;
    }
}
