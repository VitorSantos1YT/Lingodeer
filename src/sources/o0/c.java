package o0;

import l1.g1;
import l1.h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f44354b;

    public /* synthetic */ c(t tVar, int i11) {
        this.f44353a = i11;
        this.f44354b = tVar;
    }

    @Override // fz.a
    public final Object invoke() {
        int iM;
        int iK;
        switch (this.f44353a) {
            case 0:
                iM = this.f44354b.m();
                break;
            case 1:
                iM = this.f44354b.m();
                break;
            case 2:
                t tVar = this.f44354b;
                return Integer.valueOf(tVar.f44442k.b() ? tVar.f44450t.l() : tVar.k());
            default:
                t tVar2 = this.f44354b;
                h1 h1Var = tVar2.f44449s;
                if (!tVar2.f44442k.b()) {
                    iK = tVar2.k();
                } else if (h1Var.l() != -1) {
                    iK = h1Var.l();
                } else if (Math.abs(((g1) tVar2.f44435d.f7511d).l()) >= Math.abs(Math.min(tVar2.f44447q.e0(w.f44457a), tVar2.n() / 2.0f) / tVar2.n())) {
                    iK = ((Boolean) tVar2.F.getValue()).booleanValue() ? tVar2.f44436e + 1 : tVar2.f44436e;
                } else {
                    iK = tVar2.k();
                }
                iM = tVar2.j(iK);
                break;
        }
        return Integer.valueOf(iM);
    }
}
