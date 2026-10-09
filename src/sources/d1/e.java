package d1;

import z2.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p2 f22890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f22891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f22892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z1.r f22893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f22894e;

    public e(p2 p2Var, long j11, boolean z11, z1.r rVar, l lVar) {
        this.f22890a = p2Var;
        this.f22891b = j11;
        this.f22892c = z11;
        this.f22893d = rVar;
        this.f22894e = lVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            l1.t.a(z2.g1.f58557s.a(this.f22890a), t1.e.d(1260045569, new d(this.f22891b, this.f22892c, this.f22893d, this.f22894e), sVar), sVar, 56);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }
}
