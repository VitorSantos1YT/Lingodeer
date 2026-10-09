package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import com.google.firebase.inappmessaging.display.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.List;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseModalLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f19925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DisplayMetrics f19926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f19927d;

    public BaseModalLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19927d = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.f19751a, 0, 0);
        try {
            this.f19924a = typedArrayObtainStyledAttributes.getFloat(1, -1.0f);
            this.f19925b = typedArrayObtainStyledAttributes.getFloat(0, -1.0f);
            typedArrayObtainStyledAttributes.recycle();
            this.f19926c = context.getResources().getDisplayMetrics();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public static int d(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredHeight();
    }

    public static int e(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredWidth();
    }

    public final int a(int i11) {
        if (getMaxHeightPct() <= CropImageView.DEFAULT_ASPECT_RATIO) {
            return View.MeasureSpec.getSize(i11);
        }
        return Math.round(((int) (getMaxHeightPct() * getDisplayMetrics().heightPixels)) / 4) * 4;
    }

    public final int b(int i11) {
        if (getMaxWidthPct() <= CropImageView.DEFAULT_ASPECT_RATIO) {
            return View.MeasureSpec.getSize(i11);
        }
        return Math.round(((int) (getMaxWidthPct() * getDisplayMetrics().widthPixels)) / 4) * 4;
    }

    public final View c(int i11) {
        View viewFindViewById = findViewById(i11);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalStateException(p.j(i11, "No such child: "));
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.f19926c;
    }

    public float getMaxHeightPct() {
        return this.f19925b;
    }

    public float getMaxWidthPct() {
        return this.f19924a;
    }

    public List<View> getVisibleChildren() {
        return this.f19927d;
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i11, int i12, int i13, int i14) {
        view.getMeasuredWidth();
        view.getMeasuredHeight();
        super.measureChildWithMargins(view, i11, i12, i13, i14);
        view.getMeasuredWidth();
        view.getMeasuredHeight();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        int i13 = getDisplayMetrics().widthPixels;
        int i14 = getDisplayMetrics().heightPixels;
        ArrayList arrayList = this.f19927d;
        arrayList.clear();
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                arrayList.add(childAt);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }
}
