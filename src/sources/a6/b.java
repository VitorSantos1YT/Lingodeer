package a6;

import androidx.drawerlayout.widget.ktFt.FpIL;
import androidx.fragment.app.k0;
import androidx.fragment.app.k1;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.Violation;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f387a = a.f386a;

    public static void b(Violation violation) {
        if (k1.L(3)) {
            violation.f1834a.getClass();
        }
    }

    public static final void c(k0 fragment, String previousFragmentId) {
        m.f(fragment, "fragment");
        m.f(previousFragmentId, "previousFragmentId");
        b(new FragmentReuseViolation(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId));
        a(fragment).getClass();
    }

    public static a a(k0 k0Var) {
        while (k0Var != null) {
            if (k0Var.isAdded()) {
                m.e(k0Var.getParentFragmentManager(), FpIL.ItRfpSiAsRLzq);
            }
            k0Var = k0Var.getParentFragment();
        }
        return f387a;
    }
}
