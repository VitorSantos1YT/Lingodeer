package bt;

import com.lingodeer.R;
import com.lingodeer.data.model.CourseSentence;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p1 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ht.o f5827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.e f5828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CourseSentence f5829e;

    public /* synthetic */ p1(ht.o oVar, l1.b1 b1Var, fz.e eVar, CourseSentence courseSentence) {
        this.f5825a = 2;
        this.f5827c = oVar;
        this.f5826b = b1Var;
        this.f5828d = eVar;
        this.f5829e = courseSentence;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f5825a;
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
                    y2.h hVar = y2.j.f56917f;
                    l1.t.J(hVar, a2VarA, sVar);
                    y2.h hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL, sVar);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
                    }
                    y2.h hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC, sVar);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.i1 i1Var = new j0.i1(1.0f, true);
                    w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    l1.q1 q1VarL2 = sVar.l();
                    z1.r rVarC2 = z1.a.c(sVar, i1Var);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar, q0VarD, sVar);
                    l1.t.J(hVar2, q1VarL2, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC2, sVar);
                    String strE0 = ub.a.e0(sVar, R.string.sentence_m3_hint);
                    ht.o oVar = this.f5827c;
                    dt.a0.q(strE0, oVar.f33764l, sVar, 0, 0);
                    sVar.p(true);
                    ht.l lVar = (ht.l) this.f5826b.getValue();
                    boolean z11 = !oVar.f33757e;
                    fz.e eVar = this.f5828d;
                    boolean zF = sVar.f(eVar);
                    CourseSentence courseSentence = this.f5829e;
                    boolean zH = zF | sVar.h(courseSentence);
                    Object objQ = sVar.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zH || objQ == gVar) {
                        objQ = new m0(eVar, courseSentence, 2);
                        sVar.o0(objQ);
                    }
                    fz.a aVar = (fz.a) objQ;
                    boolean zF2 = sVar.f(eVar) | sVar.h(courseSentence);
                    Object objQ2 = sVar.Q();
                    if (zF2 || objQ2 == gVar) {
                        objQ2 = new m0(eVar, courseSentence, 3);
                        sVar.o0(objQ2);
                    }
                    dt.a0.t(lVar, z11, aVar, (fz.a) objQ2, sVar, 0);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j0.a2 a2VarA2 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar2, 48);
                    int iHashCode3 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL3 = sVar2.l();
                    z1.r rVarC3 = z1.a.c(sVar2, z1.o.f58481a);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar2);
                    } else {
                        sVar2.r0();
                    }
                    y2.h hVar5 = y2.j.f56917f;
                    l1.t.J(hVar5, a2VarA2, sVar2);
                    y2.h hVar6 = y2.j.f56916e;
                    l1.t.J(hVar6, q1VarL3, sVar2);
                    y2.h hVar7 = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar7);
                    }
                    y2.h hVar8 = y2.j.f56915d;
                    l1.t.J(hVar8, rVarC3, sVar2);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.i1 i1Var2 = new j0.i1(1.0f, true);
                    w2.q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
                    int iHashCode4 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL4 = sVar2.l();
                    z1.r rVarC4 = z1.a.c(sVar2, i1Var2);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar2);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(hVar5, q0VarD2, sVar2);
                    l1.t.J(hVar6, q1VarL4, sVar2);
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar7);
                    }
                    l1.t.J(hVar8, rVarC4, sVar2);
                    String strE1 = ub.a.e0(sVar2, R.string.sentence_m3_hint);
                    ht.o oVar2 = this.f5827c;
                    dt.a0.q(strE1, oVar2.f33764l, sVar2, 0, 0);
                    sVar2.p(true);
                    ht.l lVar2 = (ht.l) this.f5826b.getValue();
                    boolean z12 = !oVar2.f33757e;
                    fz.e eVar2 = this.f5828d;
                    boolean zF3 = sVar2.f(eVar2);
                    CourseSentence courseSentence2 = this.f5829e;
                    boolean zH2 = zF3 | sVar2.h(courseSentence2);
                    Object objQ3 = sVar2.Q();
                    l1.g gVar2 = l1.m.f39353a;
                    if (zH2 || objQ3 == gVar2) {
                        objQ3 = new m0(eVar2, courseSentence2, 7);
                        sVar2.o0(objQ3);
                    }
                    fz.a aVar2 = (fz.a) objQ3;
                    boolean zF4 = sVar2.f(eVar2) | sVar2.h(courseSentence2);
                    Object objQ4 = sVar2.Q();
                    if (zF4 || objQ4 == gVar2) {
                        objQ4 = new m0(eVar2, courseSentence2, 8);
                        sVar2.o0(objQ4);
                    }
                    dt.a0.t(lVar2, z12, aVar2, (fz.a) objQ4, sVar2, 0);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                break;
            default:
                l1.s sVar3 = (l1.s) nVar;
                if (sVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j0.a2 a2VarA3 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar3, 48);
                    int iHashCode5 = Long.hashCode(sVar3.T);
                    l1.q1 q1VarL5 = sVar3.l();
                    z1.r rVarC5 = z1.a.c(sVar3, z1.o.f58481a);
                    y2.k.J.getClass();
                    y2.i iVar3 = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar3);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA3, sVar3);
                    l1.t.J(y2.j.f56916e, q1VarL5, sVar3);
                    y2.h hVar9 = y2.j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode5))) {
                        defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar9);
                    }
                    l1.t.J(y2.j.f56915d, rVarC5, sVar3);
                    dt.a0.q(ub.a.e0(sVar3, R.string.sentence_m3_hint), this.f5827c.f33764l, sVar3, 0, 0);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.c.g(sVar3, new j0.i1(1.0f, true));
                    boolean z13 = this.f5826b.getValue() instanceof ht.c;
                    long j11 = ((h1.s1) sVar3.j(h1.v1.f31180a)).f31017a;
                    fz.e eVar3 = this.f5828d;
                    boolean zF5 = sVar3.f(eVar3);
                    CourseSentence courseSentence3 = this.f5829e;
                    boolean zH3 = zF5 | sVar3.h(courseSentence3);
                    Object objQ5 = sVar3.Q();
                    if (zH3 || objQ5 == l1.m.f39353a) {
                        objQ5 = new m0(eVar3, courseSentence3, 12);
                        sVar3.o0(objQ5);
                    }
                    dt.a0.a(z13, null, j11, (fz.a) objQ5, sVar3, 0, 2);
                    sVar3.p(true);
                } else {
                    sVar3.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ p1(l1.b1 b1Var, ht.o oVar, fz.e eVar, CourseSentence courseSentence, int i11) {
        this.f5825a = i11;
        this.f5826b = b1Var;
        this.f5827c = oVar;
        this.f5828d = eVar;
        this.f5829e = courseSentence;
    }
}
