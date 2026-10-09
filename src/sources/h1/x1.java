package h1;

import com.google.api.Service;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends kotlin.jvm.internal.n implements fz.e {
    public static final x1 H;
    public static final x1 K;
    public static final x1 L;
    public static final x1 M;
    public static final x1 N;
    public static final x1 O;
    public static final x1 P;
    public static final x1 Q;
    public static final x1 R;
    public static final x1 S;
    public static final x1 T;
    public static final x1 U;
    public static final x1 V;
    public static final x1 W;
    public static final x1 X;
    public static final x1 Y;
    public static final x1 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final x1 f31282a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x1 f31283b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final x1 f31284b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x1 f31285c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final x1 f31286c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x1 f31287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x1 f31288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x1 f31289f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final x1 f31290t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31291a;

    static {
        int i11 = 2;
        f31283b = new x1(i11, 0);
        f31285c = new x1(i11, 1);
        f31287d = new x1(i11, 2);
        f31288e = new x1(i11, 3);
        f31289f = new x1(i11, 4);
        f31290t = new x1(i11, 5);
        H = new x1(i11, 6);
        K = new x1(i11, 7);
        L = new x1(i11, 8);
        M = new x1(i11, 9);
        N = new x1(i11, 10);
        O = new x1(i11, 11);
        P = new x1(i11, 12);
        Q = new x1(i11, 13);
        R = new x1(i11, 14);
        S = new x1(i11, 15);
        T = new x1(i11, 16);
        U = new x1(i11, 17);
        V = new x1(i11, 18);
        W = new x1(i11, 19);
        X = new x1(i11, 20);
        Y = new x1(i11, 21);
        Z = new x1(i11, 22);
        f31282a0 = new x1(i11, 23);
        f31284b0 = new x1(i11, 24);
        f31286c0 = new x1(i11, 25);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(int i11, int i12) {
        super(i11);
        this.f31291a = i12;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x032d  */
    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:114:0x035e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0365  */
    /* JADX WARN: Code duplicated, block: B:126:0x0495  */
    /* JADX WARN: Code duplicated, block: B:129:0x049c  */
    /* JADX WARN: Code duplicated, block: B:12:0x005c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0060  */
    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    /* JADX WARN: Code duplicated, block: B:55:0x0247  */
    /* JADX WARN: Code duplicated, block: B:98:0x0300  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l2.e eVarB;
        l2.e eVarB2;
        int iV;
        l1.s sVar;
        y2.i iVar;
        y2.h hVar;
        int i11 = this.f31291a;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar2 = (l1.s) nVar;
                    if (sVar2.F()) {
                        sVar2.W();
                    }
                }
                return b0Var;
            case 1:
                l1.n nVar2 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar3 = (l1.s) nVar2;
                    if (sVar3.F()) {
                        sVar3.W();
                    }
                }
                return b0Var;
            case 2:
                l1.n nVar3 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar4 = (l1.s) nVar3;
                    if (sVar4.F()) {
                        sVar4.W();
                    } else {
                        eVarB = vc.a.f53835a;
                        if (eVarB == null) {
                            l2.d dVar = new l2.d("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i12 = l2.h0.f39633a;
                            g2.y0 y0Var = new g2.y0(g2.x.f28615b);
                            l2.f fVar = new l2.f(0);
                            fVar.g(3.0f, 17.25f);
                            l2.a0 a0Var = new l2.a0(21.0f);
                            ArrayList arrayList = fVar.f39601b;
                            arrayList.add(a0Var);
                            fVar.d(3.75f);
                            fVar.e(17.81f, 9.94f);
                            fVar.f(-3.75f, -3.75f);
                            fVar.e(3.0f, 17.25f);
                            fVar.b();
                            fVar.g(20.71f, 7.04f);
                            fVar.c(0.39f, -0.39f, 0.39f, -1.02f, CropImageView.DEFAULT_ASPECT_RATIO, -1.41f);
                            fVar.f(-2.34f, -2.34f);
                            fVar.c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
                            fVar.f(-1.83f, 1.83f);
                            fVar.f(3.75f, 3.75f);
                            fVar.f(1.83f, -1.83f);
                            fVar.b();
                            l2.d.a(dVar, arrayList, y0Var);
                            eVarB = dVar.b();
                            vc.a.f53835a = eVarB;
                        }
                        r4.c(eVarB, i1.p.i(nVar3, R.string.m3c_date_picker_switch_to_input_mode), null, 0L, nVar3, 0, 12);
                    }
                } else {
                    eVarB = vc.a.f53835a;
                    if (eVarB == null) {
                        l2.d dVar2 = new l2.d("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i13 = l2.h0.f39633a;
                        g2.y0 y0Var2 = new g2.y0(g2.x.f28615b);
                        l2.f fVar2 = new l2.f(0);
                        fVar2.g(3.0f, 17.25f);
                        l2.a0 a0Var2 = new l2.a0(21.0f);
                        ArrayList arrayList2 = fVar2.f39601b;
                        arrayList2.add(a0Var2);
                        fVar2.d(3.75f);
                        fVar2.e(17.81f, 9.94f);
                        fVar2.f(-3.75f, -3.75f);
                        fVar2.e(3.0f, 17.25f);
                        fVar2.b();
                        fVar2.g(20.71f, 7.04f);
                        fVar2.c(0.39f, -0.39f, 0.39f, -1.02f, CropImageView.DEFAULT_ASPECT_RATIO, -1.41f);
                        fVar2.f(-2.34f, -2.34f);
                        fVar2.c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
                        fVar2.f(-1.83f, 1.83f);
                        fVar2.f(3.75f, 3.75f);
                        fVar2.f(1.83f, -1.83f);
                        fVar2.b();
                        l2.d.a(dVar2, arrayList2, y0Var2);
                        eVarB = dVar2.b();
                        vc.a.f53835a = eVarB;
                    }
                    r4.c(eVarB, i1.p.i(nVar3, R.string.m3c_date_picker_switch_to_input_mode), null, 0L, nVar3, 0, 12);
                }
                return b0Var;
            case 3:
                l1.n nVar4 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar5 = (l1.s) nVar4;
                    if (sVar5.F()) {
                        sVar5.W();
                    } else {
                        eVarB2 = v10.c.f53472a;
                        if (eVarB2 == null) {
                            l2.d dVar3 = new l2.d("Filled.DateRange", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i14 = l2.h0.f39633a;
                            g2.y0 y0Var3 = new g2.y0(g2.x.f28615b);
                            l2.f fVar3 = new l2.f(0);
                            fVar3.g(9.0f, 11.0f);
                            fVar3.e(7.0f, 11.0f);
                            fVar3.h(2.0f);
                            fVar3.d(2.0f);
                            fVar3.h(-2.0f);
                            fVar3.b();
                            fVar3.g(13.0f, 11.0f);
                            fVar3.d(-2.0f);
                            fVar3.h(2.0f);
                            fVar3.d(2.0f);
                            fVar3.h(-2.0f);
                            fVar3.b();
                            fVar3.g(17.0f, 11.0f);
                            fVar3.d(-2.0f);
                            fVar3.h(2.0f);
                            fVar3.d(2.0f);
                            fVar3.h(-2.0f);
                            fVar3.b();
                            fVar3.g(19.0f, 4.0f);
                            fVar3.d(-1.0f);
                            fVar3.e(18.0f, 2.0f);
                            fVar3.d(-2.0f);
                            fVar3.h(2.0f);
                            fVar3.e(8.0f, 4.0f);
                            fVar3.e(8.0f, 2.0f);
                            fVar3.e(6.0f, 2.0f);
                            fVar3.h(2.0f);
                            fVar3.e(5.0f, 4.0f);
                            fVar3.c(-1.11f, CropImageView.DEFAULT_ASPECT_RATIO, -1.99f, 0.9f, -1.99f, 2.0f);
                            fVar3.e(3.0f, 20.0f);
                            fVar3.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                            fVar3.d(14.0f);
                            fVar3.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
                            fVar3.e(21.0f, 6.0f);
                            fVar3.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            fVar3.b();
                            fVar3.g(19.0f, 20.0f);
                            fVar3.e(5.0f, 20.0f);
                            fVar3.e(5.0f, 9.0f);
                            fVar3.d(14.0f);
                            fVar3.h(11.0f);
                            fVar3.b();
                            l2.d.a(dVar3, fVar3.f39601b, y0Var3);
                            eVarB2 = dVar3.b();
                            v10.c.f53472a = eVarB2;
                        }
                        r4.c(eVarB2, i1.p.i(nVar4, R.string.m3c_date_picker_switch_to_calendar_mode), null, 0L, nVar4, 0, 12);
                    }
                } else {
                    eVarB2 = v10.c.f53472a;
                    if (eVarB2 == null) {
                        l2.d dVar4 = new l2.d("Filled.DateRange", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i15 = l2.h0.f39633a;
                        g2.y0 y0Var4 = new g2.y0(g2.x.f28615b);
                        l2.f fVar4 = new l2.f(0);
                        fVar4.g(9.0f, 11.0f);
                        fVar4.e(7.0f, 11.0f);
                        fVar4.h(2.0f);
                        fVar4.d(2.0f);
                        fVar4.h(-2.0f);
                        fVar4.b();
                        fVar4.g(13.0f, 11.0f);
                        fVar4.d(-2.0f);
                        fVar4.h(2.0f);
                        fVar4.d(2.0f);
                        fVar4.h(-2.0f);
                        fVar4.b();
                        fVar4.g(17.0f, 11.0f);
                        fVar4.d(-2.0f);
                        fVar4.h(2.0f);
                        fVar4.d(2.0f);
                        fVar4.h(-2.0f);
                        fVar4.b();
                        fVar4.g(19.0f, 4.0f);
                        fVar4.d(-1.0f);
                        fVar4.e(18.0f, 2.0f);
                        fVar4.d(-2.0f);
                        fVar4.h(2.0f);
                        fVar4.e(8.0f, 4.0f);
                        fVar4.e(8.0f, 2.0f);
                        fVar4.e(6.0f, 2.0f);
                        fVar4.h(2.0f);
                        fVar4.e(5.0f, 4.0f);
                        fVar4.c(-1.11f, CropImageView.DEFAULT_ASPECT_RATIO, -1.99f, 0.9f, -1.99f, 2.0f);
                        fVar4.e(3.0f, 20.0f);
                        fVar4.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                        fVar4.d(14.0f);
                        fVar4.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
                        fVar4.e(21.0f, 6.0f);
                        fVar4.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        fVar4.b();
                        fVar4.g(19.0f, 20.0f);
                        fVar4.e(5.0f, 20.0f);
                        fVar4.e(5.0f, 9.0f);
                        fVar4.d(14.0f);
                        fVar4.h(11.0f);
                        fVar4.b();
                        l2.d.a(dVar4, fVar4.f39601b, y0Var4);
                        eVarB2 = dVar4.b();
                        v10.c.f53472a = eVarB2;
                    }
                    r4.c(eVarB2, i1.p.i(nVar4, R.string.m3c_date_picker_switch_to_calendar_mode), null, 0L, nVar4, 0, 12);
                }
                return b0Var;
            case 4:
                l1.n nVar5 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar6 = (l1.s) nVar5;
                    if (sVar6.F()) {
                        sVar6.W();
                    } else {
                        h0.f30315a.a(null, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, nVar5, 196608);
                    }
                } else {
                    h0.f30315a.a(null, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, nVar5, 196608);
                }
                return b0Var;
            case 5:
                l1.n nVar6 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar7 = (l1.s) nVar6;
                    if (sVar7.F()) {
                        sVar7.W();
                    } else {
                        h0.f30315a.a(null, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, nVar6, 196608);
                    }
                } else {
                    h0.f30315a.a(null, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, nVar6, 196608);
                }
                return b0Var;
            case 6:
                l1.n nVar7 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar8 = (l1.s) nVar7;
                    if (sVar8.F()) {
                        sVar8.W();
                    }
                }
                return b0Var;
            case 7:
                l1.n nVar8 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar9 = (l1.s) nVar8;
                    if (sVar9.F()) {
                        sVar9.W();
                    }
                }
                return b0Var;
            case 8:
                l1.n nVar9 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar10 = (l1.s) nVar9;
                    if (sVar10.F()) {
                        sVar10.W();
                    }
                }
                return b0Var;
            case 9:
                l1.n nVar10 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar11 = (l1.s) nVar10;
                    if (sVar11.F()) {
                        sVar11.W();
                    }
                }
                return b0Var;
            case 10:
                l1.n nVar11 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar12 = (l1.s) nVar11;
                    if (sVar12.F()) {
                        sVar12.W();
                    }
                }
                return b0Var;
            case 11:
                l1.n nVar12 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar13 = (l1.s) nVar12;
                    if (sVar13.F()) {
                        sVar13.W();
                    } else {
                        k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, 0L, nVar12, 0, 7);
                    }
                } else {
                    k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, 0L, nVar12, 0, 7);
                }
                return b0Var;
            case 12:
                t3 t3Var = (t3) obj2;
                Long lC = t3Var.c();
                Long lB = t3Var.b();
                Long lValueOf = Long.valueOf(((i1.z) t3Var.f31100d.getValue()).f34110e);
                lz.g gVar = t3Var.f31097a;
                return ns.o.L(lC, lB, lValueOf, Integer.valueOf(gVar.f40532a), Integer.valueOf(gVar.f40533b), Integer.valueOf(t3Var.a()));
            case 13:
                ((Number) obj2).intValue();
                l1.s sVar14 = (l1.s) ((l1.n) obj);
                sVar14.d0(58488196);
                h0 h0Var = h0.f30315a;
                WeakHashMap weakHashMap = j0.o2.f35353v;
                j0.k1 k1Var = new j0.k1(j0.b.e(sVar14).f35364k, 32);
                sVar14.p(false);
                return k1Var;
            case 14:
                return Integer.valueOf(((w2.p0) obj).b(((Number) obj2).intValue()));
            case 15:
                return Integer.valueOf(((w2.p0) obj).t(((Number) obj2).intValue()));
            case 16:
                return Integer.valueOf(((w2.p0) obj).W(((Number) obj2).intValue()));
            case 17:
                return Integer.valueOf(((w2.p0) obj).p(((Number) obj2).intValue()));
            case 18:
                return (f8) ((l1.k1) ((e8) obj2).f30211b.f44881g).getValue();
            case 19:
                return (o9) ((l1.k1) ((n9) obj2).f30744b.f44881g).getValue();
            case 20:
                return Integer.valueOf(((w2.p0) obj).b(((Number) obj2).intValue()));
            case 21:
                return Integer.valueOf(((w2.p0) obj).t(((Number) obj2).intValue()));
            case 22:
                return Integer.valueOf(((w2.p0) obj).W(((Number) obj2).intValue()));
            case 23:
                return Integer.valueOf(((w2.p0) obj).p(((Number) obj2).intValue()));
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                zb zbVar = (zb) obj2;
                return ns.o.L(Integer.valueOf(zbVar.h()), Integer.valueOf(zbVar.f31446e.l()), Boolean.valueOf(zbVar.f31442a));
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                cc ccVar = (cc) obj2;
                return ns.o.L(Float.valueOf(ccVar.f30110a.l()), Float.valueOf(ccVar.f30112c.l()), Float.valueOf(ccVar.f30111b.l()));
            default:
                l1.n nVar13 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar15 = (l1.s) nVar13;
                    if (sVar15.F()) {
                        sVar15.W();
                    } else {
                        z1.r rVarA = j0.e2.a(z1.o.f58481a, k1.k.f37573d, k1.k.f37571b);
                        z1.j jVar = z1.c.f58467e;
                        t1.d dVar5 = xu.c.X;
                        w2.q0 q0VarD = j0.o.d(jVar, false);
                        iV = l1.t.v(nVar13);
                        sVar = (l1.s) nVar13;
                        l1.q1 q1VarL = sVar.l();
                        z1.r rVarC = z1.a.c(nVar13, rVarA);
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD, nVar13);
                        l1.t.J(y2.j.f56916e, q1VarL, nVar13);
                        hVar = y2.j.f56918g;
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iV))) {
                            defpackage.e.A(iV, sVar, iV, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC, nVar13);
                        dVar5.invoke(nVar13, 0);
                        sVar.p(true);
                    }
                } else {
                    z1.r rVarA2 = j0.e2.a(z1.o.f58481a, k1.k.f37573d, k1.k.f37571b);
                    z1.j jVar2 = z1.c.f58467e;
                    t1.d dVar6 = xu.c.X;
                    w2.q0 q0VarD2 = j0.o.d(jVar2, false);
                    iV = l1.t.v(nVar13);
                    sVar = (l1.s) nVar13;
                    l1.q1 q1VarL2 = sVar.l();
                    z1.r rVarC2 = z1.a.c(nVar13, rVarA2);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD2, nVar13);
                    l1.t.J(y2.j.f56916e, q1VarL2, nVar13);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iV, sVar, iV, hVar);
                    } else {
                        defpackage.e.A(iV, sVar, iV, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, nVar13);
                    dVar6.invoke(nVar13, 0);
                    sVar.p(true);
                }
                return b0Var;
        }
    }
}
