package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class nb extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.r f30754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f30755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f30756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f30757f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nb(n nVar, z1.r rVar, za zaVar, boolean z11, int i11, int i12) {
        super(2);
        this.f30752a = i12;
        this.f30753b = nVar;
        this.f30754c = rVar;
        this.f30755d = zaVar;
        this.f30756e = z11;
        this.f30757f = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30752a) {
            case 0:
                ((Number) obj2).intValue();
                n nVar = (n) this.f30753b;
                za zaVar = (za) this.f30755d;
                wb.e(nVar, this.f30754c, zaVar, this.f30756e, (l1.n) obj, l1.t.M(this.f30757f | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                n nVar2 = (n) this.f30753b;
                za zaVar2 = (za) this.f30755d;
                wb.k(nVar2, this.f30754c, zaVar2, this.f30756e, (l1.n) obj, l1.t.M(this.f30757f | 1));
                break;
            default:
                ((Number) obj2).intValue();
                i3.a aVar = (i3.a) this.f30753b;
                z0 z0Var = (z0) this.f30755d;
                e1.b(this.f30756e, aVar, this.f30754c, z0Var, (l1.n) obj, l1.t.M(this.f30757f | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(boolean z11, i3.a aVar, z1.r rVar, z0 z0Var, int i11) {
        super(2);
        this.f30752a = 2;
        this.f30756e = z11;
        this.f30753b = aVar;
        this.f30754c = rVar;
        this.f30755d = z0Var;
        this.f30757f = i11;
    }
}
