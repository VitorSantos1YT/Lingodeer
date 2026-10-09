package rt;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.e f50665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.n0 f50666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uz.i1 f50667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uz.r0 f50668d;

    public y(wt.m mVar, vt.e eVar, vt.n0 n0Var, wt.o0 o0Var) {
        this.f50665a = eVar;
        this.f50666b = n0Var;
        uz.i1 i1VarC = uz.x0.c(new tt.a(qy.b0.f48488a));
        this.f50667c = i1VarC;
        vy.d dVar = null;
        uz.m0 m0VarJ = uz.x0.j(uz.x0.B(i1VarC, new gu.d(2, eVar, n0Var, dVar)), new no.g(new gp.r(new bh.a((bh.t) mVar.f55309a, dVar, 1)), mVar, n0Var, 2), o0Var.f55340g, new a0(4, null));
        yz.f fVar = rz.o0.f50940a;
        this.f50668d = uz.x0.A(uz.x0.w(m0VarJ, yz.e.f58387a), ViewModelKt.getViewModelScope(this), uz.a1.a(2), v.f50518a);
    }
}
