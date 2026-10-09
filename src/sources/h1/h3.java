package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h3 extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30321a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f30322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.r f30323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t1.d f30324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f30325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f30326f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f30327t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(t3 t3Var, z1.r rVar, p2 p2Var, fz.e eVar, t1.d dVar, boolean z11, m2 m2Var, int i11) {
        super(2);
        this.f30325e = t3Var;
        this.f30323c = rVar;
        this.f30326f = p2Var;
        this.f30327t = eVar;
        this.f30324d = dVar;
        this.f30322b = z11;
        this.H = m2Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30321a) {
            case 0:
                ((Number) obj2).intValue();
                t3 t3Var = (t3) this.f30325e;
                p2 p2Var = (p2) this.f30326f;
                fz.e eVar = (fz.e) this.f30327t;
                m2 m2Var = (m2) this.H;
                s3.a(t3Var, this.f30323c, p2Var, eVar, this.f30324d, this.f30322b, m2Var, (l1.n) obj, l1.t.M(224257));
                break;
            default:
                ((Number) obj2).intValue();
                fz.a aVar = (fz.a) this.f30325e;
                j1.q qVar = (j1.q) this.f30326f;
                z1.e eVar2 = (z1.e) this.f30327t;
                fz.f fVar = (fz.f) this.H;
                j1.j.a(this.f30322b, aVar, this.f30323c, qVar, eVar2, fVar, this.f30324d, (l1.n) obj, l1.t.M(1572865));
                break;
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(boolean z11, fz.a aVar, z1.r rVar, j1.q qVar, z1.e eVar, fz.f fVar, t1.d dVar, int i11) {
        super(2);
        this.f30322b = z11;
        this.f30325e = aVar;
        this.f30323c = rVar;
        this.f30326f = qVar;
        this.f30327t = eVar;
        this.H = fVar;
        this.f30324d = dVar;
    }
}
