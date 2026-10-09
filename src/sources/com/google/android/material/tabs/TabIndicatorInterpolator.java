package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class TabIndicatorInterpolator {
    public static RectF a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.f15534k0 || !(view instanceof TabLayout.TabView)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        TabLayout.TabView tabView = (TabLayout.TabView) view;
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int iD = (int) ViewUtils.d(tabView.getContext(), 24);
        if (contentWidth < iD) {
            contentWidth = iD;
        }
        int right = (tabView.getRight() + tabView.getLeft()) / 2;
        int bottom = (tabView.getBottom() + tabView.getTop()) / 2;
        int i11 = contentWidth / 2;
        return new RectF(right - i11, bottom - (contentHeight / 2), i11 + right, (right / 2) + bottom);
    }

    public void b(TabLayout tabLayout, View view, View view2, float f5, Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        RectF rectFA2 = a(tabLayout, view2);
        drawable.setBounds(AnimationUtils.c((int) rectFA.left, f5, (int) rectFA2.left), drawable.getBounds().top, AnimationUtils.c((int) rectFA.right, f5, (int) rectFA2.right), drawable.getBounds().bottom);
    }
}
