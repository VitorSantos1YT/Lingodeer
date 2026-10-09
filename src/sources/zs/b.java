package zs;

import android.graphics.Bitmap;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import d0.v;
import fr.j3;
import g2.f0;
import g2.x;
import h1.e1;
import h1.i9;
import h1.j0;
import h1.k7;
import h1.la;
import h1.qa;
import h1.r4;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.e2;
import j0.i;
import j0.i1;
import j0.t;
import j0.u;
import j0.z1;
import kotlin.jvm.internal.m;
import l1.c3;
import l1.n;
import l1.q1;
import l1.s;
import qy.b0;
import w2.q0;
import y2.j;
import y2.k;
import ys.k2;
import z1.h;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements fz.e {
    public final /* synthetic */ fz.a H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f59339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f59340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f59341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f59342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.c f59343f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz.c f59344t;

    public /* synthetic */ b(int i11, fz.a aVar, fz.a aVar2, fz.a aVar3, fz.c cVar, fz.c cVar2, fz.c cVar3, c cVar4) {
        this.f59338a = i11;
        this.f59339b = cVar4;
        this.f59340c = aVar;
        this.f59341d = aVar2;
        this.f59342e = cVar;
        this.f59343f = cVar2;
        this.f59344t = cVar3;
        this.H = aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0544  */
    /* JADX WARN: Code duplicated, block: B:110:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:38:0x011c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0165  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:48:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:53:0x0213  */
    /* JADX WARN: Code duplicated, block: B:56:0x0247  */
    /* JADX WARN: Code duplicated, block: B:58:0x024d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0269  */
    /* JADX WARN: Code duplicated, block: B:66:0x0343  */
    /* JADX WARN: Code duplicated, block: B:67:0x0347  */
    /* JADX WARN: Code duplicated, block: B:72:0x0364  */
    /* JADX WARN: Code duplicated, block: B:75:0x041f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0423  */
    /* JADX WARN: Code duplicated, block: B:81:0x043e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0450  */
    /* JADX WARN: Code duplicated, block: B:88:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:92:0x050b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0529  */
    /* JADX WARN: Code duplicated, block: B:98:0x053a  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var;
        long jY;
        int iHashCode;
        float f5;
        fz.a aVar;
        boolean zF;
        Object objQ;
        int iHashCode2;
        int iHashCode3;
        c3 c3Var;
        float f11;
        int iHashCode4;
        int iHashCode5;
        s sVar;
        c3 c3Var2;
        boolean z11;
        String str;
        boolean z12;
        fz.a aVar2;
        boolean zF2;
        Object objQ2;
        int i11 = this.f59338a;
        b0 b0Var2 = b0.f48488a;
        o oVar = o.f58481a;
        switch (i11) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i9.a(j0.c.A(e2.e(oVar, 1.0f), 16), r0.f.d(8), ((s1) sVar2.j(v1.f31180a)).f31033p, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(1663137887, new b(1, this.f59340c, this.f59341d, this.H, this.f59342e, this.f59343f, this.f59344t, this.f59339b), sVar2), sVar2, 12582918, 120);
                } else {
                    sVar2.W();
                }
                return b0Var2;
            default:
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar3 = (s) nVar2;
                if (!sVar3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar3.W();
                    return b0Var2;
                }
                r rVarE = e2.e(oVar, 1.0f);
                j0.d dVar = i.f35305c;
                h hVar = z1.c.O;
                u uVarA = t.a(dVar, hVar, sVar3, 0);
                int iHashCode6 = Long.hashCode(sVar3.T);
                q1 q1VarL = sVar3.l();
                r rVarC = z1.a.c(sVar3, rVarE);
                k.J.getClass();
                y2.i iVar = j.f56913b;
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                y2.h hVar2 = j.f56917f;
                l1.t.J(hVar2, uVarA, sVar3);
                y2.h hVar3 = j.f56916e;
                l1.t.J(hVar3, q1VarL, sVar3);
                y2.h hVar4 = j.f56918g;
                if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode6))) {
                    defpackage.e.A(iHashCode6, sVar3, iHashCode6, hVar4);
                }
                y2.h hVar5 = j.f56915d;
                l1.t.J(hVar5, rVarC, sVar3);
                r rVarG = e2.g(e2.e(oVar, 1.0f), 56);
                c cVar = this.f59339b;
                a aVar3 = cVar.f59354j;
                boolean z13 = cVar.f59351g;
                Bitmap bitmap = cVar.f59346b;
                if (aVar3 != null) {
                    b0Var = b0Var2;
                    if (aVar3.f59335d) {
                        sVar3.d0(878220628);
                        jY = ob.f.w((s1) sVar3.j(v1.f31180a), sVar3);
                        sVar3.p(false);
                    }
                    r rVarH = d0.n.h(rVarG, jY, f0.f28556b);
                    q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                    iHashCode = Long.hashCode(sVar3.T);
                    q1 q1VarL2 = sVar3.l();
                    r rVarC2 = z1.a.c(sVar3, rVarH);
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(hVar2, q0VarD, sVar3);
                    l1.t.J(hVar3, q1VarL2, sVar3);
                    if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar3, iHashCode, hVar4);
                    }
                    l1.t.J(hVar5, rVarC2, sVar3);
                    k2.b bVarY = se.k.y(R.drawable.close_24px, sVar3, 0);
                    f5 = 16;
                    r rVarN = e2.n(j0.c.E(j0.r.f35391a.a(oVar, z1.c.f58466d), f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 24);
                    aVar = this.f59341d;
                    zF = sVar3.f(aVar);
                    objQ = sVar3.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zF || objQ == gVar) {
                        objQ = new k2(9, aVar);
                        sVar3.o0(objQ);
                    }
                    r rVarO = d0.n.o(rVarN, false, null, (fz.a) objQ, 15);
                    long j11 = x.f28618e;
                    r4.b(bVarY, "关闭", rVarO, j11, sVar3, 3120, 0);
                    ua.b(ub.a.e0(sVar3, R.string.report), null, j11, j3.A(20), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar3, 3456, 0, 130546);
                    sVar3.p(true);
                    r rVarE2 = e2.e(oVar, 1.0f);
                    u uVarA2 = t.a(dVar, hVar, sVar3, 0);
                    iHashCode2 = Long.hashCode(sVar3.T);
                    q1 q1VarL3 = sVar3.l();
                    r rVarC3 = z1.a.c(sVar3, rVarE2);
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(hVar2, uVarA2, sVar3);
                    l1.t.J(hVar3, q1VarL3, sVar3);
                    if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar4);
                    }
                    l1.t.J(hVar5, rVarC3, sVar3);
                    float f12 = 42;
                    r rVarG2 = e2.g(e2.e(oVar, 1.0f), f12);
                    z1.i iVar2 = z1.c.M;
                    j0.b bVar = i.f35303a;
                    a2 a2VarA = z1.a(bVar, iVar2, sVar3, 48);
                    iHashCode3 = Long.hashCode(sVar3.T);
                    q1 q1VarL4 = sVar3.l();
                    r rVarC4 = z1.a.c(sVar3, rVarG2);
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(hVar2, a2VarA, sVar3);
                    l1.t.J(hVar3, q1VarL4, sVar3);
                    if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar4);
                    }
                    l1.t.J(hVar5, rVarC4, sVar3);
                    boolean z14 = !z13;
                    e1.a(cVar.f59349e, this.f59342e, null, z14, null, sVar3, 0, 52);
                    float f13 = 5;
                    j0.c.g(sVar3, e2.s(oVar, f13));
                    String strE0 = ub.a.e0(sVar3, R.string.my_answer_should_be_accepted);
                    c3Var = v1.f31180a;
                    ua.b(strE0, null, ((s1) sVar3.j(c3Var)).f31034q, j3.A(12), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 3072, 0, 131058);
                    sVar3.p(true);
                    f11 = (float) 0.5d;
                    k7.g(e2.e(oVar, 1.0f), f11, 0L, sVar3, 54, 4);
                    r rVarG3 = e2.g(e2.e(oVar, 1.0f), f12);
                    a2 a2VarA2 = z1.a(bVar, iVar2, sVar3, 48);
                    iHashCode4 = Long.hashCode(sVar3.T);
                    q1 q1VarL5 = sVar3.l();
                    r rVarC5 = z1.a.c(sVar3, rVarG3);
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(hVar2, a2VarA2, sVar3);
                    l1.t.J(hVar3, q1VarL5, sVar3);
                    if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar4);
                    }
                    l1.t.J(hVar5, rVarC5, sVar3);
                    e1.a(cVar.f59350f, this.f59343f, null, z14, null, sVar3, 0, 52);
                    j0.c.g(sVar3, e2.s(oVar, f13));
                    ua.b(ub.a.e0(sVar3, R.string.other_issue), null, ((s1) sVar3.j(c3Var)).f31034q, j3.A(12), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 3072, 0, 131058);
                    sVar3.p(true);
                    k7.g(e2.e(oVar, 1.0f), f11, 0L, sVar3, 54, 4);
                    sVar3.p(true);
                    float f14 = 10;
                    r rVarE3 = j0.c.E(e2.g(e2.e(oVar, 1.0f), 170), f5, f14, r7, CropImageView.DEFAULT_ASPECT_RATIO, 8);
                    a2 a2VarA3 = z1.a(bVar, iVar2, sVar3, 48);
                    iHashCode5 = Long.hashCode(sVar3.T);
                    q1 q1VarL6 = sVar3.l();
                    r rVarC6 = z1.a.c(sVar3, rVarE3);
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(hVar2, a2VarA3, sVar3);
                    l1.t.J(hVar3, q1VarL6, sVar3);
                    if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode5))) {
                        defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar4);
                    }
                    l1.t.J(hVar5, rVarC6, sVar3);
                    String str2 = cVar.f59348d;
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    r rVarC7 = e2.c(new i1(1.0f, true), 1.0f);
                    la laVar = la.f30616a;
                    long j12 = x.f28621h;
                    qa.a(str2, this.f59344t, rVarC7, z14, null, g.f59370a, null, false, null, null, null, false, 0, 0, null, la.c(0L, 0L, 0L, j12, j12, j12, 0L, 0L, 0L, 0L, sVar3, 2147483535), sVar3, 12582912, 0, 4194160);
                    sVar = sVar3;
                    j0.c.g(sVar, e2.s(oVar, f14));
                    if (bitmap != null) {
                        sVar.d0(2096489408);
                        g2.h hVar6 = new g2.h(bitmap);
                        float f15 = 4;
                        r rVarB = d2.h.b(e2.s(oVar, 70), r0.f.d(f15));
                        c3Var2 = c3Var;
                        v vVarA = d0.n.a(((s1) sVar.j(c3Var2)).A, f11);
                        r rVarK = d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.d(f15), rVarB);
                        aVar2 = this.H;
                        zF2 = sVar.f(aVar2);
                        objQ2 = sVar.Q();
                        if (zF2 || objQ2 == gVar) {
                            objQ2 = new k2(10, aVar2);
                            sVar.o0(objQ2);
                        }
                        z11 = false;
                        d0.n.d(hVar6, "屏幕截图", d0.n.o(rVarK, false, null, (fz.a) objQ2, 15), w2.i.f54514a, sVar);
                    } else {
                        c3Var2 = c3Var;
                        z11 = false;
                        sVar.d0(2087296637);
                    }
                    sVar.p(z11);
                    sVar.p(true);
                    str = cVar.f59352h;
                    if (str == null) {
                        sVar.d0(1460457345);
                    } else {
                        sVar.d0(1460457346);
                        ua.b(str, j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), ((s1) sVar.j(c3Var2)).f31040w, j3.A(12), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 3120, 0, 131056);
                        sVar = sVar;
                        z11 = false;
                    }
                    sVar.p(z11);
                    float f16 = 32;
                    r rVarG4 = e2.g(e2.e(j0.c.B(oVar, f16, f16), 1.0f), f12);
                    if (!z13 || (!cVar.f59349e && (!cVar.f59350f || cVar.f59348d.length() <= 0))) {
                        z12 = z11;
                    } else {
                        z12 = true;
                    }
                    j0.v1 v1Var = j0.f30447a;
                    s sVar4 = sVar;
                    k7.b(this.f59340c, rVarG4, z12, null, j0.a(((s1) sVar.j(c3Var2)).f31017a, 0L, sVar, 14), null, null, null, t1.e.d(-21745863, new qu.s(cVar, 12), sVar), sVar4, 805306416, 488);
                    sVar4.p(true);
                    return b0Var;
                }
                b0Var = b0Var2;
                sVar3.d0(878222898);
                jY = ob.f.y((s1) sVar3.j(v1.f31180a), sVar3);
                sVar3.p(false);
                r rVarH2 = d0.n.h(rVarG, jY, f0.f28556b);
                q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
                iHashCode = Long.hashCode(sVar3.T);
                q1 q1VarL7 = sVar3.l();
                r rVarC8 = z1.a.c(sVar3, rVarH2);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                l1.t.J(hVar2, q0VarD2, sVar3);
                l1.t.J(hVar3, q1VarL7, sVar3);
                if (sVar3.S) {
                    defpackage.e.A(iHashCode, sVar3, iHashCode, hVar4);
                } else {
                    defpackage.e.A(iHashCode, sVar3, iHashCode, hVar4);
                }
                l1.t.J(hVar5, rVarC8, sVar3);
                k2.b bVarY2 = se.k.y(R.drawable.close_24px, sVar3, 0);
                f5 = 16;
                r rVarN2 = e2.n(j0.c.E(j0.r.f35391a.a(oVar, z1.c.f58466d), f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 24);
                aVar = this.f59341d;
                zF = sVar3.f(aVar);
                objQ = sVar3.Q();
                l1.g gVar2 = l1.m.f39353a;
                if (zF) {
                    objQ = new k2(9, aVar);
                    sVar3.o0(objQ);
                } else {
                    objQ = new k2(9, aVar);
                    sVar3.o0(objQ);
                }
                r rVarO2 = d0.n.o(rVarN2, false, null, (fz.a) objQ, 15);
                long j13 = x.f28618e;
                r4.b(bVarY2, "关闭", rVarO2, j13, sVar3, 3120, 0);
                ua.b(ub.a.e0(sVar3, R.string.report), null, j13, j3.A(20), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar3, 3456, 0, 130546);
                sVar3.p(true);
                r rVarE4 = e2.e(oVar, 1.0f);
                u uVarA3 = t.a(dVar, hVar, sVar3, 0);
                iHashCode2 = Long.hashCode(sVar3.T);
                q1 q1VarL8 = sVar3.l();
                r rVarC9 = z1.a.c(sVar3, rVarE4);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                l1.t.J(hVar2, uVarA3, sVar3);
                l1.t.J(hVar3, q1VarL8, sVar3);
                if (sVar3.S) {
                    defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar4);
                } else {
                    defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar4);
                }
                l1.t.J(hVar5, rVarC9, sVar3);
                float f17 = 42;
                r rVarG5 = e2.g(e2.e(oVar, 1.0f), f17);
                z1.i iVar3 = z1.c.M;
                j0.b bVar2 = i.f35303a;
                a2 a2VarA4 = z1.a(bVar2, iVar3, sVar3, 48);
                iHashCode3 = Long.hashCode(sVar3.T);
                q1 q1VarL9 = sVar3.l();
                r rVarC10 = z1.a.c(sVar3, rVarG5);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                l1.t.J(hVar2, a2VarA4, sVar3);
                l1.t.J(hVar3, q1VarL9, sVar3);
                if (sVar3.S) {
                    defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar4);
                } else {
                    defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar4);
                }
                l1.t.J(hVar5, rVarC10, sVar3);
                boolean z15 = !z13;
                e1.a(cVar.f59349e, this.f59342e, null, z15, null, sVar3, 0, 52);
                float f18 = 5;
                j0.c.g(sVar3, e2.s(oVar, f18));
                String strE1 = ub.a.e0(sVar3, R.string.my_answer_should_be_accepted);
                c3Var = v1.f31180a;
                ua.b(strE1, null, ((s1) sVar3.j(c3Var)).f31034q, j3.A(12), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 3072, 0, 131058);
                sVar3.p(true);
                f11 = (float) 0.5d;
                k7.g(e2.e(oVar, 1.0f), f11, 0L, sVar3, 54, 4);
                r rVarG6 = e2.g(e2.e(oVar, 1.0f), f17);
                a2 a2VarA5 = z1.a(bVar2, iVar3, sVar3, 48);
                iHashCode4 = Long.hashCode(sVar3.T);
                q1 q1VarL10 = sVar3.l();
                r rVarC11 = z1.a.c(sVar3, rVarG6);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                l1.t.J(hVar2, a2VarA5, sVar3);
                l1.t.J(hVar3, q1VarL10, sVar3);
                if (sVar3.S) {
                    defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar4);
                } else {
                    defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar4);
                }
                l1.t.J(hVar5, rVarC11, sVar3);
                e1.a(cVar.f59350f, this.f59343f, null, z15, null, sVar3, 0, 52);
                j0.c.g(sVar3, e2.s(oVar, f18));
                ua.b(ub.a.e0(sVar3, R.string.other_issue), null, ((s1) sVar3.j(c3Var)).f31034q, j3.A(12), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 3072, 0, 131058);
                sVar3.p(true);
                k7.g(e2.e(oVar, 1.0f), f11, 0L, sVar3, 54, 4);
                sVar3.p(true);
                float f19 = 10;
                r rVarE5 = j0.c.E(e2.g(e2.e(oVar, 1.0f), 170), f5, f19, r7, CropImageView.DEFAULT_ASPECT_RATIO, 8);
                a2 a2VarA6 = z1.a(bVar2, iVar3, sVar3, 48);
                iHashCode5 = Long.hashCode(sVar3.T);
                q1 q1VarL11 = sVar3.l();
                r rVarC12 = z1.a.c(sVar3, rVarE5);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                l1.t.J(hVar2, a2VarA6, sVar3);
                l1.t.J(hVar3, q1VarL11, sVar3);
                if (sVar3.S) {
                    defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar4);
                } else {
                    defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar4);
                }
                l1.t.J(hVar5, rVarC12, sVar3);
                String str3 = cVar.f59348d;
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                r rVarC13 = e2.c(new i1(1.0f, true), 1.0f);
                la laVar2 = la.f30616a;
                long j14 = x.f28621h;
                qa.a(str3, this.f59344t, rVarC13, z15, null, g.f59370a, null, false, null, null, null, false, 0, 0, null, la.c(0L, 0L, 0L, j14, j14, j14, 0L, 0L, 0L, 0L, sVar3, 2147483535), sVar3, 12582912, 0, 4194160);
                sVar = sVar3;
                j0.c.g(sVar, e2.s(oVar, f19));
                if (bitmap != null) {
                    sVar.d0(2096489408);
                    g2.h hVar7 = new g2.h(bitmap);
                    float f110 = 4;
                    r rVarB2 = d2.h.b(e2.s(oVar, 70), r0.f.d(f110));
                    c3Var2 = c3Var;
                    v vVarA2 = d0.n.a(((s1) sVar.j(c3Var2)).A, f11);
                    r rVarK2 = d0.n.k(vVarA2.f22811a, vVarA2.f22812b, r0.f.d(f110), rVarB2);
                    aVar2 = this.H;
                    zF2 = sVar.f(aVar2);
                    objQ2 = sVar.Q();
                    if (zF2) {
                        objQ2 = new k2(10, aVar2);
                        sVar.o0(objQ2);
                    } else {
                        objQ2 = new k2(10, aVar2);
                        sVar.o0(objQ2);
                    }
                    z11 = false;
                    d0.n.d(hVar7, "屏幕截图", d0.n.o(rVarK2, false, null, (fz.a) objQ2, 15), w2.i.f54514a, sVar);
                } else {
                    c3Var2 = c3Var;
                    z11 = false;
                    sVar.d0(2087296637);
                }
                sVar.p(z11);
                sVar.p(true);
                str = cVar.f59352h;
                if (str == null) {
                    sVar.d0(1460457345);
                } else {
                    sVar.d0(1460457346);
                    ua.b(str, j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), ((s1) sVar.j(c3Var2)).f31040w, j3.A(12), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 3120, 0, 131056);
                    sVar = sVar;
                    z11 = false;
                }
                sVar.p(z11);
                float f111 = 32;
                r rVarG7 = e2.g(e2.e(j0.c.B(oVar, f111, f111), 1.0f), f17);
                if (z13) {
                    z12 = z11;
                } else {
                    z12 = z11;
                }
                j0.v1 v1Var2 = j0.f30447a;
                s sVar5 = sVar;
                k7.b(this.f59340c, rVarG7, z12, null, j0.a(((s1) sVar.j(c3Var2)).f31017a, 0L, sVar, 14), null, null, null, t1.e.d(-21745863, new qu.s(cVar, 12), sVar), sVar5, 805306416, 488);
                sVar5.p(true);
                return b0Var;
        }
    }
}
