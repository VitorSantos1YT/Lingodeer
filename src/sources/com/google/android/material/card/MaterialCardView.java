package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import jh.h;
import o4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialCardView extends CardView implements Checkable, Shapeable {
    public static final int[] O = {R.attr.state_checkable};
    public static final int[] P = {R.attr.state_checked};
    public static final int[] Q = {com.lingodeer.R.attr.state_dragged};
    public final MaterialCardViewHelper H;
    public final boolean K;
    public boolean L;
    public boolean M;
    public OnCheckedChangeListener N;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckedIconGravity {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnCheckedChangeListener {
        void a();
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.H.f14105c.getBounds());
        return rectF;
    }

    public final void d() {
        MaterialCardViewHelper materialCardViewHelper;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (materialCardViewHelper = this.H).f14116o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i11 = bounds.bottom;
        materialCardViewHelper.f14116o.setBounds(bounds.left, bounds.top, bounds.right, i11 - 1);
        materialCardViewHelper.f14116o.setBounds(bounds.left, bounds.top, bounds.right, i11);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.H.f14105c.f15200b.f15217d;
    }

    public ColorStateList getCardForegroundColor() {
        return this.H.f14106d.f15200b.f15217d;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.H.f14112j;
    }

    public int getCheckedIconGravity() {
        return this.H.f14109g;
    }

    public int getCheckedIconMargin() {
        return this.H.f14107e;
    }

    public int getCheckedIconSize() {
        return this.H.f14108f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.H.f14114l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.H.f14104b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.H.f14104b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.H.f14104b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.H.f14104b.top;
    }

    public float getProgress() {
        return this.H.f14105c.f15200b.f15223j;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.H.f14105c.l();
    }

    public ColorStateList getRippleColor() {
        return this.H.f14113k;
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.H.m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.H.f14115n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.H.f14115n;
    }

    public int getStrokeWidth() {
        return this.H.f14110h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.L;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialCardViewHelper materialCardViewHelper = this.H;
        materialCardViewHelper.k();
        MaterialShapeUtils.c(this, materialCardViewHelper.f14105c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i11) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 3);
        MaterialCardViewHelper materialCardViewHelper = this.H;
        if (materialCardViewHelper != null && materialCardViewHelper.f14120s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, O);
        }
        if (this.L) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, P);
        }
        if (this.M) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, Q);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.L);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        MaterialCardViewHelper materialCardViewHelper = this.H;
        accessibilityNodeInfo.setCheckable(materialCardViewHelper != null && materialCardViewHelper.f14120s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.L);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        this.H.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.K) {
            MaterialCardViewHelper materialCardViewHelper = this.H;
            if (!materialCardViewHelper.f14119r) {
                materialCardViewHelper.f14119r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i11) {
        this.H.f14105c.r(ColorStateList.valueOf(i11));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f5) {
        super.setCardElevation(f5);
        MaterialCardViewHelper materialCardViewHelper = this.H;
        materialCardViewHelper.f14105c.q(materialCardViewHelper.f14103a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.H.f14106d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        materialShapeDrawable.r(colorStateList);
    }

    public void setCheckable(boolean z11) {
        this.H.f14120s = z11;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        if (this.L != z11) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.H.g(drawable);
    }

    public void setCheckedIconGravity(int i11) {
        MaterialCardViewHelper materialCardViewHelper = this.H;
        if (materialCardViewHelper.f14109g != i11) {
            materialCardViewHelper.f14109g = i11;
            MaterialCardView materialCardView = materialCardViewHelper.f14103a;
            materialCardViewHelper.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i11) {
        this.H.f14107e = i11;
    }

    public void setCheckedIconMarginResource(int i11) {
        if (i11 != -1) {
            this.H.f14107e = getResources().getDimensionPixelSize(i11);
        }
    }

    public void setCheckedIconResource(int i11) {
        this.H.g(h.k(getContext(), i11));
    }

    public void setCheckedIconSize(int i11) {
        this.H.f14108f = i11;
    }

    public void setCheckedIconSizeResource(int i11) {
        if (i11 != 0) {
            this.H.f14108f = getResources().getDimensionPixelSize(i11);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        MaterialCardViewHelper materialCardViewHelper = this.H;
        materialCardViewHelper.f14114l = colorStateList;
        Drawable drawable = materialCardViewHelper.f14112j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z11) {
        super.setClickable(z11);
        MaterialCardViewHelper materialCardViewHelper = this.H;
        if (materialCardViewHelper != null) {
            materialCardViewHelper.k();
        }
    }

    public void setDragged(boolean z11) {
        if (this.M != z11) {
            this.M = z11;
            refreshDrawableState();
            d();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f5) {
        super.setMaxCardElevation(f5);
        this.H.m();
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.N = onCheckedChangeListener;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z11) {
        super.setPreventCornerOverlap(z11);
        MaterialCardViewHelper materialCardViewHelper = this.H;
        materialCardViewHelper.m();
        materialCardViewHelper.l();
    }

    public void setProgress(float f5) {
        MaterialCardViewHelper materialCardViewHelper = this.H;
        materialCardViewHelper.f14105c.s(f5);
        MaterialShapeDrawable materialShapeDrawable = materialCardViewHelper.f14106d;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.s(f5);
        }
        MaterialShapeDrawable materialShapeDrawable2 = materialCardViewHelper.f14118q;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.s(f5);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f5) {
        super.setRadius(f5);
        MaterialCardViewHelper materialCardViewHelper = this.H;
        ShapeAppearanceModel.Builder builderH = materialCardViewHelper.m.h();
        builderH.c(f5);
        materialCardViewHelper.h(builderH.a());
        materialCardViewHelper.f14111i.invalidateSelf();
        if (materialCardViewHelper.i() || (materialCardViewHelper.f14103a.getPreventCornerOverlap() && !materialCardViewHelper.f14105c.o())) {
            materialCardViewHelper.l();
        }
        if (materialCardViewHelper.i()) {
            materialCardViewHelper.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        MaterialCardViewHelper materialCardViewHelper = this.H;
        materialCardViewHelper.f14113k = colorStateList;
        RippleDrawable rippleDrawable = materialCardViewHelper.f14116o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i11) {
        ColorStateList colorStateListB = c.b(getContext(), i11);
        MaterialCardViewHelper materialCardViewHelper = this.H;
        materialCardViewHelper.f14113k = colorStateListB;
        RippleDrawable rippleDrawable = materialCardViewHelper.f14116o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListB);
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        setClipToOutline(shapeAppearanceModel.g(getBoundsAsRectF()));
        this.H.h(shapeAppearanceModel);
    }

    public void setStrokeColor(int i11) {
        setStrokeColor(ColorStateList.valueOf(i11));
    }

    public void setStrokeWidth(int i11) {
        MaterialCardViewHelper materialCardViewHelper = this.H;
        if (i11 != materialCardViewHelper.f14110h) {
            materialCardViewHelper.f14110h = i11;
            MaterialShapeDrawable materialShapeDrawable = materialCardViewHelper.f14106d;
            ColorStateList colorStateList = materialCardViewHelper.f14115n;
            materialShapeDrawable.z(i11);
            materialShapeDrawable.y(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z11) {
        super.setUseCompatPadding(z11);
        MaterialCardViewHelper materialCardViewHelper = this.H;
        materialCardViewHelper.m();
        materialCardViewHelper.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        MaterialCardViewHelper materialCardViewHelper = this.H;
        if (materialCardViewHelper != null && materialCardViewHelper.f14120s && isEnabled()) {
            this.L = !this.L;
            refreshDrawableState();
            d();
            materialCardViewHelper.f(this.L, true);
            OnCheckedChangeListener onCheckedChangeListener = this.N;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.a();
            }
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.lingodeer.R.attr.materialCardViewStyle);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        MaterialCardViewHelper materialCardViewHelper = this.H;
        if (materialCardViewHelper.f14115n != colorStateList) {
            materialCardViewHelper.f14115n = colorStateList;
            MaterialShapeDrawable materialShapeDrawable = materialCardViewHelper.f14106d;
            materialShapeDrawable.z(materialCardViewHelper.f14110h);
            materialShapeDrawable.y(colorStateList);
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.a(context, attributeSet, i11, com.lingodeer.R.style.Widget_MaterialComponents_CardView), attributeSet, i11);
        this.L = false;
        this.M = false;
        this.K = true;
        TypedArray typedArrayD = ThemeEnforcement.d(getContext(), attributeSet, com.google.android.material.R.styleable.G, i11, com.lingodeer.R.style.Widget_MaterialComponents_CardView, new int[0]);
        MaterialCardViewHelper materialCardViewHelper = new MaterialCardViewHelper(this, attributeSet, i11);
        this.H = materialCardViewHelper;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        MaterialShapeDrawable materialShapeDrawable = materialCardViewHelper.f14105c;
        materialShapeDrawable.r(cardBackgroundColor);
        materialCardViewHelper.f14104b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        materialCardViewHelper.l();
        MaterialCardView materialCardView = materialCardViewHelper.f14103a;
        ColorStateList colorStateListA = MaterialResources.a(materialCardView.getContext(), typedArrayD, 11);
        materialCardViewHelper.f14115n = colorStateListA;
        if (colorStateListA == null) {
            materialCardViewHelper.f14115n = ColorStateList.valueOf(-1);
        }
        materialCardViewHelper.f14110h = typedArrayD.getDimensionPixelSize(12, 0);
        boolean z11 = typedArrayD.getBoolean(0, false);
        materialCardViewHelper.f14120s = z11;
        materialCardView.setLongClickable(z11);
        materialCardViewHelper.f14114l = MaterialResources.a(materialCardView.getContext(), typedArrayD, 6);
        materialCardViewHelper.g(MaterialResources.d(materialCardView.getContext(), typedArrayD, 2));
        materialCardViewHelper.f14108f = typedArrayD.getDimensionPixelSize(5, 0);
        materialCardViewHelper.f14107e = typedArrayD.getDimensionPixelSize(4, 0);
        materialCardViewHelper.f14109g = typedArrayD.getInteger(3, 8388661);
        ColorStateList colorStateListA2 = MaterialResources.a(materialCardView.getContext(), typedArrayD, 7);
        materialCardViewHelper.f14113k = colorStateListA2;
        if (colorStateListA2 == null) {
            materialCardViewHelper.f14113k = ColorStateList.valueOf(MaterialColors.c(materialCardView, com.lingodeer.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListA3 = MaterialResources.a(materialCardView.getContext(), typedArrayD, 1);
        colorStateListA3 = colorStateListA3 == null ? ColorStateList.valueOf(0) : colorStateListA3;
        MaterialShapeDrawable materialShapeDrawable2 = materialCardViewHelper.f14106d;
        materialShapeDrawable2.r(colorStateListA3);
        RippleDrawable rippleDrawable = materialCardViewHelper.f14116o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(materialCardViewHelper.f14113k);
        }
        materialShapeDrawable.q(materialCardView.getCardElevation());
        float f5 = materialCardViewHelper.f14110h;
        ColorStateList colorStateList = materialCardViewHelper.f14115n;
        materialShapeDrawable2.z(f5);
        materialShapeDrawable2.y(colorStateList);
        materialCardView.setBackgroundInternal(materialCardViewHelper.d(materialShapeDrawable));
        Drawable drawableC = materialCardViewHelper.j() ? materialCardViewHelper.c() : materialShapeDrawable2;
        materialCardViewHelper.f14111i = drawableC;
        materialCardView.setForeground(materialCardViewHelper.d(drawableC));
        typedArrayD.recycle();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.H.f14105c.r(colorStateList);
    }
}
