package br;

import bt.n5;
import h1.bc;
import h1.s1;
import h1.v1;
import xu.a2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f5044c;

    public /* synthetic */ i(fz.a aVar, boolean z11) {
        this.f5042a = 1;
        this.f5043b = z11;
        this.f5044c = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f5042a;
        qy.b0 b0Var = qy.b0.f48488a;
        fz.a aVar = this.f5044c;
        boolean z11 = this.f5043b;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                q.c(z11, aVar, (l1.n) obj, l1.t.M(1));
                break;
            case 1:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(1 & iIntValue, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    boolean zG = sVar.g(z11) | sVar.f(aVar);
                    Object objQ = sVar.Q();
                    if (zG || objQ == l1.m.f39353a) {
                        objQ = new n5(z11, aVar, 4);
                        sVar.o0(objQ);
                    }
                    t1.d dVar = mt.g.K0;
                    float f5 = bc.f30055a;
                    iu.k.g((fz.a) objQ, null, dVar, null, null, null, bc.f(((s1) sVar.j(v1.f31180a)).f31031n, 0L, sVar, 30), null, sVar, 384, 186);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                a2.c(z11, aVar, (l1.n) obj, l1.t.M(49));
                break;
        }
        return b0Var;
    }

    public /* synthetic */ i(boolean z11, fz.a aVar, int i11, int i12) {
        this.f5042a = i12;
        this.f5043b = z11;
        this.f5044c = aVar;
    }
}
