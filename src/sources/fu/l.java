package fu;

import mt.y3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28128a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1.r f28132e;

    public /* synthetic */ l(int i11, int i12, int i13, int i14, z1.r rVar) {
        this.f28129b = i11;
        this.f28130c = i12;
        this.f28131d = i13;
        this.f28132e = rVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28128a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(this.f28130c | 1);
                a.q(this.f28129b, this.f28132e, (l1.n) obj, iM, this.f28131d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = l1.t.M(1);
                y3.b(this.f28129b, this.f28130c, this.f28131d, iM2, (l1.n) obj, this.f28132e);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ l(int i11, z1.r rVar, int i12, int i13) {
        this.f28129b = i11;
        this.f28132e = rVar;
        this.f28130c = i12;
        this.f28131d = i13;
    }
}
