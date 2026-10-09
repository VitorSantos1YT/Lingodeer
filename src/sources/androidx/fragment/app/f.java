package androidx.fragment.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends l2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f1653c;

    public f(g gVar) {
        this.f1653c = gVar;
    }

    @Override // androidx.fragment.app.l2
    public final void b(ViewGroup container) {
        kotlin.jvm.internal.m.f(container, "container");
        g gVar = this.f1653c;
        m2 m2Var = gVar.f1737a;
        View view = m2Var.f1756c.mView;
        view.clearAnimation();
        container.endViewTransition(view);
        gVar.f1737a.c(this);
        if (k1.L(2)) {
            m2Var.toString();
        }
    }

    @Override // androidx.fragment.app.l2
    public final void c(ViewGroup container) {
        kotlin.jvm.internal.m.f(container, "container");
        g gVar = this.f1653c;
        m2 m2Var = gVar.f1737a;
        if (gVar.a()) {
            m2Var.c(this);
            return;
        }
        Context context = container.getContext();
        View view = m2Var.f1756c.mView;
        kotlin.jvm.internal.m.e(context, "context");
        q0 q0VarB = gVar.b(context);
        if (q0VarB == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Animation animation = (Animation) q0VarB.f1803a;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (m2Var.f1754a != q2.REMOVED) {
            view.startAnimation(animation);
            m2Var.c(this);
            return;
        }
        container.startViewTransition(view);
        r0 r0Var = new r0(animation, container, view);
        r0Var.setAnimationListener(new e(m2Var, container, view, this));
        view.startAnimation(r0Var);
        if (k1.L(2)) {
            m2Var.toString();
        }
    }
}
