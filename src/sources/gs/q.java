package gs;

import l1.t;
import mt.y3;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f29826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z1.r f29827d;

    public /* synthetic */ q(String str, fz.a aVar, z1.r rVar, int i11, int i12) {
        this.f29824a = i12;
        this.f29825b = str;
        this.f29826c = aVar;
        this.f29827d = rVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f29824a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.g(t.M(385), this.f29826c, this.f29825b, nVar, this.f29827d);
                break;
            default:
                y3.j(t.M(433), this.f29826c, this.f29825b, nVar, this.f29827d);
                break;
        }
        return b0.f48488a;
    }
}
