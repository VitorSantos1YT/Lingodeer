package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class pb extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb f30890b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(int i11, yb ybVar) {
        super(0);
        this.f30889a = i11;
        this.f30890b = ybVar;
    }

    @Override // fz.a
    public final Object invoke() {
        yb ybVar = this.f30890b;
        int iF = ybVar.f();
        int i11 = this.f30889a;
        if (i11 != iF) {
            ybVar.e(i11);
        }
        return qy.b0.f48488a;
    }
}
