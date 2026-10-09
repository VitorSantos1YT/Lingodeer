package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import r4.c;
import ub.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ChipDrawable extends MaterialShapeDrawable implements Drawable.Callback, TextDrawableHelper.TextDrawableDelegate {

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final int[] f14225r1 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final ShapeDrawable f14226s1 = new ShapeDrawable(new OvalShape());
    public float A0;
    public SpannableStringBuilder B0;
    public boolean C0;
    public boolean D0;
    public Drawable E0;
    public ColorStateList F0;
    public MotionSpec G0;
    public MotionSpec H0;
    public float I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public float P0;
    public final Context Q0;
    public final Paint R0;
    public final Paint.FontMetrics S0;
    public final RectF T0;
    public final PointF U0;
    public final Path V0;
    public final TextDrawableHelper W0;
    public int X0;
    public int Y0;
    public int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f14227a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f14228b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public int f14229c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f14230d1;
    public int e1;
    public int f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public ColorFilter f14231g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public PorterDuffColorFilter f14232h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public ColorStateList f14233i1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ColorStateList f14234j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public PorterDuff.Mode f14235j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public ColorStateList f14236k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public int[] f14237k1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f14238l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public ColorStateList f14239l1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f14240m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public WeakReference f14241m1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public ColorStateList f14242n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public TextUtils.TruncateAt f14243n1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public float f14244o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public boolean f14245o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ColorStateList f14246p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f14247p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CharSequence f14248q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public boolean f14249q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f14250r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Drawable f14251s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ColorStateList f14252t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f14253u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f14254v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f14255w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Drawable f14256x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public RippleDrawable f14257y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ColorStateList f14258z0;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Delegate {
        void a();
    }

    public ChipDrawable(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, com.lingodeer.R.style.Widget_MaterialComponents_Chip_Action);
        this.f14240m0 = -1.0f;
        this.R0 = new Paint(1);
        this.S0 = new Paint.FontMetrics();
        this.T0 = new RectF();
        this.U0 = new PointF();
        this.V0 = new Path();
        this.f1 = 255;
        this.f14235j1 = PorterDuff.Mode.SRC_IN;
        this.f14241m1 = new WeakReference(null);
        n(context);
        this.Q0 = context;
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.W0 = textDrawableHelper;
        this.f14248q0 = BuildConfig.VERSION_NAME;
        textDrawableHelper.f14730a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f14225r1;
        setState(iArr);
        c0(iArr);
        this.f14245o1 = true;
        f14226s1.setTint(-1);
    }

    public static boolean J(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean K(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void l0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final void E(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f14256x0) {
            if (drawable.isStateful()) {
                drawable.setState(this.f14237k1);
            }
            drawable.setTintList(this.f14258z0);
            return;
        }
        Drawable drawable2 = this.f14251s0;
        if (drawable == drawable2 && this.f14254v0) {
            drawable2.setTintList(this.f14252t0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void F(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (j0() || i0()) {
            float f5 = this.I0 + this.J0;
            Drawable drawable = this.f14230d1 ? this.E0 : this.f14251s0;
            float intrinsicWidth = this.f14253u0;
            if (intrinsicWidth <= CropImageView.DEFAULT_ASPECT_RATIO && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f11 = rect.left + f5;
                rectF.left = f11;
                rectF.right = f11 + intrinsicWidth;
            } else {
                float f12 = rect.right - f5;
                rectF.right = f12;
                rectF.left = f12 - intrinsicWidth;
            }
            Drawable drawable2 = this.f14230d1 ? this.E0 : this.f14251s0;
            float fCeil = this.f14253u0;
            if (fCeil <= CropImageView.DEFAULT_ASPECT_RATIO && drawable2 != null) {
                fCeil = (float) Math.ceil(ViewUtils.d(this.Q0, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float G() {
        if (!j0() && !i0()) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        float f5 = this.J0;
        Drawable drawable = this.f14230d1 ? this.E0 : this.f14251s0;
        float intrinsicWidth = this.f14253u0;
        if (intrinsicWidth <= CropImageView.DEFAULT_ASPECT_RATIO && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f5 + this.K0;
    }

    public final float H() {
        return k0() ? this.N0 + this.A0 + this.O0 : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public final float I() {
        return this.f14249q1 ? l() : this.f14240m0;
    }

    public final void L() {
        Delegate delegate = (Delegate) this.f14241m1.get();
        if (delegate != null) {
            delegate.a();
        }
    }

    public final boolean M(int[] iArr, int[] iArr2) {
        boolean z11;
        boolean z12;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f14234j0;
        int iD = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.X0) : 0);
        boolean state = true;
        if (this.X0 != iD) {
            this.X0 = iD;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f14236k0;
        int iD2 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.Y0) : 0);
        if (this.Y0 != iD2) {
            this.Y0 = iD2;
            zOnStateChange = true;
        }
        int iC = c.c(iD2, iD);
        if ((this.Z0 != iC) | (this.f15200b.f15217d == null)) {
            this.Z0 = iC;
            r(ColorStateList.valueOf(iC));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f14242n0;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f14227a1) : 0;
        if (this.f14227a1 != colorForState) {
            this.f14227a1 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f14239l1 == null || !RippleUtils.d(iArr)) ? 0 : this.f14239l1.getColorForState(iArr, this.f14228b1);
        if (this.f14228b1 != colorForState2) {
            this.f14228b1 = colorForState2;
        }
        TextAppearance textAppearance = this.W0.f14736g;
        int colorForState3 = (textAppearance == null || (colorStateList = textAppearance.f15094k) == null) ? 0 : colorStateList.getColorForState(iArr, this.f14229c1);
        if (this.f14229c1 != colorForState3) {
            this.f14229c1 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    if (state2[i11] != 16842912) {
                        i11++;
                    } else if (this.C0) {
                        z11 = true;
                        break;
                    }
                }
                z11 = false;
                break;
            }
        } else {
            z11 = false;
            break;
        }
        if (this.f14230d1 == z11 || this.E0 == null) {
            z12 = false;
        } else {
            float fG = G();
            this.f14230d1 = z11;
            if (fG != G()) {
                zOnStateChange = true;
                z12 = true;
            } else {
                z12 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f14233i1;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.e1) : 0;
        if (this.e1 != colorForState4) {
            this.e1 = colorForState4;
            ColorStateList colorStateList6 = this.f14233i1;
            PorterDuff.Mode mode = this.f14235j1;
            this.f14232h1 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (K(this.f14251s0)) {
            state |= this.f14251s0.setState(iArr);
        }
        if (K(this.E0)) {
            state |= this.E0.setState(iArr);
        }
        if (K(this.f14256x0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f14256x0.setState(iArr3);
        }
        if (K(this.f14257y0)) {
            state |= this.f14257y0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z12) {
            L();
        }
        return state;
    }

    public final void N(boolean z11) {
        if (this.C0 != z11) {
            this.C0 = z11;
            float fG = G();
            if (!z11 && this.f14230d1) {
                this.f14230d1 = false;
            }
            float fG2 = G();
            invalidateSelf();
            if (fG != fG2) {
                L();
            }
        }
    }

    public final void O(Drawable drawable) {
        if (this.E0 != drawable) {
            float fG = G();
            this.E0 = drawable;
            float fG2 = G();
            l0(this.E0);
            E(this.E0);
            invalidateSelf();
            if (fG != fG2) {
                L();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.F0 != colorStateList) {
            this.F0 = colorStateList;
            if (this.D0 && (drawable = this.E0) != null && this.C0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Q(boolean z11) {
        if (this.D0 != z11) {
            boolean zI0 = i0();
            this.D0 = z11;
            boolean zI1 = i0();
            if (zI0 != zI1) {
                if (zI1) {
                    E(this.E0);
                } else {
                    l0(this.E0);
                }
                invalidateSelf();
                L();
            }
        }
    }

    public final void R(float f5) {
        if (this.f14240m0 != f5) {
            this.f14240m0 = f5;
            ShapeAppearanceModel.Builder builderH = this.f15200b.f15214a.h();
            builderH.c(f5);
            setShapeAppearanceModel(builderH.a());
        }
    }

    public final void S(Drawable drawable) {
        Drawable drawable2 = this.f14251s0;
        Drawable drawableI0 = drawable2 != null ? a.i0(drawable2) : null;
        if (drawableI0 != drawable) {
            float fG = G();
            this.f14251s0 = drawable != null ? drawable.mutate() : null;
            float fG2 = G();
            l0(drawableI0);
            if (j0()) {
                E(this.f14251s0);
            }
            invalidateSelf();
            if (fG != fG2) {
                L();
            }
        }
    }

    public final void T(float f5) {
        if (this.f14253u0 != f5) {
            float fG = G();
            this.f14253u0 = f5;
            float fG2 = G();
            invalidateSelf();
            if (fG != fG2) {
                L();
            }
        }
    }

    public final void U(ColorStateList colorStateList) {
        this.f14254v0 = true;
        if (this.f14252t0 != colorStateList) {
            this.f14252t0 = colorStateList;
            if (j0()) {
                this.f14251s0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void V(boolean z11) {
        if (this.f14250r0 != z11) {
            boolean zJ0 = j0();
            this.f14250r0 = z11;
            boolean zJ1 = j0();
            if (zJ0 != zJ1) {
                if (zJ1) {
                    E(this.f14251s0);
                } else {
                    l0(this.f14251s0);
                }
                invalidateSelf();
                L();
            }
        }
    }

    public final void W(ColorStateList colorStateList) {
        if (this.f14242n0 != colorStateList) {
            this.f14242n0 = colorStateList;
            if (this.f14249q1) {
                y(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void X(float f5) {
        if (this.f14244o0 != f5) {
            this.f14244o0 = f5;
            this.R0.setStrokeWidth(f5);
            if (this.f14249q1) {
                z(f5);
            }
            invalidateSelf();
        }
    }

    public final void Y(Drawable drawable) {
        Drawable drawable2 = this.f14256x0;
        Drawable drawableI0 = drawable2 != null ? a.i0(drawable2) : null;
        if (drawableI0 != drawable) {
            float fH = H();
            this.f14256x0 = drawable != null ? drawable.mutate() : null;
            this.f14257y0 = new RippleDrawable(RippleUtils.c(this.f14246p0), this.f14256x0, f14226s1);
            float fH2 = H();
            l0(drawableI0);
            if (k0()) {
                E(this.f14256x0);
            }
            invalidateSelf();
            if (fH != fH2) {
                L();
            }
        }
    }

    public final void Z(float f5) {
        if (this.O0 != f5) {
            this.O0 = f5;
            invalidateSelf();
            if (k0()) {
                L();
            }
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public final void a() {
        L();
        invalidateSelf();
    }

    public final void a0(float f5) {
        if (this.A0 != f5) {
            this.A0 = f5;
            invalidateSelf();
            if (k0()) {
                L();
            }
        }
    }

    public final void b0(float f5) {
        if (this.N0 != f5) {
            this.N0 = f5;
            invalidateSelf();
            if (k0()) {
                L();
            }
        }
    }

    public final boolean c0(int[] iArr) {
        if (Arrays.equals(this.f14237k1, iArr)) {
            return false;
        }
        this.f14237k1 = iArr;
        if (k0()) {
            return M(getState(), iArr);
        }
        return false;
    }

    public final void d0(ColorStateList colorStateList) {
        if (this.f14258z0 != colorStateList) {
            this.f14258z0 = colorStateList;
            if (k0()) {
                this.f14256x0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r0v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v12 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v13 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v14 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: android.graphics.RectF
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: android.graphics.RectF
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v1 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v1 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v10 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v2 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v3 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v5 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r22v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v0 'this'  ??, new type: com.google.android.material.chip.ChipDrawable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v10 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v13 ??, new type: android.graphics.drawable.RippleDrawable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v14 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v56 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v56 ??, new type: android.graphics.drawable.Drawable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v58 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v58 ??, new type: android.graphics.drawable.Drawable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: android.graphics.Rect
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: android.graphics.Rect
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r22v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v0 'this'  ??, new type: com.google.android.material.chip.ChipDrawable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v13 ??, new type: android.graphics.drawable.LayerDrawable
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderAllow(TypeUpdate.java:66)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryWiderObjects(FixTypesVisitor.java:795)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:249)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instruction units count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipDrawable.draw(android.graphics.Canvas):void");
    }

    public final void e0(boolean z11) {
        if (this.f14255w0 != z11) {
            boolean zK0 = k0();
            this.f14255w0 = z11;
            boolean zK1 = k0();
            if (zK0 != zK1) {
                if (zK1) {
                    E(this.f14256x0);
                } else {
                    l0(this.f14256x0);
                }
                invalidateSelf();
                L();
            }
        }
    }

    public final void f0(float f5) {
        if (this.K0 != f5) {
            float fG = G();
            this.K0 = f5;
            float fG2 = G();
            invalidateSelf();
            if (fG != fG2) {
                L();
            }
        }
    }

    public final void g0(float f5) {
        if (this.J0 != f5) {
            float fG = G();
            this.J0 = f5;
            float fG2 = G();
            invalidateSelf();
            if (fG != fG2) {
                L();
            }
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f1;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f14231g1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f14238l0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(H() + this.W0.a(this.f14248q0.toString()) + G() + this.I0 + this.L0 + this.M0 + this.P0), this.f14247p1);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f14249q1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f14238l0, this.f14240m0);
        } else {
            outline.setRoundRect(bounds, this.f14240m0);
            outline2 = outline;
        }
        outline2.setAlpha(this.f1 / 255.0f);
    }

    public final void h0(ColorStateList colorStateList) {
        if (this.f14246p0 != colorStateList) {
            this.f14246p0 = colorStateList;
            this.f14239l1 = null;
            onStateChange(getState());
        }
    }

    public final boolean i0() {
        return this.D0 && this.E0 != null && this.f14230d1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (J(this.f14234j0) || J(this.f14236k0) || J(this.f14242n0)) {
            return true;
        }
        TextAppearance textAppearance = this.W0.f14736g;
        if (textAppearance == null || (colorStateList = textAppearance.f15094k) == null || !colorStateList.isStateful()) {
            return (this.D0 && this.E0 != null && this.C0) || K(this.f14251s0) || K(this.E0) || J(this.f14233i1);
        }
        return true;
    }

    public final boolean j0() {
        return this.f14250r0 && this.f14251s0 != null;
    }

    public final boolean k0() {
        return this.f14255w0 && this.f14256x0 != null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i11) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i11);
        if (j0()) {
            zOnLayoutDirectionChanged |= this.f14251s0.setLayoutDirection(i11);
        }
        if (i0()) {
            zOnLayoutDirectionChanged |= this.E0.setLayoutDirection(i11);
        }
        if (k0()) {
            zOnLayoutDirectionChanged |= this.f14256x0.setLayoutDirection(i11);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i11) {
        boolean zOnLevelChange = super.onLevelChange(i11);
        if (j0()) {
            zOnLevelChange |= this.f14251s0.setLevel(i11);
        }
        if (i0()) {
            zOnLevelChange |= this.E0.setLevel(i11);
        }
        if (k0()) {
            zOnLevelChange |= this.f14256x0.setLevel(i11);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public final boolean onStateChange(int[] iArr) {
        if (this.f14249q1) {
            super.onStateChange(iArr);
        }
        return M(iArr, this.f14237k1);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j11);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        if (this.f1 != i11) {
            this.f1 = i11;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f14231g1 != colorFilter) {
            this.f14231g1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f14233i1 != colorStateList) {
            this.f14233i1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f14235j1 != mode) {
            this.f14235j1 = mode;
            ColorStateList colorStateList = this.f14233i1;
            this.f14232h1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z11, boolean z12) {
        boolean visible = super.setVisible(z11, z12);
        if (j0()) {
            visible |= this.f14251s0.setVisible(z11, z12);
        }
        if (i0()) {
            visible |= this.E0.setVisible(z11, z12);
        }
        if (k0()) {
            visible |= this.f14256x0.setVisible(z11, z12);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
