package sv;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import dt.x;
import rz.e0;
import uz.a1;
import uz.i1;
import uz.r0;
import uz.x0;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f51810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f51811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f51812c;

    public j(rv.b bVar, n0 n0Var, vt.c cVar) {
        this.f51810a = n0Var;
        vy.d dVar = null;
        i1 i1VarC = x0.c(null);
        this.f51811b = i1VarC;
        this.f51812c = x0.A(new no.g(x0.B(((vt.d) cVar).f54201k, new x(dVar, bVar, 21)), i1VarC, new mv.x(n0Var, dVar, 6)), ViewModelKt.getViewModelScope(this), a1.a(2), g.f51804a);
    }

    public final void a(f fVar) {
        i1 i1Var;
        Object value;
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new sr.d(1, this, fVar, null), 3);
        e eVar = fVar.f51803a;
        do {
            i1Var = this.f51811b;
            value = i1Var.getValue();
        } while (!i1Var.j(value, eVar));
    }
}
