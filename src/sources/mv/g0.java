package mv;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.NoWhenBranchMatchedException;
import uz.a1;
import uz.i1;
import uz.r0;
import uz.x0;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f42209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f42210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f42211c;

    public g0(lv.b bVar, n0 n0Var, vt.c cVar) {
        this.f42209a = n0Var;
        vy.d dVar = null;
        i1 i1VarC = x0.c(null);
        this.f42210b = i1VarC;
        this.f42211c = x0.A(new no.g(x0.B(((vt.d) cVar).f54201k, new dt.x(dVar, bVar, 9)), i1VarC, new x(n0Var, dVar, 1)), ViewModelKt.getViewModelScope(this), a1.a(2), c0.f42193a);
    }

    public final void a(b0 b0Var) {
        i1 i1Var;
        Object value;
        vy.d dVar = null;
        if (!(b0Var instanceof a0)) {
            if (!b0Var.equals(z.f42297a)) {
                throw new NoWhenBranchMatchedException();
            }
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new f0(this, dVar, 0), 3);
        } else {
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new kb.e(19, this, b0Var, dVar), 3);
            do {
                i1Var = this.f42210b;
                value = i1Var.getValue();
            } while (!i1Var.j(value, ((a0) b0Var).f42190a));
        }
    }
}
