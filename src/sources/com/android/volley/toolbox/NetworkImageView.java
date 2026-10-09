package com.android.volley.toolbox;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class NetworkImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f7603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f7604c;

    public NetworkImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        boolean z12;
        boolean z13;
        super.onLayout(z11, i11, i12, i13, i14);
        int width = getWidth();
        int height = getHeight();
        getScaleType();
        if (getLayoutParams() != null) {
            z12 = getLayoutParams().width == -2;
            z13 = getLayoutParams().height == -2;
        } else {
            z12 = false;
            z13 = false;
        }
        boolean z14 = z12 && z13;
        if (width == 0 && height == 0 && !z14) {
            return;
        }
        if (!TextUtils.isEmpty(null)) {
            throw null;
        }
        int i15 = this.f7602a;
        if (i15 != 0) {
            setImageResource(i15);
            return;
        }
        Drawable drawable = this.f7603b;
        if (drawable != null) {
            setImageDrawable(drawable);
            return;
        }
        Bitmap bitmap = this.f7604c;
        if (bitmap != null) {
            setImageBitmap(bitmap);
        } else {
            setImageBitmap(null);
        }
    }

    public void setDefaultImageBitmap(Bitmap bitmap) {
        this.f7602a = 0;
        this.f7603b = null;
        this.f7604c = bitmap;
    }

    public void setDefaultImageDrawable(Drawable drawable) {
        this.f7602a = 0;
        this.f7604c = null;
        this.f7603b = drawable;
    }

    public void setDefaultImageResId(int i11) {
        this.f7604c = null;
        this.f7603b = null;
        this.f7602a = i11;
    }

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }

    public void setErrorImageBitmap(Bitmap bitmap) {
    }

    public void setErrorImageDrawable(Drawable drawable) {
    }

    public void setErrorImageResId(int i11) {
    }
}
