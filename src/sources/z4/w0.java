package z4;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f58909a;

    public w0(View view) {
        this.f58909a = new WeakReference(view);
    }

    public final void a(float f5) {
        View view = (View) this.f58909a.get();
        if (view != null) {
            view.animate().alpha(f5);
        }
    }

    public final void b() {
        View view = (View) this.f58909a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(float f5) {
        View view = (View) this.f58909a.get();
        if (view != null) {
            view.animate().scaleX(f5);
        }
    }

    public final void d(float f5) {
        View view = (View) this.f58909a.get();
        if (view != null) {
            view.animate().scaleY(f5);
        }
    }

    public final void e(long j11) {
        View view = (View) this.f58909a.get();
        if (view != null) {
            view.animate().setDuration(j11);
        }
    }

    public final void f(Interpolator interpolator) {
        View view = (View) this.f58909a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
    }

    public final void g(x0 x0Var) {
        View view = (View) this.f58909a.get();
        if (view != null) {
            if (x0Var != null) {
                view.animate().setListener(new qa.p(5, x0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void h(long j11) {
        View view = (View) this.f58909a.get();
        if (view != null) {
            view.animate().setStartDelay(j11);
        }
    }

    public final void i() {
        View view = (View) this.f58909a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public final void j(float f5) {
        View view = (View) this.f58909a.get();
        if (view != null) {
            view.animate().translationX(f5);
        }
    }

    public final void k(float f5) {
        View view = (View) this.f58909a.get();
        if (view != null) {
            view.animate().translationXBy(f5);
        }
    }

    public final void l(float f5) {
        View view = (View) this.f58909a.get();
        if (view != null) {
            view.animate().translationY(f5);
        }
    }

    public final void m(float f5) {
        View view = (View) this.f58909a.get();
        if (view != null) {
            view.animate().translationYBy(f5);
        }
    }
}
