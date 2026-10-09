package h1;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.layer.ViewLayer;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l5 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30596a;

    public /* synthetic */ l5(int i11) {
        this.f30596a = i11;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f30596a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                return;
            case 1:
                if (!(view instanceof ViewLayer) || (outline2 = ((ViewLayer) view).f1139e) == null) {
                    return;
                }
                outline.set(outline2);
                return;
            case 2:
                kotlin.jvm.internal.m.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                throw null;
            case 3:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                return;
            default:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                return;
        }
    }
}
