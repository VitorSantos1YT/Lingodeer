package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a5 extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29973a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.r f29974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f29975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t1.d f29976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f29977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f29978f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f29979t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(t1.d dVar, fz.a aVar, z1.r rVar, boolean z11, w4 w4Var, j0.t1 t1Var, int i11) {
        super(2);
        this.f29976d = dVar;
        this.f29978f = aVar;
        this.f29974b = rVar;
        this.f29975c = z11;
        this.f29979t = w4Var;
        this.H = t1Var;
        this.f29977e = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29973a) {
            case 0:
                ((Number) obj2).intValue();
                fz.a aVar = (fz.a) this.f29978f;
                w4 w4Var = (w4) this.f29979t;
                j0.t1 t1Var = (j0.t1) this.H;
                b5.b(this.f29976d, aVar, this.f29974b, this.f29975c, w4Var, t1Var, (l1.n) obj, l1.t.M(this.f29977e | 1));
                break;
            default:
                ((Number) obj2).intValue();
                p8 p8Var = (p8) this.f29978f;
                h0.i iVar = (h0.i) this.f29979t;
                t1.d dVar = (t1.d) this.H;
                o8.c(this.f29974b, p8Var, this.f29975c, iVar, this.f29976d, dVar, (l1.n) obj, l1.t.M(this.f29977e | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(z1.r rVar, p8 p8Var, boolean z11, h0.i iVar, t1.d dVar, t1.d dVar2, int i11) {
        super(2);
        this.f29974b = rVar;
        this.f29978f = p8Var;
        this.f29975c = z11;
        this.f29979t = iVar;
        this.f29976d = dVar;
        this.H = dVar2;
        this.f29977e = i11;
    }
}
