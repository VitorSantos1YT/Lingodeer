package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q3 extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.w f30911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f30912c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3(int i11, l0.w wVar, rz.b0 b0Var) {
        super(0);
        this.f30910a = i11;
        this.f30911b = wVar;
        this.f30912c = b0Var;
    }

    @Override // fz.a
    public final Object invoke() {
        boolean z11;
        boolean z12;
        switch (this.f30910a) {
            case 0:
                l0.w wVar = this.f30911b;
                if (wVar.d()) {
                    rz.e0.B(this.f30912c, null, null, new p3(wVar, null, 0), 3);
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            default:
                l0.w wVar2 = this.f30911b;
                if (wVar2.c()) {
                    rz.e0.B(this.f30912c, null, null, new p3(wVar2, null, 1), 3);
                    z12 = true;
                } else {
                    z12 = false;
                }
                return Boolean.valueOf(z12);
        }
    }
}
