package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d2 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f23738c;

    public /* synthetic */ d2(int i11, int i12, long j11, z1.r rVar) {
        this.f23736a = i12;
        this.f23738c = j11;
        this.f23737b = rVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23736a) {
            case 0:
                z1.r rVar = (z1.r) this.f23737b;
                ((Integer) obj2).getClass();
                v2.b(l1.t.M(49), this.f23738c, (l1.n) obj, rVar);
                break;
            case 1:
                z1.r rVar2 = (z1.r) this.f23737b;
                ((Integer) obj2).getClass();
                qu.b.k(l1.t.M(1), this.f23738c, (l1.n) obj, rVar2);
                break;
            case 2:
                z1.r rVar3 = (z1.r) this.f23737b;
                ((Integer) obj2).getClass();
                yg.r.b(l1.t.M(1), this.f23738c, (l1.n) obj, rVar3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(7);
                fu.a.s((l1.b1) this.f23737b, this.f23738c, (l1.n) obj, iM);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ d2(int i11, long j11, int i12, Object obj) {
        this.f23736a = i12;
        this.f23737b = obj;
        this.f23738c = j11;
    }
}
