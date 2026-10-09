package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.yalantis.ucrop.view.CropImageView;
import nv.p;
import ra.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class IndeterminateDrawable<S extends BaseProgressIndicatorSpec> extends DrawableWithAnimatedVisibilityChange {
    public final DrawingDelegate P;
    public IndeterminateAnimatorDelegate Q;
    public q R;

    public IndeterminateDrawable(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec, DrawingDelegate drawingDelegate, IndeterminateAnimatorDelegate indeterminateAnimatorDelegate) {
        super(context, baseProgressIndicatorSpec);
        this.P = drawingDelegate;
        this.Q = indeterminateAnimatorDelegate;
        indeterminateAnimatorDelegate.f15038a = this;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public final void d() {
        super.g(false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00fb  */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        int i11;
        q qVar;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.N)) {
            AnimatorDurationScaleProvider animatorDurationScaleProvider = this.f15015c;
            int i12 = 0;
            BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f15014b;
            if (animatorDurationScaleProvider != null && AnimatorDurationScaleProvider.a(this.f15013a.getContentResolver()) == CropImageView.DEFAULT_ASPECT_RATIO && (qVar = this.R) != null) {
                qVar.setBounds(getBounds());
                this.R.setTint(baseProgressIndicatorSpec.f14959e[0]);
                this.R.draw(canvas);
                return;
            }
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            boolean zF = super.f();
            boolean zE = super.e();
            DrawingDelegate drawingDelegate = this.P;
            drawingDelegate.f15022a.d();
            drawingDelegate.a(canvas, bounds, fB, zF, zE);
            int i13 = baseProgressIndicatorSpec.f14963i;
            int i14 = this.M;
            boolean z11 = (baseProgressIndicatorSpec instanceof LinearProgressIndicatorSpec) || ((baseProgressIndicatorSpec instanceof CircularProgressIndicatorSpec) && ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).f15011s);
            boolean z12 = z11 && i13 == 0 && !baseProgressIndicatorSpec.b(false);
            Paint paint = this.L;
            if (!z12) {
                if (z11) {
                    DrawingDelegate.ActiveIndicator activeIndicator = (DrawingDelegate.ActiveIndicator) this.Q.f15039b.get(0);
                    DrawingDelegate.ActiveIndicator activeIndicator2 = (DrawingDelegate.ActiveIndicator) p.f(1, this.Q.f15039b);
                    DrawingDelegate drawingDelegate2 = this.P;
                    if (drawingDelegate2 instanceof LinearDrawingDelegate) {
                        i11 = i13;
                        canvas2 = canvas;
                        drawingDelegate2.d(canvas2, paint, CropImageView.DEFAULT_ASPECT_RATIO, activeIndicator.f15027a, baseProgressIndicatorSpec.f14960f, i14, i11);
                        this.P.d(canvas2, paint, activeIndicator2.f15028b, 1.0f, baseProgressIndicatorSpec.f14960f, i14, i11);
                    } else {
                        canvas2 = canvas;
                        i11 = i13;
                        canvas.save();
                        canvas.rotate(activeIndicator2.f15033g);
                        this.P.d(canvas2, paint, activeIndicator2.f15028b, 1.0f + activeIndicator.f15027a, baseProgressIndicatorSpec.f14960f, i14, i11);
                        canvas.restore();
                    }
                } else {
                    canvas2 = canvas;
                }
                while (i12 < this.Q.f15039b.size()) {
                    DrawingDelegate.ActiveIndicator activeIndicator3 = (DrawingDelegate.ActiveIndicator) this.Q.f15039b.get(i12);
                    activeIndicator3.f15032f = c();
                    this.P.c(canvas, paint, activeIndicator3, this.M);
                    if (i12 <= 0 && !z12 && z11) {
                        this.P.d(canvas2, paint, ((DrawingDelegate.ActiveIndicator) this.Q.f15039b.get(i12 - 1)).f15028b, activeIndicator3.f15027a, baseProgressIndicatorSpec.f14960f, i14, i11);
                    }
                    i12++;
                    canvas2 = canvas;
                }
                canvas.restore();
            }
            canvas2 = canvas;
            this.P.d(canvas2, paint, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, baseProgressIndicatorSpec.f14960f, i14, 0);
            i11 = i13;
            while (i12 < this.Q.f15039b.size()) {
                DrawingDelegate.ActiveIndicator activeIndicator4 = (DrawingDelegate.ActiveIndicator) this.Q.f15039b.get(i12);
                activeIndicator4.f15032f = c();
                this.P.c(canvas, paint, activeIndicator4, this.M);
                if (i12 <= 0) {
                }
                i12++;
                canvas2 = canvas;
            }
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.M;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.P.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.P.f();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public final boolean h(boolean z11, boolean z12, boolean z13) {
        q qVar;
        boolean zH = super.h(z11, z12, z13);
        if (this.f15015c != null && AnimatorDurationScaleProvider.a(this.f15013a.getContentResolver()) == CropImageView.DEFAULT_ASPECT_RATIO && (qVar = this.R) != null) {
            return qVar.setVisible(z11, z12);
        }
        if (!super.isRunning()) {
            this.Q.a();
        }
        if (z11 && z13) {
            this.Q.f();
        }
        return zH;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z11, boolean z12) {
        return g(z11, z12, true);
    }
}
