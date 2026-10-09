package x0;

import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.r f55591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1.d f55592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f55593d;

    public /* synthetic */ g(z1.r rVar, t1.d dVar, int i11, int i12) {
        this.f55590a = i12;
        this.f55591b = rVar;
        this.f55592c = dVar;
        this.f55593d = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f55590a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                v10.c.b(this.f55591b, this.f55592c, nVar, t.M(this.f55593d | 1));
                break;
            case 1:
                v10.c.c(this.f55591b, this.f55592c, nVar, t.M(this.f55593d | 1));
                break;
            case 2:
                l.d(this.f55591b, this.f55592c, nVar, t.M(this.f55593d | 1));
                break;
            case 3:
                vc.a.d(this.f55591b, this.f55592c, nVar, t.M(this.f55593d | 1));
                break;
            default:
                vc.a.c(this.f55591b, this.f55592c, nVar, t.M(this.f55593d | 1));
                break;
        }
        return b0.f48488a;
    }
}
