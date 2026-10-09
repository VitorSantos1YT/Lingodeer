package com.google.android.material.circularreveal;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.math.MathUtils;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CircularRevealHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f14270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f14271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f14272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CircularRevealWidget.RevealInfo f14273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f14274e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Delegate {
        void e(Canvas canvas);

        boolean j();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Strategy {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CircularRevealHelper(Delegate delegate) {
        this.f14270a = (ViewGroup) delegate;
        View view = (View) delegate;
        this.f14271b = (ViewGroup) view;
        view.setWillNotDraw(false);
        new Path();
        new Paint(7);
        Paint paint = new Paint(1);
        this.f14272c = paint;
        paint.setColor(0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.ViewGroup, com.google.android.material.circularreveal.CircularRevealHelper$Delegate] */
    public final void a(Canvas canvas) {
        Canvas canvas2;
        CircularRevealWidget.RevealInfo revealInfo = this.f14273d;
        boolean z11 = revealInfo == null || revealInfo.f14283c == Float.MAX_VALUE;
        Paint paint = this.f14272c;
        ?? r9 = this.f14270a;
        ViewGroup viewGroup = this.f14271b;
        if (z11) {
            r9.e(canvas);
            if (Color.alpha(paint.getColor()) != 0) {
                canvas2 = canvas;
                canvas2.drawRect(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, viewGroup.getWidth(), viewGroup.getHeight(), paint);
            } else {
                canvas2 = canvas;
            }
        } else {
            r9.e(canvas);
            if (Color.alpha(paint.getColor()) != 0) {
                canvas2 = canvas;
                canvas2.drawRect(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, viewGroup.getWidth(), viewGroup.getHeight(), paint);
            } else {
                canvas2 = canvas;
            }
        }
        Drawable drawable = this.f14274e;
        if (drawable == null || this.f14273d == null) {
            return;
        }
        Rect bounds = drawable.getBounds();
        float fWidth = this.f14273d.f14281a - (bounds.width() / 2.0f);
        float fHeight = this.f14273d.f14282b - (bounds.height() / 2.0f);
        canvas2.translate(fWidth, fHeight);
        this.f14274e.draw(canvas2);
        canvas2.translate(-fWidth, -fHeight);
    }

    public final CircularRevealWidget.RevealInfo b() {
        CircularRevealWidget.RevealInfo revealInfo = this.f14273d;
        if (revealInfo == null) {
            return null;
        }
        CircularRevealWidget.RevealInfo revealInfo2 = new CircularRevealWidget.RevealInfo(revealInfo);
        if (revealInfo2.f14283c == Float.MAX_VALUE) {
            float f5 = revealInfo2.f14281a;
            float f11 = revealInfo2.f14282b;
            ViewGroup viewGroup = this.f14271b;
            revealInfo2.f14283c = MathUtils.b(f5, f11, viewGroup.getWidth(), viewGroup.getHeight());
        }
        return revealInfo2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup, com.google.android.material.circularreveal.CircularRevealHelper$Delegate] */
    public final boolean c() {
        if (this.f14270a.j()) {
            CircularRevealWidget.RevealInfo revealInfo = this.f14273d;
            if (revealInfo == null || revealInfo.f14283c == Float.MAX_VALUE) {
                return true;
            }
        }
        return false;
    }

    public final void d(Drawable drawable) {
        this.f14274e = drawable;
        this.f14271b.invalidate();
    }

    public final void e(int i11) {
        this.f14272c.setColor(i11);
        this.f14271b.invalidate();
    }

    public final void f(CircularRevealWidget.RevealInfo revealInfo) {
        ViewGroup viewGroup = this.f14271b;
        if (revealInfo == null) {
            this.f14273d = null;
        } else {
            CircularRevealWidget.RevealInfo revealInfo2 = this.f14273d;
            if (revealInfo2 == null) {
                this.f14273d = new CircularRevealWidget.RevealInfo(revealInfo);
            } else {
                float f5 = revealInfo.f14281a;
                float f11 = revealInfo.f14282b;
                float f12 = revealInfo.f14283c;
                revealInfo2.f14281a = f5;
                revealInfo2.f14282b = f11;
                revealInfo2.f14283c = f12;
            }
            if (revealInfo.f14283c + 1.0E-4f >= MathUtils.b(revealInfo.f14281a, revealInfo.f14282b, viewGroup.getWidth(), viewGroup.getHeight())) {
                this.f14273d.f14283c = Float.MAX_VALUE;
            }
        }
        viewGroup.invalidate();
    }
}
