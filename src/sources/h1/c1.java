package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30069a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f30070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.r f30071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f30072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f30073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f30074f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f30075t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(fz.a aVar, z1.r rVar, boolean z11, o4 o4Var, fz.e eVar, int i11, int i12) {
        super(2);
        this.f30070b = aVar;
        this.f30071c = rVar;
        this.f30072d = z11;
        this.f30075t = o4Var;
        this.H = eVar;
        this.f30073e = i11;
        this.f30074f = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30069a) {
            case 0:
                ((Number) obj2).intValue();
                i3.a aVar = (i3.a) this.f30075t;
                z0 z0Var = (z0) this.H;
                e1.c(aVar, this.f30070b, this.f30071c, this.f30072d, z0Var, (l1.n) obj, l1.t.M(this.f30073e | 1), this.f30074f);
                break;
            default:
                ((Number) obj2).intValue();
                o4 o4Var = (o4) this.f30075t;
                fz.e eVar = (fz.e) this.H;
                k7.h(this.f30070b, this.f30071c, this.f30072d, o4Var, eVar, (l1.n) obj, l1.t.M(this.f30073e | 1), this.f30074f);
                break;
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(i3.a aVar, fz.a aVar2, z1.r rVar, boolean z11, z0 z0Var, int i11, int i12) {
        super(2);
        this.f30075t = aVar;
        this.f30070b = aVar2;
        this.f30071c = rVar;
        this.f30072d = z11;
        this.H = z0Var;
        this.f30073e = i11;
        this.f30074f = i12;
    }
}
