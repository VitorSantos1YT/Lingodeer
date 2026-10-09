package rt;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l9 extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.n0 f50021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.c f50022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.h0 f50023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uz.r0 f50024d;

    public l9(vt.n0 n0Var, vt.c cVar, vt.h0 h0Var) {
        this.f50021a = n0Var;
        this.f50022b = cVar;
        this.f50023c = h0Var;
        this.f50024d = uz.x0.A(uz.x0.B(new no.g(((vt.d) cVar).f54200j, ((fr.o0) n0Var).f27736d, new i9(3, null)), new dt.x((vy.d) null, this, 17)), ViewModelKt.getViewModelScope(this), uz.a1.a(2), f9.f49754a);
    }

    public final void a(e9 e9Var) {
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new ns.j(23, e9Var, this, null), 3);
    }
}
