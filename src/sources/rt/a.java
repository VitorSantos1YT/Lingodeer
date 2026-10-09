package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f49411b;

    public /* synthetic */ a(j jVar, int i11) {
        this.f49410a = i11;
        this.f49411b = jVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f49410a) {
            case 0:
                return Boolean.valueOf(this.f49411b.Y);
            case 1:
                this.f49411b.Y = true;
                return qy.b0.f48488a;
            default:
                return this.f49411b.Z;
        }
    }
}
