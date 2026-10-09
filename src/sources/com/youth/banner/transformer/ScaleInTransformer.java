package com.youth.banner.transformer;

import android.view.View;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class ScaleInTransformer extends BasePageTransformer {
    private static final float DEFAULT_MIN_SCALE = 0.85f;
    private float mMinScale;

    public ScaleInTransformer() {
        this.mMinScale = DEFAULT_MIN_SCALE;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View view, float f5) {
        int width = view.getWidth();
        view.setPivotY(view.getHeight() / 2);
        view.setPivotX(width / 2);
        if (f5 < -1.0f) {
            view.setScaleX(this.mMinScale);
            view.setScaleY(this.mMinScale);
            view.setPivotX(width);
            return;
        }
        if (f5 > 1.0f) {
            view.setPivotX(CropImageView.DEFAULT_ASPECT_RATIO);
            view.setScaleX(this.mMinScale);
            view.setScaleY(this.mMinScale);
            return;
        }
        if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
            float f11 = this.mMinScale;
            float f12 = ((1.0f - f11) * (f5 + 1.0f)) + f11;
            view.setScaleX(f12);
            view.setScaleY(f12);
            view.setPivotX((((-f5) * 0.5f) + 0.5f) * width);
            return;
        }
        float f13 = 1.0f - f5;
        float f14 = this.mMinScale;
        float f15 = ((1.0f - f14) * f13) + f14;
        view.setScaleX(f15);
        view.setScaleY(f15);
        view.setPivotX(f13 * 0.5f * width);
    }

    public ScaleInTransformer(float f5) {
        this.mMinScale = f5;
    }
}
