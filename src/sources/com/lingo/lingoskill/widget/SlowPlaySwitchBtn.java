package com.lingo.lingoskill.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.animation.BounceInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.lingo.lingoskill.widget.SlowPlaySwitchBtn;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import ff.h;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import ky.e;
import px.b;
import se.n;
import ui.k;
import z4.s0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SlowPlaySwitchBtn extends FrameLayout {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f22147t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f22148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f22149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22153f;

    public SlowPlaySwitchBtn(Context context) {
        super(context);
        this.f22152e = R.drawable.ic_play_switch_normal;
        this.f22153f = R.drawable.ic_play_switch_slow;
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckStatus(long j11) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f22149b, "translationX", this.f22151d / 4, CropImageView.DEFAULT_ASPECT_RATIO).setDuration(j11);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f22148a, "translationX", (-this.f22151d) / 4, CropImageView.DEFAULT_ASPECT_RATIO).setDuration(j11);
        if (this.f22150c) {
            w0 w0VarB = s0.b(this.f22148a);
            w0VarB.a(1.0f);
            w0VarB.e(j11);
            w0VarB.f(new BounceInterpolator());
            w0VarB.i();
            duration2.setInterpolator(new BounceInterpolator());
            duration2.start();
            w0 w0VarB2 = s0.b(this.f22149b);
            w0VarB2.a(0.2f);
            w0VarB2.e(j11);
            w0VarB2.f(new BounceInterpolator());
            w0VarB2.i();
            duration.setInterpolator(new BounceInterpolator());
            duration.start();
            this.f22148a.bringToFront();
            return;
        }
        w0 w0VarB3 = s0.b(this.f22149b);
        w0VarB3.a(1.0f);
        w0VarB3.e(j11);
        w0VarB3.f(new BounceInterpolator());
        w0VarB3.i();
        duration.setInterpolator(new BounceInterpolator());
        duration.start();
        w0 w0VarB4 = s0.b(this.f22148a);
        w0VarB4.a(0.2f);
        w0VarB4.e(j11);
        w0VarB4.f(new BounceInterpolator());
        w0VarB4.i();
        duration2.setInterpolator(new BounceInterpolator());
        duration2.start();
        this.f22149b.bringToFront();
    }

    public final void b() {
        removeAllViews();
        ImageView imageView = new ImageView(getContext());
        this.f22148a = imageView;
        imageView.setBackgroundResource(R.drawable.point_accent);
        this.f22148a.setImageResource(this.f22153f);
        ImageView imageView2 = this.f22148a;
        Context context = getContext();
        m.f(context, "context");
        imageView2.setImageTintList(ColorStateList.valueOf(context.getColor(R.color.color_answer_btm)));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(h.l(26.0f), h.l(26.0f));
        layoutParams.setMarginStart(h.l(8.0f));
        this.f22148a.setLayoutParams(layoutParams);
        addView(this.f22148a);
        final int i11 = 0;
        this.f22148a.post(new Runnable(this) { // from class: vq.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SlowPlaySwitchBtn f54120b;

            {
                this.f54120b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        SlowPlaySwitchBtn slowPlaySwitchBtn = this.f54120b;
                        slowPlaySwitchBtn.f22151d = slowPlaySwitchBtn.f22148a.getWidth();
                        slowPlaySwitchBtn.f22148a.setAlpha(0.2f);
                        break;
                    default:
                        this.f54120b.setCheckStatus(0L);
                        break;
                }
            }
        });
        ImageView imageView3 = new ImageView(getContext());
        this.f22149b = imageView3;
        imageView3.setBackgroundResource(R.drawable.point_accent);
        this.f22149b.setImageResource(this.f22152e);
        ImageView imageView4 = this.f22149b;
        Context context2 = getContext();
        m.f(context2, "context");
        imageView4.setImageTintList(ColorStateList.valueOf(context2.getColor(R.color.color_answer_btm)));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(h.l(26.0f), h.l(26.0f));
        layoutParams2.setMarginStart(h.l(22.0f));
        layoutParams2.setMarginEnd(h.l(8.0f));
        this.f22149b.setLayoutParams(layoutParams2);
        addView(this.f22149b);
        this.f22149b.bringToFront();
        final int i12 = 1;
        post(new Runnable(this) { // from class: vq.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SlowPlaySwitchBtn f54120b;

            {
                this.f54120b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        SlowPlaySwitchBtn slowPlaySwitchBtn = this.f54120b;
                        slowPlaySwitchBtn.f22151d = slowPlaySwitchBtn.f22148a.getWidth();
                        slowPlaySwitchBtn.f22148a.setAlpha(0.2f);
                        break;
                    default:
                        this.f54120b.setCheckStatus(0L);
                        break;
                }
            }
        });
    }

    public final void c() {
        this.f22150c = !this.f22150c;
        setClickable(false);
        setCheckStatus(300L);
        qx.h.m(600L, TimeUnit.MILLISECONDS, e.f38937b).g(b.a()).h(new k(this, 4), new n(20));
    }

    public void setChecked(boolean z11) {
        this.f22150c = z11;
    }

    public void setResClose(int i11) {
        this.f22153f = i11;
    }

    public void setResOpen(int i11) {
        this.f22152e = i11;
    }

    public SlowPlaySwitchBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22152e = R.drawable.ic_play_switch_normal;
        this.f22153f = R.drawable.ic_play_switch_slow;
        b();
    }

    public SlowPlaySwitchBtn(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f22152e = R.drawable.ic_play_switch_normal;
        this.f22153f = R.drawable.ic_play_switch_slow;
        b();
    }
}
