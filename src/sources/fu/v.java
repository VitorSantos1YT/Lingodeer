package fu;

import a0.f1;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.n2;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.b2;
import j0.e2;
import j0.z1;
import l1.b1;
import l1.q1;
import mt.n4;
import mt.y3;
import rt.qc;
import rt.rc;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f28164e;

    public /* synthetic */ v(int i11, fz.a aVar, fz.a aVar2, b1 b1Var) {
        this.f28160a = 3;
        this.f28161b = i11;
        this.f28162c = aVar;
        this.f28164e = aVar2;
        this.f28163d = b1Var;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z1.o oVar;
        l1.g gVar;
        switch (this.f28160a) {
            case 0:
                fz.a aVar = (fz.a) this.f28162c;
                b1 b1Var = (b1) this.f28163d;
                final b1 b1Var2 = (b1) this.f28164e;
                j0.v Card = (j0.v) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    z1.o oVar2 = z1.o.f58481a;
                    z1.r rVarE = j0.c.E(e2.e(oVar2, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 21, 7);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
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
                    l1.t.J(hVar, uVarA, sVar);
                    y2.h hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL, sVar);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
                    }
                    y2.h hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC, sVar);
                    a.j(0, ((s1) sVar.j(v1.f31180a)).f31036s, aVar, sVar, ((Boolean) b1Var.getValue()).booleanValue());
                    z1.r rVarG = e2.g(e2.e(oVar2, 1.0f), 200);
                    q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    q1 q1VarL2 = sVar.l();
                    z1.r rVarC2 = z1.a.c(sVar, rVarG);
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
                    Boolean bool = (Boolean) b1Var.getValue();
                    bool.getClass();
                    Object objQ = sVar.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = new n2(10);
                        sVar.o0(objQ);
                    }
                    final int i11 = this.f28161b;
                    a0.o.b(bool, null, (fz.c) objQ, null, BuildConfig.VERSION_NAME, null, t1.e.d(1683344384, new fz.g() { // from class: fu.p
                        @Override // fz.g
                        public final Object f(Object obj4, Object obj5, Object obj6, Object obj7) {
                            a0.r AnimatedContent = (a0.r) obj4;
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            ((Integer) obj7).getClass();
                            kotlin.jvm.internal.m.f(AnimatedContent, "$this$AnimatedContent");
                            l1.s sVar2 = (l1.s) ((l1.n) obj6);
                            if (zBooleanValue) {
                                sVar2.d0(474444599);
                                z1.o oVar3 = z1.o.f58481a;
                                z1.r rVarD = e2.d(oVar3, 1.0f);
                                q0 q0VarD2 = j0.o.d(z1.c.f58464b, false);
                                int iHashCode3 = Long.hashCode(sVar2.T);
                                q1 q1VarL3 = sVar2.l();
                                z1.r rVarC3 = z1.a.c(sVar2, rVarD);
                                y2.k.J.getClass();
                                y2.i iVar2 = y2.j.f56913b;
                                sVar2.h0();
                                if (sVar2.S) {
                                    sVar2.k(iVar2);
                                } else {
                                    sVar2.r0();
                                }
                                l1.t.J(y2.j.f56917f, q0VarD2, sVar2);
                                l1.t.J(y2.j.f56916e, q1VarL3, sVar2);
                                y2.h hVar5 = y2.j.f56918g;
                                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                                    defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar5);
                                }
                                l1.t.J(y2.j.f56915d, rVarC3, sVar2);
                                if (((Boolean) b1Var2.getValue()).booleanValue()) {
                                    sVar2.d0(1494188618);
                                    a.n(0, 1, sVar2, null);
                                } else {
                                    sVar2.d0(1488374785);
                                }
                                sVar2.p(false);
                                a.q(i11, j0.r.f35391a.a(oVar3, z1.c.H), sVar2, 0, 0);
                                sVar2.p(true);
                            } else {
                                sVar2.d0(468849378);
                            }
                            sVar2.p(false);
                            return qy.b0.f48488a;
                        }
                    }, sVar), sVar, 1597824, 42);
                    sVar.p(true);
                    a0.j0.c(((Boolean) b1Var.getValue()).booleanValue(), null, f1.e(null, 3), null, null, a.f28048e, sVar, 1575942, 26);
                    j0.c.g(sVar, j0.v.a(oVar2, 1.0f));
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                fz.a aVar2 = (fz.a) this.f28162c;
                fz.c cVar = (fz.c) this.f28163d;
                fz.c cVar2 = (fz.c) this.f28164e;
                j0.v Card2 = (j0.v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card2, "$this$Card");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    iv.o.i(this.f28161b, aVar2, cVar, cVar2, sVar2, 0);
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                fz.a aVar3 = (fz.a) this.f28162c;
                fz.a aVar4 = (fz.a) this.f28163d;
                fz.a aVar5 = (fz.a) this.f28164e;
                j0.v ModalBottomSheet = (j0.v) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ku.a.h(this.f28161b, aVar3, aVar4, aVar5, sVar3, 48);
                } else {
                    sVar3.W();
                }
                break;
            case 3:
                fz.a aVar6 = (fz.a) this.f28162c;
                fz.a aVar7 = (fz.a) this.f28164e;
                b1 b1Var3 = (b1) this.f28163d;
                j0.v ModalBottomSheet2 = (j0.v) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ModalBottomSheet2, "$this$ModalBottomSheet");
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    boolean zF = sVar4.f(aVar6);
                    Object objQ2 = sVar4.Q();
                    l1.g gVar2 = l1.m.f39353a;
                    if (zF || objQ2 == gVar2) {
                        objQ2 = new e(16, aVar6, b1Var3);
                        sVar4.o0(objQ2);
                    }
                    fz.a aVar8 = (fz.a) objQ2;
                    boolean zF2 = sVar4.f(aVar7);
                    Object objQ3 = sVar4.Q();
                    if (zF2 || objQ3 == gVar2) {
                        objQ3 = new e(17, aVar7, b1Var3);
                        sVar4.o0(objQ3);
                    }
                    y3.r(this.f28161b, 0, aVar8, (fz.a) objQ3, sVar4);
                } else {
                    sVar4.W();
                }
                break;
            case 4:
                fz.c cVar3 = (fz.c) this.f28163d;
                sv.b bVar = (sv.b) this.f28164e;
                fz.a aVar9 = (fz.a) this.f28162c;
                j0.v Card3 = (j0.v) obj;
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card3, "$this$Card");
                l1.s sVar5 = (l1.s) nVar5;
                if (!sVar5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    sVar5.W();
                } else if (this.f28161b == 0) {
                    sVar5.d0(1831526226);
                    nv.a.c(cVar3, sVar5, 0);
                    sVar5.p(false);
                } else {
                    sVar5.d0(1831528337);
                    nv.a.d(bVar, cVar3, aVar9, sVar5, 0);
                    sVar5.p(false);
                }
                break;
            default:
                rc rcVar = (rc) this.f28162c;
                b1 b1Var4 = (b1) this.f28163d;
                b1 b1Var5 = (b1) this.f28164e;
                b2 CourseTestProgressBar = (b2) obj;
                l1.n nVar6 = (l1.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(CourseTestProgressBar, "$this$CourseTestProgressBar");
                l1.s sVar6 = (l1.s) nVar6;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    qc qcVar = (qc) rcVar;
                    boolean z11 = qcVar.f50305e;
                    z1.o oVar3 = z1.o.f58481a;
                    l1.g gVar3 = l1.m.f39353a;
                    if (z11) {
                        sVar6.d0(1525186374);
                        int i12 = this.f28161b;
                        Integer numValueOf = Integer.valueOf(i12);
                        boolean zD = sVar6.d(i12);
                        Object objQ4 = sVar6.Q();
                        if (zD || objQ4 == gVar3) {
                            objQ4 = new dt.b2(i12, b1Var4, (vy.d) null);
                            sVar6.o0(objQ4);
                        }
                        l1.t.f((fz.e) objQ4, numValueOf, sVar6);
                        z1.i iVar2 = z1.c.M;
                        z1.r rVarC3 = j0.c.C(oVar3, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        a2 a2VarA = z1.a(j0.i.f35303a, iVar2, sVar6, 48);
                        int iHashCode3 = Long.hashCode(sVar6.T);
                        q1 q1VarL3 = sVar6.l();
                        z1.r rVarC4 = z1.a.c(sVar6, rVarC3);
                        y2.k.J.getClass();
                        y2.i iVar3 = y2.j.f56913b;
                        sVar6.h0();
                        if (sVar6.S) {
                            sVar6.k(iVar3);
                        } else {
                            sVar6.r0();
                        }
                        l1.t.J(y2.j.f56917f, a2VarA, sVar6);
                        l1.t.J(y2.j.f56916e, q1VarL3, sVar6);
                        y2.h hVar5 = y2.j.f56918g;
                        if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode3))) {
                            defpackage.e.A(iHashCode3, sVar6, iHashCode3, hVar5);
                        }
                        l1.t.J(y2.j.f56915d, rVarC4, sVar6);
                        gVar = gVar3;
                        d0.n.c(se.k.y(R.drawable.ic_game_life, sVar6, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar6, 48, 124);
                        oVar = oVar3;
                        ua.b(String.valueOf(3 - i12), j0.c.E(oVar3, 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar6, 48, 0, 131068);
                        sVar6 = sVar6;
                        sVar6.p(true);
                    } else {
                        oVar = oVar3;
                        gVar = gVar3;
                        sVar6.d0(1515846136);
                    }
                    sVar6.p(false);
                    if (qcVar.f50304d) {
                        sVar6.d0(1526494047);
                        k2.b bVarY = se.k.y(R.drawable.ic_lesson_setting_btn, sVar6, 0);
                        Object objQ5 = sVar6.Q();
                        if (objQ5 == gVar) {
                            objQ5 = new n4(22, b1Var5);
                            sVar6.o0(objQ5);
                        }
                        l1.s sVar7 = sVar6;
                        d0.n.c(bVarY, null, j0.c.A(e2.n(iu.k.q(24582, 7, (fz.a) objQ5, sVar6, oVar, false), 24), 2), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar7, 48, 120);
                        j0.c.g(sVar7, e2.n(oVar, 14));
                        sVar7.p(false);
                    } else {
                        sVar6.d0(1527296420);
                        j0.c.g(sVar6, e2.n(oVar, 24));
                        sVar6.p(false);
                    }
                } else {
                    sVar6.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ v(int i11, fz.a aVar, b1 b1Var, b1 b1Var2) {
        this.f28160a = 0;
        this.f28162c = aVar;
        this.f28163d = b1Var;
        this.f28161b = i11;
        this.f28164e = b1Var2;
    }

    public /* synthetic */ v(int i11, fz.a aVar, qy.e eVar, qy.e eVar2, int i12) {
        this.f28160a = i12;
        this.f28161b = i11;
        this.f28162c = aVar;
        this.f28163d = eVar;
        this.f28164e = eVar2;
    }

    public /* synthetic */ v(int i11, fz.c cVar, sv.b bVar, fz.a aVar) {
        this.f28160a = 4;
        this.f28161b = i11;
        this.f28163d = cVar;
        this.f28164e = bVar;
        this.f28162c = aVar;
    }

    public /* synthetic */ v(rc rcVar, int i11, b1 b1Var, b1 b1Var2) {
        this.f28160a = 5;
        this.f28162c = rcVar;
        this.f28161b = i11;
        this.f28163d = b1Var;
        this.f28164e = b1Var2;
    }
}
