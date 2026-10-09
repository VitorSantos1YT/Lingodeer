package rt;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.model.CourseUiState;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class sd extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uz.r0 f50389a;

    public sd(wt.m mVar, vt.k0 k0Var, vt.h1 h1Var, vt.n0 n0Var, xt.u uVar) {
        vy.d dVar = null;
        ((bh.a1) k0Var).f4151e = null;
        uz.x0.y(new n9.n1(uz.x0.g(new bh.a((bh.t) mVar.f55309a, dVar, 0)), new jp.t0(2, 6, dVar), 5), ViewModelKt.getViewModelScope(this));
        this.f50389a = uz.x0.A(new no.g(((fr.x4) h1Var).f27974g, mVar.f55321n, new td(k0Var, n0Var, uVar, null)), ViewModelKt.getViewModelScope(this), uz.a1.a(2), CourseUiState.Loading.INSTANCE);
    }
}
