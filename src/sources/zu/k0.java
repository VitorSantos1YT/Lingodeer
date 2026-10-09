package zu;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.NoWhenBranchMatchedException;
import rt.t3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ru.a f59460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.c f59461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uz.i1 f59462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uz.r0 f59463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uz.r0 f59464e;

    public k0(ru.a aVar, vt.c cVar) {
        this.f59460a = aVar;
        this.f59461b = cVar;
        uz.i1 i1VarC = uz.x0.c(Boolean.FALSE);
        this.f59462c = i1VarC;
        this.f59463d = new uz.r0(i1VarC);
        fr.v1 v1Var = (fr.v1) aVar;
        int i11 = 3;
        no.g gVar = new no.g(v1Var.f27918i, v1Var.f27919j, new t3(i11, i11, null));
        yz.f fVar = rz.o0.f50940a;
        this.f59464e = uz.x0.A(uz.x0.w(gVar, yz.e.f58387a), ViewModelKt.getViewModelScope(this), uz.a1.a(2), g0.f59418a);
    }

    public final void a(f0 f0Var) {
        vy.d dVar = null;
        if (f0Var instanceof c0) {
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new j0(this, f0Var, dVar, 0), 3);
        } else if (f0Var instanceof e0) {
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new j0(this, f0Var, dVar, 1), 3);
        } else {
            if (!(f0Var instanceof d0)) {
                throw new NoWhenBranchMatchedException();
            }
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new j0(this, f0Var, dVar, 2), 3);
        }
    }
}
