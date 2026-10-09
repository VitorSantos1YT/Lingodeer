package h2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f31503b;

    public /* synthetic */ n(r rVar, int i11) {
        this.f31502a = i11;
        this.f31503b = rVar;
    }

    @Override // h2.j
    public final double a(double d5) {
        switch (this.f31502a) {
            case 0:
                r rVar = this.f31503b;
                return hz.b.j(rVar.f31518k.a(d5), rVar.f31512e, rVar.f31513f);
            default:
                r rVar2 = this.f31503b;
                return rVar2.f31520n.a(hz.b.j(d5, rVar2.f31512e, rVar2.f31513f));
        }
    }
}
