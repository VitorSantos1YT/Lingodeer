package s2;

import androidx.compose.ui.input.pointer.CancelTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import com.yalantis.ucrop.view.CropImageView;
import f0.k2;
import rz.z1;
import z2.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements b, v3.c, vy.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f51322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rz.m f51323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rz.m f51324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f51325d = m.Main;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vy.j f51326e = vy.j.f54321a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0 f51327f;

    public k0(m0 m0Var, rz.m mVar) {
        this.f51327f = m0Var;
        this.f51322a = m0Var;
        this.f51323b = mVar;
    }

    @Override // v3.c
    public final long I(int i11) {
        return this.f51322a.I(i11);
    }

    @Override // v3.c
    public final long K(float f5) {
        return this.f51322a.K(f5);
    }

    @Override // v3.c
    public final float Q(int i11) {
        return this.f51322a.Q(i11);
    }

    @Override // v3.c
    public final float T(float f5) {
        return f5 / this.f51322a.getDensity();
    }

    @Override // v3.c
    public final float Z() {
        return this.f51322a.Z();
    }

    public final Object b(m mVar, xy.a aVar) {
        rz.m mVar2 = new rz.m(1, ue.f.x(aVar));
        mVar2.s();
        this.f51325d = mVar;
        this.f51324c = mVar2;
        Object objR = mVar2.r();
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        return objR;
    }

    public final long c() {
        m0 m0Var = this.f51327f;
        m0Var.getClass();
        long jV0 = m0Var.v0(y2.f.x(m0Var).f56885d0.e());
        long j11 = m0Var.f51335b0;
        return (((long) Float.floatToRawIntBits(Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (jV0 >> 32)) - ((int) (j11 >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (jV0 & 4294967295L)) - ((int) (j11 & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    public final p2 e() {
        m0 m0Var = this.f51327f;
        m0Var.getClass();
        return y2.f.x(m0Var).f56885d0;
    }

    @Override // v3.c
    public final float e0(float f5) {
        return this.f51322a.getDensity() * f5;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(long j11, fz.e eVar, xy.c cVar) throws Throwable {
        i0 i0Var;
        z1 z1VarB;
        Throwable th2;
        rz.m mVar;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i11 = i0Var.f51308d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                i0Var.f51308d = i11 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(this, cVar);
            }
        } else {
            i0Var = new i0(this, cVar);
        }
        Object objInvoke = i0Var.f51306b;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = i0Var.f51308d;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z1VarB = i0Var.f51305a;
            try {
                com.bumptech.glide.e.F(objInvoke);
                z1VarB.cancel(CancelTimeoutCancellationException.f1143a);
                return objInvoke;
            } catch (Throwable th3) {
                th2 = th3;
                z1VarB.cancel(CancelTimeoutCancellationException.f1143a);
                throw th2;
            }
        }
        com.bumptech.glide.e.F(objInvoke);
        if (j11 <= 0 && (mVar = this.f51324c) != null) {
            mVar.resumeWith(com.bumptech.glide.e.l(new PointerEventTimeoutCancellationException(j11)));
        }
        z1VarB = rz.e0.B(this.f51327f.H0(), null, null, new ar.b(j11, this, (vy.d) null, 7), 3);
        try {
            i0Var.f51305a = z1VarB;
            i0Var.f51308d = 1;
            objInvoke = eVar.invoke(this, i0Var);
            if (objInvoke == obj) {
                return obj;
            }
            z1VarB.cancel(CancelTimeoutCancellationException.f1143a);
            return objInvoke;
        } catch (Throwable th4) {
            th2 = th4;
            z1VarB.cancel(CancelTimeoutCancellationException.f1143a);
            throw th2;
        }
    }

    @Override // vy.d
    public final vy.i getContext() {
        return this.f51326e;
    }

    @Override // v3.c
    public final float getDensity() {
        return this.f51322a.getDensity();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(long j11, k2 k2Var, xy.a aVar) throws Throwable {
        j0 j0Var;
        if (aVar instanceof j0) {
            j0Var = (j0) aVar;
            int i11 = j0Var.f51319c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                j0Var.f51319c = i11 - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(this, aVar);
            }
        } else {
            j0Var = new j0(this, aVar);
        }
        Object obj = j0Var.f51317a;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = j0Var.f51319c;
        try {
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                return obj;
            }
            com.bumptech.glide.e.F(obj);
            j0Var.f51319c = 1;
            Object objF = f(j11, k2Var, j0Var);
            return objF == obj2 ? obj2 : objF;
        } catch (PointerEventTimeoutCancellationException unused) {
            return null;
        }
    }

    @Override // v3.c
    public final int k0(long j11) {
        return this.f51322a.k0(j11);
    }

    @Override // v3.c
    public final long n(float f5) {
        return this.f51322a.n(f5);
    }

    @Override // v3.c
    public final int n0(float f5) {
        return this.f51322a.n0(f5);
    }

    @Override // v3.c
    public final long o(long j11) {
        return this.f51322a.o(j11);
    }

    @Override // vy.d
    public final void resumeWith(Object obj) {
        m0 m0Var = this.f51327f;
        synchronized (m0Var.Y) {
            m0Var.X.k(this);
        }
        this.f51323b.resumeWith(obj);
    }

    @Override // v3.c
    public final long v0(long j11) {
        return this.f51322a.v0(j11);
    }

    @Override // v3.c
    public final float w(long j11) {
        return this.f51322a.w(j11);
    }

    @Override // v3.c
    public final float y0(long j11) {
        return this.f51322a.y0(j11);
    }
}
