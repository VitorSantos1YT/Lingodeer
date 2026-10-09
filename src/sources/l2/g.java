package l2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f39604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f39605c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39606a;

    static {
        int i11 = 0;
        f39604b = new g(i11, 0);
        f39605c = new g(i11, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i11, int i12) {
        super(i11);
        this.f39606a = i12;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f39606a) {
            case 0:
                return g2.f0.i();
            default:
                return qy.b0.f48488a;
        }
    }
}
