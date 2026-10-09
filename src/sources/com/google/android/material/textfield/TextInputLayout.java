package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.android.billingclient.api.k0;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.internal.StaticLayoutBuilderConfigurer;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import hh.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import qa.z;
import qp.m4;
import r.c1;
import r.s;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] f1 = {new int[]{R.attr.state_pressed}, new int[0]};
    public int A0;
    public final Rect B0;
    public final Rect C0;
    public final RectF D0;
    public Typeface E0;
    public ColorDrawable F0;
    public int G0;
    public int H;
    public final LinkedHashSet H0;
    public ColorDrawable I0;
    public int J0;
    public int K;
    public Drawable K0;
    public int L;
    public ColorStateList L0;
    public final IndicatorViewController M;
    public ColorStateList M0;
    public boolean N;
    public int N0;
    public int O;
    public int O0;
    public boolean P;
    public int P0;
    public LengthCounter Q;
    public ColorStateList Q0;
    public AppCompatTextView R;
    public int R0;
    public int S;
    public int S0;
    public int T;
    public int T0;
    public CharSequence U;
    public int U0;
    public boolean V;
    public int V0;
    public AppCompatTextView W;
    public int W0;
    public boolean X0;
    public final CollapsingTextHelper Y0;
    public boolean Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f15689a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ColorStateList f15690a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public boolean f15691a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StartCompoundLayout f15692b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f15693b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public ValueAnimator f15694b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EndCompoundLayout f15695c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public qa.h f15696c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f15697c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15698d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public qa.h f15699d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f15700d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EditText f15701e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public ColorStateList f15702e0;
    public boolean e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f15703f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ColorStateList f15704f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ColorStateList f15705g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ColorStateList f15706h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f15707i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public CharSequence f15708j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f15709k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public MaterialShapeDrawable f15710l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public MaterialShapeDrawable f15711m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public StateListDrawable f15712n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f15713o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public MaterialShapeDrawable f15714p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public MaterialShapeDrawable f15715q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ShapeAppearanceModel f15716r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f15717s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15718t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f15719t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f15720u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f15721v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f15722w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f15723x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f15724y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f15725z0;

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AnonymousClass2 extends z4.b {
        @Override // z4.b
        public final void d(View view, a5.g gVar) {
            this.f58810a.onInitializeAccessibilityNodeInfo(view, gVar.f380a);
            gVar.y(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class AccessibilityDelegate extends z4.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextInputLayout f15731d;

        public AccessibilityDelegate(TextInputLayout textInputLayout) {
            this.f15731d = textInputLayout;
        }

        @Override // z4.b
        public final void d(View view, a5.g gVar) {
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f380a;
            this.f58810a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            TextInputLayout textInputLayout = this.f15731d;
            EditText editText = textInputLayout.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean z11 = textInputLayout.X0;
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z12 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : BuildConfig.VERSION_NAME;
            StartCompoundLayout startCompoundLayout = textInputLayout.f15692b;
            AppCompatTextView appCompatTextView = startCompoundLayout.f15682b;
            if (appCompatTextView.getVisibility() == 0) {
                accessibilityNodeInfo.setLabelFor(appCompatTextView);
                accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
            } else {
                accessibilityNodeInfo.setTraversalAfter(startCompoundLayout.f15684d);
            }
            if (!zIsEmpty) {
                gVar.x(text);
            } else if (!TextUtils.isEmpty(string)) {
                gVar.x(string);
                if (!z11 && placeholderText != null) {
                    gVar.x(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                gVar.x(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    gVar.r(string);
                } else {
                    if (!zIsEmpty) {
                        string = ((Object) text) + ", " + string;
                    }
                    gVar.x(string);
                }
                gVar.v(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
            if (z12) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfo.setError(error);
            }
            AppCompatTextView appCompatTextView2 = textInputLayout.M.f15663y;
            if (appCompatTextView2 != null) {
                accessibilityNodeInfo.setLabelFor(appCompatTextView2);
            }
            textInputLayout.f15695c.b().m(gVar);
        }

        @Override // z4.b
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            this.f15731d.f15695c.b().n(accessibilityEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface EndIconMode {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface LengthCounter {
        int e(Editable editable);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnEditTextAttachedListener {
        void a(TextInputLayout textInputLayout);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnEndIconChangedListener {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SavedState extends k5.b {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.textfield.TextInputLayout.SavedState.1
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
        public CharSequence f15732c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f15733d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f15732c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f15733d = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f15732c) + "}";
        }

        @Override // k5.b, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            TextUtils.writeToParcel(this.f15732c, parcel, i11);
            parcel.writeInt(this.f15733d ? 1 : 0);
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f15701e;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.f15710l0;
        }
        int iC = MaterialColors.c(this.f15701e, com.lingodeer.R.attr.colorControlHighlight);
        int i11 = this.f15720u0;
        int[][] iArr = f1;
        if (i11 != 2) {
            if (i11 != 1) {
                return null;
            }
            MaterialShapeDrawable materialShapeDrawable = this.f15710l0;
            int i12 = this.A0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{MaterialColors.f(iC, 0.1f, i12), i12}), materialShapeDrawable, materialShapeDrawable);
        }
        Context context = getContext();
        MaterialShapeDrawable materialShapeDrawable2 = this.f15710l0;
        TypedValue typedValueD = MaterialAttributes.d(com.lingodeer.R.attr.colorSurface, context, "TextInputLayout");
        int i13 = typedValueD.resourceId;
        int color = i13 != 0 ? context.getColor(i13) : typedValueD.data;
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(materialShapeDrawable2.f15200b.f15214a);
        int iF = MaterialColors.f(iC, 0.1f, color);
        materialShapeDrawable3.r(new ColorStateList(iArr, new int[]{iF, 0}));
        materialShapeDrawable3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iF, color});
        MaterialShapeDrawable materialShapeDrawable4 = new MaterialShapeDrawable(materialShapeDrawable2.f15200b.f15214a);
        materialShapeDrawable4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable3, materialShapeDrawable4), materialShapeDrawable2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f15712n0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f15712n0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f15712n0.addState(new int[0], h(false));
        }
        return this.f15712n0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f15711m0 == null) {
            this.f15711m0 = h(true);
        }
        return this.f15711m0;
    }

    public static void m(ViewGroup viewGroup, boolean z11) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            childAt.setEnabled(z11);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z11);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f15701e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        getEndIconMode();
        this.f15701e = editText;
        int i11 = this.f15718t;
        if (i11 != -1) {
            setMinEms(i11);
        } else {
            setMinWidth(this.K);
        }
        int i12 = this.H;
        if (i12 != -1) {
            setMaxEms(i12);
        } else {
            setMaxWidth(this.L);
        }
        this.f15713o0 = false;
        k();
        setTextInputAccessibilityDelegate(new AccessibilityDelegate(this));
        Typeface typeface = this.f15701e.getTypeface();
        CollapsingTextHelper collapsingTextHelper = this.Y0;
        boolean zT = collapsingTextHelper.t(typeface);
        boolean z11 = collapsingTextHelper.z(typeface);
        if (zT || z11) {
            collapsingTextHelper.l(false);
        }
        collapsingTextHelper.y(this.f15701e.getTextSize());
        float letterSpacing = this.f15701e.getLetterSpacing();
        if (collapsingTextHelper.f14620h0 != letterSpacing) {
            collapsingTextHelper.f14620h0 = letterSpacing;
            collapsingTextHelper.l(false);
        }
        int gravity = this.f15701e.getGravity();
        collapsingTextHelper.s((gravity & (-113)) | 48);
        collapsingTextHelper.x(gravity);
        this.W0 = editText.getMinimumHeight();
        this.f15701e.addTextChangedListener(new TextWatcher(editText) { // from class: com.google.android.material.textfield.TextInputLayout.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f15726a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditText f15727b;

            {
                this.f15727b = editText;
                this.f15726a = editText.getLineCount();
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                TextInputLayout textInputLayout = TextInputLayout.this;
                textInputLayout.w(!textInputLayout.f15700d1, false);
                if (textInputLayout.N) {
                    textInputLayout.p(editable);
                }
                if (textInputLayout.V) {
                    textInputLayout.x(editable);
                }
                EditText editText2 = this.f15727b;
                int lineCount = editText2.getLineCount();
                int i13 = this.f15726a;
                if (lineCount != i13) {
                    if (lineCount < i13) {
                        int minimumHeight = editText2.getMinimumHeight();
                        int i14 = textInputLayout.W0;
                        if (minimumHeight != i14) {
                            editText2.setMinimumHeight(i14);
                        }
                    }
                    this.f15726a = lineCount;
                }
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
            }
        });
        if (this.L0 == null) {
            this.L0 = this.f15701e.getHintTextColors();
        }
        if (this.f15707i0) {
            if (TextUtils.isEmpty(this.f15708j0)) {
                CharSequence hint = this.f15701e.getHint();
                this.f15703f = hint;
                setHint(hint);
                this.f15701e.setHint((CharSequence) null);
            }
            this.f15709k0 = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.R != null) {
            p(this.f15701e.getText());
        }
        t();
        this.M.b();
        this.f15692b.bringToFront();
        EndCompoundLayout endCompoundLayout = this.f15695c;
        endCompoundLayout.bringToFront();
        Iterator it = this.H0.iterator();
        while (it.hasNext()) {
            ((OnEditTextAttachedListener) it.next()).a(this);
        }
        endCompoundLayout.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f15708j0)) {
            return;
        }
        this.f15708j0 = charSequence;
        this.Y0.B(charSequence);
        if (this.X0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z11) {
        if (this.V == z11) {
            return;
        }
        if (z11) {
            AppCompatTextView appCompatTextView = this.W;
            if (appCompatTextView != null) {
                this.f15689a.addView(appCompatTextView);
                this.W.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.W;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.W = null;
        }
        this.V = z11;
    }

    public final void a() {
        if (this.f15701e == null || this.f15720u0 != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.f15701e;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.Y0.g() + this.f15698d), this.f15701e.getPaddingEnd(), getResources().getDimensionPixelSize(com.lingodeer.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.f15701e;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.lingodeer.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f15701e.getPaddingEnd(), getResources().getDimensionPixelSize(com.lingodeer.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (MaterialResources.f(getContext())) {
            EditText editText3 = this.f15701e;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.lingodeer.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f15701e.getPaddingEnd(), getResources().getDimensionPixelSize(com.lingodeer.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i11, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f15689a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f5) {
        CollapsingTextHelper collapsingTextHelper = this.Y0;
        if (collapsingTextHelper.f14607b == f5) {
            return;
        }
        if (this.f15694b1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f15694b1 = valueAnimator;
            valueAnimator.setInterpolator(MotionUtils.d(getContext(), com.lingodeer.R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f13769b));
            this.f15694b1.setDuration(MotionUtils.c(getContext(), com.lingodeer.R.attr.motionDurationMedium4, 167));
            this.f15694b1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.TextInputLayout.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TextInputLayout.this.Y0.A(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
        }
        this.f15694b1.setFloatValues(collapsingTextHelper.f14607b, f5);
        this.f15694b1.start();
    }

    public final void c() {
        int i11;
        int i12;
        MaterialShapeDrawable materialShapeDrawable = this.f15710l0;
        if (materialShapeDrawable == null) {
            return;
        }
        ShapeAppearanceModel shapeAppearanceModel = materialShapeDrawable.f15200b.f15214a;
        ShapeAppearanceModel shapeAppearanceModel2 = this.f15716r0;
        if (shapeAppearanceModel != shapeAppearanceModel2) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel2);
        }
        if (this.f15720u0 == 2 && (i11 = this.f15722w0) > -1 && (i12 = this.f15725z0) != 0) {
            MaterialShapeDrawable materialShapeDrawable2 = this.f15710l0;
            materialShapeDrawable2.z(i11);
            materialShapeDrawable2.y(ColorStateList.valueOf(i12));
        }
        int iC = this.A0;
        if (this.f15720u0 == 1) {
            iC = r4.c.c(this.A0, MaterialColors.b(getContext(), com.lingodeer.R.attr.colorSurface, 0));
        }
        this.A0 = iC;
        this.f15710l0.r(ColorStateList.valueOf(iC));
        MaterialShapeDrawable materialShapeDrawable3 = this.f15714p0;
        if (materialShapeDrawable3 != null && this.f15715q0 != null) {
            if (this.f15722w0 > -1 && this.f15725z0 != 0) {
                materialShapeDrawable3.r(this.f15701e.isFocused() ? ColorStateList.valueOf(this.N0) : ColorStateList.valueOf(this.f15725z0));
                this.f15715q0.r(ColorStateList.valueOf(this.f15725z0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.f15701e == null) {
            throw new IllegalStateException();
        }
        boolean z11 = getLayoutDirection() == 1;
        int i11 = rect.bottom;
        Rect rect2 = this.C0;
        rect2.bottom = i11;
        int i12 = this.f15720u0;
        if (i12 == 1) {
            rect2.left = i(rect.left, z11);
            rect2.top = rect.top + this.f15721v0;
            rect2.right = j(rect.right, z11);
            return rect2;
        }
        if (i12 != 2) {
            rect2.left = i(rect.left, z11);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z11);
            return rect2;
        }
        rect2.left = this.f15701e.getPaddingLeft() + rect.left;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.f15701e.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i11) {
        EditText editText = this.f15701e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i11);
            return;
        }
        if (this.f15703f != null) {
            boolean z11 = this.f15709k0;
            this.f15709k0 = false;
            CharSequence hint = editText.getHint();
            this.f15701e.setHint(this.f15703f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i11);
                return;
            } finally {
                this.f15701e.setHint(hint);
                this.f15709k0 = z11;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i11);
        onProvideAutofillVirtualStructure(viewStructure, i11);
        FrameLayout frameLayout = this.f15689a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i12 = 0; i12 < frameLayout.getChildCount(); i12++) {
            View childAt = frameLayout.getChildAt(i12);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i12);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i11);
            if (childAt == this.f15701e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f15700d1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f15700d1 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable;
        super.draw(canvas);
        boolean z11 = this.f15707i0;
        CollapsingTextHelper collapsingTextHelper = this.Y0;
        if (z11) {
            collapsingTextHelper.f(canvas);
        }
        if (this.f15715q0 == null || (materialShapeDrawable = this.f15714p0) == null) {
            return;
        }
        materialShapeDrawable.draw(canvas);
        if (this.f15701e.isFocused()) {
            Rect bounds = this.f15715q0.getBounds();
            Rect bounds2 = this.f15714p0.getBounds();
            float f5 = collapsingTextHelper.f14607b;
            int iCenterX = bounds2.centerX();
            bounds.left = AnimationUtils.c(iCenterX, f5, bounds2.left);
            bounds.right = AnimationUtils.c(iCenterX, f5, bounds2.right);
            this.f15715q0.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z11;
        ColorStateList colorStateList;
        if (this.f15697c1) {
            return;
        }
        this.f15697c1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        CollapsingTextHelper collapsingTextHelper = this.Y0;
        if (collapsingTextHelper != null) {
            collapsingTextHelper.S = drawableState;
            ColorStateList colorStateList2 = collapsingTextHelper.f14634p;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = collapsingTextHelper.f14632o) == null || !colorStateList.isStateful())) {
                z11 = false;
            } else {
                collapsingTextHelper.l(false);
                z11 = true;
            }
        } else {
            z11 = false;
        }
        if (this.f15701e != null) {
            w(isLaidOut() && isEnabled(), false);
        }
        t();
        z();
        if (z11) {
            invalidate();
        }
        this.f15697c1 = false;
    }

    public final int e() {
        if (this.f15707i0) {
            int i11 = this.f15720u0;
            CollapsingTextHelper collapsingTextHelper = this.Y0;
            if (i11 == 0) {
                return (int) collapsingTextHelper.g();
            }
            if (i11 == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (collapsingTextHelper.g() / 2.0f);
                }
                float fG = collapsingTextHelper.g();
                TextPaint textPaint = collapsingTextHelper.V;
                textPaint.setTextSize(collapsingTextHelper.f14630n);
                textPaint.setTypeface(collapsingTextHelper.f14650x);
                textPaint.setLetterSpacing(collapsingTextHelper.f14618g0);
                return Math.max(0, (int) (fG - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final qa.h f() {
        qa.h hVar = new qa.h();
        hVar.f47680c = MotionUtils.c(getContext(), com.lingodeer.R.attr.motionDurationShort2, 87);
        hVar.f47682d = MotionUtils.d(getContext(), com.lingodeer.R.attr.motionEasingLinearInterpolator, AnimationUtils.f13768a);
        return hVar;
    }

    public final boolean g() {
        return this.f15707i0 && !TextUtils.isEmpty(this.f15708j0) && (this.f15710l0 instanceof CutoutDrawable);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f15701e;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public MaterialShapeDrawable getBoxBackground() {
        int i11 = this.f15720u0;
        if (i11 == 1 || i11 == 2) {
            return this.f15710l0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.A0;
    }

    public int getBoxBackgroundMode() {
        return this.f15720u0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f15721v0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.D0;
        return layoutDirection == 1 ? this.f15716r0.f15252h.a(rectF) : this.f15716r0.f15251g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.D0;
        return layoutDirection == 1 ? this.f15716r0.f15251g.a(rectF) : this.f15716r0.f15252h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.D0;
        return layoutDirection == 1 ? this.f15716r0.f15249e.a(rectF) : this.f15716r0.f15250f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.D0;
        return layoutDirection == 1 ? this.f15716r0.f15250f.a(rectF) : this.f15716r0.f15249e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.P0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.Q0;
    }

    public int getBoxStrokeWidth() {
        return this.f15723x0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f15724y0;
    }

    public int getCounterMaxLength() {
        return this.O;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.N && this.P && (appCompatTextView = this.R) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f15704f0;
    }

    public ColorStateList getCounterTextColor() {
        return this.f15702e0;
    }

    public ColorStateList getCursorColor() {
        return this.f15705g0;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f15706h0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.L0;
    }

    public EditText getEditText() {
        return this.f15701e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f15695c.f15628t.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f15695c.f15628t.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f15695c.O;
    }

    public int getEndIconMode() {
        return this.f15695c.K;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f15695c.P;
    }

    public CheckableImageButton getEndIconView() {
        return this.f15695c.f15628t;
    }

    public CharSequence getError() {
        IndicatorViewController indicatorViewController = this.M;
        if (indicatorViewController.f15655q) {
            return indicatorViewController.f15654p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.M.f15658t;
    }

    public CharSequence getErrorContentDescription() {
        return this.M.f15657s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.M.f15656r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f15695c.f15624c.getDrawable();
    }

    public CharSequence getHelperText() {
        IndicatorViewController indicatorViewController = this.M;
        if (indicatorViewController.f15662x) {
            return indicatorViewController.f15661w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.M.f15663y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f15707i0) {
            return this.f15708j0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.Y0.g();
    }

    public final int getHintCurrentCollapsedTextColor() {
        CollapsingTextHelper collapsingTextHelper = this.Y0;
        return collapsingTextHelper.h(collapsingTextHelper.f14634p);
    }

    public int getHintMaxLines() {
        return this.Y0.f14633o0;
    }

    public ColorStateList getHintTextColor() {
        return this.M0;
    }

    public LengthCounter getLengthCounter() {
        return this.Q;
    }

    public int getMaxEms() {
        return this.H;
    }

    public int getMaxWidth() {
        return this.L;
    }

    public int getMinEms() {
        return this.f15718t;
    }

    public int getMinWidth() {
        return this.K;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f15695c.f15628t.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f15695c.f15628t.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.V) {
            return this.U;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f15693b0;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f15690a0;
    }

    public CharSequence getPrefixText() {
        return this.f15692b.f15683c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f15692b.f15682b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f15692b.f15682b;
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f15716r0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f15692b.f15684d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f15692b.f15684d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f15692b.f15687t;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f15692b.H;
    }

    public CharSequence getSuffixText() {
        return this.f15695c.R;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f15695c.S.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f15695c.S;
    }

    public Typeface getTypeface() {
        return this.E0;
    }

    public final MaterialShapeDrawable h(boolean z11) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.lingodeer.R.dimen.mtrl_shape_corner_size_small_component);
        float f5 = z11 ? dimensionPixelOffset : CropImageView.DEFAULT_ASPECT_RATIO;
        EditText editText = this.f15701e;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.lingodeer.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.lingodeer.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
        builder.f(f5);
        builder.g(f5);
        builder.d(dimensionPixelOffset);
        builder.e(dimensionPixelOffset);
        ShapeAppearanceModel shapeAppearanceModelA = builder.a();
        EditText editText2 = this.f15701e;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = MaterialShapeDrawable.f15196h0;
            TypedValue typedValueD = MaterialAttributes.d(com.lingodeer.R.attr.colorSurface, context, "MaterialShapeDrawable");
            int i11 = typedValueD.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i11 != 0 ? context.getColor(i11) : typedValueD.data);
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.n(context);
        materialShapeDrawable.r(dropDownBackgroundTintList);
        materialShapeDrawable.q(popupElevation);
        materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModelA);
        MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState = materialShapeDrawable.f15200b;
        if (materialShapeDrawableState.f15221h == null) {
            materialShapeDrawableState.f15221h = new Rect();
        }
        materialShapeDrawable.f15200b.f15221h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        materialShapeDrawable.invalidateSelf();
        return materialShapeDrawable;
    }

    public final int i(int i11, boolean z11) {
        int iC;
        if (!z11 && getPrefixText() != null) {
            iC = this.f15692b.a();
        } else {
            if (!z11 || getSuffixText() == null) {
                return this.f15701e.getCompoundPaddingLeft() + i11;
            }
            iC = this.f15695c.c();
        }
        return i11 + iC;
    }

    public final int j(int i11, boolean z11) {
        int compoundPaddingRight;
        if (z11 || getSuffixText() == null) {
            compoundPaddingRight = (!z11 || getPrefixText() == null) ? this.f15701e.getCompoundPaddingRight() : this.f15692b.a();
        } else {
            compoundPaddingRight = this.f15695c.c();
        }
        return i11 - compoundPaddingRight;
    }

    public final void k() {
        int i11 = this.f15720u0;
        if (i11 == 0) {
            this.f15710l0 = null;
            this.f15714p0 = null;
            this.f15715q0 = null;
        } else if (i11 == 1) {
            this.f15710l0 = new MaterialShapeDrawable(this.f15716r0);
            this.f15714p0 = new MaterialShapeDrawable();
            this.f15715q0 = new MaterialShapeDrawable();
        } else {
            if (i11 != 2) {
                throw new IllegalArgumentException(p0.i(this.f15720u0, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
            }
            if (!this.f15707i0 || (this.f15710l0 instanceof CutoutDrawable)) {
                this.f15710l0 = new MaterialShapeDrawable(this.f15716r0);
            } else {
                ShapeAppearanceModel shapeAppearanceModel = this.f15716r0;
                int i12 = CutoutDrawable.f15602k0;
                if (shapeAppearanceModel == null) {
                    shapeAppearanceModel = new ShapeAppearanceModel();
                }
                CutoutDrawable.CutoutDrawableState cutoutDrawableState = new CutoutDrawable.CutoutDrawableState(shapeAppearanceModel, new RectF());
                CutoutDrawable.ImplApi18 implApi18 = new CutoutDrawable.ImplApi18(cutoutDrawableState);
                implApi18.f15603j0 = cutoutDrawableState;
                this.f15710l0 = implApi18;
            }
            this.f15714p0 = null;
            this.f15715q0 = null;
        }
        u();
        z();
        if (this.f15720u0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f15721v0 = getResources().getDimensionPixelSize(com.lingodeer.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (MaterialResources.f(getContext())) {
                this.f15721v0 = getResources().getDimensionPixelSize(com.lingodeer.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.f15720u0 != 0) {
            v();
        }
        EditText editText = this.f15701e;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i13 = this.f15720u0;
                if (i13 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i13 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    public final void l() {
        float f5;
        float f11;
        float f12;
        RectF rectF;
        float f13;
        float lineWidth;
        int i11;
        float f14;
        int i12;
        if (g()) {
            int width = this.f15701e.getWidth();
            int gravity = this.f15701e.getGravity();
            CollapsingTextHelper collapsingTextHelper = this.Y0;
            boolean zC = collapsingTextHelper.c(collapsingTextHelper.H);
            collapsingTextHelper.J = zC;
            Rect rect = collapsingTextHelper.f14619h;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zC) {
                        i12 = rect.left;
                        f12 = i12;
                    } else {
                        f5 = rect.right;
                        f11 = collapsingTextHelper.f14626k0;
                    }
                } else if (zC) {
                    f5 = rect.right;
                    f11 = collapsingTextHelper.f14626k0;
                } else {
                    i12 = rect.left;
                    f12 = i12;
                }
                float fMax = Math.max(f12, rect.left);
                rectF = this.D0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f13 = (width / 2.0f) + (collapsingTextHelper.f14626k0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (collapsingTextHelper.J) {
                        f14 = collapsingTextHelper.f14626k0;
                        f13 = f14 + fMax;
                    } else {
                        i11 = rect.right;
                        f13 = i11;
                    }
                } else if (collapsingTextHelper.J) {
                    i11 = rect.right;
                    f13 = i11;
                } else {
                    f14 = collapsingTextHelper.f14626k0;
                    f13 = f14 + fMax;
                }
                rectF.right = Math.min(f13, rect.right);
                rectF.bottom = collapsingTextHelper.g() + rect.top;
                if (collapsingTextHelper.f14624j0 != null && !collapsingTextHelper.C()) {
                    StaticLayout staticLayout = collapsingTextHelper.f14624j0;
                    lineWidth = (collapsingTextHelper.f14630n / collapsingTextHelper.m) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (collapsingTextHelper.J) {
                        rectF.left = rectF.right - lineWidth;
                    } else {
                        rectF.right = rectF.left + lineWidth;
                    }
                }
                if (rectF.width() > CropImageView.DEFAULT_ASPECT_RATIO || rectF.height() <= CropImageView.DEFAULT_ASPECT_RATIO) {
                }
                float f15 = rectF.left;
                float f16 = this.f15719t0;
                rectF.left = f15 - f16;
                rectF.right += f16;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f15722w0);
                rectF.top = CropImageView.DEFAULT_ASPECT_RATIO;
                CutoutDrawable cutoutDrawable = (CutoutDrawable) this.f15710l0;
                cutoutDrawable.getClass();
                cutoutDrawable.E(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f5 = width / 2.0f;
            f11 = collapsingTextHelper.f14626k0 / 2.0f;
            f12 = f5 - f11;
            float fMax2 = Math.max(f12, rect.left);
            rectF = this.D0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f13 = (width / 2.0f) + (collapsingTextHelper.f14626k0 / 2.0f);
            } else {
                f13 = (width / 2.0f) + (collapsingTextHelper.f14626k0 / 2.0f);
            }
            rectF.right = Math.min(f13, rect.right);
            rectF.bottom = collapsingTextHelper.g() + rect.top;
            if (collapsingTextHelper.f14624j0 != null) {
                StaticLayout staticLayout2 = collapsingTextHelper.f14624j0;
                lineWidth = (collapsingTextHelper.f14630n / collapsingTextHelper.m) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (collapsingTextHelper.J) {
                    rectF.left = rectF.right - lineWidth;
                } else {
                    rectF.right = rectF.left + lineWidth;
                }
            }
            if (rectF.width() > CropImageView.DEFAULT_ASPECT_RATIO) {
            }
        }
    }

    public final void n(AppCompatTextView appCompatTextView, int i11) {
        try {
            appCompatTextView.setTextAppearance(i11);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(com.lingodeer.R.style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(getContext().getColor(com.lingodeer.R.color.design_error));
    }

    public final boolean o() {
        IndicatorViewController indicatorViewController = this.M;
        return (indicatorViewController.f15653o != 1 || indicatorViewController.f15656r == null || TextUtils.isEmpty(indicatorViewController.f15654p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.Y0.k(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        EndCompoundLayout endCompoundLayout = this.f15695c;
        endCompoundLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z11 = false;
        this.e1 = false;
        if (this.f15701e != null && this.f15701e.getMeasuredHeight() < (iMax = Math.max(endCompoundLayout.getMeasuredHeight(), this.f15692b.getMeasuredHeight()))) {
            this.f15701e.setMinimumHeight(iMax);
            z11 = true;
        }
        boolean zS = s();
        if (z11 || zS) {
            this.f15701e.post(new d(this, 2));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        float fI;
        int i15;
        int compoundPaddingTop;
        super.onLayout(z11, i11, i12, i13, i14);
        EditText editText = this.f15701e;
        if (editText != null) {
            Rect rect = this.B0;
            DescendantOffsetUtils.a(this, editText, rect);
            MaterialShapeDrawable materialShapeDrawable = this.f15714p0;
            if (materialShapeDrawable != null) {
                int i16 = rect.bottom;
                materialShapeDrawable.setBounds(rect.left, i16 - this.f15723x0, rect.right, i16);
            }
            MaterialShapeDrawable materialShapeDrawable2 = this.f15715q0;
            if (materialShapeDrawable2 != null) {
                int i17 = rect.bottom;
                materialShapeDrawable2.setBounds(rect.left, i17 - this.f15724y0, rect.right, i17);
            }
            if (this.f15707i0) {
                float textSize = this.f15701e.getTextSize();
                CollapsingTextHelper collapsingTextHelper = this.Y0;
                collapsingTextHelper.y(textSize);
                TextPaint textPaint = collapsingTextHelper.V;
                int gravity = this.f15701e.getGravity();
                collapsingTextHelper.s((gravity & (-113)) | 48);
                collapsingTextHelper.x(gravity);
                Rect rectD = d(rect);
                collapsingTextHelper.o(rectD.left, rectD.top, rectD.right, rectD.bottom);
                if (this.f15701e == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(collapsingTextHelper.m);
                    textPaint.setTypeface(collapsingTextHelper.A);
                    textPaint.setLetterSpacing(collapsingTextHelper.f14620h0);
                    fI = -textPaint.ascent();
                } else {
                    fI = collapsingTextHelper.i() * collapsingTextHelper.f14636q;
                }
                int compoundPaddingLeft = this.f15701e.getCompoundPaddingLeft() + rect.left;
                Rect rect2 = this.C0;
                rect2.left = compoundPaddingLeft;
                if (this.f15720u0 != 1 || this.f15701e.getMinLines() > 1) {
                    if (this.f15720u0 != 0 || getHintMaxLines() == 1) {
                        i15 = 0;
                    } else {
                        textPaint.setTextSize(collapsingTextHelper.m);
                        textPaint.setTypeface(collapsingTextHelper.A);
                        textPaint.setLetterSpacing(collapsingTextHelper.f14620h0);
                        i15 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.f15701e.getCompoundPaddingTop() + rect.top) - i15;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fI / 2.0f));
                }
                rect2.top = compoundPaddingTop;
                rect2.right = rect.right - this.f15701e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f15720u0 != 1 || this.f15701e.getMinLines() > 1) ? rect.bottom - this.f15701e.getCompoundPaddingBottom() : (int) (rect2.top + fI);
                rect2.bottom = compoundPaddingBottom;
                collapsingTextHelper.u(rect2.left, rect2.top, rect2.right, compoundPaddingBottom, true);
                collapsingTextHelper.l(false);
                if (!g() || this.X0) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        float f5;
        EditText editText;
        super.onMeasure(i11, i12);
        boolean z11 = this.e1;
        EndCompoundLayout endCompoundLayout = this.f15695c;
        if (!z11) {
            endCompoundLayout.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.e1 = true;
        }
        if (this.W != null && (editText = this.f15701e) != null) {
            this.W.setGravity(editText.getGravity());
            this.W.setPadding(this.f15701e.getCompoundPaddingLeft(), this.f15701e.getCompoundPaddingTop(), this.f15701e.getCompoundPaddingRight(), this.f15701e.getCompoundPaddingBottom());
        }
        endCompoundLayout.m();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.f15701e.getMeasuredWidth() - this.f15701e.getCompoundPaddingLeft()) - this.f15701e.getCompoundPaddingRight();
        CollapsingTextHelper collapsingTextHelper = this.Y0;
        TextPaint textPaint = collapsingTextHelper.V;
        textPaint.setTextSize(collapsingTextHelper.f14630n);
        textPaint.setTypeface(collapsingTextHelper.f14650x);
        textPaint.setLetterSpacing(collapsingTextHelper.f14618g0);
        float f11 = measuredWidth;
        collapsingTextHelper.f14645u0 = collapsingTextHelper.e(collapsingTextHelper.f14635p0, textPaint, collapsingTextHelper.H, (collapsingTextHelper.f14630n / collapsingTextHelper.m) * f11, collapsingTextHelper.J).getHeight();
        textPaint.setTextSize(collapsingTextHelper.m);
        textPaint.setTypeface(collapsingTextHelper.A);
        textPaint.setLetterSpacing(collapsingTextHelper.f14620h0);
        collapsingTextHelper.f14647v0 = collapsingTextHelper.e(collapsingTextHelper.f14633o0, textPaint, collapsingTextHelper.H, f11, collapsingTextHelper.J).getHeight();
        EditText editText2 = this.f15701e;
        Rect rect = this.B0;
        DescendantOffsetUtils.a(this, editText2, rect);
        Rect rectD = d(rect);
        collapsingTextHelper.o(rectD.left, rectD.top, rectD.right, rectD.bottom);
        v();
        a();
        if (this.f15701e == null) {
            return;
        }
        int i13 = collapsingTextHelper.f14647v0;
        if (i13 != -1) {
            f5 = i13;
        } else {
            TextPaint textPaint2 = collapsingTextHelper.V;
            textPaint2.setTextSize(collapsingTextHelper.m);
            textPaint2.setTypeface(collapsingTextHelper.A);
            textPaint2.setLetterSpacing(collapsingTextHelper.f14620h0);
            f5 = -textPaint2.ascent();
        }
        CharSequence charSequence = this.U;
        float height = CropImageView.DEFAULT_ASPECT_RATIO;
        if (charSequence != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.W.getPaint());
            textPaint3.setTextSize(this.W.getTextSize());
            textPaint3.setTypeface(this.W.getTypeface());
            textPaint3.setLetterSpacing(this.W.getLetterSpacing());
            try {
                StaticLayoutBuilderCompat staticLayoutBuilderCompat = new StaticLayoutBuilderCompat(this.U, textPaint3, measuredWidth);
                staticLayoutBuilderCompat.f14728k = getLayoutDirection() == 1;
                staticLayoutBuilderCompat.f14727j = true;
                float lineSpacingExtra = this.W.getLineSpacingExtra();
                float lineSpacingMultiplier = this.W.getLineSpacingMultiplier();
                staticLayoutBuilderCompat.f14724g = lineSpacingExtra;
                staticLayoutBuilderCompat.f14725h = lineSpacingMultiplier;
                staticLayoutBuilderCompat.m = new StaticLayoutBuilderConfigurer() { // from class: com.google.android.material.textfield.h
                    @Override // com.google.android.material.internal.StaticLayoutBuilderConfigurer
                    public final void a(StaticLayout.Builder builder) {
                        builder.setBreakStrategy(this.f15745a.W.getBreakStrategy());
                    }
                };
                height = staticLayoutBuilderCompat.a().getHeight() + (this.f15720u0 == 1 ? collapsingTextHelper.g() + this.f15721v0 + this.f15698d : 0.0f);
            } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e8) {
                e8.getCause().getMessage();
            }
        }
        float fMax = Math.max(f5, height);
        if (this.f15701e.getMeasuredHeight() < fMax) {
            this.f15701e.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f37910a);
        setError(savedState.f15732c);
        if (savedState.f15733d) {
            post(new Runnable() { // from class: com.google.android.material.textfield.TextInputLayout.3
                @Override // java.lang.Runnable
                public final void run() {
                    CheckableImageButton checkableImageButton = TextInputLayout.this.f15695c.f15628t;
                    checkableImageButton.performClick();
                    checkableImageButton.jumpDrawablesToCurrentState();
                }
            });
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i11) {
        super.onRtlPropertiesChanged(i11);
        boolean z11 = i11 == 1;
        if (z11 != this.f15717s0) {
            CornerSize cornerSize = this.f15716r0.f15249e;
            RectF rectF = this.D0;
            float fA = cornerSize.a(rectF);
            float fA2 = this.f15716r0.f15250f.a(rectF);
            float fA3 = this.f15716r0.f15252h.a(rectF);
            float fA4 = this.f15716r0.f15251g.a(rectF);
            ShapeAppearanceModel shapeAppearanceModel = this.f15716r0;
            CornerTreatment cornerTreatment = shapeAppearanceModel.f15245a;
            CornerTreatment cornerTreatment2 = shapeAppearanceModel.f15246b;
            CornerTreatment cornerTreatment3 = shapeAppearanceModel.f15248d;
            CornerTreatment cornerTreatment4 = shapeAppearanceModel.f15247c;
            ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
            builder.f15257a = cornerTreatment2;
            float fB = ShapeAppearanceModel.Builder.b(cornerTreatment2);
            if (fB != -1.0f) {
                builder.f(fB);
            }
            builder.f15258b = cornerTreatment;
            float fB2 = ShapeAppearanceModel.Builder.b(cornerTreatment);
            if (fB2 != -1.0f) {
                builder.g(fB2);
            }
            builder.f15260d = cornerTreatment4;
            float fB3 = ShapeAppearanceModel.Builder.b(cornerTreatment4);
            if (fB3 != -1.0f) {
                builder.d(fB3);
            }
            builder.f15259c = cornerTreatment3;
            float fB4 = ShapeAppearanceModel.Builder.b(cornerTreatment3);
            if (fB4 != -1.0f) {
                builder.e(fB4);
            }
            builder.f(fA2);
            builder.g(fA);
            builder.d(fA4);
            builder.e(fA3);
            ShapeAppearanceModel shapeAppearanceModelA = builder.a();
            this.f15717s0 = z11;
            setShapeAppearanceModel(shapeAppearanceModelA);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (o()) {
            savedState.f15732c = getError();
        }
        EndCompoundLayout endCompoundLayout = this.f15695c;
        savedState.f15733d = endCompoundLayout.K != 0 && endCompoundLayout.f15628t.f14598d;
        return savedState;
    }

    public final void p(Editable editable) {
        int iE = this.Q.e(editable);
        boolean z11 = this.P;
        int i11 = this.O;
        if (i11 == -1) {
            this.R.setText(String.valueOf(iE));
            this.R.setContentDescription(null);
            this.P = false;
        } else {
            this.P = iE > i11;
            Context context = getContext();
            this.R.setContentDescription(context.getString(this.P ? com.lingodeer.R.string.character_counter_overflowed_content_description : com.lingodeer.R.string.character_counter_content_description, Integer.valueOf(iE), Integer.valueOf(this.O)));
            if (z11 != this.P) {
                q();
            }
            String str = x4.b.f55768b;
            x4.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? x4.b.f55771e : x4.b.f55770d;
            AppCompatTextView appCompatTextView = this.R;
            String string = getContext().getString(com.lingodeer.R.string.character_counter_pattern, Integer.valueOf(iE), Integer.valueOf(this.O));
            bVar.getClass();
            k0 k0Var = x4.f.f55778a;
            appCompatTextView.setText(string != null ? bVar.c(string).toString() : null);
        }
        if (this.f15701e == null || z11 == this.P) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.R;
        if (appCompatTextView != null) {
            n(appCompatTextView, this.P ? this.S : this.T);
            if (!this.P && (colorStateList2 = this.f15702e0) != null) {
                this.R.setTextColor(colorStateList2);
            }
            if (!this.P || (colorStateList = this.f15704f0) == null) {
                return;
            }
            this.R.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    public final void r() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.f15705g0;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueA = MaterialAttributes.a(context, com.lingodeer.R.attr.colorControlActivated);
            if (typedValueA != null) {
                int i11 = typedValueA.resourceId;
                if (i11 != 0) {
                    colorStateListValueOf = o4.c.b(context, i11);
                } else {
                    int i12 = typedValueA.data;
                    if (i12 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i12);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this.f15701e;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.f15701e.getTextCursorDrawable().mutate();
        if ((o() || (this.R != null && this.P)) && (colorStateList = this.f15706h0) != null) {
            colorStateListValueOf = colorStateList;
        }
        drawableMutate.setTintList(colorStateListValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    public final boolean s() {
        boolean z11;
        if (this.f15701e == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z12 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            StartCompoundLayout startCompoundLayout = this.f15692b;
            if (startCompoundLayout.getMeasuredWidth() > 0) {
                int measuredWidth = startCompoundLayout.getMeasuredWidth() - this.f15701e.getPaddingLeft();
                if (this.F0 == null || this.G0 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.F0 = colorDrawable;
                    this.G0 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.f15701e.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.F0;
                if (drawable != colorDrawable2) {
                    this.f15701e.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else if (this.F0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f15701e.getCompoundDrawablesRelative();
                this.f15701e.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.F0 = null;
                z11 = true;
            } else {
                z11 = false;
            }
        } else if (this.F0 != null) {
            Drawable[] compoundDrawablesRelative3 = this.f15701e.getCompoundDrawablesRelative();
            this.f15701e.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.F0 = null;
            z11 = true;
        } else {
            z11 = false;
        }
        EndCompoundLayout endCompoundLayout = this.f15695c;
        if ((endCompoundLayout.e() || ((endCompoundLayout.K != 0 && endCompoundLayout.d()) || endCompoundLayout.R != null)) && endCompoundLayout.getMeasuredWidth() > 0) {
            int measuredWidth2 = endCompoundLayout.S.getMeasuredWidth() - this.f15701e.getPaddingRight();
            if (endCompoundLayout.e()) {
                checkableImageButton = endCompoundLayout.f15624c;
            } else if (endCompoundLayout.K != 0 && endCompoundLayout.d()) {
                checkableImageButton = endCompoundLayout.f15628t;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this.f15701e.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.I0;
            if (colorDrawable3 != null && this.J0 != measuredWidth2) {
                this.J0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f15701e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.I0, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.I0 = colorDrawable4;
                this.J0 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.I0;
            if (drawable2 != colorDrawable5) {
                this.K0 = drawable2;
                this.f15701e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.I0 != null) {
            Drawable[] compoundDrawablesRelative5 = this.f15701e.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.I0) {
                this.f15701e.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.K0, compoundDrawablesRelative5[3]);
            } else {
                z12 = z11;
            }
            this.I0 = null;
            return z12;
        }
        return z11;
    }

    public void setBoxBackgroundColor(int i11) {
        if (this.A0 != i11) {
            this.A0 = i11;
            this.R0 = i11;
            this.T0 = i11;
            this.U0 = i11;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i11) {
        setBoxBackgroundColor(getContext().getColor(i11));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.R0 = defaultColor;
        this.A0 = defaultColor;
        this.S0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.T0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.U0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i11) {
        if (i11 == this.f15720u0) {
            return;
        }
        this.f15720u0 = i11;
        if (this.f15701e != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i11) {
        this.f15721v0 = i11;
    }

    public void setBoxCornerFamily(int i11) {
        ShapeAppearanceModel.Builder builderH = this.f15716r0.h();
        CornerSize cornerSize = this.f15716r0.f15249e;
        CornerTreatment cornerTreatmentA = MaterialShapeUtils.a(i11);
        builderH.f15257a = cornerTreatmentA;
        float fB = ShapeAppearanceModel.Builder.b(cornerTreatmentA);
        if (fB != -1.0f) {
            builderH.f(fB);
        }
        builderH.f15261e = cornerSize;
        CornerSize cornerSize2 = this.f15716r0.f15250f;
        CornerTreatment cornerTreatmentA2 = MaterialShapeUtils.a(i11);
        builderH.f15258b = cornerTreatmentA2;
        float fB2 = ShapeAppearanceModel.Builder.b(cornerTreatmentA2);
        if (fB2 != -1.0f) {
            builderH.g(fB2);
        }
        builderH.f15262f = cornerSize2;
        CornerSize cornerSize3 = this.f15716r0.f15252h;
        CornerTreatment cornerTreatmentA3 = MaterialShapeUtils.a(i11);
        builderH.f15260d = cornerTreatmentA3;
        float fB3 = ShapeAppearanceModel.Builder.b(cornerTreatmentA3);
        if (fB3 != -1.0f) {
            builderH.d(fB3);
        }
        builderH.f15264h = cornerSize3;
        CornerSize cornerSize4 = this.f15716r0.f15251g;
        CornerTreatment cornerTreatmentA4 = MaterialShapeUtils.a(i11);
        builderH.f15259c = cornerTreatmentA4;
        float fB4 = ShapeAppearanceModel.Builder.b(cornerTreatmentA4);
        if (fB4 != -1.0f) {
            builderH.e(fB4);
        }
        builderH.f15263g = cornerSize4;
        this.f15716r0 = builderH.a();
        c();
    }

    public void setBoxStrokeColor(int i11) {
        if (this.P0 != i11) {
            this.P0 = i11;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.N0 = colorStateList.getDefaultColor();
            this.V0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.O0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.P0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.P0 != colorStateList.getDefaultColor()) {
            this.P0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.Q0 != colorStateList) {
            this.Q0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i11) {
        this.f15723x0 = i11;
        z();
    }

    public void setBoxStrokeWidthFocused(int i11) {
        this.f15724y0 = i11;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i11) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i11));
    }

    public void setBoxStrokeWidthResource(int i11) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i11));
    }

    public void setCounterEnabled(boolean z11) {
        if (this.N != z11) {
            IndicatorViewController indicatorViewController = this.M;
            if (z11) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.R = appCompatTextView;
                appCompatTextView.setId(com.lingodeer.R.id.textinput_counter);
                Typeface typeface = this.E0;
                if (typeface != null) {
                    this.R.setTypeface(typeface);
                }
                this.R.setMaxLines(1);
                indicatorViewController.a(this.R, 2);
                ((ViewGroup.MarginLayoutParams) this.R.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.lingodeer.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.R != null) {
                    EditText editText = this.f15701e;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                indicatorViewController.g(this.R, 2);
                this.R = null;
            }
            this.N = z11;
        }
    }

    public void setCounterMaxLength(int i11) {
        if (this.O != i11) {
            if (i11 > 0) {
                this.O = i11;
            } else {
                this.O = -1;
            }
            if (!this.N || this.R == null) {
                return;
            }
            EditText editText = this.f15701e;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i11) {
        if (this.S != i11) {
            this.S = i11;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f15704f0 != colorStateList) {
            this.f15704f0 = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i11) {
        if (this.T != i11) {
            this.T = i11;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f15702e0 != colorStateList) {
            this.f15702e0 = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f15705g0 != colorStateList) {
            this.f15705g0 = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f15706h0 != colorStateList) {
            this.f15706h0 = colorStateList;
            if (o() || (this.R != null && this.P)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.L0 = colorStateList;
        this.M0 = colorStateList;
        if (this.f15701e != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        m(this, z11);
        super.setEnabled(z11);
    }

    public void setEndIconActivated(boolean z11) {
        this.f15695c.f15628t.setActivated(z11);
    }

    public void setEndIconCheckable(boolean z11) {
        this.f15695c.f15628t.setCheckable(z11);
    }

    public void setEndIconContentDescription(int i11) {
        EndCompoundLayout endCompoundLayout = this.f15695c;
        CharSequence text = i11 != 0 ? endCompoundLayout.getResources().getText(i11) : null;
        CheckableImageButton checkableImageButton = endCompoundLayout.f15628t;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i11) {
        EndCompoundLayout endCompoundLayout = this.f15695c;
        Drawable drawableK = i11 != 0 ? jh.h.k(endCompoundLayout.getContext(), i11) : null;
        TextInputLayout textInputLayout = endCompoundLayout.f15620a;
        CheckableImageButton checkableImageButton = endCompoundLayout.f15628t;
        checkableImageButton.setImageDrawable(drawableK);
        if (drawableK != null) {
            IconHelper.a(textInputLayout, checkableImageButton, endCompoundLayout.M, endCompoundLayout.N);
            IconHelper.c(textInputLayout, checkableImageButton, endCompoundLayout.M);
        }
    }

    public void setEndIconMinSize(int i11) {
        EndCompoundLayout endCompoundLayout = this.f15695c;
        if (i11 < 0) {
            endCompoundLayout.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i11 != endCompoundLayout.O) {
            endCompoundLayout.O = i11;
            CheckableImageButton checkableImageButton = endCompoundLayout.f15628t;
            checkableImageButton.setMinimumWidth(i11);
            checkableImageButton.setMinimumHeight(i11);
            CheckableImageButton checkableImageButton2 = endCompoundLayout.f15624c;
            checkableImageButton2.setMinimumWidth(i11);
            checkableImageButton2.setMinimumHeight(i11);
        }
    }

    public void setEndIconMode(int i11) {
        this.f15695c.g(i11);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        EndCompoundLayout endCompoundLayout = this.f15695c;
        CheckableImageButton checkableImageButton = endCompoundLayout.f15628t;
        View.OnLongClickListener onLongClickListener = endCompoundLayout.Q;
        checkableImageButton.setOnClickListener(onClickListener);
        IconHelper.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        EndCompoundLayout endCompoundLayout = this.f15695c;
        endCompoundLayout.Q = onLongClickListener;
        CheckableImageButton checkableImageButton = endCompoundLayout.f15628t;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        IconHelper.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        EndCompoundLayout endCompoundLayout = this.f15695c;
        endCompoundLayout.P = scaleType;
        endCompoundLayout.f15628t.setScaleType(scaleType);
        endCompoundLayout.f15624c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        EndCompoundLayout endCompoundLayout = this.f15695c;
        if (endCompoundLayout.M != colorStateList) {
            endCompoundLayout.M = colorStateList;
            IconHelper.a(endCompoundLayout.f15620a, endCompoundLayout.f15628t, colorStateList, endCompoundLayout.N);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        EndCompoundLayout endCompoundLayout = this.f15695c;
        if (endCompoundLayout.N != mode) {
            endCompoundLayout.N = mode;
            IconHelper.a(endCompoundLayout.f15620a, endCompoundLayout.f15628t, endCompoundLayout.M, mode);
        }
    }

    public void setEndIconVisible(boolean z11) {
        this.f15695c.h(z11);
    }

    public void setError(CharSequence charSequence) {
        IndicatorViewController indicatorViewController = this.M;
        if (!indicatorViewController.f15655q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            indicatorViewController.f();
            return;
        }
        indicatorViewController.c();
        indicatorViewController.f15654p = charSequence;
        indicatorViewController.f15656r.setText(charSequence);
        int i11 = indicatorViewController.f15652n;
        if (i11 != 1) {
            indicatorViewController.f15653o = 1;
        }
        indicatorViewController.i(i11, indicatorViewController.f15653o, indicatorViewController.h(indicatorViewController.f15656r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i11) {
        IndicatorViewController indicatorViewController = this.M;
        indicatorViewController.f15658t = i11;
        AppCompatTextView appCompatTextView = indicatorViewController.f15656r;
        if (appCompatTextView != null) {
            appCompatTextView.setAccessibilityLiveRegion(i11);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        IndicatorViewController indicatorViewController = this.M;
        indicatorViewController.f15657s = charSequence;
        AppCompatTextView appCompatTextView = indicatorViewController.f15656r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z11) {
        IndicatorViewController indicatorViewController = this.M;
        TextInputLayout textInputLayout = indicatorViewController.f15647h;
        if (indicatorViewController.f15655q == z11) {
            return;
        }
        indicatorViewController.c();
        if (z11) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(indicatorViewController.f15646g);
            indicatorViewController.f15656r = appCompatTextView;
            appCompatTextView.setId(com.lingodeer.R.id.textinput_error);
            indicatorViewController.f15656r.setTextAlignment(5);
            Typeface typeface = indicatorViewController.B;
            if (typeface != null) {
                indicatorViewController.f15656r.setTypeface(typeface);
            }
            int i11 = indicatorViewController.f15659u;
            indicatorViewController.f15659u = i11;
            AppCompatTextView appCompatTextView2 = indicatorViewController.f15656r;
            if (appCompatTextView2 != null) {
                indicatorViewController.f15647h.n(appCompatTextView2, i11);
            }
            ColorStateList colorStateList = indicatorViewController.f15660v;
            indicatorViewController.f15660v = colorStateList;
            AppCompatTextView appCompatTextView3 = indicatorViewController.f15656r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = indicatorViewController.f15657s;
            indicatorViewController.f15657s = charSequence;
            AppCompatTextView appCompatTextView4 = indicatorViewController.f15656r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i12 = indicatorViewController.f15658t;
            indicatorViewController.f15658t = i12;
            AppCompatTextView appCompatTextView5 = indicatorViewController.f15656r;
            if (appCompatTextView5 != null) {
                appCompatTextView5.setAccessibilityLiveRegion(i12);
            }
            indicatorViewController.f15656r.setVisibility(4);
            indicatorViewController.a(indicatorViewController.f15656r, 0);
        } else {
            indicatorViewController.f();
            indicatorViewController.g(indicatorViewController.f15656r, 0);
            indicatorViewController.f15656r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        indicatorViewController.f15655q = z11;
    }

    public void setErrorIconDrawable(int i11) {
        EndCompoundLayout endCompoundLayout = this.f15695c;
        endCompoundLayout.i(i11 != 0 ? jh.h.k(endCompoundLayout.getContext(), i11) : null);
        IconHelper.c(endCompoundLayout.f15620a, endCompoundLayout.f15624c, endCompoundLayout.f15625d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        EndCompoundLayout endCompoundLayout = this.f15695c;
        CheckableImageButton checkableImageButton = endCompoundLayout.f15624c;
        View.OnLongClickListener onLongClickListener = endCompoundLayout.f15627f;
        checkableImageButton.setOnClickListener(onClickListener);
        IconHelper.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        EndCompoundLayout endCompoundLayout = this.f15695c;
        endCompoundLayout.f15627f = onLongClickListener;
        CheckableImageButton checkableImageButton = endCompoundLayout.f15624c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        IconHelper.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        EndCompoundLayout endCompoundLayout = this.f15695c;
        if (endCompoundLayout.f15625d != colorStateList) {
            endCompoundLayout.f15625d = colorStateList;
            IconHelper.a(endCompoundLayout.f15620a, endCompoundLayout.f15624c, colorStateList, endCompoundLayout.f15626e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        EndCompoundLayout endCompoundLayout = this.f15695c;
        if (endCompoundLayout.f15626e != mode) {
            endCompoundLayout.f15626e = mode;
            IconHelper.a(endCompoundLayout.f15620a, endCompoundLayout.f15624c, endCompoundLayout.f15625d, mode);
        }
    }

    public void setErrorTextAppearance(int i11) {
        IndicatorViewController indicatorViewController = this.M;
        indicatorViewController.f15659u = i11;
        AppCompatTextView appCompatTextView = indicatorViewController.f15656r;
        if (appCompatTextView != null) {
            indicatorViewController.f15647h.n(appCompatTextView, i11);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        IndicatorViewController indicatorViewController = this.M;
        indicatorViewController.f15660v = colorStateList;
        AppCompatTextView appCompatTextView = indicatorViewController.f15656r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z11) {
        if (this.Z0 != z11) {
            this.Z0 = z11;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        IndicatorViewController indicatorViewController = this.M;
        if (zIsEmpty) {
            if (indicatorViewController.f15662x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!indicatorViewController.f15662x) {
            setHelperTextEnabled(true);
        }
        indicatorViewController.c();
        indicatorViewController.f15661w = charSequence;
        indicatorViewController.f15663y.setText(charSequence);
        int i11 = indicatorViewController.f15652n;
        if (i11 != 2) {
            indicatorViewController.f15653o = 2;
        }
        indicatorViewController.i(i11, indicatorViewController.f15653o, indicatorViewController.h(indicatorViewController.f15663y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        IndicatorViewController indicatorViewController = this.M;
        indicatorViewController.A = colorStateList;
        AppCompatTextView appCompatTextView = indicatorViewController.f15663y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z11) {
        final IndicatorViewController indicatorViewController = this.M;
        TextInputLayout textInputLayout = indicatorViewController.f15647h;
        if (indicatorViewController.f15662x == z11) {
            return;
        }
        indicatorViewController.c();
        if (z11) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(indicatorViewController.f15646g);
            indicatorViewController.f15663y = appCompatTextView;
            appCompatTextView.setId(com.lingodeer.R.id.textinput_helper_text);
            indicatorViewController.f15663y.setTextAlignment(5);
            Typeface typeface = indicatorViewController.B;
            if (typeface != null) {
                indicatorViewController.f15663y.setTypeface(typeface);
            }
            indicatorViewController.f15663y.setVisibility(4);
            indicatorViewController.f15663y.setAccessibilityLiveRegion(1);
            int i11 = indicatorViewController.f15664z;
            indicatorViewController.f15664z = i11;
            AppCompatTextView appCompatTextView2 = indicatorViewController.f15663y;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextAppearance(i11);
            }
            ColorStateList colorStateList = indicatorViewController.A;
            indicatorViewController.A = colorStateList;
            AppCompatTextView appCompatTextView3 = indicatorViewController.f15663y;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            indicatorViewController.a(indicatorViewController.f15663y, 1);
            indicatorViewController.f15663y.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.google.android.material.textfield.IndicatorViewController.2
                @Override // android.view.View.AccessibilityDelegate
                public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    EditText editText = IndicatorViewController.this.f15647h.getEditText();
                    if (editText != null) {
                        accessibilityNodeInfo.setLabeledBy(editText);
                    }
                }
            });
        } else {
            indicatorViewController.c();
            int i12 = indicatorViewController.f15652n;
            if (i12 == 2) {
                indicatorViewController.f15653o = 0;
            }
            indicatorViewController.i(i12, indicatorViewController.f15653o, indicatorViewController.h(indicatorViewController.f15663y, BuildConfig.VERSION_NAME));
            indicatorViewController.g(indicatorViewController.f15663y, 1);
            indicatorViewController.f15663y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        indicatorViewController.f15662x = z11;
    }

    public void setHelperTextTextAppearance(int i11) {
        IndicatorViewController indicatorViewController = this.M;
        indicatorViewController.f15664z = i11;
        AppCompatTextView appCompatTextView = indicatorViewController.f15663y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i11);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f15707i0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z11) {
        this.f15691a1 = z11;
    }

    public void setHintEnabled(boolean z11) {
        if (z11 != this.f15707i0) {
            this.f15707i0 = z11;
            if (z11) {
                CharSequence hint = this.f15701e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f15708j0)) {
                        setHint(hint);
                    }
                    this.f15701e.setHint((CharSequence) null);
                }
                this.f15709k0 = true;
            } else {
                this.f15709k0 = false;
                if (!TextUtils.isEmpty(this.f15708j0) && TextUtils.isEmpty(this.f15701e.getHint())) {
                    this.f15701e.setHint(this.f15708j0);
                }
                setHintInternal(null);
            }
            if (this.f15701e != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i11) {
        CollapsingTextHelper collapsingTextHelper = this.Y0;
        if (i11 != collapsingTextHelper.f14635p0) {
            collapsingTextHelper.f14635p0 = i11;
            collapsingTextHelper.l(false);
        }
        collapsingTextHelper.v(i11);
        requestLayout();
    }

    public void setHintTextAppearance(int i11) {
        CollapsingTextHelper collapsingTextHelper = this.Y0;
        collapsingTextHelper.q(i11);
        this.M0 = collapsingTextHelper.f14634p;
        if (this.f15701e != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.M0 != colorStateList) {
            if (this.L0 == null) {
                this.Y0.r(colorStateList);
            }
            this.M0 = colorStateList;
            if (this.f15701e != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(LengthCounter lengthCounter) {
        this.Q = lengthCounter;
    }

    public void setMaxEms(int i11) {
        this.H = i11;
        EditText editText = this.f15701e;
        if (editText == null || i11 == -1) {
            return;
        }
        editText.setMaxEms(i11);
    }

    public void setMaxWidth(int i11) {
        this.L = i11;
        EditText editText = this.f15701e;
        if (editText == null || i11 == -1) {
            return;
        }
        editText.setMaxWidth(i11);
    }

    public void setMaxWidthResource(int i11) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i11));
    }

    public void setMinEms(int i11) {
        this.f15718t = i11;
        EditText editText = this.f15701e;
        if (editText == null || i11 == -1) {
            return;
        }
        editText.setMinEms(i11);
    }

    public void setMinWidth(int i11) {
        this.K = i11;
        EditText editText = this.f15701e;
        if (editText == null || i11 == -1) {
            return;
        }
        editText.setMinWidth(i11);
    }

    public void setMinWidthResource(int i11) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i11));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i11) {
        EndCompoundLayout endCompoundLayout = this.f15695c;
        endCompoundLayout.f15628t.setContentDescription(i11 != 0 ? endCompoundLayout.getResources().getText(i11) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i11) {
        EndCompoundLayout endCompoundLayout = this.f15695c;
        endCompoundLayout.f15628t.setImageDrawable(i11 != 0 ? jh.h.k(endCompoundLayout.getContext(), i11) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z11) {
        EndCompoundLayout endCompoundLayout = this.f15695c;
        if (z11 && endCompoundLayout.K != 1) {
            endCompoundLayout.g(1);
        } else if (z11) {
            endCompoundLayout.getClass();
        } else {
            endCompoundLayout.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        EndCompoundLayout endCompoundLayout = this.f15695c;
        endCompoundLayout.M = colorStateList;
        IconHelper.a(endCompoundLayout.f15620a, endCompoundLayout.f15628t, colorStateList, endCompoundLayout.N);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        EndCompoundLayout endCompoundLayout = this.f15695c;
        endCompoundLayout.N = mode;
        IconHelper.a(endCompoundLayout.f15620a, endCompoundLayout.f15628t, endCompoundLayout.M, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.W == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.W = appCompatTextView;
            appCompatTextView.setId(com.lingodeer.R.id.textinput_placeholder);
            this.W.setImportantForAccessibility(1);
            this.W.setAccessibilityLiveRegion(1);
            qa.h hVarF = f();
            this.f15696c0 = hVarF;
            hVarF.f47678b = 67L;
            this.f15699d0 = f();
            setPlaceholderTextAppearance(this.f15693b0);
            setPlaceholderTextColor(this.f15690a0);
            s0.q(this.W, new AnonymousClass2());
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.V) {
                setPlaceholderTextEnabled(true);
            }
            this.U = charSequence;
        }
        EditText editText = this.f15701e;
        x(editText == null ? null : editText.getText());
    }

    public void setPlaceholderTextAppearance(int i11) {
        this.f15693b0 = i11;
        AppCompatTextView appCompatTextView = this.W;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i11);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f15690a0 != colorStateList) {
            this.f15690a0 = colorStateList;
            AppCompatTextView appCompatTextView = this.W;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        StartCompoundLayout startCompoundLayout = this.f15692b;
        startCompoundLayout.getClass();
        startCompoundLayout.f15683c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        startCompoundLayout.f15682b.setText(charSequence);
        startCompoundLayout.e();
    }

    public void setPrefixTextAppearance(int i11) {
        this.f15692b.f15682b.setTextAppearance(i11);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f15692b.f15682b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = this.f15710l0;
        if (materialShapeDrawable == null || materialShapeDrawable.f15200b.f15214a == shapeAppearanceModel) {
            return;
        }
        this.f15716r0 = shapeAppearanceModel;
        c();
    }

    public void setStartIconCheckable(boolean z11) {
        this.f15692b.f15684d.setCheckable(z11);
    }

    public void setStartIconContentDescription(int i11) {
        setStartIconContentDescription(i11 != 0 ? getResources().getText(i11) : null);
    }

    public void setStartIconDrawable(int i11) {
        setStartIconDrawable(i11 != 0 ? jh.h.k(getContext(), i11) : null);
    }

    public void setStartIconMinSize(int i11) {
        StartCompoundLayout startCompoundLayout = this.f15692b;
        if (i11 < 0) {
            startCompoundLayout.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i11 != startCompoundLayout.f15687t) {
            startCompoundLayout.f15687t = i11;
            CheckableImageButton checkableImageButton = startCompoundLayout.f15684d;
            checkableImageButton.setMinimumWidth(i11);
            checkableImageButton.setMinimumHeight(i11);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        StartCompoundLayout startCompoundLayout = this.f15692b;
        CheckableImageButton checkableImageButton = startCompoundLayout.f15684d;
        View.OnLongClickListener onLongClickListener = startCompoundLayout.K;
        checkableImageButton.setOnClickListener(onClickListener);
        IconHelper.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        StartCompoundLayout startCompoundLayout = this.f15692b;
        startCompoundLayout.K = onLongClickListener;
        CheckableImageButton checkableImageButton = startCompoundLayout.f15684d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        IconHelper.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        StartCompoundLayout startCompoundLayout = this.f15692b;
        startCompoundLayout.H = scaleType;
        startCompoundLayout.f15684d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        StartCompoundLayout startCompoundLayout = this.f15692b;
        if (startCompoundLayout.f15685e != colorStateList) {
            startCompoundLayout.f15685e = colorStateList;
            IconHelper.a(startCompoundLayout.f15681a, startCompoundLayout.f15684d, colorStateList, startCompoundLayout.f15686f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        StartCompoundLayout startCompoundLayout = this.f15692b;
        if (startCompoundLayout.f15686f != mode) {
            startCompoundLayout.f15686f = mode;
            IconHelper.a(startCompoundLayout.f15681a, startCompoundLayout.f15684d, startCompoundLayout.f15685e, mode);
        }
    }

    public void setStartIconVisible(boolean z11) {
        this.f15692b.c(z11);
    }

    public void setSuffixText(CharSequence charSequence) {
        EndCompoundLayout endCompoundLayout = this.f15695c;
        endCompoundLayout.getClass();
        endCompoundLayout.R = TextUtils.isEmpty(charSequence) ? null : charSequence;
        endCompoundLayout.S.setText(charSequence);
        endCompoundLayout.n();
    }

    public void setSuffixTextAppearance(int i11) {
        this.f15695c.S.setTextAppearance(i11);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f15695c.S.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(AccessibilityDelegate accessibilityDelegate) {
        EditText editText = this.f15701e;
        if (editText != null) {
            s0.q(editText, accessibilityDelegate);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.E0) {
            this.E0 = typeface;
            CollapsingTextHelper collapsingTextHelper = this.Y0;
            boolean zT = collapsingTextHelper.t(typeface);
            boolean z11 = collapsingTextHelper.z(typeface);
            if (zT || z11) {
                collapsingTextHelper.l(false);
            }
            IndicatorViewController indicatorViewController = this.M;
            if (typeface != indicatorViewController.B) {
                indicatorViewController.B = typeface;
                AppCompatTextView appCompatTextView = indicatorViewController.f15656r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = indicatorViewController.f15663y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.R;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f15701e;
        if (editText == null || this.f15720u0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = c1.f48538a;
        Drawable drawableMutate = background.mutate();
        if (o()) {
            drawableMutate.setColorFilter(s.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.P && (appCompatTextView = this.R) != null) {
            drawableMutate.setColorFilter(s.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f15701e.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.f15701e;
        if (editText == null || this.f15710l0 == null) {
            return;
        }
        if ((this.f15713o0 || editText.getBackground() == null) && this.f15720u0 != 0) {
            this.f15701e.setBackground(getEditTextBoxBackground());
            this.f15713o0 = true;
        }
    }

    public final void v() {
        if (this.f15720u0 != 1) {
            FrameLayout frameLayout = this.f15689a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z11, boolean z12) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f15701e;
        boolean z13 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f15701e;
        boolean z14 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.L0;
        CollapsingTextHelper collapsingTextHelper = this.Y0;
        if (colorStateList2 != null) {
            collapsingTextHelper.n(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.L0;
            collapsingTextHelper.n(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.V0) : this.V0));
        } else if (o()) {
            AppCompatTextView appCompatTextView2 = this.M.f15656r;
            collapsingTextHelper.n(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.P && (appCompatTextView = this.R) != null) {
            collapsingTextHelper.n(appCompatTextView.getTextColors());
        } else if (z14 && (colorStateList = this.M0) != null) {
            collapsingTextHelper.r(colorStateList);
        }
        EndCompoundLayout endCompoundLayout = this.f15695c;
        StartCompoundLayout startCompoundLayout = this.f15692b;
        if (z13 || !this.Z0 || (isEnabled() && z14)) {
            if (z12 || this.X0) {
                ValueAnimator valueAnimator = this.f15694b1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f15694b1.cancel();
                }
                if (z11 && this.f15691a1) {
                    b(1.0f);
                } else {
                    collapsingTextHelper.A(1.0f);
                }
                this.X0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.f15701e;
                x(editText3 != null ? editText3.getText() : null);
                startCompoundLayout.L = false;
                startCompoundLayout.e();
                endCompoundLayout.T = false;
                endCompoundLayout.n();
                return;
            }
            return;
        }
        if (z12 || !this.X0) {
            ValueAnimator valueAnimator2 = this.f15694b1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f15694b1.cancel();
            }
            if (z11 && this.f15691a1) {
                b(CropImageView.DEFAULT_ASPECT_RATIO);
            } else {
                collapsingTextHelper.A(CropImageView.DEFAULT_ASPECT_RATIO);
            }
            if (g() && !((CutoutDrawable) this.f15710l0).f15603j0.f15604s.isEmpty() && g()) {
                ((CutoutDrawable) this.f15710l0).E(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
            }
            this.X0 = true;
            AppCompatTextView appCompatTextView3 = this.W;
            if (appCompatTextView3 != null && this.V) {
                appCompatTextView3.setText((CharSequence) null);
                z.a(this.f15689a, this.f15699d0);
                this.W.setVisibility(4);
            }
            startCompoundLayout.L = true;
            startCompoundLayout.e();
            endCompoundLayout.T = true;
            endCompoundLayout.n();
        }
    }

    public final void x(Editable editable) {
        int iE = this.Q.e(editable);
        FrameLayout frameLayout = this.f15689a;
        if (iE != 0 || this.X0) {
            AppCompatTextView appCompatTextView = this.W;
            if (appCompatTextView == null || !this.V) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            z.a(frameLayout, this.f15699d0);
            this.W.setVisibility(4);
            return;
        }
        if (this.W == null || !this.V || TextUtils.isEmpty(this.U)) {
            return;
        }
        this.W.setText(this.U);
        z.a(frameLayout, this.f15696c0);
        this.W.setVisibility(0);
        this.W.bringToFront();
    }

    public final void y(boolean z11, boolean z12) {
        int defaultColor = this.Q0.getDefaultColor();
        int colorForState = this.Q0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.Q0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z11) {
            this.f15725z0 = colorForState2;
        } else if (z12) {
            this.f15725z0 = colorForState;
        } else {
            this.f15725z0 = defaultColor;
        }
    }

    public final void z() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.f15710l0 == null || this.f15720u0 == 0) {
            return;
        }
        boolean z11 = false;
        boolean z12 = isFocused() || ((editText2 = this.f15701e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f15701e) != null && editText.isHovered())) {
            z11 = true;
        }
        if (!isEnabled()) {
            this.f15725z0 = this.V0;
        } else if (o()) {
            if (this.Q0 != null) {
                y(z12, z11);
            } else {
                this.f15725z0 = getErrorCurrentTextColors();
            }
        } else if (!this.P || (appCompatTextView = this.R) == null) {
            if (z12) {
                this.f15725z0 = this.P0;
            } else if (z11) {
                this.f15725z0 = this.O0;
            } else {
                this.f15725z0 = this.N0;
            }
        } else if (this.Q0 != null) {
            y(z12, z11);
        } else {
            this.f15725z0 = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        EndCompoundLayout endCompoundLayout = this.f15695c;
        TextInputLayout textInputLayout = endCompoundLayout.f15620a;
        CheckableImageButton checkableImageButton = endCompoundLayout.f15628t;
        TextInputLayout textInputLayout2 = endCompoundLayout.f15620a;
        endCompoundLayout.l();
        IconHelper.c(textInputLayout2, endCompoundLayout.f15624c, endCompoundLayout.f15625d);
        IconHelper.c(textInputLayout2, checkableImageButton, endCompoundLayout.M);
        if (endCompoundLayout.b() instanceof DropdownMenuEndIconDelegate) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                IconHelper.a(textInputLayout, checkableImageButton, endCompoundLayout.M, endCompoundLayout.N);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        StartCompoundLayout startCompoundLayout = this.f15692b;
        IconHelper.c(startCompoundLayout.f15681a, startCompoundLayout.f15684d, startCompoundLayout.f15685e);
        if (this.f15720u0 == 2) {
            int i11 = this.f15722w0;
            if (z12 && isEnabled()) {
                this.f15722w0 = this.f15724y0;
            } else {
                this.f15722w0 = this.f15723x0;
            }
            if (this.f15722w0 != i11 && g() && !this.X0) {
                if (g()) {
                    ((CutoutDrawable) this.f15710l0).E(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                }
                l();
            }
        }
        if (this.f15720u0 == 1) {
            if (!isEnabled()) {
                this.A0 = this.S0;
            } else if (z11 && !z12) {
                this.A0 = this.U0;
            } else if (z12) {
                this.A0 = this.T0;
            } else {
                this.A0 = this.R0;
            }
        }
        c();
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.lingodeer.R.attr.textInputStyle);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f15692b.f15684d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f15692b.b(drawable);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.a(context, attributeSet, i11, com.lingodeer.R.style.Widget_Design_TextInputLayout), attributeSet, i11);
        this.f15718t = -1;
        this.H = -1;
        this.K = -1;
        this.L = -1;
        this.M = new IndicatorViewController(this);
        this.Q = new c3.a(14);
        this.B0 = new Rect();
        this.C0 = new Rect();
        this.D0 = new RectF();
        this.H0 = new LinkedHashSet();
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.Y0 = collapsingTextHelper;
        this.e1 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f15689a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AnimationUtils.f13768a;
        collapsingTextHelper.X = linearInterpolator;
        collapsingTextHelper.l(false);
        collapsingTextHelper.W = linearInterpolator;
        collapsingTextHelper.l(false);
        collapsingTextHelper.s(8388659);
        m4 m4VarE = ThemeEnforcement.e(context2, attributeSet, com.google.android.material.R.styleable.f13752l0, i11, com.lingodeer.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        StartCompoundLayout startCompoundLayout = new StartCompoundLayout(this, m4VarE);
        this.f15692b = startCompoundLayout;
        TypedArray typedArray = (TypedArray) m4VarE.f48061c;
        this.f15707i0 = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.f15691a1 = typedArray.getBoolean(47, true);
        this.Z0 = typedArray.getBoolean(42, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.f15716r0 = ShapeAppearanceModel.d(context2, attributeSet, i11, com.lingodeer.R.style.Widget_Design_TextInputLayout).a();
        this.f15719t0 = context2.getResources().getDimensionPixelOffset(com.lingodeer.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f15721v0 = typedArray.getDimensionPixelOffset(9, 0);
        this.f15698d = getResources().getDimensionPixelSize(com.lingodeer.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.f15723x0 = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.lingodeer.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f15724y0 = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.lingodeer.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f15722w0 = this.f15723x0;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        ShapeAppearanceModel.Builder builderH = this.f15716r0.h();
        if (dimension >= CropImageView.DEFAULT_ASPECT_RATIO) {
            builderH.f(dimension);
        }
        if (dimension2 >= CropImageView.DEFAULT_ASPECT_RATIO) {
            builderH.g(dimension2);
        }
        if (dimension3 >= CropImageView.DEFAULT_ASPECT_RATIO) {
            builderH.e(dimension3);
        }
        if (dimension4 >= CropImageView.DEFAULT_ASPECT_RATIO) {
            builderH.d(dimension4);
        }
        this.f15716r0 = builderH.a();
        ColorStateList colorStateListB = MaterialResources.b(context2, m4VarE, 7);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.R0 = defaultColor;
            this.A0 = defaultColor;
            if (colorStateListB.isStateful()) {
                this.S0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.T0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.U0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.T0 = this.R0;
                ColorStateList colorStateListB2 = o4.c.b(context2, com.lingodeer.R.color.mtrl_filled_background_color);
                this.S0 = colorStateListB2.getColorForState(new int[]{-16842910}, -1);
                this.U0 = colorStateListB2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.A0 = 0;
            this.R0 = 0;
            this.S0 = 0;
            this.T0 = 0;
            this.U0 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList colorStateListF = m4VarE.f(1);
            this.M0 = colorStateListF;
            this.L0 = colorStateListF;
        }
        ColorStateList colorStateListB3 = MaterialResources.b(context2, m4VarE, 14);
        this.P0 = typedArray.getColor(14, 0);
        this.N0 = context2.getColor(com.lingodeer.R.color.mtrl_textinput_default_box_stroke_color);
        this.V0 = context2.getColor(com.lingodeer.R.color.mtrl_textinput_disabled_color);
        this.O0 = context2.getColor(com.lingodeer.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListB3 != null) {
            setBoxStrokeColorStateList(colorStateListB3);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(MaterialResources.b(context2, m4VarE, 15));
        }
        if (typedArray.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(50, 0));
        }
        this.f15705g0 = m4VarE.f(24);
        this.f15706h0 = m4VarE.f(25);
        int resourceId = typedArray.getResourceId(40, 0);
        CharSequence text = typedArray.getText(35);
        int i12 = typedArray.getInt(34, 1);
        boolean z11 = typedArray.getBoolean(36, false);
        int resourceId2 = typedArray.getResourceId(45, 0);
        boolean z12 = typedArray.getBoolean(44, false);
        CharSequence text2 = typedArray.getText(43);
        int resourceId3 = typedArray.getResourceId(58, 0);
        CharSequence text3 = typedArray.getText(57);
        boolean z13 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.T = typedArray.getResourceId(22, 0);
        this.S = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i12);
        setCounterOverflowTextAppearance(this.S);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.T);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(m4VarE.f(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(m4VarE.f(46));
        }
        if (typedArray.hasValue(51)) {
            setHintTextColor(m4VarE.f(51));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(m4VarE.f(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(m4VarE.f(21));
        }
        if (typedArray.hasValue(59)) {
            setPlaceholderTextColor(m4VarE.f(59));
        }
        EndCompoundLayout endCompoundLayout = new EndCompoundLayout(this, m4VarE);
        this.f15695c = endCompoundLayout;
        boolean z14 = typedArray.getBoolean(0, true);
        setHintMaxLines(typedArray.getInt(49, 1));
        m4VarE.l();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(startCompoundLayout);
        frameLayout.addView(endCompoundLayout);
        addView(frameLayout);
        setEnabled(z14);
        setHelperTextEnabled(z12);
        setErrorEnabled(z11);
        setCounterEnabled(z13);
        setHelperText(text2);
    }

    public void setHint(int i11) {
        setHint(i11 != 0 ? getResources().getText(i11) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f15695c.f15628t.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f15695c.f15628t.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f15695c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f15695c.f15628t;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        EndCompoundLayout endCompoundLayout = this.f15695c;
        TextInputLayout textInputLayout = endCompoundLayout.f15620a;
        CheckableImageButton checkableImageButton = endCompoundLayout.f15628t;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.a(textInputLayout, checkableImageButton, endCompoundLayout.M, endCompoundLayout.N);
            IconHelper.c(textInputLayout, checkableImageButton, endCompoundLayout.M);
        }
    }
}
