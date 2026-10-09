package tg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements fz.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l0 f52314b = new l0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l0 f52315c = new l0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52316a;

    public /* synthetic */ l0(int i11) {
        this.f52316a = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f52316a) {
            case 0:
                ((Number) obj2).intValue();
                l1.s sVar = (l1.s) ((l1.n) obj);
                sVar.d0(-333154667);
                j3.y0 y0Var = (j3.y0) sVar.j(h0.f52286a);
                sVar.p(false);
                return y0Var;
            default:
                ((Number) obj2).intValue();
                l1.s sVar2 = (l1.s) ((l1.n) obj);
                sVar2.d0(1457540156);
                long j11 = ((g2.x) sVar2.j(h0.f52287b)).f28624a;
                sVar2.p(false);
                return new g2.x(j11);
        }
    }
}
