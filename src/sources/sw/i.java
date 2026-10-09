package sw;

import lw.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f51859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f51860c;

    public /* synthetic */ i(d dVar, p0 p0Var, int i11) {
        this.f51858a = i11;
        this.f51860c = dVar;
        this.f51859b = p0Var;
    }

    @Override // lw.p0
    public final void a(lw.o oVar) {
        switch (this.f51858a) {
            case 0:
                this.f51859b.a(oVar);
                ((j) this.f51860c).f51862b.a(oVar);
                break;
            default:
                t tVar = (t) this.f51860c;
                tVar.f51898d = oVar;
                if (!tVar.f51897c) {
                    this.f51859b.a(oVar);
                }
                break;
        }
    }
}
