package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout implements ContentViewCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f15496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Button f15497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeInterpolator f15498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15499d;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public final void a(int i11) {
        this.f15496a.setAlpha(1.0f);
        long j11 = i11;
        ViewPropertyAnimator duration = this.f15496a.animate().alpha(CropImageView.DEFAULT_ASPECT_RATIO).setDuration(j11);
        TimeInterpolator timeInterpolator = this.f15498c;
        long j12 = 0;
        duration.setInterpolator(timeInterpolator).setStartDelay(j12).start();
        if (this.f15497b.getVisibility() == 0) {
            this.f15497b.setAlpha(1.0f);
            this.f15497b.animate().alpha(CropImageView.DEFAULT_ASPECT_RATIO).setDuration(j11).setInterpolator(timeInterpolator).setStartDelay(j12).start();
        }
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public final void b(int i11, int i12) {
        this.f15496a.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
        long j11 = i12;
        ViewPropertyAnimator duration = this.f15496a.animate().alpha(1.0f).setDuration(j11);
        TimeInterpolator timeInterpolator = this.f15498c;
        long j12 = i11;
        duration.setInterpolator(timeInterpolator).setStartDelay(j12).start();
        if (this.f15497b.getVisibility() == 0) {
            this.f15497b.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
            this.f15497b.animate().alpha(1.0f).setDuration(j11).setInterpolator(timeInterpolator).setStartDelay(j12).start();
        }
    }

    public final boolean c(int i11, int i12, int i13) {
        boolean z11;
        if (i11 != getOrientation()) {
            setOrientation(i11);
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f15496a.getPaddingTop() == i12 && this.f15496a.getPaddingBottom() == i13) {
            return z11;
        }
        TextView textView = this.f15496a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i12, textView.getPaddingEnd(), i13);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i12, textView.getPaddingRight(), i13);
        return true;
    }

    public Button getActionView() {
        return this.f15497b;
    }

    public TextView getMessageView() {
        return this.f15496a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f15496a = (TextView) findViewById(R.id.snackbar_text);
        this.f15497b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f15496a.getLayout();
        boolean z11 = layout != null && layout.getLineCount() > 1;
        if (!z11 || this.f15499d <= 0 || this.f15497b.getMeasuredWidth() <= this.f15499d) {
            if (!z11) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!c(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!c(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i11, i12);
    }

    public void setMaxInlineActionWidth(int i11) {
        this.f15499d = i11;
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15498c = MotionUtils.d(context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f13769b);
    }
}
