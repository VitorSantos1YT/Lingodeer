package h4;

import androidx.constraintlayout.motion.widget.MotionLayout;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f31774a = CropImageView.DEFAULT_ASPECT_RATIO;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f31775b = CropImageView.DEFAULT_ASPECT_RATIO;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f31776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f31777d;

    public t(MotionLayout motionLayout) {
        this.f31777d = motionLayout;
    }

    @Override // h4.r
    public final float a() {
        return this.f31777d.V;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f5) {
        float f11 = this.f31774a;
        MotionLayout motionLayout = this.f31777d;
        if (f11 > CropImageView.DEFAULT_ASPECT_RATIO) {
            float f12 = this.f31776c;
            if (f11 / f12 < f5) {
                f5 = f11 / f12;
            }
            motionLayout.V = f11 - (f12 * f5);
            return ((f11 * f5) - (((f12 * f5) * f5) / 2.0f)) + this.f31775b;
        }
        float f13 = this.f31776c;
        if ((-f11) / f13 < f5) {
            f5 = (-f11) / f13;
        }
        motionLayout.V = (f13 * f5) + f11;
        return (((f13 * f5) * f5) / 2.0f) + (f11 * f5) + this.f31775b;
    }
}
