package ch;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7101a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.ShowPrompt.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.CompleteFinish.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n.None.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f7101a = iArr;
    }
}
