package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class ClearTextEndIconDelegate extends EndIconDelegate {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f15594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f15595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EditText f15596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f15597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f15598k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f15599l;
    public ValueAnimator m;

    public ClearTextEndIconDelegate(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.f15597j = new a(this, 0);
        this.f15598k = new b(this, 0);
        this.f15592e = MotionUtils.c(endCompoundLayout.getContext(), R.attr.motionDurationShort3, 100);
        this.f15593f = MotionUtils.c(endCompoundLayout.getContext(), R.attr.motionDurationShort3, 150);
        this.f15594g = MotionUtils.d(endCompoundLayout.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.f13768a);
        this.f15595h = MotionUtils.d(endCompoundLayout.getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f13771d);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void a() {
        if (this.f15637b.R != null) {
            return;
        }
        s(t());
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final View.OnFocusChangeListener e() {
        return this.f15598k;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final View.OnClickListener f() {
        return this.f15597j;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final View.OnFocusChangeListener g() {
        return this.f15598k;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void l(EditText editText) {
        this.f15596i = editText;
        this.f15636a.setEndIconVisible(t());
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void o(boolean z11) {
        if (this.f15637b.R == null) {
            return;
        }
        s(z11);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f15595h);
        valueAnimatorOfFloat.setDuration(this.f15593f);
        valueAnimatorOfFloat.addUpdateListener(new c(this, 1));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        TimeInterpolator timeInterpolator = this.f15594g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i11 = this.f15592e;
        valueAnimatorOfFloat2.setDuration(i11);
        valueAnimatorOfFloat2.addUpdateListener(new c(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f15599l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f15599l.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                ClearTextEndIconDelegate.this.f15637b.h(true);
            }
        });
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i11);
        valueAnimatorOfFloat3.addUpdateListener(new c(this, 0));
        this.m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ClearTextEndIconDelegate.this.f15637b.h(false);
            }
        });
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void r() {
        EditText editText = this.f15596i;
        if (editText != null) {
            editText.post(new d(this, 0));
        }
    }

    public final void s(boolean z11) {
        boolean z12 = this.f15637b.d() == z11;
        if (z11 && !this.f15599l.isRunning()) {
            this.m.cancel();
            this.f15599l.start();
            if (z12) {
                this.f15599l.end();
                return;
            }
            return;
        }
        if (z11) {
            return;
        }
        this.f15599l.cancel();
        this.m.start();
        if (z12) {
            this.m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.f15596i;
        if (editText != null) {
            return (editText.hasFocus() || this.f15639d.hasFocus()) && this.f15596i.getText().length() > 0;
        }
        return false;
    }
}
