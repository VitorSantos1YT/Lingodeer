package sv;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.tbruyelle.rxpermissions3.BuildConfig;
import mv.f0;
import rt.eb;
import rz.e0;
import uz.a1;
import uz.i1;
import uz.r0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final av.n f51796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fv.c f51797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f51798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1 f51799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r0 f51800e;

    public d(av.n nVar, fv.c cVar) {
        this.f51796a = nVar;
        this.f51797b = cVar;
        i1 i1VarC = x0.c(BuildConfig.VERSION_NAME);
        this.f51798c = i1VarC;
        i1 i1VarC2 = x0.c(eb.f49693a);
        this.f51799d = i1VarC2;
        vy.d dVar = null;
        this.f51800e = x0.A(new no.g(i1VarC, i1VarC2, new mv.m(3, 1, dVar)), ViewModelKt.getViewModelScope(this), a1.a(2), a.f51793a);
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new f0(this, dVar, 29), 3);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f51796a.b();
    }
}
