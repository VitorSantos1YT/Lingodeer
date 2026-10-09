package fu;

import bp.g1;
import bt.c1;
import bt.v1;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import dt.h2;
import iv.d1;
import iv.e1;
import j0.a2;
import j0.c2;
import j0.e2;
import j0.z1;
import java.util.List;
import l1.a1;
import l1.b1;
import l1.b3;
import l1.i1;
import l1.q1;
import mt.j4;
import mt.m2;
import mt.n4;
import mt.y3;
import rt.e3;
import rt.j2;
import rt.jb;
import rt.l9;
import rt.mb;
import rt.r8;
import rt.y9;
import w2.q0;
import ys.o3;
import ys.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f28082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f28083f;

    public /* synthetic */ d(fz.a aVar, fz.a aVar2, b1 b1Var, b1 b1Var2, b1 b1Var3) {
        this.f28078a = 0;
        this.f28081d = aVar;
        this.f28082e = aVar2;
        this.f28079b = b1Var;
        this.f28080c = b1Var2;
        this.f28083f = b1Var3;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:101:0x050a  */
    /* JADX WARN: Code duplicated, block: B:102:0x051f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0534  */
    /* JADX WARN: Code duplicated, block: B:104:0x0549  */
    /* JADX WARN: Code duplicated, block: B:105:0x055e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0573  */
    /* JADX WARN: Code duplicated, block: B:109:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:110:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:115:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:121:0x05df  */
    /* JADX WARN: Code duplicated, block: B:125:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:128:0x063c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0698  */
    /* JADX WARN: Code duplicated, block: B:132:0x069c  */
    /* JADX WARN: Code duplicated, block: B:137:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:94:0x047b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0486  */
    /* JADX WARN: Code duplicated, block: B:96:0x049c  */
    /* JADX WARN: Code duplicated, block: B:97:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:98:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:99:0x04de  */
    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        hu.i iVar;
        String str;
        String str2;
        int iHashCode;
        y2.h hVar;
        boolean zF;
        Object objQ;
        l1.g gVar;
        boolean zF2;
        Object objQ2;
        Object objQ3;
        int iHashCode2;
        boolean z11;
        boolean z12;
        switch (this.f28078a) {
            case 0:
                fz.a aVar = (fz.a) this.f28081d;
                fz.a aVar2 = (fz.a) this.f28082e;
                b1 b1Var = (b1) this.f28079b;
                b1 b1Var2 = (b1) this.f28080c;
                b1 b1Var3 = (b1) this.f28083f;
                a0.r AnimatedContent = (a0.r) obj;
                hu.i value = (hu.i) obj2;
                l1.n nVar = (l1.n) obj3;
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.m.f(AnimatedContent, "$this$AnimatedContent");
                kotlin.jvm.internal.m.f(value, "value");
                String strQ0 = value.f33788b;
                z1.o oVar = z1.o.f58481a;
                z1.r rVarE = j0.c.E(e2.d(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 9, 7);
                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, nVar, 0);
                l1.s sVar = (l1.s) nVar;
                int iHashCode3 = Long.hashCode(sVar.T);
                q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(nVar, rVarE);
                y2.k.J.getClass();
                y2.i iVar2 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                y2.h hVar2 = y2.j.f56917f;
                l1.t.J(hVar2, uVarA, nVar);
                y2.h hVar3 = y2.j.f56916e;
                l1.t.J(hVar3, q1VarL, nVar);
                y2.h hVar4 = y2.j.f56918g;
                if (!sVar.S) {
                    iVar = value;
                    if (!kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                    }
                    y2.h hVar5 = y2.j.f56915d;
                    l1.t.J(hVar5, rVarC, nVar);
                    List listW0 = oz.q.W0(strQ0, new String[]{"/"}, 0, 6);
                    str = (String) listW0.get(0);
                    str2 = (String) listW0.get(1);
                    switch (Integer.parseInt(str)) {
                        case 0:
                            sVar.d0(-2085324605);
                            strQ0 = oz.x.q0(ub.a.e0(nVar, R.string.january_y), "%y", str2);
                            sVar.p(false);
                            break;
                        case 1:
                            sVar.d0(-2085322013);
                            strQ0 = oz.x.q0(ub.a.e0(nVar, R.string.february_y), "%y", str2);
                            sVar.p(false);
                            break;
                        case 2:
                            sVar.d0(-2085319517);
                            strQ0 = oz.x.q0(ub.a.e0(nVar, R.string.march_y), "%y", str2);
                            sVar.p(false);
                            break;
                        case 3:
                            sVar.d0(-2085317021);
                            strQ0 = oz.x.q0(ub.a.e0(nVar, R.string.april_y), "%y", str2);
                            sVar.p(false);
                            break;
                        case 4:
                            sVar.d0(-2085314589);
                            strQ0 = oz.x.q0(ub.a.e0(nVar, R.string.may_y), "%y", str2);
                            sVar.p(false);
                            break;
                        case 5:
                            sVar.d0(-2085312125);
                            strQ0 = oz.x.q0(ub.a.e0(nVar, R.string.june_y), "%y", str2);
                            sVar.p(false);
                            break;
                        case 6:
                            sVar.d0(-2085309661);
                            strQ0 = oz.x.q0(ub.a.e0(nVar, R.string.july_y), "%y", str2);
                            sVar.p(false);
                            break;
                        case 7:
                            sVar.d0(-2085307133);
                            strQ0 = oz.x.q0(ub.a.e0(nVar, R.string.august_y), "%y", str2);
                            sVar.p(false);
                            break;
                        case 8:
                            sVar.d0(-2085304509);
                            strQ0 = oz.x.q0(ub.a.e0(nVar, R.string.september_y), "%y", str2);
                            sVar.p(false);
                            break;
                        case 9:
                            sVar.d0(-2085301949);
                            strQ0 = oz.x.q0(ub.a.e0(nVar, R.string.october_y), "%y", str2);
                            sVar.p(false);
                            break;
                        case 10:
                            sVar.d0(-2085299325);
                            strQ0 = oz.x.q0(ub.a.e0(nVar, R.string.november_y), "%y", str2);
                            sVar.p(false);
                            break;
                        case 11:
                            sVar.d0(-2085296701);
                            strQ0 = oz.x.q0(ub.a.e0(nVar, R.string.december_y), "%y", str2);
                            sVar.p(false);
                            break;
                        default:
                            sVar.d0(-2085294976);
                            sVar.p(false);
                            break;
                    }
                    q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL2 = sVar.l();
                    z1.r rVarC2 = z1.a.c(nVar, oVar);
                    sVar.h0();
                    String str3 = strQ0;
                    if (sVar.S) {
                        sVar.k(iVar2);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar2, q0VarD, nVar);
                    l1.t.J(hVar3, q1VarL2, nVar);
                    if (sVar.S && kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        hVar = hVar4;
                    } else {
                        hVar = hVar4;
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(hVar5, rVarC2, nVar);
                    zF = sVar.f(aVar);
                    objQ = sVar.Q();
                    gVar = l1.m.f39353a;
                    if (zF || objQ == gVar) {
                        objQ = new e(0, aVar, b1Var);
                        sVar.o0(objQ);
                    }
                    fz.a aVar3 = (fz.a) objQ;
                    zF2 = sVar.f(aVar2);
                    objQ2 = sVar.Q();
                    if (zF2 || objQ2 == gVar) {
                        objQ2 = new e(1, aVar2, b1Var);
                        sVar.o0(objQ2);
                    }
                    a.b(str3, null, aVar3, (fz.a) objQ2, nVar, 0);
                    k2.b bVarY = se.k.y(R.drawable.achievement_icon_share, nVar, 0);
                    z1.r rVarE2 = j0.c.E(j0.r.f35391a.a(oVar, z1.c.f58465c), CropImageView.DEFAULT_ASPECT_RATIO, 30, 28, CropImageView.DEFAULT_ASPECT_RATIO, 9);
                    objQ3 = sVar.Q();
                    if (objQ3 == gVar) {
                        objQ3 = new h2(9, b1Var2);
                        sVar.o0(objQ3);
                    }
                    d0.n.c(bVarY, null, iu.k.q(24576, 7, (fz.a) objQ3, nVar, rVarE2, false), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, nVar, 48, 120);
                    sVar.p(true);
                    float f5 = 16;
                    z1.r rVarC3 = j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    float f11 = 6;
                    z1.r rVarE3 = j0.c.E(rVarC3, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                    a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, nVar, 0);
                    iHashCode2 = Long.hashCode(sVar.T);
                    q1 q1VarL3 = sVar.l();
                    z1.r rVarC4 = z1.a.c(nVar, rVarE3);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar2);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar2, a2VarA, nVar);
                    l1.t.J(hVar3, q1VarL3, nVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar);
                    }
                    l1.t.J(hVar5, rVarC4, nVar);
                    String strE0 = ub.a.e0(nVar, R.string.sun);
                    c2 c2Var = c2.f35266a;
                    a.g(0, strE0, nVar, c2Var.a(oVar, 1.0f));
                    a.g(0, ub.a.e0(nVar, R.string.mon), nVar, c2Var.a(oVar, 1.0f));
                    a.g(0, ub.a.e0(nVar, R.string.tue), nVar, c2Var.a(oVar, 1.0f));
                    a.g(0, ub.a.e0(nVar, R.string.wed), nVar, c2Var.a(oVar, 1.0f));
                    a.g(0, ub.a.e0(nVar, R.string.thu), nVar, c2Var.a(oVar, 1.0f));
                    a.g(0, ub.a.e0(nVar, R.string.fri), nVar, c2Var.a(oVar, 1.0f));
                    a.g(0, ub.a.e0(nVar, R.string.sat), nVar, c2Var.a(oVar, 1.0f));
                    sVar.p(true);
                    j0.c.c(j0.c.E(j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), null, j0.i.g(0), null, 7, 0, t1.e.d(1790667595, new at.p(10, iVar, b1Var3), nVar), nVar, 1597830, 42);
                    sVar.p(true);
                    return qy.b0.f48488a;
                }
                iVar = value;
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar4);
                y2.h hVar6 = y2.j.f56915d;
                l1.t.J(hVar6, rVarC, nVar);
                List listW1 = oz.q.W0(strQ0, new String[]{"/"}, 0, 6);
                str = (String) listW1.get(0);
                str2 = (String) listW1.get(1);
                switch (Integer.parseInt(str)) {
                    case 0:
                        sVar.d0(-2085324605);
                        strQ0 = oz.x.q0(ub.a.e0(nVar, R.string.january_y), "%y", str2);
                        sVar.p(false);
                        break;
                    case 1:
                        sVar.d0(-2085322013);
                        strQ0 = oz.x.q0(ub.a.e0(nVar, R.string.february_y), "%y", str2);
                        sVar.p(false);
                        break;
                    case 2:
                        sVar.d0(-2085319517);
                        strQ0 = oz.x.q0(ub.a.e0(nVar, R.string.march_y), "%y", str2);
                        sVar.p(false);
                        break;
                    case 3:
                        sVar.d0(-2085317021);
                        strQ0 = oz.x.q0(ub.a.e0(nVar, R.string.april_y), "%y", str2);
                        sVar.p(false);
                        break;
                    case 4:
                        sVar.d0(-2085314589);
                        strQ0 = oz.x.q0(ub.a.e0(nVar, R.string.may_y), "%y", str2);
                        sVar.p(false);
                        break;
                    case 5:
                        sVar.d0(-2085312125);
                        strQ0 = oz.x.q0(ub.a.e0(nVar, R.string.june_y), "%y", str2);
                        sVar.p(false);
                        break;
                    case 6:
                        sVar.d0(-2085309661);
                        strQ0 = oz.x.q0(ub.a.e0(nVar, R.string.july_y), "%y", str2);
                        sVar.p(false);
                        break;
                    case 7:
                        sVar.d0(-2085307133);
                        strQ0 = oz.x.q0(ub.a.e0(nVar, R.string.august_y), "%y", str2);
                        sVar.p(false);
                        break;
                    case 8:
                        sVar.d0(-2085304509);
                        strQ0 = oz.x.q0(ub.a.e0(nVar, R.string.september_y), "%y", str2);
                        sVar.p(false);
                        break;
                    case 9:
                        sVar.d0(-2085301949);
                        strQ0 = oz.x.q0(ub.a.e0(nVar, R.string.october_y), "%y", str2);
                        sVar.p(false);
                        break;
                    case 10:
                        sVar.d0(-2085299325);
                        strQ0 = oz.x.q0(ub.a.e0(nVar, R.string.november_y), "%y", str2);
                        sVar.p(false);
                        break;
                    case 11:
                        sVar.d0(-2085296701);
                        strQ0 = oz.x.q0(ub.a.e0(nVar, R.string.december_y), "%y", str2);
                        sVar.p(false);
                        break;
                    default:
                        sVar.d0(-2085294976);
                        sVar.p(false);
                        break;
                }
                q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL4 = sVar.l();
                z1.r rVarC5 = z1.a.c(nVar, oVar);
                sVar.h0();
                String str4 = strQ0;
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar2, q0VarD2, nVar);
                l1.t.J(hVar3, q1VarL4, nVar);
                if (sVar.S) {
                    hVar = hVar4;
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                } else {
                    hVar = hVar4;
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(hVar6, rVarC5, nVar);
                zF = sVar.f(aVar);
                objQ = sVar.Q();
                gVar = l1.m.f39353a;
                if (zF) {
                    objQ = new e(0, aVar, b1Var);
                    sVar.o0(objQ);
                } else {
                    objQ = new e(0, aVar, b1Var);
                    sVar.o0(objQ);
                }
                fz.a aVar4 = (fz.a) objQ;
                zF2 = sVar.f(aVar2);
                objQ2 = sVar.Q();
                if (zF2) {
                    objQ2 = new e(1, aVar2, b1Var);
                    sVar.o0(objQ2);
                } else {
                    objQ2 = new e(1, aVar2, b1Var);
                    sVar.o0(objQ2);
                }
                a.b(str4, null, aVar4, (fz.a) objQ2, nVar, 0);
                k2.b bVarY2 = se.k.y(R.drawable.achievement_icon_share, nVar, 0);
                z1.r rVarE4 = j0.c.E(j0.r.f35391a.a(oVar, z1.c.f58465c), CropImageView.DEFAULT_ASPECT_RATIO, 30, 28, CropImageView.DEFAULT_ASPECT_RATIO, 9);
                objQ3 = sVar.Q();
                if (objQ3 == gVar) {
                    objQ3 = new h2(9, b1Var2);
                    sVar.o0(objQ3);
                }
                d0.n.c(bVarY2, null, iu.k.q(24576, 7, (fz.a) objQ3, nVar, rVarE4, false), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, nVar, 48, 120);
                sVar.p(true);
                float f12 = 16;
                z1.r rVarC6 = j0.c.C(oVar, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                float f13 = 6;
                z1.r rVarE5 = j0.c.E(rVarC6, CropImageView.DEFAULT_ASPECT_RATIO, f13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                a2 a2VarA2 = z1.a(j0.i.f35303a, z1.c.L, nVar, 0);
                iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL5 = sVar.l();
                z1.r rVarC7 = z1.a.c(nVar, rVarE5);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar2, a2VarA2, nVar);
                l1.t.J(hVar3, q1VarL5, nVar);
                if (sVar.S) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar);
                } else {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar);
                }
                l1.t.J(hVar6, rVarC7, nVar);
                String strE1 = ub.a.e0(nVar, R.string.sun);
                c2 c2Var2 = c2.f35266a;
                a.g(0, strE1, nVar, c2Var2.a(oVar, 1.0f));
                a.g(0, ub.a.e0(nVar, R.string.mon), nVar, c2Var2.a(oVar, 1.0f));
                a.g(0, ub.a.e0(nVar, R.string.tue), nVar, c2Var2.a(oVar, 1.0f));
                a.g(0, ub.a.e0(nVar, R.string.wed), nVar, c2Var2.a(oVar, 1.0f));
                a.g(0, ub.a.e0(nVar, R.string.thu), nVar, c2Var2.a(oVar, 1.0f));
                a.g(0, ub.a.e0(nVar, R.string.fri), nVar, c2Var2.a(oVar, 1.0f));
                a.g(0, ub.a.e0(nVar, R.string.sat), nVar, c2Var2.a(oVar, 1.0f));
                sVar.p(true);
                j0.c.c(j0.c.E(j0.c.C(oVar, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), null, j0.i.g(0), null, 7, 0, t1.e.d(1790667595, new at.p(10, iVar, b1Var3), nVar), nVar, 1597830, 42);
                sVar.p(true);
                return qy.b0.f48488a;
            case 1:
                b3 b3Var = (b3) this.f28081d;
                fz.c cVar = (fz.c) this.f28082e;
                j9.v vVar = (j9.v) this.f28083f;
                b1 b1Var4 = (b1) this.f28079b;
                b1 b1Var5 = (b1) this.f28080c;
                ep.a.A((Integer) obj4, (a0.r) obj, "$this$composable", (j9.e) obj2, "it");
                z1.r rVarD = e2.d(j0.c.v(z1.o.f58481a), 1.0f);
                l1.s sVar2 = (l1.s) ((l1.n) obj3);
                boolean zF3 = sVar2.f(b3Var) | sVar2.f(cVar) | sVar2.h(vVar);
                Object objQ4 = sVar2.Q();
                if (zF3 || objQ4 == l1.m.f39353a) {
                    objQ4 = new b1.a(cVar, (Object) vVar, (Object) b1Var4, (Object) b1Var5, b3Var, 11);
                    sVar2.o0(objQ4);
                }
                g1.e("Splash", rVarD, -1, (fz.c) objQ4, null, sVar2, 390);
                break;
            case 2:
                mv.k0 k0Var = (mv.k0) this.f28082e;
                l9 l9Var = (l9) this.f28079b;
                i1 i1Var = (i1) this.f28080c;
                fz.a aVar5 = (fz.a) this.f28081d;
                j9.v vVar2 = (j9.v) this.f28083f;
                ep.a.A((Integer) obj4, (a0.r) obj, "$this$composable", (j9.e) obj2, "it");
                l1.s sVar3 = (l1.s) ((l1.n) obj3);
                Object objQ5 = sVar3.Q();
                vy.d dVar = null;
                l1.g gVar2 = l1.m.f39353a;
                if (objQ5 == gVar2) {
                    objQ5 = new iv.g1(i1Var, dVar, 0);
                    sVar3.o0(objQ5);
                }
                qy.b0 b0Var = qy.b0.f48488a;
                l1.t.f((fz.e) objQ5, b0Var, sVar3);
                b1 b1VarO = l1.t.o(k0Var.f42238u0, sVar3);
                b1 b1VarO2 = l1.t.o(l9Var.f50024d, sVar3);
                b1 b1VarO3 = l1.t.o(k0Var.f50719m0, sVar3);
                b1 b1VarO4 = l1.t.o(k0Var.L, sVar3);
                Object objQ6 = sVar3.Q();
                if (objQ6 == gVar2) {
                    objQ6 = l1.t.B(Boolean.FALSE);
                    sVar3.o0(objQ6);
                }
                b1 b1Var6 = (b1) objQ6;
                if (((Boolean) b1Var6.getValue()).booleanValue()) {
                    sVar3.d0(232586016);
                    String strE2 = ub.a.e0(sVar3, R.string.skip_listening_title);
                    Object objQ7 = sVar3.Q();
                    if (objQ7 == gVar2) {
                        objQ7 = new h2(16, b1Var6);
                        sVar3.o0(objQ7);
                    }
                    fz.a aVar6 = (fz.a) objQ7;
                    boolean zH = sVar3.h(k0Var);
                    Object objQ8 = sVar3.Q();
                    if (zH || objQ8 == gVar2) {
                        objQ8 = new e1(k0Var, 1);
                        sVar3.o0(objQ8);
                    }
                    p2.b(strE2, aVar6, (fz.a) objQ8, sVar3, 48);
                    z11 = false;
                } else {
                    z11 = false;
                    sVar3.d0(229315888);
                }
                sVar3.p(z11);
                boolean zH2 = sVar3.h(k0Var);
                Object objQ9 = sVar3.Q();
                if (zH2 || objQ9 == gVar2) {
                    objQ9 = new d1(k0Var, 1);
                    sVar3.o0(objQ9);
                }
                o3.a((fz.c) objQ9, null, t1.e.d(1184380502, new c1(k0Var, aVar5, l9Var, vVar2, b1VarO, b1VarO2, b1VarO3, b1VarO4, b1Var6, 1), sVar3), sVar3, 384);
                return b0Var;
            case 3:
                j2 j2Var = (j2) this.f28081d;
                j9.v vVar3 = (j9.v) this.f28082e;
                fz.c cVar2 = (fz.c) this.f28080c;
                fz.c cVar3 = (fz.c) this.f28083f;
                b1 b1Var7 = (b1) this.f28079b;
                a0.r composable = (a0.r) obj;
                j9.e it = (j9.e) obj2;
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.m.f(composable, "$this$composable");
                kotlin.jvm.internal.m.f(it, "it");
                List list = j2Var.M;
                r8 r8Var = (r8) b1Var7.getValue();
                boolean z13 = j2Var.N;
                l1.s sVar4 = (l1.s) ((l1.n) obj3);
                boolean zH3 = sVar4.h(vVar3);
                Object objQ10 = sVar4.Q();
                l1.g gVar3 = l1.m.f39353a;
                if (zH3 || objQ10 == gVar3) {
                    objQ10 = new j9.g(vVar3, 9);
                    sVar4.o0(objQ10);
                }
                fz.a aVar7 = (fz.a) objQ10;
                boolean zH4 = sVar4.h(vVar3);
                Object objQ11 = sVar4.Q();
                if (zH4 || objQ11 == gVar3) {
                    objQ11 = new j9.g(vVar3, 10);
                    sVar4.o0(objQ11);
                }
                y3.e(list, r8Var, z13, null, null, aVar7, cVar2, (fz.a) objQ11, cVar3, sVar4, 0);
                break;
            case 4:
                e3 e3Var = (e3) this.f28082e;
                fz.a aVar8 = (fz.a) this.f28081d;
                b1 b1Var8 = (b1) this.f28079b;
                a1 a1Var = (a1) this.f28080c;
                fz.c cVar4 = (fz.c) this.f28083f;
                ep.a.A((Integer) obj4, (a0.r) obj, "$this$composable", (j9.e) obj2, "it");
                boolean zBooleanValue = ((Boolean) b1Var8.getValue()).booleanValue();
                l1.s sVar5 = (l1.s) ((l1.n) obj3);
                boolean zH5 = sVar5.h(e3Var) | sVar5.f(b1Var8) | sVar5.f(a1Var);
                Object objQ12 = sVar5.Q();
                if (zH5 || objQ12 == l1.m.f39353a) {
                    objQ12 = new m2(e3Var, b1Var8, a1Var);
                    sVar5.o0(objQ12);
                }
                j4.a(e3Var, aVar8, zBooleanValue, (fz.a) ((mz.e) objQ12), cVar4, sVar5, 0);
                break;
            case 5:
                sv.o oVar2 = (sv.o) this.f28082e;
                l9 l9Var2 = (l9) this.f28079b;
                i1 i1Var2 = (i1) this.f28080c;
                fz.a aVar9 = (fz.a) this.f28081d;
                j9.v vVar4 = (j9.v) this.f28083f;
                ep.a.A((Integer) obj4, (a0.r) obj, "$this$composable", (j9.e) obj2, "it");
                l1.s sVar6 = (l1.s) ((l1.n) obj3);
                Object objQ13 = sVar6.Q();
                vy.d dVar2 = null;
                l1.g gVar4 = l1.m.f39353a;
                if (objQ13 == gVar4) {
                    objQ13 = new iv.g1(i1Var2, dVar2, 1);
                    sVar6.o0(objQ13);
                }
                qy.b0 b0Var2 = qy.b0.f48488a;
                l1.t.f((fz.e) objQ13, b0Var2, sVar6);
                b1 b1VarO5 = l1.t.o(oVar2.f51836u0, sVar6);
                b1 b1VarO6 = l1.t.o(l9Var2.f50024d, sVar6);
                b1 b1VarO7 = l1.t.o(oVar2.f50719m0, sVar6);
                b1 b1VarO8 = l1.t.o(oVar2.L, sVar6);
                Object objQ14 = sVar6.Q();
                if (objQ14 == gVar4) {
                    objQ14 = l1.t.B(Boolean.FALSE);
                    sVar6.o0(objQ14);
                }
                b1 b1Var9 = (b1) objQ14;
                if (((Boolean) b1Var9.getValue()).booleanValue()) {
                    sVar6.d0(123354814);
                    String strE3 = ub.a.e0(sVar6, R.string.skip_listening_title);
                    Object objQ15 = sVar6.Q();
                    if (objQ15 == gVar4) {
                        objQ15 = new n4(23, b1Var9);
                        sVar6.o0(objQ15);
                    }
                    fz.a aVar10 = (fz.a) objQ15;
                    boolean zH6 = sVar6.h(oVar2);
                    Object objQ16 = sVar6.Q();
                    if (zH6 || objQ16 == gVar4) {
                        objQ16 = new nv.z(oVar2, 2);
                        sVar6.o0(objQ16);
                    }
                    p2.b(strE3, aVar10, (fz.a) objQ16, sVar6, 48);
                    z12 = false;
                } else {
                    z12 = false;
                    sVar6.d0(119287118);
                }
                sVar6.p(z12);
                boolean zH7 = sVar6.h(oVar2);
                Object objQ17 = sVar6.Q();
                if (zH7 || objQ17 == gVar4) {
                    objQ17 = new nv.a0(oVar2, 1);
                    sVar6.o0(objQ17);
                }
                o3.a((fz.c) objQ17, null, t1.e.d(1570031480, new c1(oVar2, aVar9, l9Var2, vVar4, b1VarO5, b1VarO6, b1VarO7, b1VarO8, b1Var9, 2), sVar6), sVar6, 384);
                return b0Var2;
            default:
                mb mbVar = (mb) this.f28082e;
                l9 l9Var3 = (l9) this.f28079b;
                fz.c cVar5 = (fz.c) this.f28080c;
                fz.a aVar11 = (fz.a) this.f28081d;
                j9.v vVar5 = (j9.v) this.f28083f;
                ep.a.A((Integer) obj4, (a0.r) obj, "$this$composable", (j9.e) obj2, "it");
                l1.s sVar7 = (l1.s) ((l1.n) obj3);
                boolean zH8 = sVar7.h(mbVar);
                Object objQ18 = sVar7.Q();
                if (zH8 || objQ18 == l1.m.f39353a) {
                    objQ18 = new jb(mbVar, 3);
                    sVar7.o0(objQ18);
                }
                o3.a((fz.c) objQ18, null, t1.e.d(-2107649364, new v1(mbVar, l9Var3, cVar5, aVar11, vVar5, 21), sVar7), sVar7, 384);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ d(b3 b3Var, fz.c cVar, j9.v vVar, b1 b1Var, b1 b1Var2) {
        this.f28078a = 1;
        this.f28081d = b3Var;
        this.f28082e = cVar;
        this.f28083f = vVar;
        this.f28079b = b1Var;
        this.f28080c = b1Var2;
    }

    public /* synthetic */ d(j2 j2Var, j9.v vVar, fz.c cVar, fz.c cVar2, b1 b1Var) {
        this.f28078a = 3;
        this.f28081d = j2Var;
        this.f28082e = vVar;
        this.f28080c = cVar;
        this.f28083f = cVar2;
        this.f28079b = b1Var;
    }

    public /* synthetic */ d(e3 e3Var, fz.a aVar, b1 b1Var, a1 a1Var, fz.c cVar) {
        this.f28078a = 4;
        this.f28082e = e3Var;
        this.f28081d = aVar;
        this.f28079b = b1Var;
        this.f28080c = a1Var;
        this.f28083f = cVar;
    }

    public /* synthetic */ d(y9 y9Var, l9 l9Var, Object obj, fz.a aVar, j9.v vVar, int i11) {
        this.f28078a = i11;
        this.f28082e = y9Var;
        this.f28079b = l9Var;
        this.f28080c = obj;
        this.f28081d = aVar;
        this.f28083f = vVar;
    }
}
