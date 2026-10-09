package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ob extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb f30815b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ob(int i11, yb ybVar) {
        super(0);
        this.f30814a = i11;
        this.f30815b = ybVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f30814a) {
            case 0:
                this.f30815b.a(false);
                break;
            default:
                this.f30815b.a(true);
                break;
        }
        return qy.b0.f48488a;
    }
}
