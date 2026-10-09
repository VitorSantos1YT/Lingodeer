package wc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f54991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f54992c;

    public /* synthetic */ n(v vVar, int i11, int i12) {
        this.f54990a = i12;
        this.f54991b = vVar;
        this.f54992c = i11;
    }

    @Override // wc.t
    public final void run() {
        switch (this.f54990a) {
            case 0:
                this.f54991b.q(this.f54992c);
                break;
            case 1:
                this.f54991b.t(this.f54992c);
                break;
            default:
                this.f54991b.p(this.f54992c);
                break;
        }
    }
}
