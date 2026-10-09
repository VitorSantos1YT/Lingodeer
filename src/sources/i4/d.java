package i4;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.MotionButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MotionButton f34144b;

    public /* synthetic */ d(MotionButton motionButton, int i11) {
        this.f34143a = i11;
        this.f34144b = motionButton;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f34143a) {
            case 0:
                MotionButton motionButton = this.f34144b;
                int width = motionButton.getWidth();
                int height = motionButton.getHeight();
                outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * motionButton.f1318d) / 2.0f);
                break;
            default:
                MotionButton motionButton2 = this.f34144b;
                outline.setRoundRect(0, 0, motionButton2.getWidth(), motionButton2.getHeight(), motionButton2.f1319e);
                break;
        }
    }
}
