package dt;

import com.lingodeer.R;
import h1.dc;
import h1.fc;
import h1.ua;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24208b;

    public /* synthetic */ t0(int i11, int i12) {
        this.f24207a = 2;
        this.f24208b = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        String strD0;
        switch (this.f24207a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL = sVar.l();
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarC = z1.a.c(sVar, oVar);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    h1.r4.b(se.k.y(this.f24208b, sVar, 0), null, j0.e2.n(oVar, 20), g2.x.c(((h1.s1) sVar.j(h1.v1.f31180a)).f31036s, 0.85f), sVar, 432, 0);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar2, this.f24208b), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 131070);
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                ku.a.b(this.f24208b, (l1.n) obj, l1.t.M(1));
                break;
            case 3:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    z1.r rVarB = j0.c.B(z1.o.f58481a, 24, 12);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar3, 48);
                    int iHashCode2 = Long.hashCode(sVar3.T);
                    l1.q1 q1VarL2 = sVar3.l();
                    z1.r rVarC2 = z1.a.c(sVar3, rVarB);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar2);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar3);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar3);
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar3);
                    ua.b(mt.b1.n(sVar3, this.f24208b), null, 0L, 0L, null, n3.s.L, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar3.j(fc.f30256a)).f30174g, sVar3, 196608, 0, 65502);
                    sVar3.p(true);
                } else {
                    sVar3.W();
                }
                break;
            case 4:
                l1.n nVar4 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    int i11 = this.f24208b;
                    if (i11 == 0) {
                        strD0 = ep.a.m(sVar4, 1519325516, R.string.today, sVar4, false);
                    } else {
                        sVar4.d0(1519394212);
                        strD0 = ub.a.d0(R.string.srs_days_chip, new Object[]{String.valueOf(i11)}, sVar4);
                        sVar4.p(false);
                    }
                    ua.b(strD0, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 0, 0, 131070);
                } else {
                    sVar4.W();
                }
                break;
            case 5:
                l1.n nVar5 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ua.b(ub.a.d0(R.string.srs_future_reviews_hide_confirm_message, new Object[]{Integer.valueOf(this.f24208b)}, sVar5), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar5, 0, 0, 131070);
                } else {
                    sVar5.W();
                }
                break;
            default:
                l1.n nVar6 = (l1.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                l1.s sVar6 = (l1.s) nVar6;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar6, 0);
                    int iHashCode3 = Long.hashCode(sVar6.T);
                    l1.q1 q1VarL3 = sVar6.l();
                    z1.r rVarC3 = z1.a.c(sVar6, z1.o.f58481a);
                    y2.k.J.getClass();
                    y2.i iVar3 = y2.j.f56913b;
                    sVar6.h0();
                    if (sVar6.S) {
                        sVar6.k(iVar3);
                    } else {
                        sVar6.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA2, sVar6);
                    l1.t.J(y2.j.f56916e, q1VarL3, sVar6);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar6, iHashCode3, hVar3);
                    }
                    l1.t.J(y2.j.f56915d, rVarC3, sVar6);
                    ua.b(oz.x.q0(ub.a.e0(sVar6, R.string.course_preferences_reset_dialog_message), "%s", tv.a.l(tv.a.n(this.f24208b), sVar6)), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar6.j(fc.f30256a)).f30178k, sVar6, 0, 0, 65534);
                    sVar6.p(true);
                } else {
                    sVar6.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ t0(int i11, int i12, byte b3) {
        this.f24207a = i12;
        this.f24208b = i11;
    }
}
