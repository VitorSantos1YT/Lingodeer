package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import com.google.android.material.internal.ThemeEnforcement;
import com.lingodeer.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface IndeterminateAnimationType {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface IndicatorDirection {
    }

    public LinearProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final BaseProgressIndicatorSpec a(Context context, AttributeSet attributeSet) {
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = new LinearProgressIndicatorSpec(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        ThemeEnforcement.a(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int[] iArr = com.google.android.material.R.styleable.f13766y;
        ThemeEnforcement.b(context, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        linearProgressIndicatorSpec.f15069o = typedArrayObtainStyledAttributes.getInt(0, 1);
        linearProgressIndicatorSpec.f15070p = typedArrayObtainStyledAttributes.getInt(1, 0);
        linearProgressIndicatorSpec.f15072r = Math.min(typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0), linearProgressIndicatorSpec.f14955a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            linearProgressIndicatorSpec.f15073s = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(2);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                linearProgressIndicatorSpec.f15074t = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainStyledAttributes.getResources().getDisplayMetrics()), linearProgressIndicatorSpec.f14955a / 2);
                linearProgressIndicatorSpec.f15076v = false;
                linearProgressIndicatorSpec.f15077w = true;
            } else if (i11 == 6) {
                linearProgressIndicatorSpec.f15075u = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                linearProgressIndicatorSpec.f15076v = true;
                linearProgressIndicatorSpec.f15077w = true;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        linearProgressIndicatorSpec.d();
        linearProgressIndicatorSpec.f15071q = linearProgressIndicatorSpec.f15070p == 1;
        return linearProgressIndicatorSpec;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final void c(int i11) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f14944a;
        if (baseProgressIndicatorSpec != null && ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f15069o == 0 && isIndeterminate()) {
            return;
        }
        super.c(i11);
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.f14944a).f15069o;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.f14944a).f15070p;
    }

    public int getTrackInnerCornerRadius() {
        return ((LinearProgressIndicatorSpec) this.f14944a).f15074t;
    }

    public Integer getTrackStopIndicatorPadding() {
        return ((LinearProgressIndicatorSpec) this.f14944a).f15073s;
    }

    public int getTrackStopIndicatorSize() {
        return ((LinearProgressIndicatorSpec) this.f14944a).f15072r;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f14944a;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) baseProgressIndicatorSpec;
        boolean z12 = true;
        if (((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f15070p != 1 && ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f15070p != 2) && (getLayoutDirection() != 0 || ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f15070p != 3))) {
            z12 = false;
        }
        linearProgressIndicatorSpec.f15071q = z12;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        int paddingRight = i11 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i12 - (getPaddingBottom() + getPaddingTop());
        IndeterminateDrawable<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        DeterminateDrawable<LinearProgressIndicatorSpec> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i11) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f14944a;
        if (((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f15069o == i11) {
            return;
        }
        if (d() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f15069o = i11;
        ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).d();
        if (i11 == 0) {
            IndeterminateDrawable<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
            LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate = new LinearIndeterminateContiguousAnimatorDelegate((LinearProgressIndicatorSpec) baseProgressIndicatorSpec);
            indeterminateDrawable.Q = linearIndeterminateContiguousAnimatorDelegate;
            linearIndeterminateContiguousAnimatorDelegate.f15038a = indeterminateDrawable;
        } else {
            IndeterminateDrawable<LinearProgressIndicatorSpec> indeterminateDrawable2 = getIndeterminateDrawable();
            LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = new LinearIndeterminateDisjointAnimatorDelegate(getContext(), (LinearProgressIndicatorSpec) baseProgressIndicatorSpec);
            indeterminateDrawable2.Q = linearIndeterminateDisjointAnimatorDelegate;
            linearIndeterminateDisjointAnimatorDelegate.f15038a = indeterminateDrawable2;
        }
        b();
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f14944a).d();
    }

    public void setIndicatorDirection(int i11) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f14944a;
        ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f15070p = i11;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) baseProgressIndicatorSpec;
        boolean z11 = true;
        if (i11 != 1 && ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f15070p != 2) && (getLayoutDirection() != 0 || i11 != 3))) {
            z11 = false;
        }
        linearProgressIndicatorSpec.f15071q = z11;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i11) {
        super.setTrackCornerRadius(i11);
        ((LinearProgressIndicatorSpec) this.f14944a).d();
        invalidate();
    }

    public void setTrackInnerCornerRadius(int i11) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f14944a;
        if (((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f15074t != i11) {
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f15074t = Math.round(Math.min(i11, ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f14955a / 2.0f));
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f15076v = false;
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f15077w = true;
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).d();
            invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f5) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f14944a;
        if (((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f15075u != f5) {
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f15075u = Math.min(f5, 0.5f);
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f15076v = true;
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f15077w = true;
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).d();
            invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(Integer num) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f14944a;
        if (Objects.equals(((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f15073s, num)) {
            return;
        }
        ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f15073s = num;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i11) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f14944a;
        if (((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f15072r != i11) {
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f15072r = Math.min(i11, ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f14955a);
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).d();
            invalidate();
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i11) {
        IndeterminateAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate;
        super(context, attributeSet, i11, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.f14944a;
        LinearDrawingDelegate linearDrawingDelegate = new LinearDrawingDelegate(linearProgressIndicatorSpec);
        linearDrawingDelegate.f15040f = 300.0f;
        linearDrawingDelegate.f15048o = new Pair(new DrawingDelegate.PathPoint(), new DrawingDelegate.PathPoint());
        Context context2 = getContext();
        if (linearProgressIndicatorSpec.f15069o == 0) {
            linearIndeterminateDisjointAnimatorDelegate = new LinearIndeterminateContiguousAnimatorDelegate(linearProgressIndicatorSpec);
        } else {
            linearIndeterminateDisjointAnimatorDelegate = new LinearIndeterminateDisjointAnimatorDelegate(context2, linearProgressIndicatorSpec);
        }
        setIndeterminateDrawable(new IndeterminateDrawable(context2, linearProgressIndicatorSpec, linearDrawingDelegate, linearIndeterminateDisjointAnimatorDelegate));
        setProgressDrawable(new DeterminateDrawable(getContext(), linearProgressIndicatorSpec, linearDrawingDelegate));
        this.H = true;
    }
}
