package z2;

import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements y2.s1 {
    public float[] K;
    public boolean L;
    public int P;
    public g2.f0 R;
    public boolean S;
    public boolean T;
    public boolean V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j2.c f58618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2.c0 f58619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AndroidComposeView f58620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fz.e f58621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fz.a f58622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f58623f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f58624t;
    public final float[] H = g2.k0.a();
    public v3.c M = com.bumptech.glide.g.a();
    public v3.m N = v3.m.Ltr;
    public final i2.b O = new i2.b();
    public long Q = g2.z0.f28631b;
    public boolean U = true;
    public final y.p0 W = new y.p0(this, 12);

    public m1(j2.c cVar, g2.c0 c0Var, AndroidComposeView androidComposeView, fz.e eVar, fz.a aVar) {
        this.f58618a = cVar;
        this.f58619b = c0Var;
        this.f58620c = androidComposeView;
        this.f58621d = eVar;
        this.f58622e = aVar;
        long j11 = Integer.MAX_VALUE;
        this.f58623f = (j11 & 4294967295L) | (j11 << 32);
    }

    @Override // y2.s1
    public final void a(g2.v vVar, j2.c cVar) {
        k();
        this.V = this.f58618a.f35544a.M() > CropImageView.DEFAULT_ASPECT_RATIO;
        i2.b bVar = this.O;
        xq.c cVar2 = bVar.f34121b;
        cVar2.Q(vVar);
        cVar2.f56175c = cVar;
        vc.a.g(bVar, this.f58618a);
    }

    @Override // y2.s1
    public final void b(f2.a aVar, boolean z11) {
        float[] fArrL = z11 ? l() : m();
        if (this.U) {
            return;
        }
        if (fArrL != null) {
            g2.k0.c(fArrL, aVar);
            return;
        }
        aVar.f26566a = CropImageView.DEFAULT_ASPECT_RATIO;
        aVar.f26567b = CropImageView.DEFAULT_ASPECT_RATIO;
        aVar.f26568c = CropImageView.DEFAULT_ASPECT_RATIO;
        aVar.f26569d = CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // y2.s1
    public final void c(g2.t0 t0Var) {
        fz.a aVar;
        fz.a aVar2;
        int i11 = t0Var.f28600a | this.P;
        this.N = t0Var.S;
        this.M = t0Var.R;
        int i12 = i11 & 4096;
        if (i12 != 0) {
            this.Q = t0Var.N;
        }
        if ((i11 & 1) != 0) {
            j2.c cVar = this.f58618a;
            float f5 = t0Var.f28601b;
            j2.e eVar = cVar.f35544a;
            if (eVar.b() != f5) {
                eVar.B(f5);
            }
        }
        if ((i11 & 2) != 0) {
            j2.c cVar2 = this.f58618a;
            float f11 = t0Var.f28602c;
            j2.e eVar2 = cVar2.f35544a;
            if (eVar2.N() != f11) {
                eVar2.n(f11);
            }
        }
        if ((i11 & 4) != 0) {
            j2.c cVar3 = this.f58618a;
            float f12 = t0Var.f28603d;
            j2.e eVar3 = cVar3.f35544a;
            if (eVar3.a() != f12) {
                eVar3.u(f12);
            }
        }
        if ((i11 & 8) != 0) {
            j2.c cVar4 = this.f58618a;
            float f13 = t0Var.f28604e;
            j2.e eVar4 = cVar4.f35544a;
            if (eVar4.E() != f13) {
                eVar4.I(f13);
            }
        }
        if ((i11 & 16) != 0) {
            j2.c cVar5 = this.f58618a;
            float f14 = t0Var.f28605f;
            j2.e eVar5 = cVar5.f35544a;
            if (eVar5.w() != f14) {
                eVar5.f(f14);
            }
        }
        boolean z11 = true;
        if ((i11 & 32) != 0) {
            j2.c cVar6 = this.f58618a;
            float f15 = t0Var.f28606t;
            j2.e eVar6 = cVar6.f35544a;
            if (eVar6.M() != f15) {
                eVar6.c(f15);
                cVar6.f35550g = true;
                cVar6.a();
            }
            if (t0Var.f28606t > CropImageView.DEFAULT_ASPECT_RATIO && !this.V && (aVar2 = this.f58622e) != null) {
                aVar2.invoke();
            }
        }
        if ((i11 & 64) != 0) {
            j2.c cVar7 = this.f58618a;
            long j11 = t0Var.H;
            j2.e eVar7 = cVar7.f35544a;
            if (!g2.x.d(j11, eVar7.s())) {
                eVar7.z(j11);
            }
        }
        if ((i11 & 128) != 0) {
            j2.c cVar8 = this.f58618a;
            long j12 = t0Var.K;
            j2.e eVar8 = cVar8.f35544a;
            if (!g2.x.d(j12, eVar8.y())) {
                eVar8.J(j12);
            }
        }
        if ((i11 & 1024) != 0) {
            j2.c cVar9 = this.f58618a;
            float f16 = t0Var.L;
            j2.e eVar9 = cVar9.f35544a;
            if (eVar9.q() != f16) {
                eVar9.e(f16);
            }
        }
        if ((i11 & 256) != 0) {
            j2.e eVar10 = this.f58618a.f35544a;
            if (eVar10.G() != CropImageView.DEFAULT_ASPECT_RATIO) {
                eVar10.t();
            }
        }
        if ((i11 & 512) != 0) {
            j2.e eVar11 = this.f58618a.f35544a;
            if (eVar11.o() != CropImageView.DEFAULT_ASPECT_RATIO) {
                eVar11.x();
            }
        }
        if ((i11 & 2048) != 0) {
            j2.c cVar10 = this.f58618a;
            float f17 = t0Var.M;
            j2.e eVar12 = cVar10.f35544a;
            if (eVar12.C() != f17) {
                eVar12.L(f17);
            }
        }
        if (i12 != 0) {
            if (g2.z0.a(this.Q, g2.z0.f28631b)) {
                j2.c cVar11 = this.f58618a;
                if (!f2.b.c(cVar11.f35564v, 9205357640488583168L)) {
                    cVar11.f35564v = 9205357640488583168L;
                    cVar11.f35544a.r(9205357640488583168L);
                }
            } else {
                j2.c cVar12 = this.f58618a;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(g2.z0.c(this.Q) * ((int) (this.f58623f & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(g2.z0.b(this.Q) * ((int) (this.f58623f >> 32)))) << 32);
                if (!f2.b.c(cVar12.f35564v, jFloatToRawIntBits)) {
                    cVar12.f35564v = jFloatToRawIntBits;
                    cVar12.f35544a.r(jFloatToRawIntBits);
                }
            }
        }
        if ((i11 & 16384) != 0) {
            j2.c cVar13 = this.f58618a;
            boolean z12 = t0Var.P;
            if (cVar13.f35565w != z12) {
                cVar13.f35565w = z12;
                cVar13.f35550g = true;
                cVar13.a();
            }
        }
        if ((131072 & i11) != 0) {
            j2.c cVar14 = this.f58618a;
            g2.s sVar = t0Var.T;
            j2.e eVar13 = cVar14.f35544a;
            if (!kotlin.jvm.internal.m.a(eVar13.d(), sVar)) {
                eVar13.m(sVar);
            }
        }
        if ((262144 & i11) != 0) {
            j2.e eVar14 = this.f58618a.f35544a;
            if (!kotlin.jvm.internal.m.a(eVar14.l(), null)) {
                eVar14.A();
            }
        }
        if ((524288 & i11) != 0) {
            j2.c cVar15 = this.f58618a;
            int i13 = t0Var.U;
            j2.e eVar15 = cVar15.f35544a;
            if (eVar15.O() != i13) {
                eVar15.h(i13);
            }
        }
        if ((32768 & i11) != 0) {
            j2.e eVar16 = this.f58618a.f35544a;
            if (eVar16.j() != 0) {
                eVar16.H(0);
            }
        }
        if ((i11 & 7963) != 0) {
            this.S = true;
            this.T = true;
        }
        if (kotlin.jvm.internal.m.a(this.R, t0Var.V)) {
            z11 = false;
        } else {
            g2.f0 f0Var = t0Var.V;
            this.R = f0Var;
            if (f0Var != null) {
                j2.c cVar16 = this.f58618a;
                if (f0Var instanceof g2.m0) {
                    f2.c cVar17 = ((g2.m0) f0Var).f28585f;
                    float f18 = cVar17.f26572a;
                    float f19 = cVar17.f26573b;
                    cVar16.h(CropImageView.DEFAULT_ASPECT_RATIO, (((long) Float.floatToRawIntBits(f19)) & 4294967295L) | (Float.floatToRawIntBits(f18) << 32), (((long) Float.floatToRawIntBits(cVar17.f26574c - f18)) << 32) | (((long) Float.floatToRawIntBits(cVar17.f26575d - f19)) & 4294967295L));
                } else if (f0Var instanceof g2.l0) {
                    g2.p0 p0Var = ((g2.l0) f0Var).f28581f;
                    cVar16.f35554k = null;
                    cVar16.f35552i = 9205357640488583168L;
                    cVar16.f35551h = 0L;
                    cVar16.f35553j = CropImageView.DEFAULT_ASPECT_RATIO;
                    cVar16.f35550g = true;
                    cVar16.f35556n = false;
                    cVar16.f35555l = p0Var;
                    cVar16.a();
                } else {
                    if (!(f0Var instanceof g2.n0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    g2.n0 n0Var = (g2.n0) f0Var;
                    g2.k kVar = n0Var.f28588g;
                    if (kVar != null) {
                        cVar16.f35554k = null;
                        cVar16.f35552i = 9205357640488583168L;
                        cVar16.f35551h = 0L;
                        cVar16.f35553j = CropImageView.DEFAULT_ASPECT_RATIO;
                        cVar16.f35550g = true;
                        cVar16.f35556n = false;
                        cVar16.f35555l = kVar;
                        cVar16.a();
                    } else {
                        f2.d dVar = n0Var.f28587f;
                        cVar16.h(Float.intBitsToFloat((int) (dVar.f26583h >> 32)), (((long) Float.floatToRawIntBits(dVar.f26577b)) & 4294967295L) | (((long) Float.floatToRawIntBits(dVar.f26576a)) << 32), (((long) Float.floatToRawIntBits(dVar.b())) << 32) | (((long) Float.floatToRawIntBits(dVar.a())) & 4294967295L));
                    }
                }
                if ((f0Var instanceof g2.l0) && Build.VERSION.SDK_INT < 33 && (aVar = this.f58622e) != null) {
                    aVar.invoke();
                }
            }
        }
        this.P = t0Var.f28600a;
        if (i11 != 0 || z11) {
            int i14 = Build.VERSION.SDK_INT;
            AndroidComposeView androidComposeView = this.f58620c;
            if (i14 >= 26) {
                c3.a(androidComposeView);
            } else {
                androidComposeView.invalidate();
            }
            if (androidComposeView.M) {
                androidComposeView.L(CropImageView.DEFAULT_ASPECT_RATIO);
            }
        }
    }

    @Override // y2.s1
    public final void d(float[] fArr) {
        g2.k0.e(fArr, m());
    }

    @Override // y2.s1
    public final void destroy() {
        n1.e eVar;
        Reference referencePoll;
        this.f58621d = null;
        this.f58622e = null;
        this.f58624t = true;
        boolean z11 = this.L;
        AndroidComposeView androidComposeView = this.f58620c;
        if (z11) {
            this.L = false;
            androidComposeView.v(this, false);
        }
        g2.c0 c0Var = this.f58619b;
        if (c0Var != null) {
            c0Var.a(this.f58618a);
            qp.r rVar = androidComposeView.X0;
            do {
                ReferenceQueue referenceQueue = (ReferenceQueue) rVar.f48146c;
                eVar = (n1.e) rVar.f48145b;
                referencePoll = referenceQueue.poll();
                if (referencePoll != null) {
                    eVar.k(referencePoll);
                }
            } while (referencePoll != null);
            eVar.c(new WeakReference(this, (ReferenceQueue) rVar.f48146c));
            androidComposeView.f1175h0.j(this);
        }
    }

    @Override // y2.s1
    public final void e(fz.e eVar, fz.a aVar) {
        g2.c0 c0Var = this.f58619b;
        if (c0Var == null) {
            throw defpackage.e.t("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.f58618a.f35561s) {
            v2.a.a("layer should have been released before reuse");
        }
        this.f58618a = c0Var.b();
        this.f58624t = false;
        this.f58621d = eVar;
        this.f58622e = aVar;
        this.S = false;
        this.T = false;
        this.U = true;
        g2.k0.d(this.H);
        float[] fArr = this.K;
        if (fArr != null) {
            g2.k0.d(fArr);
        }
        this.Q = g2.z0.f28631b;
        this.V = false;
        long j11 = Integer.MAX_VALUE;
        this.f58623f = (j11 & 4294967295L) | (j11 << 32);
        this.R = null;
        this.P = 0;
    }

    @Override // y2.s1
    public final boolean f(long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        j2.c cVar = this.f58618a;
        if (!cVar.f35565w) {
            return true;
        }
        g2.f0 f0VarE = cVar.e();
        if (f0VarE instanceof g2.m0) {
            f2.c cVar2 = ((g2.m0) f0VarE).f28585f;
            return cVar2.f26572a <= fIntBitsToFloat && fIntBitsToFloat < cVar2.f26574c && cVar2.f26573b <= fIntBitsToFloat2 && fIntBitsToFloat2 < cVar2.f26575d;
        }
        if (!(f0VarE instanceof g2.n0)) {
            if (f0VarE instanceof g2.l0) {
                return g0.z(fIntBitsToFloat, fIntBitsToFloat2, ((g2.l0) f0VarE).f28581f);
            }
            throw new NoWhenBranchMatchedException();
        }
        f2.d dVar = ((g2.n0) f0VarE).f28587f;
        float f5 = dVar.f26576a;
        long j12 = dVar.f26581f;
        long j13 = dVar.f26583h;
        long j14 = dVar.f26582g;
        float f11 = dVar.f26579d;
        float f12 = dVar.f26577b;
        float f13 = dVar.f26578c;
        long j15 = dVar.f26580e;
        if (fIntBitsToFloat >= f5 && fIntBitsToFloat < f13 && fIntBitsToFloat2 >= f12 && fIntBitsToFloat2 < f11) {
            int i11 = (int) (j15 >> 32);
            float fIntBitsToFloat3 = Float.intBitsToFloat(i11);
            int i12 = (int) (j12 >> 32);
            if (Float.intBitsToFloat(i12) + fIntBitsToFloat3 <= dVar.b()) {
                int i13 = (int) (j13 >> 32);
                float fIntBitsToFloat4 = Float.intBitsToFloat(i13);
                int i14 = (int) (j14 >> 32);
                if (Float.intBitsToFloat(i14) + fIntBitsToFloat4 <= dVar.b()) {
                    int i15 = (int) (j15 & 4294967295L);
                    int i16 = (int) (j13 & 4294967295L);
                    if (Float.intBitsToFloat(i16) + Float.intBitsToFloat(i15) <= dVar.a()) {
                        int i17 = (int) (j12 & 4294967295L);
                        int i18 = (int) (j14 & 4294967295L);
                        if (Float.intBitsToFloat(i18) + Float.intBitsToFloat(i17) <= dVar.a()) {
                            float fIntBitsToFloat5 = Float.intBitsToFloat(i11) + f5;
                            float fIntBitsToFloat6 = Float.intBitsToFloat(i15) + f12;
                            float fIntBitsToFloat7 = f13 - Float.intBitsToFloat(i12);
                            float fIntBitsToFloat8 = Float.intBitsToFloat(i17) + f12;
                            float fIntBitsToFloat9 = f13 - Float.intBitsToFloat(i14);
                            float fIntBitsToFloat10 = f11 - Float.intBitsToFloat(i18);
                            float fIntBitsToFloat11 = f11 - Float.intBitsToFloat(i16);
                            float fIntBitsToFloat12 = Float.intBitsToFloat(i13) + f5;
                            if (fIntBitsToFloat < fIntBitsToFloat5 && fIntBitsToFloat2 < fIntBitsToFloat6) {
                                return g0.A(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, dVar.f26580e);
                            }
                            if (fIntBitsToFloat < fIntBitsToFloat12 && fIntBitsToFloat2 > fIntBitsToFloat11) {
                                return g0.A(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat12, fIntBitsToFloat11, dVar.f26583h);
                            }
                            if (fIntBitsToFloat > fIntBitsToFloat7 && fIntBitsToFloat2 < fIntBitsToFloat8) {
                                return g0.A(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, dVar.f26581f);
                            }
                            if (fIntBitsToFloat > fIntBitsToFloat9 && fIntBitsToFloat2 > fIntBitsToFloat10) {
                                return g0.A(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat9, fIntBitsToFloat10, dVar.f26582g);
                            }
                        }
                    }
                }
            }
            g2.k kVarA = g2.o.a();
            g2.p0.c(kVarA, dVar);
            return g0.z(fIntBitsToFloat, fIntBitsToFloat2, kVarA);
        }
    }

    @Override // y2.s1
    public final long g(long j11, boolean z11) {
        float[] fArrM;
        if (z11) {
            fArrM = l();
            if (fArrM == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrM = m();
        }
        return this.U ? j11 : g2.k0.b(j11, fArrM);
    }

    @Override // y2.s1
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo6getUnderlyingMatrixsQKQjiQ() {
        return m();
    }

    @Override // y2.s1
    public final void h(long j11) {
        if (v3.l.a(j11, this.f58623f)) {
            return;
        }
        AndroidComposeView androidComposeView = this.f58620c;
        if (androidComposeView.M) {
            androidComposeView.L(-4.0f);
        }
        this.f58623f = j11;
        if (this.L || this.f58624t) {
            return;
        }
        androidComposeView.invalidate();
        if (true != this.L) {
            this.L = true;
            androidComposeView.v(this, true);
        }
    }

    @Override // y2.s1
    public final void i(float[] fArr) {
        float[] fArrL = l();
        if (fArrL != null) {
            g2.k0.e(fArr, fArrL);
        }
    }

    @Override // y2.s1
    public final void invalidate() {
        if (this.L || this.f58624t) {
            return;
        }
        AndroidComposeView androidComposeView = this.f58620c;
        androidComposeView.invalidate();
        if (true != this.L) {
            this.L = true;
            androidComposeView.v(this, true);
        }
    }

    @Override // y2.s1
    public final void j(long j11) {
        AndroidComposeView androidComposeView = this.f58620c;
        if (androidComposeView.M) {
            androidComposeView.L(-4.0f);
        }
        j2.c cVar = this.f58618a;
        if (!v3.j.c(cVar.f35562t, j11)) {
            cVar.f35562t = j11;
            cVar.f35544a.D(cVar.f35563u, (int) (j11 >> 32), (int) (j11 & 4294967295L));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            c3.a(androidComposeView);
        } else {
            androidComposeView.invalidate();
        }
    }

    @Override // y2.s1
    public final void k() {
        if (this.L) {
            if (!g2.z0.a(this.Q, g2.z0.f28631b) && !v3.l.a(this.f58618a.f35563u, this.f58623f)) {
                j2.c cVar = this.f58618a;
                float fB = g2.z0.b(this.Q) * ((int) (this.f58623f >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(g2.z0.c(this.Q) * ((int) (this.f58623f & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
                if (!f2.b.c(cVar.f35564v, jFloatToRawIntBits)) {
                    cVar.f35564v = jFloatToRawIntBits;
                    cVar.f35544a.r(jFloatToRawIntBits);
                }
            }
            this.f58618a.g(this.M, this.N, this.f58623f, this.W);
            if (this.L) {
                this.L = false;
                this.f58620c.v(this, false);
            }
        }
    }

    public final float[] l() {
        float[] fArrA = this.K;
        if (fArrA == null) {
            fArrA = g2.k0.a();
            this.K = fArrA;
        }
        if (this.T) {
            this.T = false;
            float[] fArrM = m();
            if (this.U) {
                return fArrM;
            }
            if (!g0.y(fArrM, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] m() {
        boolean z11 = this.S;
        float[] fArr = this.H;
        if (z11) {
            j2.c cVar = this.f58618a;
            long jL = cVar.f35564v;
            j2.e eVar = cVar.f35544a;
            if ((9223372034707292159L & jL) == 9205357640488583168L) {
                jL = com.bumptech.glide.g.l(ff.h.P(this.f58623f));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jL >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jL & 4294967295L));
            float fE = eVar.E();
            float fW = eVar.w();
            float fG = eVar.G();
            float fO = eVar.o();
            float fQ = eVar.q();
            float fB = eVar.b();
            float fN = eVar.N();
            double d5 = ((double) fG) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d5);
            float fCos = (float) Math.cos(d5);
            float f5 = -fSin;
            float f11 = (fW * fCos) - (CropImageView.DEFAULT_ASPECT_RATIO * fSin);
            float f12 = (CropImageView.DEFAULT_ASPECT_RATIO * fCos) + (fW * fSin);
            double d11 = ((double) fO) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d11);
            float fCos2 = (float) Math.cos(d11);
            float f13 = -fSin2;
            float f14 = fSin * fSin2;
            float f15 = fSin * fCos2;
            float f16 = fCos * fSin2;
            float f17 = fCos * fCos2;
            float f18 = (f12 * fSin2) + (fE * fCos2);
            float f19 = (f12 * fCos2) + ((-fE) * fSin2);
            double d12 = ((double) fQ) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d12);
            float fCos3 = (float) Math.cos(d12);
            float f21 = -fSin3;
            float f22 = (fCos3 * f14) + (f21 * fCos2);
            float f23 = (f14 * fSin3) + (fCos2 * fCos3);
            float f24 = fSin3 * fCos;
            float f25 = f23 * fB;
            float f26 = f24 * fB;
            float f27 = ((fSin3 * f15) + (fCos3 * f13)) * fB;
            float f28 = f22 * fN;
            float f29 = fCos * fCos3 * fN;
            float f30 = ((fCos3 * f15) + (f21 * f13)) * fN;
            float f31 = f16 * 1.0f;
            float f32 = f5 * 1.0f;
            float f33 = f17 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f25;
                fArr[1] = f26;
                fArr[2] = f27;
                fArr[3] = 0.0f;
                fArr[4] = f28;
                fArr[5] = f29;
                fArr[6] = f30;
                fArr[7] = 0.0f;
                fArr[8] = f31;
                fArr[9] = f32;
                fArr[10] = f33;
                fArr[11] = 0.0f;
                float f34 = -fIntBitsToFloat;
                fArr[12] = ((f25 * f34) - (fIntBitsToFloat2 * f28)) + f18 + fIntBitsToFloat;
                fArr[13] = ((f26 * f34) - (fIntBitsToFloat2 * f29)) + f11 + fIntBitsToFloat2;
                fArr[14] = ((f34 * f27) - (fIntBitsToFloat2 * f30)) + f19;
                fArr[15] = 1.0f;
            }
            this.S = false;
            this.U = g2.f0.t(fArr);
        }
        return fArr;
    }
}
