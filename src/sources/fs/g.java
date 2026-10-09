package fs;

import bp.z1;
import ht.o;
import i0.pKy.shrCcjmOhAmRC;
import j9.v;
import js.r;
import l1.b1;
import l1.b3;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import qy.b0;
import rt.ac;
import rt.bc;
import rt.gc;
import rt.h9;
import rt.l9;
import rt.rc;
import xu.q1;
import zu.i2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28024a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f28025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f28028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f28029f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f28030t;

    public /* synthetic */ g(fz.a aVar, fz.a aVar2, fz.c cVar, fz.a aVar3, fz.a aVar4, fz.a aVar5, fz.a aVar6, fz.a aVar7, fz.a aVar8, fz.a aVar9, i2 i2Var, int i11) {
        this.f28025b = aVar;
        this.f28026c = aVar2;
        this.f28027d = cVar;
        this.f28028e = aVar3;
        this.f28029f = aVar4;
        this.f28030t = aVar5;
        this.H = aVar6;
        this.K = aVar7;
        this.L = aVar8;
        this.M = aVar9;
        this.N = i2Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28024a) {
            case 0:
                final r rVar = (r) this.f28026c;
                l9 l9Var = (l9) this.f28027d;
                v vVar = (v) this.f28028e;
                b3 b3Var = (b3) this.f28029f;
                b3 b3Var2 = (b3) this.f28030t;
                b3 b3Var3 = (b3) this.H;
                b3 b3Var4 = (b3) this.K;
                b3 b3Var5 = (b3) this.L;
                b1 b1Var = (b1) this.M;
                b1 b1Var2 = (b1) this.N;
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rc rcVar = (rc) b3Var.getValue();
                    h9 h9Var = (h9) b3Var2.getValue();
                    gc gcVar = (gc) b3Var3.getValue();
                    int iIntValue2 = ((Number) b3Var4.getValue()).intValue();
                    boolean zBooleanValue = ((Boolean) b3Var5.getValue()).booleanValue();
                    boolean zH = sVar.h(rVar);
                    Object objQ = sVar.Q();
                    l1.g gVar = m.f39353a;
                    if (zH || objQ == gVar) {
                        objQ = new a(rVar, 0);
                        sVar.o0(objQ);
                    }
                    fz.a aVar = (fz.a) objQ;
                    boolean zH2 = sVar.h(l9Var);
                    Object objQ2 = sVar.Q();
                    if (zH2 || objQ2 == gVar) {
                        objQ2 = new b(l9Var, 0);
                        sVar.o0(objQ2);
                    }
                    fz.c cVar = (fz.c) objQ2;
                    boolean zH3 = sVar.h(rVar);
                    Object objQ3 = sVar.Q();
                    if (zH3 || objQ3 == gVar) {
                        final int i11 = 0;
                        objQ3 = new fz.e() { // from class: fs.c
                            @Override // fz.e
                            public final Object invoke(Object obj3, Object obj4) {
                                int i12 = i11;
                                o courseTestParams = (o) obj3;
                                long jLongValue = ((Long) obj4).longValue();
                                switch (i12) {
                                    case 0:
                                        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
                                        rVar.t(new ac(jLongValue, -1L, false));
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.f(courseTestParams, shrCcjmOhAmRC.XeKqUPoDcSIMby);
                                        rVar.t(new bc(jLongValue, -1L, false));
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar.o0(objQ3);
                    }
                    fz.e eVar = (fz.e) objQ3;
                    boolean zH4 = sVar.h(rVar);
                    Object objQ4 = sVar.Q();
                    if (zH4 || objQ4 == gVar) {
                        final int i12 = 1;
                        objQ4 = new fz.e() { // from class: fs.c
                            @Override // fz.e
                            public final Object invoke(Object obj3, Object obj4) {
                                int i13 = i12;
                                o courseTestParams = (o) obj3;
                                long jLongValue = ((Long) obj4).longValue();
                                switch (i13) {
                                    case 0:
                                        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
                                        rVar.t(new ac(jLongValue, -1L, false));
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.f(courseTestParams, shrCcjmOhAmRC.XeKqUPoDcSIMby);
                                        rVar.t(new bc(jLongValue, -1L, false));
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar.o0(objQ4);
                    }
                    fz.e eVar2 = (fz.e) objQ4;
                    boolean zH5 = sVar.h(rVar);
                    Object objQ5 = sVar.Q();
                    if (zH5 || objQ5 == gVar) {
                        objQ5 = new d(rVar, 0);
                        sVar.o0(objQ5);
                    }
                    fz.c cVar2 = (fz.c) objQ5;
                    boolean zH6 = sVar.h(rVar);
                    Object objQ6 = sVar.Q();
                    if (zH6 || objQ6 == gVar) {
                        objQ6 = new a(rVar, 1);
                        sVar.o0(objQ6);
                    }
                    fz.a aVar2 = (fz.a) objQ6;
                    boolean zH7 = sVar.h(rVar);
                    Object objQ7 = sVar.Q();
                    if (zH7 || objQ7 == gVar) {
                        objQ7 = new aj.c(rVar, b1Var, b1Var2, 29);
                        sVar.o0(objQ7);
                    }
                    fz.c cVar3 = (fz.c) objQ7;
                    boolean zH8 = sVar.h(vVar);
                    Object objQ8 = sVar.Q();
                    if (zH8 || objQ8 == gVar) {
                        objQ8 = new z1(vVar, 19);
                        sVar.o0(objQ8);
                    }
                    qx.b.d(rcVar, h9Var, gcVar, iIntValue2, zBooleanValue, aVar, this.f28025b, cVar, eVar, eVar2, cVar2, aVar2, cVar3, (fz.a) objQ8, sVar, 0);
                } else {
                    sVar.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                q1.f(this.f28025b, (fz.a) this.f28026c, (fz.c) this.f28027d, (fz.a) this.f28028e, (fz.a) this.f28029f, (fz.a) this.f28030t, (fz.a) this.H, (fz.a) this.K, (fz.a) this.L, (fz.a) this.M, (i2) this.N, (n) obj, t.M(24577));
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ g(r rVar, fz.a aVar, l9 l9Var, v vVar, b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4, b1 b1Var5, b1 b1Var6, b1 b1Var7) {
        this.f28026c = rVar;
        this.f28025b = aVar;
        this.f28027d = l9Var;
        this.f28028e = vVar;
        this.f28029f = b1Var;
        this.f28030t = b1Var2;
        this.H = b1Var3;
        this.K = b1Var4;
        this.L = b1Var5;
        this.M = b1Var6;
        this.N = b1Var7;
    }
}
