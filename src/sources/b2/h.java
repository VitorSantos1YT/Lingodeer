package b2;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import g2.t0;
import g3.t;
import h1.dc;
import h1.f6;
import h1.j0;
import h1.r4;
import h1.ua;
import h1.wb;
import h1.yb;
import h1.za;
import hh.p0;
import i1.p;
import i1.u;
import j0.a2;
import j0.c2;
import j0.e2;
import j0.n2;
import j0.p2;
import j0.t1;
import j0.z1;
import java.util.ArrayList;
import k1.k0;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.v;
import l1.g1;
import l1.l2;
import l1.m;
import l1.q1;
import l1.s;
import n9.i2;
import n9.y;
import qy.b0;
import w2.f0;
import w2.q0;
import y2.h1;
import y2.i0;
import y2.k1;
import y2.l0;
import y2.v1;
import z1.o;
import z1.r;
import z2.h2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3864c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i11, Object obj, Object obj2) {
        super(2);
        this.f3862a = i11;
        this.f3863b = obj;
        this.f3864c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:117:0x033a  */
    /* JADX WARN: Code duplicated, block: B:119:0x036f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0373  */
    /* JADX WARN: Code duplicated, block: B:125:0x0394  */
    /* JADX WARN: Code duplicated, block: B:134:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:138:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:141:0x041f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0423  */
    /* JADX WARN: Code duplicated, block: B:147:0x0444  */
    /* JADX WARN: Code duplicated, block: B:54:0x015d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0189  */
    /* JADX WARN: Code duplicated, block: B:57:0x018d  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:72:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x0230  */
    /* JADX WARN: Code duplicated, block: B:90:0x025b  */
    /* JADX WARN: Code duplicated, block: B:92:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:93:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:98:0x02c8  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        String strI;
        s sVar;
        boolean zF;
        Object objQ;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        int iV;
        s sVar2;
        y2.i iVar2;
        y2.h hVar2;
        int iV2;
        s sVar3;
        y2.i iVar3;
        y2.h hVar3;
        yb ybVar;
        int iV3;
        s sVar4;
        y2.i iVar4;
        y2.h hVar4;
        int iH;
        int i11;
        int i12 = this.f3862a;
        c2 c2Var = c2.f35266a;
        o oVar = o.f58481a;
        int i13 = 2;
        int i14 = 1;
        b0 b0Var = b0.f48488a;
        Object obj3 = this.f3864c;
        Object obj4 = this.f3863b;
        switch (i12) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                t tVar = (t) obj2;
                i iVar5 = (i) obj3;
                if (!((h2) obj4).f58584b.b(tVar.f28702g)) {
                    iVar5.i(iIntValue, tVar);
                    iVar5.H.i(b0Var);
                }
                break;
            case 1:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    strI = p.i(nVar, R.string.m3c_dialog);
                    r rVarR = e2.r((r) obj4, h1.k.f30507a, CropImageView.DEFAULT_ASPECT_RATIO, h1.k.f30508b, 10);
                    sVar = (s) nVar;
                    zF = sVar.f(strI);
                    objQ = sVar.Q();
                    if (zF) {
                        objQ = new c6.o(strI, i13);
                        sVar.o0(objQ);
                    } else {
                        objQ = new c6.o(strI, i13);
                        sVar.o0(objQ);
                    }
                    r rVarI = rVarR.i(g3.r.b(oVar, false, (fz.c) objQ));
                    t1.d dVar = (t1.d) obj3;
                    q0 q0VarD = j0.o.d(z1.c.f58463a, true);
                    iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    r rVarC = z1.a.c(sVar, rVarI);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    p0.x(0, dVar, sVar, true);
                } else {
                    s sVar5 = (s) nVar;
                    if (!sVar5.F()) {
                        strI = p.i(nVar, R.string.m3c_dialog);
                        r rVarR2 = e2.r((r) obj4, h1.k.f30507a, CropImageView.DEFAULT_ASPECT_RATIO, h1.k.f30508b, 10);
                        sVar = (s) nVar;
                        zF = sVar.f(strI);
                        objQ = sVar.Q();
                        if (zF || objQ == m.f39353a) {
                            objQ = new c6.o(strI, i13);
                            sVar.o0(objQ);
                        }
                        r rVarI2 = rVarR2.i(g3.r.b(oVar, false, (fz.c) objQ));
                        t1.d dVar2 = (t1.d) obj3;
                        q0 q0VarD2 = j0.o.d(z1.c.f58463a, true);
                        iHashCode = Long.hashCode(sVar.T);
                        q1 q1VarL2 = sVar.l();
                        r rVarC2 = z1.a.c(sVar, rVarI2);
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD2, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL2, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC2, sVar);
                        p0.x(0, dVar2, sVar, true);
                    } else {
                        sVar5.W();
                    }
                }
                break;
            case 2:
                l1.n nVar2 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    r rVarZ = j0.c.z(e2.a(oVar, j0.f30449c, j0.f30450d), (t1) obj4);
                    fz.f fVar = (fz.f) obj3;
                    a2 a2VarA = z1.a(j0.i.f35307e, z1.c.M, nVar2, 54);
                    iV = l1.t.v(nVar2);
                    sVar2 = (s) nVar2;
                    q1 q1VarL3 = sVar2.l();
                    r rVarC3 = z1.a.c(nVar2, rVarZ);
                    y2.k.J.getClass();
                    iVar2 = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar2);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA, nVar2);
                    l1.t.J(y2.j.f56916e, q1VarL3, nVar2);
                    hVar2 = y2.j.f56918g;
                    if (sVar2.S) {
                        defpackage.e.A(iV, sVar2, iV, hVar2);
                    } else {
                        defpackage.e.A(iV, sVar2, iV, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC3, nVar2);
                    fVar.invoke(c2Var, nVar2, 6);
                    sVar2.p(true);
                } else {
                    s sVar6 = (s) nVar2;
                    if (!sVar6.F()) {
                        r rVarZ2 = j0.c.z(e2.a(oVar, j0.f30449c, j0.f30450d), (t1) obj4);
                        fz.f fVar2 = (fz.f) obj3;
                        a2 a2VarA2 = z1.a(j0.i.f35307e, z1.c.M, nVar2, 54);
                        iV = l1.t.v(nVar2);
                        sVar2 = (s) nVar2;
                        q1 q1VarL4 = sVar2.l();
                        r rVarC4 = z1.a.c(nVar2, rVarZ2);
                        y2.k.J.getClass();
                        iVar2 = y2.j.f56913b;
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar2);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(y2.j.f56917f, a2VarA2, nVar2);
                        l1.t.J(y2.j.f56916e, q1VarL4, nVar2);
                        hVar2 = y2.j.f56918g;
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iV))) {
                            defpackage.e.A(iV, sVar2, iV, hVar2);
                        }
                        l1.t.J(y2.j.f56915d, rVarC4, nVar2);
                        fVar2.invoke(c2Var, nVar2, 6);
                        sVar2.p(true);
                    } else {
                        sVar6.W();
                    }
                }
                break;
            case 3:
                ((Number) obj2).intValue();
                r4.a((k2.b) obj4, (r) obj3, (l1.n) obj, l1.t.M(433));
                break;
            case 4:
                l1.n nVar3 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    ua.a(((dc) obj4).f30177j, (t1.d) obj3, nVar3, 0);
                } else {
                    s sVar7 = (s) nVar3;
                    if (!sVar7.F()) {
                        ua.a(((dc) obj4).f30177j, (t1.d) obj3, nVar3, 0);
                    } else {
                        sVar7.W();
                    }
                }
                break;
            case 5:
                l1.n nVar4 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    r rVarC5 = q0.c.c(e2.b(z1.a.a(e2.e(oVar, 1.0f), new p2((n2) obj4, i14)), CropImageView.DEFAULT_ASPECT_RATIO, f6.f30235a, 1));
                    j0.b bVar = j0.i.f35303a;
                    t1.d dVar3 = (t1.d) obj3;
                    a2 a2VarA3 = z1.a(j0.i.g(f6.f30236b), z1.c.M, nVar4, 54);
                    iV2 = l1.t.v(nVar4);
                    sVar3 = (s) nVar4;
                    q1 q1VarL5 = sVar3.l();
                    r rVarC6 = z1.a.c(nVar4, rVarC5);
                    y2.k.J.getClass();
                    iVar3 = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar3);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA3, nVar4);
                    l1.t.J(y2.j.f56916e, q1VarL5, nVar4);
                    hVar3 = y2.j.f56918g;
                    if (sVar3.S) {
                        defpackage.e.A(iV2, sVar3, iV2, hVar3);
                    } else {
                        defpackage.e.A(iV2, sVar3, iV2, hVar3);
                    }
                    l1.t.J(y2.j.f56915d, rVarC6, nVar4);
                    dVar3.invoke(c2Var, nVar4, 6);
                    sVar3.p(true);
                } else {
                    s sVar8 = (s) nVar4;
                    if (!sVar8.F()) {
                        r rVarC7 = q0.c.c(e2.b(z1.a.a(e2.e(oVar, 1.0f), new p2((n2) obj4, i14)), CropImageView.DEFAULT_ASPECT_RATIO, f6.f30235a, 1));
                        j0.b bVar2 = j0.i.f35303a;
                        t1.d dVar4 = (t1.d) obj3;
                        a2 a2VarA4 = z1.a(j0.i.g(f6.f30236b), z1.c.M, nVar4, 54);
                        iV2 = l1.t.v(nVar4);
                        sVar3 = (s) nVar4;
                        q1 q1VarL6 = sVar3.l();
                        r rVarC8 = z1.a.c(nVar4, rVarC7);
                        y2.k.J.getClass();
                        iVar3 = y2.j.f56913b;
                        sVar3.h0();
                        if (sVar3.S) {
                            sVar3.k(iVar3);
                        } else {
                            sVar3.r0();
                        }
                        l1.t.J(y2.j.f56917f, a2VarA4, nVar4);
                        l1.t.J(y2.j.f56916e, q1VarL6, nVar4);
                        hVar3 = y2.j.f56918g;
                        if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iV2))) {
                            defpackage.e.A(iV2, sVar3, iV2, hVar3);
                        }
                        l1.t.J(y2.j.f56915d, rVarC8, nVar4);
                        dVar4.invoke(c2Var, nVar4, 6);
                        sVar3.p(true);
                    } else {
                        sVar8.W();
                    }
                }
                break;
            case 6:
                l1.n nVar5 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    ((fz.f) obj4).invoke((ArrayList) obj3, nVar5, 0);
                } else {
                    s sVar9 = (s) nVar5;
                    if (!sVar9.F()) {
                        ((fz.f) obj4).invoke((ArrayList) obj3, nVar5, 0);
                    } else {
                        sVar9.W();
                    }
                }
                break;
            case 7:
                l1.n nVar6 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    ybVar = (yb) obj4;
                    za zaVar = (za) obj3;
                    a2 a2VarA5 = z1.a(j0.i.f35303a, z1.c.L, nVar6, 0);
                    iV3 = l1.t.v(nVar6);
                    sVar4 = (s) nVar6;
                    q1 q1VarL7 = sVar4.l();
                    r rVarC9 = z1.a.c(nVar6, oVar);
                    y2.k.J.getClass();
                    iVar4 = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar4);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA5, nVar6);
                    l1.t.J(y2.j.f56916e, q1VarL7, nVar6);
                    hVar4 = y2.j.f56918g;
                    if (sVar4.S) {
                        defpackage.e.A(iV3, sVar4, iV3, hVar4);
                    } else {
                        defpackage.e.A(iV3, sVar4, iV3, hVar4);
                    }
                    l1.t.J(y2.j.f56915d, rVarC9, nVar6);
                    float f5 = k0.f37598w;
                    float f11 = k0.f37596u;
                    r rVarP = e2.p(oVar, f5, f11);
                    if (ybVar.g()) {
                        if (ybVar.h() % 12 == 0) {
                            i11 = 12;
                        } else if (ybVar.i()) {
                            iH = ybVar.h() - 12;
                        } else {
                            iH = ybVar.h();
                        }
                        wb.o(rVarP, i11, ybVar, 0, zaVar, nVar6, 3078);
                        wb.n(e2.p(oVar, wb.f31265e, k0.f37594s), nVar6, 6);
                        wb.o(e2.p(oVar, f5, f11), ybVar.d(), ybVar, 1, zaVar, nVar6, 3078);
                        sVar4.p(true);
                    } else {
                        iH = ybVar.h() % 24;
                    }
                    i11 = iH;
                    wb.o(rVarP, i11, ybVar, 0, zaVar, nVar6, 3078);
                    wb.n(e2.p(oVar, wb.f31265e, k0.f37594s), nVar6, 6);
                    wb.o(e2.p(oVar, f5, f11), ybVar.d(), ybVar, 1, zaVar, nVar6, 3078);
                    sVar4.p(true);
                } else {
                    s sVar10 = (s) nVar6;
                    if (!sVar10.F()) {
                        ybVar = (yb) obj4;
                        za zaVar2 = (za) obj3;
                        a2 a2VarA6 = z1.a(j0.i.f35303a, z1.c.L, nVar6, 0);
                        iV3 = l1.t.v(nVar6);
                        sVar4 = (s) nVar6;
                        q1 q1VarL8 = sVar4.l();
                        r rVarC10 = z1.a.c(nVar6, oVar);
                        y2.k.J.getClass();
                        iVar4 = y2.j.f56913b;
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar4);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(y2.j.f56917f, a2VarA6, nVar6);
                        l1.t.J(y2.j.f56916e, q1VarL8, nVar6);
                        hVar4 = y2.j.f56918g;
                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iV3))) {
                            defpackage.e.A(iV3, sVar4, iV3, hVar4);
                        }
                        l1.t.J(y2.j.f56915d, rVarC10, nVar6);
                        float f12 = k0.f37598w;
                        float f13 = k0.f37596u;
                        r rVarP2 = e2.p(oVar, f12, f13);
                        if (ybVar.g()) {
                            if (ybVar.h() % 12 == 0) {
                                i11 = 12;
                            } else if (ybVar.i()) {
                                iH = ybVar.h() - 12;
                            } else {
                                iH = ybVar.h();
                            }
                            wb.o(rVarP2, i11, ybVar, 0, zaVar2, nVar6, 3078);
                            wb.n(e2.p(oVar, wb.f31265e, k0.f37594s), nVar6, 6);
                            wb.o(e2.p(oVar, f12, f13), ybVar.d(), ybVar, 1, zaVar2, nVar6, 3078);
                            sVar4.p(true);
                        } else {
                            iH = ybVar.h() % 24;
                        }
                        i11 = iH;
                        wb.o(rVarP2, i11, ybVar, 0, zaVar2, nVar6, 3078);
                        wb.n(e2.p(oVar, wb.f31265e, k0.f37594s), nVar6, 6);
                        wb.o(e2.p(oVar, f12, f13), ybVar.d(), ybVar, 1, zaVar2, nVar6, 3078);
                        sVar4.p(true);
                    } else {
                        sVar10.W();
                    }
                }
                break;
            case 8:
                float fFloatValue = ((Number) obj).floatValue();
                float fFloatValue2 = ((Number) obj2).floatValue();
                ob.s sVar11 = ((u) obj4).f34079a;
                ((g1) sVar11.f44884j).m(fFloatValue);
                ((g1) sVar11.f44885k).m(fFloatValue2);
                ((v) obj3).f38358a = fFloatValue;
                break;
            case 9:
                n9.o prependHint = (n9.o) obj;
                n9.o appendHint = (n9.o) obj2;
                i2 i2Var = (i2) obj3;
                kotlin.jvm.internal.m.f(prependHint, "prependHint");
                kotlin.jvm.internal.m.f(appendHint, "appendHint");
                if (((y) obj4) != y.PREPEND) {
                    appendHint.f43654a = i2Var;
                    if (i2Var != null) {
                        appendHint.f43655b.d(i2Var);
                    }
                } else {
                    prependHint.f43654a = i2Var;
                    if (i2Var != null) {
                        prependHint.f43655b.d(i2Var);
                    }
                }
                break;
            case 10:
                l1.n nVar7 = (l1.n) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                s sVar12 = (s) nVar7;
                if (!sVar12.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar12.W();
                } else {
                    Boolean bool = (Boolean) ((f0) obj4).f54490g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    fz.e eVar = (fz.e) obj3;
                    sVar12.g0(bool);
                    boolean zG = sVar12.g(zBooleanValue);
                    if (zBooleanValue) {
                        eVar.invoke(sVar12, 0);
                    } else {
                        if (sVar12.f39445l != 0) {
                            l1.u.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!sVar12.S) {
                            if (zG) {
                                l2 l2Var = sVar12.G;
                                int i15 = l2Var.f39346g;
                                int i16 = l2Var.f39347h;
                                m1.b bVar3 = sVar12.M;
                                bVar3.getClass();
                                bVar3.d(false);
                                bVar3.f40765b.f40762d.K(m1.i.f40790c);
                                l1.t.k(i15, i16, sVar12.f39451s);
                                sVar12.G.t();
                            } else {
                                sVar12.V();
                            }
                        }
                    }
                    if (sVar12.f39457y && sVar12.G.f39348i == sVar12.f39458z) {
                        sVar12.f39458z = -1;
                        sVar12.f39457y = false;
                    }
                    sVar12.p(false);
                }
                break;
            case 11:
                g2.v vVar = (g2.v) obj;
                j2.c cVar = (j2.c) obj2;
                k1 k1Var = (k1) obj4;
                i0 i0Var = k1Var.Q;
                if (!i0Var.J()) {
                    k1Var.f56956m0 = true;
                } else {
                    k1Var.f56953j0 = vVar;
                    k1Var.f56952i0 = cVar;
                    v1 snapshotObserver = l0.a(i0Var).getSnapshotObserver();
                    t0 t0Var = k1.f56939o0;
                    snapshotObserver.f57019a.d(k1Var, y2.e.f56847e, (h1) obj3);
                    k1Var.f56956m0 = false;
                }
                break;
            default:
                ((Number) obj2).intValue();
                AndroidCompositionLocals_androidKt.a((AndroidComposeView) obj4, (fz.e) obj3, (l1.n) obj, l1.t.M(1));
                break;
        }
        return b0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, int i11, int i12, Object obj2) {
        super(2);
        this.f3862a = i12;
        this.f3863b = obj;
        this.f3864c = obj2;
    }
}
