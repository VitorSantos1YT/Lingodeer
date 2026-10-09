package r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f48674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f48675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f48677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f48678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f48679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f48680h;

    public final void a(int i11, int i12) {
        this.f48675c = i11;
        this.f48676d = i12;
        this.f48680h = true;
        if (this.f48679g) {
            if (i12 != Integer.MIN_VALUE) {
                this.f48673a = i12;
            }
            if (i11 != Integer.MIN_VALUE) {
                this.f48674b = i11;
                return;
            }
            return;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f48673a = i11;
        }
        if (i12 != Integer.MIN_VALUE) {
            this.f48674b = i12;
        }
    }
}
