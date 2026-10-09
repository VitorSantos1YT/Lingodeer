package ue;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f52931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f52932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f52933c;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.ARRAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.BOOL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l.INT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f52931a = iArr;
        int[] iArr2 = new int[t.values().length];
        try {
            iArr2[t.APP_DATA.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[t.USER_DATA.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f52932b = iArr2;
        int[] iArr3 = new int[b.values().length];
        try {
            iArr3[b.MOBILE_APP_INSTALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[b.CUSTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f52933c = iArr3;
    }
}
