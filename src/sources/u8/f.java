package u8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f52828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f52829b;

    public f(long j11, byte[] bArr) {
        this.f52828a = j11;
        this.f52829b = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f52828a, ((f) obj).f52828a);
    }
}
