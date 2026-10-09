package er;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f25753a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.DAILY_LEARN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.SRS_REVIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.DISCOUNT_LAST_1H.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e.BILLING_5MIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f25753a = iArr;
    }
}
