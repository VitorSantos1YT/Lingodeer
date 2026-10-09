package a0;

import b0.g2;
import b0.h2;
import b0.j2;
import com.yalantis.ucrop.view.CropImageView;
import h1.dc;
import h1.f3;
import h1.g3;
import h1.k7;
import h1.m2;
import h1.p2;
import h1.s3;
import h1.t3;
import h1.t7;
import h1.u4;
import h1.ua;
import h1.w7;
import j0.e2;
import java.util.List;
import java.util.Locale;
import l1.b3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f192e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(h1.s1 s1Var, w7 w7Var, dc dcVar, t1.d dVar, int i11) {
        super(2);
        this.f188a = 4;
        this.f190c = s1Var;
        this.f191d = w7Var;
        this.f192e = dcVar;
        this.f189b = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0055  */
    /* JADX WARN: Code duplicated, block: B:14:0x0070  */
    /* JADX WARN: Code duplicated, block: B:19:0x008b  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:32:0x010e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0125  */
    /* JADX WARN: Code duplicated, block: B:46:0x0178  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:54:0x01db  */
    /* JADX WARN: Code duplicated, block: B:57:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:62:0x020c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0210  */
    /* JADX WARN: Code duplicated, block: B:68:0x022b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0257  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        Object objY;
        fz.e eVar;
        int iV;
        l1.s sVar;
        y2.i iVar;
        y2.h hVar;
        j0.f fVar;
        int iV2;
        l1.s sVar2;
        boolean zF;
        Object objQ;
        boolean zF2;
        Object objQ2;
        String strH;
        l1.s sVar3;
        boolean zH;
        Object objQ3;
        switch (this.f188a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar;
                if (sVar4.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b0.c2 c2Var = (b0.c2) this.f190c;
                    f fVar2 = new f((b0.c0) this.f191d, 1);
                    j2 j2Var = b0.e.f3496j;
                    boolean zG = c2Var.g();
                    h2 h2Var = c2Var.f3458a;
                    l1.g gVar = l1.m.f39353a;
                    if (zG) {
                        sVar4.d0(1666853325);
                        sVar4.p(false);
                        objY = h2Var.Y();
                    } else {
                        sVar4.d0(1666599280);
                        boolean zF3 = sVar4.f(c2Var);
                        objY = sVar4.Q();
                        if (zF3 || objY == gVar) {
                            x1.f fVarN = re.q.n();
                            fz.c cVarE = fVarN != null ? fVarN.e() : null;
                            x1.f fVarR = re.q.r(fVarN);
                            try {
                                Object objY2 = h2Var.Y();
                                re.q.t(fVarN, fVarR, cVarE);
                                sVar4.o0(objY2);
                                objY = objY2;
                            } catch (Throwable th2) {
                                re.q.t(fVarN, fVarR, cVarE);
                                throw th2;
                            }
                        }
                        sVar4.p(false);
                    }
                    sVar4.d0(1378811975);
                    Object obj3 = this.f192e;
                    boolean zA = kotlin.jvm.internal.m.a(objY, obj3);
                    float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                    float f11 = zA ? 1.0f : 0.0f;
                    sVar4.p(false);
                    Float fValueOf = Float.valueOf(f11);
                    boolean zF4 = sVar4.f(c2Var);
                    Object objQ4 = sVar4.Q();
                    if (zF4 || objQ4 == gVar) {
                        objQ4 = l1.t.s(new s0(c2Var, 0));
                        sVar4.o0(objQ4);
                    }
                    Object value = ((b3) objQ4).getValue();
                    sVar4.d0(1378811975);
                    if (kotlin.jvm.internal.m.a(value, obj3)) {
                        f5 = 1.0f;
                    }
                    sVar4.p(false);
                    Float fValueOf2 = Float.valueOf(f5);
                    boolean zF5 = sVar4.f(c2Var);
                    Object objQ5 = sVar4.Q();
                    if (zF5 || objQ5 == gVar) {
                        objQ5 = l1.t.s(new s0(c2Var, 1));
                        sVar4.o0(objQ5);
                    }
                    b0.y1 y1VarC = g2.c(c2Var, fValueOf, fValueOf2, (b0.c0) fVar2.invoke(((b3) objQ5).getValue(), sVar4, 0), j2Var, sVar4, 0);
                    boolean zF6 = sVar4.f(y1VarC);
                    Object objQ6 = sVar4.Q();
                    if (zF6 || objQ6 == gVar) {
                        objQ6 = new r0(y1VarC, 0);
                        sVar4.o0(objQ6);
                    }
                    z1.r rVarQ = g2.f0.q(z1.o.f58481a, (fz.c) objQ6);
                    t1.d dVar = (t1.d) this.f189b;
                    w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL = sVar4.l();
                    z1.r rVarC = z1.a.c(sVar4, rVarQ);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar2);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, sVar4);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar4);
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar4, iHashCode, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar4);
                    dVar.invoke(obj3, sVar4, 0);
                    sVar4.p(true);
                } else {
                    sVar4.W();
                }
                return qy.b0.f48488a;
            case 1:
                l1.n nVar2 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar5 = (l1.s) nVar2;
                    if (sVar5.F()) {
                        sVar5.W();
                    } else {
                        z1.o oVar = z1.o.f58481a;
                        z1.r rVarE = e2.e(oVar, 1.0f);
                        t1.d dVar2 = (t1.d) this.f189b;
                        eVar = (fz.e) this.f190c;
                        m2 m2Var = (m2) this.f191d;
                        j3.y0 y0Var = (j3.y0) this.f192e;
                        j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, nVar2, 0);
                        iV = l1.t.v(nVar2);
                        sVar = (l1.s) nVar2;
                        l1.q1 q1VarL2 = sVar.l();
                        z1.r rVarC2 = z1.a.c(nVar2, rVarE);
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        y2.h hVar3 = y2.j.f56917f;
                        l1.t.J(hVar3, uVarA, nVar2);
                        y2.h hVar4 = y2.j.f56916e;
                        l1.t.J(hVar4, q1VarL2, nVar2);
                        hVar = y2.j.f56918g;
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iV))) {
                            defpackage.e.A(iV, sVar, iV, hVar);
                        }
                        y2.h hVar5 = y2.j.f56915d;
                        l1.t.J(hVar5, rVarC2, nVar2);
                        if (eVar != null) {
                            fVar = j0.i.f35309g;
                        } else {
                            fVar = j0.i.f35303a;
                        }
                        z1.r rVarE2 = e2.e(oVar, 1.0f);
                        j0.a2 a2VarA = j0.z1.a(fVar, z1.c.M, nVar2, 48);
                        iV2 = l1.t.v(nVar2);
                        l1.q1 q1VarL3 = sVar.l();
                        z1.r rVarC3 = z1.a.c(nVar2, rVarE2);
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(hVar3, a2VarA, nVar2);
                        l1.t.J(hVar4, q1VarL3, nVar2);
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iV2))) {
                            defpackage.e.A(iV2, sVar, iV2, hVar);
                        }
                        l1.t.J(hVar5, rVarC3, nVar2);
                        sVar.d0(-1287344744);
                        ua.a(y0Var, t1.e.d(-962031352, new h1.f(dVar2, 3, (byte) 0), nVar2), nVar2, 48);
                        sVar.p(false);
                        sVar.d0(-1287336668);
                        if (eVar != null) {
                            eVar.invoke(nVar2, 0);
                        }
                        sVar.p(false);
                        sVar.p(true);
                        sVar.d0(1995137078);
                        k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, m2Var.f30661x, nVar2, 0, 3);
                        sVar.p(false);
                        sVar.p(true);
                    }
                } else {
                    z1.o oVar2 = z1.o.f58481a;
                    z1.r rVarE3 = e2.e(oVar2, 1.0f);
                    t1.d dVar3 = (t1.d) this.f189b;
                    eVar = (fz.e) this.f190c;
                    m2 m2Var2 = (m2) this.f191d;
                    j3.y0 y0Var2 = (j3.y0) this.f192e;
                    j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, nVar2, 0);
                    iV = l1.t.v(nVar2);
                    sVar = (l1.s) nVar2;
                    l1.q1 q1VarL4 = sVar.l();
                    z1.r rVarC4 = z1.a.c(nVar2, rVarE3);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    y2.h hVar6 = y2.j.f56917f;
                    l1.t.J(hVar6, uVarA2, nVar2);
                    y2.h hVar7 = y2.j.f56916e;
                    l1.t.J(hVar7, q1VarL4, nVar2);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iV, sVar, iV, hVar);
                    } else {
                        defpackage.e.A(iV, sVar, iV, hVar);
                    }
                    y2.h hVar8 = y2.j.f56915d;
                    l1.t.J(hVar8, rVarC4, nVar2);
                    if (eVar != null) {
                        fVar = j0.i.f35309g;
                    } else {
                        fVar = j0.i.f35303a;
                    }
                    z1.r rVarE4 = e2.e(oVar2, 1.0f);
                    j0.a2 a2VarA2 = j0.z1.a(fVar, z1.c.M, nVar2, 48);
                    iV2 = l1.t.v(nVar2);
                    l1.q1 q1VarL5 = sVar.l();
                    z1.r rVarC5 = z1.a.c(nVar2, rVarE4);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar6, a2VarA2, nVar2);
                    l1.t.J(hVar7, q1VarL5, nVar2);
                    if (sVar.S) {
                        defpackage.e.A(iV2, sVar, iV2, hVar);
                    } else {
                        defpackage.e.A(iV2, sVar, iV2, hVar);
                    }
                    l1.t.J(hVar8, rVarC5, nVar2);
                    sVar.d0(-1287344744);
                    ua.a(y0Var2, t1.e.d(-962031352, new h1.f(dVar3, 3, (byte) 0), nVar2), nVar2, 48);
                    sVar.p(false);
                    sVar.d0(-1287336668);
                    if (eVar != null) {
                        eVar.invoke(nVar2, 0);
                    }
                    sVar.p(false);
                    sVar.p(true);
                    sVar.d0(1995137078);
                    k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, m2Var2.f30661x, nVar2, 0, 3);
                    sVar.p(false);
                    sVar.p(true);
                }
                return qy.b0.f48488a;
            case 2:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                t3 t3Var = (t3) this.f190c;
                if ((iIntValue2 & 3) == 2) {
                    l1.s sVar6 = (l1.s) nVar3;
                    if (sVar6.F()) {
                        sVar6.W();
                    } else {
                        Long lC = t3Var.c();
                        Long lB = t3Var.b();
                        long j11 = ((i1.z) t3Var.f31100d.getValue()).f34110e;
                        int iA = t3Var.a();
                        sVar2 = (l1.s) nVar3;
                        zF = sVar2.f(t3Var);
                        objQ = sVar2.Q();
                        l1.g gVar2 = l1.m.f39353a;
                        if (zF || objQ == gVar2) {
                            objQ = new g3(t3Var, 1);
                            sVar2.o0(objQ);
                        }
                        fz.e eVar2 = (fz.e) objQ;
                        zF2 = sVar2.f(t3Var);
                        objQ2 = sVar2.Q();
                        if (zF2 || objQ2 == gVar2) {
                            objQ2 = new f3(t3Var, 1);
                            sVar2.o0(objQ2);
                        }
                        s3.d(lC, lB, j11, iA, eVar2, (fz.c) objQ2, (i1.x) this.f191d, t3Var.f31097a, (p2) this.f192e, (t7) t3Var.f31099c.getValue(), (m2) this.f189b, sVar2, 0, 0);
                    }
                } else {
                    Long lC2 = t3Var.c();
                    Long lB2 = t3Var.b();
                    long j12 = ((i1.z) t3Var.f31100d.getValue()).f34110e;
                    int iA2 = t3Var.a();
                    sVar2 = (l1.s) nVar3;
                    zF = sVar2.f(t3Var);
                    objQ = sVar2.Q();
                    l1.g gVar3 = l1.m.f39353a;
                    if (zF) {
                        objQ = new g3(t3Var, 1);
                        sVar2.o0(objQ);
                    } else {
                        objQ = new g3(t3Var, 1);
                        sVar2.o0(objQ);
                    }
                    fz.e eVar3 = (fz.e) objQ;
                    zF2 = sVar2.f(t3Var);
                    objQ2 = sVar2.Q();
                    if (zF2) {
                        objQ2 = new f3(t3Var, 1);
                        sVar2.o0(objQ2);
                    } else {
                        objQ2 = new f3(t3Var, 1);
                        sVar2.o0(objQ2);
                    }
                    s3.d(lC2, lB2, j12, iA2, eVar3, (fz.c) objQ2, (i1.x) this.f191d, t3Var.f31097a, (p2) this.f192e, (t7) t3Var.f31099c.getValue(), (m2) this.f189b, sVar2, 0, 0);
                }
                return qy.b0.f48488a;
            case 3:
                l1.n nVar4 = (l1.n) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                List list = (List) this.f192e;
                if ((iIntValue3 & 3) == 2) {
                    l1.s sVar7 = (l1.s) nVar4;
                    if (sVar7.F()) {
                        sVar7.W();
                    } else {
                        p2 p2Var = (p2) this.f190c;
                        long j13 = ((i1.z) this.f191d).f34110e;
                        Locale localeR = k7.r(nVar4);
                        p2Var.getClass();
                        strH = i1.p.h(j13, "yMMMM", localeR, p2Var.f30831a);
                        if (strH == null) {
                            strH = "-";
                        }
                        String str = strH;
                        z1.r rVarZ = j0.c.z(z1.o.f58481a, s3.f31051a);
                        sVar3 = (l1.s) nVar4;
                        zH = sVar3.h(list);
                        objQ3 = sVar3.Q();
                        if (zH || objQ3 == l1.m.f39353a) {
                            objQ3 = new o0(list, 15);
                            sVar3.o0(objQ3);
                        }
                        ua.b(str, g3.r.b(rVarZ, false, (fz.c) objQ3), ((m2) this.f189b).f30643e, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131064);
                    }
                } else {
                    p2 p2Var2 = (p2) this.f190c;
                    long j14 = ((i1.z) this.f191d).f34110e;
                    Locale localeR2 = k7.r(nVar4);
                    p2Var2.getClass();
                    strH = i1.p.h(j14, "yMMMM", localeR2, p2Var2.f30831a);
                    if (strH == null) {
                        strH = "-";
                    }
                    String str2 = strH;
                    z1.r rVarZ2 = j0.c.z(z1.o.f58481a, s3.f31051a);
                    sVar3 = (l1.s) nVar4;
                    zH = sVar3.h(list);
                    objQ3 = sVar3.Q();
                    if (zH) {
                        objQ3 = new o0(list, 15);
                        sVar3.o0(objQ3);
                    } else {
                        objQ3 = new o0(list, 15);
                        sVar3.o0(objQ3);
                    }
                    ua.b(str2, g3.r.b(rVarZ2, false, (fz.c) objQ3), ((m2) this.f189b).f30643e, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131064);
                }
                return qy.b0.f48488a;
            default:
                ((Number) obj2).intValue();
                u4.a((h1.s1) this.f190c, (w7) this.f191d, (dc) this.f192e, (t1.d) this.f189b, (l1.n) obj, l1.t.M(3457));
                return qy.b0.f48488a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        super(2);
        this.f188a = i11;
        this.f190c = obj;
        this.f191d = obj2;
        this.f192e = obj3;
        this.f189b = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(t1.d dVar, fz.e eVar, fz.e eVar2, m2 m2Var, j3.y0 y0Var) {
        super(2);
        this.f188a = 1;
        this.f189b = dVar;
        this.f190c = eVar;
        this.f191d = m2Var;
        this.f192e = y0Var;
    }
}
