package l1;

import android.os.Trace;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import com.lingodeer.data.model.AchievementLevelType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements n {
    public int A;
    public int B;
    public boolean C;
    public final r D;
    public final ArrayList E;
    public boolean F;
    public l2 G;
    public m2 H;
    public p2 I;
    public boolean J;
    public q1 K;
    public m1.a L;
    public final m1.b M;
    public b N;
    public m1.c O;
    public se.n P;
    public final y1.d Q;
    public final vy.i R;
    public boolean S;
    public long T;
    public y U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f39434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f39435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m2 f39436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y.l0 f39437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m1.a f39438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m1.a f39439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0.b2 f39440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z f39441h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p1 f39443j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39444k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f39445l;
    public int m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f39447o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public y.v f39448p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f39449q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f39450r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public y.x f39454v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f39455w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f39457y;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f39442i = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f39446n = new p0(0, false);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f39451s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p0 f39452t = new p0(0, false);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public q1 f39453u = t1.i.f51992d;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p0 f39456x = new p0(0, false);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f39458z = -1;

    public s(a aVar, w wVar, m2 m2Var, y.l0 l0Var, m1.a aVar2, m1.a aVar3, a0.b2 b2Var, z zVar) {
        this.f39434a = aVar;
        this.f39435b = wVar;
        this.f39436c = m2Var;
        this.f39437d = l0Var;
        this.f39438e = aVar2;
        this.f39439f = aVar3;
        this.f39440g = b2Var;
        this.f39441h = zVar;
        this.C = wVar.f() || wVar.d();
        this.D = new r(this, 0);
        this.E = new ArrayList();
        l2 l2VarE = m2Var.e();
        l2VarE.c();
        this.G = l2VarE;
        m2 m2Var2 = new m2();
        if (wVar.f()) {
            m2Var2.d();
        }
        if (wVar.d()) {
            m2Var2.M = new y.x();
        }
        this.H = m2Var2;
        p2 p2VarF = m2Var2.f();
        p2VarF.e(true);
        this.I = p2VarF;
        this.M = new m1.b(this, aVar2);
        l2 l2VarE2 = this.H.e();
        try {
            b bVarA = l2VarE2.a(0);
            l2VarE2.c();
            this.N = bVarA;
            this.O = new m1.c();
            this.Q = new y1.d(this);
            vy.i iVarJ = wVar.j();
            vy.i iVarD = D();
            this.R = iVarJ.plus(iVarD == null ? vy.j.f54321a : iVarD);
        } catch (Throwable th2) {
            l2VarE2.c();
            throw th2;
        }
    }

    public static final int S(s sVar, int i11, boolean z11, int i12) {
        l2 l2Var = sVar.G;
        if (l2Var.j(i11)) {
            int i13 = l2Var.i(i11);
            Object objP = l2Var.p(l2Var.f39341b, i11);
            if (i13 == 206 && kotlin.jvm.internal.m.a(objP, u.f39478e)) {
                Object objH = l2Var.h(i11, 0);
                g2 g2Var = objH instanceof g2 ? (g2) objH : null;
                f2 f2Var = g2Var != null ? g2Var.f39309a : null;
                p pVar = f2Var instanceof p ? (p) f2Var : null;
                if (pVar != null) {
                    for (s sVar2 : pVar.f39387a.f39423e) {
                        m2 m2Var = sVar2.f39436c;
                        if (m2Var.f39359b > 0 && (m2Var.f39358a[1] & 67108864) != 0) {
                            z zVar = sVar2.f39441h;
                            synchronized (zVar.f39519d) {
                                zVar.o();
                                y.i0 i0Var = zVar.P;
                                zVar.P = com.bumptech.glide.g.k();
                                try {
                                    zVar.X.k0(i0Var);
                                } catch (Throwable th2) {
                                    zVar.P = i0Var;
                                    throw th2;
                                }
                            }
                            m1.a aVar = new m1.a();
                            sVar2.L = aVar;
                            l2 l2VarE = sVar2.f39436c.e();
                            try {
                                sVar2.G = l2VarE;
                                m1.b bVar = sVar2.M;
                                m1.a aVar2 = bVar.f40765b;
                                try {
                                    bVar.f40765b = aVar;
                                    sVar2.R(0);
                                    m1.b bVar2 = sVar2.M;
                                    bVar2.b();
                                    if (bVar2.f40766c) {
                                        bVar2.f40765b.f40762d.K(m1.c0.f40779c);
                                        if (bVar2.f40766c) {
                                            bVar2.d(false);
                                            bVar2.d(false);
                                            bVar2.f40765b.f40762d.K(m1.m.f40803c);
                                            bVar2.f40766c = false;
                                        }
                                    }
                                    bVar.f40765b = aVar2;
                                    l2VarE.c();
                                } catch (Throwable th3) {
                                    bVar.f40765b = aVar2;
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                l2VarE.c();
                                throw th4;
                            }
                        }
                        sVar.f39435b.r(sVar2.f39441h);
                    }
                }
                return l2Var.o(i11);
            }
            if (!l2Var.l(i11)) {
                return l2Var.o(i11);
            }
        } else if (l2Var.d(i11)) {
            int i14 = l2Var.f39341b[(i11 * 5) + 3] + i11;
            int iS = 0;
            for (int i15 = i11 + 1; i15 < i14; i15 += l2Var.f39341b[(i15 * 5) + 3]) {
                boolean zL = l2Var.l(i15);
                if (zL) {
                    sVar.M.c();
                    m1.b bVar3 = sVar.M;
                    Object objN = l2Var.n(i15);
                    bVar3.c();
                    bVar3.f40771h.add(objN);
                }
                iS += S(sVar, i15, zL || z11, zL ? 0 : i12 + iS);
                if (zL) {
                    sVar.M.c();
                    sVar.M.a();
                }
            }
            if (!l2Var.l(i11)) {
                return iS;
            }
        } else if (!l2Var.l(i11)) {
            return l2Var.o(i11);
        }
        return 1;
    }

    public final q1 A() {
        return l();
    }

    public final x1 B() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (x1) nv.p.f(1, arrayList);
    }

    public final boolean C() {
        if (!F() || this.f39455w) {
            return true;
        }
        x1 x1VarB = B();
        return (x1VarB == null || (x1VarB.f39500b & 4) == 0) ? false : true;
    }

    public final y1.d D() {
        if (this.f39435b.k()) {
            return this.Q;
        }
        return null;
    }

    public final boolean E() {
        return this.S;
    }

    public final boolean F() {
        x1 x1VarB;
        return (this.S || this.f39457y || this.f39455w || (x1VarB = B()) == null || (x1VarB.f39500b & 8) != 0) ? false : true;
    }

    public final void G(ArrayList arrayList) {
        m1.a aVar = this.f39439f;
        m1.b bVar = this.M;
        m1.a aVar2 = bVar.f40765b;
        try {
            bVar.f40765b = aVar;
            aVar.f40762d.K(m1.a0.f40763c);
            if (arrayList.size() <= 0) {
                bVar.b();
                bVar.f40765b.f40762d.K(m1.n.f40804c);
                bVar.f40769f = 0;
                bVar.f40765b = aVar2;
                return;
            }
            qy.l lVar = (qy.l) arrayList.get(0);
            z0 z0Var = (z0) lVar.f48495a;
            z0Var.getClass();
            throw null;
        } catch (Throwable th2) {
            bVar.f40765b = aVar2;
            throw th2;
        }
    }

    public final void H(q1 q1Var, Object obj) {
        a0(126665345, null);
        I();
        p0(obj);
        long j11 = this.T;
        try {
            this.T = 126665345;
            if (this.S) {
                p2.z(this.I);
            }
            boolean z11 = (this.S || kotlin.jvm.internal.m.a(this.G.f(), q1Var)) ? false : true;
            if (z11) {
                O(q1Var);
            }
            X(u.f39476c, 202, 0, q1Var);
            this.K = null;
            this.f39455w = z11;
            throw null;
        } catch (Throwable th2) {
            try {
                hz.b.T(th2, new o(2, this));
                throw th2;
            } catch (Throwable th3) {
                p(false);
                this.K = null;
                this.T = j11;
                p(false);
                throw th3;
            }
        }
    }

    public final Object I() {
        boolean z11 = this.S;
        g gVar = m.f39353a;
        if (!z11) {
            Object objM = this.G.m();
            if (!this.f39457y || (objM instanceof j2)) {
                return objM;
            }
        } else if (this.f39450r) {
            u.a("A call to createNode(), emitNode() or useNode() expected");
            return gVar;
        }
        return gVar;
    }

    public final List J() {
        w wVar = this.f39435b;
        v vVarH = wVar.h();
        z zVar = vVarH != null ? (z) vVarH : null;
        if (zVar != null) {
            m2 m2Var = zVar.f39521f;
            l2 l2VarE = m2Var.e();
            try {
                Integer numR = gb.r.r(l2VarE, wVar, 0, l2VarE.f39342c);
                l2VarE.c();
                if (numR != null) {
                    l2 l2VarE2 = m2Var.e();
                    try {
                        return ry.m.H0(gb.r.W(l2VarE2, numR.intValue(), 0), zVar.X.J());
                    } finally {
                        l2VarE2.c();
                    }
                }
            } catch (Throwable th2) {
                l2VarE.c();
                throw th2;
            }
        }
        return ry.r.f50854a;
    }

    public final int K(int i11) {
        int iQ = this.G.q(i11) + 1;
        int i12 = 0;
        while (iQ < i11) {
            if (!this.G.k(iQ)) {
                i12++;
            }
            iQ += o2.a(this.G.f39341b, iQ);
        }
        return i12;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0059 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:18:0x0038, B:21:0x0040, B:23:0x0048, B:25:0x004e, B:26:0x0052, B:27:0x0053, B:29:0x0059, B:22:0x0044), top: B:34:0x0005, inners: #1 }] */
    public final Object L(z zVar, z zVar2, Integer num, List list, fz.a aVar) {
        Object objInvoke;
        boolean z11 = this.F;
        int i11 = this.f39444k;
        try {
            this.F = true;
            this.f39444k = 0;
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                qy.l lVar = (qy.l) list.get(i12);
                x1 x1Var = (x1) lVar.f48495a;
                Object obj = lVar.f48496b;
                if (obj != null) {
                    j0(x1Var, obj);
                } else {
                    j0(x1Var, null);
                }
            }
            if (zVar == null) {
                objInvoke = aVar.invoke();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (zVar2 == null || zVar2.equals(zVar) || iIntValue < 0) {
                    objInvoke = aVar.invoke();
                } else {
                    zVar.T = zVar2;
                    zVar.U = iIntValue;
                    try {
                        objInvoke = aVar.invoke();
                        zVar.T = null;
                        zVar.U = 0;
                    } catch (Throwable th2) {
                        zVar.T = null;
                        zVar.U = 0;
                        throw th2;
                    }
                }
                if (objInvoke == null) {
                    objInvoke = aVar.invoke();
                }
            }
            this.F = z11;
            this.f39444k = i11;
            return objInvoke;
        } catch (Throwable th3) {
            this.F = z11;
            this.f39444k = i11;
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:197:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f2 A[LOOP:7: B:34:0x00b1->B:50:0x00f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:54:0x0106  */
    /* JADX WARN: Code duplicated, block: B:61:0x0131  */
    /* JADX WARN: Code duplicated, block: B:62:0x0133  */
    /* JADX WARN: Code duplicated, block: B:65:0x0138  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:66:0x0144
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void M() {
        /*
            Method dump skipped, instruction units count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.s.M():void");
    }

    public final void N() {
        int i11;
        R(this.G.f39346g);
        m1.b bVar = this.M;
        bVar.d(false);
        p0 p0Var = bVar.f40767d;
        s sVar = bVar.f40764a;
        l2 l2Var = sVar.G;
        if (l2Var.f39342c > 0 && p0Var.b(-2) != (i11 = l2Var.f39348i)) {
            if (!bVar.f40766c && bVar.f40768e) {
                bVar.d(false);
                bVar.f40765b.f40762d.K(m1.q.f40807c);
                bVar.f40766c = true;
            }
            if (i11 > 0) {
                b bVarA = l2Var.a(i11);
                p0Var.d(i11);
                bVar.d(false);
                m1.l0 l0Var = bVar.f40765b.f40762d;
                l0Var.K(m1.p.f40806c);
                qx.p.C(l0Var, 0, bVarA);
                bVar.f40766c = true;
            }
        }
        bVar.f40765b.f40762d.K(m1.y.f40819c);
        int i12 = bVar.f40769f;
        l2 l2Var2 = sVar.G;
        bVar.f40769f = l2Var2.f39341b[(l2Var2.f39346g * 5) + 3] + i12;
    }

    public final void O(q1 q1Var) {
        y.x xVar = this.f39454v;
        if (xVar == null) {
            xVar = new y.x();
            this.f39454v = xVar;
        }
        xVar.h(this.G.f39346g, q1Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    public final void P(int i11, int i12, int i13) {
        l2 l2Var = this.G;
        if (i11 == i12) {
            i13 = i11;
        } else if (i11 != i13 && i12 != i13) {
            if (l2Var.q(i11) == i12) {
                i13 = i12;
            } else if (l2Var.q(i12) == i11) {
                i13 = i11;
            } else if (l2Var.q(i11) == l2Var.q(i12)) {
                i13 = l2Var.q(i11);
            } else {
                int iQ = i11;
                int i14 = 0;
                while (iQ > 0 && iQ != i13) {
                    iQ = l2Var.q(iQ);
                    i14++;
                }
                int iQ2 = i12;
                int i15 = 0;
                while (iQ2 > 0 && iQ2 != i13) {
                    iQ2 = l2Var.q(iQ2);
                    i15++;
                }
                int i16 = i14 - i15;
                int iQ3 = i11;
                for (int i17 = 0; i17 < i16; i17++) {
                    iQ3 = l2Var.q(iQ3);
                }
                int i18 = i15 - i14;
                int iQ4 = i12;
                for (int i19 = 0; i19 < i18; i19++) {
                    iQ4 = l2Var.q(iQ4);
                }
                i13 = iQ3;
                for (int iQ5 = iQ4; i13 != iQ5; iQ5 = l2Var.q(iQ5)) {
                    i13 = l2Var.q(i13);
                }
            }
        }
        while (i11 > 0 && i11 != i13) {
            if (l2Var.l(i11)) {
                this.M.a();
            }
            i11 = l2Var.q(i11);
        }
        o(i12, i13);
    }

    public final Object Q() {
        boolean z11 = this.S;
        g gVar = m.f39353a;
        if (!z11) {
            Object objM = this.G.m();
            if (!this.f39457y || (objM instanceof j2)) {
                return objM instanceof g2 ? ((g2) objM).f39309a : objM;
            }
        } else if (this.f39450r) {
            u.a("A call to createNode(), emitNode() or useNode() expected");
            return gVar;
        }
        return gVar;
    }

    public final void R(int i11) {
        boolean zL = this.G.l(i11);
        m1.b bVar = this.M;
        if (zL) {
            bVar.c();
            Object objN = this.G.n(i11);
            bVar.c();
            bVar.f40771h.add(objN);
        }
        S(this, i11, zL, 0);
        bVar.c();
        if (zL) {
            bVar.a();
        }
    }

    public final boolean T(int i11, boolean z11) {
        if ((i11 & 1) == 0 && (this.S || this.f39457y)) {
            se.n nVar = this.P;
            if (nVar != null && B() != null) {
                nVar.getClass();
            }
        } else if (!z11 && F()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00af  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ff  */
    public final void U() {
        int i11;
        long jRotateLeft;
        long jRotateLeft2;
        if (this.f39451s.isEmpty()) {
            this.f39445l = this.G.s() + this.f39445l;
            return;
        }
        l2 l2Var = this.G;
        int iG = l2Var.g();
        int[] iArr = l2Var.f39341b;
        int i12 = l2Var.f39346g;
        Object objP = i12 < l2Var.f39347h ? l2Var.p(iArr, i12) : null;
        Object objF = l2Var.f();
        int i13 = this.m;
        g gVar = m.f39353a;
        if (objP == null) {
            if (objF == null || iG != 207 || objF.equals(gVar)) {
                jRotateLeft2 = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) iG), 3) ^ ((long) i13);
            } else {
                this.T = Long.rotateLeft(((long) objF.hashCode()) ^ Long.rotateLeft(this.T, 3), 3) ^ ((long) i13);
            }
            c0(null, (iArr[(l2Var.f39346g * 5) + 1] & 1073741824) != 0);
            M();
            l2Var.e();
            if (objP != null) {
                if (objP instanceof Enum) {
                    this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) objP.hashCode()), 3);
                }
            }
            if (objF == null && iG == 207 && !objF.equals(gVar)) {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i13), 3) ^ ((long) objF.hashCode()), 3);
                return;
            } else {
                this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i13), 3), 3);
            }
        }
        if (objP instanceof Enum) {
            jRotateLeft = Long.rotateLeft(((long) ((Enum) objP).ordinal()) ^ Long.rotateLeft(this.T, 3), 3);
            i11 = 0;
        } else {
            i11 = 0;
            jRotateLeft = Long.rotateLeft(((long) objP.hashCode()) ^ Long.rotateLeft(this.T, 3), 3);
        }
        jRotateLeft2 = jRotateLeft ^ ((long) i11);
        this.T = jRotateLeft2;
        c0(null, (iArr[(l2Var.f39346g * 5) + 1] & 1073741824) != 0);
        M();
        l2Var.e();
        if (objP != null) {
            if (objF == null) {
            }
            this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i13), 3), 3);
        } else if (objP instanceof Enum) {
            this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) ((Enum) objP).ordinal()), 3);
        } else {
            this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) objP.hashCode()), 3);
        }
    }

    public final void V() {
        l2 l2Var = this.G;
        int i11 = l2Var.f39348i;
        this.f39445l = i11 >= 0 ? l2Var.f39341b[(i11 * 5) + 1] & 67108863 : 0;
        l2Var.t();
    }

    public final void W() {
        if (this.f39445l != 0) {
            u.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        x1 x1VarB = B();
        if (x1VarB != null) {
            int i11 = x1VarB.f39500b;
            if ((i11 & 128) == 0) {
                x1VarB.f39500b = i11 | 16;
            }
        }
        if (this.f39451s.isEmpty()) {
            V();
        } else {
            M();
        }
    }

    /* JADX WARN: Code duplicated, block: B:172:0x0327  */
    /* JADX WARN: Code duplicated, block: B:175:0x033d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0358  */
    /* JADX WARN: Code duplicated, block: B:179:0x035e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:180:0x0360 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:182:0x0364  */
    /* JADX WARN: Code duplicated, block: B:184:0x036b  */
    /* JADX WARN: Code duplicated, block: B:186:0x036e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0370  */
    /* JADX WARN: Code duplicated, block: B:191:0x039e  */
    /* JADX WARN: Code duplicated, block: B:192:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:31:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    /* JADX WARN: Code duplicated, block: B:35:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:65:0x010c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0112  */
    /* JADX WARN: Code duplicated, block: B:70:0x0126  */
    /* JADX WARN: Code duplicated, block: B:71:0x012a  */
    /* JADX WARN: Code duplicated, block: B:76:0x014e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0156  */
    /* JADX WARN: Code duplicated, block: B:79:0x0160  */
    /* JADX WARN: Code duplicated, block: B:82:0x0174  */
    /* JADX WARN: Code duplicated, block: B:83:0x0176  */
    /* JADX WARN: Code duplicated, block: B:85:0x017a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0187  */
    /* JADX WARN: Code duplicated, block: B:90:0x018f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0198  */
    public final void X(Object obj, int i11, int i12, Object obj2) {
        long jRotateLeft;
        long j11;
        boolean z11;
        boolean z12;
        boolean z13;
        p1 p1Var;
        p1 p1Var2;
        ArrayList arrayList;
        y.x xVar;
        int i13;
        Object objValueOf;
        y.i0 i0Var;
        Object objG;
        y.e0 e0Var;
        p2 p2Var;
        int i14;
        Object obj3;
        int i15;
        int i16;
        Object[] objArr;
        Object[] objArr2;
        int i17;
        int i18;
        int i19;
        l2 l2Var;
        int[] iArr;
        ArrayList arrayList2;
        int i21;
        int i22;
        int i23;
        l2 l2Var2;
        int i24;
        Object objP;
        p2 p2Var2;
        int i25;
        p1 p1Var3;
        Object obj4 = obj;
        if (this.f39450r) {
            u.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i26 = this.m;
        Object obj5 = m.f39353a;
        if (obj4 == null) {
            if (obj2 == null || i11 != 207 || obj2.equals(obj5)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i11), 3);
                j11 = i26;
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i26);
            }
            if (obj4 == null) {
                this.m++;
            }
            if (i12 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.S) {
                this.G.f39350k++;
                p2Var2 = this.I;
                i25 = p2Var2.f39414t;
                if (z11) {
                    p2Var2.Q(obj5, obj5, true, i11);
                } else if (obj2 != null) {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    p2Var2.Q(obj4, obj2, false, i11);
                } else {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    p2Var2.Q(obj4, obj5, false, i11);
                }
                p1Var3 = this.f39443j;
                if (p1Var3 != null) {
                    int i27 = (-2) - i25;
                    t0 t0Var = new t0(-1, i11, i27, -1);
                    p1Var3.f39394e.h(i27, new m0(-1, this.f39444k - p1Var3.f39391b, 0));
                    p1Var3.f39393d.add(t0Var);
                }
                x(z11, null);
                return;
            }
            if (i12 != 1 && this.f39457y) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.f39443j == null) {
                int iG = this.G.g();
                if (!z12 && iG == i11) {
                    l2Var2 = this.G;
                    i24 = l2Var2.f39346g;
                    if (i24 < l2Var2.f39347h) {
                        objP = l2Var2.p(l2Var2.f39341b, i24);
                    } else {
                        objP = null;
                    }
                    if (kotlin.jvm.internal.m.a(obj4, objP)) {
                        c0(obj2, z11);
                        z13 = z12;
                    }
                }
                l2Var = this.G;
                iArr = l2Var.f39341b;
                arrayList2 = new ArrayList();
                if (l2Var.f39350k <= 0) {
                    i21 = l2Var.f39346g;
                    while (i21 < l2Var.f39347h) {
                        int i28 = i21 * 5;
                        int i29 = iArr[i28];
                        Object objP2 = l2Var.p(iArr, i21);
                        i22 = iArr[i28 + 1];
                        if ((i22 & 1073741824) != 0) {
                            i23 = 1;
                        } else {
                            i23 = i22 & 67108863;
                        }
                        arrayList2.add(new t0(objP2, i29, i21, i23));
                        i21 += iArr[i28 + 3];
                        z12 = z12;
                    }
                }
                z13 = z12;
                this.f39443j = new p1(this.f39444k, arrayList2);
            } else {
                z13 = z12;
            }
            p1Var = this.f39443j;
            if (p1Var != null) {
                arrayList = p1Var.f39393d;
                xVar = p1Var.f39394e;
                i13 = p1Var.f39391b;
                if (obj4 != null) {
                    objValueOf = new s0(Integer.valueOf(i11), obj4);
                } else {
                    objValueOf = Integer.valueOf(i11);
                }
                i0Var = ((n1.a) p1Var.f39395f.getValue()).f43102a;
                objG = i0Var.g(objValueOf);
                if (objG == null) {
                    objG = null;
                } else if (objG instanceof y.e0) {
                    e0Var = (y.e0) objG;
                    Object objK = e0Var.k(0);
                    if (e0Var.h()) {
                        i0Var.k(objValueOf);
                    }
                    if (e0Var.f56687b == 1) {
                        i0Var.m(objValueOf, e0Var.e());
                    }
                    objG = objK;
                } else {
                    i0Var.k(objValueOf);
                }
                t0 t0Var2 = (t0) objG;
                if (!z13 || t0Var2 == null) {
                    this.G.f39350k++;
                    this.S = true;
                    this.K = null;
                    if (this.I.f39417w) {
                        p2 p2VarF = this.H.f();
                        this.I = p2VarF;
                        p2VarF.M();
                        this.J = false;
                        this.K = null;
                    }
                    this.I.d();
                    p2Var = this.I;
                    int i30 = p2Var.f39414t;
                    if (z11) {
                        p2Var.Q(obj5, obj5, true, i11);
                        i14 = 0;
                    } else if (obj2 != null) {
                        if (obj != null) {
                            obj5 = obj;
                        }
                        i14 = 0;
                        p2Var.Q(obj5, obj2, false, i11);
                    } else {
                        i14 = 0;
                        if (obj == null) {
                            obj3 = obj5;
                        } else {
                            obj3 = obj;
                        }
                        p2Var.Q(obj3, obj5, false, i11);
                    }
                    this.N = this.I.b(i30);
                    int i31 = (-2) - i30;
                    t0 t0Var3 = new t0(-1, i11, i31, -1);
                    xVar.h(i31, new m0(-1, this.f39444k - i13, i14));
                    arrayList.add(t0Var3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z11) {
                        i15 = i14;
                    } else {
                        i15 = this.f39444k;
                    }
                    p1Var2 = new p1(i15, arrayList3);
                } else {
                    int i32 = t0Var2.f39467c;
                    arrayList.add(t0Var2);
                    m0 m0Var = (m0) xVar.b(i32);
                    this.f39444k = (m0Var != null ? m0Var.f39355b : -1) + i13;
                    m0 m0Var2 = (m0) xVar.b(i32);
                    int i33 = m0Var2 != null ? m0Var2.f39354a : -1;
                    int i34 = p1Var.f39392c;
                    int i35 = i33 - i34;
                    int i36 = 8;
                    if (i33 <= i34) {
                        i16 = i35;
                        if (i34 > i33) {
                            Object[] objArr3 = xVar.f56738c;
                            long[] jArr = xVar.f56736a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i37 = 0;
                                while (true) {
                                    long j12 = jArr[i37];
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i38 = 8 - ((~(i37 - length)) >>> 31);
                                        int i39 = 0;
                                        while (i39 < i38) {
                                            if ((j12 & 255) >= 128) {
                                                objArr2 = objArr3;
                                            } else {
                                                m0 m0Var3 = (m0) objArr3[(i37 << 3) + i39];
                                                int i40 = m0Var3.f39354a;
                                                if (i40 == i33) {
                                                    m0Var3.f39354a = i34;
                                                    objArr2 = objArr3;
                                                } else {
                                                    objArr2 = objArr3;
                                                    if (i33 + 1 <= i40 && i40 < i34) {
                                                        m0Var3.f39354a = i40 - 1;
                                                    }
                                                }
                                            }
                                            j12 >>= 8;
                                            i39++;
                                            objArr3 = objArr2;
                                        }
                                        objArr = objArr3;
                                        if (i38 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr3;
                                    }
                                    if (i37 == length) {
                                        break;
                                    }
                                    i37++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                    } else {
                        Object[] objArr4 = xVar.f56738c;
                        long[] jArr2 = xVar.f56736a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i41 = 0;
                            while (true) {
                                long j13 = jArr2[i41];
                                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i42 = 8 - ((~(i41 - length2)) >>> 31);
                                    int i43 = 0;
                                    while (i43 < i42) {
                                        if ((j13 & 255) < 128) {
                                            i19 = i36;
                                            m0 m0Var4 = (m0) objArr4[(i41 << 3) + i43];
                                            i18 = i35;
                                            int i44 = m0Var4.f39354a;
                                            if (i44 == i33) {
                                                m0Var4.f39354a = i34;
                                            } else if (i34 <= i44 && i44 < i33) {
                                                m0Var4.f39354a = i44 + 1;
                                            }
                                        } else {
                                            i18 = i35;
                                            i19 = i36;
                                        }
                                        j13 >>= i19;
                                        i43++;
                                        i35 = i18;
                                        i36 = i19;
                                    }
                                    i16 = i35;
                                    if (i42 != i36) {
                                        break;
                                    }
                                } else {
                                    i16 = i35;
                                }
                                if (i41 == length2) {
                                    break;
                                }
                                i41++;
                                i35 = i16;
                                i36 = 8;
                            }
                        } else {
                            i16 = i35;
                        }
                    }
                    m1.b bVar = this.M;
                    int i45 = bVar.f40769f;
                    s sVar = bVar.f40764a;
                    bVar.f40769f = (i32 - sVar.G.f39346g) + i45;
                    this.G.r(i32);
                    if (i16 > 0) {
                        bVar.d(false);
                        p0 p0Var = bVar.f40767d;
                        l2 l2Var3 = sVar.G;
                        if (l2Var3.f39342c > 0 && p0Var.b(-2) != (i17 = l2Var3.f39348i)) {
                            if (!bVar.f40766c && bVar.f40768e) {
                                bVar.d(false);
                                bVar.f40765b.f40762d.K(m1.q.f40807c);
                                bVar.f40766c = true;
                            }
                            if (i17 > 0) {
                                b bVarA = l2Var3.a(i17);
                                p0Var.d(i17);
                                bVar.d(false);
                                m1.l0 l0Var = bVar.f40765b.f40762d;
                                l0Var.K(m1.p.f40806c);
                                qx.p.C(l0Var, 0, bVarA);
                                bVar.f40766c = true;
                            }
                        }
                        m1.l0 l0Var2 = bVar.f40765b.f40762d;
                        l0Var2.K(m1.u.f40815c);
                        l0Var2.f40799f[l0Var2.f40800g - l0Var2.f40797d[l0Var2.f40798e - 1].f40793a] = i16;
                    }
                    c0(obj2, z11);
                    p1Var2 = null;
                }
            } else {
                p1Var2 = null;
            }
            x(z11, p1Var2);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj4.hashCode())), 3);
        j11 = 0;
        this.T = jRotateLeft ^ j11;
        if (obj4 == null) {
            this.m++;
        }
        if (i12 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.S) {
            this.G.f39350k++;
            p2Var2 = this.I;
            i25 = p2Var2.f39414t;
            if (z11) {
                p2Var2.Q(obj5, obj5, true, i11);
            } else if (obj2 != null) {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                p2Var2.Q(obj4, obj2, false, i11);
            } else {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                p2Var2.Q(obj4, obj5, false, i11);
            }
            p1Var3 = this.f39443j;
            if (p1Var3 != null) {
                int i210 = (-2) - i25;
                t0 t0Var4 = new t0(-1, i11, i210, -1);
                p1Var3.f39394e.h(i210, new m0(-1, this.f39444k - p1Var3.f39391b, 0));
                p1Var3.f39393d.add(t0Var4);
            }
            x(z11, null);
            return;
        }
        if (i12 != 1) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (this.f39443j == null) {
            int iG2 = this.G.g();
            if (!z12) {
                l2Var2 = this.G;
                i24 = l2Var2.f39346g;
                if (i24 < l2Var2.f39347h) {
                    objP = l2Var2.p(l2Var2.f39341b, i24);
                } else {
                    objP = null;
                }
                if (kotlin.jvm.internal.m.a(obj4, objP)) {
                    c0(obj2, z11);
                    z13 = z12;
                }
            }
            l2Var = this.G;
            iArr = l2Var.f39341b;
            arrayList2 = new ArrayList();
            if (l2Var.f39350k <= 0) {
                i21 = l2Var.f39346g;
                while (i21 < l2Var.f39347h) {
                    int i211 = i21 * 5;
                    int i212 = iArr[i211];
                    Object objP3 = l2Var.p(iArr, i21);
                    i22 = iArr[i211 + 1];
                    if ((i22 & 1073741824) != 0) {
                        i23 = 1;
                    } else {
                        i23 = i22 & 67108863;
                    }
                    arrayList2.add(new t0(objP3, i212, i21, i23));
                    i21 += iArr[i211 + 3];
                    z12 = z12;
                }
            }
            z13 = z12;
            this.f39443j = new p1(this.f39444k, arrayList2);
        } else {
            z13 = z12;
        }
        p1Var = this.f39443j;
        if (p1Var != null) {
            arrayList = p1Var.f39393d;
            xVar = p1Var.f39394e;
            i13 = p1Var.f39391b;
            if (obj4 != null) {
                objValueOf = new s0(Integer.valueOf(i11), obj4);
            } else {
                objValueOf = Integer.valueOf(i11);
            }
            i0Var = ((n1.a) p1Var.f39395f.getValue()).f43102a;
            objG = i0Var.g(objValueOf);
            if (objG == null) {
                objG = null;
            } else if (objG instanceof y.e0) {
                e0Var = (y.e0) objG;
                Object objK2 = e0Var.k(0);
                if (e0Var.h()) {
                    i0Var.k(objValueOf);
                }
                if (e0Var.f56687b == 1) {
                    i0Var.m(objValueOf, e0Var.e());
                }
                objG = objK2;
            } else {
                i0Var.k(objValueOf);
            }
            t0 t0Var5 = (t0) objG;
            if (z13) {
            }
            this.G.f39350k++;
            this.S = true;
            this.K = null;
            if (this.I.f39417w) {
                p2 p2VarF2 = this.H.f();
                this.I = p2VarF2;
                p2VarF2.M();
                this.J = false;
                this.K = null;
            }
            this.I.d();
            p2Var = this.I;
            int i310 = p2Var.f39414t;
            if (z11) {
                p2Var.Q(obj5, obj5, true, i11);
                i14 = 0;
            } else if (obj2 != null) {
                if (obj != null) {
                    obj5 = obj;
                }
                i14 = 0;
                p2Var.Q(obj5, obj2, false, i11);
            } else {
                i14 = 0;
                if (obj == null) {
                    obj3 = obj5;
                } else {
                    obj3 = obj;
                }
                p2Var.Q(obj3, obj5, false, i11);
            }
            this.N = this.I.b(i310);
            int i311 = (-2) - i310;
            t0 t0Var6 = new t0(-1, i11, i311, -1);
            xVar.h(i311, new m0(-1, this.f39444k - i13, i14));
            arrayList.add(t0Var6);
            ArrayList arrayList4 = new ArrayList();
            if (z11) {
                i15 = i14;
            } else {
                i15 = this.f39444k;
            }
            p1Var2 = new p1(i15, arrayList4);
        } else {
            p1Var2 = null;
        }
        x(z11, p1Var2);
    }

    public final void Y() {
        X(null, -127, 0, null);
    }

    public final void Z(int i11, e1 e1Var) {
        X(e1Var, i11, 0, null);
    }

    public final void a() {
        i();
        this.f39442i.clear();
        this.f39446n.f39388a = 0;
        this.f39452t.f39388a = 0;
        this.f39456x.f39388a = 0;
        this.f39454v = null;
        m1.c cVar = this.O;
        cVar.f40778e.G();
        cVar.f40777d.G();
        this.T = 0;
        this.A = 0;
        this.f39450r = false;
        this.S = false;
        this.f39457y = false;
        this.F = false;
        this.f39458z = -1;
        l2 l2Var = this.G;
        if (!l2Var.f39345f) {
            l2Var.c();
        }
        if (this.I.f39417w) {
            return;
        }
        y();
    }

    public final void a0(int i11, Object obj) {
        X(obj, i11, 0, null);
    }

    public final void b(Object obj, fz.e eVar) {
        if (this.S) {
            m1.l0 l0Var = this.O.f40777d;
            l0Var.K(m1.g0.f40787c);
            qx.p.C(l0Var, 0, obj);
            kotlin.jvm.internal.m.d(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            kotlin.jvm.internal.c0.d(2, eVar);
            qx.p.C(l0Var, 1, eVar);
            return;
        }
        m1.b bVar = this.M;
        bVar.b();
        m1.l0 l0Var2 = bVar.f40765b.f40762d;
        l0Var2.K(m1.g0.f40787c);
        kotlin.jvm.internal.m.d(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        kotlin.jvm.internal.c0.d(2, eVar);
        qx.p.D(l0Var2, 0, obj, 1, eVar);
    }

    public final void b0() {
        X(null, AchievementLevelType.DAY_STREAK_LV_7, 1, null);
        this.f39450r = true;
    }

    public final boolean c(float f5) {
        Object objI = I();
        if ((objI instanceof Float) && f5 == ((Number) objI).floatValue()) {
            return false;
        }
        p0(Float.valueOf(f5));
        return true;
    }

    public final void c0(Object obj, boolean z11) {
        if (z11) {
            l2 l2Var = this.G;
            if (l2Var.f39350k <= 0) {
                if ((l2Var.f39341b[(l2Var.f39346g * 5) + 1] & 1073741824) == 0) {
                    r1.a("Expected a node group");
                }
                l2Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            m1.b bVar = this.M;
            bVar.getClass();
            bVar.d(false);
            m1.l0 l0Var = bVar.f40765b.f40762d;
            l0Var.K(m1.f0.f40785c);
            qx.p.C(l0Var, 0, obj);
        }
        this.G.u();
    }

    public final boolean d(int i11) {
        Object objI = I();
        if ((objI instanceof Integer) && i11 == ((Number) objI).intValue()) {
            return false;
        }
        p0(Integer.valueOf(i11));
        return true;
    }

    public final void d0(int i11) {
        int i12;
        int i13;
        if (this.f39443j != null) {
            X(null, i11, 0, null);
            return;
        }
        if (this.f39450r) {
            u.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i11), 3) ^ ((long) this.m);
        this.m++;
        l2 l2Var = this.G;
        boolean z11 = this.S;
        g gVar = m.f39353a;
        if (z11) {
            l2Var.f39350k++;
            this.I.Q(gVar, gVar, false, i11);
            x(false, null);
            return;
        }
        if (l2Var.g() == i11 && ((i13 = l2Var.f39346g) >= l2Var.f39347h || (l2Var.f39341b[(i13 * 5) + 1] & 536870912) == 0)) {
            l2Var.u();
            x(false, null);
            return;
        }
        if (l2Var.f39350k <= 0 && (i12 = l2Var.f39346g) != l2Var.f39347h) {
            int i14 = this.f39444k;
            N();
            this.M.e(i14, l2Var.s());
            t.k(i12, l2Var.f39346g, this.f39451s);
        }
        l2Var.f39350k++;
        this.S = true;
        this.K = null;
        if (this.I.f39417w) {
            p2 p2VarF = this.H.f();
            this.I = p2VarF;
            p2VarF.M();
            this.J = false;
            this.K = null;
        }
        p2 p2Var = this.I;
        p2Var.d();
        int i15 = p2Var.f39414t;
        p2Var.Q(gVar, gVar, false, i11);
        this.N = p2Var.b(i15);
        x(false, null);
    }

    public final boolean e(long j11) {
        Object objI = I();
        if ((objI instanceof Long) && j11 == ((Number) objI).longValue()) {
            return false;
        }
        p0(Long.valueOf(j11));
        return true;
    }

    public final void e0(int i11) {
        X(null, i11, 0, null);
    }

    public final boolean f(Object obj) {
        if (kotlin.jvm.internal.m.a(I(), obj)) {
            return false;
        }
        p0(obj);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    public final s f0(int i11) {
        x1 x1Var;
        boolean z11;
        d0(i11);
        boolean z12 = this.S;
        a0.b2 b2Var = this.f39440g;
        ArrayList arrayList = this.E;
        z zVar = this.f39441h;
        if (z12) {
            x1 x1Var2 = new x1(zVar);
            arrayList.add(x1Var2);
            p0(x1Var2);
            x1Var2.f39503e = this.B;
            x1Var2.f39500b &= -17;
            b2Var.g();
            return this;
        }
        int i12 = this.G.f39348i;
        ArrayList arrayList2 = this.f39451s;
        int iU = t.u(i12, arrayList2);
        q0 q0Var = iU >= 0 ? (q0) arrayList2.remove(iU) : null;
        Object objM = this.G.m();
        if (kotlin.jvm.internal.m.a(objM, m.f39353a)) {
            x1Var = new x1(zVar);
            p0(x1Var);
        } else {
            kotlin.jvm.internal.m.d(objM, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            x1Var = (x1) objM;
        }
        if (q0Var == null) {
            int i13 = x1Var.f39500b;
            boolean z13 = (i13 & 64) != 0;
            if (z13) {
                x1Var.f39500b = i13 & (-65);
            }
            if (z13) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = true;
        }
        int i14 = x1Var.f39500b;
        x1Var.f39500b = z11 ? i14 | 8 : i14 & (-9);
        arrayList.add(x1Var);
        x1Var.f39503e = this.B;
        x1Var.f39500b &= -17;
        b2Var.g();
        int i15 = x1Var.f39500b;
        if ((i15 & 256) != 0) {
            x1Var.f39500b = (i15 & (-257)) | 512;
            m1.l0 l0Var = this.M.f40765b.f40762d;
            l0Var.K(m1.d0.f40781c);
            qx.p.C(l0Var, 0, x1Var);
            if (!this.f39457y) {
                int i16 = x1Var.f39500b;
                if ((i16 & 128) != 0) {
                    this.f39457y = true;
                    x1Var.f39500b = i16 | 1024;
                }
            }
        }
        return this;
    }

    public final boolean g(boolean z11) {
        Object objI = I();
        if ((objI instanceof Boolean) && z11 == ((Boolean) objI).booleanValue()) {
            return false;
        }
        p0(Boolean.valueOf(z11));
        return true;
    }

    public final void g0(Object obj) {
        if (!this.S && this.G.g() == 207 && !kotlin.jvm.internal.m.a(this.G.f(), obj) && this.f39458z < 0) {
            this.f39458z = this.G.f39346g;
            this.f39457y = true;
        }
        X(null, 207, 0, obj);
    }

    public final boolean h(Object obj) {
        if (I() == obj) {
            return false;
        }
        p0(obj);
        return true;
    }

    public final void h0() {
        X(null, AchievementLevelType.DAY_STREAK_LV_7, 2, null);
        this.f39450r = true;
    }

    public final void i() {
        this.f39443j = null;
        this.f39444k = 0;
        this.f39445l = 0;
        this.T = 0L;
        this.f39450r = false;
        m1.b bVar = this.M;
        bVar.f40766c = false;
        bVar.f40767d.f39388a = 0;
        bVar.f40769f = 0;
        bVar.f40768e = true;
        bVar.f40770g = 0;
        bVar.f40771h.clear();
        bVar.f40772i = -1;
        bVar.f40773j = -1;
        bVar.f40774k = -1;
        bVar.f40775l = 0;
        this.E.clear();
        this.f39447o = null;
        this.f39448p = null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i0() {
        this.m = 0;
        this.G = this.f39436c.e();
        X(null, 100, 0, null);
        w wVar = this.f39435b;
        wVar.t();
        q1 q1VarI = wVar.i();
        this.f39456x.d(this.f39455w ? 1 : 0);
        this.f39455w = f(q1VarI);
        this.K = null;
        if (!this.f39449q) {
            this.f39449q = wVar.e();
        }
        if (!this.C) {
            this.C = wVar.f();
        }
        if (this.C) {
            c3 c3Var = y1.e.f56816a;
            kotlin.jvm.internal.m.d(c3Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            q1VarI = ((t1.i) q1VarI).c(c3Var, new d3(D()));
        }
        this.f39453u = q1VarI;
        Set set = (Set) t.E(q1VarI, y1.f.f56817a);
        if (set != null) {
            set.add(z());
            wVar.o(set);
        }
        X(null, Long.hashCode(wVar.g()), 0, null);
    }

    public final Object j(v1 v1Var) {
        return t.E(l(), v1Var);
    }

    public final boolean j0(x1 x1Var, Object obj) {
        b bVar = x1Var.f39501c;
        if (bVar == null) {
            return false;
        }
        int iB = this.G.f39340a.b(bVar);
        if (!this.F || iB < this.G.f39346g) {
            return false;
        }
        ArrayList arrayList = this.f39451s;
        int iU = t.u(iB, arrayList);
        if (iU < 0) {
            int i11 = -(iU + 1);
            if (!(obj instanceof g0)) {
                obj = null;
            }
            arrayList.add(i11, new q0(x1Var, iB, obj));
            return true;
        }
        q0 q0Var = (q0) arrayList.get(iU);
        if (!(obj instanceof g0)) {
            q0Var.f39428c = null;
            return true;
        }
        Object obj2 = q0Var.f39428c;
        if (obj2 == null) {
            q0Var.f39428c = obj;
            return true;
        }
        if (obj2 instanceof y.j0) {
            ((y.j0) obj2).a(obj);
            return true;
        }
        y.j0 j0Var = y.s0.f56760a;
        y.j0 j0Var2 = new y.j0(2);
        j0Var2.j(obj2);
        j0Var2.j(obj);
        q0Var.f39428c = j0Var2;
        return true;
    }

    public final void k(fz.a aVar) {
        if (!this.f39450r) {
            u.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f39450r = false;
        if (!this.S) {
            u.a("createNode() can only be called when inserting");
        }
        p0 p0Var = this.f39446n;
        int i11 = p0Var.f39389b[p0Var.f39388a - 1];
        p2 p2Var = this.I;
        b bVarB = p2Var.b(p2Var.f39416v);
        this.f39445l++;
        m1.c cVar = this.O;
        m1.l0 l0Var = cVar.f40777d;
        l0Var.K(m1.r.f40808d);
        qx.p.C(l0Var, 0, aVar);
        l0Var.f40799f[l0Var.f40800g - l0Var.f40797d[l0Var.f40798e - 1].f40793a] = i11;
        qx.p.C(l0Var, 1, bVarB);
        m1.l0 l0Var2 = cVar.f40778e;
        l0Var2.K(m1.r.f40809e);
        l0Var2.f40799f[l0Var2.f40800g - l0Var2.f40797d[l0Var2.f40798e - 1].f40793a] = i11;
        qx.p.C(l0Var2, 0, bVarB);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0088 A[LOOP:1: B:17:0x003a->B:32:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x008b A[EDGE_INSN: B:40:0x008b->B:33:0x008b BREAK  A[LOOP:1: B:17:0x003a->B:32:0x0088], SYNTHETIC] */
    public final void k0(y.i0 i0Var) {
        ArrayList arrayList = this.f39451s;
        for (int iA = ns.o.A(arrayList); -1 < iA; iA--) {
            q0 q0Var = (q0) arrayList.get(iA);
            b bVar = q0Var.f39426a.f39501c;
            if (bVar == null || !bVar.a()) {
                arrayList.remove(iA);
            } else {
                int i11 = q0Var.f39427b;
                int i12 = bVar.f39235a;
                if (i11 != i12) {
                    q0Var.f39427b = i12;
                }
            }
        }
        Object[] objArr = i0Var.f56714b;
        Object[] objArr2 = i0Var.f56715c;
        long[] jArr = i0Var.f56713a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j11 = jArr[i13];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i13 != length) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j11) < 128) {
                            int i16 = (i13 << 3) + i15;
                            Object obj = objArr[i16];
                            Object obj2 = objArr2[i16];
                            kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                            x1 x1Var = (x1) obj;
                            b bVar2 = x1Var.f39501c;
                            if (bVar2 != null) {
                                int i17 = bVar2.f39235a;
                                if (obj2 == g.f39302f) {
                                    obj2 = null;
                                }
                                arrayList.add(new q0(x1Var, i17, obj2));
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    } else if (i13 != length) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        ry.p.Z(arrayList, t.f39462a);
    }

    public final q1 l() {
        q1 q1Var;
        q1 q1Var2 = this.K;
        if (q1Var2 != null) {
            return q1Var2;
        }
        int iQ = this.G.f39348i;
        boolean z11 = this.S;
        e1 e1Var = u.f39476c;
        if (z11 && this.J) {
            int iE = this.I.f39416v;
            while (iE > 0) {
                if (this.I.s(iE) == 202 && kotlin.jvm.internal.m.a(this.I.t(iE), e1Var)) {
                    Object objQ = this.I.q(iE);
                    kotlin.jvm.internal.m.d(objQ, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    q1 q1Var3 = (q1) objQ;
                    this.K = q1Var3;
                    return q1Var3;
                }
                p2 p2Var = this.I;
                iE = p2Var.E(p2Var.f39397b, iE);
            }
        }
        if (this.G.f39342c > 0) {
            while (iQ > 0) {
                if (this.G.i(iQ) == 202) {
                    l2 l2Var = this.G;
                    if (kotlin.jvm.internal.m.a(l2Var.p(l2Var.f39341b, iQ), e1Var)) {
                        y.x xVar = this.f39454v;
                        if (xVar == null || (q1Var = (q1) xVar.b(iQ)) == null) {
                            l2 l2Var2 = this.G;
                            Object objB = l2Var2.b(l2Var2.f39341b, iQ);
                            kotlin.jvm.internal.m.d(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                            q1Var = (q1) objB;
                        }
                        this.K = q1Var;
                        return q1Var;
                    }
                }
                iQ = this.G.q(iQ);
            }
        }
        q1 q1Var4 = this.f39453u;
        this.K = q1Var4;
        return q1Var4;
    }

    public final void l0(int i11, int i12) {
        if (q0(i11) != i12) {
            if (i11 < 0) {
                y.v vVar = this.f39448p;
                if (vVar == null) {
                    vVar = new y.v();
                    this.f39448p = vVar;
                }
                vVar.f(i11, i12);
                return;
            }
            int[] iArr = this.f39447o;
            if (iArr == null) {
                iArr = new int[this.G.f39342c];
                ry.l.Q(iArr, -1);
                this.f39447o = iArr;
            }
            iArr[i11] = i12;
        }
    }

    public final y1.a m() {
        Collection collection;
        if (!this.f39435b.k()) {
            return null;
        }
        sy.c cVarO = ns.o.o();
        p2 p2Var = this.I;
        cVarO.addAll(gb.r.f(p2Var, null, p2Var.f39414t, null));
        l2 l2Var = this.G;
        boolean z11 = l2Var.f39345f;
        int[] iArr = l2Var.f39341b;
        if (z11 || l2Var.f39342c == 0) {
            collection = ry.r.f50854a;
        } else {
            y1.i iVar = new y1.i(l2Var);
            int iQ = l2Var.f39348i;
            Object objValueOf = Integer.valueOf(l2Var.f39351l - o2.c(iArr, iQ));
            while (iQ >= 0) {
                iVar.j0(l2Var.i(iQ), l2Var.k(iQ) ? l2Var.p(iArr, iQ) : m.f39353a, l2Var.f39340a.h(iQ), objValueOf);
                objValueOf = l2Var.a(iQ);
                iQ = l2Var.q(iQ);
            }
            collection = (ArrayList) iVar.f3561b;
        }
        cVarO.addAll(collection);
        cVarO.addAll(J());
        return new y1.a(ns.o.e(cVarO));
    }

    public final void m0(int i11, int i12) {
        int iQ0 = q0(i11);
        if (iQ0 != i12) {
            int i13 = i12 - iQ0;
            ArrayList arrayList = this.f39442i;
            int size = arrayList.size() - 1;
            while (i11 != -1) {
                int iQ1 = q0(i11) + i13;
                l0(i11, iQ1);
                for (int i14 = size; -1 < i14; i14--) {
                    p1 p1Var = (p1) arrayList.get(i14);
                    if (p1Var != null && p1Var.a(i11, iQ1)) {
                        size = i14 - 1;
                        break;
                    }
                }
                if (i11 < 0) {
                    i11 = this.G.f39348i;
                } else if (this.G.l(i11)) {
                    return;
                } else {
                    i11 = this.G.q(i11);
                }
            }
        }
    }

    public final void n(y.i0 i0Var, fz.e eVar) {
        ArrayList arrayList = this.f39451s;
        if (this.F) {
            u.a("Reentrant composition is not supported");
        }
        this.f39440g.g();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(x1.l.j().g());
            this.f39454v = null;
            k0(i0Var);
            this.f39444k = 0;
            this.F = true;
            try {
                i0();
                Object objI = I();
                if (objI != eVar && eVar != null) {
                    p0(eVar);
                }
                r rVar = this.D;
                n1.e eVarR = t.r();
                try {
                    eVarR.c(rVar);
                    e1 e1Var = u.f39474a;
                    if (eVar != null) {
                        Z(200, e1Var);
                        kotlin.jvm.internal.c0.d(2, eVar);
                        eVar.invoke(this, 1);
                        p(false);
                    } else if (!this.f39455w || objI == null || objI.equals(m.f39353a)) {
                        U();
                    } else {
                        Z(200, e1Var);
                        kotlin.jvm.internal.c0.d(2, objI);
                        fz.e eVar2 = (fz.e) objI;
                        kotlin.jvm.internal.c0.d(2, eVar2);
                        eVar2.invoke(this, 1);
                        p(false);
                    }
                    eVarR.l(eVarR.f43114c - 1);
                    v();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.f39417w) {
                        u.a("Check failed");
                    }
                    y();
                    Trace.endSection();
                } catch (Throwable th2) {
                    eVarR.l(eVarR.f43114c - 1);
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    hz.b.T(th3, new o(1, this));
                    throw th3;
                } catch (Throwable th4) {
                    this.F = false;
                    arrayList.clear();
                    a();
                    if (!this.I.f39417w) {
                        u.a("Check failed");
                    }
                    y();
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            Trace.endSection();
            throw th5;
        }
    }

    public final t1.i n0(q1 q1Var, t1.i iVar) {
        t1.i iVar2 = (t1.i) q1Var;
        iVar2.getClass();
        t1.h hVar = new t1.h(iVar2);
        hVar.f51991t = iVar2;
        hVar.putAll(iVar);
        t1.i iVarBuild = hVar.build();
        Z(204, u.f39477d);
        I();
        p0(iVarBuild);
        I();
        p0(iVar);
        p(false);
        return iVarBuild;
    }

    public final void o(int i11, int i12) {
        if (i11 <= 0 || i11 == i12) {
            return;
        }
        o(this.G.q(i11), i12);
        if (this.G.l(i11)) {
            Object objN = this.G.n(i11);
            m1.b bVar = this.M;
            bVar.c();
            bVar.f40771h.add(objN);
        }
    }

    public final void o0(Object obj) {
        if (obj instanceof f2) {
            g2 g2Var = new g2((f2) obj, this.m - 1);
            if (this.S) {
                m1.l0 l0Var = this.M.f40765b.f40762d;
                l0Var.K(m1.w.f40817c);
                qx.p.C(l0Var, 0, g2Var);
            }
            this.f39437d.add(obj);
            obj = g2Var;
        }
        p0(obj);
    }

    public final void p0(Object obj) {
        if (this.S) {
            p2 p2Var = this.I;
            if (p2Var.f39408n <= 0 || p2Var.f39404i == p2Var.f39406k) {
                p2Var.F(obj);
                return;
            }
            y.x xVar = p2Var.f39413s;
            if (xVar == null) {
                xVar = new y.x();
            }
            p2Var.f39413s = xVar;
            int i11 = p2Var.f39416v;
            Object objB = xVar.b(i11);
            if (objB == null) {
                objB = new y.e0();
                xVar.h(i11, objB);
            }
            ((y.e0) objB).a(obj);
            return;
        }
        l2 l2Var = this.G;
        boolean z11 = l2Var.f39352n;
        m1.b bVar = this.M;
        if (!z11) {
            b bVarA = l2Var.a(l2Var.f39348i);
            m1.l0 l0Var = bVar.f40765b.f40762d;
            l0Var.K(m1.e.f40782c);
            qx.p.D(l0Var, 0, bVarA, 1, obj);
            return;
        }
        int iC = (l2Var.f39351l - o2.c(l2Var.f39341b, l2Var.f39348i)) - 1;
        if (bVar.f40764a.G.f39348i - bVar.f40769f >= 0) {
            bVar.d(true);
            m1.l0 l0Var2 = bVar.f40765b.f40762d;
            l0Var2.K(m1.r.f40811g);
            qx.p.C(l0Var2, 0, obj);
            l0Var2.f40799f[l0Var2.f40800g - l0Var2.f40797d[l0Var2.f40798e - 1].f40793a] = iC;
            return;
        }
        l2 l2Var2 = this.G;
        b bVarA2 = l2Var2.a(l2Var2.f39348i);
        m1.l0 l0Var3 = bVar.f40765b.f40762d;
        l0Var3.K(m1.r.f40810f);
        qx.p.D(l0Var3, 0, obj, 1, bVarA2);
        l0Var3.f40799f[l0Var3.f40800g - l0Var3.f40797d[l0Var3.f40798e - 1].f40793a] = iC;
    }

    public final void q() {
        p(false);
        x1 x1VarB = B();
        if (x1VarB != null) {
            int i11 = x1VarB.f39500b;
            if ((i11 & 1) != 0) {
                x1VarB.f39500b = i11 | 2;
            }
        }
    }

    public final int q0(int i11) {
        int i12;
        if (i11 >= 0) {
            int[] iArr = this.f39447o;
            return (iArr == null || (i12 = iArr[i11]) < 0) ? this.G.o(i11) : i12;
        }
        y.v vVar = this.f39448p;
        if (vVar == null || vVar.c(i11) < 0) {
            return 0;
        }
        int iC = vVar.c(i11);
        if (iC >= 0) {
            return vVar.f56776c[iC];
        }
        z.a.e("Cannot find value for key " + i11);
        throw null;
    }

    public final void r() {
        p(true);
    }

    public final void r0() {
        if (!this.f39450r) {
            u.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f39450r = false;
        if (this.S) {
            u.a("useNode() called while inserting");
        }
        l2 l2Var = this.G;
        Object objN = l2Var.n(l2Var.f39348i);
        m1.b bVar = this.M;
        bVar.c();
        bVar.f40771h.add(objN);
        if (this.f39457y && (objN instanceof j)) {
            bVar.b();
            bVar.f40765b.f40762d.K(m1.i0.f40791c);
        }
    }

    public final void s() {
        p(false);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x007b A[LOOP:0: B:15:0x0039->B:27:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x007e A[EDGE_INSN: B:28:0x007e->B:29:0x007f BREAK  A[LOOP:0: B:15:0x0039->B:27:0x007b]] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:60:0x007e A[SYNTHETIC] */
    public final x1 t() {
        x1 x1Var;
        b bVarA;
        au.k kVar;
        ArrayList arrayList = this.E;
        x1 x1Var2 = !arrayList.isEmpty() ? (x1) hh.p0.f(1, arrayList) : null;
        if (x1Var2 != null) {
            x1Var2.f39500b &= -9;
            this.f39440g.g();
            int i11 = this.B;
            y.d0 d0Var = x1Var2.f39504f;
            if (d0Var == null || (x1Var2.f39500b & 16) != 0) {
                kVar = null;
                break;
            }
            Object[] objArr = d0Var.f56678b;
            int[] iArr = d0Var.f56679c;
            long[] jArr = d0Var.f56677a;
            int length = jArr.length - 2;
            if (length < 0) {
                kVar = null;
                break;
            }
            int i12 = 0;
            loop0: while (true) {
                long j11 = jArr[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j11 & 255) < 128) {
                            int i15 = (i12 << 3) + i14;
                            Object obj = objArr[i15];
                            if (iArr[i15] != i11) {
                                kVar = new au.k(x1Var2, i11, 2, d0Var);
                                break loop0;
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i13 == 8) {
                        if (i12 == length) {
                            i12++;
                        }
                    }
                    kVar = null;
                    break;
                }
                if (i12 == length) {
                    kVar = null;
                    break;
                }
                i12++;
            }
            m1.b bVar = this.M;
            if (kVar != null) {
                m1.l0 l0Var = bVar.f40765b.f40762d;
                l0Var.K(m1.l.f40796c);
                qx.p.D(l0Var, 0, kVar, 1, this.f39441h);
            }
            int i16 = x1Var2.f39500b;
            if ((i16 & 512) != 0) {
                x1Var2.f39500b = i16 & (-513);
                m1.l0 l0Var2 = bVar.f40765b.f40762d;
                l0Var2.K(m1.o.f40805c);
                qx.p.C(l0Var2, 0, x1Var2);
                int i17 = x1Var2.f39500b;
                x1Var2.f39500b = i17 & (-129);
                if ((i17 & 1024) != 0) {
                    x1Var2.f39500b = i17 & (-1153);
                    this.f39457y = false;
                }
            }
        }
        if (x1Var2 != null) {
            int i18 = x1Var2.f39500b;
            if ((i18 & 16) == 0 && ((i18 & 1) != 0 || this.f39449q)) {
                if (x1Var2.f39501c == null) {
                    if (this.S) {
                        p2 p2Var = this.I;
                        bVarA = p2Var.b(p2Var.f39416v);
                    } else {
                        l2 l2Var = this.G;
                        bVarA = l2Var.a(l2Var.f39348i);
                    }
                    x1Var2.f39501c = bVarA;
                }
                x1Var2.f39500b &= -5;
                x1Var = x1Var2;
            } else {
                x1Var = null;
            }
        } else {
            x1Var = null;
        }
        p(false);
        return x1Var;
    }

    public final void u() {
        if (this.F || this.f39458z != 100) {
            r1.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f39458z = -1;
        this.f39457y = false;
    }

    public final void v() {
        p(false);
        this.f39435b.c();
        p(false);
        m1.b bVar = this.M;
        if (bVar.f40766c) {
            bVar.d(false);
            bVar.d(false);
            bVar.f40765b.f40762d.K(m1.m.f40803c);
            bVar.f40766c = false;
        }
        bVar.b();
        if (bVar.f40767d.f39388a != 0) {
            u.a("Missed recording an endGroup()");
        }
        if (!this.f39442i.isEmpty()) {
            u.a("Start/end imbalance");
        }
        i();
        this.G.c();
        this.f39455w = this.f39456x.c() != 0;
    }

    public final void w(int i11) {
        if (i11 < 0) {
            int i12 = -i11;
            p2 p2Var = this.I;
            while (true) {
                int i13 = p2Var.f39416v;
                if (i13 <= i12) {
                    return;
                } else {
                    p(p2Var.y(i13));
                }
            }
        } else {
            if (this.S) {
                p2 p2Var2 = this.I;
                while (this.S) {
                    p(p2Var2.y(p2Var2.f39416v));
                }
            }
            l2 l2Var = this.G;
            while (true) {
                int i14 = l2Var.f39348i;
                if (i14 <= i11) {
                    return;
                } else {
                    p(l2Var.l(i14));
                }
            }
        }
    }

    public final void x(boolean z11, p1 p1Var) {
        this.f39442i.add(this.f39443j);
        this.f39443j = p1Var;
        int i11 = this.f39445l;
        p0 p0Var = this.f39446n;
        p0Var.d(i11);
        p0Var.d(this.m);
        p0Var.d(this.f39444k);
        if (z11) {
            this.f39444k = 0;
        }
        this.f39445l = 0;
        this.m = 0;
    }

    public final void y() {
        m2 m2Var = new m2();
        if (this.C) {
            m2Var.d();
        }
        if (this.f39435b.d()) {
            m2Var.M = new y.x();
        }
        this.H = m2Var;
        p2 p2VarF = m2Var.f();
        p2VarF.e(true);
        this.I = p2VarF;
    }

    public final y1.c z() {
        y yVar = this.U;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(this.f39441h);
        this.U = yVar2;
        return yVar2;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:201:0x0516  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    public final void p(boolean z11) {
        long jRotateRight;
        p0 p0Var;
        ArrayList arrayList;
        int i11;
        ?? r9;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        p0 p0Var2;
        int i17;
        LinkedHashSet linkedHashSet;
        int i18;
        int i19;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashSet hashSet;
        int i21;
        int i22;
        Object[] objArr;
        long[] jArr;
        int i23;
        Object[] objArr2;
        long[] jArr2;
        int i24;
        Object[] objArr3;
        long[] jArr3;
        int i25;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        p0 p0Var3 = this.f39446n;
        int i26 = p0Var3.f39389b[p0Var3.f39388a - 2] - 1;
        boolean z12 = this.S;
        g gVar = m.f39353a;
        if (z12) {
            p2 p2Var = this.I;
            int i27 = p2Var.f39416v;
            int iS = p2Var.s(i27);
            Object objT = this.I.t(i27);
            Object objQ = this.I.q(i27);
            if (objT != null) {
                jRotateRight2 = Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) (objT instanceof Enum ? ((Enum) objT).ordinal() : objT.hashCode()));
            } else if (objQ == null || iS != 207 || objQ.equals(gVar)) {
                jRotateRight2 = Long.rotateRight(this.T ^ ((long) i26), 3) ^ ((long) iS);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i26), 3) ^ ((long) objQ.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight2, 3);
        } else {
            l2 l2Var = this.G;
            int i28 = l2Var.f39348i;
            int i29 = l2Var.i(i28);
            l2 l2Var2 = this.G;
            Object objP = l2Var2.p(l2Var2.f39341b, i28);
            l2 l2Var3 = this.G;
            Object objB = l2Var3.b(l2Var3.f39341b, i28);
            if (objP != null) {
                jRotateRight = Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode()));
            } else if (objB == null || i29 != 207 || objB.equals(gVar)) {
                jRotateRight = Long.rotateRight(this.T ^ ((long) i26), 3) ^ ((long) i29);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i26), 3) ^ ((long) objB.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight, 3);
        }
        int i30 = this.f39445l;
        p1 p1Var = this.f39443j;
        ArrayList arrayList4 = this.f39451s;
        m1.b bVar = this.M;
        if (p1Var != null) {
            y.x xVar = p1Var.f39394e;
            int i31 = p1Var.f39391b;
            ArrayList arrayList5 = p1Var.f39390a;
            if (arrayList5.size() > 0) {
                ArrayList arrayList6 = p1Var.f39393d;
                HashSet hashSet2 = new HashSet(arrayList6.size());
                int size = arrayList6.size();
                for (int i32 = 0; i32 < size; i32++) {
                    hashSet2.add(arrayList6.get(i32));
                }
                i11 = -1;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList6.size();
                int size3 = arrayList5.size();
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                while (i33 < size3) {
                    t0 t0Var = (t0) arrayList5.get(i33);
                    if (hashSet2.contains(t0Var)) {
                        p0Var2 = p0Var3;
                        i17 = i33;
                        if (!linkedHashSet2.contains(t0Var)) {
                            int i36 = i34;
                            if (i36 < size2) {
                                t0 t0Var2 = (t0) arrayList6.get(i36);
                                if (t0Var2 != t0Var) {
                                    m0 m0Var = (m0) xVar.b(t0Var2.f39467c);
                                    int i37 = m0Var != null ? m0Var.f39355b : -1;
                                    linkedHashSet2.add(t0Var2);
                                    i21 = i35;
                                    if (i37 != i21) {
                                        m0 m0Var2 = (m0) xVar.b(t0Var2.f39467c);
                                        int i38 = m0Var2 != null ? m0Var2.f39356c : t0Var2.f39468d;
                                        linkedHashSet = linkedHashSet2;
                                        int i39 = i37 + i31;
                                        i18 = size2;
                                        int i40 = i21 + i31;
                                        if (i38 > 0) {
                                            i19 = i31;
                                            int i41 = bVar.f40775l;
                                            if (i41 > 0) {
                                                arrayList2 = arrayList5;
                                                if (bVar.f40773j == i39 - i41 && bVar.f40774k == i40 - i41) {
                                                    bVar.f40775l = i41 + i38;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                            bVar.c();
                                            bVar.f40773j = i39;
                                            bVar.f40774k = i40;
                                            bVar.f40775l = i38;
                                        } else {
                                            i19 = i31;
                                            arrayList2 = arrayList5;
                                            bVar.getClass();
                                        }
                                        if (i37 <= i21) {
                                            int i42 = i38;
                                            arrayList4 = arrayList4;
                                            arrayList3 = arrayList6;
                                            hashSet = hashSet2;
                                            if (i21 > i37) {
                                                Object[] objArr5 = xVar.f56738c;
                                                long[] jArr5 = xVar.f56736a;
                                                int length = jArr5.length - 2;
                                                if (length >= 0) {
                                                    int i43 = 0;
                                                    while (true) {
                                                        long j11 = jArr5[i43];
                                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i44 = 8 - ((~(i43 - length)) >>> 31);
                                                            int i45 = 0;
                                                            while (i45 < i44) {
                                                                if ((j11 & 255) < 128) {
                                                                    objArr2 = objArr5;
                                                                    m0 m0Var3 = (m0) objArr5[(i43 << 3) + i45];
                                                                    jArr2 = jArr5;
                                                                    int i46 = m0Var3.f39355b;
                                                                    i24 = i37;
                                                                    if (i37 <= i46 && i46 < i24 + i42) {
                                                                        m0Var3.f39355b = (i46 - i24) + i21;
                                                                    } else if (i24 + 1 <= i46 && i46 < i21) {
                                                                        m0Var3.f39355b = i46 - i42;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr5;
                                                                    i24 = i37;
                                                                }
                                                                j11 >>= 8;
                                                                i45++;
                                                                jArr5 = jArr2;
                                                                objArr5 = objArr2;
                                                                i37 = i24;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i23 = i37;
                                                            if (i44 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i23 = i37;
                                                        }
                                                        if (i43 == length) {
                                                            break;
                                                        }
                                                        i43++;
                                                        jArr5 = jArr;
                                                        objArr5 = objArr;
                                                        i37 = i23;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = xVar.f56738c;
                                            long[] jArr6 = xVar.f56736a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                arrayList3 = arrayList6;
                                                hashSet = hashSet2;
                                                int i47 = 0;
                                                while (true) {
                                                    long j12 = jArr6[i47];
                                                    int i48 = i38;
                                                    arrayList4 = arrayList4;
                                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i49 = 8 - ((~(i47 - length2)) >>> 31);
                                                        int i50 = 0;
                                                        while (i50 < i49) {
                                                            if ((j12 & 255) < 128) {
                                                                i25 = i50;
                                                                m0 m0Var4 = (m0) objArr6[(i47 << 3) + i50];
                                                                objArr4 = objArr6;
                                                                int i51 = m0Var4.f39355b;
                                                                jArr4 = jArr6;
                                                                if (i37 <= i51 && i51 < i37 + i48) {
                                                                    m0Var4.f39355b = (i51 - i37) + i21;
                                                                } else if (i21 <= i51 && i51 < i37) {
                                                                    m0Var4.f39355b = i51 + i48;
                                                                }
                                                            } else {
                                                                i25 = i50;
                                                                objArr4 = objArr6;
                                                                jArr4 = jArr6;
                                                            }
                                                            j12 >>= 8;
                                                            i50 = i25 + 1;
                                                            objArr6 = objArr4;
                                                            jArr6 = jArr4;
                                                        }
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                        if (i49 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                    }
                                                    if (i47 == length2) {
                                                        break;
                                                    }
                                                    i47++;
                                                    arrayList4 = arrayList4;
                                                    i38 = i48;
                                                    objArr6 = objArr3;
                                                    jArr6 = jArr3;
                                                }
                                            }
                                        }
                                        i22 = i17;
                                    } else {
                                        linkedHashSet = linkedHashSet2;
                                        i18 = size2;
                                        i19 = i31;
                                        arrayList2 = arrayList5;
                                    }
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i22 = i17;
                                } else {
                                    arrayList4 = arrayList4;
                                    linkedHashSet = linkedHashSet2;
                                    i18 = size2;
                                    i19 = i31;
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i21 = i35;
                                    i22 = i17 + 1;
                                }
                                i34 = i36 + 1;
                                m0 m0Var5 = (m0) xVar.b(t0Var2.f39467c);
                                int i52 = i21 + (m0Var5 != null ? m0Var5.f39356c : t0Var2.f39468d);
                                i33 = i22;
                                p1Var = p1Var;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i18;
                                i31 = i19;
                                arrayList5 = arrayList2;
                                arrayList6 = arrayList3;
                                hashSet2 = hashSet;
                                arrayList4 = arrayList4;
                                i35 = i52;
                                p0Var3 = p0Var2;
                            } else {
                                i34 = i36;
                                p0Var3 = p0Var2;
                                i33 = i17;
                            }
                        }
                    } else {
                        p0Var2 = p0Var3;
                        m0 m0Var6 = (m0) xVar.b(t0Var.f39467c);
                        int i53 = m0Var6 != null ? m0Var6.f39355b : -1;
                        int i54 = t0Var.f39467c;
                        i17 = i33;
                        bVar.e(i53 + i31, t0Var.f39468d);
                        p1Var.a(i54, 0);
                        bVar.f40769f = (i54 - bVar.f40764a.G.f39346g) + bVar.f40769f;
                        this.G.r(i54);
                        N();
                        this.G.s();
                        t.k(i54, this.G.f39341b[(i54 * 5) + 3] + i54, arrayList4);
                    }
                    i33 = i17 + 1;
                    p0Var3 = p0Var2;
                }
                p0Var = p0Var3;
                arrayList = arrayList4;
                bVar.c();
                if (arrayList5.size() > 0) {
                    l2 l2Var4 = this.G;
                    bVar.f40769f = (l2Var4.f39347h - bVar.f40764a.G.f39346g) + bVar.f40769f;
                    l2Var4.t();
                }
            } else {
                p0Var = p0Var3;
                arrayList = arrayList4;
                i11 = -1;
            }
        } else {
            p0Var = p0Var3;
            arrayList = arrayList4;
            i11 = -1;
        }
        boolean z13 = this.S;
        if (!z13) {
            l2 l2Var5 = this.G;
            int i55 = l2Var5.m - l2Var5.f39351l;
            if (i55 > 0) {
                if (i55 > 0) {
                    bVar.d(false);
                    p0 p0Var4 = bVar.f40767d;
                    l2 l2Var6 = bVar.f40764a.G;
                    if (l2Var6.f39342c > 0 && p0Var4.b(-2) != (i16 = l2Var6.f39348i)) {
                        if (!bVar.f40766c && bVar.f40768e) {
                            bVar.d(false);
                            bVar.f40765b.f40762d.K(m1.q.f40807c);
                            bVar.f40766c = true;
                        }
                        if (i16 > 0) {
                            b bVarA = l2Var6.a(i16);
                            p0Var4.d(i16);
                            bVar.d(false);
                            m1.l0 l0Var = bVar.f40765b.f40762d;
                            l0Var.K(m1.p.f40806c);
                            qx.p.C(l0Var, 0, bVarA);
                            bVar.f40766c = true;
                        }
                    }
                    m1.l0 l0Var2 = bVar.f40765b.f40762d;
                    l0Var2.K(m1.e0.f40783c);
                    l0Var2.f40799f[l0Var2.f40800g - l0Var2.f40797d[l0Var2.f40798e - 1].f40793a] = i55;
                } else {
                    bVar.getClass();
                }
            }
        }
        int i56 = this.f39444k;
        while (true) {
            l2 l2Var7 = this.G;
            if (l2Var7.f39350k > 0 || (i15 = l2Var7.f39346g) == l2Var7.f39347h) {
                break;
            }
            N();
            bVar.e(i56, this.G.s());
            t.k(i15, this.G.f39346g, arrayList);
        }
        if (z13) {
            if (z11) {
                m1.c cVar = this.O;
                m1.l0 l0Var3 = cVar.f40778e;
                if (!l0Var3.J()) {
                    u.a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                m1.l0 l0Var4 = cVar.f40777d;
                m1.j0[] j0VarArr = l0Var3.f40797d;
                int i57 = l0Var3.f40798e - 1;
                l0Var3.f40798e = i57;
                m1.j0 j0Var = j0VarArr[i57];
                j0VarArr[i57] = null;
                l0Var4.K(j0Var);
                Object[] objArr7 = l0Var3.f40801h;
                Object[] objArr8 = l0Var4.f40801h;
                int i58 = l0Var4.f40802i;
                int i59 = j0Var.f40794b;
                int i60 = l0Var3.f40802i;
                int i61 = i60 - i59;
                System.arraycopy(objArr7, i61, objArr8, i58 - i59, i60 - i61);
                Object[] objArr9 = l0Var3.f40801h;
                int i62 = l0Var3.f40802i;
                Arrays.fill(objArr9, i62 - i59, i62, (Object) null);
                int[] iArr = l0Var3.f40799f;
                int[] iArr2 = l0Var4.f40799f;
                int i63 = l0Var4.f40800g;
                int i64 = j0Var.f40793a;
                int i65 = l0Var3.f40800g;
                ry.l.H(i63 - i64, i65 - i64, iArr, iArr2, i65);
                l0Var3.f40802i -= i59;
                l0Var3.f40800g -= i64;
                i30 = 1;
            }
            l2 l2Var8 = this.G;
            if (l2Var8.f39350k <= 0) {
                r1.a("Unbalanced begin/end empty");
            }
            l2Var8.f39350k--;
            p2 p2Var2 = this.I;
            int i66 = p2Var2.f39416v;
            p2Var2.j();
            if (this.G.f39350k <= 0) {
                int i67 = (-2) - i66;
                this.I.k();
                this.I.e(true);
                b bVar2 = this.N;
                if (this.O.f40777d.I()) {
                    m2 m2Var = this.H;
                    bVar.b();
                    bVar.d(false);
                    p0 p0Var5 = bVar.f40767d;
                    l2 l2Var9 = bVar.f40764a.G;
                    if (l2Var9.f39342c <= 0 || p0Var5.b(-2) == (i14 = l2Var9.f39348i)) {
                        i13 = 1;
                    } else {
                        if (!bVar.f40766c && bVar.f40768e) {
                            bVar.d(false);
                            bVar.f40765b.f40762d.K(m1.q.f40807c);
                            bVar.f40766c = true;
                        }
                        if (i14 > 0) {
                            b bVarA2 = l2Var9.a(i14);
                            p0Var5.d(i14);
                            bVar.d(false);
                            m1.l0 l0Var5 = bVar.f40765b.f40762d;
                            l0Var5.K(m1.p.f40806c);
                            qx.p.C(l0Var5, 0, bVarA2);
                            i13 = 1;
                            bVar.f40766c = true;
                        } else {
                            i13 = 1;
                        }
                    }
                    bVar.c();
                    m1.l0 l0Var6 = bVar.f40765b.f40762d;
                    l0Var6.K(m1.s.f40813c);
                    qx.p.D(l0Var6, 0, bVar2, i13, m2Var);
                    r9 = 0;
                } else {
                    m2 m2Var2 = this.H;
                    m1.c cVar2 = this.O;
                    bVar.b();
                    bVar.d(false);
                    p0 p0Var6 = bVar.f40767d;
                    l2 l2Var10 = bVar.f40764a.G;
                    if (l2Var10.f39342c > 0 && p0Var6.b(-2) != (i12 = l2Var10.f39348i)) {
                        if (!bVar.f40766c && bVar.f40768e) {
                            bVar.d(false);
                            bVar.f40765b.f40762d.K(m1.q.f40807c);
                            bVar.f40766c = true;
                        }
                        if (i12 > 0) {
                            b bVarA3 = l2Var10.a(i12);
                            p0Var6.d(i12);
                            bVar.d(false);
                            m1.l0 l0Var7 = bVar.f40765b.f40762d;
                            l0Var7.K(m1.p.f40806c);
                            qx.p.C(l0Var7, 0, bVarA3);
                            bVar.f40766c = true;
                        }
                    }
                    bVar.c();
                    m1.l0 l0Var8 = bVar.f40765b.f40762d;
                    l0Var8.K(m1.t.f40814c);
                    int i68 = l0Var8.f40802i - l0Var8.f40797d[l0Var8.f40798e - 1].f40794b;
                    Object[] objArr10 = l0Var8.f40801h;
                    objArr10[i68] = bVar2;
                    objArr10[i68 + 1] = m2Var2;
                    objArr10[i68 + 2] = cVar2;
                    this.O = new m1.c();
                    r9 = 0;
                }
                this.S = r9;
                if (this.f39436c.f39359b != 0) {
                    l0(i67, r9);
                    m0(i67, i30);
                }
            }
        } else {
            if (z11) {
                bVar.a();
            }
            int i69 = bVar.f40764a.G.f39348i;
            p0 p0Var7 = bVar.f40767d;
            int i70 = i11;
            if (p0Var7.b(i70) > i69) {
                u.a(gkbGsXmgaxRjJ.jhXaeYajfr);
            }
            if (p0Var7.b(i70) == i69) {
                bVar.d(false);
                p0Var7.c();
                bVar.f40765b.f40762d.K(m1.m.f40803c);
            }
            int i71 = this.G.f39348i;
            if (i30 != q0(i71)) {
                m0(i71, i30);
            }
            if (z11) {
                i30 = 1;
            }
            this.G.e();
            bVar.c();
        }
        p1 p1Var2 = (p1) hh.p0.f(1, this.f39442i);
        if (p1Var2 != null && !z13) {
            p1Var2.f39392c++;
        }
        this.f39443j = p1Var2;
        this.f39444k = p0Var.c() + i30;
        this.m = p0Var.c();
        this.f39445l = p0Var.c() + i30;
    }
}
