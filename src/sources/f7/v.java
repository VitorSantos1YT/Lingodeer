package f7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements b7.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26924a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y6.z0 f26925b;

    public /* synthetic */ v(g7.a aVar, y6.z0 z0Var) {
        this.f26925b = z0Var;
    }

    @Override // b7.k
    public final void invoke(Object obj) {
        switch (this.f26924a) {
            case 0:
                ((y6.h0) obj).a(this.f26925b);
                break;
            default:
                g7.i iVar = (g7.i) ((g7.b) obj);
                ij.d dVar = iVar.f28841p;
                y6.z0 z0Var = this.f26925b;
                if (dVar != null) {
                    y6.p pVar = (y6.p) dVar.f34422c;
                    if (pVar.f57299v == -1) {
                        y6.o oVarA = pVar.a();
                        oVarA.f57271t = z0Var.f57407a;
                        oVarA.f57272u = z0Var.f57408b;
                        int i11 = 6;
                        iVar.f28841p = new ij.d(dVar.f34421b, i11, new y6.p(oVarA), (String) dVar.f34423d);
                    }
                }
                int i12 = z0Var.f57407a;
                break;
        }
    }

    public /* synthetic */ v(y6.z0 z0Var) {
        this.f26925b = z0Var;
    }
}
