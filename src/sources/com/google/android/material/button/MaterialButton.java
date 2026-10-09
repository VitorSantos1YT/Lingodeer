package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.shape.StateListShapeAppearanceModel;
import com.google.android.material.shape.StateListSizeChange;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jh.h;
import u5.f;
import u5.g;
import v10.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialButton extends AppCompatButton implements Checkable, Shapeable {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int[] f14047k0 = {R.attr.state_checkable};

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int[] f14048l0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final c f14049m0 = new AnonymousClass1();
    public ColorStateList H;
    public Drawable K;
    public String L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public float U;
    public int V;
    public int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public LinearLayout.LayoutParams f14050a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f14051b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f14052c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MaterialButtonHelper f14053d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f14054d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f14055e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f14056e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OnPressedChangeListener f14057f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public StateListSizeChange f14058f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f14059g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f14060h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public float f14061i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public f f14062j0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f14063t;

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AnonymousClass1 extends c {
        @Override // v10.c
        public final void K(Object obj, float f5) {
            ((MaterialButton) obj).setDisplayedWidthIncrease(f5);
        }

        @Override // v10.c
        public final float x(Object obj) {
            return ((MaterialButton) obj).getDisplayedWidthIncrease();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface IconGravity {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f14064a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14065b;

        public final void mapProperties(PropertyMapper propertyMapper) {
            this.f14065b = propertyMapper.mapInt("iconPadding", com.lingodeer.R.attr.iconPadding);
            this.f14064a = true;
        }

        public final void readProperties(Object obj, PropertyReader propertyReader) {
            MaterialButton materialButton = (MaterialButton) obj;
            if (!this.f14064a) {
                throw new android.view.inspector.InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readInt(this.f14065b, materialButton.getIconPadding());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnCheckedChangeListener {
        void a(MaterialButton materialButton, boolean z11);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnPressedChangeListener {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SavedState extends k5.b {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.button.MaterialButton.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i11) {
                return new SavedState[i11];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f14066c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.f14066c = parcel.readInt() == 1;
        }

        @Override // k5.b, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f14066c ? 1 : 0);
        }
    }

    public MaterialButton(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.f14052c0 = materialButton.getOpticalCenterShift();
        materialButton.j();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.f14060h0;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        MaterialShapeDrawable materialShapeDrawableA;
        if (this.f14051b0 && this.f14054d0 && (materialShapeDrawableA = this.f14053d.a(false)) != null) {
            return (int) (materialShapeDrawableA.i() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = CropImageView.DEFAULT_ASPECT_RATIO;
        for (int i11 = 0; i11 < lineCount; i11++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i11));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z11) {
        MaterialButtonHelper materialButtonHelper = this.f14053d;
        if (materialButtonHelper == null || !materialButtonHelper.f14093t || this.Q == z11) {
            return;
        }
        this.Q = z11;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z12 = this.Q;
            if (!materialButtonToggleGroup.O) {
                materialButtonToggleGroup.f(getId(), z12);
            }
        }
        if (this.R) {
            return;
        }
        this.R = true;
        Iterator it = this.f14055e.iterator();
        while (it.hasNext()) {
            ((OnCheckedChangeListener) it.next()).a(this, this.Q);
        }
        this.R = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f5) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.f14060h0 != f5) {
            this.f14060h0 = f5;
            j();
            invalidate();
            if (getParent() instanceof MaterialButtonGroup) {
                MaterialButtonGroup materialButtonGroup = (MaterialButtonGroup) getParent();
                int i11 = (int) this.f14060h0;
                int iIndexOfChild = materialButtonGroup.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                int i12 = iIndexOfChild - 1;
                while (true) {
                    materialButton = null;
                    if (i12 < 0) {
                        materialButton2 = null;
                        break;
                    } else {
                        if (materialButtonGroup.c(i12)) {
                            materialButton2 = (MaterialButton) materialButtonGroup.getChildAt(i12);
                            break;
                        }
                        i12--;
                    }
                }
                int childCount = materialButtonGroup.getChildCount();
                while (true) {
                    iIndexOfChild++;
                    if (iIndexOfChild >= childCount) {
                        break;
                    } else if (materialButtonGroup.c(iIndexOfChild)) {
                        materialButton = (MaterialButton) materialButtonGroup.getChildAt(iIndexOfChild);
                        break;
                    }
                }
                if (materialButton2 == null && materialButton == null) {
                    return;
                }
                if (materialButton2 == null) {
                    materialButton.setDisplayedWidthDecrease(i11);
                }
                if (materialButton == null) {
                    materialButton2.setDisplayedWidthDecrease(i11);
                }
                if (materialButton2 == null || materialButton == null) {
                    return;
                }
                materialButton2.setDisplayedWidthDecrease(i11 / 2);
                materialButton.setDisplayedWidthDecrease((i11 + 1) / 2);
            }
        }
    }

    public final g d() {
        Context context = getContext();
        TypedValue typedValueA = MaterialAttributes.a(context, com.lingodeer.R.attr.motionSpringFastSpatial);
        int[] iArr = com.google.android.material.R.styleable.L;
        TypedArray typedArrayObtainStyledAttributes = typedValueA == null ? context.obtainStyledAttributes(null, iArr, 0, com.lingodeer.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueA.resourceId, iArr);
        g gVar = new g();
        try {
            float f5 = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f5 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f11 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f11 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            gVar.b(f5);
            gVar.a(f11);
            typedArrayObtainStyledAttributes.recycle();
            return gVar;
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final boolean e() {
        MaterialButtonHelper materialButtonHelper = this.f14053d;
        return (materialButtonHelper == null || materialButtonHelper.f14091r) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public final void f(boolean z11) {
        int i11;
        if (this.f14058f0 == null) {
            return;
        }
        if (this.f14062j0 == null) {
            f fVar = new f(this, f14049m0);
            this.f14062j0 = fVar;
            fVar.m = d();
        }
        if (this.f14054d0) {
            int i12 = this.f14059g0;
            StateListSizeChange stateListSizeChange = this.f14058f0;
            int[] drawableState = getDrawableState();
            int[][] iArr = stateListSizeChange.f15343c;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i11 = -1;
                if (i14 >= stateListSizeChange.f15341a) {
                    i14 = -1;
                    break;
                } else if (StateSet.stateSetMatches(iArr[i14], drawableState)) {
                    break;
                } else {
                    i14++;
                }
            }
            if (i14 < 0) {
                int[] iArr2 = StateSet.WILD_CARD;
                int[][] iArr3 = stateListSizeChange.f15343c;
                for (int i15 = 0; i15 < stateListSizeChange.f15341a; i15++) {
                    if (StateSet.stateSetMatches(iArr3[i15], iArr2)) {
                        i11 = i15;
                        break;
                    }
                }
                i14 = i11;
            }
            StateListSizeChange.SizeChangeAmount sizeChangeAmount = (i14 < 0 ? stateListSizeChange.f15342b : stateListSizeChange.f15344d[i14]).f15345a;
            int width = getWidth();
            float f5 = sizeChangeAmount.f15347b;
            StateListSizeChange.SizeChangeType sizeChangeType = sizeChangeAmount.f15346a;
            if (sizeChangeType != StateListSizeChange.SizeChangeType.PERCENT) {
                if (sizeChangeType == StateListSizeChange.SizeChangeType.PIXELS) {
                }
                this.f14062j0.a(Math.min(i12, i13));
                if (z11) {
                    this.f14062j0.d();
                }
            }
            f5 *= width;
            i13 = (int) f5;
            this.f14062j0.a(Math.min(i12, i13));
            if (z11) {
                this.f14062j0.d();
            }
        }
    }

    public final void g() {
        int i11 = this.S;
        if (i11 == 1 || i11 == 2) {
            setCompoundDrawablesRelative(this.K, null, null, null);
            return;
        }
        if (i11 == 3 || i11 == 4) {
            setCompoundDrawablesRelative(null, null, this.K, null);
        } else if (i11 == 16 || i11 == 32) {
            setCompoundDrawablesRelative(null, this.K, null, null);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.L)) {
            return this.L;
        }
        MaterialButtonHelper materialButtonHelper = this.f14053d;
        return ((materialButtonHelper == null || !materialButtonHelper.f14093t) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.f14056e0;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.f14053d.f14084j;
        }
        return 0;
    }

    public g getCornerSpringForce() {
        return this.f14053d.f14078d;
    }

    public Drawable getIcon() {
        return this.K;
    }

    public int getIconGravity() {
        return this.S;
    }

    public int getIconPadding() {
        return this.P;
    }

    public int getIconSize() {
        return this.M;
    }

    public ColorStateList getIconTint() {
        return this.H;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f14063t;
    }

    public int getInsetBottom() {
        return this.f14053d.f14083i;
    }

    public int getInsetTop() {
        return this.f14053d.f14082h;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.f14053d.f14088o;
        }
        return null;
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
        if (e()) {
            return this.f14053d.f14076b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public StateListShapeAppearanceModel getStateListShapeAppearanceModel() {
        if (e()) {
            return this.f14053d.f14077c;
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.f14053d.f14087n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.f14053d.f14085k;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return e() ? this.f14053d.m : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return e() ? this.f14053d.f14086l : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z11) {
        Drawable drawable = this.K;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.K = drawableMutate;
            drawableMutate.setTintList(this.H);
            PorterDuff.Mode mode = this.f14063t;
            if (mode != null) {
                this.K.setTintMode(mode);
            }
            int intrinsicWidth = this.M;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.K.getIntrinsicWidth();
            }
            int intrinsicHeight = this.M;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.K.getIntrinsicHeight();
            }
            Drawable drawable2 = this.K;
            int i11 = this.N;
            int i12 = this.O;
            drawable2.setBounds(i11, i12, intrinsicWidth + i11, intrinsicHeight + i12);
            this.K.setVisible(true, z11);
        }
        if (z11) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i13 = this.S;
        if (((i13 == 1 || i13 == 2) && drawable3 != this.K) || (((i13 == 3 || i13 == 4) && drawable5 != this.K) || ((i13 == 16 || i13 == 32) && drawable4 != this.K))) {
            g();
        }
    }

    public final void i(int i11, int i12) {
        if (this.K == null || getLayout() == null) {
            return;
        }
        int i13 = this.S;
        if (i13 != 1 && i13 != 2 && i13 != 3 && i13 != 4) {
            if (i13 == 16 || i13 == 32) {
                this.N = 0;
                if (i13 == 16) {
                    this.O = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.M;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.K.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i12 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.P) - getPaddingBottom()) / 2);
                if (this.O != iMax) {
                    this.O = iMax;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.O = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i14 = this.S;
        if (i14 == 1 || i14 == 3 || ((i14 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i14 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.N = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.M;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.K.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i11 - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.P) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.S == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.N != textLayoutWidth) {
            this.N = textLayoutWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.Q;
    }

    public final void j() {
        int i11 = (int) (this.f14060h0 - this.f14061i0);
        int i12 = (i11 / 2) + this.f14052c0;
        getLayoutParams().width = (int) (this.U + i11);
        setPaddingRelative(this.V + i12, getPaddingTop(), (this.W + i11) - i12, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            MaterialShapeUtils.c(this, this.f14053d.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i11) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 2);
        MaterialButtonHelper materialButtonHelper = this.f14053d;
        if (materialButtonHelper != null && materialButtonHelper.f14093t) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14047k0);
        }
        if (this.Q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14048l0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.Q);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        MaterialButtonHelper materialButtonHelper = this.f14053d;
        accessibilityNodeInfo.setCheckable(materialButtonHelper != null && materialButtonHelper.f14093t);
        accessibilityNodeInfo.setChecked(this.Q);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        super.onLayout(z11, i11, i12, i13, i14);
        i(getMeasuredWidth(), getMeasuredHeight());
        int i16 = getResources().getConfiguration().orientation;
        if (this.T != i16) {
            this.T = i16;
            this.U = -1.0f;
        }
        if (this.U == -1.0f) {
            this.U = getMeasuredWidth();
            if (this.f14050a0 == null && (getParent() instanceof MaterialButtonGroup) && ((MaterialButtonGroup) getParent()).getButtonSizeChange() != null) {
                this.f14050a0 = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f14050a0);
                layoutParams.width = (int) this.U;
                setLayoutParams(layoutParams);
            }
        }
        boolean z12 = false;
        if (this.f14056e0 == -1) {
            if (this.K == null) {
                i15 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.M;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.K.getIntrinsicWidth();
                }
                i15 = iconPadding + intrinsicWidth;
            }
            this.f14056e0 = (getMeasuredWidth() - getTextLayoutWidth()) - i15;
        }
        if (this.V == -1) {
            this.V = getPaddingStart();
        }
        if (this.W == -1) {
            this.W = getPaddingEnd();
        }
        if ((getParent() instanceof MaterialButtonGroup) && ((MaterialButtonGroup) getParent()).getOrientation() == 0) {
            z12 = true;
        }
        this.f14054d0 = z12;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f37910a);
        setChecked(savedState.f14066c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f14066c = this.Q;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        super.onTextChanged(charSequence, i11, i12, i13);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.f14053d.f14094u) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.K != null) {
            if (this.K.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.L = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        if (!e()) {
            super.setBackgroundColor(i11);
            return;
        }
        MaterialButtonHelper materialButtonHelper = this.f14053d;
        if (materialButtonHelper.a(false) != null) {
            materialButtonHelper.a(false).setTint(i11);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!e()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        MaterialButtonHelper materialButtonHelper = this.f14053d;
        materialButtonHelper.f14091r = true;
        MaterialButton materialButton = materialButtonHelper.f14075a;
        materialButton.setSupportBackgroundTintList(materialButtonHelper.m);
        materialButton.setSupportBackgroundTintMode(materialButtonHelper.f14086l);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i11) {
        setBackgroundDrawable(i11 != 0 ? h.k(getContext(), i11) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z11) {
        if (e()) {
            this.f14053d.f14093t = z11;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        setCheckedInternal(z11);
    }

    public void setCornerRadius(int i11) {
        if (e()) {
            MaterialButtonHelper materialButtonHelper = this.f14053d;
            if (materialButtonHelper.f14092s && materialButtonHelper.f14084j == i11) {
                return;
            }
            materialButtonHelper.f14084j = i11;
            materialButtonHelper.f14092s = true;
            ShapeAppearanceModel.Builder builderH = materialButtonHelper.f14076b.h();
            builderH.c(i11);
            materialButtonHelper.f14076b = builderH.a();
            materialButtonHelper.f14077c = null;
            materialButtonHelper.d();
        }
    }

    public void setCornerRadiusResource(int i11) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i11));
        }
    }

    public void setCornerSpringForce(g gVar) {
        MaterialButtonHelper materialButtonHelper = this.f14053d;
        materialButtonHelper.f14078d = gVar;
        if (materialButtonHelper.f14077c != null) {
            materialButtonHelper.d();
        }
    }

    public void setDisplayedWidthDecrease(int i11) {
        this.f14061i0 = Math.min(i11, this.f14056e0);
        j();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        if (e()) {
            this.f14053d.a(false).q(f5);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.K != drawable) {
            this.K = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i11) {
        if (this.S != i11) {
            this.S = i11;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i11) {
        if (this.P != i11) {
            this.P = i11;
            setCompoundDrawablePadding(i11);
        }
    }

    public void setIconResource(int i11) {
        setIcon(i11 != 0 ? h.k(getContext(), i11) : null);
    }

    public void setIconSize(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.M != i11) {
            this.M = i11;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f14063t != mode) {
            this.f14063t = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i11) {
        setIconTint(o4.c.b(getContext(), i11));
    }

    public void setInsetBottom(int i11) {
        MaterialButtonHelper materialButtonHelper = this.f14053d;
        materialButtonHelper.b(materialButtonHelper.f14082h, i11);
    }

    public void setInsetTop(int i11) {
        MaterialButtonHelper materialButtonHelper = this.f14053d;
        materialButtonHelper.b(i11, materialButtonHelper.f14083i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(OnPressedChangeListener onPressedChangeListener) {
        this.f14057f = onPressedChangeListener;
    }

    public void setOpticalCenterEnabled(boolean z11) {
        if (this.f14051b0 != z11) {
            this.f14051b0 = z11;
            MaterialButtonHelper materialButtonHelper = this.f14053d;
            if (z11) {
                app.rive.runtime.kotlin.core.a aVar = new app.rive.runtime.kotlin.core.a(this, 22);
                materialButtonHelper.f14079e = aVar;
                MaterialShapeDrawable materialShapeDrawableA = materialButtonHelper.a(false);
                if (materialShapeDrawableA != null) {
                    materialShapeDrawableA.f15210g0 = aVar;
                }
            } else {
                materialButtonHelper.f14079e = null;
                MaterialShapeDrawable materialShapeDrawableA2 = materialButtonHelper.a(false);
                if (materialShapeDrawableA2 != null) {
                    materialShapeDrawableA2.f15210g0 = null;
                }
            }
            post(new b2.a(this, 5));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z11) {
        OnPressedChangeListener onPressedChangeListener = this.f14057f;
        if (onPressedChangeListener != null) {
            onPressedChangeListener.a();
        }
        super.setPressed(z11);
        f(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            MaterialButtonHelper materialButtonHelper = this.f14053d;
            MaterialButton materialButton = materialButtonHelper.f14075a;
            if (materialButtonHelper.f14088o != colorStateList) {
                materialButtonHelper.f14088o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(RippleUtils.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i11) {
        if (e()) {
            setRippleColor(o4.c.b(getContext(), i11));
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        MaterialButtonHelper materialButtonHelper = this.f14053d;
        materialButtonHelper.f14076b = shapeAppearanceModel;
        materialButtonHelper.f14077c = null;
        materialButtonHelper.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z11) {
        if (e()) {
            MaterialButtonHelper materialButtonHelper = this.f14053d;
            materialButtonHelper.f14090q = z11;
            materialButtonHelper.e();
        }
    }

    public void setSizeChange(StateListSizeChange stateListSizeChange) {
        if (this.f14058f0 != stateListSizeChange) {
            this.f14058f0 = stateListSizeChange;
            f(true);
        }
    }

    public void setStateListShapeAppearanceModel(StateListShapeAppearanceModel stateListShapeAppearanceModel) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        MaterialButtonHelper materialButtonHelper = this.f14053d;
        if (materialButtonHelper.f14078d == null && stateListShapeAppearanceModel.d()) {
            materialButtonHelper.f14078d = d();
            if (materialButtonHelper.f14077c != null) {
                materialButtonHelper.d();
            }
        }
        materialButtonHelper.f14077c = stateListShapeAppearanceModel;
        materialButtonHelper.d();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            MaterialButtonHelper materialButtonHelper = this.f14053d;
            if (materialButtonHelper.f14087n != colorStateList) {
                materialButtonHelper.f14087n = colorStateList;
                materialButtonHelper.e();
            }
        }
    }

    public void setStrokeColorResource(int i11) {
        if (e()) {
            setStrokeColor(o4.c.b(getContext(), i11));
        }
    }

    public void setStrokeWidth(int i11) {
        if (e()) {
            MaterialButtonHelper materialButtonHelper = this.f14053d;
            if (materialButtonHelper.f14085k != i11) {
                materialButtonHelper.f14085k = i11;
                materialButtonHelper.e();
            }
        }
    }

    public void setStrokeWidthResource(int i11) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i11));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!e()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        MaterialButtonHelper materialButtonHelper = this.f14053d;
        if (materialButtonHelper.m != colorStateList) {
            materialButtonHelper.m = colorStateList;
            if (materialButtonHelper.a(false) != null) {
                materialButtonHelper.a(false).setTintList(materialButtonHelper.m);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!e()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        MaterialButtonHelper materialButtonHelper = this.f14053d;
        if (materialButtonHelper.f14086l != mode) {
            materialButtonHelper.f14086l = mode;
            if (materialButtonHelper.a(false) == null || materialButtonHelper.f14086l == null) {
                return;
            }
            materialButtonHelper.a(false).setTintMode(materialButtonHelper.f14086l);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i11) {
        super.setTextAlignment(i11);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z11) {
        this.f14053d.f14094u = z11;
    }

    @Override // android.widget.TextView
    public void setWidth(int i11) {
        this.U = -1.0f;
        super.setWidth(i11);
    }

    public void setWidthChangeMax(int i11) {
        if (this.f14059g0 != i11) {
            this.f14059g0 = i11;
            f(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.Q);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.lingodeer.R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i11) {
        ShapeAppearanceModel shapeAppearanceModelA;
        super(MaterialThemeOverlay.b(context, attributeSet, i11, com.lingodeer.R.style.Widget_MaterialComponents_Button, new int[]{com.lingodeer.R.attr.materialSizeOverlay}), attributeSet, i11);
        this.f14055e = new LinkedHashSet();
        this.Q = false;
        this.R = false;
        this.T = -1;
        this.U = -1.0f;
        this.V = -1;
        this.W = -1;
        this.f14056e0 = -1;
        Context context2 = getContext();
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.B, i11, com.lingodeer.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.P = typedArrayD.getDimensionPixelSize(13, 0);
        int i12 = typedArrayD.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f14063t = ViewUtils.h(i12, mode);
        this.H = MaterialResources.a(getContext(), typedArrayD, 15);
        this.K = MaterialResources.d(getContext(), typedArrayD, 11);
        this.S = typedArrayD.getInteger(12, 1);
        this.M = typedArrayD.getDimensionPixelSize(14, 0);
        StateListShapeAppearanceModel stateListShapeAppearanceModelB = StateListShapeAppearanceModel.b(context2, typedArrayD, 19);
        if (stateListShapeAppearanceModelB != null) {
            shapeAppearanceModelA = stateListShapeAppearanceModelB.c();
        } else {
            shapeAppearanceModelA = ShapeAppearanceModel.d(context2, attributeSet, i11, com.lingodeer.R.style.Widget_MaterialComponents_Button).a();
        }
        boolean z11 = typedArrayD.getBoolean(17, false);
        MaterialButtonHelper materialButtonHelper = new MaterialButtonHelper(this, shapeAppearanceModelA);
        this.f14053d = materialButtonHelper;
        materialButtonHelper.f14080f = typedArrayD.getDimensionPixelOffset(2, 0);
        materialButtonHelper.f14081g = typedArrayD.getDimensionPixelOffset(3, 0);
        materialButtonHelper.f14082h = typedArrayD.getDimensionPixelOffset(4, 0);
        materialButtonHelper.f14083i = typedArrayD.getDimensionPixelOffset(5, 0);
        if (typedArrayD.hasValue(9)) {
            int dimensionPixelSize = typedArrayD.getDimensionPixelSize(9, -1);
            materialButtonHelper.f14084j = dimensionPixelSize;
            ShapeAppearanceModel.Builder builderH = materialButtonHelper.f14076b.h();
            builderH.c(dimensionPixelSize);
            materialButtonHelper.f14076b = builderH.a();
            materialButtonHelper.f14077c = null;
            materialButtonHelper.d();
            materialButtonHelper.f14092s = true;
        }
        materialButtonHelper.f14085k = typedArrayD.getDimensionPixelSize(22, 0);
        materialButtonHelper.f14086l = ViewUtils.h(typedArrayD.getInt(8, -1), mode);
        materialButtonHelper.m = MaterialResources.a(getContext(), typedArrayD, 7);
        materialButtonHelper.f14087n = MaterialResources.a(getContext(), typedArrayD, 21);
        materialButtonHelper.f14088o = MaterialResources.a(getContext(), typedArrayD, 18);
        materialButtonHelper.f14093t = typedArrayD.getBoolean(6, false);
        materialButtonHelper.f14096w = typedArrayD.getDimensionPixelSize(10, 0);
        materialButtonHelper.f14094u = typedArrayD.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayD.hasValue(0)) {
            materialButtonHelper.f14091r = true;
            setSupportBackgroundTintList(materialButtonHelper.m);
            setSupportBackgroundTintMode(materialButtonHelper.f14086l);
        } else {
            materialButtonHelper.c();
        }
        setPaddingRelative(paddingStart + materialButtonHelper.f14080f, paddingTop + materialButtonHelper.f14082h, paddingEnd + materialButtonHelper.f14081g, paddingBottom + materialButtonHelper.f14083i);
        setCheckedInternal(typedArrayD.getBoolean(1, false));
        if (stateListShapeAppearanceModelB != null) {
            materialButtonHelper.f14078d = d();
            if (materialButtonHelper.f14077c != null) {
                materialButtonHelper.d();
            }
            materialButtonHelper.f14077c = stateListShapeAppearanceModelB;
            materialButtonHelper.d();
        }
        setOpticalCenterEnabled(z11);
        typedArrayD.recycle();
        setCompoundDrawablePadding(this.P);
        h(this.K != null);
    }
}
