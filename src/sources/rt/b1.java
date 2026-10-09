package rt;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b1 extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.o0 f49474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uz.r0 f49476c;

    public b1(wt.o0 o0Var, int i11) {
        this.f49474a = o0Var;
        this.f49475b = i11;
        gp.r rVar = new gp.r(new h(this, null, 2));
        yz.f fVar = rz.o0.f50940a;
        this.f49476c = uz.x0.A(uz.x0.w(rVar, yz.e.f58387a), ViewModelKt.getViewModelScope(this), uz.a1.a(2), -1);
    }
}
