package s0;

import j0.e2;
import l1.b3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f51058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j3.y0 f51059c;

    public i0(int i11, int i12, j3.y0 y0Var) {
        this.f51057a = i11;
        this.f51058b = i12;
        this.f51059c = y0Var;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        l1.s sVar = (l1.s) ((l1.n) obj2);
        sVar.d0(408240218);
        int i11 = this.f51057a;
        int i12 = this.f51058b;
        o0.A(i11, i12);
        z1.o oVar = z1.o.f58481a;
        if (i11 == 1 && i12 == Integer.MAX_VALUE) {
            sVar.p(false);
            return oVar;
        }
        v3.c cVar = (v3.c) sVar.j(z2.g1.f58547h);
        n3.h hVar = (n3.h) sVar.j(z2.g1.f58550k);
        v3.m mVar = (v3.m) sVar.j(z2.g1.f58552n);
        j3.y0 y0Var = this.f51059c;
        boolean zF = sVar.f(y0Var) | sVar.d(mVar.ordinal());
        Object objQ = sVar.Q();
        l1.g gVar = l1.m.f39353a;
        if (zF || objQ == gVar) {
            objQ = j3.t.j(y0Var, mVar);
            sVar.o0(objQ);
        }
        j3.y0 y0Var2 = (j3.y0) objQ;
        boolean zF2 = sVar.f(hVar) | sVar.f(y0Var2);
        Object objQ2 = sVar.Q();
        if (zF2 || objQ2 == gVar) {
            j3.p0 p0Var = y0Var2.f35827a;
            n3.i iVar = p0Var.f35759f;
            n3.s sVar2 = p0Var.f35756c;
            if (sVar2 == null) {
                sVar2 = n3.s.f43178t;
            }
            n3.o oVar2 = p0Var.f35757d;
            int i13 = oVar2 != null ? oVar2.f43170a : 0;
            n3.p pVar = p0Var.f35758e;
            objQ2 = ((n3.j) hVar).b(iVar, sVar2, i13, pVar != null ? pVar.f43171a : 65535);
            sVar.o0(objQ2);
        }
        b3 b3Var = (b3) objQ2;
        boolean zF3 = sVar.f(b3Var.getValue()) | sVar.f(cVar) | sVar.f(hVar) | sVar.f(y0Var) | sVar.d(mVar.ordinal());
        Object objQ3 = sVar.Q();
        if (zF3 || objQ3 == gVar) {
            objQ3 = Integer.valueOf((int) (d1.a(y0Var2, cVar, hVar, d1.f51015a, 1) & 4294967295L));
            sVar.o0(objQ3);
        }
        int iIntValue = ((Number) objQ3).intValue();
        boolean zF4 = sVar.f(b3Var.getValue()) | sVar.f(cVar) | sVar.f(hVar) | sVar.f(y0Var) | sVar.d(mVar.ordinal());
        Object objQ4 = sVar.Q();
        if (zF4 || objQ4 == gVar) {
            StringBuilder sb2 = new StringBuilder();
            String str = d1.f51015a;
            sb2.append(str);
            sb2.append('\n');
            sb2.append(str);
            objQ4 = Integer.valueOf((int) (d1.a(y0Var2, cVar, hVar, sb2.toString(), 2) & 4294967295L));
            sVar.o0(objQ4);
        }
        int iIntValue2 = ((Number) objQ4).intValue() - iIntValue;
        Integer numValueOf = i11 == 1 ? null : Integer.valueOf(((i11 - 1) * iIntValue2) + iIntValue);
        Integer numValueOf2 = i12 != Integer.MAX_VALUE ? Integer.valueOf(((i12 - 1) * iIntValue2) + iIntValue) : null;
        z1.r rVarH = e2.h(oVar, numValueOf != null ? cVar.Q(numValueOf.intValue()) : Float.NaN, numValueOf2 != null ? cVar.Q(numValueOf2.intValue()) : Float.NaN);
        sVar.p(false);
        return rVarH;
    }
}
