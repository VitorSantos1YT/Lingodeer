package mt;

import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import h1.i9;
import h1.ua;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j1 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f41567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f41569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f41570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f41571f;

    public /* synthetic */ j1(long j11, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f41566a = i11;
        this.f41567b = j11;
        this.f41568c = obj;
        this.f41569d = obj2;
        this.f41570e = obj3;
        this.f41571f = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0352  */
    /* JADX WARN: Code duplicated, block: B:60:0x0356  */
    /* JADX WARN: Code duplicated, block: B:65:0x0371  */
    /* JADX WARN: Code duplicated, block: B:68:0x0399  */
    /* JADX WARN: Code duplicated, block: B:69:0x039d  */
    /* JADX WARN: Code duplicated, block: B:74:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:77:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:80:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:84:0x048d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0491  */
    /* JADX WARN: Code duplicated, block: B:88:0x049e  */
    /* JADX WARN: Code duplicated, block: B:90:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:93:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:95:0x04f2  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        l1.g gVar;
        l1.g gVar2;
        int iHashCode;
        int iHashCode2;
        boolean zF;
        Object objQ;
        l1.g gVar3;
        int iHashCode3;
        boolean zF2;
        Object objQ2;
        switch (this.f41566a) {
            case 0:
                rt.a2 a2Var = (rt.a2) this.f41568c;
                l1.b3 b3Var = (l1.b3) this.f41569d;
                l1.b1 b1Var = (l1.b1) this.f41570e;
                l1.g1 g1Var = (l1.g1) this.f41571f;
                a0.k0 AnimatedVisibility = (a0.k0) obj;
                l1.n nVar = (l1.n) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                i9.a(null, null, this.f41567b, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(224169778, new bp.t(a2Var, b3Var, b1Var, g1Var, 18), nVar), nVar, 12582912, 123);
                break;
            default:
                fz.a aVar = (fz.a) this.f41568c;
                fz.a aVar2 = (fz.a) this.f41569d;
                fz.a aVar3 = (fz.a) this.f41570e;
                fz.a aVar4 = (fz.a) this.f41571f;
                l0.c item = (l0.c) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar = (l1.s) nVar2;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
                    int iHashCode4 = Long.hashCode(sVar.T);
                    l1.q1 q1VarL = sVar.l();
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarC = z1.a.c(sVar, oVar);
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
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar3);
                    }
                    y2.h hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC, sVar);
                    z1.i iVar2 = z1.c.M;
                    j0.e eVar = j0.i.f35307e;
                    float f5 = 32;
                    float f11 = 20;
                    z1.r rVarE = j0.e2.e(j0.c.C(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f11, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f);
                    j0.a2 a2VarA = j0.z1.a(eVar, iVar2, sVar, 54);
                    int iHashCode5 = Long.hashCode(sVar.T);
                    l1.q1 q1VarL2 = sVar.l();
                    z1.r rVarC2 = z1.a.c(sVar, rVarE);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar, a2VarA, sVar);
                    l1.t.J(hVar2, q1VarL2, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                        defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar3);
                    }
                    l1.t.J(hVar4, rVarC2, sVar);
                    j0.c2 c2Var = j0.c2.f35266a;
                    z1.r rVarA = c2Var.a(oVar, 1.0f);
                    z1.j jVar = z1.c.f58468f;
                    w2.q0 q0VarD = j0.o.d(jVar, false);
                    int iHashCode6 = Long.hashCode(sVar.T);
                    l1.q1 q1VarL3 = sVar.l();
                    z1.r rVarC3 = z1.a.c(sVar, rVarA);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar, q0VarD, sVar);
                    l1.t.J(hVar2, q1VarL3, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode6))) {
                        defpackage.e.A(iHashCode6, sVar, iHashCode6, hVar3);
                    }
                    l1.t.J(hVar4, rVarC3, sVar);
                    String strE0 = ub.a.e0(sVar, R.string.terms_of_use_login);
                    l1.d0 d0Var = ua.f31167a;
                    j3.y0 y0Var = (j3.y0) sVar.j(d0Var);
                    long jA = fr.j3.A(12);
                    long j11 = this.f41567b;
                    u3.l lVar = u3.l.f52752c;
                    j3.y0 y0VarA = j3.y0.a(y0Var, j11, jA, null, null, null, 0L, null, lVar, 0, 0, 0L, null, 16773116);
                    boolean zF3 = sVar.f(aVar);
                    Object objQ3 = sVar.Q();
                    l1.g gVar4 = l1.m.f39353a;
                    if (zF3 || objQ3 == gVar4) {
                        objQ3 = new xu.r1(6, aVar);
                        sVar.o0(objQ3);
                    }
                    ua.b(strE0, iu.k.q(6, 7, (fz.a) objQ3, sVar, oVar, false), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar, 0, 0, 65532);
                    sVar.p(true);
                    float f12 = 10;
                    float f13 = 1;
                    float f14 = 16;
                    z1.r rVarG = j0.e2.g(j0.e2.s(j0.c.C(oVar, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), f13), f14);
                    g2.r0 r0Var = g2.f0.f28556b;
                    j0.c.g(sVar, d0.n.h(rVarG, j11, r0Var));
                    z1.r rVarA2 = c2Var.a(oVar, 1.0f);
                    z1.j jVar2 = z1.c.f58466d;
                    w2.q0 q0VarD2 = j0.o.d(jVar2, false);
                    int iHashCode7 = Long.hashCode(sVar.T);
                    l1.q1 q1VarL4 = sVar.l();
                    z1.r rVarC4 = z1.a.c(sVar, rVarA2);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar, q0VarD2, sVar);
                    l1.t.J(hVar2, q1VarL4, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode7))) {
                        defpackage.e.A(iHashCode7, sVar, iHashCode7, hVar3);
                    }
                    l1.t.J(hVar4, rVarC4, sVar);
                    String strE1 = ub.a.e0(sVar, R.string.privacy_policy_login);
                    j3.y0 y0VarA2 = j3.y0.a((j3.y0) sVar.j(d0Var), j11, fr.j3.A(12), null, null, null, 0L, null, lVar, 0, 0, 0L, null, 16773116);
                    boolean zF4 = sVar.f(aVar2);
                    Object objQ4 = sVar.Q();
                    if (zF4) {
                        gVar = gVar4;
                    } else {
                        gVar = gVar4;
                        if (objQ4 == gVar) {
                        }
                        ua.b(strE1, iu.k.q(6, 7, (fz.a) objQ4, sVar, oVar, false), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA2, sVar, 0, 0, 65532);
                        sVar.p(true);
                        sVar.p(true);
                        z1.r rVarE2 = j0.e2.e(j0.c.C(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f11, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f);
                        j0.a2 a2VarA2 = j0.z1.a(eVar, iVar2, sVar, 54);
                        gVar2 = gVar;
                        iHashCode = Long.hashCode(sVar.T);
                        l1.q1 q1VarL5 = sVar.l();
                        z1.r rVarC5 = z1.a.c(sVar, rVarE2);
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(hVar, a2VarA2, sVar);
                        l1.t.J(hVar2, q1VarL5, sVar);
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
                        }
                        l1.t.J(hVar4, rVarC5, sVar);
                        z1.r rVarA3 = c2Var.a(oVar, 1.0f);
                        w2.q0 q0VarD3 = j0.o.d(jVar, false);
                        iHashCode2 = Long.hashCode(sVar.T);
                        l1.q1 q1VarL6 = sVar.l();
                        z1.r rVarC6 = z1.a.c(sVar, rVarA3);
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(hVar, q0VarD3, sVar);
                        l1.t.J(hVar2, q1VarL6, sVar);
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                        }
                        l1.t.J(hVar4, rVarC6, sVar);
                        String strE2 = ub.a.e0(sVar, R.string.contact_us);
                        j3.y0 y0VarA3 = j3.y0.a((j3.y0) sVar.j(d0Var), j11, fr.j3.A(12), null, null, null, 0L, null, lVar, 0, 0, 0L, null, 16773116);
                        zF = sVar.f(aVar3);
                        objQ = sVar.Q();
                        if (zF) {
                            gVar3 = gVar2;
                        } else {
                            gVar3 = gVar2;
                            if (objQ == gVar3) {
                            }
                            l1.g gVar5 = gVar3;
                            ua.b(strE2, iu.k.q(6, 7, (fz.a) objQ, sVar, oVar, false), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA3, sVar, 0, 0, 65532);
                            sVar.p(true);
                            j0.c.g(sVar, d0.n.h(j0.e2.g(j0.e2.s(j0.c.C(oVar, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), f13), f14), j11, r0Var));
                            z1.r rVarA4 = c2Var.a(oVar, 1.0f);
                            w2.q0 q0VarD4 = j0.o.d(jVar2, false);
                            iHashCode3 = Long.hashCode(sVar.T);
                            l1.q1 q1VarL7 = sVar.l();
                            z1.r rVarC7 = z1.a.c(sVar, rVarA4);
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(hVar, q0VarD4, sVar);
                            l1.t.J(hVar2, q1VarL7, sVar);
                            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                            }
                            l1.t.J(hVar4, rVarC7, sVar);
                            String strE3 = ub.a.e0(sVar, R.string.faq);
                            j3.y0 y0VarA4 = j3.y0.a((j3.y0) sVar.j(d0Var), j11, fr.j3.A(12), null, null, null, 0L, null, lVar, 0, 0, 0L, null, 16773116);
                            zF2 = sVar.f(aVar4);
                            objQ2 = sVar.Q();
                            if (zF2 || objQ2 == gVar5) {
                                objQ2 = new xu.r1(9, aVar4);
                                sVar.o0(objQ2);
                            }
                            ua.b(strE3, iu.k.q(6, 7, (fz.a) objQ2, sVar, oVar, false), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA4, sVar, 0, 0, 65532);
                            com.google.android.material.datepicker.d.B(sVar, true, true, true);
                            j0.c.g(sVar, j0.e2.g(oVar, 120));
                        }
                        objQ = new xu.r1(8, aVar3);
                        sVar.o0(objQ);
                        l1.g gVar6 = gVar3;
                        ua.b(strE2, iu.k.q(6, 7, (fz.a) objQ, sVar, oVar, false), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA3, sVar, 0, 0, 65532);
                        sVar.p(true);
                        j0.c.g(sVar, d0.n.h(j0.e2.g(j0.e2.s(j0.c.C(oVar, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), f13), f14), j11, r0Var));
                        z1.r rVarA5 = c2Var.a(oVar, 1.0f);
                        w2.q0 q0VarD5 = j0.o.d(jVar2, false);
                        iHashCode3 = Long.hashCode(sVar.T);
                        l1.q1 q1VarL8 = sVar.l();
                        z1.r rVarC8 = z1.a.c(sVar, rVarA5);
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(hVar, q0VarD5, sVar);
                        l1.t.J(hVar2, q1VarL8, sVar);
                        if (sVar.S) {
                            defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                        } else {
                            defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                        }
                        l1.t.J(hVar4, rVarC8, sVar);
                        String strE4 = ub.a.e0(sVar, R.string.faq);
                        j3.y0 y0VarA5 = j3.y0.a((j3.y0) sVar.j(d0Var), j11, fr.j3.A(12), null, null, null, 0L, null, lVar, 0, 0, 0L, null, 16773116);
                        zF2 = sVar.f(aVar4);
                        objQ2 = sVar.Q();
                        if (zF2) {
                            objQ2 = new xu.r1(9, aVar4);
                            sVar.o0(objQ2);
                        } else {
                            objQ2 = new xu.r1(9, aVar4);
                            sVar.o0(objQ2);
                        }
                        ua.b(strE4, iu.k.q(6, 7, (fz.a) objQ2, sVar, oVar, false), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA5, sVar, 0, 0, 65532);
                        com.google.android.material.datepicker.d.B(sVar, true, true, true);
                        j0.c.g(sVar, j0.e2.g(oVar, 120));
                    }
                    objQ4 = new xu.r1(7, aVar2);
                    sVar.o0(objQ4);
                    ua.b(strE1, iu.k.q(6, 7, (fz.a) objQ4, sVar, oVar, false), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA2, sVar, 0, 0, 65532);
                    sVar.p(true);
                    sVar.p(true);
                    z1.r rVarE3 = j0.e2.e(j0.c.C(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f11, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f);
                    j0.a2 a2VarA3 = j0.z1.a(eVar, iVar2, sVar, 54);
                    gVar2 = gVar;
                    iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL9 = sVar.l();
                    z1.r rVarC9 = z1.a.c(sVar, rVarE3);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar, a2VarA3, sVar);
                    l1.t.J(hVar2, q1VarL9, sVar);
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
                    }
                    l1.t.J(hVar4, rVarC9, sVar);
                    z1.r rVarA6 = c2Var.a(oVar, 1.0f);
                    w2.q0 q0VarD6 = j0.o.d(jVar, false);
                    iHashCode2 = Long.hashCode(sVar.T);
                    l1.q1 q1VarL10 = sVar.l();
                    z1.r rVarC10 = z1.a.c(sVar, rVarA6);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar, q0VarD6, sVar);
                    l1.t.J(hVar2, q1VarL10, sVar);
                    if (sVar.S) {
                        defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                    } else {
                        defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC10, sVar);
                    String strE5 = ub.a.e0(sVar, R.string.contact_us);
                    j3.y0 y0VarA6 = j3.y0.a((j3.y0) sVar.j(d0Var), j11, fr.j3.A(12), null, null, null, 0L, null, lVar, 0, 0, 0L, null, 16773116);
                    zF = sVar.f(aVar3);
                    objQ = sVar.Q();
                    if (zF) {
                        gVar3 = gVar2;
                        if (objQ == gVar3) {
                        }
                        l1.g gVar7 = gVar3;
                        ua.b(strE5, iu.k.q(6, 7, (fz.a) objQ, sVar, oVar, false), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA6, sVar, 0, 0, 65532);
                        sVar.p(true);
                        j0.c.g(sVar, d0.n.h(j0.e2.g(j0.e2.s(j0.c.C(oVar, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), f13), f14), j11, r0Var));
                        z1.r rVarA7 = c2Var.a(oVar, 1.0f);
                        w2.q0 q0VarD7 = j0.o.d(jVar2, false);
                        iHashCode3 = Long.hashCode(sVar.T);
                        l1.q1 q1VarL11 = sVar.l();
                        z1.r rVarC11 = z1.a.c(sVar, rVarA7);
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(hVar, q0VarD7, sVar);
                        l1.t.J(hVar2, q1VarL11, sVar);
                        if (sVar.S) {
                            defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                        } else {
                            defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                        }
                        l1.t.J(hVar4, rVarC11, sVar);
                        String strE6 = ub.a.e0(sVar, R.string.faq);
                        j3.y0 y0VarA7 = j3.y0.a((j3.y0) sVar.j(d0Var), j11, fr.j3.A(12), null, null, null, 0L, null, lVar, 0, 0, 0L, null, 16773116);
                        zF2 = sVar.f(aVar4);
                        objQ2 = sVar.Q();
                        if (zF2) {
                            objQ2 = new xu.r1(9, aVar4);
                            sVar.o0(objQ2);
                        } else {
                            objQ2 = new xu.r1(9, aVar4);
                            sVar.o0(objQ2);
                        }
                        ua.b(strE6, iu.k.q(6, 7, (fz.a) objQ2, sVar, oVar, false), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA7, sVar, 0, 0, 65532);
                        com.google.android.material.datepicker.d.B(sVar, true, true, true);
                        j0.c.g(sVar, j0.e2.g(oVar, 120));
                    } else {
                        gVar3 = gVar2;
                    }
                    objQ = new xu.r1(8, aVar3);
                    sVar.o0(objQ);
                    l1.g gVar8 = gVar3;
                    ua.b(strE5, iu.k.q(6, 7, (fz.a) objQ, sVar, oVar, false), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA6, sVar, 0, 0, 65532);
                    sVar.p(true);
                    j0.c.g(sVar, d0.n.h(j0.e2.g(j0.e2.s(j0.c.C(oVar, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), f13), f14), j11, r0Var));
                    z1.r rVarA8 = c2Var.a(oVar, 1.0f);
                    w2.q0 q0VarD8 = j0.o.d(jVar2, false);
                    iHashCode3 = Long.hashCode(sVar.T);
                    l1.q1 q1VarL12 = sVar.l();
                    z1.r rVarC12 = z1.a.c(sVar, rVarA8);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar, q0VarD8, sVar);
                    l1.t.J(hVar2, q1VarL12, sVar);
                    if (sVar.S) {
                        defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                    } else {
                        defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                    }
                    l1.t.J(hVar4, rVarC12, sVar);
                    String strE7 = ub.a.e0(sVar, R.string.faq);
                    j3.y0 y0VarA8 = j3.y0.a((j3.y0) sVar.j(d0Var), j11, fr.j3.A(12), null, null, null, 0L, null, lVar, 0, 0, 0L, null, 16773116);
                    zF2 = sVar.f(aVar4);
                    objQ2 = sVar.Q();
                    if (zF2) {
                        objQ2 = new xu.r1(9, aVar4);
                        sVar.o0(objQ2);
                    } else {
                        objQ2 = new xu.r1(9, aVar4);
                        sVar.o0(objQ2);
                    }
                    ua.b(strE7, iu.k.q(6, 7, (fz.a) objQ2, sVar, oVar, false), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA8, sVar, 0, 0, 65532);
                    com.google.android.material.datepicker.d.B(sVar, true, true, true);
                    j0.c.g(sVar, j0.e2.g(oVar, 120));
                } else {
                    sVar.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
