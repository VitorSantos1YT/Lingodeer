package wb;

import a0.b2;
import android.os.SystemClock;
import com.yalantis.ucrop.view.CropImageView;
import l1.g1;
import l1.h1;
import l1.k1;
import w2.a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends k2.b {
    public final w2.j H;
    public final int K;
    public final boolean L;
    public boolean O;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k2.b f54928f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k2.b f54929t;
    public final h1 M = new h1(0);
    public long N = -1;
    public final g1 P = new g1(1.0f);
    public final k1 Q = l1.t.B(null);

    public q(k2.b bVar, k2.b bVar2, w2.j jVar, int i11, boolean z11) {
        this.f54928f = bVar;
        this.f54929t = bVar2;
        this.H = jVar;
        this.K = i11;
        this.L = z11;
    }

    @Override // k2.b
    public final boolean b(float f5) {
        this.P.m(f5);
        return true;
    }

    @Override // k2.b
    public final boolean c(g2.p pVar) {
        this.Q.setValue(pVar);
        return true;
    }

    @Override // k2.b
    public final long h() {
        k2.b bVar = this.f54928f;
        long jH = bVar != null ? bVar.h() : 0L;
        k2.b bVar2 = this.f54929t;
        long jH2 = bVar2 != null ? bVar2.h() : 0L;
        boolean z11 = jH != 9205357640488583168L;
        boolean z12 = jH2 != 9205357640488583168L;
        if (z11 && z12) {
            return com.bumptech.glide.g.b(Math.max(f2.e.d(jH), f2.e.d(jH2)), Math.max(f2.e.b(jH), f2.e.b(jH2)));
        }
        return 9205357640488583168L;
    }

    @Override // k2.b
    public final void i(i2.d dVar) {
        boolean z11 = this.O;
        g1 g1Var = this.P;
        k2.b bVar = this.f54929t;
        if (z11) {
            j(dVar, bVar, g1Var.l());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.N == -1) {
            this.N = jUptimeMillis;
        }
        float f5 = (jUptimeMillis - this.N) / this.K;
        float fL = g1Var.l() * hz.b.k(f5, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        float fL2 = this.L ? g1Var.l() - fL : g1Var.l();
        this.O = f5 >= 1.0f;
        j(dVar, this.f54928f, fL2);
        j(dVar, bVar, fL);
        if (this.O) {
            this.f54928f = null;
        } else {
            h1 h1Var = this.M;
            h1Var.m(h1Var.l() + 1);
        }
    }

    public final void j(i2.d dVar, k2.b bVar, float f5) {
        if (bVar == null || f5 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        long jD = dVar.d();
        long jH = bVar.h();
        long jP = (jH == 9205357640488583168L || f2.e.e(jH) || jD == 9205357640488583168L || f2.e.e(jD)) ? jD : a0.p(jH, this.H.a(jH, jD));
        k1 k1Var = this.Q;
        if (jD == 9205357640488583168L || f2.e.e(jD)) {
            bVar.g(dVar, jP, f5, (g2.p) k1Var.getValue());
            return;
        }
        float f11 = 2;
        float fD = (f2.e.d(jD) - f2.e.d(jP)) / f11;
        float fB = (f2.e.b(jD) - f2.e.b(jP)) / f11;
        ((b2) dVar.j0().f56174b).i(fD, fB, fD, fB);
        bVar.g(dVar, jP, f5, (g2.p) k1Var.getValue());
        b2 b2Var = (b2) dVar.j0().f56174b;
        float f12 = -fD;
        float f13 = -fB;
        b2Var.i(f12, f13, f12, f13);
    }
}
