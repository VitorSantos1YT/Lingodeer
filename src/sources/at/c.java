package at;

import bt.o1;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import g2.t;
import h1.ua;
import j0.a2;
import j0.e2;
import j0.t1;
import j0.u;
import j0.v;
import j0.v1;
import j0.z1;
import j3.y0;
import l1.q1;
import qy.b0;
import rt.ae;
import rt.ed;
import rt.uf;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2857a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f2859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2862f;

    public /* synthetic */ c(fz.c cVar, uf ufVar, boolean z11, ed edVar, t tVar) {
        this.f2859c = cVar;
        this.f2860d = ufVar;
        this.f2858b = z11;
        this.f2861e = edVar;
        this.f2862f = tVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f2857a) {
            case 0:
                uf ufVar = (uf) this.f2860d;
                ed edVar = (ed) this.f2861e;
                t tVar = (t) this.f2862f;
                v Card = (v) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarD = e2.d(oVar, 1.0f);
                    fz.c cVar = this.f2859c;
                    boolean zF = sVar.f(cVar) | sVar.f(ufVar);
                    Object objQ = sVar.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new f(1, cVar, ufVar);
                        sVar.o0(objQ);
                    }
                    float f5 = 20;
                    z1.r rVarE = j0.c.E(d0.n.o(rVarD, false, null, (fz.a) objQ, 15), f5, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, 10);
                    a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarE);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    y2.h hVar = y2.j.f56917f;
                    l1.t.J(hVar, a2VarA, sVar);
                    y2.h hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL, sVar);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
                    }
                    y2.h hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC, sVar);
                    q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    q1 q1VarL2 = sVar.l();
                    z1.r rVarC2 = z1.a.c(sVar, oVar);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar, q0VarD, sVar);
                    l1.t.J(hVar2, q1VarL2, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC2, sVar);
                    j0.o.a(d0.n.g(e2.n(oVar, 42), tVar, r0.f.d(12), 4), sVar, 0);
                    d0.n.c(se.k.y(R.drawable.ic_lesson_index_tips, sVar, 0), null, e2.n(oVar, 30), null, null, d0.n.t(sVar) ? 0.8f : 1.0f, null, sVar, 432, 88);
                    sVar.p(true);
                    z1.r rVarE2 = j0.c.E(oVar, 18, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    z1.r rVarP = w4.c.p(1.0f, true, rVarE2);
                    u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                    int iHashCode3 = Long.hashCode(sVar.T);
                    q1 q1VarL3 = sVar.l();
                    z1.r rVarC3 = z1.a.c(sVar, rVarP);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar, uVarA, sVar);
                    l1.t.J(hVar2, q1VarL3, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                    }
                    l1.t.J(hVar4, rVarC3, sVar);
                    ua.b(ub.a.e0(sVar, R.string.tips), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), edVar.f49701g, j3.A(19), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 0, 0, 65534);
                    sVar.p(true);
                    int i11 = this.f2858b ? R.drawable.ic_lesson_index_lesson_redo : R.drawable.ic_lesson_index_lesson_start;
                    if (ufVar.f50516c) {
                        sVar.d0(-266477081);
                        d0.n.c(se.k.y(i11, sVar, 0), null, d2.h.i(oVar, iu.k.p(sVar), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(edVar.f49701g, 5), sVar, 48, 56);
                        sVar.p(false);
                    } else {
                        sVar.d0(-266689555);
                        d0.n.c(se.k.y(R.drawable.ic_lesson_index_pro, sVar, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 124);
                        sVar.p(false);
                    }
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            default:
                ae aeVar = (ae) this.f2860d;
                fz.a aVar = (fz.a) this.f2861e;
                fz.c cVar2 = (fz.c) this.f2862f;
                t1 innerPadding = (t1) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(innerPadding, "innerPadding");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((l1.s) nVar2).f(innerPadding) ? 4 : 2;
                }
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    z1.r rVarZ = j0.c.z(e2.d(z1.o.f58481a, 1.0f), innerPadding);
                    float f11 = 16;
                    v1 v1Var = new v1(f11, f11, f11, f11);
                    j0.g gVarG = j0.i.g(12);
                    boolean zH = sVar2.h(aeVar) | sVar2.f(aVar);
                    boolean z11 = this.f2858b;
                    boolean zG = zH | sVar2.g(z11);
                    fz.c cVar3 = this.f2859c;
                    boolean zF2 = zG | sVar2.f(cVar3) | sVar2.f(cVar2);
                    Object objQ2 = sVar2.Q();
                    if (zF2 || objQ2 == l1.m.f39353a) {
                        o1 o1Var = new o1(aeVar, aVar, z11, cVar3, cVar2);
                        sVar2.o0(o1Var);
                        objQ2 = o1Var;
                    }
                    ue.f.a(rVarZ, null, v1Var, gVarG, null, null, false, null, (fz.c) objQ2, sVar2, 24960, 490);
                } else {
                    sVar2.W();
                }
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ c(ae aeVar, fz.a aVar, boolean z11, fz.c cVar, fz.c cVar2) {
        this.f2860d = aeVar;
        this.f2861e = aVar;
        this.f2858b = z11;
        this.f2859c = cVar;
        this.f2862f = cVar2;
    }
}
