package kd;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a implements Choreographer.FrameCallback {
    public float H;
    public int K;
    public float L;
    public float M;
    public wc.h N;
    public boolean O;
    public boolean P;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f38093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f38094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f38095f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f38096t;

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f38080b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        a(i());
        j(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j11) {
        boolean z11 = false;
        if (this.O) {
            j(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        wc.h hVar = this.N;
        if (hVar == null || !this.O) {
            return;
        }
        wc.a aVar = wc.d.f54943a;
        long j12 = this.f38095f;
        float fAbs = (j12 != 0 ? j11 - j12 : 0L) / ((1.0E9f / hVar.f54969n) / Math.abs(this.f38093d));
        float f5 = this.f38096t;
        if (i()) {
            fAbs = -fAbs;
        }
        float f11 = f5 + fAbs;
        float fH = h();
        float fG = g();
        PointF pointF = h.f38098a;
        if (f11 >= fH && f11 <= fG) {
            z11 = true;
        }
        float f12 = this.f38096t;
        float fB = h.b(f11, h(), g());
        this.f38096t = fB;
        if (this.P) {
            fB = (float) Math.floor(fB);
        }
        this.H = fB;
        this.f38095f = j11;
        if (z11) {
            if (!this.P || this.f38096t != f12) {
                d();
            }
        } else if (getRepeatCount() == -1 || this.K < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f38094e = !this.f38094e;
                this.f38093d = -this.f38093d;
            } else {
                float fG2 = i() ? g() : h();
                this.f38096t = fG2;
                this.H = fG2;
            }
            this.f38095f = j11;
            if (!this.P || this.f38096t != f12) {
                d();
            }
            Iterator it = this.f38080b.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.K++;
        } else {
            float fH2 = this.f38093d < CropImageView.DEFAULT_ASPECT_RATIO ? h() : g();
            this.f38096t = fH2;
            this.H = fH2;
            j(true);
            if (!this.P || this.f38096t != f12) {
                d();
            }
            a(i());
        }
        if (this.N != null) {
            float f13 = this.H;
            if (f13 < this.L || f13 > this.M) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.L), Float.valueOf(this.M), Float.valueOf(this.H)));
            }
        }
        wc.a aVar2 = wc.d.f54943a;
    }

    public final float f() {
        wc.h hVar = this.N;
        if (hVar == null) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        float f5 = this.H;
        float f11 = hVar.f54968l;
        return (f5 - f11) / (hVar.m - f11);
    }

    public final float g() {
        wc.h hVar = this.N;
        if (hVar == null) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        float f5 = this.M;
        return f5 == 2.1474836E9f ? hVar.m : f5;
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fH;
        float fG;
        float fH2;
        if (this.N == null) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        if (i()) {
            fH = g() - this.H;
            fG = g();
            fH2 = h();
        } else {
            fH = this.H - h();
            fG = g();
            fH2 = h();
        }
        return fH / (fG - fH2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(f());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        wc.h hVar = this.N;
        if (hVar == null) {
            return 0L;
        }
        return (long) hVar.b();
    }

    public final float h() {
        wc.h hVar = this.N;
        if (hVar == null) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        float f5 = this.L;
        return f5 == -2.1474836E9f ? hVar.f54968l : f5;
    }

    public final boolean i() {
        return this.f38093d < CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.O;
    }

    public final void j(boolean z11) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z11) {
            this.O = false;
        }
    }

    public final void k(float f5) {
        if (this.f38096t == f5) {
            return;
        }
        float fB = h.b(f5, h(), g());
        this.f38096t = fB;
        if (this.P) {
            fB = (float) Math.floor(fB);
        }
        this.H = fB;
        this.f38095f = 0L;
        d();
    }

    public final void l(float f5, float f11) {
        if (f5 > f11) {
            throw new IllegalArgumentException("minFrame (" + f5 + ") must be <= maxFrame (" + f11 + ")");
        }
        wc.h hVar = this.N;
        float f12 = hVar == null ? -3.4028235E38f : hVar.f54968l;
        float f13 = hVar == null ? Float.MAX_VALUE : hVar.m;
        float fB = h.b(f5, f12, f13);
        float fB2 = h.b(f11, f12, f13);
        if (fB == this.L && fB2 == this.M) {
            return;
        }
        this.L = fB;
        this.M = fB2;
        k((int) h.b(this.H, fB, fB2));
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i11) {
        super.setRepeatMode(i11);
        if (i11 == 2 || !this.f38094e) {
            return;
        }
        this.f38094e = false;
        this.f38093d = -this.f38093d;
    }
}
