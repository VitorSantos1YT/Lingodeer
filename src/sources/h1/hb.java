package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class hb extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f30375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ za f30376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f30377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f30378d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(n nVar, za zaVar, boolean z11, int i11) {
        super(2);
        this.f30375a = nVar;
        this.f30376b = zaVar;
        this.f30377c = z11;
        this.f30378d = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM = l1.t.M(this.f30378d | 1);
        wb.b(this.f30375a, this.f30376b, this.f30377c, (l1.n) obj, iM);
        return qy.b0.f48488a;
    }
}
