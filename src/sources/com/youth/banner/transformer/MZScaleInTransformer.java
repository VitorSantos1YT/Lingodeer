package com.youth.banner.transformer;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class MZScaleInTransformer extends BasePageTransformer {
    private static final float DEFAULT_MIN_SCALE = 0.85f;
    private float mMinScale;

    public MZScaleInTransformer() {
        this.mMinScale = DEFAULT_MIN_SCALE;
    }

    private ViewPager2 requireViewPager(View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            return (ViewPager2) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View view, float f5) {
        ViewPager2 viewPager2RequireViewPager = requireViewPager(view);
        float paddingLeft = viewPager2RequireViewPager.getPaddingLeft();
        float measuredWidth = f5 - (paddingLeft / ((viewPager2RequireViewPager.getMeasuredWidth() - paddingLeft) - viewPager2RequireViewPager.getPaddingRight()));
        float width = view.getWidth();
        float f11 = this.mMinScale;
        float f12 = ((1.0f - f11) * width) / 2.0f;
        if (measuredWidth <= -1.0f) {
            view.setTranslationX(f12);
            view.setScaleX(this.mMinScale);
            view.setScaleY(this.mMinScale);
            return;
        }
        double d5 = measuredWidth;
        if (d5 > 1.0d) {
            view.setScaleX(f11);
            view.setScaleY(this.mMinScale);
            view.setTranslationX(-f12);
            return;
        }
        float fAbs = Math.abs(1.0f - Math.abs(measuredWidth)) * (1.0f - f11);
        float f13 = (-f12) * measuredWidth;
        if (d5 <= -0.5d) {
            view.setTranslationX((Math.abs(Math.abs(measuredWidth) - 0.5f) / 0.5f) + f13);
        } else if (measuredWidth > CropImageView.DEFAULT_ASPECT_RATIO && d5 >= 0.5d) {
            view.setTranslationX(f13 - (Math.abs(Math.abs(measuredWidth) - 0.5f) / 0.5f));
        } else {
            view.setTranslationX(f13);
        }
        view.setScaleX(this.mMinScale + fAbs);
        view.setScaleY(fAbs + this.mMinScale);
    }

    public MZScaleInTransformer(float f5) {
        this.mMinScale = f5;
    }
}
