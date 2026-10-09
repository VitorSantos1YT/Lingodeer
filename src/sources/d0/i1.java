package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i1 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1 f22731b;

    public /* synthetic */ i1(j1 j1Var, int i11) {
        this.f22730a = i11;
        this.f22731b = j1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f22730a) {
            case 0:
                this.f22731b.V0();
                return qy.b0.f48488a;
            case 1:
                return new f2.b(this.f22731b.Y);
            default:
                w2.x xVar = (w2.x) this.f22731b.W.getValue();
                return new f2.b(xVar != null ? xVar.P(0L) : 9205357640488583168L);
        }
    }
}
