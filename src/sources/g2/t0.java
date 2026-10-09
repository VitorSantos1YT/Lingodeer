package g2;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements v3.c {
    public long H;
    public long K;
    public float L;
    public float M;
    public long N;
    public w0 O;
    public boolean P;
    public long Q;
    public v3.c R;
    public v3.m S;
    public s T;
    public int U;
    public f0 V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f28601b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f28602c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f28603d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f28604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f28605f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f28606t;

    public t0() {
        long j11 = g0.f28566a;
        this.H = j11;
        this.K = j11;
        this.M = 8.0f;
        this.N = z0.f28631b;
        this.O = f0.f28556b;
        this.Q = 9205357640488583168L;
        this.R = com.bumptech.glide.g.a();
        this.S = v3.m.Ltr;
        this.U = 3;
    }

    @Override // v3.c
    public final float Z() {
        return this.R.Z();
    }

    public final void a() {
        h(1.0f);
        i(1.0f);
        b(1.0f);
        q(CropImageView.DEFAULT_ASPECT_RATIO);
        r(CropImageView.DEFAULT_ASPECT_RATIO);
        k(CropImageView.DEFAULT_ASPECT_RATIO);
        long j11 = g0.f28566a;
        c(j11);
        m(j11);
        if (this.L != CropImageView.DEFAULT_ASPECT_RATIO) {
            this.f28600a |= 1024;
            this.L = CropImageView.DEFAULT_ASPECT_RATIO;
        }
        if (this.M != 8.0f) {
            this.f28600a |= 2048;
            this.M = 8.0f;
        }
        p(z0.f28631b);
        l(f0.f28556b);
        e(false);
        f(null);
        if (this.U != 3) {
            this.f28600a |= 524288;
            this.U = 3;
        }
        this.Q = 9205357640488583168L;
        this.V = null;
        this.f28600a = 0;
    }

    public final void b(float f5) {
        if (this.f28603d == f5) {
            return;
        }
        this.f28600a |= 4;
        this.f28603d = f5;
    }

    public final void c(long j11) {
        if (x.d(this.H, j11)) {
            return;
        }
        this.f28600a |= 64;
        this.H = j11;
    }

    public final void e(boolean z11) {
        if (this.P != z11) {
            this.f28600a |= 16384;
            this.P = z11;
        }
    }

    public final void f(s sVar) {
        if (kotlin.jvm.internal.m.a(this.T, sVar)) {
            return;
        }
        this.f28600a |= OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
        this.T = sVar;
    }

    @Override // v3.c
    public final float getDensity() {
        return this.R.getDensity();
    }

    public final void h(float f5) {
        if (this.f28601b == f5) {
            return;
        }
        this.f28600a |= 1;
        this.f28601b = f5;
    }

    public final void i(float f5) {
        if (this.f28602c == f5) {
            return;
        }
        this.f28600a |= 2;
        this.f28602c = f5;
    }

    public final void k(float f5) {
        if (this.f28606t == f5) {
            return;
        }
        this.f28600a |= 32;
        this.f28606t = f5;
    }

    public final void l(w0 w0Var) {
        if (kotlin.jvm.internal.m.a(this.O, w0Var)) {
            return;
        }
        this.f28600a |= OSSConstants.DEFAULT_BUFFER_SIZE;
        this.O = w0Var;
    }

    public final void m(long j11) {
        if (x.d(this.K, j11)) {
            return;
        }
        this.f28600a |= 128;
        this.K = j11;
    }

    public final void p(long j11) {
        if (z0.a(this.N, j11)) {
            return;
        }
        this.f28600a |= 4096;
        this.N = j11;
    }

    public final void q(float f5) {
        if (this.f28604e == f5) {
            return;
        }
        this.f28600a |= 8;
        this.f28604e = f5;
    }

    public final void r(float f5) {
        if (this.f28605f == f5) {
            return;
        }
        this.f28600a |= 16;
        this.f28605f = f5;
    }
}
