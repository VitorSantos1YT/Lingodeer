package androidx.fragment.app;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2 f1737a;

    public l(m2 operation) {
        kotlin.jvm.internal.m.f(operation, "operation");
        this.f1737a = operation;
    }

    public final boolean a() {
        q2 q2VarA;
        m2 m2Var = this.f1737a;
        View view = m2Var.f1756c.mView;
        if (view != null) {
            q2.Companion.getClass();
            q2VarA = o2.a(view);
        } else {
            q2VarA = null;
        }
        q2 q2Var = m2Var.f1754a;
        if (q2VarA == q2Var) {
            return true;
        }
        q2 q2Var2 = q2.VISIBLE;
        return (q2VarA == q2Var2 || q2Var == q2Var2) ? false : true;
    }
}
