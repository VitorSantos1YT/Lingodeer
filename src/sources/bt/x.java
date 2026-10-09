package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bv.z f6166b;

    public /* synthetic */ x(bv.z zVar, int i11, int i12) {
        this.f6165a = i12;
        this.f6166b = zVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f6165a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                i0.a(this.f6166b, nVar, l1.t.M(1));
                break;
            default:
                i0.h(this.f6166b, nVar, l1.t.M(1));
                break;
        }
        return qy.b0.f48488a;
    }
}
