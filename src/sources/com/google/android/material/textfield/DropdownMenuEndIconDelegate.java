package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class DropdownMenuEndIconDelegate extends EndIconDelegate {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f15607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f15608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f15609i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f15610j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g f15611k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15612l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15613n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f15614o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AccessibilityManager f15615p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f15616q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f15617r;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.material.textfield.g] */
    public DropdownMenuEndIconDelegate(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.f15609i = new a(this, 1);
        this.f15610j = new b(this, 1);
        this.f15611k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.g
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z11) {
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = this.f15744a;
                AutoCompleteTextView autoCompleteTextView = dropdownMenuEndIconDelegate.f15608h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                dropdownMenuEndIconDelegate.f15639d.setImportantForAccessibility(z11 ? 2 : 1);
            }
        };
        this.f15614o = Long.MAX_VALUE;
        this.f15606f = MotionUtils.c(endCompoundLayout.getContext(), R.attr.motionDurationShort3, 67);
        this.f15605e = MotionUtils.c(endCompoundLayout.getContext(), R.attr.motionDurationShort3, 50);
        this.f15607g = MotionUtils.d(endCompoundLayout.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.f13768a);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void a() {
        if (this.f15615p.isTouchExplorationEnabled() && this.f15608h.getInputType() != 0 && !this.f15639d.hasFocus()) {
            this.f15608h.dismissDropDown();
        }
        this.f15608h.post(new d(this, 1));
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final View.OnFocusChangeListener e() {
        return this.f15610j;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final View.OnClickListener f() {
        return this.f15609i;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f15611k;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final boolean i(int i11) {
        return i11 != 0;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final boolean k() {
        return this.f15613n;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f15608h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.e
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = this.f15742a;
                    long j11 = jUptimeMillis - dropdownMenuEndIconDelegate.f15614o;
                    if (j11 < 0 || j11 > 300) {
                        dropdownMenuEndIconDelegate.m = false;
                    }
                    dropdownMenuEndIconDelegate.t();
                    dropdownMenuEndIconDelegate.m = true;
                    dropdownMenuEndIconDelegate.f15614o = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.f15608h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.f
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = this.f15743a;
                dropdownMenuEndIconDelegate.m = true;
                dropdownMenuEndIconDelegate.f15614o = SystemClock.uptimeMillis();
                dropdownMenuEndIconDelegate.s(false);
            }
        });
        this.f15608h.setThreshold(0);
        TextInputLayout textInputLayout = this.f15636a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f15615p.isTouchExplorationEnabled()) {
            this.f15639d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void m(a5.g gVar) {
        if (this.f15608h.getInputType() == 0) {
            gVar.m(Spinner.class.getName());
        }
        if (gVar.h()) {
            gVar.r(null);
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (this.f15615p.isEnabled() && this.f15608h.getInputType() == 0) {
            boolean z11 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f15613n && !this.f15608h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z11) {
                t();
                this.m = true;
                this.f15614o = SystemClock.uptimeMillis();
            }
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void q() {
        int i11 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        TimeInterpolator timeInterpolator = this.f15607g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f15606f);
        valueAnimatorOfFloat.addUpdateListener(new c(this, i11));
        this.f15617r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f15605e);
        valueAnimatorOfFloat2.addUpdateListener(new c(this, i11));
        this.f15616q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = DropdownMenuEndIconDelegate.this;
                dropdownMenuEndIconDelegate.p();
                dropdownMenuEndIconDelegate.f15617r.start();
            }
        });
        this.f15615p = (AccessibilityManager) this.f15638c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.f15608h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f15608h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z11) {
        if (this.f15613n != z11) {
            this.f15613n = z11;
            this.f15617r.cancel();
            this.f15616q.start();
        }
    }

    public final void t() {
        if (this.f15608h == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f15614o;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        s(!this.f15613n);
        if (!this.f15613n) {
            this.f15608h.dismissDropDown();
        } else {
            this.f15608h.requestFocus();
            this.f15608h.showDropDown();
        }
    }
}
