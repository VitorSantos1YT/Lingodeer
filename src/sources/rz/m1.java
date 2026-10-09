package rz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m1 extends i1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f50933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zz.i f50934f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q1 f50935t;

    public /* synthetic */ m1(q1 q1Var, zz.i iVar, int i11) {
        this.f50933e = i11;
        this.f50935t = q1Var;
        this.f50934f = iVar;
    }

    @Override // rz.i1
    public final boolean i() {
        switch (this.f50933e) {
        }
        return false;
    }

    @Override // rz.i1
    public final void j(Throwable th2) {
        switch (this.f50933e) {
            case 0:
                q1 q1Var = this.f50935t;
                q1Var.getClass();
                Object objK = q1.f50945a.get(q1Var);
                if (!(objK instanceof v)) {
                    objK = e0.K(objK);
                }
                ((zz.h) this.f50934f).g(q1Var, objK);
                break;
            default:
                ((zz.h) this.f50934f).g(this.f50935t, qy.b0.f48488a);
                break;
        }
    }
}
