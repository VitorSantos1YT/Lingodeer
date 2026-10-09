package xg;

import android.os.Bundle;
import km.s0;
import l1.b1;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import qy.b0;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f56051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f56052c;

    public /* synthetic */ a(d dVar, Bundle bundle, int i11) {
        this.f56050a = i11;
        this.f56051b = dVar;
        this.f56052c = bundle;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f56050a;
        n nVar = (n) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                s sVar = (s) nVar;
                boolean zT = sVar.T(iIntValue & 1, (iIntValue & 3) != 2);
                b0 b0Var = b0.f48488a;
                if (zT) {
                    float f5 = 840;
                    float f11 = 600;
                    Object objQ = sVar.Q();
                    l1.g gVar = m.f39353a;
                    if (objQ == gVar) {
                        objQ = t.B(Boolean.FALSE);
                        sVar.o0(objQ);
                    }
                    b1 b1Var = (b1) objQ;
                    v3.c cVar = (v3.c) sVar.j(g1.f58547h);
                    v3.f fVar = new v3.f(f5);
                    v3.f fVar2 = new v3.f(f11);
                    d dVar = this.f56051b;
                    Object[] objArr = {dVar, cVar, fVar, fVar2};
                    boolean zH = sVar.h(dVar) | sVar.f(cVar) | sVar.c(f11) | sVar.c(f5);
                    Object objQ2 = sVar.Q();
                    if (zH || objQ2 == gVar) {
                        f fVar3 = new f(dVar, cVar, f11, f5, b1Var, null);
                        sVar.o0(fVar3);
                        objQ2 = fVar3;
                    }
                    t.i(objArr, (fz.e) objQ2, sVar);
                    boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
                    boolean zH2 = sVar.h(dVar);
                    Object objQ3 = sVar.Q();
                    if (zH2 || objQ3 == gVar) {
                        objQ3 = new s0(dVar, null, 15);
                        sVar.o0(objQ3);
                    }
                    t.f((fz.e) objQ3, b0Var, sVar);
                    ju.f.a(false, t1.e.d(-1627375739, new bp.b0(zBooleanValue, dVar, this.f56052c, 12), sVar), sVar, 48);
                } else {
                    sVar.W();
                }
                return b0Var;
            case 1:
                s sVar2 = (s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d dVar2 = this.f56051b;
                    ct.c.a(dVar2.l(), t1.e.d(605126557, new a(dVar2, this.f56052c, 2), sVar2), sVar2, 48);
                } else {
                    sVar2.W();
                }
                return b0.f48488a;
            default:
                s sVar3 = (s) nVar;
                if (sVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.f56051b.j(this.f56052c, sVar3, 0);
                } else {
                    sVar3.W();
                }
                return b0.f48488a;
        }
    }
}
