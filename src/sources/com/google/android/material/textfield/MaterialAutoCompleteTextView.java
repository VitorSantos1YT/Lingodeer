package com.google.android.material.textfield;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {
    public final int H;
    public final float K;
    public ColorStateList L;
    public int M;
    public ColorStateList N;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.appcompat.widget.h f15671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AccessibilityManager f15672f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f15673t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class MaterialArrayAdapter<T> extends ArrayAdapter<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ColorStateList f15675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ColorStateList f15676b;

        public MaterialArrayAdapter(Context context, int i11, String[] strArr) {
            super(context, i11, strArr);
            a();
        }

        public final void a() {
            ColorStateList colorStateList;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            ColorStateList colorStateList2 = materialAutoCompleteTextView.N;
            ColorStateList colorStateList3 = null;
            if (colorStateList2 != null) {
                int[] iArr = {R.attr.state_pressed};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
            } else {
                colorStateList = null;
            }
            this.f15676b = colorStateList;
            if (materialAutoCompleteTextView.M != 0 && materialAutoCompleteTextView.N != null) {
                int[] iArr2 = {R.attr.state_hovered, -16842919};
                int[] iArr3 = {R.attr.state_selected, -16842919};
                colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{r4.c.c(materialAutoCompleteTextView.N.getColorForState(iArr3, 0), materialAutoCompleteTextView.M), r4.c.c(materialAutoCompleteTextView.N.getColorForState(iArr2, 0), materialAutoCompleteTextView.M), materialAutoCompleteTextView.M});
            }
            this.f15675a = colorStateList3;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i11, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i11, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
                Drawable rippleDrawable = null;
                if (materialAutoCompleteTextView.getText().toString().contentEquals(textView.getText()) && materialAutoCompleteTextView.M != 0) {
                    ColorDrawable colorDrawable = new ColorDrawable(materialAutoCompleteTextView.M);
                    if (this.f15676b != null) {
                        colorDrawable.setTintList(this.f15675a);
                        rippleDrawable = new RippleDrawable(this.f15676b, colorDrawable, null);
                    } else {
                        rippleDrawable = colorDrawable;
                    }
                }
                textView.setBackground(rippleDrawable);
            }
            return view2;
        }
    }

    public MaterialAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.f15671e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.L;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutB = b();
        return (textInputLayoutB == null || !textInputLayoutB.f15709k0) ? super.getHint() : textInputLayoutB.getHint();
    }

    public float getPopupElevation() {
        return this.K;
    }

    public int getSimpleItemSelectedColor() {
        return this.M;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.N;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null && textInputLayoutB.f15709k0 && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : BuildConfig.VERSION_NAME).equals("meizu")) {
                setHint(BuildConfig.VERSION_NAME);
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15671e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutB = b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutB != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                androidx.appcompat.widget.h hVar = this.f15671e;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !hVar.f1095b0.isShowing() ? -1 : hVar.f1096c.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutB);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = hVar.f1095b0.getBackground();
                if (background != null) {
                    Rect rect = this.f15673t;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutB.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i11)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z11) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z11);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t6) {
        super.setAdapter(t6);
        this.f15671e.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        androidx.appcompat.widget.h hVar = this.f15671e;
        if (hVar != null) {
            hVar.j(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i11) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i11));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.L = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) dropDownBackground).r(this.L);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f15671e.S = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i11) {
        super.setRawInputType(i11);
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.u();
        }
    }

    public void setSimpleItemSelectedColor(int i11) {
        this.M = i11;
        if (getAdapter() instanceof MaterialArrayAdapter) {
            ((MaterialArrayAdapter) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.N = colorStateList;
        if (getAdapter() instanceof MaterialArrayAdapter) {
            ((MaterialArrayAdapter) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i11) {
        setSimpleItems(getResources().getStringArray(i11));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.f15671e.a();
        } else {
            super.showDropDown();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.lingodeer.R.attr.autoCompleteTextViewStyle);
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f15672f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains(MzwEyWCkjXL.bLWlvZlMPdovQn)) {
                return true;
            }
        }
        return false;
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new MaterialArrayAdapter(getContext(), this.H, strArr));
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.a(context, attributeSet, i11, 0), attributeSet, i11);
        this.f15673t = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.A, i11, com.lingodeer.R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayD.hasValue(0) && typedArrayD.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.H = typedArrayD.getResourceId(3, com.lingodeer.R.layout.mtrl_auto_complete_simple_item);
        this.K = typedArrayD.getDimensionPixelOffset(1, com.lingodeer.R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayD.hasValue(2)) {
            this.L = ColorStateList.valueOf(typedArrayD.getColor(2, 0));
        }
        this.M = typedArrayD.getColor(4, 0);
        this.N = MaterialResources.a(context2, typedArrayD, 5);
        this.f15672f = (AccessibilityManager) context2.getSystemService("accessibility");
        androidx.appcompat.widget.h hVar = new androidx.appcompat.widget.h(context2);
        this.f15671e = hVar;
        hVar.f1093a0 = true;
        hVar.f1095b0.setFocusable(true);
        hVar.Q = this;
        hVar.f1095b0.setInputMethodMode(2);
        hVar.p(getAdapter());
        hVar.R = new AdapterView.OnItemClickListener() { // from class: com.google.android.material.textfield.MaterialAutoCompleteTextView.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i12, long j11) {
                Object item;
                MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
                androidx.appcompat.widget.h hVar2 = materialAutoCompleteTextView.f15671e;
                if (i12 < 0) {
                    item = !hVar2.f1095b0.isShowing() ? null : hVar2.f1096c.getSelectedItem();
                } else {
                    item = materialAutoCompleteTextView.getAdapter().getItem(i12);
                }
                materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(item), false);
                AdapterView.OnItemClickListener onItemClickListener = materialAutoCompleteTextView.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i12 < 0) {
                        view = !hVar2.f1095b0.isShowing() ? null : hVar2.f1096c.getSelectedView();
                        i12 = !hVar2.f1095b0.isShowing() ? -1 : hVar2.f1096c.getSelectedItemPosition();
                        j11 = !hVar2.f1095b0.isShowing() ? Long.MIN_VALUE : hVar2.f1096c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(hVar2.f1096c, view, i12, j11);
                }
                hVar2.dismiss();
            }
        };
        if (typedArrayD.hasValue(6)) {
            setSimpleItems(typedArrayD.getResourceId(6, 0));
        }
        typedArrayD.recycle();
    }
}
