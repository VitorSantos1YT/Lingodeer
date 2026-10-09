package j0;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends androidx.datastore.preferences.protobuf.l implements Runnable, z4.u, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o2 f35432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f35433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f35434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z4.v1 f35435f;

    public x0(o2 o2Var) {
        super(!o2Var.f35371s ? 1 : 0);
        this.f35432c = o2Var;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final void d(z4.g1 g1Var) {
        this.f35433d = false;
        this.f35434e = false;
        z4.v1 v1Var = this.f35435f;
        if (g1Var.f58839a.b() > 0 && v1Var != null) {
            z4.s1 s1Var = v1Var.f58905a;
            o2 o2Var = this.f35432c;
            o2Var.f35370r.f(c.H(s1Var.g(8)));
            o2Var.f35369q.f(c.H(s1Var.g(8)));
            o2.a(o2Var, v1Var);
        }
        this.f35435f = null;
    }

    @Override // z4.u
    public final z4.v1 e(View view, z4.v1 v1Var) {
        this.f35435f = v1Var;
        o2 o2Var = this.f35432c;
        k2 k2Var = o2Var.f35369q;
        z4.s1 s1Var = v1Var.f58905a;
        k2Var.f(c.H(s1Var.g(8)));
        if (this.f35433d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f35434e) {
            o2Var.f35370r.f(c.H(s1Var.g(8)));
            o2.a(o2Var, v1Var);
        }
        return o2Var.f35371s ? z4.v1.f58904b : v1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final void f(z4.g1 g1Var) {
        this.f35433d = true;
        this.f35434e = true;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final z4.v1 g(z4.v1 v1Var, List list) {
        o2 o2Var = this.f35432c;
        o2.a(o2Var, v1Var);
        return o2Var.f35371s ? z4.v1.f58904b : v1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final qp.o2 h(z4.g1 g1Var, qp.o2 o2Var) {
        this.f35433d = false;
        return o2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f35433d) {
            this.f35433d = false;
            this.f35434e = false;
            z4.v1 v1Var = this.f35435f;
            if (v1Var != null) {
                o2 o2Var = this.f35432c;
                o2Var.f35370r.f(c.H(v1Var.f58905a.g(8)));
                o2.a(o2Var, v1Var);
                this.f35435f = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
