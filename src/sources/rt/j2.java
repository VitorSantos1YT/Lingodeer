package rt;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j2 extends ViewModel {
    public boolean H;
    public rz.z1 K;
    public final uz.i1 L;
    public List M;
    public boolean N;
    public final uz.i1 O;
    public final uz.i1 P;
    public final uz.i1 Q;
    public final uz.i1 R;
    public final uz.r0 S;
    public final uz.r0 T;
    public final uz.r0 U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.b0 f49904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wt.m f49905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rs.b f49906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vt.n0 f49907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vt.c f49908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f49909f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public n1 f49910t;

    public j2(wt.b0 b0Var, wt.m mVar, rs.b bVar, wt.o0 o0Var, vt.n0 n0Var, vt.c cVar) {
        this.f49904a = b0Var;
        this.f49905b = mVar;
        this.f49906c = bVar;
        this.f49907d = n0Var;
        this.f49908e = cVar;
        uz.i1 i1VarC = uz.x0.c(new f1(0L));
        this.L = i1VarC;
        this.M = ry.r.f50854a;
        uz.i1 i1VarC2 = uz.x0.c(0);
        this.O = i1VarC2;
        uz.i1 i1VarC3 = uz.x0.c(mt.q2.FLASHCARD);
        this.P = i1VarC3;
        vy.d dVar = null;
        uz.i1 i1VarC4 = uz.x0.c(null);
        this.Q = i1VarC4;
        uz.i1 i1VarC5 = uz.x0.c(null);
        this.R = i1VarC5;
        uz.r0 r0VarA = uz.x0.A(o0Var.f55340g, ViewModelKt.getViewModelScope(this), uz.a1.a(2), Boolean.FALSE);
        this.S = r0VarA;
        uz.r0 r0VarA2 = uz.x0.A(uz.x0.k(uz.x0.B(((vt.d) cVar).f54205p, new dt.x(dVar, this, 15)), r0VarA, i1VarC2, i1VarC3, new no.g(i1VarC4, i1VarC5, new fr.f4(3, 9, dVar)), new h2(this, null)), ViewModelKt.getViewModelScope(this), uz.a1.a(2), e2.f49665a);
        this.T = r0VarA2;
        this.U = uz.x0.A(new no.g(r0VarA2, i1VarC, new fr.f4(this, dVar, 8)), ViewModelKt.getViewModelScope(this), uz.a1.a(2), j1.f49903a);
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new ns.j(this, dVar, 14), 3);
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new mt.k2(this, dVar, 1), 3);
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new mt.k2(this, dVar, 2), 3);
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new mt.k2(this, dVar, 3), 3);
    }

    public final void a() {
        this.H = true;
        n1 n1Var = this.f49910t;
        if (n1Var == null) {
            return;
        }
        long j11 = n1Var.f50113a;
        h1 h1Var = (h1) this.L.getValue();
        if (h1Var instanceof e1) {
            if (((e1) h1Var).f49664a == j11) {
                return;
            }
        } else if ((h1Var instanceof g1) && ((g1) h1Var).f49772a == j11) {
            return;
        }
        rz.z1 z1Var = this.K;
        if (z1Var != null) {
            z1Var.cancel(null);
        }
        this.K = rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new a0.w1(this, j11, n1Var, (vy.d) null, 10), 3);
    }
}
