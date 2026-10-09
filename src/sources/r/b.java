package r;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f48530b;

    public /* synthetic */ b(ActionBarOverlayLayout actionBarOverlayLayout, int i11) {
        this.f48529a = i11;
        this.f48530b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f48529a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f48530b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.f866b0 = actionBarOverlayLayout.f869d.animate().translationY(CropImageView.DEFAULT_ASPECT_RATIO).setListener(actionBarOverlayLayout.f868c0);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f48530b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.f866b0 = actionBarOverlayLayout2.f869d.animate().translationY(-actionBarOverlayLayout2.f869d.getHeight()).setListener(actionBarOverlayLayout2.f868c0);
                break;
        }
    }
}
