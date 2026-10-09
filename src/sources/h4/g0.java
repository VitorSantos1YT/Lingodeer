package h4;

import android.graphics.Rect;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f31661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31662d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a9.i f31664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Interpolator f31665g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f31667i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f31668j;
    public final boolean m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c4.e f31663e = new c4.e(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f31666h = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f31670l = new Rect();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f31669k = System.nanoTime();

    public g0(a9.i iVar, q qVar, int i11, int i12, int i13, Interpolator interpolator, int i14, int i15) {
        this.m = false;
        this.f31664f = iVar;
        this.f31661c = qVar;
        this.f31662d = i12;
        if (((ArrayList) iVar.f520d) == null) {
            iVar.f520d = new ArrayList();
        }
        ((ArrayList) iVar.f520d).add(this);
        this.f31665g = interpolator;
        this.f31659a = i14;
        this.f31660b = i15;
        if (i13 == 3) {
            this.m = true;
        }
        this.f31668j = i11 == 0 ? Float.MAX_VALUE : 1.0f / i11;
        a();
    }

    public final void a() {
        boolean z11 = this.f31666h;
        int i11 = this.f31660b;
        int i12 = this.f31659a;
        Interpolator interpolator = this.f31665g;
        a9.i iVar = this.f31664f;
        q qVar = this.f31661c;
        if (z11) {
            long jNanoTime = System.nanoTime();
            long j11 = jNanoTime - this.f31669k;
            this.f31669k = jNanoTime;
            float f5 = this.f31667i - (((float) (j11 * 1.0E-6d)) * this.f31668j);
            this.f31667i = f5;
            if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
                this.f31667i = CropImageView.DEFAULT_ASPECT_RATIO;
            }
            boolean zF = qVar.f(interpolator == null ? this.f31667i : interpolator.getInterpolation(this.f31667i), jNanoTime, qVar.f31748b, this.f31663e);
            if (this.f31667i <= CropImageView.DEFAULT_ASPECT_RATIO) {
                if (i12 != -1) {
                    qVar.f31748b.setTag(i12, Long.valueOf(System.nanoTime()));
                }
                if (i11 != -1) {
                    qVar.f31748b.setTag(i11, null);
                }
                ((ArrayList) iVar.f521e).add(this);
            }
            if (this.f31667i > CropImageView.DEFAULT_ASPECT_RATIO || zF) {
                ((MotionLayout) iVar.f517a).invalidate();
                return;
            }
            return;
        }
        long jNanoTime2 = System.nanoTime();
        long j12 = jNanoTime2 - this.f31669k;
        this.f31669k = jNanoTime2;
        float f11 = (((float) (j12 * 1.0E-6d)) * this.f31668j) + this.f31667i;
        this.f31667i = f11;
        if (f11 >= 1.0f) {
            this.f31667i = 1.0f;
        }
        boolean zF2 = qVar.f(interpolator == null ? this.f31667i : interpolator.getInterpolation(this.f31667i), jNanoTime2, qVar.f31748b, this.f31663e);
        if (this.f31667i >= 1.0f) {
            if (i12 != -1) {
                qVar.f31748b.setTag(i12, Long.valueOf(System.nanoTime()));
            }
            if (i11 != -1) {
                qVar.f31748b.setTag(i11, null);
            }
            if (!this.m) {
                ((ArrayList) iVar.f521e).add(this);
            }
        }
        if (this.f31667i < 1.0f || zF2) {
            ((MotionLayout) iVar.f517a).invalidate();
        }
    }

    public final void b() {
        this.f31666h = true;
        int i11 = this.f31662d;
        if (i11 != -1) {
            this.f31668j = i11 == 0 ? Float.MAX_VALUE : 1.0f / i11;
        }
        ((MotionLayout) this.f31664f.f517a).invalidate();
        this.f31669k = System.nanoTime();
    }
}
