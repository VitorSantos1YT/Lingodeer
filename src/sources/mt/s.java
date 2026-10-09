package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f41851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rt.r f41852c;

    public /* synthetic */ s(fz.c cVar, rt.r rVar, int i11) {
        this.f41850a = i11;
        this.f41851b = cVar;
        this.f41852c = rVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f41850a) {
            case 0:
                this.f41851b.invoke(this.f41852c.f50318a);
                break;
            case 1:
                this.f41851b.invoke(this.f41852c);
                break;
            default:
                this.f41851b.invoke(this.f41852c);
                break;
        }
        return qy.b0.f48488a;
    }
}
