package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.shape.StateListShapeAppearanceModel;
import com.lingodeer.R;
import u5.g;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class MaterialButtonHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialButton f14075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ShapeAppearanceModel f14076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public StateListShapeAppearanceModel f14077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f14078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MaterialShapeDrawable.OnCornerSizeChangeListener f14079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14083i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14084j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14085k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f14086l;
    public ColorStateList m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f14087n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f14088o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MaterialShapeDrawable f14089p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14093t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RippleDrawable f14095v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14096w;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14090q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f14091r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14092s = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14094u = true;

    public MaterialButtonHelper(MaterialButton materialButton, ShapeAppearanceModel shapeAppearanceModel) {
        this.f14075a = materialButton;
        this.f14076b = shapeAppearanceModel;
    }

    public final MaterialShapeDrawable a(boolean z11) {
        RippleDrawable rippleDrawable = this.f14095v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.f14095v.getDrawable(0)).getDrawable()).getDrawable(!z11 ? 1 : 0);
    }

    public final void b(int i11, int i12) {
        MaterialButton materialButton = this.f14075a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i13 = this.f14082h;
        int i14 = this.f14083i;
        this.f14083i = i12;
        this.f14082h = i11;
        if (!this.f14091r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i11) - i13, paddingEnd, (paddingBottom + i12) - i14);
    }

    public final void c() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f14076b);
        StateListShapeAppearanceModel stateListShapeAppearanceModel = this.f14077c;
        if (stateListShapeAppearanceModel != null) {
            materialShapeDrawable.x(stateListShapeAppearanceModel);
        }
        g gVar = this.f14078d;
        if (gVar != null) {
            materialShapeDrawable.p(gVar);
        }
        MaterialShapeDrawable.OnCornerSizeChangeListener onCornerSizeChangeListener = this.f14079e;
        if (onCornerSizeChangeListener != null) {
            materialShapeDrawable.f15210g0 = onCornerSizeChangeListener;
        }
        MaterialButton materialButton = this.f14075a;
        materialShapeDrawable.n(materialButton.getContext());
        materialShapeDrawable.setTintList(this.m);
        PorterDuff.Mode mode = this.f14086l;
        if (mode != null) {
            materialShapeDrawable.setTintMode(mode);
        }
        float f5 = this.f14085k;
        ColorStateList colorStateList = this.f14087n;
        materialShapeDrawable.z(f5);
        materialShapeDrawable.y(colorStateList);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.f14076b);
        StateListShapeAppearanceModel stateListShapeAppearanceModel2 = this.f14077c;
        if (stateListShapeAppearanceModel2 != null) {
            materialShapeDrawable2.x(stateListShapeAppearanceModel2);
        }
        g gVar2 = this.f14078d;
        if (gVar2 != null) {
            materialShapeDrawable2.p(gVar2);
        }
        materialShapeDrawable2.setTint(0);
        float f11 = this.f14085k;
        int iC = this.f14090q ? MaterialColors.c(materialButton, R.attr.colorSurface) : 0;
        materialShapeDrawable2.z(f11);
        materialShapeDrawable2.y(ColorStateList.valueOf(iC));
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.f14076b);
        this.f14089p = materialShapeDrawable3;
        StateListShapeAppearanceModel stateListShapeAppearanceModel3 = this.f14077c;
        if (stateListShapeAppearanceModel3 != null) {
            materialShapeDrawable3.x(stateListShapeAppearanceModel3);
        }
        g gVar3 = this.f14078d;
        if (gVar3 != null) {
            this.f14089p.p(gVar3);
        }
        this.f14089p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.c(this.f14088o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable}), this.f14080f, this.f14082h, this.f14081g, this.f14083i), this.f14089p);
        this.f14095v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        MaterialShapeDrawable materialShapeDrawableA = a(false);
        if (materialShapeDrawableA != null) {
            materialShapeDrawableA.q(this.f14096w);
            materialShapeDrawableA.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        Shapeable shapeable;
        MaterialShapeDrawable materialShapeDrawableA = a(false);
        if (materialShapeDrawableA != null) {
            StateListShapeAppearanceModel stateListShapeAppearanceModel = this.f14077c;
            if (stateListShapeAppearanceModel != null) {
                materialShapeDrawableA.x(stateListShapeAppearanceModel);
            } else {
                materialShapeDrawableA.setShapeAppearanceModel(this.f14076b);
            }
            g gVar = this.f14078d;
            if (gVar != null) {
                materialShapeDrawableA.p(gVar);
            }
        }
        MaterialShapeDrawable materialShapeDrawableA2 = a(true);
        if (materialShapeDrawableA2 != null) {
            StateListShapeAppearanceModel stateListShapeAppearanceModel2 = this.f14077c;
            if (stateListShapeAppearanceModel2 != null) {
                materialShapeDrawableA2.x(stateListShapeAppearanceModel2);
            } else {
                materialShapeDrawableA2.setShapeAppearanceModel(this.f14076b);
            }
            g gVar2 = this.f14078d;
            if (gVar2 != null) {
                materialShapeDrawableA2.p(gVar2);
            }
        }
        RippleDrawable rippleDrawable = this.f14095v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            shapeable = null;
        } else {
            shapeable = this.f14095v.getNumberOfLayers() > 2 ? (Shapeable) this.f14095v.getDrawable(2) : (Shapeable) this.f14095v.getDrawable(1);
        }
        if (shapeable != null) {
            shapeable.setShapeAppearanceModel(this.f14076b);
            if (shapeable instanceof MaterialShapeDrawable) {
                MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) shapeable;
                StateListShapeAppearanceModel stateListShapeAppearanceModel3 = this.f14077c;
                if (stateListShapeAppearanceModel3 != null) {
                    materialShapeDrawable.x(stateListShapeAppearanceModel3);
                }
                g gVar3 = this.f14078d;
                if (gVar3 != null) {
                    materialShapeDrawable.p(gVar3);
                }
            }
        }
    }

    public final void e() {
        MaterialShapeDrawable materialShapeDrawableA = a(false);
        MaterialShapeDrawable materialShapeDrawableA2 = a(true);
        if (materialShapeDrawableA != null) {
            float f5 = this.f14085k;
            ColorStateList colorStateList = this.f14087n;
            materialShapeDrawableA.z(f5);
            materialShapeDrawableA.y(colorStateList);
            if (materialShapeDrawableA2 != null) {
                float f11 = this.f14085k;
                int iC = this.f14090q ? MaterialColors.c(this.f14075a, R.attr.colorSurface) : 0;
                materialShapeDrawableA2.z(f11);
                materialShapeDrawableA2.y(ColorStateList.valueOf(iC));
            }
        }
    }
}
