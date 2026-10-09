package com.google.android.material.carousel;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.media3.ui.PlayerControlView;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.navigation.NavigationBarItemView;
import h9.s;
import h9.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14202b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f14201a = i11;
        this.f14202b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean z11;
        BadgeDrawable badgeDrawable;
        int height;
        int height2;
        switch (this.f14201a) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.f14202b;
                if (i13 - i11 != i17 - i15 || i14 - i12 != i18 - i16) {
                    view.post(new b2.a(carouselLayoutManager, 6));
                }
                break;
            case 1:
                NavigationBarItemView navigationBarItemView = (NavigationBarItemView) this.f14202b;
                View view2 = navigationBarItemView.T;
                ImageView imageView = navigationBarItemView.V;
                if (imageView.getVisibility() == 0 && (badgeDrawable = navigationBarItemView.C0) != null) {
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    badgeDrawable.setBounds(rect);
                    badgeDrawable.j(imageView, null);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) navigationBarItemView.S.getLayoutParams();
                int i19 = (i13 - i11) + layoutParams.rightMargin + layoutParams.leftMargin;
                int i21 = (i14 - i12) + layoutParams.topMargin + layoutParams.bottomMargin;
                boolean z12 = true;
                if (navigationBarItemView.D0 == 1 && navigationBarItemView.f14858x0 == -2) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                    if (navigationBarItemView.f14858x0 != -2 || view2.getMeasuredWidth() == i19) {
                        z11 = false;
                    } else {
                        layoutParams2.width = Math.max(i19, Math.min(navigationBarItemView.f14856v0, navigationBarItemView.getMeasuredWidth() - (navigationBarItemView.A0 * 2)));
                        z11 = true;
                    }
                    if (view2.getMeasuredHeight() < i21) {
                        layoutParams2.height = i21;
                    } else {
                        z12 = z11;
                    }
                    if (z12) {
                        view2.setLayoutParams(layoutParams2);
                    }
                    break;
                }
                break;
            case 2:
                PlayerControlView playerControlView = (PlayerControlView) this.f14202b;
                int i22 = playerControlView.T;
                PopupWindow popupWindow = playerControlView.S;
                int i23 = i14 - i12;
                int i24 = i18 - i16;
                if ((i13 - i11 != i17 - i15 || i23 != i24) && popupWindow.isShowing()) {
                    playerControlView.u();
                    popupWindow.update(view, (playerControlView.getWidth() - popupWindow.getWidth()) - i22, (-popupWindow.getHeight()) - i22, -1, -1);
                }
                break;
            default:
                w wVar = (w) this.f14202b;
                PlayerControlView playerControlView2 = wVar.f32101a;
                int width = (playerControlView2.getWidth() - playerControlView2.getPaddingLeft()) - playerControlView2.getPaddingRight();
                int height3 = (playerControlView2.getHeight() - playerControlView2.getPaddingBottom()) - playerControlView2.getPaddingTop();
                ViewGroup viewGroup = wVar.f32103c;
                int iC = w.c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int iMax = Math.max(iC, w.c(wVar.f32111k) + w.c(wVar.f32109i));
                ViewGroup viewGroup2 = wVar.f32104d;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams4 = viewGroup2.getLayoutParams();
                    if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                boolean z13 = width <= iMax || height3 <= (height2 * 2) + paddingBottom;
                if (wVar.A != z13) {
                    wVar.A = z13;
                    view.post(new s(wVar, 1));
                }
                boolean z14 = i13 - i11 != i17 - i15;
                if (!wVar.A && z14) {
                    view.post(new s(wVar, 2));
                    break;
                }
                break;
        }
    }
}
