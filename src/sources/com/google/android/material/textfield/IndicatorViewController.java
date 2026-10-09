package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class IndicatorViewController {
    public ColorStateList A;
    public Typeface B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f15643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f15644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f15645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f15646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextInputLayout f15647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f15648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f15650k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f15651l;
    public final float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15652n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15653o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f15654p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f15655q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AppCompatTextView f15656r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f15657s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15658t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15659u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f15660v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f15661w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f15662x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AppCompatTextView f15663y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f15664z;

    public IndicatorViewController(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f15646g = context;
        this.f15647h = textInputLayout;
        this.m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f15640a = MotionUtils.c(context, R.attr.motionDurationShort4, 217);
        this.f15641b = MotionUtils.c(context, R.attr.motionDurationMedium4, 167);
        this.f15642c = MotionUtils.c(context, R.attr.motionDurationShort4, 167);
        this.f15643d = MotionUtils.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AnimationUtils.f13771d);
        LinearInterpolator linearInterpolator = AnimationUtils.f13768a;
        this.f15644e = MotionUtils.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f15645f = MotionUtils.d(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(AppCompatTextView appCompatTextView, int i11) {
        if (this.f15648i == null && this.f15650k == null) {
            Context context = this.f15646g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f15648i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f15648i;
            TextInputLayout textInputLayout = this.f15647h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f15650k = new FrameLayout(context);
            this.f15648i.addView(this.f15650k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i11 == 0 || i11 == 1) {
            this.f15650k.setVisibility(0);
            this.f15650k.addView(appCompatTextView);
        } else {
            this.f15648i.addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f15648i.setVisibility(0);
        this.f15649j++;
    }

    public final void b() {
        if (this.f15648i != null) {
            TextInputLayout textInputLayout = this.f15647h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f15646g;
                boolean zF = MaterialResources.f(context);
                LinearLayout linearLayout = this.f15648i;
                int paddingStart = editText.getPaddingStart();
                if (zF) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zF) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zF) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f15651l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z11, AppCompatTextView appCompatTextView, int i11, int i12, int i13) {
        if (appCompatTextView == null || !z11) {
            return;
        }
        if (i11 == i13 || i11 == i12) {
            boolean z12 = i13 == i11;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, z12 ? 1.0f : 0.0f);
            int i14 = this.f15642c;
            objectAnimatorOfFloat.setDuration(z12 ? this.f15641b : i14);
            objectAnimatorOfFloat.setInterpolator(z12 ? this.f15644e : this.f15645f);
            if (i11 == i13 && i12 != 0) {
                objectAnimatorOfFloat.setStartDelay(i14);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i13 != i11 || i12 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.m, CropImageView.DEFAULT_ASPECT_RATIO);
            objectAnimatorOfFloat2.setDuration(this.f15640a);
            objectAnimatorOfFloat2.setInterpolator(this.f15643d);
            objectAnimatorOfFloat2.setStartDelay(i14);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i11) {
        if (i11 == 1) {
            return this.f15656r;
        }
        if (i11 != 2) {
            return null;
        }
        return this.f15663y;
    }

    public final void f() {
        this.f15654p = null;
        c();
        if (this.f15652n == 1) {
            if (!this.f15662x || TextUtils.isEmpty(this.f15661w)) {
                this.f15653o = 0;
            } else {
                this.f15653o = 2;
            }
        }
        i(this.f15652n, this.f15653o, h(this.f15656r, BuildConfig.VERSION_NAME));
    }

    public final void g(AppCompatTextView appCompatTextView, int i11) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f15648i;
        if (linearLayout == null) {
            return;
        }
        if ((i11 == 0 || i11 == 1) && (frameLayout = this.f15650k) != null) {
            frameLayout.removeView(appCompatTextView);
        } else {
            linearLayout.removeView(appCompatTextView);
        }
        int i12 = this.f15649j - 1;
        this.f15649j = i12;
        LinearLayout linearLayout2 = this.f15648i;
        if (i12 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(AppCompatTextView appCompatTextView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f15647h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f15653o == this.f15652n && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(final int i11, final int i12, boolean z11) {
        TextView textViewE;
        TextView textViewE2;
        if (i11 == i12) {
            return;
        }
        if (z11) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f15651l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f15662x, this.f15663y, 2, i11, i12);
            d(arrayList, this.f15655q, this.f15656r, 1, i11, i12);
            AnimatorSetCompat.a(animatorSet, arrayList);
            final TextView textViewE3 = e(i11);
            final TextView textViewE4 = e(i12);
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.IndicatorViewController.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    AppCompatTextView appCompatTextView;
                    int i13 = i12;
                    IndicatorViewController indicatorViewController = IndicatorViewController.this;
                    indicatorViewController.f15652n = i13;
                    indicatorViewController.f15651l = null;
                    TextView textView = textViewE3;
                    if (textView != null) {
                        textView.setVisibility(4);
                        if (i11 == 1 && (appCompatTextView = indicatorViewController.f15656r) != null) {
                            appCompatTextView.setText((CharSequence) null);
                        }
                    }
                    TextView textView2 = textViewE4;
                    if (textView2 != null) {
                        textView2.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
                        textView2.setAlpha(1.0f);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    TextView textView = textViewE4;
                    if (textView != null) {
                        textView.setVisibility(0);
                        textView.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                    }
                }
            });
            animatorSet.start();
        } else if (i11 != i12) {
            if (i12 != 0 && (textViewE2 = e(i12)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i11 != 0 && (textViewE = e(i11)) != null) {
                textViewE.setVisibility(4);
                if (i11 == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            this.f15652n = i12;
        }
        TextInputLayout textInputLayout = this.f15647h;
        textInputLayout.t();
        textInputLayout.w(z11, false);
        textInputLayout.z();
    }
}
