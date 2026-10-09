package l8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39822c;

    public h(int i11, int i12, boolean z11) {
        this.f39820a = i11;
        this.f39821b = i12;
        this.f39822c = z11;
    }

    public static h a(int i11) {
        return new h(i11, -1, false);
    }

    public h(int i11, boolean z11, int i12) {
        this.f39820a = i11;
        this.f39822c = z11;
        this.f39821b = i12;
    }
}
