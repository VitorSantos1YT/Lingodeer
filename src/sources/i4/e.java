package i4;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.MotionLabel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MotionLabel f34146b;

    public /* synthetic */ e(MotionLabel motionLabel, int i11) {
        this.f34145a = i11;
        this.f34146b = motionLabel;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f34145a) {
            case 0:
                MotionLabel motionLabel = this.f34146b;
                int width = motionLabel.getWidth();
                int height = motionLabel.getHeight();
                outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * motionLabel.f1332f) / 2.0f);
                break;
            default:
                MotionLabel motionLabel2 = this.f34146b;
                outline.setRoundRect(0, 0, motionLabel2.getWidth(), motionLabel2.getHeight(), motionLabel2.f1347t);
                break;
        }
    }
}
