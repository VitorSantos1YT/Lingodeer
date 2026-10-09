package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import ep.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jh.h;
import q4.j;
import qp.m4;
import ra.b;
import ra.c;
import ra.e;
import ra.f;
import ra.g;
import se.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialCheckBox extends AppCompatCheckBox {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int[] f14203d0 = {R.attr.state_indeterminate};

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int[] f14204e0 = {R.attr.state_error};

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int[][] f14205f0 = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f14206g0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public boolean H;
    public boolean K;
    public boolean L;
    public CharSequence M;
    public Drawable N;
    public Drawable O;
    public boolean P;
    public ColorStateList Q;
    public ColorStateList R;
    public PorterDuff.Mode S;
    public int T;
    public int[] U;
    public boolean V;
    public CharSequence W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f14207a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final g f14208b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final c f14209c0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f14210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f14211f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f14212t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckedState {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnCheckedStateChangedListener {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnErrorChangedListener {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.material.checkbox.MaterialCheckBox.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.f14214a = ((Integer) parcel.readValue(SavedState.class.getClassLoader())).intValue();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14214a;

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("MaterialCheckBox.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" CheckedState=");
            int i11 = this.f14214a;
            if (i11 != 1) {
                str = i11 != 2 ? "unchecked" : "indeterminate";
            } else {
                str = "checked";
            }
            return a.k(sb2, str, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeValue(Integer.valueOf(this.f14214a));
        }
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    private String getButtonStateDescription() {
        int i11 = this.T;
        if (i11 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i11 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f14212t == null) {
            int iC = MaterialColors.c(this, R.attr.colorControlActivated);
            int iC2 = MaterialColors.c(this, R.attr.colorError);
            int iC3 = MaterialColors.c(this, R.attr.colorSurface);
            int iC4 = MaterialColors.c(this, R.attr.colorOnSurface);
            this.f14212t = new ColorStateList(f14205f0, new int[]{MaterialColors.f(iC3, 1.0f, iC2), MaterialColors.f(iC3, 1.0f, iC), MaterialColors.f(iC3, 0.54f, iC4), MaterialColors.f(iC3, 0.38f, iC4), MaterialColors.f(iC3, 0.38f, iC4)});
        }
        return this.f14212t;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.Q;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void b() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        gi.g gVar;
        this.N = DrawableUtils.b(this.N, this.Q, getButtonTintMode());
        this.O = DrawableUtils.b(this.O, this.R, this.S);
        if (this.P) {
            g gVar2 = this.f14208b0;
            if (gVar2 != null) {
                e eVar = gVar2.f48995b;
                c cVar = this.f14209c0;
                if (cVar != null) {
                    Drawable drawable = gVar2.f49000a;
                    if (drawable != null) {
                        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                        if (cVar.f48989a == null) {
                            cVar.f48989a = new b(cVar);
                        }
                        f.c(animatedVectorDrawable, cVar.f48989a);
                    }
                    ArrayList arrayList = gVar2.f48998e;
                    if (arrayList != null) {
                        arrayList.remove(cVar);
                        if (gVar2.f48998e.size() == 0 && (gVar = gVar2.f48997d) != null) {
                            eVar.f48992b.removeListener(gVar);
                            gVar2.f48997d = null;
                        }
                    }
                }
                if (cVar != null) {
                    Drawable drawable2 = gVar2.f49000a;
                    if (drawable2 != null) {
                        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                        if (cVar.f48989a == null) {
                            cVar.f48989a = new b(cVar);
                        }
                        f.b(animatedVectorDrawable2, cVar.f48989a);
                    } else {
                        if (gVar2.f48998e == null) {
                            gVar2.f48998e = new ArrayList();
                        }
                        if (!gVar2.f48998e.contains(cVar)) {
                            gVar2.f48998e.add(cVar);
                            if (gVar2.f48997d == null) {
                                gVar2.f48997d = new gi.g(gVar2, 6);
                            }
                            eVar.f48992b.addListener(gVar2.f48997d);
                        }
                    }
                }
            }
            Drawable drawable3 = this.N;
            if ((drawable3 instanceof AnimatedStateListDrawable) && gVar2 != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, gVar2, false);
                ((AnimatedStateListDrawable) this.N).addTransition(R.id.indeterminate, R.id.unchecked, gVar2, false);
            }
        }
        Drawable drawable4 = this.N;
        if (drawable4 != null && (colorStateList2 = this.Q) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.O;
        if (drawable5 != null && (colorStateList = this.R) != null) {
            drawable5.setTintList(colorStateList);
        }
        super.setButtonDrawable(DrawableUtils.a(this.N, this.O, -1, -1));
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.N;
    }

    public Drawable getButtonIconDrawable() {
        return this.O;
    }

    public ColorStateList getButtonIconTintList() {
        return this.R;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.S;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.Q;
    }

    public int getCheckedState() {
        return this.T;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.M;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.T == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.H && this.Q == null && this.R == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i11) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14203d0);
        }
        if (this.L) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14204e0);
        }
        this.U = DrawableUtils.c(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.K || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, CropImageView.DEFAULT_ASPECT_RATIO);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.L) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.M));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f14214a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f14214a = getCheckedState();
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i11) {
        setButtonDrawable(h.k(getContext(), i11));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.O = drawable;
        b();
    }

    public void setButtonIconDrawableResource(int i11) {
        setButtonIconDrawable(h.k(getContext(), i11));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.R == colorStateList) {
            return;
        }
        this.R = colorStateList;
        b();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.S == mode) {
            return;
        }
        this.S = mode;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.Q == colorStateList) {
            return;
        }
        this.Q = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    public void setCenterIfNoTextEnabled(boolean z11) {
        this.K = z11;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z11) {
        setCheckedState(z11 ? 1 : 0);
    }

    public void setCheckedState(int i11) {
        AutofillManager autofillManagerE;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.T != i11) {
            this.T = i11;
            super.setChecked(i11 == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.W == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.V) {
                return;
            }
            this.V = true;
            LinkedHashSet linkedHashSet = this.f14211f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((OnCheckedStateChangedListener) it.next()).a();
                }
            }
            if (this.T != 2 && (onCheckedChangeListener = this.f14207a0) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManagerE = n.e(getContext().getSystemService(n.j()))) != null) {
                autofillManagerE.notifyValueChanged(this);
            }
            this.V = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.M = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i11) {
        setErrorAccessibilityLabel(i11 != 0 ? getResources().getText(i11) : null);
    }

    public void setErrorShown(boolean z11) {
        if (this.L == z11) {
            return;
        }
        this.L = z11;
        refreshDrawableState();
        Iterator it = this.f14210e.iterator();
        while (it.hasNext()) {
            ((OnErrorChangedListener) it.next()).a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f14207a0 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.W = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z11) {
        this.H = z11;
        if (z11) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.N = drawable;
        this.P = false;
        b();
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.a(context, attributeSet, i11, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, i11);
        this.f14210e = new LinkedHashSet();
        this.f14211f = new LinkedHashSet();
        Context context2 = getContext();
        g gVar = new g(context2, 0);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = j.f47447a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        drawable.setCallback(gVar.f48999f);
        new ge.c(drawable.getConstantState(), 1);
        gVar.f49000a = drawable;
        this.f14208b0 = gVar;
        this.f14209c0 = new c() { // from class: com.google.android.material.checkbox.MaterialCheckBox.1
            @Override // ra.c
            public final void a(Drawable drawable2) {
                ColorStateList colorStateList = MaterialCheckBox.this.Q;
                if (colorStateList != null) {
                    drawable2.setTintList(colorStateList);
                }
            }

            @Override // ra.c
            public final void b(Drawable drawable2) {
                MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
                ColorStateList colorStateList = materialCheckBox.Q;
                if (colorStateList != null) {
                    drawable2.setTint(colorStateList.getColorForState(materialCheckBox.U, colorStateList.getDefaultColor()));
                }
            }
        };
        Context context3 = getContext();
        this.N = getButtonDrawable();
        this.Q = getSuperButtonTintList();
        setSupportButtonTintList(null);
        m4 m4VarE = ThemeEnforcement.e(context3, attributeSet, com.google.android.material.R.styleable.H, i11, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArray = (TypedArray) m4VarE.f48061c;
        this.O = m4VarE.g(2);
        if (this.N != null && MaterialAttributes.b(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == f14206g0 && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.N = h.k(context3, R.drawable.mtrl_checkbox_button);
                this.P = true;
                if (this.O == null) {
                    this.O = h.k(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.R = MaterialResources.b(context3, m4VarE, 3);
        this.S = ViewUtils.h(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.H = typedArray.getBoolean(10, false);
        this.K = typedArray.getBoolean(6, true);
        this.L = typedArray.getBoolean(9, false);
        this.M = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        m4VarE.l();
        b();
    }
}
