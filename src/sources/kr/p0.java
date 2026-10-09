package kr;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.n0 f38555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.c f38556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uz.r0 f38557c;

    public p0(vt.n0 n0Var, vt.c cVar) {
        this.f38555a = n0Var;
        this.f38556b = cVar;
        this.f38557c = uz.x0.A(new bh.r(((vt.d) cVar).f54200j, this, 11), ViewModelKt.getViewModelScope(this), uz.a1.a(2), l0.f38522a);
    }

    public final void a(k0 k0Var) {
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new kb.e(2, k0Var, this, null), 3);
    }
}
