package v8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends u8.h implements Comparable {
    public long M;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (e(4) != gVar.e(4)) {
            return e(4) ? 1 : -1;
        }
        long j11 = this.f25117t - gVar.f25117t;
        if (j11 == 0) {
            j11 = this.M - gVar.M;
            if (j11 == 0) {
                return 0;
            }
        }
        return j11 > 0 ? 1 : -1;
    }
}
