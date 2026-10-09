package d0;

import android.content.Context;
import android.widget.EdgeEffect;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends EdgeEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f22775b;

    public p0(Context context) {
        super(context);
        this.f22774a = com.bumptech.glide.e.a(context).f53486a * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i11) {
        this.f22775b = CropImageView.DEFAULT_ASPECT_RATIO;
        super.onAbsorb(i11);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f5, float f11) {
        this.f22775b = CropImageView.DEFAULT_ASPECT_RATIO;
        super.onPull(f5, f11);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f22775b = CropImageView.DEFAULT_ASPECT_RATIO;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f5) {
        this.f22775b = CropImageView.DEFAULT_ASPECT_RATIO;
        super.onPull(f5);
    }
}
