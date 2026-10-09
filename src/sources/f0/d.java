package f0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f26224a = c.f26208a;

    default float a(float f5, float f11, float f12) {
        f26224a.getClass();
        float f13 = f11 + f5;
        if ((f5 >= CropImageView.DEFAULT_ASPECT_RATIO && f13 <= f12) || (f5 < CropImageView.DEFAULT_ASPECT_RATIO && f13 > f12)) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        float f14 = f13 - f12;
        return Math.abs(f5) < Math.abs(f14) ? f5 : f14;
    }
}
