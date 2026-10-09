package tu;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import kotlin.NoWhenBranchMatchedException;
import n9.n1;
import rt.l3;
import rz.o0;
import uz.a1;
import uz.i1;
import uz.r0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ru.a f52556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.c f52557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.n0 f52558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1 f52559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1 f52560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r0 f52561f;

    public e0(ru.a aVar, vt.c cVar, vt.n0 n0Var) {
        this.f52556a = aVar;
        this.f52557b = cVar;
        this.f52558c = n0Var;
        vy.d dVar = null;
        i1 i1VarC = x0.c(null);
        this.f52559d = i1VarC;
        i1 i1VarC2 = x0.c(Boolean.FALSE);
        this.f52560e = i1VarC2;
        no.g gVar = new no.g(i1VarC2, x0.B(i1VarC, new dt.x(dVar, this, 22)), new l3(this, dVar, 2));
        yz.f fVar = o0.f50940a;
        yz.e eVar = yz.e.f58387a;
        this.f52561f = x0.A(x0.w(gVar, eVar), ViewModelKt.getViewModelScope(this), a1.a(2), z.f52631a);
        int i11 = 17;
        x0.y(new n1(x0.w(new bh.r(new gp.t(i1VarC, i11), this, 27), eVar), new nu.b(this, dVar, i11), 5), ViewModelKt.getViewModelScope(this));
    }

    public final void a(y yVar) {
        boolean z11 = yVar instanceof v;
        i1 i1Var = this.f52559d;
        vy.d dVar = null;
        if (z11) {
            i1Var.k(null);
            LeaderBoardUser leaderBoardUser = ((v) yVar).f52628a;
            i1Var.getClass();
            i1Var.l(null, leaderBoardUser);
            return;
        }
        if (yVar.equals(w.f52629a)) {
            i1Var.k(null);
            Boolean bool = Boolean.FALSE;
            i1 i1Var2 = this.f52560e;
            i1Var2.getClass();
            i1Var2.l(null, bool);
            return;
        }
        if (yVar instanceof u) {
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new c0(this, yVar, dVar, 0), 3);
        } else {
            if (!(yVar instanceof x)) {
                throw new NoWhenBranchMatchedException();
            }
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new c0(this, yVar, dVar, 1), 3);
        }
    }
}
