package iv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f34790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kv.x f34791c;

    public /* synthetic */ n0(fz.c cVar, kv.x xVar, int i11) {
        this.f34789a = i11;
        this.f34790b = cVar;
        this.f34791c = xVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f34789a) {
            case 0:
                this.f34790b.invoke(this.f34791c.f38830a.f38730b);
                break;
            case 1:
                this.f34790b.invoke(this.f34791c.f38831b.f38730b);
                break;
            case 2:
                this.f34790b.invoke(this.f34791c.f38830a.f38730b);
                break;
            default:
                this.f34790b.invoke(this.f34791c.f38831b.f38730b);
                break;
        }
        return qy.b0.f48488a;
    }
}
