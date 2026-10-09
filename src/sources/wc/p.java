package wc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f54998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f54999c;

    public /* synthetic */ p(v vVar, float f5, int i11) {
        this.f54997a = i11;
        this.f54998b = vVar;
        this.f54999c = f5;
    }

    @Override // wc.t
    public final void run() {
        switch (this.f54997a) {
            case 0:
                v vVar = this.f54998b;
                h hVar = vVar.f55010a;
                float f5 = this.f54999c;
                if (hVar != null) {
                    kd.f fVar = vVar.f55012b;
                    fVar.l(fVar.L, kd.h.f(hVar.f54968l, hVar.m, f5));
                } else {
                    vVar.f55035t.add(new p(vVar, f5, 0));
                }
                break;
            case 1:
                v vVar2 = this.f54998b;
                h hVar2 = vVar2.f55010a;
                float f11 = this.f54999c;
                if (hVar2 != null) {
                    vVar2.t((int) kd.h.f(hVar2.f54968l, hVar2.m, f11));
                } else {
                    vVar2.f55035t.add(new p(vVar2, f11, 1));
                }
                break;
            default:
                this.f54998b.v(this.f54999c);
                break;
        }
    }
}
