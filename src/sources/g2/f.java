package g2;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import rz.z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28554b;

    public /* synthetic */ f(Object obj, int i11) {
        this.f28553a = i11;
        this.f28554b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f28553a) {
            case 0:
                g gVar = (g) this.f28554b;
                Context context = view.getContext();
                if (!gVar.f28564d) {
                    context.getApplicationContext().registerComponentCallbacks(gVar.f28565e);
                    gVar.f28564d = true;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f28553a) {
            case 0:
                g gVar = (g) this.f28554b;
                Context context = view.getContext();
                if (gVar.f28564d) {
                    context.getApplicationContext().unregisterComponentCallbacks(gVar.f28565e);
                    gVar.f28564d = false;
                }
                break;
            case 1:
                q.f fVar = (q.f) this.f28554b;
                ViewTreeObserver viewTreeObserver = fVar.Z;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.Z = view.getViewTreeObserver();
                    }
                    fVar.Z.removeGlobalOnLayoutListener(fVar.K);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                q.a0 a0Var = (q.a0) this.f28554b;
                ViewTreeObserver viewTreeObserver2 = a0Var.Q;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        a0Var.Q = view.getViewTreeObserver();
                    }
                    a0Var.Q.removeGlobalOnLayoutListener(a0Var.K);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((z1) this.f28554b).cancel(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
