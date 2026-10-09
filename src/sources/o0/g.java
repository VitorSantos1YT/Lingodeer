package o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements n0.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f44374a;

    public g(t tVar) {
        this.f44374a = tVar;
    }

    @Override // n0.q
    public final int a() {
        t tVar = this.f44374a;
        return Math.min(tVar.m() - 1, ((e) ry.m.z0(tVar.l().f44400a)).f44362a);
    }

    @Override // n0.q
    public final int b() {
        int i11;
        t tVar = this.f44374a;
        if (tVar.l().f44400a.size() == 0) {
            return 0;
        }
        int iT = android.support.v4.media.session.a.t(tVar.l());
        int i12 = tVar.l().f44401b + tVar.l().f44402c;
        if (i12 != 0 && (i11 = iT / i12) >= 1) {
            return i11;
        }
        return 1;
    }

    @Override // n0.q
    public final boolean c() {
        return !this.f44374a.l().f44400a.isEmpty();
    }

    @Override // n0.q
    public final int d() {
        return Math.max(0, this.f44374a.f44436e);
    }

    @Override // n0.q
    public final int getItemCount() {
        return this.f44374a.m();
    }
}
