package ff;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f27235a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.MTML_INTEGRITY_DETECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f27235a = iArr;
    }
}
