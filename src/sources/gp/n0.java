package gp;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.env.Env;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.n0 f29458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ur.a f29459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uz.i1 f29460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uz.r0 f29461d;

    public n0(Env env, vt.n0 n0Var, ur.a aVar) {
        this.f29458a = n0Var;
        this.f29459b = aVar;
        uz.i1 i1VarC = uz.x0.c(new j0("19:40", (127 & 16) != 0 ? "19:40" : "21:40", null, true, false, true, (127 & 32) != 0));
        this.f29460c = i1VarC;
        this.f29461d = new uz.r0(i1VarC);
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new av.p(this, null, 18), 3);
    }

    public static final void a(n0 n0Var, String str, String str2) {
        n0Var.f29459b.c("jxz_me_settings_reminders", new k0(str, str2, 0));
    }

    public final void b(i0 i0Var) {
        vy.d dVar = null;
        if (i0Var instanceof g0) {
            g0 g0Var = (g0) i0Var;
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new m0(g0Var.f29379a, g0Var.f29380b, this, g0Var.f29381c, null, 0), 3);
            return;
        }
        if (i0Var instanceof h0) {
            h0 h0Var = (h0) i0Var;
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new m0(h0Var.f29385a, h0Var.f29386b, this, h0Var.f29387c, null, 1), 3);
            return;
        }
        if (i0Var instanceof d0) {
            d0 d0Var = (d0) i0Var;
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new l0(this, d0Var.f29359a, d0Var.f29360b, dVar, 0), 3);
            return;
        }
        if (i0Var instanceof f0) {
            f0 f0Var = (f0) i0Var;
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new l0(this, f0Var.f29372a, f0Var.f29373b, dVar, 1), 3);
            return;
        }
        if (i0Var instanceof e0) {
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new bp.j(4, this, dVar, ((e0) i0Var).f29365a), 3);
        } else if (i0Var.equals(c0.f29352b)) {
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new av.p(this, dVar, 18), 3);
        } else {
            if (!i0Var.equals(c0.f29351a)) {
                throw new NoWhenBranchMatchedException();
            }
            uz.i1 i1Var = this.f29460c;
            i1Var.l(null, j0.a((j0) i1Var.getValue(), false, null, false, false, null, null, 63));
        }
    }
}
