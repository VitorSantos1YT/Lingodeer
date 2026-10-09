package bt;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x1 implements fz.e {
    public final /* synthetic */ l1.b1 H;
    public final /* synthetic */ x1.p K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ l1.b1 N;
    public final /* synthetic */ l1.i1 O;
    public final /* synthetic */ fz.e P;
    public final /* synthetic */ rz.b0 Q;
    public final /* synthetic */ jt.m1 R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6171a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f6172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ht.o f6173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f6174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f6175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f6176f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f6177t;

    public /* synthetic */ x1(l1.b1 b1Var, ht.o oVar, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4, l1.b1 b1Var5, l1.b1 b1Var6, x1.p pVar, boolean z11, boolean z12, l1.b1 b1Var7, l1.i1 i1Var, fz.e eVar, rz.b0 b0Var, jt.m1 m1Var) {
        this.f6172b = b1Var;
        this.f6173c = oVar;
        this.f6174d = b1Var2;
        this.f6175e = b1Var3;
        this.f6176f = b1Var4;
        this.f6177t = b1Var5;
        this.H = b1Var6;
        this.K = pVar;
        this.L = z11;
        this.M = z12;
        this.N = b1Var7;
        this.O = i1Var;
        this.P = eVar;
        this.Q = b0Var;
        this.R = m1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        boolean z11;
        Object f2Var;
        jt.m1 m1Var;
        boolean z12;
        switch (this.f6171a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (((Boolean) this.f6172b.getValue()).booleanValue()) {
                        z11 = false;
                        sVar.d0(-819059904);
                    } else {
                        sVar.d0(-798844432);
                        int iIntValue2 = ((Number) this.f6174d.getValue()).intValue();
                        boolean zBooleanValue = ((Boolean) this.f6175e.getValue()).booleanValue();
                        l1.b1 b1Var = this.f6176f;
                        boolean zBooleanValue2 = ((Boolean) b1Var.getValue()).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) this.f6177t.getValue()).booleanValue();
                        boolean zBooleanValue4 = ((Boolean) this.H.getValue()).booleanValue();
                        ht.o oVar = this.f6173c;
                        boolean z13 = true ^ oVar.f33757e;
                        l1.b1 b1Var2 = this.N;
                        boolean zF = sVar.f(b1Var2);
                        boolean z14 = this.M;
                        boolean zG = zF | sVar.g(z14) | sVar.f(b1Var) | sVar.f(oVar);
                        l1.i1 i1Var = this.O;
                        boolean zF2 = zG | sVar.f(i1Var);
                        fz.e eVar = this.P;
                        boolean zF3 = zF2 | sVar.f(eVar);
                        rz.b0 b0Var = this.Q;
                        boolean zH = zF3 | sVar.h(b0Var);
                        jt.m1 m1Var2 = this.R;
                        boolean zH2 = zH | sVar.h(m1Var2);
                        Object objQ = sVar.Q();
                        l1.g gVar = l1.m.f39353a;
                        if (zH2 || objQ == gVar) {
                            f2Var = new f2(b1Var2, z14, b1Var, b0Var, oVar, i1Var, eVar, m1Var2, 0);
                            m1Var = m1Var2;
                            sVar.o0(f2Var);
                        } else {
                            f2Var = objQ;
                            m1Var = m1Var2;
                        }
                        fz.c cVar = (fz.c) f2Var;
                        boolean zH3 = sVar.h(b0Var) | sVar.h(m1Var);
                        Object objQ2 = sVar.Q();
                        if (zH3 || objQ2 == gVar) {
                            objQ2 = new g2(b0Var, m1Var, 0);
                            sVar.o0(objQ2);
                        }
                        fz.a aVar = (fz.a) objQ2;
                        boolean zH4 = sVar.h(b0Var) | sVar.h(m1Var);
                        Object objQ3 = sVar.Q();
                        if (zH4 || objQ3 == gVar) {
                            objQ3 = new g2(b0Var, m1Var, 1);
                            sVar.o0(objQ3);
                        }
                        fz.a aVar2 = (fz.a) objQ3;
                        boolean zH5 = sVar.h(b0Var) | sVar.h(m1Var);
                        Object objQ4 = sVar.Q();
                        if (zH5 || objQ4 == gVar) {
                            objQ4 = new g2(b0Var, m1Var, 2);
                            sVar.o0(objQ4);
                        }
                        fz.a aVar3 = (fz.a) objQ4;
                        boolean zH6 = sVar.h(b0Var) | sVar.h(m1Var);
                        Object objQ5 = sVar.Q();
                        if (zH6 || objQ5 == gVar) {
                            objQ5 = new g2(b0Var, m1Var, 3);
                            sVar.o0(objQ5);
                        }
                        fz.a aVar4 = (fz.a) objQ5;
                        boolean zH7 = sVar.h(b0Var) | sVar.h(m1Var);
                        Object objQ6 = sVar.Q();
                        if (zH7 || objQ6 == gVar) {
                            objQ6 = new g2(b0Var, m1Var, 4);
                            sVar.o0(objQ6);
                        }
                        d3.b(this.K, iIntValue2, zBooleanValue, this.L, zBooleanValue2, zBooleanValue3, zBooleanValue4, z14, true, z13, CropImageView.DEFAULT_ASPECT_RATIO, cVar, aVar, aVar2, aVar3, aVar4, (fz.a) objQ6, sVar, 100663296, 1024);
                        z11 = false;
                    }
                    sVar.p(z11);
                } else {
                    sVar.W();
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    if (((Boolean) this.f6172b.getValue()).booleanValue()) {
                        z12 = false;
                        sVar2.d0(-351335262);
                    } else {
                        sVar2.d0(-328533739);
                        ht.o oVar2 = this.f6173c;
                        boolean z15 = !oVar2.f33759g;
                        l1.b1 b1Var3 = this.f6174d;
                        boolean zBooleanValue5 = ((Boolean) b1Var3.getValue()).booleanValue();
                        boolean zBooleanValue6 = ((Boolean) this.f6175e.getValue()).booleanValue();
                        boolean zBooleanValue7 = ((Boolean) this.f6176f.getValue()).booleanValue();
                        int iIntValue4 = ((Number) this.f6177t.getValue()).intValue();
                        boolean zBooleanValue8 = ((Boolean) this.H.getValue()).booleanValue();
                        boolean z16 = true ^ oVar2.f33757e;
                        l1.b1 b1Var4 = this.N;
                        boolean zF4 = sVar2.f(b1Var4);
                        boolean z17 = this.M;
                        boolean zG2 = zF4 | sVar2.g(z17) | sVar2.f(b1Var3) | sVar2.f(oVar2);
                        l1.i1 i1Var2 = this.O;
                        boolean zF5 = zG2 | sVar2.f(i1Var2);
                        fz.e eVar2 = this.P;
                        boolean zF6 = zF5 | sVar2.f(eVar2);
                        rz.b0 b0Var2 = this.Q;
                        boolean zH8 = zF6 | sVar2.h(b0Var2);
                        jt.m1 m1Var3 = this.R;
                        boolean zH9 = zH8 | sVar2.h(m1Var3);
                        Object objQ7 = sVar2.Q();
                        l1.g gVar2 = l1.m.f39353a;
                        if (zH9 || objQ7 == gVar2) {
                            f2 f2Var2 = new f2(b1Var4, z17, b1Var3, b0Var2, oVar2, i1Var2, eVar2, m1Var3, 1);
                            sVar2.o0(f2Var2);
                            objQ7 = f2Var2;
                        }
                        fz.c cVar2 = (fz.c) objQ7;
                        boolean zH10 = sVar2.h(b0Var2) | sVar2.h(m1Var3);
                        Object objQ8 = sVar2.Q();
                        if (zH10 || objQ8 == gVar2) {
                            objQ8 = new g2(b0Var2, m1Var3, 8);
                            sVar2.o0(objQ8);
                        }
                        fz.a aVar5 = (fz.a) objQ8;
                        boolean zH11 = sVar2.h(b0Var2) | sVar2.h(m1Var3);
                        Object objQ9 = sVar2.Q();
                        if (zH11 || objQ9 == gVar2) {
                            objQ9 = new g2(b0Var2, m1Var3, 9);
                            sVar2.o0(objQ9);
                        }
                        fz.a aVar6 = (fz.a) objQ9;
                        boolean zH12 = sVar2.h(b0Var2) | sVar2.h(m1Var3);
                        Object objQ10 = sVar2.Q();
                        if (zH12 || objQ10 == gVar2) {
                            objQ10 = new g2(b0Var2, m1Var3, 10);
                            sVar2.o0(objQ10);
                        }
                        fz.a aVar7 = (fz.a) objQ10;
                        boolean zH13 = sVar2.h(b0Var2) | sVar2.h(m1Var3);
                        Object objQ11 = sVar2.Q();
                        if (zH13 || objQ11 == gVar2) {
                            objQ11 = new g2(b0Var2, m1Var3, 11);
                            sVar2.o0(objQ11);
                        }
                        fz.a aVar8 = (fz.a) objQ11;
                        boolean zH14 = sVar2.h(b0Var2) | sVar2.h(m1Var3);
                        Object objQ12 = sVar2.Q();
                        if (zH14 || objQ12 == gVar2) {
                            objQ12 = new g2(b0Var2, m1Var3, 12);
                            sVar2.o0(objQ12);
                        }
                        d3.b(this.K, iIntValue4, zBooleanValue8, this.L, zBooleanValue5, zBooleanValue6, zBooleanValue7, z17, z15, z16, CropImageView.DEFAULT_ASPECT_RATIO, cVar2, aVar5, aVar6, aVar7, aVar8, (fz.a) objQ12, sVar2, 0, 1024);
                        z12 = false;
                    }
                    sVar2.p(z12);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ x1(l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4, l1.b1 b1Var5, l1.b1 b1Var6, ht.o oVar, x1.p pVar, boolean z11, boolean z12, l1.b1 b1Var7, l1.i1 i1Var, fz.e eVar, rz.b0 b0Var, jt.m1 m1Var) {
        this.f6172b = b1Var;
        this.f6174d = b1Var2;
        this.f6175e = b1Var3;
        this.f6176f = b1Var4;
        this.f6177t = b1Var5;
        this.H = b1Var6;
        this.f6173c = oVar;
        this.K = pVar;
        this.L = z11;
        this.M = z12;
        this.N = b1Var7;
        this.O = i1Var;
        this.P = eVar;
        this.Q = b0Var;
        this.R = m1Var;
    }
}
