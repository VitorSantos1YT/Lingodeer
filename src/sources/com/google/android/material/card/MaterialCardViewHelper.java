package com.google.android.material.card;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.CutCornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.logging.type.LogSeverity;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import qp.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class MaterialCardViewHelper {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final double f14101y = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final ColorDrawable f14102z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialCardView f14103a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MaterialShapeDrawable f14105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MaterialShapeDrawable f14106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f14111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f14112j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f14113k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f14114l;
    public ShapeAppearanceModel m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f14115n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RippleDrawable f14116o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LayerDrawable f14117p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MaterialShapeDrawable f14118q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14120s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ValueAnimator f14121t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f14122u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f14123v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f14124w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f14104b = new Rect();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f14119r = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f14125x = CropImageView.DEFAULT_ASPECT_RATIO;

    /* JADX INFO: renamed from: com.google.android.material.card.MaterialCardViewHelper$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends InsetDrawable {
        @Override // android.graphics.drawable.Drawable
        public final int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public final int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public final boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        f14102z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public MaterialCardViewHelper(MaterialCardView materialCardView, AttributeSet attributeSet, int i11) {
        this.f14103a = materialCardView;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(materialCardView.getContext(), attributeSet, i11, R.style.Widget_MaterialComponents_CardView);
        this.f14105c = materialShapeDrawable;
        materialShapeDrawable.n(materialCardView.getContext());
        materialShapeDrawable.u(-12303292);
        ShapeAppearanceModel.Builder builderH = materialShapeDrawable.f15200b.f15214a.h();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, w.a.f54364a, i11, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            builderH.c(typedArrayObtainStyledAttributes.getDimension(3, CropImageView.DEFAULT_ASPECT_RATIO));
        }
        this.f14106d = new MaterialShapeDrawable();
        h(builderH.a());
        this.f14122u = MotionUtils.d(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.f13768a);
        this.f14123v = MotionUtils.c(materialCardView.getContext(), R.attr.motionDurationShort2, LogSeverity.NOTICE_VALUE);
        this.f14124w = MotionUtils.c(materialCardView.getContext(), R.attr.motionDurationShort1, LogSeverity.NOTICE_VALUE);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(CornerTreatment cornerTreatment, float f5) {
        if (cornerTreatment instanceof RoundedCornerTreatment) {
            return (float) ((1.0d - f14101y) * ((double) f5));
        }
        return cornerTreatment instanceof CutCornerTreatment ? f5 / 2.0f : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public final float a() {
        CornerTreatment cornerTreatment = this.m.f15245a;
        MaterialShapeDrawable materialShapeDrawable = this.f14105c;
        float fB = b(cornerTreatment, materialShapeDrawable.l());
        CornerTreatment cornerTreatment2 = this.m.f15246b;
        float[] fArr = materialShapeDrawable.f15207e0;
        float fMax = Math.max(fB, b(cornerTreatment2, fArr != null ? fArr[0] : materialShapeDrawable.f15200b.f15214a.f15250f.a(materialShapeDrawable.h())));
        CornerTreatment cornerTreatment3 = this.m.f15247c;
        float[] fArr2 = materialShapeDrawable.f15207e0;
        float fB2 = b(cornerTreatment3, fArr2 != null ? fArr2[1] : materialShapeDrawable.f15200b.f15214a.f15251g.a(materialShapeDrawable.h()));
        CornerTreatment cornerTreatment4 = this.m.f15248d;
        float[] fArr3 = materialShapeDrawable.f15207e0;
        return Math.max(fMax, Math.max(fB2, b(cornerTreatment4, fArr3 != null ? fArr3[2] : materialShapeDrawable.f15200b.f15214a.f15252h.a(materialShapeDrawable.h()))));
    }

    public final LayerDrawable c() {
        if (this.f14116o == null) {
            this.f14118q = new MaterialShapeDrawable(this.m);
            this.f14116o = new RippleDrawable(this.f14113k, null, this.f14118q);
        }
        if (this.f14117p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f14116o, this.f14106d, this.f14112j});
            this.f14117p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f14117p;
    }

    public final Drawable d(Drawable drawable) {
        int iCeil;
        int i11;
        MaterialCardView materialCardView = this.f14103a;
        if (materialCardView.getUseCompatPadding()) {
            float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
            boolean zI = i();
            float fA = CropImageView.DEFAULT_ASPECT_RATIO;
            int iCeil2 = (int) Math.ceil(maxCardElevation + (zI ? a() : 0.0f));
            float maxCardElevation2 = materialCardView.getMaxCardElevation();
            if (i()) {
                fA = a();
            }
            iCeil = (int) Math.ceil(maxCardElevation2 + fA);
            i11 = iCeil2;
        } else {
            iCeil = 0;
            i11 = 0;
        }
        return new AnonymousClass1(drawable, iCeil, i11, iCeil, i11);
    }

    public final void e(int i11, int i12) {
        int iCeil;
        int iCeil2;
        int i13;
        int i14;
        if (this.f14117p != null) {
            MaterialCardView materialCardView = this.f14103a;
            if (materialCardView.getUseCompatPadding()) {
                float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
                boolean zI = i();
                float fA = CropImageView.DEFAULT_ASPECT_RATIO;
                iCeil = (int) Math.ceil((maxCardElevation + (zI ? a() : 0.0f)) * 2.0f);
                float maxCardElevation2 = materialCardView.getMaxCardElevation();
                if (i()) {
                    fA = a();
                }
                iCeil2 = (int) Math.ceil((maxCardElevation2 + fA) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i15 = this.f14109g;
            int i16 = (i15 & 8388613) == 8388613 ? ((i11 - this.f14107e) - this.f14108f) - iCeil2 : this.f14107e;
            int i17 = (i15 & 80) == 80 ? this.f14107e : ((i12 - this.f14107e) - this.f14108f) - iCeil;
            int i18 = (i15 & 8388613) == 8388613 ? this.f14107e : ((i11 - this.f14107e) - this.f14108f) - iCeil2;
            int i19 = (i15 & 80) == 80 ? ((i12 - this.f14107e) - this.f14108f) - iCeil : this.f14107e;
            if (materialCardView.getLayoutDirection() == 1) {
                i14 = i18;
                i13 = i16;
            } else {
                i13 = i18;
                i14 = i16;
            }
            this.f14117p.setLayerInset(2, i14, i19, i13, i17);
        }
    }

    public final void f(boolean z11, boolean z12) {
        Drawable drawable = this.f14112j;
        if (drawable != null) {
            float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
            if (!z12) {
                drawable.setAlpha(z11 ? 255 : 0);
                if (z11) {
                    f5 = 1.0f;
                }
                this.f14125x = f5;
                return;
            }
            if (z11) {
                f5 = 1.0f;
            }
            float f11 = z11 ? 1.0f - this.f14125x : this.f14125x;
            ValueAnimator valueAnimator = this.f14121t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f14121t = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f14125x, f5);
            this.f14121t = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.card.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ColorDrawable colorDrawable = MaterialCardViewHelper.f14102z;
                    MaterialCardViewHelper materialCardViewHelper = this.f14126a;
                    materialCardViewHelper.getClass();
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    materialCardViewHelper.f14112j.setAlpha((int) (255.0f * fFloatValue));
                    materialCardViewHelper.f14125x = fFloatValue;
                }
            });
            this.f14121t.setInterpolator(this.f14122u);
            this.f14121t.setDuration((long) ((z11 ? this.f14123v : this.f14124w) * f11));
            this.f14121t.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f14112j = drawableMutate;
            drawableMutate.setTintList(this.f14114l);
            f(this.f14103a.L, false);
        } else {
            this.f14112j = f14102z;
        }
        LayerDrawable layerDrawable = this.f14117p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f14112j);
        }
    }

    public final void h(ShapeAppearanceModel shapeAppearanceModel) {
        this.m = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.f14105c;
        materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        materialShapeDrawable.Z = !materialShapeDrawable.o();
        MaterialShapeDrawable materialShapeDrawable2 = this.f14106d;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setShapeAppearanceModel(shapeAppearanceModel);
        }
        MaterialShapeDrawable materialShapeDrawable3 = this.f14118q;
        if (materialShapeDrawable3 != null) {
            materialShapeDrawable3.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f14103a;
        return materialCardView.getPreventCornerOverlap() && this.f14105c.o() && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.f14103a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.f14111i;
        Drawable drawableC = j() ? c() : this.f14106d;
        this.f14111i = drawableC;
        if (drawable != drawableC) {
            MaterialCardView materialCardView = this.f14103a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
            } else {
                materialCardView.setForeground(d(drawableC));
            }
        }
    }

    public final void l() {
        MaterialCardView materialCardView = this.f14103a;
        boolean preventCornerOverlap = materialCardView.getPreventCornerOverlap();
        float cardViewRadius = CropImageView.DEFAULT_ASPECT_RATIO;
        float fA = ((!preventCornerOverlap || this.f14105c.o()) && !i()) ? 0.0f : a();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f14101y) * ((double) materialCardView.getCardViewRadius()));
        }
        int i11 = (int) (fA - cardViewRadius);
        Rect rect = this.f14104b;
        materialCardView.f1113c.set(rect.left + i11, rect.top + i11, rect.right + i11, rect.bottom + i11);
        b bVar = materialCardView.f1115e;
        CardView cardView = (CardView) bVar.f47833c;
        if (!cardView.getUseCompatPadding()) {
            bVar.d(0, 0, 0, 0);
            return;
        }
        x.a aVar = (x.a) ((Drawable) bVar.f47832b);
        float f5 = aVar.f55560e;
        float f11 = aVar.f55556a;
        int iCeil = (int) Math.ceil(x.b.a(f5, f11, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(x.b.b(f5, f11, cardView.getPreventCornerOverlap()));
        bVar.d(iCeil, iCeil2, iCeil, iCeil2);
    }

    public final void m() {
        boolean z11 = this.f14119r;
        MaterialCardView materialCardView = this.f14103a;
        if (!z11) {
            materialCardView.setBackgroundInternal(d(this.f14105c));
        }
        materialCardView.setForeground(d(this.f14111i));
    }
}
