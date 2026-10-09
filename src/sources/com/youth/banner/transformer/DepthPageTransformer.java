package com.youth.banner.transformer;

import android.view.View;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class DepthPageTransformer extends BasePageTransformer {
    private static final float DEFAULT_MIN_SCALE = 0.75f;
    private float mMinScale;

    public DepthPageTransformer() {
        this.mMinScale = DEFAULT_MIN_SCALE;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View view, float f5) {
        int width = view.getWidth();
        if (f5 < -1.0f) {
            view.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
            return;
        }
        if (f5 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            view.setAlpha(1.0f);
            view.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            return;
        }
        if (f5 > 1.0f) {
            view.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
            return;
        }
        view.setVisibility(0);
        view.setAlpha(1.0f - f5);
        view.setTranslationX(width * (-f5));
        float f11 = this.mMinScale;
        float fAbs = ((1.0f - Math.abs(f5)) * (1.0f - f11)) + f11;
        view.setScaleX(fAbs);
        view.setScaleY(fAbs);
        if (f5 == 1.0f) {
            view.setVisibility(4);
        }
    }

    public DepthPageTransformer(float f5) {
        this.mMinScale = f5;
    }
}
