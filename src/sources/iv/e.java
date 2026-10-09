package iv;

import xu.a2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f34710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f34711d;

    public /* synthetic */ e(int i11, fz.a aVar, fz.c cVar, int i12, int i13) {
        this.f34708a = i13;
        this.f34709b = i11;
        this.f34710c = aVar;
        this.f34711d = cVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f34708a) {
            case 0:
                num.intValue();
                o.p(this.f34710c, this.f34711d, nVar, l1.t.M(this.f34709b | 1));
                break;
            case 1:
                num.getClass();
                jr.a.g(this.f34709b, this.f34710c, this.f34711d, nVar, l1.t.M(49));
                break;
            case 2:
                num.getClass();
                mt.g.H(this.f34709b, this.f34710c, this.f34711d, nVar, l1.t.M(49));
                break;
            case 3:
                num.getClass();
                xu.c.k(this.f34709b, this.f34710c, this.f34711d, nVar, l1.t.M(1));
                break;
            default:
                num.getClass();
                a2.b(this.f34709b, this.f34710c, this.f34711d, nVar, l1.t.M(49));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ e(fz.a aVar, fz.c cVar, int i11) {
        this.f34708a = 0;
        this.f34710c = aVar;
        this.f34711d = cVar;
        this.f34709b = i11;
    }
}
