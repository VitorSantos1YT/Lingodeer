package x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f55687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f55688c;

    public /* synthetic */ k(fz.c cVar, fz.c cVar2, int i11) {
        this.f55686a = i11;
        this.f55687b = cVar;
        this.f55688c = cVar2;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f55686a) {
            case 0:
                this.f55687b.invoke(obj);
                this.f55688c.invoke(obj);
                break;
            default:
                this.f55687b.invoke(obj);
                this.f55688c.invoke(obj);
                break;
        }
        return qy.b0.f48488a;
    }
}
