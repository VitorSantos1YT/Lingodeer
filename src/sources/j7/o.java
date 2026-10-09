package j7;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f36157j;

    public o(j jVar, long j11, long j12, long j13, long j14, List list, long j15, List list2, long j16, long j17) {
        super(jVar, j11, j12, j13, j14, list, j15, j16, j17);
        this.f36157j = list2;
    }

    @Override // j7.n
    public final long d(long j11) {
        return this.f36157j.size();
    }

    @Override // j7.n
    public final j h(k kVar, long j11) {
        return (j) this.f36157j.get((int) (j11 - this.f36151d));
    }

    @Override // j7.n
    public final boolean i() {
        return true;
    }
}
