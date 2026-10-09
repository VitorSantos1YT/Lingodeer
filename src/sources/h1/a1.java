package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f29959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.r f29960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f29961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f29962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f29963f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ qy.e f29964t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(boolean z11, qy.e eVar, z1.r rVar, boolean z12, Object obj, int i11, int i12, int i13) {
        super(2);
        this.f29958a = i13;
        this.f29959b = z11;
        this.f29964t = eVar;
        this.f29960c = rVar;
        this.f29961d = z12;
        this.H = obj;
        this.f29962e = i11;
        this.f29963f = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29958a) {
            case 0:
                ((Number) obj2).intValue();
                fz.c cVar = (fz.c) this.f29964t;
                z0 z0Var = (z0) this.H;
                e1.a(this.f29959b, cVar, this.f29960c, this.f29961d, z0Var, (l1.n) obj, l1.t.M(this.f29962e | 1), this.f29963f);
                break;
            case 1:
                ((Number) obj2).intValue();
                fz.a aVar = (fz.a) this.f29964t;
                h7 h7Var = (h7) this.H;
                i7.a(this.f29959b, aVar, this.f29960c, this.f29961d, h7Var, (l1.n) obj, l1.t.M(this.f29962e | 1), this.f29963f);
                break;
            default:
                ((Number) obj2).intValue();
                fz.c cVar2 = (fz.c) this.f29964t;
                p9 p9Var = (p9) this.H;
                r9.a(this.f29959b, cVar2, this.f29960c, this.f29961d, p9Var, (l1.n) obj, l1.t.M(this.f29962e | 1), this.f29963f);
                break;
        }
        return qy.b0.f48488a;
    }
}
