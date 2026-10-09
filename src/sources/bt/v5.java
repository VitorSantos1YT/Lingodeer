package bt;

import com.lingodeer.data.model.CourseWord;
import com.yalantis.ucrop.view.CropImageView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v5 implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6109a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f6112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6114f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f6115t;

    public /* synthetic */ v5(CourseWord courseWord, boolean z11, ht.l lVar, List list, ht.q qVar, ht.o oVar, fz.c cVar, fz.c cVar2, int i11) {
        this.f6110b = courseWord;
        this.f6112d = z11;
        this.f6111c = lVar;
        this.f6114f = list;
        this.f6115t = qVar;
        this.f6113e = oVar;
        this.H = cVar;
        this.K = cVar2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6109a) {
            case 0:
                l1.b1 b1Var = (l1.b1) this.f6110b;
                x1.p pVar = (x1.p) this.f6111c;
                rz.b0 b0Var = (rz.b0) this.f6114f;
                jt.m1 m1Var = (jt.m1) this.f6115t;
                e2.l lVar = (e2.l) this.H;
                ht.o oVar = (ht.o) this.f6113e;
                fz.e eVar = (fz.e) this.K;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
                    l1.g gVar = l1.m.f39353a;
                    if (zBooleanValue) {
                        sVar.d0(-719847199);
                        boolean zH = sVar.h(b0Var) | sVar.h(m1Var) | sVar.f(b1Var) | sVar.h(lVar);
                        Object objQ = sVar.Q();
                        if (zH || objQ == gVar) {
                            h2 h2Var = new h2(b0Var, b1Var, lVar, m1Var, 1);
                            sVar.o0(h2Var);
                            objQ = h2Var;
                        }
                        fz.a aVar = (fz.a) objQ;
                        boolean zH2 = sVar.h(m1Var);
                        Object objQ2 = sVar.Q();
                        if (zH2 || objQ2 == gVar) {
                            objQ2 = new e2(m1Var, 2);
                            sVar.o0(objQ2);
                        }
                        d3.a(pVar, null, null, CropImageView.DEFAULT_ASPECT_RATIO, this.f6112d, aVar, (fz.c) objQ2, null, sVar, 0, 142);
                        sVar.p(false);
                    } else {
                        sVar.d0(-719283774);
                        float f5 = 26;
                        z1.o oVar2 = z1.o.f58481a;
                        j0.c.g(sVar, j0.e2.g(oVar2, f5));
                        boolean z11 = !oVar.f33757e;
                        boolean zF = sVar.f(eVar);
                        Object objQ3 = sVar.Q();
                        if (zF || objQ3 == gVar) {
                            objQ3 = new b0.p1(11, eVar);
                            sVar.o0(objQ3);
                        }
                        dt.d4.a(pVar, null, null, z11, false, null, null, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, (fz.c) objQ3, sVar, 0, 0, 0, 2097142);
                        ep.a.C(oVar2, f5, sVar, false);
                    }
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                l1.b1 b1Var2 = (l1.b1) this.f6110b;
                x1.p pVar2 = (x1.p) this.f6111c;
                l1.b1 b1Var3 = (l1.b1) this.H;
                l1.b1 b1Var4 = (l1.b1) this.K;
                ht.o oVar3 = (ht.o) this.f6113e;
                rz.b0 b0Var2 = (rz.b0) this.f6114f;
                jt.m1 m1Var2 = (jt.m1) this.f6115t;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (((Boolean) b1Var2.getValue()).booleanValue()) {
                        sVar2.d0(1909968146);
                    } else {
                        sVar2.d0(1918027402);
                        int iIntValue3 = ((Number) b1Var3.getValue()).intValue();
                        boolean zBooleanValue2 = ((Boolean) b1Var4.getValue()).booleanValue();
                        boolean z12 = !oVar3.f33757e;
                        boolean zH3 = sVar2.h(b0Var2) | sVar2.h(m1Var2);
                        Object objQ4 = sVar2.Q();
                        l1.g gVar2 = l1.m.f39353a;
                        if (zH3 || objQ4 == gVar2) {
                            objQ4 = new au.d1(20, b0Var2, m1Var2);
                            sVar2.o0(objQ4);
                        }
                        fz.c cVar = (fz.c) objQ4;
                        boolean zH4 = sVar2.h(b0Var2) | sVar2.h(m1Var2);
                        Object objQ5 = sVar2.Q();
                        if (zH4 || objQ5 == gVar2) {
                            objQ5 = new g2(b0Var2, m1Var2, 5);
                            sVar2.o0(objQ5);
                        }
                        fz.a aVar2 = (fz.a) objQ5;
                        boolean zH5 = sVar2.h(b0Var2) | sVar2.h(m1Var2);
                        Object objQ6 = sVar2.Q();
                        if (zH5 || objQ6 == gVar2) {
                            objQ6 = new g2(b0Var2, m1Var2, 6);
                            sVar2.o0(objQ6);
                        }
                        fz.a aVar3 = (fz.a) objQ6;
                        boolean zH6 = sVar2.h(b0Var2) | sVar2.h(m1Var2);
                        Object objQ7 = sVar2.Q();
                        if (zH6 || objQ7 == gVar2) {
                            objQ7 = new g2(b0Var2, m1Var2, 7);
                            sVar2.o0(objQ7);
                        }
                        d3.b(pVar2, iIntValue3, zBooleanValue2, this.f6112d, false, false, false, false, false, z12, CropImageView.DEFAULT_ASPECT_RATIO, cVar, aVar2, aVar3, (fz.a) objQ7, null, null, sVar2, 0, 99824);
                        sVar2 = sVar2;
                    }
                    sVar2.p(false);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            case 2:
                ((Integer) obj2).getClass();
                b.M((CourseWord) this.f6110b, this.f6112d, (ht.l) this.f6111c, (List) this.f6114f, (ht.q) this.f6115t, (ht.o) this.f6113e, (fz.c) this.H, (fz.c) this.K, (l1.n) obj, l1.t.M(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ue.f.b((z1.r) this.f6110b, (l0.w) this.f6111c, (j0.t1) this.f6114f, (j0.h) this.f6115t, (z1.d) this.H, (f0.t0) this.f6113e, this.f6112d, (fz.c) this.K, (l1.n) obj, l1.t.M(1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ v5(l1.b1 b1Var, x1.p pVar, l1.b1 b1Var2, l1.b1 b1Var3, boolean z11, ht.o oVar, rz.b0 b0Var, jt.m1 m1Var) {
        this.f6110b = b1Var;
        this.f6111c = pVar;
        this.H = b1Var2;
        this.K = b1Var3;
        this.f6112d = z11;
        this.f6113e = oVar;
        this.f6114f = b0Var;
        this.f6115t = m1Var;
    }

    public /* synthetic */ v5(l1.b1 b1Var, x1.p pVar, boolean z11, rz.b0 b0Var, jt.m1 m1Var, e2.l lVar, ht.o oVar, fz.e eVar) {
        this.f6110b = b1Var;
        this.f6111c = pVar;
        this.f6112d = z11;
        this.f6114f = b0Var;
        this.f6115t = m1Var;
        this.H = lVar;
        this.f6113e = oVar;
        this.K = eVar;
    }

    public /* synthetic */ v5(z1.r rVar, l0.w wVar, j0.t1 t1Var, j0.h hVar, z1.d dVar, f0.t0 t0Var, boolean z11, fz.c cVar, int i11) {
        this.f6110b = rVar;
        this.f6111c = wVar;
        this.f6114f = t1Var;
        this.f6115t = hVar;
        this.H = dVar;
        this.f6113e = t0Var;
        this.f6112d = z11;
        this.K = cVar;
    }
}
