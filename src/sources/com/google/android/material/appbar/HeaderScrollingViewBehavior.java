package com.google.android.material.appbar;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.search.SearchBar;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import l4.e;
import ue.f;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f13854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f13855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13857f;

    public HeaderScrollingViewBehavior() {
        this.f13854c = new Rect();
        this.f13855d = new Rect();
        this.f13856e = 0;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public final void A(CoordinatorLayout coordinatorLayout, View view, int i11) {
        AppBarLayout appBarLayoutC = C(coordinatorLayout.o(view));
        int iN = 0;
        if (appBarLayoutC == null) {
            coordinatorLayout.u(view, i11);
            this.f13856e = 0;
            return;
        }
        e eVar = (e) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int bottom = appBarLayoutC.getBottom() + ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int bottom2 = ((appBarLayoutC.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
        Rect rect = this.f13854c;
        rect.set(paddingLeft, bottom, width, bottom2);
        v1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left = lastWindowInsets.b() + rect.left;
            rect.right -= lastWindowInsets.c();
        }
        int i12 = eVar.f39718c;
        if (i12 == 0) {
            i12 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.f13855d;
        Gravity.apply(i12, measuredWidth, measuredHeight, rect, rect2, i11);
        if (this.f13857f != 0) {
            float fD = D(appBarLayoutC);
            int i13 = this.f13857f;
            iN = f.n((int) (fD * i13), 0, i13);
        }
        view.layout(rect2.left, rect2.top - iN, rect2.right, rect2.bottom - iN);
        this.f13856e = rect2.top - appBarLayoutC.getBottom();
    }

    public abstract AppBarLayout C(ArrayList arrayList);

    public float D(View view) {
        return 1.0f;
    }

    public int E(View view) {
        return view.getMeasuredHeight();
    }

    @Override // l4.b
    public boolean o(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13) {
        AppBarLayout appBarLayoutC;
        v1 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (appBarLayoutC = C(coordinatorLayout.o(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i13);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (appBarLayoutC.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.a() + lastWindowInsets.d();
        }
        int iE = size + E(appBarLayoutC);
        int measuredHeight = appBarLayoutC.getMeasuredHeight();
        if (this instanceof SearchBar.ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
            iE -= measuredHeight;
        }
        coordinatorLayout.v(i11, i12, View.MeasureSpec.makeMeasureSpec(iE, i14 == -1 ? 1073741824 : Integer.MIN_VALUE), view);
        return true;
    }

    public HeaderScrollingViewBehavior(int i11) {
        super(0);
        this.f13854c = new Rect();
        this.f13855d = new Rect();
        this.f13856e = 0;
    }
}
