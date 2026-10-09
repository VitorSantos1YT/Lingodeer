package wc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f55000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f55001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f55002c;

    public /* synthetic */ q(v vVar, int i11, int i12) {
        this.f55000a = vVar;
        this.f55001b = i11;
        this.f55002c = i12;
    }

    @Override // wc.t
    public final void run() {
        v vVar = this.f55000a;
        h hVar = vVar.f55010a;
        int i11 = this.f55001b;
        int i12 = this.f55002c;
        if (hVar == null) {
            vVar.f55035t.add(new q(vVar, i11, i12));
        } else {
            vVar.f55012b.l(i11, i12 + 0.99f);
        }
    }
}
