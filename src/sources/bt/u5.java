package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6071a;

    static {
        int[] iArr = new int[ht.q.values().length];
        try {
            iArr[ht.q.CORRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ht.q.WRONG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f6071a = iArr;
    }
}
