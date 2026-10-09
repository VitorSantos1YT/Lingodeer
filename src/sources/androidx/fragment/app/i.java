package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends l2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f1694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AnimatorSet f1695d;

    public i(g gVar) {
        this.f1694c = gVar;
    }

    @Override // androidx.fragment.app.l2
    public final void b(ViewGroup container) {
        kotlin.jvm.internal.m.f(container, "container");
        AnimatorSet animatorSet = this.f1695d;
        g gVar = this.f1694c;
        if (animatorSet == null) {
            gVar.f1737a.c(this);
            return;
        }
        m2 m2Var = gVar.f1737a;
        if (!m2Var.f1760g) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            k.f1708a.a(animatorSet);
        }
        if (k1.L(2)) {
            m2Var.toString();
        }
    }

    @Override // androidx.fragment.app.l2
    public final void c(ViewGroup container) {
        kotlin.jvm.internal.m.f(container, "container");
        m2 m2Var = this.f1694c.f1737a;
        AnimatorSet animatorSet = this.f1695d;
        if (animatorSet == null) {
            m2Var.c(this);
            return;
        }
        animatorSet.start();
        if (k1.L(2)) {
            Objects.toString(m2Var);
        }
    }

    @Override // androidx.fragment.app.l2
    public final void d(f.a backEvent, ViewGroup container) {
        kotlin.jvm.internal.m.f(backEvent, "backEvent");
        kotlin.jvm.internal.m.f(container, "container");
        m2 m2Var = this.f1694c.f1737a;
        AnimatorSet animatorSet = this.f1695d;
        if (animatorSet == null) {
            m2Var.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !m2Var.f1756c.mTransitioning) {
            return;
        }
        if (k1.L(2)) {
            m2Var.toString();
        }
        long jA = j.f1704a.a(animatorSet);
        long j11 = (long) (backEvent.f26117c * jA);
        if (j11 == 0) {
            j11 = 1;
        }
        if (j11 == jA) {
            j11 = jA - 1;
        }
        if (k1.L(2)) {
            animatorSet.toString();
            m2Var.toString();
        }
        k.f1708a.b(animatorSet, j11);
    }

    @Override // androidx.fragment.app.l2
    public final void e(ViewGroup container) {
        i iVar;
        kotlin.jvm.internal.m.f(container, "container");
        g gVar = this.f1694c;
        if (gVar.a()) {
            return;
        }
        Context context = container.getContext();
        kotlin.jvm.internal.m.e(context, "context");
        q0 q0VarB = gVar.b(context);
        this.f1695d = q0VarB != null ? (AnimatorSet) q0VarB.f1804b : null;
        m2 m2Var = gVar.f1737a;
        k0 k0Var = m2Var.f1756c;
        boolean z11 = m2Var.f1754a == q2.GONE;
        View view = k0Var.mView;
        container.startViewTransition(view);
        AnimatorSet animatorSet = this.f1695d;
        if (animatorSet != null) {
            iVar = this;
            animatorSet.addListener(new h(container, view, z11, m2Var, iVar));
        } else {
            iVar = this;
        }
        AnimatorSet animatorSet2 = iVar.f1695d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
