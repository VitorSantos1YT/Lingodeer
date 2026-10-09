package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class m extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2.t f22755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f22756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g2.w0 f22757d;

    public m(long j11, g2.t tVar, float f5, g2.w0 w0Var, int i11) {
        j11 = (i11 & 1) != 0 ? g2.x.f28622i : j11;
        tVar = (i11 & 2) != 0 ? null : tVar;
        this.f22754a = j11;
        this.f22755b = tVar;
        this.f22756c = f5;
        this.f22757d = w0Var;
    }

    public final boolean equals(Object obj) {
        m mVar = obj instanceof m ? (m) obj : null;
        return mVar != null && g2.x.d(this.f22754a, mVar.f22754a) && kotlin.jvm.internal.m.a(this.f22755b, mVar.f22755b) && this.f22756c == mVar.f22756c && kotlin.jvm.internal.m.a(this.f22757d, mVar.f22757d);
    }

    @Override // y2.d1
    public final z1.q f() {
        o oVar = new o();
        oVar.Q = this.f22754a;
        oVar.R = this.f22755b;
        oVar.S = this.f22756c;
        oVar.T = this.f22757d;
        oVar.U = 9205357640488583168L;
        return oVar;
    }

    public final int hashCode() {
        int i11 = g2.x.f28623j;
        int iHashCode = Long.hashCode(this.f22754a) * 31;
        g2.t tVar = this.f22755b;
        return this.f22757d.hashCode() + defpackage.e.a((iHashCode + (tVar != null ? tVar.hashCode() : 0)) * 31, this.f22756c, 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        o oVar = (o) qVar;
        oVar.Q = this.f22754a;
        oVar.R = this.f22755b;
        oVar.S = this.f22756c;
        oVar.T = this.f22757d;
        y2.f.m(oVar);
    }
}
