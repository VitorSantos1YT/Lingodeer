package f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f26178b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(d0 d0Var, int i11) {
        super(0);
        this.f26177a = i11;
        this.f26178b = d0Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f26177a) {
            case 0:
                this.f26178b.c();
                break;
            case 1:
                this.f26178b.b();
                break;
            default:
                this.f26178b.c();
                break;
        }
        return qy.b0.f48488a;
    }
}
