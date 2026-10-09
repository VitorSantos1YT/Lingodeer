package h7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f31868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f31869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31870c;

    public h a() {
        if (this.f31868a || !(this.f31869b || this.f31870c)) {
            return new h(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public boolean b() {
        return (this.f31870c || this.f31869b) && this.f31868a;
    }
}
