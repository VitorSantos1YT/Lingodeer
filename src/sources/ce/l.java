package ce;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f6868b = new l(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f6869c = new l(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f6870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f6871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f6872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final td.i f6873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f6874h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6875a;

    static {
        l lVar = new l(1);
        f6870d = lVar;
        f6871e = new l(3);
        f6872f = lVar;
        f6873g = td.i.a(lVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f6874h = true;
    }

    public /* synthetic */ l(int i11) {
        this.f6875a = i11;
    }

    public final m a(int i11, int i12, int i13, int i14) {
        switch (this.f6875a) {
            case 0:
                return b(i11, i12, i13, i14) == 1.0f ? m.QUALITY : f6868b.a(i11, i12, i13, i14);
            case 1:
                return m.QUALITY;
            case 2:
                return f6874h ? m.QUALITY : m.MEMORY;
            default:
                return m.QUALITY;
        }
    }

    public final float b(int i11, int i12, int i13, int i14) {
        switch (this.f6875a) {
            case 0:
                return Math.min(1.0f, f6868b.b(i11, i12, i13, i14));
            case 1:
                return Math.max(i13 / i11, i14 / i12);
            case 2:
                if (f6874h) {
                    return Math.min(i13 / i11, i14 / i12);
                }
                int iMax = Math.max(i12 / i14, i11 / i13);
                if (iMax == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(iMax);
            default:
                return 1.0f;
        }
    }
}
