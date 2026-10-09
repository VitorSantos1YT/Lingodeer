package kr;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import com.yalantis.ucrop.view.CropImageView;
import rz.z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends ViewModel {
    public z1 H;
    public final uz.i1 K;
    public final uz.i1 L;
    public final uz.i1 M;
    public final uz.r0 N;
    public final uz.r0 O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.n0 f38627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final av.n f38628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.o0 f38629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vt.k0 f38630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f38631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f38632f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final uz.i1 f38633t;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        uz.i1 i1Var;
        Object value;
        super.onCleared();
        do {
            i1Var = this.L;
            value = i1Var.getValue();
            ((Boolean) value).getClass();
        } while (!i1Var.j(value, Boolean.FALSE));
        this.f38628b.b();
        z1 z1Var = this.H;
        vy.d dVar = null;
        if (z1Var != null) {
            z1Var.cancel(null);
        }
        yz.f fVar = rz.o0.f50940a;
        rz.e0.B(rz.e0.c(yz.e.f58387a), null, null, new t0(this, dVar, 1), 3);
    }

    public z0(vt.n0 n0Var, av.n nVar, dv.u0 u0Var, wt.o0 o0Var, ur.a aVar, vt.c cVar, vt.k0 k0Var, long j11, int i11) {
        this.f38627a = n0Var;
        this.f38628b = nVar;
        this.f38629c = o0Var;
        this.f38630d = k0Var;
        this.f38631e = j11;
        this.f38632f = i11;
        uz.i1 i1VarC = uz.x0.c(Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO));
        this.f38633t = i1VarC;
        uz.i1 i1VarC2 = uz.x0.c(0);
        this.K = i1VarC2;
        uz.i1 i1VarC3 = uz.x0.c(Boolean.FALSE);
        this.L = i1VarC3;
        m1 m1Var = m1.f38532a;
        uz.i1 i1VarC4 = uz.x0.c(m1Var);
        this.M = i1VarC4;
        this.N = uz.x0.A(i1VarC4, ViewModelKt.getViewModelScope(this), uz.a1.a(2), m1Var);
        bh.r rVar = new bh.r(((vt.d) cVar).f54195e, this, 12);
        vy.d dVar = null;
        gp.r rVar2 = new gp.r(new w(this, dVar, 1));
        aVar.c(OCBJEWZHh.HtO, new jr.c0(this, 2));
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new t0(this, dVar, 0), 3);
        this.O = uz.x0.A(uz.x0.w(uz.x0.k(i1VarC3, i1VarC2, i1VarC, new gp.r(new bh.z0(((fr.o0) n0Var).f27733a.keyLanguage, i11, (vy.d) null)), new no.g(rVar, rVar2, new x0(3, null)), new y0(this, null)), yz.e.f58387a), ViewModelKt.getViewModelScope(this), uz.a1.a(2), q0.f38562a);
    }
}
