package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.RectF;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.transition.platform.VisibilityAnimatorProvider;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class MaterialVisibility<P extends VisibilityAnimatorProvider> extends Visibility {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VisibilityAnimatorProvider f16072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScaleProvider f16073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f16074c = new ArrayList();

    public MaterialVisibility(VisibilityAnimatorProvider visibilityAnimatorProvider, ScaleProvider scaleProvider) {
        this.f16072a = visibilityAnimatorProvider;
        this.f16073b = scaleProvider;
    }

    public static void a(ArrayList arrayList, VisibilityAnimatorProvider visibilityAnimatorProvider, ViewGroup viewGroup, View view, boolean z11) {
        if (visibilityAnimatorProvider == null) {
            return;
        }
        Animator animatorB = z11 ? visibilityAnimatorProvider.b(view) : visibilityAnimatorProvider.a(view);
        if (animatorB != null) {
            arrayList.add(animatorB);
        }
    }

    public final AnimatorSet c(ViewGroup viewGroup, View view, boolean z11) {
        int iC;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        a(arrayList, this.f16072a, viewGroup, view, z11);
        a(arrayList, this.f16073b, viewGroup, view, z11);
        ArrayList arrayList2 = this.f16074c;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            a(arrayList, (VisibilityAnimatorProvider) obj, viewGroup, view, z11);
        }
        Context context = viewGroup.getContext();
        int iF = f(z11);
        RectF rectF = TransitionUtils.f16080a;
        if (iF != 0 && getDuration() == -1 && (iC = MotionUtils.c(context, iF, -1)) != -1) {
            setDuration(iC);
        }
        int iG = g(z11);
        TimeInterpolator timeInterpolatorD = d();
        if (iG != 0 && getInterpolator() == null) {
            setInterpolator(MotionUtils.d(context, iG, timeInterpolatorD));
        }
        AnimatorSetCompat.a(animatorSet, arrayList);
        return animatorSet;
    }

    public TimeInterpolator d() {
        return AnimationUtils.f13769b;
    }

    public int f(boolean z11) {
        return 0;
    }

    public int g(boolean z11) {
        return 0;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return c(viewGroup, view, true);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return c(viewGroup, view, false);
    }
}
