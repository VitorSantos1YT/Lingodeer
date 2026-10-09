package bt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q3 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f5878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f5879c;

    public /* synthetic */ q3(int i11, int i12, fz.c cVar, List list) {
        this.f5877a = i12;
        this.f5878b = list;
        this.f5879c = cVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5877a) {
            case 0:
                ((Integer) obj2).getClass();
                b.h(this.f5878b, this.f5879c, (l1.n) obj, l1.t.M(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                iv.z0.e(this.f5878b, this.f5879c, (l1.n) obj, l1.t.M(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                iv.z0.y(this.f5878b, this.f5879c, (l1.n) obj, l1.t.M(1));
                break;
            case 3:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    km.b1.w((km.z1) this.f5878b.get(1), this.f5879c, sVar, 0);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 4:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    km.b1.w((km.z1) this.f5878b.get(3), this.f5879c, sVar2, 0);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            case 5:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    km.b1.w((km.z1) this.f5878b.get(5), this.f5879c, sVar3, 0);
                } else {
                    sVar3.W();
                }
                return qy.b0.f48488a;
            case 6:
                l1.n nVar4 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    j0.u uVarA = j0.t.a(j0.i.g(2), z1.c.O, sVar4, 6);
                    int iHashCode = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL = sVar4.l();
                    z1.r rVarC = z1.a.c(sVar4, z1.o.f58481a);
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
                    List list = this.f5878b;
                    km.z1 z1Var = (km.z1) list.get(7);
                    fz.c cVar = this.f5879c;
                    km.b1.w(z1Var, cVar, sVar4, 0);
                    km.b1.w((km.z1) list.get(8), cVar, sVar4, 0);
                    sVar4.p(true);
                } else {
                    sVar4.W();
                }
                return qy.b0.f48488a;
            case 7:
                l1.n nVar5 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    m0.b bVar = new m0.b(3);
                    j0.g gVarG = j0.i.g(19);
                    float f5 = 24;
                    float f11 = 16;
                    j0.v1 v1Var = new j0.v1(f11, f5, f11, f5);
                    List list2 = this.f5878b;
                    boolean zH = sVar5.h(list2);
                    fz.c cVar2 = this.f5879c;
                    boolean zF = zH | sVar5.f(cVar2);
                    Object objQ = sVar5.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new pr.a(0, cVar2, list2);
                        sVar5.o0(objQ);
                    }
                    md.a.a(bVar, null, null, v1Var, gVarG, null, null, false, null, (fz.c) objQ, sVar5, 196608, 982);
                } else {
                    sVar5.W();
                }
                return qy.b0.f48488a;
            default:
                ((Integer) obj2).getClass();
                xu.a0.g(this.f5878b, this.f5879c, (l1.n) obj, l1.t.M(1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ q3(int i11, fz.c cVar, List list) {
        this.f5877a = i11;
        this.f5878b = list;
        this.f5879c = cVar;
    }
}
