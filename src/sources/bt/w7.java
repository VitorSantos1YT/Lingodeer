package bt;

import rt.qd;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w7 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6160a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f6161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.r f6162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qy.e f6164e;

    public /* synthetic */ w7(long j11, d0.v vVar, z1.r rVar, t1.d dVar, int i11) {
        this.f6161b = j11;
        this.f6163d = vVar;
        this.f6162c = rVar;
        this.f6164e = dVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6160a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(3073);
                e8.e(this.f6161b, (d0.v) this.f6163d, this.f6162c, (t1.d) this.f6164e, (l1.n) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = l1.t.M(385);
                ys.j3.d(this.f6161b, this.f6162c, (qd) this.f6163d, (fz.a) this.f6164e, (l1.n) obj, iM2);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ w7(long j11, z1.r rVar, qd qdVar, fz.a aVar, int i11) {
        this.f6161b = j11;
        this.f6162c = rVar;
        this.f6163d = qdVar;
        this.f6164e = aVar;
    }
}
