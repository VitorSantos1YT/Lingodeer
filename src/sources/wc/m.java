package wc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f54988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f54989c;

    public /* synthetic */ m(v vVar, String str, int i11) {
        this.f54987a = i11;
        this.f54988b = vVar;
        this.f54989c = str;
    }

    @Override // wc.t
    public final void run() {
        switch (this.f54987a) {
            case 0:
                this.f54988b.s(this.f54989c);
                break;
            case 1:
                this.f54988b.r(this.f54989c);
                break;
            default:
                this.f54988b.u(this.f54989c);
                break;
        }
    }
}
