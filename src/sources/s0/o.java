package s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f51120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f51121c;

    public /* synthetic */ o(q1 q1Var, fz.c cVar, int i11) {
        this.f51119a = i11;
        this.f51120b = q1Var;
        this.f51121c = cVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f51119a) {
            case 0:
                j3.u0 u0Var = (j3.u0) obj;
                q1 q1Var = this.f51120b;
                if (q1Var != null) {
                    q1Var.f51143a.setValue(u0Var);
                }
                fz.c cVar = this.f51121c;
                if (cVar != null) {
                    cVar.invoke(u0Var);
                }
                return qy.b0.f48488a;
            default:
                q1 q1Var2 = this.f51120b;
                x1.p pVar = q1Var2.f51145c;
                fz.c cVar2 = this.f51121c;
                pVar.add(cVar2);
                return new b0.l0(16, q1Var2, cVar2);
        }
    }
}
