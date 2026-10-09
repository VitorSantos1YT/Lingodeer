package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.R;
import java.util.WeakHashMap;
import r4.d;
import z4.j0;
import z4.s0;
import z4.s1;
import z4.u;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f14710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f14711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f14712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14715f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14716t;

    public ScrimInsetsFrameLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f14711b == null || this.f14710a == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        boolean z11 = this.f14713d;
        Rect rect = this.f14712c;
        if (z11) {
            rect.set(0, 0, width, this.f14711b.top);
            this.f14710a.setBounds(rect);
            this.f14710a.draw(canvas);
        }
        if (this.f14714e) {
            rect.set(0, height - this.f14711b.bottom, width, height);
            this.f14710a.setBounds(rect);
            this.f14710a.draw(canvas);
        }
        if (this.f14715f) {
            Rect rect2 = this.f14711b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f14710a.setBounds(rect);
            this.f14710a.draw(canvas);
        }
        if (this.f14716t) {
            Rect rect3 = this.f14711b;
            rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
            this.f14710a.setBounds(rect);
            this.f14710a.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f14710a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f14710a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z11) {
        this.f14714e = z11;
    }

    public void setDrawLeftInsetForeground(boolean z11) {
        this.f14715f = z11;
    }

    public void setDrawRightInsetForeground(boolean z11) {
        this.f14716t = z11;
    }

    public void setDrawTopInsetForeground(boolean z11) {
        this.f14713d = z11;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f14710a = drawable;
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f14712c = new Rect();
        this.f14713d = true;
        this.f14714e = true;
        this.f14715f = true;
        this.f14716t = true;
        TypedArray typedArrayD = ThemeEnforcement.d(context, attributeSet, R.styleable.X, i11, com.lingodeer.R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f14710a = typedArrayD.getDrawable(0);
        typedArrayD.recycle();
        setWillNotDraw(true);
        u uVar = new u() { // from class: com.google.android.material.internal.ScrimInsetsFrameLayout.1
            @Override // z4.u
            public final v1 e(View view, v1 v1Var) {
                ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
                if (scrimInsetsFrameLayout.f14711b == null) {
                    scrimInsetsFrameLayout.f14711b = new Rect();
                }
                Rect rect = scrimInsetsFrameLayout.f14711b;
                int iB = v1Var.b();
                s1 s1Var = v1Var.f58905a;
                rect.set(iB, v1Var.d(), v1Var.c(), v1Var.a());
                scrimInsetsFrameLayout.g(v1Var);
                scrimInsetsFrameLayout.setWillNotDraw(s1Var.l().equals(d.f48792e) || scrimInsetsFrameLayout.f14710a == null);
                scrimInsetsFrameLayout.postInvalidateOnAnimation();
                return s1Var.c();
            }
        };
        WeakHashMap weakHashMap = s0.f58893a;
        j0.m(this, uVar);
    }

    public void g(v1 v1Var) {
    }
}
