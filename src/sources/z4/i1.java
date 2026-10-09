package z4;

import android.view.WindowInsets;
import d0.h2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class i1 extends l1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f58858c;

    public i1() {
        this.f58858c = h2.c();
    }

    @Override // z4.l1
    public v1 b() {
        a();
        v1 v1VarH = v1.h(null, this.f58858c.build());
        v1VarH.f58905a.r(this.f58862b);
        return v1VarH;
    }

    @Override // z4.l1
    public void d(r4.d dVar) {
        this.f58858c.setMandatorySystemGestureInsets(dVar.e());
    }

    @Override // z4.l1
    public void e(r4.d dVar) {
        this.f58858c.setStableInsets(dVar.e());
    }

    @Override // z4.l1
    public void f(r4.d dVar) {
        this.f58858c.setSystemGestureInsets(dVar.e());
    }

    @Override // z4.l1
    public void g(r4.d dVar) {
        this.f58858c.setSystemWindowInsets(dVar.e());
    }

    @Override // z4.l1
    public void h(r4.d dVar) {
        this.f58858c.setTappableElementInsets(dVar.e());
    }

    public i1(v1 v1Var) {
        WindowInsets.Builder builderC;
        super(v1Var);
        WindowInsets windowInsetsG = v1Var.g();
        if (windowInsetsG != null) {
            builderC = h2.d(windowInsetsG);
        } else {
            builderC = h2.c();
        }
        this.f58858c = builderC;
    }
}
