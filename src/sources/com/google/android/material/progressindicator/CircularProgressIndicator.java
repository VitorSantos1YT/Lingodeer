package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.lingodeer.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import q4.j;
import ra.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface IndeterminateAnimationType {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface IndicatorDirection {
    }

    public CircularProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final BaseProgressIndicatorSpec a(Context context, AttributeSet attributeSet) {
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = new CircularProgressIndicatorSpec(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        ThemeEnforcement.a(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = com.google.android.material.R.styleable.f13749k;
        ThemeEnforcement.b(context, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        circularProgressIndicatorSpec.f15007o = typedArrayObtainStyledAttributes.getInt(0, 0);
        circularProgressIndicatorSpec.f15008p = Math.max(MaterialResources.c(context, typedArrayObtainStyledAttributes, 4, dimensionPixelSize), circularProgressIndicatorSpec.f14955a * 2);
        circularProgressIndicatorSpec.f15009q = MaterialResources.c(context, typedArrayObtainStyledAttributes, 3, dimensionPixelSize2);
        circularProgressIndicatorSpec.f15010r = typedArrayObtainStyledAttributes.getInt(2, 0);
        circularProgressIndicatorSpec.f15011s = typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
        circularProgressIndicatorSpec.d();
        return circularProgressIndicatorSpec;
    }

    public int getIndeterminateAnimationType() {
        return ((CircularProgressIndicatorSpec) this.f14944a).f15007o;
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f14944a).f15010r;
    }

    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f14944a).f15009q;
    }

    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f14944a).f15008p;
    }

    public void setIndeterminateAnimationType(int i11) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f14944a;
        if (((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).f15007o == i11) {
            return;
        }
        if (d() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).f15007o = i11;
        ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).d();
        IndeterminateAnimatorDelegate circularIndeterminateRetreatAnimatorDelegate = i11 == 1 ? new CircularIndeterminateRetreatAnimatorDelegate(getContext(), (CircularProgressIndicatorSpec) baseProgressIndicatorSpec) : new CircularIndeterminateAdvanceAnimatorDelegate((CircularProgressIndicatorSpec) baseProgressIndicatorSpec);
        IndeterminateDrawable<CircularProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
        indeterminateDrawable.Q = circularIndeterminateRetreatAnimatorDelegate;
        circularIndeterminateRetreatAnimatorDelegate.f15038a = indeterminateDrawable;
        b();
        invalidate();
    }

    public void setIndicatorDirection(int i11) {
        ((CircularProgressIndicatorSpec) this.f14944a).f15010r = i11;
        invalidate();
    }

    public void setIndicatorInset(int i11) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f14944a;
        if (((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).f15009q != i11) {
            ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).f15009q = i11;
            invalidate();
        }
    }

    public void setIndicatorSize(int i11) {
        int iMax = Math.max(i11, getTrackThickness() * 2);
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f14944a;
        if (((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).f15008p != iMax) {
            ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).f15008p = iMax;
            ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).d();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i11) {
        super.setTrackThickness(i11);
        ((CircularProgressIndicatorSpec) this.f14944a).d();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i11) {
        IndeterminateAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate;
        super(context, attributeSet, i11, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f14944a;
        CircularDrawingDelegate circularDrawingDelegate = new CircularDrawingDelegate(circularProgressIndicatorSpec);
        Context context2 = getContext();
        if (circularProgressIndicatorSpec.f15007o == 1) {
            circularIndeterminateAdvanceAnimatorDelegate = new CircularIndeterminateRetreatAnimatorDelegate(context2, circularProgressIndicatorSpec);
        } else {
            circularIndeterminateAdvanceAnimatorDelegate = new CircularIndeterminateAdvanceAnimatorDelegate(circularProgressIndicatorSpec);
        }
        IndeterminateDrawable indeterminateDrawable = new IndeterminateDrawable(context2, circularProgressIndicatorSpec, circularDrawingDelegate, circularIndeterminateAdvanceAnimatorDelegate);
        Resources resources = context2.getResources();
        q qVar = new q();
        ThreadLocal threadLocal = j.f47447a;
        qVar.f49000a = resources.getDrawable(R.drawable.ic_mtrl_arrow_circle, null);
        indeterminateDrawable.R = qVar;
        setIndeterminateDrawable(indeterminateDrawable);
        setProgressDrawable(new DeterminateDrawable(getContext(), circularProgressIndicatorSpec, circularDrawingDelegate));
        this.H = true;
    }
}
