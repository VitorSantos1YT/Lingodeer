package iv;

import ys.j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f34825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.r f34826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f34827d;

    public /* synthetic */ s0(int i11, int i12, fz.a aVar, z1.r rVar) {
        this.f34824a = i12;
        this.f34825b = aVar;
        this.f34826c = rVar;
        this.f34827d = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f34824a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                z0.a(l1.t.M(this.f34827d | 1), this.f34825b, nVar, this.f34826c);
                break;
            case 1:
                km.b1.c(l1.t.M(this.f34827d | 1), this.f34825b, nVar, this.f34826c);
                break;
            case 2:
                mt.g.a(l1.t.M(this.f34827d | 1), this.f34825b, nVar, this.f34826c);
                break;
            default:
                j3.a(l1.t.M(this.f34827d | 1), this.f34825b, nVar, this.f34826c);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ s0(int i11, fz.a aVar, z1.r rVar) {
        this.f34824a = 3;
        this.f34826c = rVar;
        this.f34825b = aVar;
        this.f34827d = i11;
    }
}
