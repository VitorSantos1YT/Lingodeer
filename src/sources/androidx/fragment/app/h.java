package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m2 f1674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f1675e;

    public h(ViewGroup viewGroup, View view, boolean z11, m2 m2Var, i iVar) {
        this.f1671a = viewGroup;
        this.f1672b = view;
        this.f1673c = z11;
        this.f1674d = m2Var;
        this.f1675e = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        kotlin.jvm.internal.m.f(anim, "anim");
        ViewGroup viewGroup = this.f1671a;
        View viewToAnimate = this.f1672b;
        viewGroup.endViewTransition(viewToAnimate);
        boolean z11 = this.f1673c;
        m2 m2Var = this.f1674d;
        if (z11 || m2Var.f1754a == q2.GONE) {
            q2 q2Var = m2Var.f1754a;
            kotlin.jvm.internal.m.e(viewToAnimate, "viewToAnimate");
            q2Var.a(viewToAnimate, viewGroup);
        }
        i iVar = this.f1675e;
        iVar.f1694c.f1737a.c(iVar);
        if (k1.L(2)) {
            Objects.toString(m2Var);
        }
    }
}
