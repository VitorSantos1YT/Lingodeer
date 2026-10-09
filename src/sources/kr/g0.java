package kr;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import rz.z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.n0 f38463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.c f38464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final av.n f38465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uz.i1 f38467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final uz.r0 f38468f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public z1 f38469t;

    public g0(vt.n0 n0Var, vt.c cVar, av.n nVar, int i11) {
        this.f38463a = n0Var;
        this.f38464b = cVar;
        this.f38465c = nVar;
        this.f38466d = i11;
        uz.i1 i1VarC = uz.x0.c(c0.f38433a);
        this.f38467e = i1VarC;
        this.f38468f = new uz.r0(i1VarC);
        rz.b0 viewModelScope = ViewModelKt.getViewModelScope(this);
        yz.f fVar = rz.o0.f50940a;
        vy.d dVar = null;
        rz.e0.B(viewModelScope, yz.e.f58387a, null, new f0(this, dVar, 1), 2);
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new f0(this, dVar, 0), 3);
    }

    public final void a() {
        uz.i1 i1Var;
        Object value;
        Object objA;
        do {
            i1Var = this.f38467e;
            value = i1Var.getValue();
            objA = (e0) value;
            if (objA instanceof d0) {
                d0 d0Var = (d0) objA;
                if (!d0Var.f38452n) {
                    objA = d0.a(d0Var, 0, -1, false, 0L, 0L, false, 0, null, false, false, false, true, 2535);
                }
            }
        } while (!i1Var.j(value, objA));
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        uz.i1 i1Var;
        Object obj;
        d();
        e0 e0Var = (e0) this.f38468f.f53391a.getValue();
        if (e0Var instanceof d0) {
            d0 d0Var = (d0) e0Var;
            int i11 = 1;
            int i12 = d0Var.f38442c + 1;
            boolean z11 = i12 >= d0Var.f38440a.size();
            while (true) {
                uz.i1 i1Var2 = this.f38467e;
                Object value = i1Var2.getValue();
                Object objA = (e0) value;
                if (!(objA instanceof d0)) {
                    i1Var = i1Var2;
                    obj = value;
                } else if (z11) {
                    objA = d0.a((d0) objA, 0, -1, false, 0L, 0L, false, 0, null, false, false, false, true, 4055);
                    i1Var = i1Var2;
                    obj = value;
                } else {
                    d0 d0Var2 = (d0) objA;
                    boolean z12 = i12 < d0Var2.f38440a.size() - i11 ? i11 : 0;
                    i1Var = i1Var2;
                    obj = value;
                    objA = d0.a(d0Var2, i12, -1, false, 0L, 0L, false, 0, null, false, true, z12, false, 467);
                }
                if (i1Var.j(obj, objA)) {
                    break;
                } else {
                    i11 = 1;
                }
            }
            if (z11) {
                a();
            }
        }
    }

    public final void c() {
        uz.i1 i1Var;
        Object value;
        Object objA;
        z1 z1Var = this.f38469t;
        if (z1Var != null) {
            z1Var.cancel(null);
        }
        this.f38469t = null;
        do {
            i1Var = this.f38467e;
            value = i1Var.getValue();
            objA = (e0) value;
            if (objA instanceof d0) {
                d0 d0Var = (d0) objA;
                objA = d0.a(d0Var, 0, 0, false, 0L, d0Var.f38446g, false, 0, null, false, false, false, false, 16271);
            }
        } while (!i1Var.j(value, objA));
    }

    public final void d() {
        av.n nVar = this.f38465c;
        if (nVar.f()) {
            nVar.n();
        }
        c();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        z1 z1Var = this.f38469t;
        if (z1Var != null) {
            z1Var.cancel(null);
        }
        av.n nVar = this.f38465c;
        nVar.n();
        nVar.b();
    }
}
