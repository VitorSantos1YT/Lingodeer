package iv;

import ys.a3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.r f34732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f34733c;

    public /* synthetic */ g(int i11, z1.r rVar, boolean z11) {
        this.f34731a = 1;
        this.f34732b = rVar;
        this.f34733c = z11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f34731a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                o.r(l1.t.M(7), nVar, this.f34732b, this.f34733c);
                break;
            case 1:
                jr.a.b(l1.t.M(1), nVar, this.f34732b, this.f34733c);
                break;
            default:
                a3.c(l1.t.M(49), nVar, this.f34732b, this.f34733c);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ g(boolean z11, z1.r rVar, int i11, int i12) {
        this.f34731a = i12;
        this.f34733c = z11;
        this.f34732b = rVar;
    }
}
