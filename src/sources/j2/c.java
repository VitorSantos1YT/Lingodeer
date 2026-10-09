package j2;

import a0.o0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import com.yalantis.ucrop.view.CropImageView;
import g2.f0;
import g2.i0;
import g2.l0;
import g2.m0;
import g2.n0;
import g2.p0;
import g2.v;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import y.j0;
import y.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final j f35543y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f35544a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Outline f35549f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f35553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f0 f35554k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p0 f35555l;
    public g2.k m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f35556n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i2.b f35557o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a.a f35558p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35559q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f35561s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f35562t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f35563u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f35564v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f35565w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RectF f35566x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v3.c f35545b = i2.c.f34124a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v3.m f35546c = v3.m.Ltr;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fz.c f35547d = a.f35537b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0 f35548e = new o0(this, 18);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f35550g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f35551h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f35552i = 9205357640488583168L;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g1.k f35560r = new g1.k();

    static {
        j jVar;
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
        if (lowerCase.equals("robolectric")) {
            jVar = d.f35568c;
        } else {
            jVar = Build.VERSION.SDK_INT >= 28 ? n.f35648a : d.f35569d;
        }
        f35543y = jVar;
    }

    public c(e eVar) {
        this.f35544a = eVar;
        eVar.F(false);
        this.f35562t = 0L;
        this.f35563u = 0L;
        this.f35564v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.f35550g) {
            boolean z11 = this.f35565w;
            Outline outline2 = null;
            e eVar = this.f35544a;
            if (z11 || eVar.M() > CropImageView.DEFAULT_ASPECT_RATIO) {
                p0 p0Var = this.f35555l;
                if (p0Var != null) {
                    RectF rectF = this.f35566x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f35566x = rectF;
                    }
                    boolean z12 = p0Var instanceof g2.k;
                    if (!z12) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((g2.k) p0Var).f28575a.computeBounds(rectF, false);
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 > 28 || ((g2.k) p0Var).f28575a.isConvex()) {
                        outline = this.f35549f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f35549f = outline;
                        }
                        if (i11 >= 30) {
                            a5.d.h(outline, p0Var);
                        } else {
                            if (!z12) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(((g2.k) p0Var).f28575a);
                        }
                        this.f35556n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f35549f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f35556n = true;
                        outline = null;
                    }
                    this.f35555l = p0Var;
                    if (outline != null) {
                        outline.setAlpha(eVar.a());
                        outline2 = outline;
                    }
                    eVar.g(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.f35556n && this.f35565w) {
                        eVar.F(false);
                        eVar.i();
                    } else {
                        eVar.F(this.f35565w);
                    }
                } else {
                    eVar.F(this.f35565w);
                    Outline outline4 = this.f35549f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f35549f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jP = ff.h.P(this.f35563u);
                    long j11 = this.f35551h;
                    long j12 = this.f35552i;
                    if (j12 != 9205357640488583168L) {
                        jP = j12;
                    }
                    int i12 = (int) (j11 >> 32);
                    int i13 = (int) (j11 & 4294967295L);
                    int i14 = (int) (jP >> 32);
                    int i15 = (int) (jP & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i12)), Math.round(Float.intBitsToFloat(i13)), Math.round(Float.intBitsToFloat(i14) + Float.intBitsToFloat(i12)), Math.round(Float.intBitsToFloat(i15) + Float.intBitsToFloat(i13)), this.f35553j);
                    outline5.setAlpha(eVar.a());
                    eVar.g(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i15)))) | (((long) Math.round(Float.intBitsToFloat(i14))) << 32));
                }
            } else {
                eVar.F(false);
                eVar.g(null, 0L);
            }
        }
        this.f35550g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005e A[LOOP:0: B:14:0x0027->B:24:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0061 A[EDGE_INSN: B:29:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:14:0x0027->B:24:0x005e], SYNTHETIC] */
    public final void b() {
        if (this.f35561s && this.f35559q == 0) {
            g1.k kVar = this.f35560r;
            c cVar = (c) kVar.f28529b;
            if (cVar != null) {
                cVar.f();
                kVar.f28529b = null;
            }
            j0 j0Var = (j0) kVar.f28531d;
            if (j0Var != null) {
                Object[] objArr = j0Var.f56721b;
                long[] jArr = j0Var.f56720a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j11 = jArr[i11];
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i11 != length) {
                                break;
                                break;
                            }
                            i11++;
                        } else {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((255 & j11) < 128) {
                                    ((c) objArr[(i11 << 3) + i13]).f();
                                }
                                j11 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            } else if (i11 != length) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                j0Var.b();
            }
            this.f35544a.i();
        }
    }

    public final void c(v vVar, c cVar) {
        boolean z11;
        float f5;
        if (this.f35561s) {
            return;
        }
        a();
        e eVar = this.f35544a;
        if (!eVar.p()) {
            try {
                eVar.v(this.f35545b, this.f35546c, this, this.f35548e);
            } catch (Throwable unused) {
            }
        }
        boolean z12 = eVar.M() > CropImageView.DEFAULT_ASPECT_RATIO;
        if (z12) {
            vVar.t();
        }
        Canvas canvasA = g2.d.a(vVar);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j11 = this.f35562t;
            float f11 = (int) (j11 >> 32);
            float f12 = (int) (j11 & 4294967295L);
            long j12 = this.f35563u;
            float f13 = ((int) (j12 >> 32)) + f11;
            float f14 = ((int) (j12 & 4294967295L)) + f12;
            float fA = eVar.a();
            g2.p pVarL = eVar.l();
            int iO = eVar.O();
            if (fA < 1.0f || iO != 3 || pVarL != null || eVar.j() == 1) {
                a.a aVarH = this.f35558p;
                if (aVarH == null) {
                    aVarH = f0.h();
                    this.f35558p = aVarH;
                }
                aVarH.L(fA);
                aVarH.M(iO);
                aVarH.O(pVarL);
                canvasA = canvasA;
                f5 = f11;
                canvasA.saveLayer(f5, f12, f13, f14, (Paint) aVarH.f6c);
            } else {
                canvasA.save();
                canvasA = canvasA;
                f5 = f11;
            }
            canvasA.translate(f5, f12);
            canvasA.concat(eVar.K());
        }
        boolean z13 = !zIsHardwareAccelerated && this.f35565w;
        if (z13) {
            vVar.e();
            f0 f0VarE = e();
            if (f0VarE instanceof m0) {
                v.r(vVar, ((m0) f0VarE).f28585f);
            } else if (f0VarE instanceof n0) {
                g2.k kVarA = this.m;
                if (kVarA != null) {
                    kVarA.f28575a.rewind();
                } else {
                    kVarA = g2.o.a();
                    this.m = kVarA;
                }
                p0.c(kVarA, ((n0) f0VarE).f28587f);
                vVar.q(kVarA);
            } else {
                if (!(f0VarE instanceof l0)) {
                    throw new NoWhenBranchMatchedException();
                }
                vVar.q(((l0) f0VarE).f28581f);
            }
        }
        if (cVar != null) {
            g1.k kVar = cVar.f35560r;
            if (!kVar.f28528a) {
                i0.a("Only add dependencies during a tracking");
            }
            j0 j0Var = (j0) kVar.f28531d;
            if (j0Var != null) {
                j0Var.a(this);
            } else if (((c) kVar.f28529b) != null) {
                j0 j0Var2 = s0.f56760a;
                j0 j0Var3 = new j0();
                c cVar2 = (c) kVar.f28529b;
                kotlin.jvm.internal.m.c(cVar2);
                j0Var3.a(cVar2);
                j0Var3.a(this);
                kVar.f28531d = j0Var3;
                kVar.f28529b = null;
            } else {
                kVar.f28529b = this;
            }
            j0 j0Var4 = (j0) kVar.f28532e;
            if (j0Var4 != null) {
                z11 = !j0Var4.l(this);
            } else if (((c) kVar.f28530c) != this) {
                z11 = true;
            } else {
                kVar.f28530c = null;
                z11 = false;
            }
            if (z11) {
                this.f35559q++;
            }
        }
        if (g2.d.a(vVar).isHardwareAccelerated()) {
            eVar.k(vVar);
        } else {
            i2.b bVar = this.f35557o;
            if (bVar == null) {
                bVar = new i2.b();
                this.f35557o = bVar;
            }
            xq.c cVar3 = bVar.f34121b;
            v3.c cVar4 = this.f35545b;
            v3.m mVar = this.f35546c;
            long jP = ff.h.P(this.f35563u);
            v3.c cVarA = cVar3.A();
            v3.m mVarE = cVar3.E();
            v vVarX = cVar3.x();
            long jH = cVar3.H();
            c cVar5 = (c) cVar3.f56175c;
            cVar3.R(cVar4);
            cVar3.S(mVar);
            cVar3.Q(vVar);
            cVar3.T(jP);
            cVar3.f56175c = this;
            vVar.e();
            try {
                d(bVar);
                vVar.p();
                cVar3.R(cVarA);
                cVar3.S(mVarE);
                cVar3.Q(vVarX);
                cVar3.T(jH);
                cVar3.f56175c = cVar5;
            } catch (Throwable th2) {
                vVar.p();
                cVar3.R(cVarA);
                cVar3.S(mVarE);
                cVar3.Q(vVarX);
                cVar3.T(jH);
                cVar3.f56175c = cVar5;
                throw th2;
            }
        }
        if (z13) {
            vVar.p();
        }
        if (z12) {
            vVar.f();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasA.restore();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x008a A[LOOP:0: B:20:0x0053->B:30:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x008d A[EDGE_INSN: B:34:0x008d->B:31:0x008d BREAK  A[LOOP:0: B:20:0x0053->B:30:0x008a], SYNTHETIC] */
    public final void d(i2.d dVar) {
        g1.k kVar = this.f35560r;
        kVar.f28530c = (c) kVar.f28529b;
        j0 j0Var = (j0) kVar.f28531d;
        if (j0Var != null && j0Var.h()) {
            j0 j0Var2 = (j0) kVar.f28532e;
            if (j0Var2 == null) {
                j0 j0Var3 = s0.f56760a;
                j0Var2 = new j0();
                kVar.f28532e = j0Var2;
            }
            j0Var2.k(j0Var);
            j0Var.b();
        }
        kVar.f28528a = true;
        this.f35547d.invoke(dVar);
        kVar.f28528a = false;
        c cVar = (c) kVar.f28530c;
        if (cVar != null) {
            cVar.f();
        }
        j0 j0Var4 = (j0) kVar.f28532e;
        if (j0Var4 == null || !j0Var4.h()) {
            return;
        }
        Object[] objArr = j0Var4.f56721b;
        long[] jArr = j0Var4.f56720a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            ((c) objArr[(i11 << 3) + i13]).f();
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    } else if (i11 != length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        j0Var4.b();
    }

    public final f0 e() {
        f0 m0Var;
        f0 f0Var = this.f35554k;
        p0 p0Var = this.f35555l;
        if (f0Var != null) {
            return f0Var;
        }
        if (p0Var != null) {
            l0 l0Var = new l0(p0Var);
            this.f35554k = l0Var;
            return l0Var;
        }
        long jP = ff.h.P(this.f35563u);
        long j11 = this.f35551h;
        long j12 = this.f35552i;
        if (j12 != 9205357640488583168L) {
            jP = j12;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jP >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jP & 4294967295L)) + fIntBitsToFloat2;
        float f5 = this.f35553j;
        if (f5 > CropImageView.DEFAULT_ASPECT_RATIO) {
            m0Var = new n0(com.bumptech.glide.f.c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f5)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f5)))));
        } else {
            m0Var = new m0(new f2.c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f35554k = m0Var;
        return m0Var;
    }

    public final void f() {
        this.f35559q--;
        b();
    }

    public final void g(v3.c cVar, v3.m mVar, long j11, fz.c cVar2) {
        boolean zA = v3.l.a(this.f35563u, j11);
        e eVar = this.f35544a;
        if (!zA) {
            this.f35563u = j11;
            long j12 = this.f35562t;
            eVar.D(j11, (int) (j12 >> 32), (int) (j12 & 4294967295L));
            if (this.f35552i == 9205357640488583168L) {
                this.f35550g = true;
                a();
            }
        }
        this.f35545b = cVar;
        this.f35546c = mVar;
        this.f35547d = cVar2;
        eVar.v(cVar, mVar, this, this.f35548e);
    }

    public final void h(float f5, long j11, long j12) {
        if (f2.b.c(this.f35551h, j11) && f2.e.a(this.f35552i, j12) && this.f35553j == f5 && this.f35555l == null) {
            return;
        }
        this.f35554k = null;
        this.f35555l = null;
        this.f35550g = true;
        this.f35556n = false;
        this.f35551h = j11;
        this.f35552i = j12;
        this.f35553j = f5;
        a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(xy.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i11 = bVar.f35542c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f35542c = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objA = bVar.f35540a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = bVar.f35542c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objA);
            bVar.f35542c = 1;
            objA = f35543y.a(this, bVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objA);
        }
        return new g2.h((Bitmap) objA);
    }
}
