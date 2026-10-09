package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.lingodeer.R;
import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class StartCompoundLayout extends LinearLayout {
    public ImageView.ScaleType H;
    public View.OnLongClickListener K;
    public boolean L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f15681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f15682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f15683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f15684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f15685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f15686f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15687t;

    public StartCompoundLayout(TextInputLayout textInputLayout, m4 m4Var) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f15681a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f15684d = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f15682b = appCompatTextView;
        if (MaterialResources.f(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.K;
        checkableImageButton.setOnClickListener(null);
        IconHelper.d(checkableImageButton, onLongClickListener);
        this.K = null;
        checkableImageButton.setOnLongClickListener(null);
        IconHelper.d(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) m4Var.f48061c;
        if (typedArray.hasValue(70)) {
            this.f15685e = MaterialResources.b(getContext(), m4Var, 70);
        }
        if (typedArray.hasValue(71)) {
            this.f15686f = ViewUtils.h(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            b(m4Var.g(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f15687t) {
            this.f15687t = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType scaleTypeB = IconHelper.b(typedArray.getInt(69, -1));
            this.H = scaleTypeB;
            checkableImageButton.setScaleType(scaleTypeB);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            appCompatTextView.setTextColor(m4Var.f(62));
        }
        CharSequence text2 = typedArray.getText(60);
        this.f15683c = TextUtils.isEmpty(text2) ? null : text2;
        appCompatTextView.setText(text2);
        e();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f15684d;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.f15682b.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f15684d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f15685e;
            PorterDuff.Mode mode = this.f15686f;
            TextInputLayout textInputLayout = this.f15681a;
            IconHelper.a(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            IconHelper.c(textInputLayout, checkableImageButton, this.f15685e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.K;
        checkableImageButton.setOnClickListener(null);
        IconHelper.d(checkableImageButton, onLongClickListener);
        this.K = null;
        checkableImageButton.setOnLongClickListener(null);
        IconHelper.d(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z11) {
        CheckableImageButton checkableImageButton = this.f15684d;
        if ((checkableImageButton.getVisibility() == 0) != z11) {
            checkableImageButton.setVisibility(z11 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        EditText editText = this.f15681a.f15701e;
        if (editText == null) {
            return;
        }
        this.f15682b.setPaddingRelative(this.f15684d.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i11 = (this.f15683c == null || this.L) ? 8 : 0;
        setVisibility((this.f15684d.getVisibility() == 0 || i11 == 0) ? 0 : 8);
        this.f15682b.setVisibility(i11);
        this.f15681a.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        d();
    }
}
