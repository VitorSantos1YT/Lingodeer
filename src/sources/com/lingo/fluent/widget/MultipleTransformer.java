package com.lingo.fluent.widget;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MultipleTransformer implements ViewPager2.PageTransformer {
    public static final int $stable = 8;
    private final float distance;
    private final ViewPager2 mViewPager;

    public MultipleTransformer(ViewPager2 mViewPager, float f5) {
        m.f(mViewPager, "mViewPager");
        this.mViewPager = mViewPager;
        this.distance = f5;
        mViewPager.setOffscreenPageLimit(3);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View page, float f5) {
        m.f(page, "page");
        float left = (page.getLeft() - (this.mViewPager.getPaddingLeft() + this.mViewPager.getScrollX())) / ((this.mViewPager.getMeasuredWidth() - this.mViewPager.getPaddingLeft()) - this.mViewPager.getPaddingRight());
        float f11 = 1;
        page.setAlpha(Math.abs(Math.abs(left) - f11) + 0.5f);
        if (left < -1.0f) {
            page.setScaleX(0.9f);
            page.setScaleY(0.9f);
            page.setAlpha(1.0f);
            page.setTranslationX(this.distance);
            return;
        }
        if (left > 1.0f) {
            page.setScaleX(0.9f);
            page.setScaleY(0.9f);
            page.setAlpha(1.0f);
            page.setTranslationX(-this.distance);
            return;
        }
        float fAbs = ((f11 - Math.abs(left)) * 0.100000024f) + 0.9f;
        page.setScaleX(fAbs);
        page.setScaleY(fAbs);
        page.setAlpha(1.0f);
        page.setTranslationX(left * (-this.distance));
    }
}
