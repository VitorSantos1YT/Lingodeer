package j0;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35390a;

    public /* synthetic */ q2(int i11) {
        this.f35390a = i11;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f35390a;
        l1.g gVar = l1.m.f39353a;
        switch (i11) {
            case 0:
                ((Number) obj3).intValue();
                l1.s sVar = (l1.s) ((l1.n) obj2);
                sVar.d0(359872873);
                WeakHashMap weakHashMap = o2.f35353v;
                o2 o2VarE = b.e(sVar);
                boolean zF = sVar.f(o2VarE);
                Object objQ = sVar.Q();
                if (zF || objQ == gVar) {
                    objQ = new z0(o2VarE.f35356c);
                    sVar.o0(objQ);
                }
                z0 z0Var = (z0) objQ;
                sVar.p(false);
                return z0Var;
            case 1:
                ((Number) obj3).intValue();
                l1.s sVar2 = (l1.s) ((l1.n) obj2);
                sVar2.d0(359872873);
                WeakHashMap weakHashMap2 = o2.f35353v;
                o2 o2VarE2 = b.e(sVar2);
                boolean zF2 = sVar2.f(o2VarE2);
                Object objQ2 = sVar2.Q();
                if (zF2 || objQ2 == gVar) {
                    objQ2 = new z0(o2VarE2.f35358e);
                    sVar2.o0(objQ2);
                }
                z0 z0Var2 = (z0) objQ2;
                sVar2.p(false);
                return z0Var2;
            default:
                ((Number) obj3).intValue();
                l1.s sVar3 = (l1.s) ((l1.n) obj2);
                sVar3.d0(359872873);
                WeakHashMap weakHashMap3 = o2.f35353v;
                o2 o2VarE3 = b.e(sVar3);
                boolean zF3 = sVar3.f(o2VarE3);
                Object objQ3 = sVar3.Q();
                if (zF3 || objQ3 == gVar) {
                    objQ3 = new z0(o2VarE3.f35359f);
                    sVar3.o0(objQ3);
                }
                z0 z0Var3 = (z0) objQ3;
                sVar3.p(false);
                return z0Var3;
        }
    }
}
