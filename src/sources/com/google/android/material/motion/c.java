package com.google.android.material.motion;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.media3.ui.DefaultTimeBar;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.navigation.DrawerLayoutUtils;
import com.google.android.material.progressindicator.DeterminateDrawable;
import com.lingo.fluent.widget.RippleView;
import com.lingo.lingoskill.widget.RoleWaveView;
import hj.u5;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.y;
import qh.e;
import wc.d;
import wc.v;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14821b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f14820a = i11;
        this.f14821b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i11 = this.f14820a;
        Object obj = this.f14821b;
        switch (i11) {
            case 0:
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) obj;
                clippableRoundedCornerLayout.a(clippableRoundedCornerLayout.getLeft(), clippableRoundedCornerLayout.getTop(), clippableRoundedCornerLayout.getRight(), clippableRoundedCornerLayout.getBottom(), (float[]) valueAnimator.getAnimatedValue());
                break;
            case 1:
                ((DrawerLayout) obj).setScrimColor(r4.c.e(-1728053248, AnimationUtils.c(DrawerLayoutUtils.f14822a, valueAnimator.getAnimatedFraction(), 0)));
                break;
            case 2:
                DeterminateDrawable determinateDrawable = (DeterminateDrawable) obj;
                determinateDrawable.S.f15031e = determinateDrawable.X.getInterpolation(determinateDrawable.W.getAnimatedFraction());
                break;
            case 3:
                RippleView.initAnimator$lambda$1$lambda$0((RippleView) obj, valueAnimator);
                break;
            case 4:
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) obj;
                int i12 = DefaultTimeBar.f2163u0;
                defaultTimeBar.getClass();
                defaultTimeBar.f2180k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                defaultTimeBar.invalidate(defaultTimeBar.f2164a);
                break;
            case 5:
                y yVar = (y) obj;
                m.f(valueAnimator, "valueAnimator");
                ViewGroup.LayoutParams layoutParams = ((AppCompatTextView) yVar.f38361a).getLayoutParams();
                if (layoutParams != null) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    m.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    layoutParams.height = (int) ((Float) animatedValue).floatValue();
                }
                ((AppCompatTextView) yVar.f38361a).requestLayout();
                break;
            case 6:
                m.f(valueAnimator, "animValue");
                ta.a aVar = ((e) obj).f36400f;
                m.c(aVar);
                TextView textView = ((u5) aVar).f33421v;
                if (textView != null) {
                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                    m.d(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                    textView.setText(String.valueOf(((Integer) animatedValue2).intValue()));
                }
                break;
            case 7:
                m.f(valueAnimator, "valueAnimator");
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                m.d(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                ((TextView) obj).setTextSize(((Float) animatedValue3).floatValue());
                break;
            case 8:
                RoleWaveView roleWaveView = (RoleWaveView) obj;
                int i13 = RoleWaveView.T;
                m.f(valueAnimator, "valueAnimator");
                Object animatedValue4 = valueAnimator.getAnimatedValue();
                m.d(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                roleWaveView.Q = ((Float) animatedValue4).floatValue();
                roleWaveView.invalidate();
                break;
            default:
                v vVar = (v) obj;
                wc.a aVar2 = vVar.f55030o0;
                if (aVar2 == null) {
                    aVar2 = d.f54943a;
                }
                if (aVar2 != wc.a.ENABLED) {
                    gd.e eVar = vVar.R;
                    if (eVar != null) {
                        eVar.r(vVar.f55012b.f());
                    }
                } else {
                    vVar.invalidateSelf();
                }
                break;
        }
    }
}
