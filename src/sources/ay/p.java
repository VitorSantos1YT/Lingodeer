package ay;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3365b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3367d;

    public p(qx.h hVar, qx.o oVar, int i11) {
        super(hVar);
        this.f3367d = oVar;
        this.f3366c = i11;
    }

    @Override // qx.h
    public final void j(qx.k kVar) {
        switch (this.f3365b) {
            case 0:
                gy.d dVar = (gy.d) this.f3367d;
                re.q qVar = vx.b.f54312a;
                qx.i iVar = this.f3265a;
                if (!se.k.E(iVar, kVar, qVar)) {
                    gy.d dVar2 = gy.d.IMMEDIATE;
                    int i11 = this.f3366c;
                    if (dVar != dVar2) {
                        ((qx.h) iVar).i(new m(kVar, i11, dVar == gy.d.END));
                    } else {
                        ((qx.h) iVar).i(new o(new hy.a(kVar), i11));
                    }
                    break;
                }
                break;
            default:
                qx.o oVar = (qx.o) this.f3367d;
                boolean z11 = oVar instanceof dy.x;
                qx.i iVar2 = this.f3265a;
                if (!z11) {
                    ((qx.h) iVar2).i(new h0(kVar, oVar.a(), this.f3366c));
                } else {
                    ((qx.h) iVar2).i(kVar);
                }
                break;
        }
    }

    public p(w wVar, int i11, gy.d dVar) {
        super(wVar);
        this.f3367d = dVar;
        this.f3366c = Math.max(8, i11);
    }
}
