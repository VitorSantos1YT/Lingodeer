package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f30442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f30443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qy.e f30444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f30445f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ qy.e f30446t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(qy.e eVar, z1.r rVar, Object obj, qy.e eVar2, int i11, int i12, int i13) {
        super(2);
        this.f30440a = i13;
        this.f30444e = eVar;
        this.f30441b = rVar;
        this.f30445f = obj;
        this.f30446t = eVar2;
        this.f30442c = i11;
        this.f30443d = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30440a) {
            case 0:
                ((Number) obj2).intValue();
                k.d((fz.a) this.f30444e, (z1.r) this.f30441b, (z3.r) this.f30445f, (t1.d) this.f30446t, (l1.n) obj, l1.t.M(this.f30442c | 1), this.f30443d);
                break;
            case 1:
                ((Number) obj2).intValue();
                y3.h.a((fz.c) this.f30444e, (z1.r) this.f30441b, (fz.c) this.f30445f, (fz.c) this.f30446t, (l1.n) obj, l1.t.M(this.f30442c | 1), this.f30443d);
                break;
            default:
                ((Number) obj2).intValue();
                z3.k.a((z3.y) this.f30441b, (fz.a) this.f30444e, (z3.z) this.f30445f, (t1.d) this.f30446t, (l1.n) obj, l1.t.M(this.f30442c | 1), this.f30443d);
                break;
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(z3.y yVar, fz.a aVar, z3.z zVar, t1.d dVar, int i11, int i12) {
        super(2);
        this.f30440a = 2;
        this.f30441b = yVar;
        this.f30444e = aVar;
        this.f30445f = zVar;
        this.f30446t = dVar;
        this.f30442c = i11;
        this.f30443d = i12;
    }
}
