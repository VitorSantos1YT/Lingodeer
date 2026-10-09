package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r2 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f39433b;

    public /* synthetic */ r2(h1 h1Var, int i11) {
        this.f39432a = i11;
        this.f39433b = h1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f39432a) {
            case 0:
                this.f39433b.m(((Integer) obj).intValue());
                break;
            default:
                this.f39433b.m((int) (((v3.l) obj).f53498a >> 32));
                break;
        }
        return qy.b0.f48488a;
    }
}
