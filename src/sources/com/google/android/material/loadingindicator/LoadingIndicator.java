package com.google.android.material.loadingindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.progressindicator.AnimatorDurationScaleProvider;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;
import q4.j;
import ra.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class LoadingIndicator extends View implements Drawable.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoadingIndicatorDrawable f14755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LoadingIndicatorSpec f14756b;

    public LoadingIndicator(Context context) {
        this(context, null);
    }

    public final boolean a() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return ProgressBar.class.getName();
    }

    public int getContainerColor() {
        return this.f14756b.f14787e;
    }

    public int getContainerHeight() {
        return this.f14756b.f14785c;
    }

    public int getContainerWidth() {
        return this.f14756b.f14784b;
    }

    public LoadingIndicatorDrawable getDrawable() {
        return this.f14755a;
    }

    public int[] getIndicatorColor() {
        return this.f14756b.f14786d;
    }

    public int getIndicatorSize() {
        return this.f14756b.f14783a;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSave = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingRight() + getPaddingLeft()), getHeight() - (getPaddingBottom() + getPaddingTop()));
        }
        this.f14755a.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        LoadingIndicatorDrawingDelegate loadingIndicatorDrawingDelegate = this.f14755a.f14771d;
        LoadingIndicatorSpec loadingIndicatorSpec = loadingIndicatorDrawingDelegate.f14777a;
        int paddingRight = getPaddingRight() + getPaddingLeft() + Math.max(loadingIndicatorSpec.f14785c, loadingIndicatorSpec.f14783a);
        LoadingIndicatorSpec loadingIndicatorSpec2 = loadingIndicatorDrawingDelegate.f14777a;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + Math.max(loadingIndicatorSpec2.f14784b, loadingIndicatorSpec2.f14783a);
        if (mode == Integer.MIN_VALUE) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(size, paddingRight), 1073741824);
        } else if (mode == 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824);
        }
        if (mode2 == Integer.MIN_VALUE) {
            i12 = View.MeasureSpec.makeMeasureSpec(Math.min(size2, paddingBottom), 1073741824);
        } else if (mode2 == 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824);
        }
        super.onMeasure(i11, i12);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.f14755a.setBounds(0, 0, i11, i12);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        this.f14755a.a(a(), false, i11 == 0);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i11) {
        super.onWindowVisibilityChanged(i11);
        this.f14755a.a(a(), false, i11 == 0);
    }

    public void setAnimatorDurationScaleProvider(AnimatorDurationScaleProvider animatorDurationScaleProvider) {
        this.f14755a.f14768a = animatorDurationScaleProvider;
    }

    public void setContainerColor(int i11) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f14756b;
        if (loadingIndicatorSpec.f14787e != i11) {
            loadingIndicatorSpec.f14787e = i11;
            invalidate();
        }
    }

    public void setContainerHeight(int i11) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f14756b;
        if (loadingIndicatorSpec.f14785c != i11) {
            loadingIndicatorSpec.f14785c = i11;
            requestLayout();
            invalidate();
        }
    }

    public void setContainerWidth(int i11) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f14756b;
        if (loadingIndicatorSpec.f14784b != i11) {
            loadingIndicatorSpec.f14784b = i11;
            requestLayout();
            invalidate();
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{MaterialColors.b(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f14756b.f14786d = iArr;
        LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate = this.f14755a.f14772e;
        loadingIndicatorAnimatorDelegate.f14759a = 1;
        loadingIndicatorAnimatorDelegate.a(CropImageView.DEFAULT_ASPECT_RATIO);
        loadingIndicatorAnimatorDelegate.f14766h.f14780a = loadingIndicatorAnimatorDelegate.f14764f.f14786d[0];
        invalidate();
    }

    public void setIndicatorSize(int i11) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f14756b;
        if (loadingIndicatorSpec.f14783a != i11) {
            loadingIndicatorSpec.f14783a = i11;
            requestLayout();
            invalidate();
        }
    }

    public LoadingIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.loadingIndicatorStyle);
    }

    public LoadingIndicator(Context context, AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.a(context, attributeSet, i11, R.style.Widget_Material3_LoadingIndicator), attributeSet, i11);
        Context context2 = getContext();
        LoadingIndicatorSpec loadingIndicatorSpec = new LoadingIndicatorSpec();
        loadingIndicatorSpec.f14786d = new int[0];
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.m3_loading_indicator_shape_size);
        int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.m3_loading_indicator_container_size);
        ThemeEnforcement.a(context2, attributeSet, i11, R.style.Widget_Material3_LoadingIndicator);
        int[] iArr = com.google.android.material.R.styleable.f13767z;
        ThemeEnforcement.b(context2, attributeSet, iArr, i11, R.style.Widget_Material3_LoadingIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i11, R.style.Widget_Material3_LoadingIndicator);
        loadingIndicatorSpec.f14783a = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        loadingIndicatorSpec.f14784b = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, dimensionPixelSize2);
        loadingIndicatorSpec.f14785c = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize2);
        if (!typedArrayObtainStyledAttributes.hasValue(3)) {
            loadingIndicatorSpec.f14786d = new int[]{MaterialColors.b(context2, R.attr.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(3).type != 1) {
            loadingIndicatorSpec.f14786d = new int[]{typedArrayObtainStyledAttributes.getColor(3, -1)};
        } else {
            int[] intArray = context2.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(3, -1));
            loadingIndicatorSpec.f14786d = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        loadingIndicatorSpec.f14787e = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        LoadingIndicatorDrawingDelegate loadingIndicatorDrawingDelegate = new LoadingIndicatorDrawingDelegate(loadingIndicatorSpec);
        LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate = new LoadingIndicatorAnimatorDelegate();
        loadingIndicatorAnimatorDelegate.f14764f = loadingIndicatorSpec;
        loadingIndicatorAnimatorDelegate.f14766h = new LoadingIndicatorDrawingDelegate.IndicatorState();
        LoadingIndicatorDrawable loadingIndicatorDrawable = new LoadingIndicatorDrawable(context2, loadingIndicatorSpec, loadingIndicatorDrawingDelegate, loadingIndicatorAnimatorDelegate);
        Resources resources = context2.getResources();
        q qVar = new q();
        ThreadLocal threadLocal = j.f47447a;
        qVar.f49000a = resources.getDrawable(R.drawable.ic_mtrl_arrow_circle, null);
        loadingIndicatorDrawable.H = qVar;
        this.f14755a = loadingIndicatorDrawable;
        loadingIndicatorDrawable.setCallback(this);
        this.f14756b = loadingIndicatorDrawable.f14771d.f14777a;
        setAnimatorDurationScaleProvider(new AnimatorDurationScaleProvider());
    }
}
