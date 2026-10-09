package com.youth.banner.transformer;

import android.view.View;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class AlphaPageTransformer extends BasePageTransformer {
    private static final float DEFAULT_MIN_ALPHA = 0.5f;
    private float mMinAlpha;

    public AlphaPageTransformer() {
        this.mMinAlpha = 0.5f;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View view, float f5) {
        view.setScaleX(0.999f);
        if (f5 < -1.0f) {
            view.setAlpha(this.mMinAlpha);
            return;
        }
        if (f5 > 1.0f) {
            view.setAlpha(this.mMinAlpha);
            return;
        }
        if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
            float f11 = this.mMinAlpha;
            view.setAlpha(((f5 + 1.0f) * (1.0f - f11)) + f11);
        } else {
            float f12 = this.mMinAlpha;
            view.setAlpha(((1.0f - f5) * (1.0f - f12)) + f12);
        }
    }

    public AlphaPageTransformer(float f5) {
        this.mMinAlpha = f5;
    }
}
