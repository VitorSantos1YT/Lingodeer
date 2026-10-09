package zu;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import fr.x4;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.n0 f59530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.h1 f59531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.c f59532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vt.k0 f59533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uz.i1 f59534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final uz.i1 f59535f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final uz.r0 f59536t;

    public q(vt.n0 n0Var, vt.h1 h1Var, vt.c cVar, vt.k0 k0Var) {
        this.f59530a = n0Var;
        this.f59531b = h1Var;
        this.f59532c = cVar;
        this.f59533d = k0Var;
        uz.i1 i1VarC = uz.x0.c(Boolean.FALSE);
        this.f59534e = i1VarC;
        uz.i1 i1VarC2 = uz.x0.c(a.Idle);
        this.f59535f = i1VarC2;
        x4 x4Var = (x4) h1Var;
        uz.m0 m0Var = new uz.m0(new uz.i[]{x4Var.f27974g, new bh.i0(x4Var.f27968a.z().a(), 12), i1VarC, i1VarC2}, new p(this, null));
        yz.f fVar = rz.o0.f50940a;
        this.f59536t = uz.x0.A(uz.x0.w(m0Var, yz.e.f58387a), ViewModelKt.getViewModelScope(this), uz.a1.a(2), k.f59459a);
    }

    public final void a(j jVar, fz.a resetLoginStatus, fz.a onLogoutError) {
        uz.i1 i1Var;
        Object value;
        kotlin.jvm.internal.m.f(resetLoginStatus, "resetLoginStatus");
        kotlin.jvm.internal.m.f(onLogoutError, "onLogoutError");
        vy.d dVar = null;
        if (jVar instanceof i) {
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new n(this, jVar, dVar, 0), 3);
            return;
        }
        if (jVar instanceof h) {
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new n(this, jVar, dVar, 1), 3);
            return;
        }
        if (jVar instanceof d) {
            do {
                i1Var = this.f59534e;
                value = i1Var.getValue();
                ((Boolean) value).getClass();
            } while (!i1Var.j(value, Boolean.valueOf(((d) jVar).f59388a)));
            return;
        }
        if (jVar instanceof b) {
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new n(this, jVar, dVar, 2), 3);
            return;
        }
        if (jVar.equals(c.f59384a)) {
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new o(this, resetLoginStatus, onLogoutError, dVar, 0), 3);
            return;
        }
        if (jVar.equals(e.f59407a)) {
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new o(this, resetLoginStatus, onLogoutError, dVar, 1), 3);
        } else if (jVar instanceof g) {
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new bh.j0(this, jVar, (vy.d) null), 3);
        } else {
            if (!jVar.equals(f.f59410a)) {
                throw new NoWhenBranchMatchedException();
            }
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new km.s0(this, dVar, 20), 3);
        }
    }
}
