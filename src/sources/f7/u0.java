package f7;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements p7.h0, k7.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f26922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f26923b;

    public u0(x0 x0Var, w0 w0Var) {
        this.f26923b = x0Var;
        this.f26922a = w0Var;
    }

    @Override // p7.h0
    public final void F(int i11, p7.b0 b0Var, p7.x xVar) {
        Pair pairA = a(i11, b0Var);
        if (pairA != null) {
            this.f26923b.f26944i.c(new q0(this, pairA, xVar, 1));
        }
    }

    @Override // p7.h0
    public final void G(int i11, p7.b0 b0Var, final p7.s sVar, final p7.x xVar, final int i12) {
        final Pair pairA = a(i11, b0Var);
        if (pairA != null) {
            this.f26923b.f26944i.c(new Runnable() { // from class: f7.s0
                @Override // java.lang.Runnable
                public final void run() {
                    g7.f fVar = this.f26908a.f26923b.f26943h;
                    Pair pair = pairA;
                    fVar.G(((Integer) pair.first).intValue(), (p7.b0) pair.second, sVar, xVar, i12);
                }
            });
        }
    }

    public final Pair a(int i11, p7.b0 b0Var) {
        p7.b0 b0VarA;
        w0 w0Var = this.f26922a;
        p7.b0 b0Var2 = null;
        if (b0Var != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= w0Var.f26932c.size()) {
                    b0VarA = null;
                    break;
                }
                if (((p7.b0) w0Var.f26932c.get(i12)).f46331d == b0Var.f46331d) {
                    Object obj = b0Var.f46328a;
                    Object obj2 = w0Var.f26931b;
                    int i13 = d1.f26689k;
                    b0VarA = b0Var.a(Pair.create(obj2, obj));
                    break;
                }
                i12++;
            }
            if (b0VarA == null) {
                return null;
            }
            b0Var2 = b0VarA;
        }
        return Pair.create(Integer.valueOf(i11 + w0Var.f26933d), b0Var2);
    }

    @Override // p7.h0
    public final void c(int i11, p7.b0 b0Var, p7.s sVar, p7.x xVar) {
        Pair pairA = a(i11, b0Var);
        if (pairA != null) {
            this.f26923b.f26944i.c(new r0(this, pairA, sVar, xVar, 0));
        }
    }

    @Override // p7.h0
    public final void l(int i11, p7.b0 b0Var, final p7.s sVar, final p7.x xVar, final IOException iOException, final boolean z11) {
        final Pair pairA = a(i11, b0Var);
        if (pairA != null) {
            this.f26923b.f26944i.c(new Runnable() { // from class: f7.t0
                @Override // java.lang.Runnable
                public final void run() {
                    g7.f fVar = this.f26914a.f26923b.f26943h;
                    Pair pair = pairA;
                    fVar.l(((Integer) pair.first).intValue(), (p7.b0) pair.second, sVar, xVar, iOException, z11);
                }
            });
        }
    }

    @Override // p7.h0
    public final void m(int i11, p7.b0 b0Var, p7.x xVar) {
        Pair pairA = a(i11, b0Var);
        if (pairA != null) {
            this.f26923b.f26944i.c(new q0(this, pairA, xVar, 0));
        }
    }

    @Override // p7.h0
    public final void o(int i11, p7.b0 b0Var, p7.s sVar, p7.x xVar) {
        Pair pairA = a(i11, b0Var);
        if (pairA != null) {
            this.f26923b.f26944i.c(new r0(this, pairA, sVar, xVar, 1));
        }
    }
}
