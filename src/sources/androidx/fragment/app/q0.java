package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import java.util.concurrent.CopyOnWriteArrayList;
import sz.xej.iFLeRCXvYCGdPW;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cloneable f1804b;

    public q0(k1 k1Var) {
        this.f1803a = k1Var;
        this.f1804b = new CopyOnWriteArrayList();
    }

    public void a(k0 f5, Bundle bundle, boolean z11) {
        kotlin.jvm.internal.m.f(f5, "f");
        k1 k1Var = (k1) this.f1803a;
        k0 k0Var = k1Var.f1733z;
        if (k0Var != null) {
            k1 parentFragmentManager = k0Var.getParentFragmentManager();
            kotlin.jvm.internal.m.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1723p.a(f5, bundle, true);
        }
        for (x0 x0Var : (CopyOnWriteArrayList) this.f1804b) {
            if (z11) {
                x0Var.getClass();
            } else {
                x0Var.f1867a.onFragmentActivityCreated(k1Var, f5, bundle);
            }
        }
    }

    public void b(k0 f5, boolean z11) {
        kotlin.jvm.internal.m.f(f5, "f");
        k1 k1Var = (k1) this.f1803a;
        p0 p0Var = k1Var.f1731x.f1841b;
        k0 k0Var = k1Var.f1733z;
        if (k0Var != null) {
            k1 parentFragmentManager = k0Var.getParentFragmentManager();
            kotlin.jvm.internal.m.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1723p.b(f5, true);
        }
        for (x0 x0Var : (CopyOnWriteArrayList) this.f1804b) {
            if (z11) {
                x0Var.getClass();
            } else {
                x0Var.f1867a.onFragmentAttached(k1Var, f5, p0Var);
            }
        }
    }

    public void c(k0 f5, Bundle bundle, boolean z11) {
        kotlin.jvm.internal.m.f(f5, "f");
        k1 k1Var = (k1) this.f1803a;
        k0 k0Var = k1Var.f1733z;
        if (k0Var != null) {
            k1 parentFragmentManager = k0Var.getParentFragmentManager();
            kotlin.jvm.internal.m.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1723p.c(f5, bundle, true);
        }
        for (x0 x0Var : (CopyOnWriteArrayList) this.f1804b) {
            if (z11) {
                x0Var.getClass();
            } else {
                x0Var.f1867a.onFragmentCreated(k1Var, f5, bundle);
            }
        }
    }

    public void d(k0 f5, boolean z11) {
        kotlin.jvm.internal.m.f(f5, "f");
        k1 k1Var = (k1) this.f1803a;
        k0 k0Var = k1Var.f1733z;
        if (k0Var != null) {
            k1 parentFragmentManager = k0Var.getParentFragmentManager();
            kotlin.jvm.internal.m.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1723p.d(f5, true);
        }
        for (x0 x0Var : (CopyOnWriteArrayList) this.f1804b) {
            if (z11) {
                x0Var.getClass();
            } else {
                x0Var.f1867a.onFragmentDestroyed(k1Var, f5);
            }
        }
    }

    public void e(k0 f5, boolean z11) {
        kotlin.jvm.internal.m.f(f5, "f");
        k1 k1Var = (k1) this.f1803a;
        k0 k0Var = k1Var.f1733z;
        if (k0Var != null) {
            k1 parentFragmentManager = k0Var.getParentFragmentManager();
            kotlin.jvm.internal.m.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1723p.e(f5, true);
        }
        for (x0 x0Var : (CopyOnWriteArrayList) this.f1804b) {
            if (z11) {
                x0Var.getClass();
            } else {
                x0Var.f1867a.onFragmentDetached(k1Var, f5);
            }
        }
    }

    public void f(k0 f5, boolean z11) {
        kotlin.jvm.internal.m.f(f5, "f");
        k1 k1Var = (k1) this.f1803a;
        k0 k0Var = k1Var.f1733z;
        if (k0Var != null) {
            k1 parentFragmentManager = k0Var.getParentFragmentManager();
            kotlin.jvm.internal.m.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1723p.f(f5, true);
        }
        for (x0 x0Var : (CopyOnWriteArrayList) this.f1804b) {
            if (z11) {
                x0Var.getClass();
            } else {
                x0Var.f1867a.onFragmentPaused(k1Var, f5);
            }
        }
    }

    public void g(k0 f5, boolean z11) {
        kotlin.jvm.internal.m.f(f5, "f");
        k1 k1Var = (k1) this.f1803a;
        p0 p0Var = k1Var.f1731x.f1841b;
        k0 k0Var = k1Var.f1733z;
        if (k0Var != null) {
            k1 parentFragmentManager = k0Var.getParentFragmentManager();
            kotlin.jvm.internal.m.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1723p.g(f5, true);
        }
        for (x0 x0Var : (CopyOnWriteArrayList) this.f1804b) {
            if (z11) {
                x0Var.getClass();
            } else {
                x0Var.f1867a.onFragmentPreAttached(k1Var, f5, p0Var);
            }
        }
    }

    public void h(k0 f5, Bundle bundle, boolean z11) {
        kotlin.jvm.internal.m.f(f5, "f");
        k1 k1Var = (k1) this.f1803a;
        k0 k0Var = k1Var.f1733z;
        if (k0Var != null) {
            k1 parentFragmentManager = k0Var.getParentFragmentManager();
            kotlin.jvm.internal.m.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1723p.h(f5, bundle, true);
        }
        for (x0 x0Var : (CopyOnWriteArrayList) this.f1804b) {
            if (z11) {
                x0Var.getClass();
            } else {
                x0Var.f1867a.onFragmentPreCreated(k1Var, f5, bundle);
            }
        }
    }

    public void i(k0 f5, boolean z11) {
        kotlin.jvm.internal.m.f(f5, "f");
        k1 k1Var = (k1) this.f1803a;
        k0 k0Var = k1Var.f1733z;
        if (k0Var != null) {
            k1 parentFragmentManager = k0Var.getParentFragmentManager();
            kotlin.jvm.internal.m.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1723p.i(f5, true);
        }
        for (x0 x0Var : (CopyOnWriteArrayList) this.f1804b) {
            if (z11) {
                x0Var.getClass();
            } else {
                x0Var.f1867a.onFragmentResumed(k1Var, f5);
            }
        }
    }

    public void k(k0 f5, boolean z11) {
        kotlin.jvm.internal.m.f(f5, "f");
        k1 k1Var = (k1) this.f1803a;
        k0 k0Var = k1Var.f1733z;
        if (k0Var != null) {
            k1 parentFragmentManager = k0Var.getParentFragmentManager();
            kotlin.jvm.internal.m.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1723p.k(f5, true);
        }
        for (x0 x0Var : (CopyOnWriteArrayList) this.f1804b) {
            if (z11) {
                x0Var.getClass();
            } else {
                x0Var.f1867a.onFragmentStarted(k1Var, f5);
            }
        }
    }

    public void l(k0 f5, boolean z11) {
        kotlin.jvm.internal.m.f(f5, "f");
        k1 k1Var = (k1) this.f1803a;
        k0 k0Var = k1Var.f1733z;
        if (k0Var != null) {
            k1 parentFragmentManager = k0Var.getParentFragmentManager();
            kotlin.jvm.internal.m.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1723p.l(f5, true);
        }
        for (x0 x0Var : (CopyOnWriteArrayList) this.f1804b) {
            if (z11) {
                x0Var.getClass();
            } else {
                x0Var.f1867a.onFragmentStopped(k1Var, f5);
            }
        }
    }

    public void m(k0 f5, View v11, Bundle bundle, boolean z11) {
        kotlin.jvm.internal.m.f(f5, "f");
        kotlin.jvm.internal.m.f(v11, "v");
        k1 k1Var = (k1) this.f1803a;
        k0 k0Var = k1Var.f1733z;
        if (k0Var != null) {
            k1 parentFragmentManager = k0Var.getParentFragmentManager();
            kotlin.jvm.internal.m.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1723p.m(f5, v11, bundle, true);
        }
        for (x0 x0Var : (CopyOnWriteArrayList) this.f1804b) {
            if (z11) {
                x0Var.getClass();
            } else {
                x0Var.f1867a.onFragmentViewCreated(k1Var, f5, v11, bundle);
            }
        }
    }

    public void n(k0 f5, boolean z11) {
        kotlin.jvm.internal.m.f(f5, "f");
        k1 k1Var = (k1) this.f1803a;
        k0 k0Var = k1Var.f1733z;
        if (k0Var != null) {
            k1 parentFragmentManager = k0Var.getParentFragmentManager();
            kotlin.jvm.internal.m.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1723p.n(f5, true);
        }
        for (x0 x0Var : (CopyOnWriteArrayList) this.f1804b) {
            if (z11) {
                x0Var.getClass();
            } else {
                x0Var.f1867a.onFragmentViewDestroyed(k1Var, f5);
            }
        }
    }

    public void j(k0 f5, Bundle bundle, boolean z11) {
        kotlin.jvm.internal.m.f(f5, "f");
        k1 k1Var = (k1) this.f1803a;
        k0 k0Var = k1Var.f1733z;
        if (k0Var != null) {
            k1 parentFragmentManager = k0Var.getParentFragmentManager();
            kotlin.jvm.internal.m.e(parentFragmentManager, iFLeRCXvYCGdPW.JeydFx);
            parentFragmentManager.f1723p.j(f5, bundle, true);
        }
        for (x0 x0Var : (CopyOnWriteArrayList) this.f1804b) {
            if (z11) {
                x0Var.getClass();
            } else {
                x0Var.f1867a.onFragmentSaveInstanceState(k1Var, f5, bundle);
            }
        }
    }

    public q0(Animation animation) {
        this.f1803a = animation;
        this.f1804b = null;
    }

    public q0(Animator animator) {
        this.f1803a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f1804b = animatorSet;
        animatorSet.play(animator);
    }
}
