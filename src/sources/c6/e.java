package c6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f6616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f6617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f6618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f6619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f6620f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6621a;

    static {
        int i11 = 0;
        f6616b = new e(i11, 0);
        f6617c = new e(i11, 1);
        f6618d = new e(i11, 2);
        f6619e = new e(i11, 3);
        f6620f = new e(i11, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i11, int i12) {
        super(i11);
        this.f6621a = i12;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f6621a) {
            case 0:
                return j6.b.B;
            case 1:
                throw new IllegalStateException("No default context");
            case 2:
                throw new IllegalStateException("No default glance id");
            case 3:
                throw new IllegalStateException("No default size");
            default:
                return null;
        }
    }
}
