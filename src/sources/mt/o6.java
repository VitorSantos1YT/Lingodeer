package mt;

import java.util.List;
import rt.ud;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o6 implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f41737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f41738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f41739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f41740d;

    public o6(List list, boolean z11, fz.c cVar, fz.c cVar2) {
        this.f41737a = list;
        this.f41738b = z11;
        this.f41739c = cVar;
        this.f41740d = cVar2;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        l0.c cVar = (l0.c) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.n nVar = (l1.n) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i11 = (((l1.s) nVar).f(cVar) ? 4 : 2) | iIntValue2;
        } else {
            i11 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i11 |= ((l1.s) nVar).d(iIntValue) ? 32 : 16;
        }
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(i11 & 1, (i11 & 147) != 146)) {
            ud udVar = (ud) this.f41737a.get(iIntValue);
            sVar.d0(-837033853);
            boolean z11 = !this.f41738b;
            fz.c cVar2 = this.f41739c;
            boolean zF = sVar.f(cVar2) | sVar.f(udVar);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = new n6(cVar2, udVar, 0);
                sVar.o0(objQ);
            }
            fz.a aVar = (fz.a) objQ;
            fz.c cVar3 = this.f41740d;
            boolean zF2 = sVar.f(cVar3) | sVar.f(udVar);
            Object objQ2 = sVar.Q();
            if (zF2 || objQ2 == gVar) {
                objQ2 = new n6(cVar3, udVar, 1);
                sVar.o0(objQ2);
            }
            y3.u(udVar, z11, aVar, (fz.a) objQ2, sVar, 0);
            sVar.p(false);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }
}
