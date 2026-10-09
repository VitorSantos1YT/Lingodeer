package x7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f55863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f55864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f55865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f55866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f55867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f55868f;

    public d(f fVar, long j11, long j12, long j13, long j14, long j15) {
        this.f55863a = fVar;
        this.f55864b = j11;
        this.f55865c = j12;
        this.f55866d = j13;
        this.f55867e = j14;
        this.f55868f = j15;
    }

    @Override // x7.y
    public final boolean d() {
        return true;
    }

    @Override // x7.y
    public final x i(long j11) {
        z zVar = new z(j11, e.a(this.f55863a.a(j11), 0L, this.f55865c, this.f55866d, this.f55867e, this.f55868f));
        return new x(zVar, zVar);
    }

    @Override // x7.y
    public final long k() {
        return this.f55864b;
    }
}
