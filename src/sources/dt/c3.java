package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c3 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.r f23707c;

    public /* synthetic */ c3(int i11, z1.r rVar, int i12, int i13) {
        this.f23705a = i13;
        this.f23706b = i11;
        this.f23707c = rVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f23705a) {
            case 0:
                num.getClass();
                k3.a(this.f23706b, l1.t.M(1), nVar, this.f23707c);
                break;
            case 1:
                num.getClass();
                gs.a.x(this.f23706b, l1.t.M(55), nVar, this.f23707c);
                break;
            case 2:
                num.intValue();
                j0.o.a(this.f23707c, nVar, l1.t.M(this.f23706b | 1));
                break;
            case 3:
                num.getClass();
                mt.g.z(this.f23707c, nVar, l1.t.M(this.f23706b | 1));
                break;
            case 4:
                num.getClass();
                pr.f0.p(this.f23706b, l1.t.M(1), nVar, this.f23707c);
                break;
            case 5:
                num.getClass();
                s0.d.b(l1.t.M(1), this.f23706b, nVar, this.f23707c);
                break;
            default:
                num.getClass();
                ys.a.u(this.f23706b, l1.t.M(49), nVar, this.f23707c);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ c3(z1.r rVar, int i11, int i12, byte b3) {
        this.f23705a = i12;
        this.f23707c = rVar;
        this.f23706b = i11;
    }

    public /* synthetic */ c3(z1.r rVar, int i11, int i12, int i13) {
        this.f23705a = i13;
        this.f23707c = rVar;
        switch (i13) {
            case 5:
                this.f23706b = i12;
                break;
            default:
                this.f23706b = i11;
                break;
        }
    }
}
