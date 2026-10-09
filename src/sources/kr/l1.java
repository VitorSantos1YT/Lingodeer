package kr;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import rz.z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends ViewModel {
    public final uz.i1 H;
    public final uz.r0 K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.c f38523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.n0 f38524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final av.n f38525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final av.i f38526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f38527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final av.j0 f38528f = new av.j0(null, 6);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public z1 f38529t;

    public l1(vt.c cVar, vt.n0 n0Var, av.n nVar, av.i iVar, int i11) {
        this.f38523a = cVar;
        this.f38524b = n0Var;
        this.f38525c = nVar;
        this.f38526d = iVar;
        this.f38527e = i11;
        vy.d dVar = null;
        b1 b1Var = b1.f38431a;
        uz.i1 i1VarC = uz.x0.c(b1Var);
        this.H = i1VarC;
        this.K = uz.x0.A(i1VarC, ViewModelKt.getViewModelScope(this), uz.a1.a(2), b1Var);
        rz.b0 viewModelScope = ViewModelKt.getViewModelScope(this);
        yz.f fVar = rz.o0.f50940a;
        rz.e0.B(viewModelScope, yz.e.f58387a, null, new dr.a(this, dVar, 1), 2);
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new gp.a(this, dVar, 23), 3);
    }

    public final void a(a1 curStorySpeakingSentence) {
        kotlin.jvm.internal.m.f(curStorySpeakingSentence, "curStorySpeakingSentence");
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new j1(this, curStorySpeakingSentence, null, 3), 3);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f38525c.b();
        this.f38526d.c();
        this.f38528f.b();
        z1 z1Var = this.f38529t;
        if (z1Var != null) {
            z1Var.cancel(null);
        }
        this.f38529t = null;
    }
}
