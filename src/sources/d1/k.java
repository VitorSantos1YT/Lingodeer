package d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements z3.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1.e f22927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f22928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f22929c = 0;

    public k(z1.e eVar, l lVar) {
        this.f22927a = eVar;
        this.f22928b = lVar;
    }

    @Override // z3.y
    public final long b(v3.k kVar, long j11, v3.m mVar, long j12) {
        long jA = this.f22928b.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.f22929c;
        }
        this.f22929c = jA;
        return v3.j.e(v3.j.e(kVar.c(), ew.a.B(jA)), this.f22927a.a(j12, 0L, mVar));
    }
}
