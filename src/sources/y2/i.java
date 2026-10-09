package y2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f56872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f56873c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56874a;

    static {
        int i11 = 0;
        f56872b = new i(i11, 0);
        f56873c = new i(i11, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i11, int i12) {
        super(i11);
        this.f56874a = i12;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f56874a) {
            case 0:
                return new i0(2);
            default:
                return new i0(3);
        }
    }
}
