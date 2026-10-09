package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.transition.VisibilityAnimatorProvider;
import java.util.ArrayList;
import qa.d0;
import qa.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class MaterialVisibility<P extends VisibilityAnimatorProvider> extends j0 {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final VisibilityAnimatorProvider f15971k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final ScaleProvider f15972l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final ArrayList f15973m0 = new ArrayList();

    public MaterialVisibility(VisibilityAnimatorProvider visibilityAnimatorProvider, ScaleProvider scaleProvider) {
        this.f15971k0 = visibilityAnimatorProvider;
        this.f15972l0 = scaleProvider;
    }

    public static void W(ArrayList arrayList, VisibilityAnimatorProvider visibilityAnimatorProvider, ViewGroup viewGroup, View view, boolean z11) {
        if (visibilityAnimatorProvider == null) {
            return;
        }
        Animator animatorB = z11 ? visibilityAnimatorProvider.b(view) : visibilityAnimatorProvider.a(view);
        if (animatorB != null) {
            arrayList.add(animatorB);
        }
    }

    @Override // qa.j0
    public Animator U(ViewGroup viewGroup, View view, d0 d0Var) {
        return X(viewGroup, view, true);
    }

    @Override // qa.j0
    public Animator V(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2) {
        return X(viewGroup, view, false);
    }

    public final AnimatorSet X(ViewGroup viewGroup, View view, boolean z11) {
        int iC;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        W(arrayList, this.f15971k0, viewGroup, view, z11);
        W(arrayList, this.f15972l0, viewGroup, view, z11);
        ArrayList arrayList2 = this.f15973m0;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            W(arrayList, (VisibilityAnimatorProvider) obj, viewGroup, view, z11);
        }
        Context context = viewGroup.getContext();
        int iZ = Z(z11);
        RectF rectF = TransitionUtils.f15979a;
        if (iZ != 0 && this.f47680c == -1 && (iC = MotionUtils.c(context, iZ, -1)) != -1) {
            K(iC);
        }
        int iA0 = a0(z11);
        TimeInterpolator timeInterpolatorY = Y();
        if (iA0 != 0 && this.f47682d == null) {
            M(MotionUtils.d(context, iA0, timeInterpolatorY));
        }
        AnimatorSetCompat.a(animatorSet, arrayList);
        return animatorSet;
    }

    public TimeInterpolator Y() {
        return AnimationUtils.f13769b;
    }

    public int Z(boolean z11) {
        return 0;
    }

    public int a0(boolean z11) {
        return 0;
    }

    @Override // qa.v
    public boolean x() {
        return true;
    }
}
