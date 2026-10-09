package com.youth.banner.transformer;

import android.view.View;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class ZoomOutPageTransformer extends BasePageTransformer {
    private static final float DEFAULT_MIN_ALPHA = 0.5f;
    private static final float DEFAULT_MIN_SCALE = 0.85f;
    private float mMinAlpha;
    private float mMinScale;

    public ZoomOutPageTransformer() {
        this.mMinScale = DEFAULT_MIN_SCALE;
        this.mMinAlpha = 0.5f;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View view, float f5) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (f5 < -1.0f) {
            view.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
            return;
        }
        if (f5 > 1.0f) {
            view.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
            return;
        }
        float fMax = Math.max(this.mMinScale, 1.0f - Math.abs(f5));
        float f11 = 1.0f - fMax;
        float f12 = (height * f11) / 2.0f;
        float f13 = (width * f11) / 2.0f;
        if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
            view.setTranslationX(f13 - (f12 / 2.0f));
        } else {
            view.setTranslationX((f12 / 2.0f) + (-f13));
        }
        view.setScaleX(fMax);
        view.setScaleY(fMax);
        float f14 = this.mMinAlpha;
        float f15 = this.mMinScale;
        view.setAlpha(((1.0f - f14) * ((fMax - f15) / (1.0f - f15))) + f14);
    }

    public ZoomOutPageTransformer(float f5, float f11) {
        this.mMinScale = f5;
        this.mMinAlpha = f11;
    }
}
