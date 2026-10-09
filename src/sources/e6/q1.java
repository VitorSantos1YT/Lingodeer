package e6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25023a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25027e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(int i11, long j11, t1 t1Var, fz.e eVar) {
        super(2);
        this.f25024b = j11;
        this.f25026d = t1Var;
        this.f25027e = eVar;
        this.f25025c = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f25023a;
        l1.n nVar = (l1.n) obj;
        ((Number) obj2).intValue();
        switch (i11) {
            case 0:
                com.bumptech.glide.f.d(this.f25025c | 1, this.f25024b, (t1) this.f25026d, (fz.e) this.f25027e, nVar);
                break;
            default:
                se.p.J((kw.h) this.f25026d, this.f25024b, (z1.r) this.f25027e, nVar, l1.t.M(this.f25025c | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(kw.h hVar, long j11, z1.r rVar, int i11) {
        super(2);
        this.f25026d = hVar;
        this.f25024b = j11;
        this.f25027e = rVar;
        this.f25025c = i11;
    }
}
