package n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f42948c;

    public h(int i11, int i12, s sVar) {
        this.f42946a = i11;
        this.f42947b = i12;
        this.f42948c = sVar;
        if (i11 < 0) {
            i0.a.a("startIndex should be >= 0");
        }
        if (i12 > 0) {
            return;
        }
        i0.a.a("size should be > 0");
    }
}
