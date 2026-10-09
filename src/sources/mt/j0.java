package mt;

import h1.r7;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j0 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f41563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f41564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f41565e;

    public /* synthetic */ j0(Object obj, int i11, fz.c cVar, boolean z11, int i12) {
        this.f41561a = i12;
        this.f41565e = obj;
        this.f41562b = i11;
        this.f41563c = cVar;
        this.f41564d = z11;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f41561a;
        qy.b0 b0Var = qy.b0.f48488a;
        l1.g gVar = l1.m.f39353a;
        fz.c cVar = this.f41563c;
        Object obj4 = this.f41565e;
        switch (i11) {
            case 0:
                ArrayList arrayList = (ArrayList) obj4;
                j0.u0 FlowRow = (j0.u0) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(FlowRow, "$this$FlowRow");
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    sVar.W();
                } else {
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj5 = arrayList.get(i12);
                        i12++;
                        int iIntValue2 = ((Number) obj5).intValue();
                        boolean z11 = iIntValue2 == this.f41562b;
                        float f5 = h1.f4.f30233a;
                        l1.c3 c3Var = h1.v1.f31180a;
                        boolean z12 = z11;
                        r7 r7VarA = h1.f4.a(g2.x.c(((h1.s1) sVar.j(c3Var)).f31017a, 0.16f), ((h1.s1) sVar.j(c3Var)).f31017a, sVar);
                        boolean zF = sVar.f(cVar) | sVar.d(iIntValue2);
                        Object objQ = sVar.Q();
                        if (zF || objQ == gVar) {
                            objQ = new h0(cVar, iIntValue2, 1);
                            sVar.o0(objQ);
                        }
                        l1.s sVar2 = sVar;
                        h1.m1.a(z12, (fz.a) objQ, t1.e.d(1459717632, new dt.t0(iIntValue2, 4, (byte) 0), sVar), null, this.f41564d, null, r7VarA, null, null, sVar2, 384);
                        sVar = sVar2;
                    }
                }
                break;
            default:
                String[] strArr = (String[]) obj4;
                a0.k0 AnimatedVisibility = (a0.k0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                l1.s sVar3 = (l1.s) ((l1.n) obj2);
                boolean zF2 = sVar3.f(cVar);
                Object objQ2 = sVar3.Q();
                if (zF2 || objQ2 == gVar) {
                    objQ2 = new xu.n1(cVar, 6);
                    sVar3.o0(objQ2);
                }
                ys.a.x(strArr, this.f41562b, (fz.c) objQ2, this.f41564d, sVar3, 0, 0);
                break;
        }
        return b0Var;
    }
}
