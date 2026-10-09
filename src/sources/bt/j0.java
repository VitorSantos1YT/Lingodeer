package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ys.d0 f5557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ot.a f5558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jt.u f5559d;

    public /* synthetic */ j0(ys.d0 d0Var, ot.a aVar, jt.u uVar, int i11) {
        this.f5556a = i11;
        this.f5557b = d0Var;
        this.f5558c = aVar;
        this.f5559d = uVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f5556a) {
            case 0:
                ys.d0 d0Var = this.f5557b;
                if (d0Var != null) {
                    ot.a aVar = this.f5558c;
                    jh.h.m(d0Var, jh.h.q(aVar.f45734a), new ht.c(aVar.f45734a.getVisemedMap()), new k0(this.f5559d, 2));
                }
                break;
            case 1:
                ys.d0 d0Var2 = this.f5557b;
                if (d0Var2 != null) {
                    ot.a aVar2 = this.f5558c;
                    jh.h.m(d0Var2, jh.h.q(aVar2.f45734a), new ht.c(aVar2.f45734a.getVisemedMap()), new k0(this.f5559d, 1));
                }
                break;
            default:
                ys.d0 d0Var3 = this.f5557b;
                if (d0Var3 != null) {
                    ot.a aVar3 = this.f5558c;
                    jh.h.m(d0Var3, jh.h.u(aVar3.f45734a), new ht.i(aVar3.f45734a.getSlowVisemedMap()), new k0(this.f5559d, 3));
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
