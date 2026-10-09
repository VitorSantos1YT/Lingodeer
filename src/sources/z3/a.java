package z3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f58738a;

    public a(long j11) {
        this.f58738a = j11;
    }

    @Override // z3.y
    public final long b(v3.k kVar, long j11, v3.m mVar, long j12) {
        z1.j jVar = z1.c.f58463a;
        long jA = jVar.a(0L, (((long) kVar.b()) & 4294967295L) | (((long) kVar.d()) << 32), mVar);
        long jA2 = jVar.a(0L, j12, mVar);
        long j13 = (((long) (-((int) (jA2 & 4294967295L)))) & 4294967295L) | (((long) (-((int) (jA2 >> 32)))) << 32);
        long j14 = this.f58738a;
        return v3.j.e(v3.j.e(v3.j.e(kVar.c(), jA), j13), (((long) (((int) (j14 >> 32)) * (mVar == v3.m.Ltr ? 1 : -1))) << 32) | (((long) ((int) (j14 & 4294967295L))) & 4294967295L));
    }
}
