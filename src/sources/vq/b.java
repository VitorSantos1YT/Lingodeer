package vq;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.lingo.lingoskill.widget.CircularProgressBar3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CircularProgressBar3 f54093a;

    public b(CircularProgressBar3 circularProgressBar3) {
        this.f54093a = circularProgressBar3;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f5, Transformation transformation) {
        super.applyTransformation(f5, transformation);
        CircularProgressBar3 circularProgressBar3 = this.f54093a;
        if (f5 >= 1.0f) {
            circularProgressBar3.K = 1.0f;
        } else {
            circularProgressBar3.K = f5;
            circularProgressBar3.postInvalidate();
        }
    }
}
