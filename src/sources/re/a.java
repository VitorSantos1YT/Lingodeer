package re;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f49109a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.CHROME_CUSTOM_TAB.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.WEB_VIEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f49109a = iArr;
    }
}
