package j1;

import a0.c0;
import h1.g7;
import j0.e2;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.n implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f35452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f35453b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j11, q qVar) {
        super(3);
        this.f35452a = j11;
        this.f35453b = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        l1.s sVar;
        q qVar;
        boolean zF;
        Object objQ;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((l1.s) nVar).g(zBooleanValue) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18) {
            l1.s sVar2 = (l1.s) nVar;
            if (sVar2.F()) {
                sVar2.W();
            } else if (zBooleanValue) {
                l1.s sVar3 = (l1.s) nVar;
                sVar3.d0(576835739);
                g7.b(j.f35485a, 0, 390, 24, this.f35452a, 0L, sVar3, e2.n(z1.o.f58481a, j.f35487c));
                sVar3.p(false);
            } else {
                sVar = (l1.s) nVar;
                sVar.d0(577079337);
                qVar = this.f35453b;
                zF = sVar.f(qVar);
                objQ = sVar.Q();
                if (zF || objQ == l1.m.f39353a) {
                    objQ = new c0(qVar, 13);
                    sVar.o0(objQ);
                }
                j.b((fz.a) objQ, this.f35452a, sVar, 0);
                sVar.p(false);
            }
        } else if (zBooleanValue) {
            l1.s sVar4 = (l1.s) nVar;
            sVar4.d0(576835739);
            g7.b(j.f35485a, 0, 390, 24, this.f35452a, 0L, sVar4, e2.n(z1.o.f58481a, j.f35487c));
            sVar4.p(false);
        } else {
            sVar = (l1.s) nVar;
            sVar.d0(577079337);
            qVar = this.f35453b;
            zF = sVar.f(qVar);
            objQ = sVar.Q();
            if (zF) {
                objQ = new c0(qVar, 13);
                sVar.o0(objQ);
            } else {
                objQ = new c0(qVar, 13);
                sVar.o0(objQ);
            }
            j.b((fz.a) objQ, this.f35452a, sVar, 0);
            sVar.p(false);
        }
        return b0.f48488a;
    }
}
