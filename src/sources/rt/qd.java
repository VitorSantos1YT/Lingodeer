package rt;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.env.Env;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class qd extends ViewModel {
    public Integer H;
    public final uz.r0 K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.k0 f50308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.n0 f50309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fv.c f50310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xt.a f50311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f50312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f50313f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final uz.i1 f50314t;

    public qd(wt.m mVar, vt.k0 k0Var, vt.n0 n0Var, wt.o0 o0Var, fv.c cVar, xt.a aVar, long j11, boolean z11) {
        uz.i f0Var;
        this.f50308a = k0Var;
        this.f50309b = n0Var;
        this.f50310c = cVar;
        this.f50311d = aVar;
        this.f50312e = j11;
        this.f50313f = z11;
        uz.i1 i1VarC = uz.x0.c(xe.f50664a);
        this.f50314t = i1VarC;
        fr.o0 o0Var2 = (fr.o0) n0Var;
        Env env = o0Var2.f27733a;
        int i11 = 8;
        int i12 = 2;
        int i13 = 3;
        vy.d dVar = null;
        if (env.keyLanguage == 1 && env.locateLanguage == 3) {
            gp.r rVarF = mVar.f(j11);
            gp.r rVar = new gp.r(new bh.a((bh.t) mVar.f55309a, dVar, i12));
            yz.f fVar = rz.o0.f50940a;
            f0Var = new no.g(rVarF, uz.x0.w(rVar, yz.e.f58387a), new fr.f4(i13, 11, dVar));
        } else {
            f0Var = new bh.f0(mVar.f(j11), i11);
        }
        this.K = uz.x0.A(new uz.m0(new uz.i[]{new n9.n1(f0Var, new nu.b(this, dVar, i11), 5), o0Var.f55340g, o0Var2.f27747p, i1VarC}, new pd(this, null)), ViewModelKt.getViewModelScope(this), uz.a1.a(2), ld.f50033a);
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new mv.f0(this, dVar, 20), 3);
    }

    public static final void a(qd qdVar, int i11) {
        Integer num = qdVar.H;
        if (num != null && num.intValue() == i11) {
            uz.i1 i1Var = qdVar.f50314t;
            i1Var.getClass();
            i1Var.l(null, xe.f50664a);
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.f50310c.b();
        super.onCleared();
    }
}
