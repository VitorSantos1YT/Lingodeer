package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class CutoutDrawable extends MaterialShapeDrawable {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f15602k0 = 0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public CutoutDrawableState f15603j0;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ImplApi18 extends CutoutDrawable {
        @Override // com.google.android.material.shape.MaterialShapeDrawable
        public final void g(Canvas canvas) {
            if (this.f15603j0.f15604s.isEmpty()) {
                super.g(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f15603j0.f15604s);
            } else {
                canvas.clipRect(this.f15603j0.f15604s, Region.Op.DIFFERENCE);
            }
            super.g(canvas);
            canvas.restore();
        }
    }

    public final void E(float f5, float f11, float f12, float f13) {
        RectF rectF = this.f15603j0.f15604s;
        if (f5 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f5, f11, f12, f13);
        invalidateSelf();
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f15603j0 = new CutoutDrawableState(this.f15603j0);
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CutoutDrawableState extends MaterialShapeDrawable.MaterialShapeDrawableState {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final RectF f15604s;

        public CutoutDrawableState(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
            super(shapeAppearanceModel);
            this.f15604s = rectF;
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable.MaterialShapeDrawableState, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            int i11 = CutoutDrawable.f15602k0;
            ImplApi18 implApi18 = new ImplApi18(this);
            implApi18.f15603j0 = this;
            implApi18.invalidateSelf();
            return implApi18;
        }

        public CutoutDrawableState(CutoutDrawableState cutoutDrawableState) {
            super(cutoutDrawableState);
            this.f15604s = cutoutDrawableState.f15604s;
        }
    }
}
