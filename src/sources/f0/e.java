package f0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d {
    @Override // f0.d
    public final float a(float f5, float f11, float f12) {
        float fAbs = Math.abs((f11 + f5) - f5);
        boolean z11 = fAbs <= f12;
        float f13 = (0.3f * f12) - (CropImageView.DEFAULT_ASPECT_RATIO * fAbs);
        float f14 = f12 - f13;
        if (z11 && f14 < fAbs) {
            f13 = f12 - fAbs;
        }
        return f5 - f13;
    }
}
