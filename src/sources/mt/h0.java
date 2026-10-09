package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f41505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f41506c;

    public /* synthetic */ h0(fz.c cVar, int i11, int i12) {
        this.f41504a = i12;
        this.f41505b = cVar;
        this.f41506c = i11;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f41504a) {
            case 0:
                int i11 = this.f41506c - 1;
                if (i11 < 0) {
                    i11 = 0;
                }
                this.f41505b.invoke(Integer.valueOf(i11));
                break;
            case 1:
                this.f41505b.invoke(Integer.valueOf(this.f41506c));
                break;
            case 2:
                this.f41505b.invoke(Integer.valueOf(this.f41506c));
                break;
            case 3:
                this.f41505b.invoke(Integer.valueOf(this.f41506c));
                break;
            case 4:
                this.f41505b.invoke(Integer.valueOf(this.f41506c));
                break;
            default:
                this.f41505b.invoke(Integer.valueOf(this.f41506c));
                break;
        }
        return qy.b0.f48488a;
    }
}
