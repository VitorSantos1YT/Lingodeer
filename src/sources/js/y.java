package js;

import androidx.lifecycle.ViewModel;
import com.tbruyelle.rxpermissions3.BuildConfig;
import rt.eb;
import rt.ia;
import uz.i1;
import uz.r0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final av.n f36849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fv.c f36850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f36851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r0 f36852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1 f36853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r0 f36854f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final dm.a f36855t;

    public y(av.n nVar, fv.c cVar) {
        this.f36849a = nVar;
        this.f36850b = cVar;
        i1 i1VarC = x0.c(eb.f49693a);
        this.f36851c = i1VarC;
        this.f36852d = new r0(i1VarC);
        i1 i1VarC2 = x0.c(new bs.g(false, BuildConfig.VERSION_NAME));
        this.f36853e = i1VarC2;
        this.f36854f = new r0(i1VarC2);
        this.f36855t = new dm.a(this, 20);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        ia.e(this.f36850b);
        super.onCleared();
        this.f36849a.n();
    }
}
