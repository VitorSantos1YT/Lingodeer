package en;

import androidx.lifecycle.ViewModel;
import bt.e1;
import bt.g7;
import com.lingo.lingoskill.object.KOCharZhuyin;
import com.yalantis.ucrop.view.CropImageView;
import h1.fa;
import h1.s1;
import h1.v1;
import j0.e2;
import j0.i;
import j0.t;
import j0.t1;
import j0.u;
import j0.v;
import java.util.List;
import kotlin.jvm.internal.m;
import l1.b1;
import l1.b3;
import l1.c3;
import l1.g;
import l1.n;
import l1.q1;
import l1.s;
import mt.b6;
import rz.b0;
import w2.q0;
import y2.h;
import y2.k;
import z1.j;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements fz.f {
    public final /* synthetic */ b1 H;
    public final /* synthetic */ b1 K;
    public final /* synthetic */ b1 L;
    public final /* synthetic */ b1 M;
    public final /* synthetic */ b1 N;
    public final /* synthetic */ b1 O;
    public final /* synthetic */ b1 P;
    public final /* synthetic */ b1 Q;
    public final /* synthetic */ b1 R;
    public final /* synthetic */ ViewModel S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25701a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f25702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0.b f25703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn.d f25704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b3 f25705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f25706f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b0 f25707t;

    public /* synthetic */ c(r rVar, o0.b bVar, b3 b3Var, dn.d dVar, gn.e eVar, List list, b0 b0Var, b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4, b1 b1Var5, b1 b1Var6, b1 b1Var7, b1 b1Var8, b1 b1Var9) {
        this.f25702b = rVar;
        this.f25703c = bVar;
        this.f25705e = b3Var;
        this.f25704d = dVar;
        this.S = eVar;
        this.f25706f = list;
        this.f25707t = b0Var;
        this.H = b1Var;
        this.K = b1Var2;
        this.L = b1Var3;
        this.M = b1Var4;
        this.N = b1Var5;
        this.O = b1Var6;
        this.P = b1Var7;
        this.Q = b1Var8;
        this.R = b1Var9;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x054d  */
    /* JADX WARN: Code duplicated, block: B:154:0x066e  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b1 b1Var;
        s sVar;
        KOCharZhuyin kOCharZhuyin;
        dn.d dVar;
        boolean zH;
        Object objQ;
        g gVar;
        b3 b3Var;
        KOCharZhuyin kOCharZhuyin2;
        g gVar2;
        dn.d dVar2;
        b1 b1Var2;
        boolean z11;
        b3 b3Var2;
        b1 b1Var3;
        b1 b1Var4;
        tq.d dVar3;
        b1 b1Var5;
        b1 b1Var6;
        b1 b1Var7;
        s sVar2;
        boolean z12;
        b1 b1Var8;
        switch (this.f25701a) {
            case 0:
                gn.e eVar = (gn.e) this.S;
                t1 paddingValues = (t1) obj;
                n nVar = (n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                j jVar = z1.c.f58467e;
                m.f(paddingValues, "paddingValues");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((s) nVar).f(paddingValues) ? 4 : 2;
                }
                s sVar3 = (s) nVar;
                if (sVar3.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    r rVarZ = j0.c.z(this.f25702b, paddingValues);
                    u uVarA = t.a(i.f35305c, z1.c.O, sVar3, 0);
                    int iHashCode = Long.hashCode(sVar3.T);
                    q1 q1VarL = sVar3.l();
                    r rVarC = z1.a.c(sVar3, rVarZ);
                    k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar);
                    } else {
                        sVar3.r0();
                    }
                    h hVar = y2.j.f56917f;
                    l1.t.J(hVar, uVarA, sVar3);
                    h hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL, sVar3);
                    h hVar3 = y2.j.f56918g;
                    if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar3, iHashCode, hVar3);
                    }
                    h hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC, sVar3);
                    b3 b3Var3 = this.f25705e;
                    boolean z13 = ((gn.a) b3Var3.getValue()).f29301a;
                    o oVar = o.f58481a;
                    b1 b1Var9 = this.H;
                    b1 b1Var10 = this.K;
                    b1 b1Var11 = this.L;
                    b1 b1Var12 = b1Var9;
                    b1 b1Var13 = this.M;
                    b1 b1Var14 = this.N;
                    gn.e eVar2 = eVar;
                    b1 b1Var15 = this.O;
                    if (z13) {
                        sVar3.d0(-1953494428);
                        r rVarA = v.a(e2.d(oVar, 1.0f), 1.0f);
                        q0 q0VarD = j0.o.d(jVar, false);
                        int iHashCode2 = Long.hashCode(sVar3.T);
                        q1 q1VarL2 = sVar3.l();
                        r rVarC2 = z1.a.c(sVar3, rVarA);
                        sVar3.h0();
                        if (sVar3.S) {
                            sVar3.k(iVar);
                        } else {
                            sVar3.r0();
                        }
                        l1.t.J(hVar, q0VarD, sVar3);
                        l1.t.J(hVar2, q1VarL2, sVar3);
                        if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar3);
                        }
                        l1.t.J(hVar4, rVarC2, sVar3);
                        tv.a.d(0, 1, sVar3, null);
                        sVar3.p(true);
                        sVar3.p(false);
                        b1Var = b1Var13;
                    } else {
                        if (((gn.a) b3Var3.getValue()).f29305e) {
                            sVar3.d0(-1953151816);
                            r rVarA2 = v.a(e2.d(oVar, 1.0f), 1.0f);
                            q0 q0VarD2 = j0.o.d(jVar, false);
                            int iHashCode3 = Long.hashCode(sVar3.T);
                            q1 q1VarL3 = sVar3.l();
                            r rVarC3 = z1.a.c(sVar3, rVarA2);
                            sVar3.h0();
                            if (sVar3.S) {
                                sVar3.k(iVar);
                            } else {
                                sVar3.r0();
                            }
                            l1.t.J(hVar, q0VarD2, sVar3);
                            l1.t.J(hVar2, q1VarL3, sVar3);
                            if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                                defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar3);
                            }
                            l1.t.J(hVar4, rVarC3, sVar3);
                            tv.a.g(((gn.a) b3Var3.getValue()).f29306f, null, sVar3, 48, 4);
                            sVar3.p(true);
                            sVar3.p(false);
                            b1Var = b1Var13;
                        } else {
                            sVar3.d0(-1952453882);
                            o0.b bVar = this.f25703c;
                            int iK = bVar.k();
                            c3 c3Var = v1.f31180a;
                            fa.a(iK, null, ((s1) sVar3.j(c3Var)).f31033p, ((s1) sVar3.j(c3Var)).f31034q, null, null, t1.e.d(29563142, new ei.i(this.f25706f, bVar, this.f25707t, 1), sVar3), sVar3, 1572864, 50);
                            r rVarA3 = v.a(e2.d(oVar, 1.0f), 1.0f);
                            eVar2 = eVar2;
                            ei.j jVar2 = new ei.j(eVar2, b1Var12, b1Var10, b1Var11, b1Var13, b1Var14, b1Var15, this.P, this.Q, 1);
                            b1Var15 = b1Var15;
                            b1Var = b1Var13;
                            b1Var10 = b1Var10;
                            b1Var14 = b1Var14;
                            b1Var11 = b1Var11;
                            b1Var12 = b1Var12;
                            ve.i.d(bVar, rVarA3, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(-1990016913, jVar2, sVar3), sVar3, 100663296, 16124);
                            sVar = sVar3;
                            sVar.p(false);
                        }
                        List list = (List) b1Var14.getValue();
                        kOCharZhuyin = ((gn.a) b3Var3.getValue()).f29302b;
                        boolean zF = sVar.f(b3Var3);
                        dVar = this.f25704d;
                        zH = zF | sVar.h(dVar) | sVar.h(eVar2);
                        objQ = sVar.Q();
                        gVar = l1.m.f39353a;
                        if (!zH || objQ == gVar) {
                            b1 b1Var16 = b1Var14;
                            b3Var = b3Var3;
                            kOCharZhuyin2 = kOCharZhuyin;
                            gn.e eVar3 = eVar2;
                            gVar2 = gVar;
                            d dVar4 = new d(dVar, b1Var16, b3Var, b1Var12, b1Var10, b1Var11, b1Var, eVar3, null, 0);
                            dVar2 = dVar;
                            eVar2 = eVar3;
                            b1Var2 = b1Var16;
                            sVar.o0(dVar4);
                            objQ = dVar4;
                        } else {
                            dVar2 = dVar;
                            b1Var2 = b1Var14;
                            gVar2 = gVar;
                            b3Var = b3Var3;
                            kOCharZhuyin2 = kOCharZhuyin;
                        }
                        l1.t.g(list, kOCharZhuyin2, (fz.e) objQ, sVar);
                        if (((Boolean) b1Var15.getValue()).booleanValue() || ((gn.a) b3Var.getValue()).f29302b == null) {
                            z11 = false;
                            sVar.d0(-1958091976);
                        } else {
                            sVar.d0(-1940005801);
                            List list2 = (List) this.R.getValue();
                            KOCharZhuyin kOCharZhuyin3 = ((gn.a) b3Var.getValue()).f29302b;
                            List list3 = (List) b1Var2.getValue();
                            Object objQ2 = sVar.Q();
                            if (objQ2 == gVar2) {
                                objQ2 = new dv.e(11);
                                sVar.o0(objQ2);
                            }
                            fz.c cVar = (fz.c) objQ2;
                            Object objQ3 = sVar.Q();
                            if (objQ3 == gVar2) {
                                objQ3 = new dv.e(12);
                                sVar.o0(objQ3);
                            }
                            fz.c cVar2 = (fz.c) objQ3;
                            Object objQ4 = sVar.Q();
                            if (objQ4 == gVar2) {
                                objQ4 = new dv.e(13);
                                sVar.o0(objQ4);
                            }
                            fz.c cVar3 = (fz.c) objQ4;
                            boolean zH2 = sVar.h(eVar2);
                            Object objQ5 = sVar.Q();
                            if (zH2 || objQ5 == gVar2) {
                                objQ5 = new com.google.firebase.datastorage.a(eVar2, 18);
                                sVar.o0(objQ5);
                            }
                            fz.c cVar4 = (fz.c) objQ5;
                            boolean zH3 = sVar.h(dVar2) | sVar.h(eVar2);
                            Object objQ6 = sVar.Q();
                            if (zH3 || objQ6 == gVar2) {
                                b1 b1Var17 = b1Var;
                                dn.d dVar5 = dVar2;
                                gn.e eVar4 = eVar2;
                                b1 b1Var18 = b1Var12;
                                b1 b1Var19 = b1Var10;
                                b1 b1Var20 = b1Var11;
                                g7 g7Var = new g7((Object) dVar5, (Object) eVar4, b1Var18, b1Var19, b1Var20, b1Var17, 2);
                                eVar2 = eVar4;
                                b1Var = b1Var17;
                                b1Var11 = b1Var20;
                                b1Var10 = b1Var19;
                                b1Var12 = b1Var18;
                                sVar.o0(g7Var);
                                objQ6 = g7Var;
                            }
                            fz.c cVar5 = (fz.c) objQ6;
                            boolean zH4 = sVar.h(eVar2);
                            Object objQ7 = sVar.Q();
                            if (zH4 || objQ7 == gVar2) {
                                e1 e1Var = new e1(eVar2, b1Var15, b1Var2, b1Var12, b1Var10, b1Var11, b1Var, 3);
                                sVar.o0(e1Var);
                                objQ7 = e1Var;
                            }
                            s sVar4 = sVar;
                            ls.f.b(true, list2, kOCharZhuyin3, cVar, cVar2, cVar3, cVar4, cVar5, list3, 0L, 0L, 0L, (fz.a) objQ7, sVar4, 224262);
                            sVar = sVar4;
                            z11 = false;
                        }
                        sVar.p(z11);
                        sVar.p(true);
                    }
                    sVar = sVar3;
                    List list4 = (List) b1Var14.getValue();
                    kOCharZhuyin = ((gn.a) b3Var3.getValue()).f29302b;
                    boolean zF2 = sVar.f(b3Var3);
                    dVar = this.f25704d;
                    zH = zF2 | sVar.h(dVar) | sVar.h(eVar2);
                    objQ = sVar.Q();
                    gVar = l1.m.f39353a;
                    if (zH) {
                        b1 b1Var110 = b1Var14;
                        b3Var = b3Var3;
                        kOCharZhuyin2 = kOCharZhuyin;
                        gn.e eVar5 = eVar2;
                        gVar2 = gVar;
                        d dVar6 = new d(dVar, b1Var110, b3Var, b1Var12, b1Var10, b1Var11, b1Var, eVar5, null, 0);
                        dVar2 = dVar;
                        eVar2 = eVar5;
                        b1Var2 = b1Var110;
                        sVar.o0(dVar6);
                        objQ = dVar6;
                    } else {
                        b1 b1Var111 = b1Var14;
                        b3Var = b3Var3;
                        kOCharZhuyin2 = kOCharZhuyin;
                        gn.e eVar6 = eVar2;
                        gVar2 = gVar;
                        d dVar7 = new d(dVar, b1Var111, b3Var, b1Var12, b1Var10, b1Var11, b1Var, eVar6, null, 0);
                        dVar2 = dVar;
                        eVar2 = eVar6;
                        b1Var2 = b1Var111;
                        sVar.o0(dVar7);
                        objQ = dVar7;
                    }
                    l1.t.g(list4, kOCharZhuyin2, (fz.e) objQ, sVar);
                    if (((Boolean) b1Var15.getValue()).booleanValue()) {
                        z11 = false;
                        sVar.d0(-1958091976);
                    } else {
                        z11 = false;
                        sVar.d0(-1958091976);
                    }
                    sVar.p(z11);
                    sVar.p(true);
                } else {
                    sVar3.W();
                }
                break;
            default:
                tq.d dVar8 = (tq.d) this.S;
                t1 paddingValues2 = (t1) obj;
                n nVar2 = (n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                j jVar3 = z1.c.f58467e;
                m.f(paddingValues2, "paddingValues");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((s) nVar2).f(paddingValues2) ? 4 : 2;
                }
                s sVar5 = (s) nVar2;
                if (sVar5.T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    r rVarZ2 = j0.c.z(this.f25702b, paddingValues2);
                    u uVarA2 = t.a(i.f35305c, z1.c.O, sVar5, 0);
                    int iHashCode4 = Long.hashCode(sVar5.T);
                    q1 q1VarL4 = sVar5.l();
                    r rVarC4 = z1.a.c(sVar5, rVarZ2);
                    k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar2);
                    } else {
                        sVar5.r0();
                    }
                    h hVar5 = y2.j.f56917f;
                    l1.t.J(hVar5, uVarA2, sVar5);
                    h hVar6 = y2.j.f56916e;
                    l1.t.J(hVar6, q1VarL4, sVar5);
                    h hVar7 = y2.j.f56918g;
                    if (sVar5.S || !m.a(sVar5.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar7);
                    }
                    h hVar8 = y2.j.f56915d;
                    l1.t.J(hVar8, rVarC4, sVar5);
                    b3 b3Var4 = this.f25705e;
                    ((tq.a) b3Var4.getValue()).getClass();
                    boolean z14 = ((tq.a) b3Var4.getValue()).f52511d;
                    o oVar2 = o.f58481a;
                    b1 b1Var21 = this.H;
                    b1 b1Var22 = this.K;
                    b1 b1Var23 = this.L;
                    b1 b1Var24 = this.M;
                    b1 b1Var25 = this.P;
                    b1 b1Var26 = this.Q;
                    if (z14) {
                        b3Var2 = b3Var4;
                        sVar5.d0(377439600);
                        r rVarA4 = v.a(e2.d(oVar2, 1.0f), 1.0f);
                        q0 q0VarD3 = j0.o.d(jVar3, false);
                        int iHashCode5 = Long.hashCode(sVar5.T);
                        q1 q1VarL5 = sVar5.l();
                        r rVarC5 = z1.a.c(sVar5, rVarA4);
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar2);
                        } else {
                            sVar5.r0();
                        }
                        l1.t.J(hVar5, q0VarD3, sVar5);
                        l1.t.J(hVar6, q1VarL5, sVar5);
                        if (sVar5.S || !m.a(sVar5.Q(), Integer.valueOf(iHashCode5))) {
                            defpackage.e.A(iHashCode5, sVar5, iHashCode5, hVar7);
                        }
                        l1.t.J(hVar8, rVarC5, sVar5);
                        tv.a.g(((tq.a) b3Var2.getValue()).f52512e, null, sVar5, 48, 4);
                        sVar5.p(true);
                        sVar5.p(false);
                        b1Var3 = b1Var21;
                        b1Var7 = b1Var23;
                        b1Var5 = b1Var25;
                        b1Var4 = b1Var22;
                        b1Var6 = b1Var26;
                        dVar3 = dVar8;
                        sVar2 = sVar5;
                    } else {
                        b3Var2 = b3Var4;
                        sVar5.d0(378142122);
                        o0.b bVar2 = this.f25703c;
                        int iK2 = bVar2.k();
                        c3 c3Var2 = v1.f31180a;
                        fa.a(iK2, null, ((s1) sVar5.j(c3Var2)).f31033p, ((s1) sVar5.j(c3Var2)).f31034q, null, null, t1.e.d(737887927, new ei.i(this.f25706f, bVar2, this.f25707t, 2), sVar5), sVar5, 1572864, 50);
                        b1Var3 = b1Var21;
                        b1Var4 = b1Var22;
                        dVar3 = dVar8;
                        b1Var5 = b1Var25;
                        b1Var6 = b1Var26;
                        b1Var7 = b1Var23;
                        ve.i.d(bVar2, v.a(e2.d(oVar2, 1.0f), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(1660925024, new ei.j(dVar3, b1Var3, b1Var4, b1Var23, b1Var24, this.N, this.O, b1Var25, b1Var26, 3), sVar5), sVar5, 100663296, 16124);
                        sVar2 = sVar5;
                        sVar2.p(false);
                    }
                    if (!((Boolean) b1Var24.getValue()).booleanValue() || ((tq.a) b3Var2.getValue()).f52508a == null) {
                        z12 = false;
                        sVar2.d0(372537508);
                    } else {
                        sVar2.d0(385329379);
                        List list5 = (List) this.R.getValue();
                        pq.a aVar = ((tq.a) b3Var2.getValue()).f52508a;
                        List list6 = (List) b1Var7.getValue();
                        Object objQ8 = sVar2.Q();
                        g gVar3 = l1.m.f39353a;
                        if (objQ8 == gVar3) {
                            objQ8 = new b6(9);
                            sVar2.o0(objQ8);
                        }
                        fz.c cVar6 = (fz.c) objQ8;
                        Object objQ9 = sVar2.Q();
                        if (objQ9 == gVar3) {
                            objQ9 = new b6(10);
                            sVar2.o0(objQ9);
                        }
                        fz.c cVar7 = (fz.c) objQ9;
                        Object objQ10 = sVar2.Q();
                        if (objQ10 == gVar3) {
                            objQ10 = new b6(11);
                            sVar2.o0(objQ10);
                        }
                        fz.c cVar8 = (fz.c) objQ10;
                        boolean zH5 = sVar2.h(dVar3);
                        Object objQ11 = sVar2.Q();
                        if (zH5 || objQ11 == gVar3) {
                            objQ11 = new kp.j(dVar3, 23);
                            sVar2.o0(objQ11);
                        }
                        fz.c cVar9 = (fz.c) objQ11;
                        dn.d dVar9 = this.f25704d;
                        boolean zH6 = sVar2.h(dVar9) | sVar2.h(dVar3);
                        Object objQ12 = sVar2.Q();
                        if (zH6 || objQ12 == gVar3) {
                            tq.d dVar10 = dVar3;
                            b1Var8 = b1Var6;
                            b1 b1Var27 = b1Var4;
                            b1 b1Var28 = b1Var5;
                            b1 b1Var29 = b1Var3;
                            g7 g7Var2 = new g7((Object) dVar9, (Object) dVar10, b1Var29, b1Var27, b1Var28, b1Var8, 13);
                            dVar3 = dVar10;
                            b1Var3 = b1Var29;
                            b1Var4 = b1Var27;
                            b1Var5 = b1Var28;
                            sVar2.o0(g7Var2);
                            objQ12 = g7Var2;
                        } else {
                            b1Var8 = b1Var6;
                        }
                        fz.c cVar10 = (fz.c) objQ12;
                        boolean zH7 = sVar2.h(dVar3);
                        Object objQ13 = sVar2.Q();
                        if (zH7 || objQ13 == gVar3) {
                            e1 e1Var2 = new e1(dVar3, b1Var24, b1Var7, b1Var3, b1Var4, b1Var5, b1Var8, 4);
                            sVar2.o0(e1Var2);
                            objQ13 = e1Var2;
                        }
                        s sVar6 = sVar2;
                        ls.f.b(true, list5, aVar, cVar6, cVar7, cVar8, cVar9, cVar10, list6, 0L, 0L, 0L, (fz.a) objQ13, sVar6, 224262);
                        sVar2 = sVar6;
                        z12 = false;
                    }
                    sVar2.p(z12);
                    sVar2.p(true);
                } else {
                    sVar5.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ c(r rVar, o0.b bVar, tq.d dVar, dn.d dVar2, b3 b3Var, List list, b0 b0Var, b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4, b1 b1Var5, b1 b1Var6, b1 b1Var7, b1 b1Var8, b1 b1Var9) {
        this.f25702b = rVar;
        this.f25703c = bVar;
        this.S = dVar;
        this.f25704d = dVar2;
        this.f25705e = b3Var;
        this.f25706f = list;
        this.f25707t = b0Var;
        this.H = b1Var;
        this.K = b1Var2;
        this.L = b1Var3;
        this.M = b1Var4;
        this.N = b1Var5;
        this.O = b1Var6;
        this.P = b1Var7;
        this.Q = b1Var8;
        this.R = b1Var9;
    }
}
