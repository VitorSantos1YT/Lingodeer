package y2;

import androidx.compose.ui.platform.AndroidComposeView;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Map;
import rt.mc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k1 extends q0 implements w2.p0, w2.x, u1 {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final g2.t0 f56939o0 = new g2.t0();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final x f56940p0 = new x();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final float[] f56941q0 = g2.k0.a();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final d f56942r0 = new d(1);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final d f56943s0 = new d(2);
    public final i0 Q;
    public k1 R;
    public k1 S;
    public boolean T;
    public boolean U;
    public fz.c V;
    public v3.c W;
    public v3.m X;
    public w2.r0 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public y.d0 f56944a0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f56946c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public f2.a f56947d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public x f56948e0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f56950g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f56951h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public j2.c f56952i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public g2.v f56953j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public b2.h f56954k0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f56956m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public s1 f56957n0;
    public float Y = 0.8f;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f56945b0 = 0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public g2.w0 f56949f0 = g2.f0.f28556b;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final h1 f56955l0 = new h1(this, 1);

    public k1(i0 i0Var) {
        this.Q = i0Var;
        this.W = i0Var.f56881b0;
        this.X = i0Var.f56883c0;
    }

    public static k1 w1(w2.x xVar) {
        k1 k1Var;
        w2.o0 o0Var = xVar instanceof w2.o0 ? (w2.o0) xVar : null;
        if (o0Var != null && (k1Var = o0Var.f54554a.Q) != null) {
            return k1Var;
        }
        kotlin.jvm.internal.m.d(xVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (k1) xVar;
    }

    public final void A1(fz.c cVar, boolean z11) {
        t1 t1Var;
        b2.h hVar;
        n1.e eVar;
        Reference referencePoll;
        Object obj;
        i0 i0Var = this.Q;
        boolean z12 = (!z11 && this.V == cVar && kotlin.jvm.internal.m.a(this.W, i0Var.f56881b0) && this.X == i0Var.f56883c0) ? false : true;
        this.W = i0Var.f56881b0;
        this.X = i0Var.f56883c0;
        boolean zI = i0Var.I();
        h1 h1Var = this.f56955l0;
        if (!zI || cVar == null) {
            this.V = null;
            s1 s1Var = this.f56957n0;
            if (s1Var != null) {
                if (!g2.f0.t(s1Var.mo6getUnderlyingMatrixsQKQjiQ())) {
                    i0Var.O();
                }
                s1Var.destroy();
                i0Var.f56896m0 = true;
                h1Var.invoke();
                if (c1().P && i0Var.J() && (t1Var = i0Var.Q) != null) {
                    ((AndroidComposeView) t1Var).x(i0Var);
                }
            }
            this.f56957n0 = null;
            this.f56956m0 = false;
            return;
        }
        this.V = cVar;
        if (this.f56957n0 != null) {
            if (z12) {
                B1(true);
                return;
            }
            return;
        }
        t1 t1VarA = l0.a(i0Var);
        b2.h hVar2 = this.f56954k0;
        if (hVar2 == null) {
            b2.h hVar3 = new b2.h(11, this, new h1(this, 0));
            this.f56954k0 = hVar3;
            hVar = hVar3;
        } else {
            hVar = hVar2;
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) t1VarA;
        qp.r rVar = androidComposeView.X0;
        do {
            ReferenceQueue referenceQueue = (ReferenceQueue) rVar.f48146c;
            eVar = (n1.e) rVar.f48145b;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                eVar.k(referencePoll);
            }
        } while (referencePoll != null);
        do {
            int i11 = eVar.f43114c;
            if (i11 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) eVar.l(i11 - 1)).get();
        } while (obj == null);
        s1 m1Var = (s1) obj;
        if (m1Var != null) {
            m1Var.e(hVar, h1Var);
        } else {
            m1Var = new z2.m1(androidComposeView.getGraphicsContext().b(), androidComposeView.getGraphicsContext(), androidComposeView, hVar, h1Var);
        }
        m1Var.h(this.f54503c);
        m1Var.j(this.f56945b0);
        this.f56957n0 = m1Var;
        B1(true);
        i0Var.f56896m0 = true;
        h1Var.invoke();
    }

    public final void B1(boolean z11) {
        t1 t1Var;
        s1 s1Var = this.f56957n0;
        if (s1Var == null) {
            if (this.V == null) {
                return;
            }
            v2.a.b("null layer with a non-null layerBlock");
            return;
        }
        fz.c cVar = this.V;
        if (cVar == null) {
            throw defpackage.e.t("updateLayerParameters requires a non-null layerBlock");
        }
        g2.t0 t0Var = f56939o0;
        t0Var.a();
        i0 i0Var = this.Q;
        t0Var.R = i0Var.f56881b0;
        t0Var.S = i0Var.f56883c0;
        t0Var.Q = ff.h.P(this.f54503c);
        l0.a(i0Var).getSnapshotObserver().f57019a.d(this, e.f56848f, new d2.c(14, cVar, this));
        x xVar = this.f56948e0;
        if (xVar == null) {
            xVar = new x();
            this.f56948e0 = xVar;
        }
        x xVar2 = f56940p0;
        xVar2.getClass();
        xVar2.f57030a = xVar.f57030a;
        xVar2.f57031b = xVar.f57031b;
        xVar2.f57032c = xVar.f57032c;
        xVar2.f57033d = xVar.f57033d;
        xVar2.f57034e = xVar.f57034e;
        xVar2.f57035f = xVar.f57035f;
        xVar2.f57036g = xVar.f57036g;
        xVar.f57030a = t0Var.f28601b;
        xVar.f57031b = t0Var.f28602c;
        xVar.f57032c = t0Var.f28604e;
        xVar.f57033d = t0Var.f28605f;
        xVar.f57034e = t0Var.L;
        xVar.f57035f = t0Var.M;
        xVar.f57036g = t0Var.N;
        s1Var.c(t0Var);
        boolean z12 = this.U;
        this.U = t0Var.P;
        this.Y = t0Var.f28603d;
        boolean z13 = xVar2.f57030a == xVar.f57030a && xVar2.f57031b == xVar.f57031b && xVar2.f57032c == xVar.f57032c && xVar2.f57033d == xVar.f57033d && xVar2.f57034e == xVar.f57034e && xVar2.f57035f == xVar.f57035f && g2.z0.a(xVar2.f57036g, xVar.f57036g);
        if (z11 && ((!z13 || z12 != this.U) && (t1Var = i0Var.Q) != null)) {
            ((AndroidComposeView) t1Var).x(i0Var);
        }
        if (z13) {
            return;
        }
        m0 m0Var = i0Var.f56893j0;
        if (m0Var.f56971l > 0) {
            if (m0Var.f56970k || m0Var.f56969j) {
                i0Var.X(false);
            }
            m0Var.f56974p.F0();
        }
        i0Var.O();
        t1 t1VarA = l0.a(i0Var);
        h3.b rectManager = t1VarA.getRectManager();
        if (this == ((k1) i0Var.f56892i0.f50087e)) {
            rectManager.e(i0Var, false);
        } else {
            rectManager.getClass();
            if (i0Var.J()) {
                long jF = h3.b.f(i0Var);
                if (v3.j.c(jF, 9223372034707292159L)) {
                    rectManager.c(i0Var);
                } else {
                    i0Var.f56888f = jF;
                    i0Var.f56903t = false;
                    n1.e eVarA = i0Var.A();
                    Object[] objArr = eVarA.f43112a;
                    int i11 = eVarA.f43114c;
                    for (int i12 = 0; i12 < i11; i12++) {
                        rectManager.e((i0) objArr[i12], false);
                    }
                    rectManager.d(i0Var);
                }
            }
        }
        if (i0Var.f56902s0 > 0) {
            AndroidComposeView androidComposeView = (AndroidComposeView) t1VarA;
            qp.r rVar = androidComposeView.f1197y0.f57044e;
            rVar.getClass();
            if (i0Var.f56902s0 > 0) {
                ((n1.e) rVar.f48145b).c(i0Var);
                i0Var.f56901r0 = true;
            }
            androidComposeView.E(null);
        }
    }

    public final boolean C1(long j11) {
        if ((((9187343241974906880L ^ (j11 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        s1 s1Var = this.f56957n0;
        return s1Var == null || !this.U || s1Var.f(j11);
    }

    @Override // w2.x
    public final long D(long j11) {
        if (!c1().P) {
            v2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        w2.x xVarH = w2.a0.h(this);
        AndroidComposeView androidComposeView = (AndroidComposeView) l0.a(this.Q);
        androidComposeView.B();
        return S(xVarH, f2.b.g(g2.k0.b(j11, androidComposeView.D0), xVarH.P(0L)));
    }

    @Override // w2.x
    public final f2.c E(w2.x xVar, boolean z11) {
        if (!c1().P) {
            v2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!xVar.k()) {
            v2.a.b("LayoutCoordinates " + xVar + " is not attached!");
        }
        k1 k1VarW1 = w1(xVar);
        k1VarW1.l1();
        k1 k1VarY0 = Y0(k1VarW1);
        f2.a aVar = this.f56947d0;
        if (aVar == null) {
            aVar = new f2.a();
            this.f56947d0 = aVar;
        }
        aVar.f26566a = CropImageView.DEFAULT_ASPECT_RATIO;
        aVar.f26567b = CropImageView.DEFAULT_ASPECT_RATIO;
        aVar.f26568c = (int) (xVar.m() >> 32);
        aVar.f26569d = (int) (xVar.m() & 4294967295L);
        while (k1VarW1 != k1VarY0) {
            k1VarW1.t1(aVar, z11, false);
            if (aVar.b()) {
                return f2.c.f26571e;
            }
            k1VarW1 = k1VarW1.S;
            kotlin.jvm.internal.m.c(k1VarW1);
        }
        R0(k1VarY0, aVar, z11);
        return new f2.c(aVar.f26566a, aVar.f26567b, aVar.f26568c, aVar.f26569d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // w2.g1, w2.p0
    public final Object G() {
        i0 i0Var = this.Q;
        if (!i0Var.f56892i0.g(64)) {
            return null;
        }
        c1();
        Object objG0 = null;
        for (z1.q qVar = (d2) i0Var.f56892i0.f50088f; qVar != null; qVar = qVar.f58486e) {
            if ((qVar.f58484c & 64) != 0) {
                ?? F = qVar;
                ?? eVar = 0;
                while (F != 0) {
                    if (F instanceof w1) {
                        objG0 = ((w1) F).g0(i0Var.f56881b0, objG0);
                    } else if ((F.f58484c & 64) != 0 && (F instanceof n)) {
                        z1.q qVar2 = ((n) F).R;
                        int i11 = 0;
                        F = F;
                        eVar = eVar;
                        while (qVar2 != null) {
                            if ((qVar2.f58484c & 64) != 0) {
                                i11++;
                                if (i11 == 1) {
                                    eVar = eVar;
                                    F = qVar2;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new n1.e(new z1.q[16]);
                                    }
                                    if (F != 0) {
                                        eVar.c(F);
                                        F = 0;
                                    }
                                    eVar.c(qVar2);
                                }
                            }
                            qVar2 = qVar2.f58487f;
                            F = F;
                            eVar = eVar;
                        }
                        if (i11 == 1) {
                        }
                    }
                    F = f.f(eVar);
                }
            }
        }
        return objG0;
    }

    @Override // y2.q0
    public final q0 G0() {
        return this.R;
    }

    @Override // w2.x
    public final w2.x H() {
        boolean z11 = c1().P;
        i0 i0Var = this.Q;
        if (!z11) {
            StringBuilder sb2 = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (i0 i0VarW = i0Var; i0VarW != null; i0VarW = i0VarW.w()) {
                sb2.append("\n|");
                sb2.append(i0VarW);
                sb2.append(" isAttached=");
                sb2.append(i0VarW.I());
                sb2.append(" modifier=");
                sb2.append(i0VarW.f56897n0);
                sb2.append(" tail=");
                sb2.append(c1());
            }
            v2.a.b(sb2.toString());
        }
        l1();
        return ((k1) i0Var.f56892i0.f50087e).S;
    }

    @Override // y2.q0
    public final boolean I0() {
        return this.Z != null;
    }

    @Override // y2.q0
    public final i0 J0() {
        return this.Q;
    }

    @Override // y2.q0
    public final w2.r0 K0() {
        w2.r0 r0Var = this.Z;
        if (r0Var != null) {
            return r0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // y2.q0
    public final q0 L0() {
        return this.S;
    }

    @Override // w2.x
    public final long M(long j11) {
        if (!c1().P) {
            v2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return S(w2.a0.h(this), ((AndroidComposeView) l0.a(this.Q)).F(j11));
    }

    @Override // y2.q0
    public final long M0() {
        return this.f56945b0;
    }

    @Override // w2.x
    public final long P(long j11) {
        if (!c1().P) {
            v2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        l1();
        for (k1 k1Var = this; k1Var != null; k1Var = k1Var.S) {
            i0 i0Var = k1Var.Q;
            if (k1Var == ((k1) i0Var.f56892i0.f50087e) && !i0Var.f56882c) {
                long jB = l0.a(i0Var).getRectManager().b(i0Var);
                if (!v3.j.c(jB, 9223372034707292159L)) {
                    return ew.a.x(j11, jB);
                }
            }
            s1 s1Var = k1Var.f56957n0;
            if (s1Var != null) {
                j11 = s1Var.g(j11, false);
            }
            j11 = ew.a.x(j11, k1Var.f56945b0);
        }
        return j11;
    }

    @Override // y2.q0
    public final void Q0() {
        i0(this.f56945b0, this.f56946c0, this.V);
    }

    public final void R0(k1 k1Var, f2.a aVar, boolean z11) {
        if (k1Var == this) {
            return;
        }
        k1 k1Var2 = this.S;
        if (k1Var2 != null) {
            k1Var2.R0(k1Var, aVar, z11);
        }
        long j11 = this.f56945b0;
        float f5 = (int) (j11 >> 32);
        aVar.f26566a -= f5;
        aVar.f26568c -= f5;
        float f11 = (int) (j11 & 4294967295L);
        aVar.f26567b -= f11;
        aVar.f26569d -= f11;
        s1 s1Var = this.f56957n0;
        if (s1Var != null) {
            s1Var.b(aVar, true);
            if (this.U && z11) {
                long j12 = this.f54503c;
                aVar.a(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (int) (j12 >> 32), (int) (j12 & 4294967295L));
            }
        }
    }

    @Override // w2.x
    public final long S(w2.x xVar, long j11) {
        if (xVar instanceof w2.o0) {
            w2.o0 o0Var = (w2.o0) xVar;
            o0Var.f54554a.Q.l1();
            return o0Var.S(this, j11 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        k1 k1VarW1 = w1(xVar);
        k1VarW1.l1();
        k1 k1VarY0 = Y0(k1VarW1);
        while (k1VarW1 != k1VarY0) {
            s1 s1Var = k1VarW1.f56957n0;
            if (s1Var != null) {
                j11 = s1Var.g(j11, false);
            }
            j11 = ew.a.x(j11, k1VarW1.f56945b0);
            k1VarW1 = k1VarW1.S;
            kotlin.jvm.internal.m.c(k1VarW1);
        }
        return S0(k1VarY0, j11);
    }

    public final long S0(k1 k1Var, long j11) {
        if (k1Var == this) {
            return j11;
        }
        k1 k1Var2 = this.S;
        return (k1Var2 == null || kotlin.jvm.internal.m.a(k1Var, k1Var2)) ? Z0(j11) : Z0(k1Var2.S0(k1Var, j11));
    }

    public final long T0(long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) - g0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) - a0();
        float fMax = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, fIntBitsToFloat / 2.0f);
        return (((long) Float.floatToRawIntBits(Math.max(CropImageView.DEFAULT_ASPECT_RATIO, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final float U0(long j11, long j12) {
        if (g0() >= Float.intBitsToFloat((int) (j12 >> 32)) && a0() >= Float.intBitsToFloat((int) (j12 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jT0 = T0(j12);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jT0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jT0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j11 >> 32));
        float fMax = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, fIntBitsToFloat3 < CropImageView.DEFAULT_ASPECT_RATIO ? -fIntBitsToFloat3 : fIntBitsToFloat3 - g0());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(CropImageView.DEFAULT_ASPECT_RATIO, fIntBitsToFloat4 < CropImageView.DEFAULT_ASPECT_RATIO ? -fIntBitsToFloat4 : fIntBitsToFloat4 - a0()))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32);
        if (fIntBitsToFloat > CropImageView.DEFAULT_ASPECT_RATIO || fIntBitsToFloat2 > CropImageView.DEFAULT_ASPECT_RATIO) {
            int i11 = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i11) <= fIntBitsToFloat) {
                int i12 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i12) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i11);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i12);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void V0(g2.v vVar, j2.c cVar) {
        s1 s1Var = this.f56957n0;
        if (s1Var != null) {
            s1Var.a(vVar, cVar);
            return;
        }
        long j11 = this.f56945b0;
        float f5 = (int) (j11 >> 32);
        float f11 = (int) (j11 & 4294967295L);
        vVar.n(f5, f11);
        W0(vVar, cVar);
        vVar.n(-f5, -f11);
    }

    public final void W0(g2.v vVar, j2.c cVar) {
        g2.v vVar2;
        j2.c cVar2;
        z1.q qVarD1 = d1(4);
        if (qVarD1 == null) {
            r1(vVar, cVar);
            return;
        }
        i0 i0Var = this.Q;
        i0Var.getClass();
        k0 sharedDrawScope = l0.a(i0Var).getSharedDrawScope();
        long jP = ff.h.P(this.f54503c);
        sharedDrawScope.getClass();
        n1.e eVar = null;
        while (qVarD1 != null) {
            if (qVarD1 instanceof q) {
                vVar2 = vVar;
                cVar2 = cVar;
                sharedDrawScope.b(vVar2, jP, this, (q) qVarD1, cVar2);
            } else {
                vVar2 = vVar;
                cVar2 = cVar;
                if ((qVarD1.f58484c & 4) != 0 && (qVarD1 instanceof n)) {
                    int i11 = 0;
                    for (z1.q qVar = ((n) qVarD1).R; qVar != null; qVar = qVar.f58487f) {
                        if ((qVar.f58484c & 4) != 0) {
                            i11++;
                            if (i11 == 1) {
                                qVarD1 = qVar;
                            } else {
                                if (eVar == null) {
                                    eVar = new n1.e(new z1.q[16]);
                                }
                                if (qVarD1 != null) {
                                    eVar.c(qVarD1);
                                    qVarD1 = null;
                                }
                                eVar.c(qVar);
                            }
                        }
                    }
                    if (i11 == 1) {
                    }
                }
                vVar = vVar2;
                cVar = cVar2;
            }
            qVarD1 = f.f(eVar);
            vVar = vVar2;
            cVar = cVar2;
        }
    }

    public abstract void X0();

    public final k1 Y0(k1 k1Var) {
        i0 i0VarW = k1Var.Q;
        i0 i0Var = this.Q;
        if (i0VarW == i0Var) {
            z1.q qVarC1 = k1Var.c1();
            z1.q qVarC2 = c1();
            if (!qVarC2.f58482a.P) {
                v2.a.b("visitLocalAncestors called on an unattached node");
            }
            for (z1.q qVar = qVarC2.f58482a.f58486e; qVar != null; qVar = qVar.f58486e) {
                if ((qVar.f58484c & 2) != 0 && qVar == qVarC1) {
                    return k1Var;
                }
            }
            return this;
        }
        while (i0VarW.S > i0Var.S) {
            i0VarW = i0VarW.w();
            kotlin.jvm.internal.m.c(i0VarW);
        }
        i0 i0VarW2 = i0Var;
        while (i0VarW2.S > i0VarW.S) {
            i0VarW2 = i0VarW2.w();
            kotlin.jvm.internal.m.c(i0VarW2);
        }
        while (i0VarW != i0VarW2) {
            i0VarW = i0VarW.w();
            i0VarW2 = i0VarW2.w();
            if (i0VarW == null || i0VarW2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (i0VarW2 != i0Var) {
            if (i0VarW != k1Var.Q) {
                return (v) i0VarW.f56892i0.f50086d;
            }
            return k1Var;
        }
        return this;
    }

    @Override // v3.c
    public final float Z() {
        return this.Q.f56881b0.Z();
    }

    public final long Z0(long j11) {
        long j12 = this.f56945b0;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 & 4294967295L)) - ((int) (j12 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 >> 32)) - ((int) (j12 >> 32)))) << 32);
        s1 s1Var = this.f56957n0;
        return s1Var != null ? s1Var.g(jFloatToRawIntBits, true) : jFloatToRawIntBits;
    }

    public abstract r0 a1();

    public final long b1() {
        return this.W.v0(this.Q.f56885d0.e());
    }

    @Override // w2.x
    public final long c(long j11) {
        long jP = P(j11);
        AndroidComposeView androidComposeView = (AndroidComposeView) l0.a(this.Q);
        androidComposeView.B();
        return g2.k0.b(jP, androidComposeView.C0);
    }

    public abstract z1.q c1();

    public final z1.q d1(int i11) {
        boolean zG = l1.g(i11);
        z1.q qVarC1 = c1();
        if (!zG && (qVarC1 = qVarC1.f58486e) == null) {
            return null;
        }
        for (z1.q qVarE1 = e1(zG); qVarE1 != null && (qVarE1.f58485d & i11) != 0; qVarE1 = qVarE1.f58487f) {
            if ((qVarE1.f58484c & i11) != 0) {
                return qVarE1;
            }
            if (qVarE1 == qVarC1) {
                return null;
            }
        }
        return null;
    }

    public final z1.q e1(boolean z11) {
        z1.q qVarC1;
        mc mcVar = this.Q.f56892i0;
        if (((k1) mcVar.f50087e) == this) {
            return (z1.q) mcVar.f50089g;
        }
        if (!z11) {
            k1 k1Var = this.S;
            if (k1Var != null) {
                return k1Var.c1();
            }
            return null;
        }
        k1 k1Var2 = this.S;
        if (k1Var2 == null || (qVarC1 = k1Var2.c1()) == null) {
            return null;
        }
        return qVarC1.f58487f;
    }

    @Override // w2.x
    public final long f(w2.x xVar, long j11) {
        return S(xVar, j11);
    }

    public final void f1(z1.q qVar, d dVar, long j11, t tVar, int i11, boolean z11) {
        if (qVar == null) {
            i1(dVar, j11, tVar, i11, z11);
            return;
        }
        int i12 = tVar.f57005c;
        y.e0 e0Var = tVar.f57003a;
        tVar.d(i12 + 1, e0Var.f56687b);
        tVar.f57005c++;
        e0Var.a(qVar);
        tVar.f57004b.a(f.a(-1.0f, z11, false));
        f1(f.e(qVar, dVar.c()), dVar, j11, tVar, i11, z11);
        tVar.f57005c = i12;
    }

    public final void g1(z1.q qVar, d dVar, long j11, t tVar, int i11, boolean z11, float f5) {
        if (qVar == null) {
            i1(dVar, j11, tVar, i11, z11);
            return;
        }
        int i12 = tVar.f57005c;
        y.e0 e0Var = tVar.f57003a;
        tVar.d(i12 + 1, e0Var.f56687b);
        tVar.f57005c++;
        e0Var.a(qVar);
        tVar.f57004b.a(f.a(f5, z11, false));
        q1(f.e(qVar, dVar.c()), dVar, j11, tVar, i11, z11, f5, true);
        tVar.f57005c = i12;
    }

    @Override // v3.c
    public final float getDensity() {
        return this.Q.f56881b0.getDensity();
    }

    @Override // w2.s
    public final v3.m getLayoutDirection() {
        return this.Q.f56883c0;
    }

    @Override // w2.x
    public final w2.x h() {
        if (!c1().P) {
            v2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        l1();
        return this.S;
    }

    public final void h1(d dVar, long j11, t tVar, int i11, boolean z11) {
        boolean z12;
        boolean z13;
        z1.q qVarD1 = d1(dVar.c());
        if (!C1(j11)) {
            if (i11 == 1) {
                float fU0 = U0(j11, b1());
                if ((Float.floatToRawIntBits(fU0) & Integer.MAX_VALUE) < 2139095040) {
                    if (tVar.f57005c != ns.o.A(tVar)) {
                        if (f.h(tVar.b(), f.a(fU0, false, false)) <= 0) {
                            return;
                        }
                    }
                    g1(qVarD1, dVar, j11, tVar, i11, false, fU0);
                    return;
                }
                return;
            }
            return;
        }
        if (qVarD1 == null) {
            i1(dVar, j11, tVar, i11, z11);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        if (fIntBitsToFloat >= CropImageView.DEFAULT_ASPECT_RATIO && fIntBitsToFloat2 >= CropImageView.DEFAULT_ASPECT_RATIO && fIntBitsToFloat < g0() && fIntBitsToFloat2 < a0()) {
            f1(qVarD1, dVar, j11, tVar, i11, z11);
            return;
        }
        float fU1 = i11 == 1 ? U0(j11, b1()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fU1) & Integer.MAX_VALUE) < 2139095040) {
            if (tVar.f57005c != ns.o.A(tVar)) {
                z12 = z11;
                if (f.h(tVar.b(), f.a(fU1, z12, false)) > 0) {
                }
                q1(qVarD1, dVar, j11, tVar, i11, z12, fU1, z13);
            }
            z12 = z11;
            z13 = true;
            q1(qVarD1, dVar, j11, tVar, i11, z12, fU1, z13);
        }
        z12 = z11;
        z13 = false;
        q1(qVarD1, dVar, j11, tVar, i11, z12, fU1, z13);
    }

    public void i1(d dVar, long j11, t tVar, int i11, boolean z11) {
        k1 k1Var = this.R;
        if (k1Var != null) {
            k1Var.h1(dVar, k1Var.Z0(j11), tVar, i11, z11);
        }
    }

    public final void j1() {
        s1 s1Var = this.f56957n0;
        if (s1Var != null) {
            s1Var.invalidate();
            return;
        }
        k1 k1Var = this.S;
        if (k1Var != null) {
            k1Var.j1();
        }
    }

    @Override // w2.x
    public final boolean k() {
        return c1().P;
    }

    public final boolean k1() {
        if (this.f56957n0 != null && this.Y <= CropImageView.DEFAULT_ASPECT_RATIO) {
            return true;
        }
        k1 k1Var = this.S;
        if (k1Var != null) {
            return k1Var.k1();
        }
        return false;
    }

    @Override // w2.x
    public final void l(float[] fArr) {
        t1 t1VarA = l0.a(this.Q);
        k1 k1VarW1 = w1(w2.a0.h(this));
        z1(k1VarW1, fArr);
        if (t1VarA instanceof s2.g) {
            ((AndroidComposeView) ((s2.g) t1VarA)).q(fArr);
            return;
        }
        long jX = k1VarW1.x(0L);
        if ((9223372034707292159L & jX) != 9205357640488583168L) {
            g2.k0.f(fArr, Float.intBitsToFloat((int) (jX >> 32)), Float.intBitsToFloat((int) (jX & 4294967295L)));
        }
    }

    public final void l1() {
        this.Q.f56893j0.b();
    }

    @Override // w2.x
    public final long m() {
        return this.f54503c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r7v7, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void m1() {
        z1.q qVarC1;
        boolean zG = l1.g(128);
        z1.q qVarE1 = e1(zG);
        if (qVarE1 == null || (qVarE1.f58482a.f58485d & 128) == 0) {
            return;
        }
        x1.f fVarN = re.q.n();
        fz.c cVarE = fVarN != null ? fVarN.e() : null;
        x1.f fVarR = re.q.r(fVarN);
        try {
            if (!zG) {
                qVarC1 = c1().f58486e;
                if (qVarC1 == null) {
                }
                re.q.t(fVarN, fVarR, cVarE);
            }
            qVarC1 = c1();
            for (z1.q qVarE2 = e1(zG); qVarE2 != null && (qVarE2.f58485d & 128) != 0; qVarE2 = qVarE2.f58487f) {
                if ((qVarE2.f58484c & 128) != 0) {
                    ?? F = qVarE2;
                    ?? eVar = 0;
                    while (F != 0) {
                        if (F instanceof y) {
                            ((y) F).l(this.f54503c);
                        } else if ((F.f58484c & 128) != 0 && (F instanceof n)) {
                            z1.q qVar = ((n) F).R;
                            int i11 = 0;
                            F = F;
                            eVar = eVar;
                            while (qVar != null) {
                                if ((qVar.f58484c & 128) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        eVar = eVar;
                                        F = qVar;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new n1.e(new z1.q[16]);
                                        }
                                        if (F != 0) {
                                            eVar.c(F);
                                            F = 0;
                                        }
                                        eVar.c(qVar);
                                    }
                                }
                                qVar = qVar.f58487f;
                                F = F;
                                eVar = eVar;
                            }
                            if (i11 == 1) {
                            }
                        }
                        F = f.f(eVar);
                    }
                }
                if (qVarE2 == qVarC1) {
                    break;
                }
            }
            re.q.t(fVarN, fVarR, cVarE);
        } catch (Throwable th2) {
            re.q.t(fVarN, fVarR, cVarE);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void n1() {
        boolean zG = l1.g(4194304);
        z1.q qVarC1 = c1();
        if (!zG && (qVarC1 = qVarC1.f58486e) == null) {
            return;
        }
        for (z1.q qVarE1 = e1(zG); qVarE1 != null && (qVarE1.f58485d & 4194304) != 0; qVarE1 = qVarE1.f58487f) {
            if ((qVarE1.f58484c & 4194304) != 0) {
                ?? F = qVarE1;
                ?? eVar = 0;
                while (F != 0) {
                    if (F instanceof y) {
                        ((y) F).F0(this);
                    } else if ((F.f58484c & 4194304) != 0 && (F instanceof n)) {
                        z1.q qVar = ((n) F).R;
                        int i11 = 0;
                        F = F;
                        eVar = eVar;
                        while (qVar != null) {
                            if ((qVar.f58484c & 4194304) != 0) {
                                i11++;
                                if (i11 == 1) {
                                    eVar = eVar;
                                    F = qVar;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new n1.e(new z1.q[16]);
                                    }
                                    if (F != 0) {
                                        eVar.c(F);
                                        F = 0;
                                    }
                                    eVar.c(qVar);
                                }
                            }
                            qVar = qVar.f58487f;
                            F = F;
                            eVar = eVar;
                        }
                        if (i11 == 1) {
                        }
                    }
                    F = f.f(eVar);
                }
            }
            if (qVarE1 == qVarC1) {
                return;
            }
        }
    }

    public final void o1() {
        this.T = true;
        this.f56955l0.invoke();
        u1();
        if (v3.j.c(this.f56945b0, 0L)) {
            return;
        }
        this.Q.O();
    }

    public final void p1() {
        boolean zG = l1.g(1048576);
        z1.q qVarE1 = e1(zG);
        if (qVarE1 == null || (qVarE1.f58482a.f58485d & 1048576) == 0) {
            return;
        }
        z1.q qVarC1 = c1();
        if (!zG && (qVarC1 = qVarC1.f58486e) == null) {
            return;
        }
        for (z1.q qVarE2 = e1(zG); qVarE2 != null && (qVarE2.f58485d & 1048576) != 0; qVarE2 = qVarE2.f58487f) {
            if ((qVarE2.f58484c & 1048576) != 0) {
                z1.q qVarF = qVarE2;
                n1.e eVar = null;
                while (qVarF != null) {
                    if ((qVarF.f58484c & 1048576) != 0 && (qVarF instanceof n)) {
                        int i11 = 0;
                        for (z1.q qVar = ((n) qVarF).R; qVar != null; qVar = qVar.f58487f) {
                            if ((qVar.f58484c & 1048576) != 0) {
                                i11++;
                                if (i11 == 1) {
                                    qVarF = qVar;
                                } else {
                                    if (eVar == null) {
                                        eVar = new n1.e(new z1.q[16]);
                                    }
                                    if (qVarF != null) {
                                        eVar.c(qVarF);
                                        qVarF = null;
                                    }
                                    eVar.c(qVar);
                                }
                            }
                        }
                        if (i11 == 1) {
                        }
                    }
                    qVarF = f.f(eVar);
                }
            }
            if (qVarE2 == qVarC1) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x018f A[PHI: r5
      0x018f: PHI (r5v3 ??) = (r5v1 ??), (r5v1 ??), (r5v5 ??) binds: [B:52:0x015b, B:54:0x015f, B:68:0x0189] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r4v17, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v3, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public final void q1(z1.q qVar, d dVar, long j11, t tVar, int i11, boolean z11, float f5, boolean z12) {
        ?? F;
        if (qVar == null) {
            i1(dVar, j11, tVar, i11, z11);
            return;
        }
        int i12 = i11;
        if (i12 == 3 || i12 == 4) {
            ?? r9 = qVar;
            ?? eVar = 0;
            while (r9 != 0) {
                if (r9 instanceof y1) {
                    long jK = ((y1) r9).k();
                    int i13 = (int) (j11 >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i13);
                    i0 i0Var = this.Q;
                    v3.m mVar = i0Var.f56883c0;
                    int i14 = e2.f56852b;
                    long j12 = Long.MIN_VALUE & jK;
                    if (fIntBitsToFloat < (-((j12 == 0 || mVar == v3.m.Ltr) ? d.b(0, jK) : d.b(2, jK)))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i13) >= g0() + ((j12 == 0 || i0Var.f56883c0 == v3.m.Ltr) ? d.b(2, jK) : d.b(0, jK))) {
                        break;
                    }
                    int i15 = (int) (j11 & 4294967295L);
                    if (Float.intBitsToFloat(i15) < (-d.b(1, jK))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i15) >= d.b(3, jK) + a0()) {
                        break;
                    }
                    i1 i1Var = new i1(this, qVar, dVar, j11, tVar, i12, z11, f5, z12);
                    y.z zVar = tVar.f57004b;
                    y.e0 e0Var = tVar.f57003a;
                    if (tVar.f57005c == ns.o.A(tVar)) {
                        int i16 = tVar.f57005c;
                        tVar.d(i16 + 1, e0Var.f56687b);
                        tVar.f57005c++;
                        e0Var.a(qVar);
                        zVar.a(f.a(CropImageView.DEFAULT_ASPECT_RATIO, z11, true));
                        i1Var.invoke();
                        tVar.f57005c = i16;
                        return;
                    }
                    long jB = tVar.b();
                    int i17 = tVar.f57005c;
                    if (!f.p(jB)) {
                        if (f.l(jB) > CropImageView.DEFAULT_ASPECT_RATIO) {
                            int i18 = tVar.f57005c;
                            tVar.d(i18 + 1, e0Var.f56687b);
                            tVar.f57005c++;
                            e0Var.a(qVar);
                            zVar.a(f.a(CropImageView.DEFAULT_ASPECT_RATIO, z11, true));
                            i1Var.invoke();
                            tVar.f57005c = i18;
                            return;
                        }
                        return;
                    }
                    int iA = ns.o.A(tVar);
                    tVar.f57005c = iA;
                    tVar.d(iA + 1, e0Var.f56687b);
                    tVar.f57005c++;
                    e0Var.a(qVar);
                    zVar.a(f.a(CropImageView.DEFAULT_ASPECT_RATIO, z11, true));
                    i1Var.invoke();
                    tVar.f57005c = iA;
                    if (f.l(tVar.b()) < CropImageView.DEFAULT_ASPECT_RATIO) {
                        tVar.d(i17 + 1, tVar.f57005c + 1);
                    }
                    tVar.f57005c = i17;
                    return;
                }
                if ((r9.f58484c & 16) == 0 || !(r9 instanceof n)) {
                    F = r9;
                    eVar = eVar;
                    F = f.f(eVar);
                } else {
                    z1.q qVar2 = ((n) r9).R;
                    int i19 = 0;
                    while (qVar2 != null) {
                        if ((qVar2.f58484c & 16) != 0) {
                            i19++;
                            if (i19 == 1) {
                                F = r9;
                                eVar = eVar;
                                eVar = eVar;
                                F = qVar2;
                            } else {
                                if (eVar == 0) {
                                    eVar = new n1.e(new z1.q[16]);
                                }
                                if (F != 0) {
                                    eVar.c(F);
                                    F = 0;
                                }
                                eVar.c(qVar2);
                            }
                        } else {
                            F = r9;
                            eVar = eVar;
                        }
                        qVar2 = qVar2.f58487f;
                        F = F;
                        eVar = eVar;
                    }
                    if (i19 == 1) {
                        F = r9;
                        eVar = eVar;
                    } else {
                        F = r9;
                        eVar = eVar;
                        F = f.f(eVar);
                    }
                }
                i12 = i11;
                r9 = F;
                eVar = eVar;
            }
        }
        if (z12) {
            g1(qVar, dVar, j11, tVar, i11, z11, f5);
            return;
        }
        switch (dVar.f56843a) {
            case 1:
                ?? eVar2 = 0;
                ?? F2 = qVar;
                while (F2 != 0) {
                    if (F2 instanceof y1) {
                        ((y1) F2).P();
                    } else if ((F2.f58484c & 16) != 0 && (F2 instanceof n)) {
                        z1.q qVar3 = ((n) F2).R;
                        int i21 = 0;
                        while (qVar3 != null) {
                            if ((qVar3.f58484c & 16) != 0) {
                                i21++;
                                if (i21 == 1) {
                                    F2 = F2;
                                    eVar2 = eVar2;
                                    eVar2 = eVar2;
                                    F2 = qVar3;
                                } else {
                                    if (eVar2 == 0) {
                                        eVar2 = new n1.e(new z1.q[16]);
                                    }
                                    if (F2 != 0) {
                                        eVar2.c(F2);
                                        F2 = 0;
                                    }
                                    eVar2.c(qVar3);
                                }
                            } else {
                                F2 = F2;
                                eVar2 = eVar2;
                            }
                            qVar3 = qVar3.f58487f;
                            F2 = F2;
                            eVar2 = eVar2;
                        }
                        if (i21 == 1) {
                            F2 = F2;
                            eVar2 = eVar2;
                        } else {
                            F2 = F2;
                            eVar2 = eVar2;
                        }
                    }
                    F2 = f.f(eVar2);
                }
                break;
        }
        q1(f.e(qVar, dVar.c()), dVar, j11, tVar, i11, z11, f5, false);
    }

    @Override // y2.u1
    public final boolean r() {
        return (this.f56957n0 == null || this.T || !this.Q.I()) ? false : true;
    }

    public abstract void r1(g2.v vVar, j2.c cVar);

    public final void s1(long j11, float f5, fz.c cVar) {
        A1(cVar, false);
        boolean zC = v3.j.c(this.f56945b0, j11);
        i0 i0Var = this.Q;
        if (!zC) {
            ((AndroidComposeView) l0.a(i0Var)).L(-4.0f);
            this.f56945b0 = j11;
            i0Var.f56893j0.f56974p.F0();
            s1 s1Var = this.f56957n0;
            if (s1Var != null) {
                s1Var.j(j11);
            } else {
                k1 k1Var = this.S;
                if (k1Var != null) {
                    k1Var.j1();
                }
            }
            i0Var.O();
            q0.O0(this);
            t1 t1Var = i0Var.Q;
            if (t1Var != null) {
                ((AndroidComposeView) t1Var).x(i0Var);
            }
        }
        this.f56946c0 = f5;
        if (this == ((k1) i0Var.f56892i0.f50087e)) {
            l0.a(i0Var).getRectManager().e(i0Var, false);
        }
        if (this.M) {
            return;
        }
        F0(K0());
    }

    public final void t1(f2.a aVar, boolean z11, boolean z12) {
        s1 s1Var = this.f56957n0;
        if (s1Var != null) {
            if (this.U) {
                if (z12) {
                    long jB1 = b1();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jB1 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB1 & 4294967295L)) / 2.0f;
                    long j11 = this.f54503c;
                    aVar.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j11 >> 32)) + fIntBitsToFloat, ((int) (j11 & 4294967295L)) + fIntBitsToFloat2);
                } else if (z11) {
                    long j12 = this.f54503c;
                    aVar.a(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (int) (j12 >> 32), (int) (j12 & 4294967295L));
                }
                if (aVar.b()) {
                    return;
                }
            }
            s1Var.b(aVar, false);
        }
        long j13 = this.f56945b0;
        float f5 = (int) (j13 >> 32);
        aVar.f26566a += f5;
        aVar.f26568c += f5;
        float f11 = (int) (j13 & 4294967295L);
        aVar.f26567b += f11;
        aVar.f26569d += f11;
    }

    @Override // w2.x
    public final void u(w2.x xVar, float[] fArr) {
        k1 k1VarW1 = w1(xVar);
        k1VarW1.l1();
        k1 k1VarY0 = Y0(k1VarW1);
        g2.k0.d(fArr);
        k1VarW1.z1(k1VarY0, fArr);
        y1(k1VarY0, fArr);
    }

    public final void u1() {
        if (this.f56957n0 != null) {
            A1(null, false);
            this.Q.X(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [n1.e] */
    public final void v1(w2.r0 r0Var) {
        k1 k1Var;
        w2.r0 r0Var2 = this.Z;
        if (r0Var != r0Var2) {
            this.Z = r0Var;
            i0 i0Var = this.Q;
            int i11 = 0;
            if (r0Var2 == null || r0Var.h() != r0Var2.h() || r0Var.f() != r0Var2.f()) {
                int iH = r0Var.h();
                int iF = r0Var.f();
                s1 s1Var = this.f56957n0;
                if (s1Var != null) {
                    s1Var.h((((long) iH) << 32) | (((long) iF) & 4294967295L));
                } else if (i0Var.J() && (k1Var = this.S) != null) {
                    k1Var.j1();
                }
                l0((((long) iF) & 4294967295L) | (((long) iH) << 32));
                if (this.V != null) {
                    B1(false);
                }
                boolean zG = l1.g(4);
                z1.q qVarC1 = c1();
                if (zG || (qVarC1 = qVarC1.f58486e) != null) {
                    for (z1.q qVarE1 = e1(zG); qVarE1 != null && (qVarE1.f58485d & 4) != 0; qVarE1 = qVarE1.f58487f) {
                        if ((qVarE1.f58484c & 4) != 0) {
                            ?? F = qVarE1;
                            ?? eVar = 0;
                            while (F != 0) {
                                if (F instanceof q) {
                                    ((q) F).N();
                                } else if ((F.f58484c & 4) != 0 && (F instanceof n)) {
                                    z1.q qVar = ((n) F).R;
                                    int i12 = 0;
                                    F = F;
                                    eVar = eVar;
                                    while (qVar != null) {
                                        if ((qVar.f58484c & 4) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                eVar = eVar;
                                                F = qVar;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new n1.e(new z1.q[16]);
                                                }
                                                if (F != 0) {
                                                    eVar.c(F);
                                                    F = 0;
                                                }
                                                eVar.c(qVar);
                                            }
                                        }
                                        qVar = qVar.f58487f;
                                        F = F;
                                        eVar = eVar;
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                F = f.f(eVar);
                            }
                        }
                        if (qVarE1 == qVarC1) {
                            break;
                        }
                    }
                }
                t1 t1Var = i0Var.Q;
                if (t1Var != null) {
                    ((AndroidComposeView) t1Var).x(i0Var);
                }
            }
            y.d0 d0Var = this.f56944a0;
            if ((d0Var == null || d0Var.f56681e == 0) && r0Var.a().isEmpty()) {
                return;
            }
            y.d0 d0Var2 = this.f56944a0;
            Map mapA = r0Var.a();
            if (d0Var2 != null && d0Var2.f56681e == mapA.size()) {
                Object[] objArr = d0Var2.f56678b;
                int[] iArr = d0Var2.f56679c;
                long[] jArr = d0Var2.f56677a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i13 = 0;
                loop0: while (true) {
                    long j11 = jArr[i13];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        for (int i15 = i11; i15 < i14; i15++) {
                            if ((255 & j11) < 128) {
                                int i16 = (i13 << 3) + i15;
                                Object obj = objArr[i16];
                                int i17 = iArr[i16];
                                Integer num = (Integer) mapA.get((w2.n) obj);
                                if (num == null || num.intValue() != i17) {
                                    break loop0;
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i14 != 8) {
                            return;
                        }
                    }
                    if (i13 == length) {
                        return;
                    }
                    i13++;
                    i11 = 0;
                }
            }
            i0Var.f56893j0.f56974p.Z.f();
            y.d0 d0Var3 = this.f56944a0;
            if (d0Var3 == null) {
                y.d0 d0Var4 = y.n0.f56743a;
                d0Var3 = new y.d0();
                this.f56944a0 = d0Var3;
            }
            d0Var3.a();
            for (Map.Entry entry : r0Var.a().entrySet()) {
                d0Var3.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    @Override // w2.x
    public final long x(long j11) {
        if (!c1().P) {
            v2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((AndroidComposeView) l0.a(this.Q)).r(P(j11));
    }

    public final f2.c x1() {
        if (c1().P) {
            w2.x xVarH = w2.a0.h(this);
            f2.a aVar = this.f56947d0;
            if (aVar == null) {
                aVar = new f2.a();
                this.f56947d0 = aVar;
            }
            long jT0 = T0(b1());
            int i11 = (int) (jT0 >> 32);
            aVar.f26566a = -Float.intBitsToFloat(i11);
            int i12 = (int) (jT0 & 4294967295L);
            aVar.f26567b = -Float.intBitsToFloat(i12);
            aVar.f26568c = Float.intBitsToFloat(i11) + g0();
            aVar.f26569d = Float.intBitsToFloat(i12) + a0();
            k1 k1Var = this;
            while (k1Var != xVarH) {
                k1Var.t1(aVar, false, true);
                if (!aVar.b()) {
                    k1Var = k1Var.S;
                    kotlin.jvm.internal.m.c(k1Var);
                }
            }
            return new f2.c(aVar.f26566a, aVar.f26567b, aVar.f26568c, aVar.f26569d);
        }
        return f2.c.f26571e;
    }

    public final void y1(k1 k1Var, float[] fArr) {
        if (kotlin.jvm.internal.m.a(k1Var, this)) {
            return;
        }
        k1 k1Var2 = this.S;
        kotlin.jvm.internal.m.c(k1Var2);
        k1Var2.y1(k1Var, fArr);
        if (!v3.j.c(this.f56945b0, 0L)) {
            float[] fArr2 = f56941q0;
            g2.k0.d(fArr2);
            long j11 = this.f56945b0;
            g2.k0.f(fArr2, -((int) (j11 >> 32)), -((int) (j11 & 4294967295L)));
            g2.k0.e(fArr, fArr2);
        }
        s1 s1Var = this.f56957n0;
        if (s1Var != null) {
            s1Var.i(fArr);
        }
    }

    public final void z1(k1 k1Var, float[] fArr) {
        k1 k1Var2 = this;
        while (!k1Var2.equals(k1Var)) {
            s1 s1Var = k1Var2.f56957n0;
            if (s1Var != null) {
                s1Var.d(fArr);
            }
            long j11 = k1Var2.f56945b0;
            if (!v3.j.c(j11, 0L)) {
                float[] fArr2 = f56941q0;
                g2.k0.d(fArr2);
                g2.k0.f(fArr2, (int) (j11 >> 32), (int) (j11 & 4294967295L));
                g2.k0.e(fArr, fArr2);
            }
            k1Var2 = k1Var2.S;
            kotlin.jvm.internal.m.c(k1Var2);
        }
    }

    @Override // y2.q0
    public final w2.x H0() {
        return this;
    }
}
