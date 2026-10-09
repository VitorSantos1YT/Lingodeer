package bp;

import com.yalantis.ucrop.view.CropImageView;
import h1.i9;
import h1.k7;
import h1.w7;
import h1.y7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n1 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f4720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f4721c;

    public /* synthetic */ n1(int i11, int i12, fz.a aVar, fz.a aVar2) {
        this.f4719a = i12;
        this.f4720b = aVar;
        this.f4721c = aVar2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4719a) {
            case 0:
                ((Integer) obj2).getClass();
                g1.c(this.f4720b, this.f4721c, (l1.n) obj, l1.t.M(1));
                break;
            case 1:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ch.h.b(this.f4720b, this.f4721c, null, sVar, 0);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 2:
                ((Integer) obj2).getClass();
                ch.h.a(this.f4720b, this.f4721c, (l1.n) obj, l1.t.M(1));
                break;
            case 3:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    k7.d(null, r0.f.d(14), null, null, null, t1.e.d(830847527, new ch.e(1, this.f4720b, this.f4721c), sVar2), sVar2, 196608, 29);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            case 4:
                ((Integer) obj2).getClass();
                lt.b.c(this.f4720b, this.f4721c, (l1.n) obj, l1.t.M(49));
                break;
            case 5:
                ((Integer) obj2).getClass();
                mt.g.A(this.f4720b, this.f4721c, (l1.n) obj, l1.t.M(7));
                break;
            case 6:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    i9.a(null, ((w7) sVar3.j(y7.f31359a)).f31244d, 0L, 0L, h1.a.f29950a, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(440524981, new n1(7, this.f4720b, this.f4721c), sVar3), sVar3, 12582912, 109);
                } else {
                    sVar3.W();
                }
                return qy.b0.f48488a;
            case 7:
                l1.n nVar4 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    float f5 = 16;
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarA = j0.c.A(oVar, f5);
                    j0.u uVarA = j0.t.a(j0.i.g(f5), z1.c.O, sVar4, 6);
                    int iHashCode = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL = sVar4.l();
                    z1.r rVarC = z1.a.c(sVar4, rVarA);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar4);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar4);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar4, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar4);
                    iu.k.e(this.f4720b, j0.e2.e(oVar, 1.0f), false, 0L, null, xu.c.Q, sVar4, 196656, 28);
                    iu.k.e(this.f4721c, j0.e2.e(oVar, 1.0f), false, 0L, null, xu.c.R, sVar4, 196656, 28);
                    sVar4.p(true);
                } else {
                    sVar4.W();
                }
                return qy.b0.f48488a;
            case 8:
                ((Integer) obj2).getClass();
                xu.q1.a(this.f4720b, this.f4721c, (l1.n) obj, l1.t.M(7));
                break;
            default:
                ((Integer) obj2).getClass();
                ys.a.c(this.f4720b, this.f4721c, (l1.n) obj, l1.t.M(1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ n1(int i11, fz.a aVar, fz.a aVar2) {
        this.f4719a = i11;
        this.f4720b = aVar;
        this.f4721c = aVar2;
    }
}
