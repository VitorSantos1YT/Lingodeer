package rt;

import androidx.lifecycle.ViewModel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class jd extends ViewModel {
    public final uz.q0 H;
    public rz.z1 K;
    public boolean L;
    public boolean M;
    public boolean N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ot.o2 f49941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wt.m f49942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ur.a f49943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f49944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uz.i1 f49945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final uz.r0 f49946f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final uz.w0 f49947t;

    public jd(ot.o2 o2Var, wt.m mVar, ur.a aVar, long j11) {
        this.f49941a = o2Var;
        this.f49942b = mVar;
        this.f49943c = aVar;
        this.f49944d = j11;
        uz.i1 i1VarC = uz.x0.c(gd.f49798a);
        this.f49945e = i1VarC;
        this.f49946f = new uz.r0(i1VarC);
        uz.w0 w0VarB = uz.x0.b(1, 5, null);
        this.f49947t = w0VarB;
        this.H = new uz.q0(w0VarB);
    }

    public final void a(String str) {
        this.f49943c.c("jxz_main_click_download", new pv.c(10, str, this));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        rz.z1 z1Var = this.K;
        if (z1Var != null) {
            z1Var.cancel(null);
        }
        this.K = null;
        this.f49941a.a();
        super.onCleared();
    }
}
