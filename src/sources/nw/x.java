package nw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m00.i f44279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44281c;

    public x(m00.i iVar, int i11) {
        this.f44279a = iVar;
        this.f44280b = i11;
    }

    public final void a(byte[] bArr, int i11, int i12) {
        this.f44279a.m229write(bArr, i11, i12);
        this.f44280b -= i12;
        this.f44281c += i12;
    }
}
