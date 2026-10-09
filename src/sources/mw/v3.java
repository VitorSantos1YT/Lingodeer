package mw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v3 implements lw.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lw.y f42747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z3 f42748b;

    public v3(z3 z3Var, lw.y yVar) {
        this.f42748b = z3Var;
        this.f42747a = yVar;
    }

    @Override // lw.p0
    public final void a(lw.o oVar) {
        lw.o0 s3Var;
        z3 z3Var = this.f42748b;
        lw.f fVar = z3Var.f42875f;
        lw.n nVar = oVar.f40425a;
        if (nVar == lw.n.SHUTDOWN) {
            return;
        }
        lw.n nVar2 = lw.n.TRANSIENT_FAILURE;
        if (nVar == nVar2 || nVar == lw.n.IDLE) {
            fVar.k();
        }
        if (z3Var.f42877h == nVar2) {
            if (nVar == lw.n.CONNECTING) {
                return;
            }
            if (nVar == lw.n.IDLE) {
                z3Var.e();
                return;
            }
        }
        int i11 = w3.f42776a[nVar.ordinal()];
        lw.y yVar = this.f42747a;
        if (i11 == 1) {
            s3Var = new s3(z3Var, yVar);
        } else if (i11 == 2) {
            s3Var = new y3(lw.m0.f40417e);
        } else if (i11 == 3) {
            s3Var = new y3(lw.m0.b(yVar, null));
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("Unsupported state:" + nVar);
            }
            s3Var = new y3(lw.m0.a(oVar.f40426b));
        }
        z3Var.f42877h = nVar;
        fVar.q(nVar, s3Var);
    }
}
