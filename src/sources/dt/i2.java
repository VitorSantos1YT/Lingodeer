package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i2 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f23883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f23884c;

    public /* synthetic */ i2(fz.c cVar, boolean z11, int i11) {
        this.f23882a = i11;
        this.f23883b = cVar;
        this.f23884c = z11;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f23882a) {
            case 0:
                this.f23883b.invoke(Boolean.valueOf(this.f23884c));
                break;
            case 1:
                this.f23883b.invoke(Boolean.valueOf(!this.f23884c));
                break;
            case 2:
                this.f23883b.invoke(new xu.o0(this.f23884c));
                break;
            default:
                this.f23883b.invoke(Boolean.valueOf(!this.f23884c));
                break;
        }
        return qy.b0.f48488a;
    }
}
