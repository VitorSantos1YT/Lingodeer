package fu;

import mt.y3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.r f28156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28158d;

    public /* synthetic */ t(z1.r rVar, int i11, int i12, int i13) {
        this.f28155a = i13;
        this.f28156b = rVar;
        this.f28157c = i11;
        this.f28158d = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f28155a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.n(l1.t.M(this.f28157c | 1), this.f28158d, nVar, this.f28156b);
                break;
            case 1:
                y3.l(this.f28157c, l1.t.M(this.f28158d | 1), nVar, this.f28156b);
                break;
            case 2:
                qu.b.d(l1.t.M(this.f28157c | 1), this.f28158d, nVar, this.f28156b);
                break;
            default:
                tv.a.d(l1.t.M(this.f28157c | 1), this.f28158d, nVar, this.f28156b);
                break;
        }
        return qy.b0.f48488a;
    }
}
