package g7;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import b7.a0;
import b7.f0;
import b7.k;
import b7.n;
import b7.y;
import f7.u;
import f7.v;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import p7.b0;
import p7.s;
import p7.x;
import y6.c0;
import y6.e0;
import y6.g0;
import y6.h0;
import y6.i0;
import y6.j0;
import y6.m0;
import y6.n0;
import y6.o0;
import y6.t0;
import y6.v0;
import y6.z0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements h0, p7.h0, k7.d {
    public a0 H;
    public boolean K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f28804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f28805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f28806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f28807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f28808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n f28809f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j0 f28810t;

    public f(y yVar) {
        yVar.getClass();
        this.f28804a = yVar;
        String str = f0.f3975a;
        Looper looperMyLooper = Looper.myLooper();
        this.f28809f = new n(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, yVar, new g2.a(20));
        m0 m0Var = new m0();
        this.f28805b = m0Var;
        this.f28806c = new n0();
        this.f28807d = new e(m0Var);
        this.f28808e = new SparseArray();
    }

    @Override // y6.h0
    public final void A(PlaybackException playbackException) {
        b0 b0Var;
        N((!(playbackException instanceof ExoPlaybackException) || (b0Var = ((ExoPlaybackException) playbackException).H) == null) ? I() : J(b0Var), 10, new g2.a(16));
    }

    @Override // y6.h0
    public final void B(e0 e0Var) {
        N(I(), 12, new g2.a(18));
    }

    @Override // y6.h0
    public final void C(int i11, i0 i0Var, i0 i0Var2) {
        if (i11 == 1) {
            this.K = false;
        }
        j0 j0Var = this.f28810t;
        j0Var.getClass();
        e eVar = this.f28807d;
        eVar.f28801d = e.b(j0Var, eVar.f28799b, eVar.f28802e, eVar.f28798a);
        a aVarI = I();
        N(aVarI, 11, new com.yalantis.ucrop.a(aVarI, i11, i0Var, i0Var2));
    }

    @Override // y6.h0
    public final void D(PlaybackException playbackException) {
        b0 b0Var;
        a aVarI = (!(playbackException instanceof ExoPlaybackException) || (b0Var = ((ExoPlaybackException) playbackException).H) == null) ? I() : J(b0Var);
        N(aVarI, 10, new com.google.firebase.database.android.d(aVarI, playbackException, 25));
    }

    @Override // y6.h0
    public final void E(int i11, int i12) {
        N(M(), 24, new g2.a(28));
    }

    @Override // p7.h0
    public final void F(int i11, b0 b0Var, x xVar) {
        a aVarL = L(i11, b0Var);
        N(aVarL, 1004, new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(11, aVarL, xVar));
    }

    @Override // p7.h0
    public final void G(int i11, b0 b0Var, s sVar, x xVar, int i12) {
        N(L(i11, b0Var), 1000, new c(16));
    }

    @Override // y6.h0
    public final void H(boolean z11) {
        N(I(), 7, new g2.a(12));
    }

    public final a I() {
        return J(this.f28807d.f28801d);
    }

    public final a J(b0 b0Var) {
        this.f28810t.getClass();
        o0 o0Var = b0Var == null ? null : (o0) this.f28807d.f28800c.get(b0Var);
        if (b0Var != null && o0Var != null) {
            return K(o0Var, o0Var.g(b0Var.f46328a, this.f28805b).f57230c, b0Var);
        }
        int iY = this.f28810t.y();
        o0 o0VarF = this.f28810t.F();
        if (iY >= o0VarF.o()) {
            o0VarF = o0.f57278a;
        }
        return K(o0VarF, iY, null);
    }

    public final a K(o0 o0Var, int i11, b0 b0Var) {
        b0 b0Var2 = o0Var.p() ? null : b0Var;
        this.f28804a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z11 = o0Var.equals(this.f28810t.F()) && i11 == this.f28810t.y();
        long jV = 0;
        if (b0Var2 == null || !b0Var2.b()) {
            if (z11) {
                jV = this.f28810t.t();
            } else if (!o0Var.p()) {
                jV = f0.V(o0Var.m(i11, this.f28806c, 0L).f57249l);
            }
        } else if (z11 && this.f28810t.x() == b0Var2.f46329b && this.f28810t.n() == b0Var2.f46330c) {
            jV = this.f28810t.P();
        }
        return new a(jElapsedRealtime, o0Var, i11, b0Var2, jV, this.f28810t.F(), this.f28810t.y(), this.f28807d.f28801d, this.f28810t.P(), this.f28810t.e());
    }

    public final a L(int i11, b0 b0Var) {
        this.f28810t.getClass();
        if (b0Var != null) {
            return ((o0) this.f28807d.f28800c.get(b0Var)) != null ? J(b0Var) : K(o0.f57278a, i11, b0Var);
        }
        o0 o0VarF = this.f28810t.F();
        if (i11 >= o0VarF.o()) {
            o0VarF = o0.f57278a;
        }
        return K(o0VarF, i11, null);
    }

    public final a M() {
        return J(this.f28807d.f28803f);
    }

    public final void N(a aVar, int i11, k kVar) {
        this.f28808e.put(i11, aVar);
        this.f28809f.e(i11, kVar);
    }

    public final void O(j0 j0Var, Looper looper) {
        b7.a.j(this.f28810t == null || this.f28807d.f28799b.isEmpty());
        j0Var.getClass();
        this.f28810t = j0Var;
        this.H = this.f28804a.a(looper, null);
        n nVar = this.f28809f;
        this.f28809f = new n((CopyOnWriteArraySet) nVar.f4008f, looper, (y) nVar.f4005c, new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(10, this, j0Var), nVar.f4004b);
    }

    @Override // y6.h0
    public final void a(z0 z0Var) {
        a aVarM = M();
        N(aVarM, 25, new v(aVarM, z0Var));
    }

    @Override // y6.h0
    public final void b(int i11) {
        N(I(), 6, new g2.a(14));
    }

    @Override // p7.h0
    public final void c(int i11, b0 b0Var, s sVar, x xVar) {
        N(L(i11, b0Var), 1002, new c(18));
    }

    @Override // y6.h0
    public final void d(v0 v0Var) {
        N(I(), 2, new g2.a(25));
    }

    @Override // y6.h0
    public final void e(a7.d dVar) {
        N(I(), 27, new c(4));
    }

    @Override // y6.h0
    public final void f(boolean z11) {
        N(I(), 3, new c(21));
    }

    @Override // y6.h0
    public final void g(y6.a0 a0Var) {
        N(I(), 14, new c(14));
    }

    @Override // y6.h0
    public final void h(int i11, boolean z11) {
        N(I(), 5, new g2.a(17));
    }

    @Override // y6.h0
    public final void i(float f5) {
        N(M(), 22, new c(2));
    }

    @Override // y6.h0
    public final void j(int i11) {
        N(M(), 21, new c(11));
    }

    @Override // y6.h0
    public final void k(int i11) {
        N(I(), 4, new g2.a(21));
    }

    @Override // p7.h0
    public final void l(int i11, b0 b0Var, s sVar, x xVar, IOException iOException, boolean z11) {
        a aVarL = L(i11, b0Var);
        N(aVarL, 1003, new com.google.firebase.database.android.d(aVarL, sVar, xVar, iOException, z11));
    }

    @Override // p7.h0
    public final void m(int i11, b0 b0Var, x xVar) {
        N(L(i11, b0Var), 1005, new g2.a(8));
    }

    @Override // y6.h0
    public final void n(boolean z11) {
        N(I(), 9, new g2.a(27));
    }

    @Override // p7.h0
    public final void o(int i11, b0 b0Var, s sVar, x xVar) {
        N(L(i11, b0Var), 1001, new c(19));
    }

    @Override // y6.h0
    public final void p(y6.x xVar, int i11) {
        N(I(), 1, new c(25));
    }

    @Override // y6.h0
    public final void q(int i11) {
        j0 j0Var = this.f28810t;
        j0Var.getClass();
        e eVar = this.f28807d;
        eVar.f28801d = e.b(j0Var, eVar.f28799b, eVar.f28802e, eVar.f28798a);
        eVar.d(j0Var.F());
        N(I(), 0, new c(24));
    }

    @Override // y6.h0
    public final void r(c0 c0Var) {
        N(I(), 28, new g2.a(11));
    }

    @Override // y6.h0
    public final void s(t0 t0Var) {
        N(I(), 19, new g2.a(29));
    }

    @Override // y6.h0
    public final void t(int i11) {
        N(I(), 8, new g2.a(23));
    }

    @Override // y6.h0
    public final void v(boolean z11) {
        N(M(), 23, new c(17));
    }

    @Override // y6.h0
    public final void w(List list) {
        a aVarI = I();
        N(aVarI, 27, new u(aVarI, list));
    }

    @Override // y6.h0
    public final void y(int i11, boolean z11) {
        N(I(), -1, new g2.a(10));
    }

    @Override // y6.h0
    public final void z(y6.f0 f0Var) {
        N(I(), 13, new c(23));
    }

    @Override // y6.h0
    public final void u() {
    }

    @Override // y6.h0
    public final void x(g0 g0Var) {
    }
}
