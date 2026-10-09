package wu;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import fr.x4;
import rz.o0;
import uz.a1;
import uz.r0;
import uz.x0;
import vt.h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f55403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f55404b;

    public j(h1 h1Var) {
        this.f55403a = h1Var;
        gp.r rVar = new gp.r(new bh.i0(qx.p.l(((x4) h1Var).f27968a.Q().f3081a, new String[]{"login_history"}, new au.a(17)), 11), 15);
        yz.f fVar = o0.f50940a;
        this.f55404b = x0.A(x0.w(rVar, yz.e.f58387a), ViewModelKt.getViewModelScope(this), a1.a(2), f.f55387a);
    }
}
