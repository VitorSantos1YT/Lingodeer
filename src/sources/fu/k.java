package fu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f28125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f28126b;

    static {
        int[] iArr = new int[hu.a.values().length];
        try {
            iArr[hu.a.STREAKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hu.a.STREAKED_FREEZE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[hu.a.STREAKED_SHIELD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[hu.a.NOT_STREAKED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[hu.a.EMPTY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f28125a = iArr;
        int[] iArr2 = new int[hu.c.values().length];
        try {
            iArr2[hu.c.TYPE_SINGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[hu.c.TYPE_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[hu.c.TYPE_BODY.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[hu.c.TYPE_END.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[hu.c.TYPE_EMPTY.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        f28126b = iArr2;
    }
}
