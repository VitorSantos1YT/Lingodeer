package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f42058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f42059b;

    static {
        int[] iArr = new int[wt.c0.values().length];
        try {
            iArr[wt.c0.AGAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wt.c0.HARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[wt.c0.GOOD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[wt.c0.EASY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f42058a = iArr;
        int[] iArr2 = new int[wt.t.values().length];
        try {
            iArr2[wt.t.MIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[wt.t.HOUR.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[wt.t.DAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[wt.t.MONTH.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[wt.t.YEAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        f42059b = iArr2;
    }
}
