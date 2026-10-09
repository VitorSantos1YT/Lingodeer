package ht;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f33752a;

    static {
        int[] iArr = new int[ns.q.values().length];
        try {
            iArr[ns.q.CORRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ns.q.RETRY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ns.q.WRONG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f33752a = iArr;
    }
}
