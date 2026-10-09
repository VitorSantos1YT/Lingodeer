package rt;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z0 extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.b0 f50736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.k0 f50737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.m f50738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vt.n0 f50739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rs.b f50740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final uz.i1 f50741f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final uz.r0 f50742t;

    public z0(wt.b0 b0Var, vt.k0 k0Var, wt.m mVar, vt.n0 n0Var, rs.b bVar) {
        this.f50736a = b0Var;
        this.f50737b = k0Var;
        this.f50738c = mVar;
        this.f50739d = n0Var;
        this.f50740e = bVar;
        uz.i1 i1VarC = uz.x0.c(0);
        this.f50741f = i1VarC;
        vz.i iVarB = uz.x0.B(i1VarC, new dt.x((vy.d) null, this, 14));
        yz.f fVar = rz.o0.f50940a;
        this.f50742t = uz.x0.A(uz.x0.w(iVarB, yz.e.f58387a), ViewModelKt.getViewModelScope(this), uz.a1.a(2), w0.f50562a);
    }

    public final void a(v0 v0Var) {
        v0Var.toString();
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new ns.j(13, v0Var, this, null), 3);
    }
}
