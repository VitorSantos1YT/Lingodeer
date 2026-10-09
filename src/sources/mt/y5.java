package mt;

import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y5 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42098a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rt.k6 f42099b;

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        long j11;
        l1.n nVar = (l1.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f42098a) {
            case 0:
                int iIntValue = num.intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rt.k6 k6Var = this.f42099b;
                    k2.b bVarY = se.k.y(k6Var.f49974e ? R.drawable.bookmark_starred_24px : R.drawable.bookmark_star_24px, sVar, 0);
                    z1.r rVarN = j0.e2.n(z1.o.f58481a, 20);
                    if (k6Var.f49974e) {
                        sVar.d0(-1643684751);
                        j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31017a;
                    } else {
                        sVar.d0(-1643683494);
                        j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s;
                    }
                    sVar.p(false);
                    h1.r4.b(bVarY, null, rVarN, j11, sVar, 432, 0);
                } else {
                    sVar.W();
                }
                break;
            default:
                num.getClass();
                j6.d(this.f42099b, nVar, l1.t.M(1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ y5(rt.k6 k6Var, int i11) {
        this.f42099b = k6Var;
    }
}
