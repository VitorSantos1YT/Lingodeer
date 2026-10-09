package g2;

import android.graphics.RenderEffect;
import android.graphics.Shader;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {
    public static RenderEffect a(float f5, float f11, int i11) {
        return (f5 == CropImageView.DEFAULT_ASPECT_RATIO && f11 == CropImageView.DEFAULT_ASPECT_RATIO) ? RenderEffect.createOffsetEffect(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO) : RenderEffect.createBlurEffect(f5, f11, f0.D(i11));
    }

    public static Shader.TileMode b() {
        return Shader.TileMode.DECAL;
    }
}
