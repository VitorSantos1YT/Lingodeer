package com.google.android.material.shape;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class ShapeableDelegateV22 extends ShapeableDelegate {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15317f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f15318g = CropImageView.DEFAULT_ASPECT_RATIO;

    public ShapeableDelegateV22(FrameLayout frameLayout) {
        e(frameLayout);
    }

    private void e(View view) {
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.google.android.material.shape.ShapeableDelegateV22.1
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view2, Outline outline) {
                ShapeableDelegateV22 shapeableDelegateV22 = ShapeableDelegateV22.this;
                if (shapeableDelegateV22.f15314c == null || shapeableDelegateV22.f15315d.isEmpty()) {
                    return;
                }
                RectF rectF = shapeableDelegateV22.f15315d;
                outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, shapeableDelegateV22.f15318g);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fb  */
    @Override // com.google.android.material.shape.ShapeableDelegate
    public final void b(FrameLayout frameLayout) {
        boolean z11;
        boolean z12;
        ShapeAppearanceModel shapeAppearanceModel;
        ShapeAppearanceModel shapeAppearanceModel2;
        RectF rectF;
        ShapeAppearanceModel shapeAppearanceModel3 = this.f15314c;
        this.f15318g = (shapeAppearanceModel3 == null || (rectF = this.f15315d) == null) ? 0.0f : shapeAppearanceModel3.f15250f.a(rectF);
        if (!((this.f15315d.isEmpty() || (shapeAppearanceModel2 = this.f15314c) == null) ? false : shapeAppearanceModel2.g(this.f15315d))) {
            if (this.f15315d.isEmpty() || (shapeAppearanceModel = this.f15314c) == null || !this.f15313b || shapeAppearanceModel.g(this.f15315d)) {
                z12 = false;
            } else {
                ShapeAppearanceModel shapeAppearanceModel4 = this.f15314c;
                if ((shapeAppearanceModel4.f15245a instanceof RoundedCornerTreatment) && (shapeAppearanceModel4.f15246b instanceof RoundedCornerTreatment) && (shapeAppearanceModel4.f15248d instanceof RoundedCornerTreatment) && (shapeAppearanceModel4.f15247c instanceof RoundedCornerTreatment)) {
                    float fA = shapeAppearanceModel4.f15249e.a(this.f15315d);
                    float fA2 = this.f15314c.f15250f.a(this.f15315d);
                    float fA3 = this.f15314c.f15252h.a(this.f15315d);
                    float fA4 = this.f15314c.f15251g.a(this.f15315d);
                    if (fA == CropImageView.DEFAULT_ASPECT_RATIO && fA3 == CropImageView.DEFAULT_ASPECT_RATIO && fA2 == fA4) {
                        RectF rectF2 = this.f15315d;
                        rectF2.set(rectF2.left - fA2, rectF2.top, rectF2.right, rectF2.bottom);
                        this.f15318g = fA2;
                    } else if (fA == CropImageView.DEFAULT_ASPECT_RATIO && fA2 == CropImageView.DEFAULT_ASPECT_RATIO && fA3 == fA4) {
                        RectF rectF3 = this.f15315d;
                        rectF3.set(rectF3.left, rectF3.top - fA3, rectF3.right, rectF3.bottom);
                        this.f15318g = fA3;
                    } else if (fA2 == CropImageView.DEFAULT_ASPECT_RATIO && fA4 == CropImageView.DEFAULT_ASPECT_RATIO && fA == fA3) {
                        RectF rectF4 = this.f15315d;
                        rectF4.set(rectF4.left, rectF4.top, rectF4.right + fA, rectF4.bottom);
                        this.f15318g = fA;
                    } else if (fA3 == CropImageView.DEFAULT_ASPECT_RATIO && fA4 == CropImageView.DEFAULT_ASPECT_RATIO && fA == fA2) {
                        RectF rectF5 = this.f15315d;
                        rectF5.set(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom + fA);
                        this.f15318g = fA;
                    } else {
                        z12 = false;
                    }
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            z11 = z12;
        }
        this.f15317f = z11;
        frameLayout.setClipToOutline(!c());
        if (c()) {
            frameLayout.invalidate();
        } else {
            frameLayout.invalidateOutline();
        }
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public final boolean c() {
        return !this.f15317f || this.f15312a;
    }
}
