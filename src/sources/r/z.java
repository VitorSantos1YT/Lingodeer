package r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.yalantis.ucrop.view.CropImageView;
import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AppCompatSeekBar f48719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f48720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f48721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f48722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f48723i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f48724j;

    public z(AppCompatSeekBar appCompatSeekBar) {
        super(appCompatSeekBar);
        this.f48721g = null;
        this.f48722h = null;
        this.f48723i = false;
        this.f48724j = false;
        this.f48719e = appCompatSeekBar;
    }

    @Override // r.x
    public final void b(AttributeSet attributeSet, int i11) {
        super.b(attributeSet, i11);
        AppCompatSeekBar appCompatSeekBar = this.f48719e;
        Context context = appCompatSeekBar.getContext();
        int[] iArr = k.a.f37406h;
        m4 m4VarK = m4.k(context, attributeSet, iArr, i11);
        TypedArray typedArray = (TypedArray) m4VarK.f48061c;
        z4.s0.p(appCompatSeekBar, appCompatSeekBar.getContext(), iArr, attributeSet, (TypedArray) m4VarK.f48061c, i11);
        Drawable drawableH = m4VarK.h(0);
        if (drawableH != null) {
            appCompatSeekBar.setThumb(drawableH);
        }
        Drawable drawableG = m4VarK.g(1);
        Drawable drawable = this.f48720f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f48720f = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(appCompatSeekBar);
            drawableG.setLayoutDirection(appCompatSeekBar.getLayoutDirection());
            if (drawableG.isStateful()) {
                drawableG.setState(appCompatSeekBar.getDrawableState());
            }
            f();
        }
        appCompatSeekBar.invalidate();
        if (typedArray.hasValue(3)) {
            this.f48722h = c1.c(typedArray.getInt(3, -1), this.f48722h);
            this.f48724j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f48721g = m4VarK.f(2);
            this.f48723i = true;
        }
        m4VarK.l();
        f();
    }

    public final void f() {
        Drawable drawable = this.f48720f;
        if (drawable != null) {
            if (this.f48723i || this.f48724j) {
                Drawable drawableMutate = drawable.mutate();
                this.f48720f = drawableMutate;
                if (this.f48723i) {
                    drawableMutate.setTintList(this.f48721g);
                }
                if (this.f48724j) {
                    this.f48720f.setTintMode(this.f48722h);
                }
                if (this.f48720f.isStateful()) {
                    this.f48720f.setState(this.f48719e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f48720f != null) {
            AppCompatSeekBar appCompatSeekBar = this.f48719e;
            int max = appCompatSeekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f48720f.getIntrinsicWidth();
                int intrinsicHeight = this.f48720f.getIntrinsicHeight();
                int i11 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i12 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f48720f.setBounds(-i11, -i12, i11, i12);
                float width = ((appCompatSeekBar.getWidth() - appCompatSeekBar.getPaddingLeft()) - appCompatSeekBar.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(appCompatSeekBar.getPaddingLeft(), appCompatSeekBar.getHeight() / 2);
                for (int i13 = 0; i13 <= max; i13++) {
                    this.f48720f.draw(canvas);
                    canvas.translate(width, CropImageView.DEFAULT_ASPECT_RATIO);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
