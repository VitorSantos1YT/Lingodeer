package z4;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class n1 extends m1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public r4.d f58875n;

    public n1(v1 v1Var, WindowInsets windowInsets) {
        super(v1Var, windowInsets);
        this.f58875n = null;
    }

    @Override // z4.s1
    public v1 b() {
        return v1.h(null, this.f58867c.consumeStableInsets());
    }

    @Override // z4.s1
    public v1 c() {
        return v1.h(null, this.f58867c.consumeSystemWindowInsets());
    }

    @Override // z4.s1
    public final r4.d j() {
        if (this.f58875n == null) {
            WindowInsets windowInsets = this.f58867c;
            this.f58875n = r4.d.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f58875n;
    }

    @Override // z4.s1
    public boolean o() {
        return this.f58867c.isConsumed();
    }

    @Override // z4.s1
    public void u(r4.d dVar) {
        this.f58875n = dVar;
    }

    public n1(v1 v1Var, n1 n1Var) {
        super(v1Var, n1Var);
        this.f58875n = null;
        this.f58875n = n1Var.f58875n;
    }
}
