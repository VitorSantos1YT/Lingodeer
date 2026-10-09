package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class BadgeDrawable extends Drawable implements TextDrawableHelper.TextDrawableDelegate {
    public final int H;
    public float K;
    public float L;
    public float M;
    public WeakReference N;
    public WeakReference O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f13873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialShapeDrawable f13874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextDrawableHelper f13875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f13876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BadgeState f13877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f13878f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f13879t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeGravity {
    }

    public BadgeDrawable(Context context, BadgeState.State state) {
        TextAppearance textAppearance;
        WeakReference weakReference = new WeakReference(context);
        this.f13873a = weakReference;
        ThemeEnforcement.c(context, ThemeEnforcement.f14740b, "Theme.MaterialComponents");
        this.f13876d = new Rect();
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.f13875c = textDrawableHelper;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = textDrawableHelper.f14730a;
        textPaint.setTextAlign(align);
        BadgeState badgeState = new BadgeState(context, state);
        this.f13877e = badgeState;
        boolean zG = g();
        BadgeState.State state2 = badgeState.f13881b;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.a(context, zG ? state2.f13905t.intValue() : state2.f13900e.intValue(), g() ? state2.H.intValue() : state2.f13902f.intValue()).a());
        this.f13874b = materialShapeDrawable;
        i();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && textDrawableHelper.f14736g != (textAppearance = new TextAppearance(context2, state2.f13898d.intValue()))) {
            textDrawableHelper.c(textAppearance, context2);
            textPaint.setColor(state2.f13896c.intValue());
            invalidateSelf();
            k();
            invalidateSelf();
        }
        int i11 = state2.N;
        if (i11 != -2) {
            this.H = ((int) Math.pow(10.0d, ((double) i11) - 1.0d)) - 1;
        } else {
            this.H = state2.O;
        }
        textDrawableHelper.f14734e = true;
        k();
        invalidateSelf();
        textDrawableHelper.f14734e = true;
        i();
        k();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(state2.f13894b.intValue());
        if (materialShapeDrawable.f15200b.f15217d != colorStateListValueOf) {
            materialShapeDrawable.r(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(state2.f13896c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.N;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.N.get();
            WeakReference weakReference3 = this.O;
            j(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        k();
        setVisible(state2.V.booleanValue(), false);
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public final void a() {
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view, View view2) {
        float y10;
        float x11;
        ViewParent parent;
        boolean z11;
        FrameLayout frameLayoutE = e();
        if (frameLayoutE == null) {
            float y11 = view.getY();
            x11 = view.getX();
            parent = view.getParent();
            y10 = y11;
        } else {
            y10 = 0.0f;
            x11 = 0.0f;
            parent = frameLayoutE;
        }
        while (true) {
            z11 = parent instanceof View;
            if (!z11 || parent == view2) {
                break;
            }
            ViewParent parent2 = parent.getParent();
            if (!(parent2 instanceof ViewGroup) || ((ViewGroup) parent2).getClipChildren()) {
                break;
            }
            View view3 = (View) parent;
            y10 += view3.getY();
            x11 += view3.getX();
            parent = parent.getParent();
        }
        if (z11) {
            float f5 = (this.f13879t - this.M) + y10;
            float f11 = (this.f13878f - this.L) + x11;
            View view4 = (View) parent;
            float height = ((this.f13879t + this.M) - view4.getHeight()) + y10;
            float width = ((this.f13878f + this.L) - view4.getWidth()) + x11;
            if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
                this.f13879t = Math.abs(f5) + this.f13879t;
            }
            if (f11 < CropImageView.DEFAULT_ASPECT_RATIO) {
                this.f13878f = Math.abs(f11) + this.f13878f;
            }
            if (height > CropImageView.DEFAULT_ASPECT_RATIO) {
                this.f13879t -= Math.abs(height);
            }
            if (width > CropImageView.DEFAULT_ASPECT_RATIO) {
                this.f13878f -= Math.abs(width);
            }
        }
    }

    public final String c() {
        BadgeState badgeState = this.f13877e;
        BadgeState.State state = badgeState.f13881b;
        BadgeState.State state2 = badgeState.f13881b;
        String str = state.L;
        WeakReference weakReference = this.f13873a;
        if (str == null) {
            if (!h()) {
                return null;
            }
            if (this.H == -2 || f() <= this.H) {
                return NumberFormat.getInstance(state2.P).format(f());
            }
            Context context = (Context) weakReference.get();
            return context == null ? BuildConfig.VERSION_NAME : String.format(state2.P, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.H), "+");
        }
        int i11 = state.N;
        if (i11 == -2 || str == null || str.length() <= i11) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return BuildConfig.VERSION_NAME;
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i11 - 1), "…");
    }

    public final CharSequence d() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        BadgeState badgeState = this.f13877e;
        BadgeState.State state = badgeState.f13881b;
        BadgeState.State state2 = badgeState.f13881b;
        if (state.L != null) {
            CharSequence charSequence = state.Q;
            return charSequence != null ? charSequence : badgeState.f13881b.L;
        }
        if (!h()) {
            return state2.R;
        }
        if (state2.S == 0 || (context = (Context) this.f13873a.get()) == null) {
            return null;
        }
        if (this.H != -2) {
            int iF = f();
            int i11 = this.H;
            if (iF > i11) {
                return context.getString(state2.T, Integer.valueOf(i11));
            }
        }
        return context.getResources().getQuantityString(state2.S, f(), Integer.valueOf(f()));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strC;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f13874b.draw(canvas);
        if (!g() || (strC = c()) == null) {
            return;
        }
        Rect rect = new Rect();
        TextDrawableHelper textDrawableHelper = this.f13875c;
        textDrawableHelper.f14730a.getTextBounds(strC, 0, strC.length(), rect);
        float fExactCenterY = this.f13879t - rect.exactCenterY();
        canvas.drawText(strC, this.f13878f, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), textDrawableHelper.f14730a);
    }

    public final FrameLayout e() {
        WeakReference weakReference = this.O;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final int f() {
        int i11 = this.f13877e.f13881b.M;
        if (i11 != -1) {
            return i11;
        }
        return 0;
    }

    public final boolean g() {
        return this.f13877e.f13881b.L != null || h();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f13877e.f13881b.K;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f13876d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f13876d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final boolean h() {
        BadgeState.State state = this.f13877e.f13881b;
        return state.L == null && state.M != -1;
    }

    public final void i() {
        Context context = (Context) this.f13873a.get();
        if (context == null) {
            return;
        }
        boolean zG = g();
        BadgeState badgeState = this.f13877e;
        this.f13874b.setShapeAppearanceModel(ShapeAppearanceModel.a(context, zG ? badgeState.f13881b.f13905t.intValue() : badgeState.f13881b.f13900e.intValue(), g() ? badgeState.f13881b.H.intValue() : badgeState.f13881b.f13902f.intValue()).a());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    public final void j(View view, FrameLayout frameLayout) {
        this.N = new WeakReference(view);
        this.O = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        k();
        invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0112 A[PHI: r13
      0x0112: PHI (r13v2 int) = (r13v1 int), (r13v8 int) binds: [B:41:0x00de, B:43:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    public final void k() {
        float f5;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        WeakReference weakReference = this.f13873a;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.N;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f13876d;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.O;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zG = g();
        BadgeState badgeState = this.f13877e;
        float f17 = zG ? badgeState.f13883d : badgeState.f13882c;
        this.K = f17;
        if (f17 != -1.0f) {
            this.L = f17;
            this.M = f17;
        } else {
            this.L = Math.round((g() ? badgeState.f13886g : badgeState.f13884e) / 2.0f);
            this.M = Math.round((g() ? badgeState.f13887h : badgeState.f13885f) / 2.0f);
        }
        if (g()) {
            String strC = c();
            float f18 = this.L;
            TextDrawableHelper textDrawableHelper = this.f13875c;
            this.L = Math.max(f18, (textDrawableHelper.a(strC) / 2.0f) + badgeState.f13881b.W.intValue());
            float f19 = this.M;
            if (textDrawableHelper.f14734e) {
                textDrawableHelper.b(strC);
                f16 = textDrawableHelper.f14733d;
            } else {
                f16 = textDrawableHelper.f14733d;
            }
            float fMax = Math.max(f19, (f16 / 2.0f) + badgeState.f13881b.X.intValue());
            this.M = fMax;
            this.L = Math.max(this.L, fMax);
        }
        BadgeState.State state = badgeState.f13881b;
        BadgeState.State state2 = badgeState.f13881b;
        int i11 = badgeState.f13890k;
        int iIntValue = state.Z.intValue();
        if (g()) {
            iIntValue = state.f13895b0.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                iIntValue = AnimationUtils.c(iIntValue, AnimationUtils.b(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f), iIntValue - state.f13901e0.intValue());
            }
        }
        if (i11 == 0) {
            iIntValue -= Math.round(this.M);
        }
        int iIntValue2 = state.f13899d0.intValue() + iIntValue;
        int iIntValue3 = state2.U.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.f13879t = rect3.bottom - iIntValue2;
        } else {
            this.f13879t = rect3.top + iIntValue2;
        }
        int iIntValue4 = g() ? state.f13893a0.intValue() : state2.Y.intValue();
        if (i11 == 1) {
            iIntValue4 += g() ? badgeState.f13889j : badgeState.f13888i;
        }
        int iIntValue5 = state.f13897c0.intValue() + iIntValue4;
        int iIntValue6 = state2.U.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            if (badgeState.f13891l == 0) {
                if (view.getLayoutDirection() == 0) {
                    f5 = rect3.left + this.L;
                    f11 = (this.M * 2.0f) - iIntValue5;
                    f12 = f5 - f11;
                } else {
                    f12 = (rect3.right - this.L) + ((this.M * 2.0f) - iIntValue5);
                }
            } else if (view.getLayoutDirection() == 0) {
                f12 = (rect3.left - this.L) + iIntValue5;
            } else {
                f5 = rect3.right + this.L;
                f11 = iIntValue5;
                f12 = f5 - f11;
            }
            this.f13878f = f12;
        } else {
            if (badgeState.f13891l == 0) {
                if (view.getLayoutDirection() == 0) {
                    f13 = rect3.right + this.L;
                    f14 = iIntValue5;
                    f15 = f13 - f14;
                } else {
                    f15 = (rect3.left - this.L) + iIntValue5;
                }
            } else if (view.getLayoutDirection() == 0) {
                f15 = (rect3.right - this.L) + ((this.M * 2.0f) - iIntValue5);
            } else {
                f13 = rect3.left + this.L;
                f14 = (this.M * 2.0f) - iIntValue5;
                f15 = f13 - f14;
            }
            this.f13878f = f15;
        }
        if (state.f13903f0.booleanValue()) {
            ViewParent viewParentE = e();
            if (viewParentE == null) {
                viewParentE = view.getParent();
            }
            if ((viewParentE instanceof View) && (viewParentE.getParent() instanceof View)) {
                b(view, (View) viewParentE.getParent());
            }
        } else {
            b(view, null);
        }
        float f21 = this.f13878f;
        float f22 = this.f13879t;
        float f23 = this.L;
        float f24 = this.M;
        rect2.set((int) (f21 - f23), (int) (f22 - f24), (int) (f21 + f23), (int) (f22 + f24));
        float f25 = this.K;
        MaterialShapeDrawable materialShapeDrawable = this.f13874b;
        if (f25 != -1082130432) {
            ShapeAppearanceModel.Builder builderH = materialShapeDrawable.f15200b.f15214a.h();
            builderH.c(f25);
            materialShapeDrawable.setShapeAppearanceModel(builderH.a());
        }
        if (rect.equals(rect2)) {
            return;
        }
        materialShapeDrawable.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        BadgeState badgeState = this.f13877e;
        badgeState.f13880a.K = i11;
        badgeState.f13881b.K = i11;
        this.f13875c.f14730a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
