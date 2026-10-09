package rt;

import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class mb extends y9 {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final ot.o1 f50070n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final wt.b0 f50071o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final wt.m f50072p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final wt.o0 f50073q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f50074r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final long f50075s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final uz.i1 f50076t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final uz.i1 f50077u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public rz.z1 f50078v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public long f50079w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f50080x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final uz.r0 f50081y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final uz.r0 f50082z0;

    public mb(ot.o1 o1Var, wt.b0 b0Var, vt.h hVar, wt.m mVar, wt.o0 o0Var, ur.a aVar, vt.n0 n0Var, vt.c cVar, vt.e eVar, vt.p0 p0Var, boolean z11) {
        super(n0Var, cVar, eVar, p0Var, hVar, b0Var);
        this.f50070n0 = o1Var;
        this.f50071o0 = b0Var;
        this.f50072p0 = mVar;
        this.f50073q0 = o0Var;
        this.f50074r0 = z11;
        this.f50075s0 = 180500L;
        uz.i1 i1VarC = uz.x0.c(new hb(180500L, false));
        this.f50076t0 = i1VarC;
        this.f50077u0 = i1VarC;
        vy.d dVar = null;
        uz.m0 m0VarJ = uz.x0.j(uz.x0.B(uz.x0.z(new h(10, this, n0Var, dVar), new no.g(mVar.f55323p, o0Var.f55340g, new l3(n0Var, dVar, 1))), new dt.x(dVar, this, 19)), this.W, this.f50706c0, new kb(this, n0Var, null));
        yz.e eVar2 = yz.e.f58387a;
        this.f50081y0 = uz.x0.A(uz.x0.w(m0VarJ, eVar2), ViewModelKt.getViewModelScope(this), uz.a1.a(2), new pc(CropImageView.DEFAULT_ASPECT_RATIO));
        this.f50082z0 = uz.x0.A(uz.x0.w(uz.x0.k(l1.t.K(new gb(this, 0)), this.X, this.V, new no.g(this.f50702a0, this.f50704b0, new y2(3, 1, dVar)), o0Var.f55339f, new ib(this, n0Var, null)), eVar2), ViewModelKt.getViewModelScope(this), uz.a1.a(2), CourseTestFinishSummaryUiState.Loading.INSTANCE);
    }

    @Override // rt.y9
    public final Object A(int i11, long j11, int i12, boolean z11, boolean z12, long j12, boolean z13, vy.d dVar) {
        if (!z11) {
            Object objA = new ot.s1(this.f50073q0, this.f50701a, this.f50071o0).a(i11, j11, i12, j12, z13, z12, this.f50720t, (xy.c) dVar);
            if (objA == wy.a.COROUTINE_SUSPENDED) {
                return objA;
            }
        }
        return qy.b0.f48488a;
    }

    @Override // rt.y9, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        rz.z1 z1Var = this.f50078v0;
        if (z1Var != null) {
            z1Var.cancel(null);
        }
        this.f50079w0 = 0L;
        hb hbVar = new hb(this.f50075s0, false);
        uz.i1 i1Var = this.f50076t0;
        i1Var.getClass();
        i1Var.l(null, hbVar);
        this.f50080x0 = false;
    }
}
