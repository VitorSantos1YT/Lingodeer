package com.youth.banner.transformer;

import android.view.View;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class RotateDownPageTransformer extends BasePageTransformer {
    private static final float DEFAULT_MAX_ROTATE = 15.0f;
    private float mMaxRotate;

    public RotateDownPageTransformer() {
        this.mMaxRotate = DEFAULT_MAX_ROTATE;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View view, float f5) {
        if (f5 < -1.0f) {
            view.setRotation(this.mMaxRotate * (-1.0f));
            view.setPivotX(view.getWidth());
            view.setPivotY(view.getHeight());
            return;
        }
        if (f5 > 1.0f) {
            view.setRotation(this.mMaxRotate);
            view.getWidth();
            view.setPivotX(0);
            view.setPivotY(view.getHeight());
            return;
        }
        if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
            view.setPivotX((((-f5) * 0.5f) + 0.5f) * view.getWidth());
            view.setPivotY(view.getHeight());
            view.setRotation(this.mMaxRotate * f5);
            return;
        }
        view.setPivotX((1.0f - f5) * view.getWidth() * 0.5f);
        view.setPivotY(view.getHeight());
        view.setRotation(this.mMaxRotate * f5);
    }

    public RotateDownPageTransformer(float f5) {
        this.mMaxRotate = f5;
    }
}
