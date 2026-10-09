package vp;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import gp.r;
import rz.o0;
import uz.a1;
import uz.r0;
import uz.x0;
import vt.k0;
import vt.n0;
import wt.m;
import wt.q;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f54083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f54084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f54085c;

    public d(k0 k0Var, q qVar, n0 n0Var, m mVar, boolean z11, int i11) {
        this.f54083a = qVar;
        this.f54084b = mVar;
        r rVar = new r(new e(k0Var, n0Var, z11, qVar, i11, mVar, null));
        f fVar = o0.f50940a;
        this.f54085c = x0.A(x0.w(rVar, yz.e.f58387a), ViewModelKt.getViewModelScope(this), a1.a(2), a.f54078a);
    }
}
