package rm;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import gp.r;
import rz.e0;
import rz.o0;
import uz.a1;
import uz.i1;
import uz.x0;
import vt.k0;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f49293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f49294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f49295c;

    public d(k0 k0Var, n0 n0Var) {
        this.f49293a = k0Var;
        this.f49294b = n0Var;
        i1 i1VarC = x0.c(1);
        this.f49295c = i1VarC;
        int i11 = 7;
        vy.d dVar = null;
        no.g gVar = new no.g(i1VarC, new r(new ds.e(2, i11, dVar)), new c(3, 0, dVar));
        yz.f fVar = o0.f50940a;
        x0.A(x0.w(gVar, yz.e.f58387a), ViewModelKt.getViewModelScope(this), a1.a(2), a.f49286a);
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new cj.b(this, dVar, i11), 3);
    }
}
