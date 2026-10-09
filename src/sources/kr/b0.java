package kr;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yalantis.ucrop.view.CropImageView;
import rz.z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends ViewModel {
    public final uz.i1 H;
    public final uz.i1 K;
    public final uz.i1 L;
    public uv.b M;
    public z1 N;
    public final uz.i1 O;
    public final uz.i1 P;
    public final uz.r0 Q;
    public final uz.r0 R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.n0 f38424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fv.c f38425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final av.n f38426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dv.u0 f38427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f38428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final no.s f38429f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final uz.i1 f38430t;

    public b0(vt.n0 n0Var, fv.c cVar, av.n nVar, dv.u0 u0Var, int i11) {
        this.f38424a = n0Var;
        this.f38425b = cVar;
        this.f38426c = nVar;
        this.f38427d = u0Var;
        this.f38428e = i11;
        this.f38429f = new no.s(i11);
        uz.i1 i1VarC = uz.x0.c(j.RECENT);
        this.f38430t = i1VarC;
        uz.i1 i1VarC2 = uz.x0.c(Boolean.TRUE);
        this.H = i1VarC2;
        vy.d dVar = null;
        uz.i1 i1VarC3 = uz.x0.c(null);
        this.K = i1VarC3;
        uz.i1 i1VarC4 = uz.x0.c(Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO));
        this.L = i1VarC4;
        ry.r rVar = ry.r.f50854a;
        uz.i1 i1VarC5 = uz.x0.c(rVar);
        this.O = i1VarC5;
        uz.i1 i1VarC6 = uz.x0.c(rVar);
        this.P = i1VarC6;
        int i12 = 0;
        uz.m0 m0VarJ = uz.x0.j(new n9.n1(new ds.e(2, 5, dVar), new n9.n1(new bh.r(new y(new no.g(i1VarC, i1VarC2, new s(3, i12, dVar)), 0), this, 10), new p(this, dVar, 1), 5)), i1VarC5, i1VarC6, new u(4, i12, dVar));
        this.Q = new uz.r0(i1VarC2);
        uz.m0 m0VarK = uz.x0.k(m0VarJ, i1VarC3, i1VarC4, i1VarC, new gp.r(new bh.z0(((fr.o0) n0Var).f27733a.keyLanguage, i11, (vy.d) null)), new a0(this, null));
        yz.f fVar = rz.o0.f50940a;
        this.R = uz.x0.A(uz.x0.w(m0VarK, yz.e.f58387a), ViewModelKt.getViewModelScope(this), uz.a1.a(2), k.f38507a);
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new q(this, dVar, i12), 3);
    }

    public final void a(h hVar) {
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new w(0, hVar, this, null), 3);
    }
}
