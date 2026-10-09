package mt;

import com.yalantis.ucrop.view.CropImageView;
import h1.i9;
import rt.le;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ le f41291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f41292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f41293d;

    public /* synthetic */ c0(le leVar, fz.a aVar, fz.c cVar, int i11) {
        this.f41290a = i11;
        this.f41291b = leVar;
        this.f41292c = aVar;
        this.f41293d = cVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41290a) {
            case 0:
                ((Integer) obj2).getClass();
                f0.c(this.f41291b, this.f41292c, this.f41293d, (l1.n) obj, l1.t.M(1));
                break;
            case 1:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i9.a(j0.c.C(j0.e2.e(z1.o.f58481a, 1.0f), 12, CropImageView.DEFAULT_ASPECT_RATIO, 2), r0.f.d(20), ((h1.s1) sVar.j(h1.v1.f31180a)).f31033p, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(1100529298, new c0(this.f41291b, this.f41292c, this.f41293d, 3), sVar), sVar, 12582918, 120);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 2:
                ((Integer) obj2).getClass();
                g.J(this.f41291b, this.f41292c, this.f41293d, (l1.n) obj, l1.t.M(433));
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z1.r rVarE = j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                    int iHashCode = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL = sVar2.l();
                    z1.r rVarC = z1.a.c(sVar2, rVarE);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar2);
                    f0.c(this.f41291b, this.f41292c, this.f41293d, sVar2, 0);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ c0(le leVar, fz.a aVar, fz.c cVar, int i11, int i12) {
        this.f41290a = i12;
        this.f41291b = leVar;
        this.f41292c = aVar;
        this.f41293d = cVar;
    }
}
