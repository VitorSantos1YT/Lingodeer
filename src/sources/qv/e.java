package qv;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.tbruyelle.rxpermissions3.BuildConfig;
import mu.w;
import rz.e0;
import rz.o0;
import uz.a1;
import uz.i1;
import uz.m0;
import uz.r0;
import uz.x0;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f48430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f48431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f48432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1 f48433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r0 f48434e;

    public e(n0 n0Var) {
        this.f48430a = n0Var;
        vy.d dVar = null;
        i1 i1VarC = x0.c(null);
        this.f48431b = i1VarC;
        i1 i1VarC2 = x0.c(BuildConfig.VERSION_NAME);
        this.f48432c = i1VarC2;
        i1 i1VarC3 = x0.c(BuildConfig.VERSION_NAME);
        this.f48433d = i1VarC3;
        m0 m0VarJ = x0.j(i1VarC, i1VarC2, i1VarC3, new w(4, dVar));
        yz.f fVar = o0.f50940a;
        this.f48434e = x0.A(x0.w(m0VarJ, yz.e.f58387a), ViewModelKt.getViewModelScope(this), a1.a(2), a.f48424a);
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new cj.b(this, dVar, 6), 3);
    }
}
