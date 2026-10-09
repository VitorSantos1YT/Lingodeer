package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5643a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1.d f5644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht.o f5646d;

    public /* synthetic */ l0(String str, ht.o oVar, t1.d dVar) {
        this.f5645c = str;
        this.f5646d = oVar;
        this.f5644b = dVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f5643a;
        l1.n nVar = (l1.n) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
                    int iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, z1.o.f58481a);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    dt.a0.q(this.f5645c, this.f5646d.f33764l, sVar, 0, 0);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.c.g(sVar, new j0.i1(1.0f, true));
                    this.f5644b.invoke(sVar, 0);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            default:
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j0.a2 a2VarA2 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar2, 48);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL2 = sVar2.l();
                    z1.r rVarC2 = z1.a.c(sVar2, z1.o.f58481a);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar2);
                    } else {
                        sVar2.r0();
                    }
                    y2.h hVar2 = y2.j.f56917f;
                    l1.t.J(hVar2, a2VarA2, sVar2);
                    y2.h hVar3 = y2.j.f56916e;
                    l1.t.J(hVar3, q1VarL2, sVar2);
                    y2.h hVar4 = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar4);
                    }
                    y2.h hVar5 = y2.j.f56915d;
                    l1.t.J(hVar5, rVarC2, sVar2);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.i1 i1Var = new j0.i1(1.0f, true);
                    w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode3 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL3 = sVar2.l();
                    z1.r rVarC3 = z1.a.c(sVar2, i1Var);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar2);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(hVar2, q0VarD, sVar2);
                    l1.t.J(hVar3, q1VarL3, sVar2);
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar4);
                    }
                    l1.t.J(hVar5, rVarC3, sVar2);
                    dt.a0.q(this.f5645c, this.f5646d.f33764l, sVar2, 0, 0);
                    sVar2.p(true);
                    this.f5644b.invoke(sVar2, 0);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ l0(t1.d dVar, String str, ht.o oVar) {
        this.f5644b = dVar;
        this.f5645c = str;
        this.f5646d = oVar;
    }
}
