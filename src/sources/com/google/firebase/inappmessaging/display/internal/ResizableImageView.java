package com.google.firebase.inappmessaging.display.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ResizableImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19789a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Dimensions {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19791b;

        public Dimensions(int i11, int i12) {
            this.f19790a = i11;
            this.f19791b = i12;
        }
    }

    public ResizableImageView(Context context) {
        super(context);
        this.f19789a = (int) (context.getResources().getDisplayMetrics().density * 160.0f);
    }

    public final Dimensions c(int i11, int i12) {
        int maxWidth = getMaxWidth();
        int maxHeight = getMaxHeight();
        if (i11 > maxWidth) {
            i12 = (i12 * maxWidth) / i11;
            i11 = maxWidth;
        }
        if (i12 > maxHeight) {
            i11 = (i11 * maxHeight) / i12;
        } else {
            maxHeight = i12;
        }
        return new Dimensions(i11, maxHeight);
    }

    public final void d() {
        int iMax = Math.max(getMinimumWidth(), getSuggestedMinimumWidth());
        int iMax2 = Math.max(getMinimumHeight(), getSuggestedMinimumHeight());
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f5 = iMax2;
        float f11 = measuredWidth;
        float f12 = measuredHeight;
        float f13 = measuredWidth < iMax ? iMax / f11 : 1.0f;
        float f14 = measuredHeight < iMax2 ? f5 / f12 : 1.0f;
        if (f13 <= f14) {
            f13 = f14;
        }
        if (f13 > 1.0d) {
            Dimensions dimensionsC = c((int) Math.ceil(f11 * f13), (int) Math.ceil(f12 * f13));
            setMeasuredDimension(dimensionsC.f19790a, dimensionsC.f19791b);
        }
    }

    public final void e(Drawable drawable) {
        Dimensions dimensionsC = c((int) Math.ceil((drawable.getIntrinsicWidth() * this.f19789a) / 160), (int) Math.ceil((drawable.getIntrinsicHeight() * this.f19789a) / 160));
        setMeasuredDimension(dimensionsC.f19790a, dimensionsC.f19791b);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        Drawable drawable = getDrawable();
        boolean adjustViewBounds = getAdjustViewBounds();
        if (drawable == null || !adjustViewBounds) {
            return;
        }
        e(drawable);
        d();
    }

    public ResizableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19789a = (int) (context.getResources().getDisplayMetrics().density * 160.0f);
    }

    public ResizableImageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f19789a = (int) (context.getResources().getDisplayMetrics().density * 160.0f);
    }
}
