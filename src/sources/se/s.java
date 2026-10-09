package se;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f51613a;

    static {
        int[] iArr = new int[v.values().length];
        try {
            iArr[v.CustomData.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v.OperationalData.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[v.CustomAndOperationalData.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f51613a = iArr;
    }
}
