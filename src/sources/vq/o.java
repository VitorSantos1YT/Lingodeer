package vq;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.lingo.lingoskill.widget.SummaryProgressBar;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SummaryProgressBar f54121a;

    public o(SummaryProgressBar summaryProgressBar) {
        this.f54121a = summaryProgressBar;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f5, Transformation transformation) {
        super.applyTransformation(f5, transformation);
        SummaryProgressBar summaryProgressBar = this.f54121a;
        if (f5 >= 1.0f) {
            summaryProgressBar.L = 1.0f;
        } else {
            summaryProgressBar.L = f5;
            summaryProgressBar.postInvalidate();
        }
    }
}
