package f0;

import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c2 f26305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d0.i f26306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t0 f26307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h1 f26308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f26309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r2.d f26310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f26311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final cr.n f26312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f26313i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f26314j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public n1 f26315k = u1.f26445b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g2 f26316l = new g2(this);
    public final com.google.firebase.datastorage.a m = new com.google.firebase.datastorage.a(this, 21);

    public i2(c2 c2Var, d0.i iVar, t0 t0Var, h1 h1Var, boolean z11, r2.d dVar, b2 b2Var, cr.n nVar) {
        this.f26305a = c2Var;
        this.f26306b = iVar;
        this.f26307c = t0Var;
        this.f26308d = h1Var;
        this.f26309e = z11;
        this.f26310f = dVar;
        this.f26311g = b2Var;
        this.f26312h = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j11, xy.c cVar) throws Throwable {
        d2 d2Var;
        i2 i2Var;
        Throwable th2;
        kotlin.jvm.internal.x xVar;
        if (cVar instanceof d2) {
            d2Var = (d2) cVar;
            int i11 = d2Var.f26239d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                d2Var.f26239d = i11 - Integer.MIN_VALUE;
            } else {
                d2Var = new d2(this, cVar);
            }
        } else {
            d2Var = new d2(this, cVar);
        }
        Object obj = d2Var.f26237b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = d2Var.f26239d;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xVar = d2Var.f26236a;
            try {
                com.bumptech.glide.e.F(obj);
                i2Var = this;
                i2Var.f26313i = false;
                return new v3.q(xVar.f38360a);
            } catch (Throwable th3) {
                th2 = th3;
                i2Var = this;
                i2Var.f26313i = false;
                throw th2;
            }
        }
        com.bumptech.glide.e.F(obj);
        kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
        xVar2.f38360a = j11;
        this.f26313i = true;
        try {
            d0.l1 l1Var = d0.l1.Default;
            i2Var = this;
            try {
                f2 f2Var = new f2(i2Var, xVar2, j11, null);
                d2Var.f26236a = xVar2;
                d2Var.f26239d = 1;
                if (f(l1Var, f2Var, d2Var) == aVar) {
                    return aVar;
                }
                xVar = xVar2;
                i2Var.f26313i = false;
                return new v3.q(xVar.f38360a);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                i2Var.f26313i = false;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            i2Var = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:23:0x0053 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x000d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public final Object b(long j11, boolean z11, xy.i iVar) {
        int i11;
        long jA;
        h2 h2Var;
        int i12;
        d0.i iVar2;
        Object objInvokeSuspend;
        qy.b0 b0Var = qy.b0.f48488a;
        if (z11) {
            t0 t0Var = this.f26307c;
            dv.e eVar = u1.f26444a;
            if (!(t0Var instanceof l)) {
                if (this.f26308d == h1.Horizontal) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                jA = v3.q.a(j11, i11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                i12 = 0;
                h2Var = new h2(this, null, i12);
                iVar2 = this.f26306b;
                if (iVar2 == null && (this.f26305a.d() || this.f26305a.c())) {
                    Object objB = iVar2.b(jA, h2Var, iVar);
                    if (objB == wy.a.COROUTINE_SUSPENDED) {
                        return objB;
                    }
                } else {
                    h2 h2Var2 = new h2((i2) h2Var.f26294e, iVar, i12);
                    h2Var2.f26292c = jA;
                    objInvokeSuspend = h2Var2.invokeSuspend(b0Var);
                    if (objInvokeSuspend == wy.a.COROUTINE_SUSPENDED) {
                        return objInvokeSuspend;
                    }
                }
            }
        } else {
            if (this.f26308d == h1.Horizontal) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            jA = v3.q.a(j11, i11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
            i12 = 0;
            h2Var = new h2(this, null, i12);
            iVar2 = this.f26306b;
            if (iVar2 == null) {
                h2 h2Var3 = new h2((i2) h2Var.f26294e, iVar, i12);
                h2Var3.f26292c = jA;
                objInvokeSuspend = h2Var3.invokeSuspend(b0Var);
                if (objInvokeSuspend == wy.a.COROUTINE_SUSPENDED) {
                    return objInvokeSuspend;
                }
            } else {
                h2 h2Var4 = new h2((i2) h2Var.f26294e, iVar, i12);
                h2Var4.f26292c = jA;
                objInvokeSuspend = h2Var4.invokeSuspend(b0Var);
                if (objInvokeSuspend == wy.a.COROUTINE_SUSPENDED) {
                    return objInvokeSuspend;
                }
            }
        }
        return b0Var;
    }

    public final long c(n1 n1Var, long j11, int i11) {
        r2.i iVar = this.f26310f.f48749a;
        r2.i iVar2 = null;
        r2.i iVar3 = (iVar == null || !iVar.P) ? null : (r2.i) y2.f.j(iVar);
        long jM = iVar3 != null ? iVar3.M(i11, j11) : 0L;
        long jG = f2.b.g(j11, jM);
        long jE = e(h(n1Var.a(g(e(this.f26308d == h1.Horizontal ? f2.b.a(CropImageView.DEFAULT_ASPECT_RATIO, 1, jG) : f2.b.a(CropImageView.DEFAULT_ASPECT_RATIO, 2, jG))))));
        b2 b2Var = this.f26311g;
        if (b2Var.P) {
            ViewTreeObserver viewTreeObserver = ((AndroidComposeView) y2.f.y(b2Var)).getViewTreeObserver();
            try {
                if (AndroidComposeView.f1156q1 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    AndroidComposeView.f1156q1 = declaredMethod;
                }
                Method method = AndroidComposeView.f1156q1;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long jG2 = f2.b.g(jG, jE);
        r2.i iVar4 = this.f26310f.f48749a;
        if (iVar4 != null && iVar4.P) {
            iVar2 = (r2.i) y2.f.j(iVar4);
        }
        r2.i iVar5 = iVar2;
        return f2.b.h(f2.b.h(jM, jE), iVar5 != null ? iVar5.x(jE, i11, jG2) : 0L);
    }

    public final float d(float f5) {
        return this.f26309e ? f5 * (-1) : f5;
    }

    public final long e(long j11) {
        return this.f26309e ? f2.b.i(j11, -1.0f) : j11;
    }

    public final Object f(d0.l1 l1Var, fz.e eVar, xy.c cVar) {
        Object objA = this.f26305a.a(l1Var, new a0.e0(26, this, eVar, (vy.d) null), cVar);
        return objA == wy.a.COROUTINE_SUSPENDED ? objA : qy.b0.f48488a;
    }

    public final float g(long j11) {
        return Float.intBitsToFloat((int) (this.f26308d == h1.Horizontal ? j11 >> 32 : j11 & 4294967295L));
    }

    public final long h(float f5) {
        long jFloatToRawIntBits;
        long j11;
        if (f5 == CropImageView.DEFAULT_ASPECT_RATIO) {
            return 0L;
        }
        if (this.f26308d == h1.Horizontal) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f5);
            jFloatToRawIntBits = Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO);
            j11 = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO);
            jFloatToRawIntBits = Float.floatToRawIntBits(f5);
            j11 = jFloatToRawIntBits3 << 32;
        }
        return j11 | (jFloatToRawIntBits & 4294967295L);
    }
}
