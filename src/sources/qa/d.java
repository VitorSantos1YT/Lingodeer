package qa;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f47602a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f47603b;

    public d(ViewGroup viewGroup) {
        this.f47603b = viewGroup;
    }

    @Override // qa.w, qa.t
    public final void b() {
        ob.f.N(this.f47603b, false);
    }

    @Override // qa.w, qa.t
    public final void c(v vVar) {
        if (!this.f47602a) {
            ob.f.N(this.f47603b, false);
        }
        vVar.E(this);
    }

    @Override // qa.w, qa.t
    public final void e() {
        ob.f.N(this.f47603b, true);
    }

    @Override // qa.w, qa.t
    public final void f(v vVar) {
        ob.f.N(this.f47603b, false);
        this.f47602a = true;
    }
}
