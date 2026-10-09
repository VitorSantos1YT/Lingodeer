package androidx.fragment.app;

import android.transition.Transition;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1812d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(m2 m2Var, boolean z11, boolean z12) {
        super(m2Var);
        k0 k0Var = m2Var.f1756c;
        q2 q2Var = m2Var.f1754a;
        q2 q2Var2 = q2.VISIBLE;
        this.f1810b = q2Var == q2Var2 ? z11 ? k0Var.getReenterTransition() : k0Var.getEnterTransition() : z11 ? k0Var.getReturnTransition() : k0Var.getExitTransition();
        this.f1811c = m2Var.f1754a == q2Var2 ? z11 ? k0Var.getAllowReturnTransitionOverlap() : k0Var.getAllowEnterTransitionOverlap() : true;
        this.f1812d = z12 ? z11 ? k0Var.getSharedElementReturnTransition() : k0Var.getSharedElementEnterTransition() : null;
    }

    public final h2 b() {
        Object obj = this.f1810b;
        h2 h2VarC = c(obj);
        Object obj2 = this.f1812d;
        h2 h2VarC2 = c(obj2);
        if (h2VarC == null || h2VarC2 == null || h2VarC == h2VarC2) {
            return h2VarC == null ? h2VarC2 : h2VarC;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f1737a.f1756c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
    }

    public final h2 c(Object obj) {
        if (obj == null) {
            return null;
        }
        f2 f2Var = a2.f1614a;
        if (obj instanceof Transition) {
            return f2Var;
        }
        h2 h2Var = a2.f1615b;
        if (h2Var != null && h2Var.g(obj)) {
            return h2Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f1737a.f1756c + " is not a valid framework Transition or AndroidX Transition");
    }
}
