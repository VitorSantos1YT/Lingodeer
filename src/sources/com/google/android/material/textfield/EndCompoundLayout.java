package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.lingodeer.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import nv.p;
import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class EndCompoundLayout extends LinearLayout {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final /* synthetic */ int f15619c0 = 0;
    public final EndIconDelegates H;
    public int K;
    public final LinkedHashSet L;
    public ColorStateList M;
    public PorterDuff.Mode N;
    public int O;
    public ImageView.ScaleType P;
    public View.OnLongClickListener Q;
    public CharSequence R;
    public final AppCompatTextView S;
    public boolean T;
    public EditText U;
    public final AccessibilityManager V;
    public AccessibilityManager.TouchExplorationStateChangeListener W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f15620a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final TextWatcher f15621a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f15622b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final TextInputLayout.OnEditTextAttachedListener f15623b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f15624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f15625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f15626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f15627f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CheckableImageButton f15628t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class EndIconDelegates {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseArray f15632a = new SparseArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EndCompoundLayout f15633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f15634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f15635d;

        public EndIconDelegates(EndCompoundLayout endCompoundLayout, m4 m4Var) {
            this.f15633b = endCompoundLayout;
            TypedArray typedArray = (TypedArray) m4Var.f48061c;
            this.f15634c = typedArray.getResourceId(28, 0);
            this.f15635d = typedArray.getResourceId(53, 0);
        }
    }

    public EndCompoundLayout(TextInputLayout textInputLayout, m4 m4Var) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.K = 0;
        this.L = new LinkedHashSet();
        this.f15621a0 = new TextWatcherAdapter() { // from class: com.google.android.material.textfield.EndCompoundLayout.1
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                EndCompoundLayout.this.b().a();
            }

            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
                EndCompoundLayout.this.b().b();
            }
        };
        TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener = new TextInputLayout.OnEditTextAttachedListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.2
            @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
            public final void a(TextInputLayout textInputLayout2) {
                EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
                TextWatcher textWatcher = endCompoundLayout.f15621a0;
                if (endCompoundLayout.U == textInputLayout2.getEditText()) {
                    return;
                }
                EditText editText = endCompoundLayout.U;
                if (editText != null) {
                    editText.removeTextChangedListener(textWatcher);
                    if (endCompoundLayout.U.getOnFocusChangeListener() == endCompoundLayout.b().e()) {
                        endCompoundLayout.U.setOnFocusChangeListener(null);
                    }
                }
                EditText editText2 = textInputLayout2.getEditText();
                endCompoundLayout.U = editText2;
                if (editText2 != null) {
                    editText2.addTextChangedListener(textWatcher);
                }
                endCompoundLayout.b().l(endCompoundLayout.U);
                endCompoundLayout.j(endCompoundLayout.b());
            }
        };
        this.f15623b0 = onEditTextAttachedListener;
        this.V = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f15620a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f15622b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f15624c = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f15628t = checkableImageButtonA2;
        this.H = new EndIconDelegates(this, m4Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.S = appCompatTextView;
        TypedArray typedArray = (TypedArray) m4Var.f48061c;
        if (typedArray.hasValue(38)) {
            this.f15625d = MaterialResources.b(getContext(), m4Var, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f15626e = ViewUtils.h(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(m4Var.g(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setCheckable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.M = MaterialResources.b(getContext(), m4Var, 32);
            }
            if (typedArray.hasValue(33)) {
                this.N = ViewUtils.h(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.M = MaterialResources.b(getContext(), m4Var, 55);
            }
            if (typedArray.hasValue(56)) {
                this.N = ViewUtils.h(typedArray.getInt(56, -1), null);
            }
            g(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.O) {
            this.O = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeB = IconHelper.b(typedArray.getInt(31, -1));
            this.P = scaleTypeB;
            checkableImageButtonA2.setScaleType(scaleTypeB);
            checkableImageButtonA.setScaleType(scaleTypeB);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            appCompatTextView.setTextColor(m4Var.f(74));
        }
        CharSequence text3 = typedArray.getText(72);
        this.R = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.H0.add(onEditTextAttachedListener);
        if (textInputLayout.f15701e != null) {
            onEditTextAttachedListener.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.3
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                int i11 = EndCompoundLayout.f15619c0;
                EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
                AccessibilityManager accessibilityManager = endCompoundLayout.V;
                if (endCompoundLayout.W == null || accessibilityManager == null || !endCompoundLayout.isAttachedToWindow()) {
                    return;
                }
                accessibilityManager.addTouchExplorationStateChangeListener(endCompoundLayout.W);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                AccessibilityManager accessibilityManager;
                int i11 = EndCompoundLayout.f15619c0;
                EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = endCompoundLayout.W;
                if (touchExplorationStateChangeListener == null || (accessibilityManager = endCompoundLayout.V) == null) {
                    return;
                }
                accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
            }
        });
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i11) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i11);
        if (MaterialResources.f(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final EndIconDelegate b() {
        EndIconDelegate customEndIconDelegate;
        int i11 = this.K;
        EndIconDelegates endIconDelegates = this.H;
        SparseArray sparseArray = endIconDelegates.f15632a;
        EndIconDelegate endIconDelegate = (EndIconDelegate) sparseArray.get(i11);
        if (endIconDelegate != null) {
            return endIconDelegate;
        }
        EndCompoundLayout endCompoundLayout = endIconDelegates.f15633b;
        if (i11 == -1) {
            customEndIconDelegate = new CustomEndIconDelegate(endCompoundLayout);
        } else if (i11 == 0) {
            customEndIconDelegate = new NoEndIconDelegate(endCompoundLayout);
        } else if (i11 == 1) {
            customEndIconDelegate = new PasswordToggleEndIconDelegate(endCompoundLayout, endIconDelegates.f15635d);
        } else if (i11 == 2) {
            customEndIconDelegate = new ClearTextEndIconDelegate(endCompoundLayout);
        } else {
            if (i11 != 3) {
                throw new IllegalArgumentException(p.j(i11, "Invalid end icon mode: "));
            }
            customEndIconDelegate = new DropdownMenuEndIconDelegate(endCompoundLayout);
        }
        sparseArray.append(i11, customEndIconDelegate);
        return customEndIconDelegate;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f15628t;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.S.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f15622b.getVisibility() == 0 && this.f15628t.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f15624c.getVisibility() == 0;
    }

    public final void f(boolean z11) {
        boolean z12;
        boolean zIsActivated;
        boolean z13;
        EndIconDelegate endIconDelegateB = b();
        boolean zJ = endIconDelegateB.j();
        CheckableImageButton checkableImageButton = this.f15628t;
        boolean z14 = true;
        if (!zJ || (z13 = checkableImageButton.f14598d) == endIconDelegateB.k()) {
            z12 = false;
        } else {
            checkableImageButton.setChecked(!z13);
            z12 = true;
        }
        if (!(endIconDelegateB instanceof DropdownMenuEndIconDelegate) || (zIsActivated = checkableImageButton.isActivated()) == ((DropdownMenuEndIconDelegate) endIconDelegateB).f15612l) {
            z14 = z12;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z11 || z14) {
            IconHelper.c(this.f15620a, checkableImageButton, this.M);
        }
    }

    public final void g(int i11) {
        if (this.K == i11) {
            return;
        }
        EndIconDelegate endIconDelegateB = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.W;
        AccessibilityManager accessibilityManager = this.V;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.W = null;
        endIconDelegateB.r();
        this.K = i11;
        Iterator it = this.L.iterator();
        while (it.hasNext()) {
            ((TextInputLayout.OnEndIconChangedListener) it.next()).a();
        }
        h(i11 != 0);
        EndIconDelegate endIconDelegateB2 = b();
        int iD = this.H.f15634c;
        if (iD == 0) {
            iD = endIconDelegateB2.d();
        }
        Drawable drawableK = iD != 0 ? jh.h.k(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.f15628t;
        checkableImageButton.setImageDrawable(drawableK);
        TextInputLayout textInputLayout = this.f15620a;
        if (drawableK != null) {
            IconHelper.a(textInputLayout, checkableImageButton, this.M, this.N);
            IconHelper.c(textInputLayout, checkableImageButton, this.M);
        }
        int iC = endIconDelegateB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(endIconDelegateB2.j());
        if (!endIconDelegateB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i11);
        }
        endIconDelegateB2.q();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = endIconDelegateB2.h();
        this.W = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.W);
        }
        View.OnClickListener onClickListenerF = endIconDelegateB2.f();
        View.OnLongClickListener onLongClickListener = this.Q;
        checkableImageButton.setOnClickListener(onClickListenerF);
        IconHelper.d(checkableImageButton, onLongClickListener);
        EditText editText = this.U;
        if (editText != null) {
            endIconDelegateB2.l(editText);
            j(endIconDelegateB2);
        }
        IconHelper.a(textInputLayout, checkableImageButton, this.M, this.N);
        f(true);
    }

    public final void h(boolean z11) {
        if (d() != z11) {
            this.f15628t.setVisibility(z11 ? 0 : 8);
            k();
            m();
            this.f15620a.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f15624c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        IconHelper.a(this.f15620a, checkableImageButton, this.f15625d, this.f15626e);
    }

    public final void j(EndIconDelegate endIconDelegate) {
        if (this.U == null) {
            return;
        }
        if (endIconDelegate.e() != null) {
            this.U.setOnFocusChangeListener(endIconDelegate.e());
        }
        if (endIconDelegate.g() != null) {
            this.f15628t.setOnFocusChangeListener(endIconDelegate.g());
        }
    }

    public final void k() {
        this.f15622b.setVisibility((this.f15628t.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.R == null || this.T) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f15624c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f15620a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.M.f15655q && textInputLayout.o()) ? 0 : 8);
        k();
        m();
        if (this.K != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        TextInputLayout textInputLayout = this.f15620a;
        if (textInputLayout.f15701e == null) {
            return;
        }
        this.S.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f15701e.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.f15701e.getPaddingEnd(), textInputLayout.f15701e.getPaddingBottom());
    }

    public final void n() {
        AppCompatTextView appCompatTextView = this.S;
        int visibility = appCompatTextView.getVisibility();
        int i11 = (this.R == null || this.T) ? 8 : 0;
        if (visibility != i11) {
            b().o(i11 == 0);
        }
        k();
        appCompatTextView.setVisibility(i11);
        this.f15620a.s();
    }
}
