package h9;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.media3.ui.PlayerControlView;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public boolean A;
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlayerControlView f32101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f32102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f32103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewGroup f32104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ViewGroup f32105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewGroup f32106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ViewGroup f32107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ViewGroup f32108h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ViewGroup f32109i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f32110j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f32111k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AnimatorSet f32112l;
    public final AnimatorSet m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AnimatorSet f32113n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AnimatorSet f32114o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AnimatorSet f32115p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ValueAnimator f32116q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ValueAnimator f32117r;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.google.android.material.carousel.a f32123x;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s f32118s = new s(this, 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s f32119t = new s(this, 3);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final s f32120u = new s(this, 4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s f32121v = new s(this, 5);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final s f32122w = new s(this, 6);
    public boolean C = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f32125z = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f32124y = new ArrayList();

    public w(PlayerControlView playerControlView) {
        this.f32101a = playerControlView;
        final int i11 = 0;
        final int i12 = 3;
        this.f32123x = new com.google.android.material.carousel.a(this, i12);
        final int i13 = 1;
        this.f32102b = playerControlView.findViewById(R.id.exo_controls_background);
        this.f32103c = (ViewGroup) playerControlView.findViewById(R.id.exo_center_controls);
        this.f32105e = (ViewGroup) playerControlView.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) playerControlView.findViewById(R.id.exo_bottom_bar);
        this.f32104d = viewGroup;
        this.f32109i = (ViewGroup) playerControlView.findViewById(R.id.exo_time);
        View viewFindViewById = playerControlView.findViewById(R.id.exo_progress);
        this.f32110j = viewFindViewById;
        this.f32106f = (ViewGroup) playerControlView.findViewById(R.id.exo_basic_controls);
        this.f32107g = (ViewGroup) playerControlView.findViewById(R.id.exo_extra_controls);
        this.f32108h = (ViewGroup) playerControlView.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = playerControlView.findViewById(R.id.exo_overflow_show);
        this.f32111k = viewFindViewById2;
        View viewFindViewById3 = playerControlView.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            int i14 = 8;
            viewFindViewById2.setOnClickListener(new aj.b(this, i14));
            viewFindViewById3.setOnClickListener(new aj.b(this, i14));
        }
        final int i15 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: h9.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f32095b;

            {
                this.f32095b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i12) {
                    case 0:
                        w wVar = this.f32095b;
                        wVar.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = wVar.f32102b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = wVar.f32103c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = wVar.f32105e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        w wVar2 = this.f32095b;
                        wVar2.getClass();
                        wVar2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        w wVar3 = this.f32095b;
                        wVar3.getClass();
                        wVar3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        w wVar4 = this.f32095b;
                        wVar4.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = wVar4.f32102b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = wVar4.f32103c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = wVar4.f32105e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat.addListener(new u(this, 0));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: h9.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f32095b;

            {
                this.f32095b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        w wVar = this.f32095b;
                        wVar.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = wVar.f32102b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = wVar.f32103c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = wVar.f32105e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        w wVar2 = this.f32095b;
                        wVar2.getClass();
                        wVar2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        w wVar3 = this.f32095b;
                        wVar3.getClass();
                        wVar3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        w wVar4 = this.f32095b;
                        wVar4.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = wVar4.f32102b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = wVar4.f32103c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = wVar4.f32105e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat2.addListener(new u(this, 1));
        Resources resources = playerControlView.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f32112l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new v(this, playerControlView, i11));
        animatorSet.play(valueAnimatorOfFloat).with(d(viewFindViewById, CropImageView.DEFAULT_ASPECT_RATIO, dimension)).with(d(viewGroup, CropImageView.DEFAULT_ASPECT_RATIO, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new v(this, playerControlView, i13));
        animatorSet2.play(d(viewFindViewById, dimension, dimension2)).with(d(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f32113n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new v(this, playerControlView, i15));
        animatorSet3.play(valueAnimatorOfFloat).with(d(viewFindViewById, CropImageView.DEFAULT_ASPECT_RATIO, dimension2)).with(d(viewGroup, CropImageView.DEFAULT_ASPECT_RATIO, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f32114o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new u(this, 2));
        animatorSet4.play(valueAnimatorOfFloat2).with(d(viewFindViewById, dimension, CropImageView.DEFAULT_ASPECT_RATIO)).with(d(viewGroup, dimension, CropImageView.DEFAULT_ASPECT_RATIO));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f32115p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new u(this, 3));
        animatorSet5.play(valueAnimatorOfFloat2).with(d(viewFindViewById, dimension2, CropImageView.DEFAULT_ASPECT_RATIO)).with(d(viewGroup, dimension2, CropImageView.DEFAULT_ASPECT_RATIO));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        this.f32116q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: h9.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f32095b;

            {
                this.f32095b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i13) {
                    case 0:
                        w wVar = this.f32095b;
                        wVar.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = wVar.f32102b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = wVar.f32103c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = wVar.f32105e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        w wVar2 = this.f32095b;
                        wVar2.getClass();
                        wVar2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        w wVar3 = this.f32095b;
                        wVar3.getClass();
                        wVar3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        w wVar4 = this.f32095b;
                        wVar4.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = wVar4.f32102b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = wVar4.f32103c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = wVar4.f32105e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat3.addListener(new u(this, 4));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        this.f32117r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: h9.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f32095b;

            {
                this.f32095b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i15) {
                    case 0:
                        w wVar = this.f32095b;
                        wVar.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = wVar.f32102b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = wVar.f32103c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = wVar.f32105e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        w wVar2 = this.f32095b;
                        wVar2.getClass();
                        wVar2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        w wVar3 = this.f32095b;
                        wVar3.getClass();
                        wVar3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        w wVar4 = this.f32095b;
                        wVar4.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = wVar4.f32102b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = wVar4.f32103c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = wVar4.f32105e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat4.addListener(new u(this, 5));
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    public static ObjectAnimator d(View view, float f5, float f11) {
        return ObjectAnimator.ofFloat(view, "translationY", f5, f11);
    }

    public static boolean j(View view) {
        int id2 = view.getId();
        return id2 == R.id.exo_bottom_bar || id2 == R.id.exo_prev || id2 == R.id.exo_next || id2 == R.id.exo_rew || id2 == R.id.exo_rew_with_amount || id2 == R.id.exo_ffwd || id2 == R.id.exo_ffwd_with_amount;
    }

    public final void a(float f5) {
        ViewGroup viewGroup = this.f32108h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f5) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f32109i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f5);
        }
        ViewGroup viewGroup3 = this.f32106f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f5);
        }
    }

    public final boolean b(View view) {
        return view != null && this.f32124y.contains(view);
    }

    public final void e(Runnable runnable, long j11) {
        if (j11 >= 0) {
            this.f32101a.postDelayed(runnable, j11);
        }
    }

    public final void f() {
        s sVar = this.f32122w;
        PlayerControlView playerControlView = this.f32101a;
        playerControlView.removeCallbacks(sVar);
        playerControlView.removeCallbacks(this.f32119t);
        playerControlView.removeCallbacks(this.f32121v);
        playerControlView.removeCallbacks(this.f32120u);
    }

    public final void g() {
        if (this.f32125z == 3) {
            return;
        }
        f();
        int showTimeoutMs = this.f32101a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                e(this.f32122w, showTimeoutMs);
            } else if (this.f32125z == 1) {
                e(this.f32120u, 2000L);
            } else {
                e(this.f32121v, showTimeoutMs);
            }
        }
    }

    public final void h(View view, boolean z11) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f32124y;
        if (!z11) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.A && j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void i(int i11) {
        int i12 = this.f32125z;
        this.f32125z = i11;
        PlayerControlView playerControlView = this.f32101a;
        if (i11 == 2) {
            playerControlView.setVisibility(8);
        } else if (i12 == 2) {
            playerControlView.setVisibility(0);
        }
        if (i12 != i11) {
            for (r rVar : playerControlView.L) {
                playerControlView.getVisibility();
                ((y) rVar).f32129c.l();
            }
        }
    }

    public final void k() {
        if (!this.C) {
            i(0);
            g();
            return;
        }
        int i11 = this.f32125z;
        if (i11 == 1) {
            this.f32114o.start();
        } else if (i11 == 2) {
            this.f32115p.start();
        } else if (i11 == 3) {
            this.B = true;
        } else if (i11 == 4) {
            return;
        }
        g();
    }
}
