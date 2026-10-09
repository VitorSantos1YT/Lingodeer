package nu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f44081a;

    static {
        int[] iArr = new int[ou.f.values().length];
        try {
            iArr[ou.f.Normal.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ou.f.Writer.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ou.f.Anim.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ou.f.Quiz.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f44081a = iArr;
    }
}
