package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.Rect;
import com.yalantis.ucrop.view.CropImageView;
import n.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ShadowDrawableWrapper extends a {
    static {
        Math.cos(Math.toRadians(45.0d));
    }

    @Override // n.a, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i11 = getBounds().left;
        throw null;
    }

    @Override // n.a, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // n.a, android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int iCeil = (int) Math.ceil(CropImageView.DEFAULT_ASPECT_RATIO);
        int iCeil2 = (int) Math.ceil(CropImageView.DEFAULT_ASPECT_RATIO);
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    @Override // n.a, android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        super.setAlpha(i11);
        throw null;
    }

    @Override // n.a, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
    }
}
