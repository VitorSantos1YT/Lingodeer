package in;

import androidx.drawerlayout.widget.ktFt.FpIL;
import com.lingo.lingoskill.idnskill.ui.learn.IDNSyllableIntroductionActivity;
import com.lingo.lingoskill.malskill.ui.learn.MALSyllableIntroductionActivity;
import com.lingo.lingoskill.turskill.ui.learn.TURSyllableIntroductionActivity;
import com.lingodeer.R;
import fr.j3;
import h1.ua;
import j0.e2;
import j0.r;
import j0.t;
import j0.u;
import j0.v;
import j3.y0;
import l1.m;
import l1.n;
import l1.q1;
import l1.s;
import qy.b0;
import w2.q0;
import y2.j;
import y2.k;
import z1.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f34470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34471c;

    public /* synthetic */ d(fz.c cVar, String str, int i11) {
        this.f34469a = i11;
        this.f34470b = cVar;
        this.f34471c = str;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f34469a;
        r rVar = r.f35391a;
        b0 b0Var = b0.f48488a;
        l1.g gVar = m.f39353a;
        o oVar = o.f58481a;
        String str = FpIL.mgvLe;
        fz.c cVar = this.f34470b;
        int i12 = 0;
        switch (i11) {
            case 0:
                n nVar = (n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i13 = MALSyllableIntroductionActivity.Q;
                kotlin.jvm.internal.m.f((v) obj, str);
                s sVar = (s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    sVar.W();
                } else {
                    z1.r rVarD = e2.d(oVar, 1.0f);
                    boolean zF = sVar.f(cVar);
                    String str2 = this.f34471c;
                    boolean zF2 = zF | sVar.f(str2);
                    Object objQ = sVar.Q();
                    if (zF2 || objQ == gVar) {
                        objQ = new h(cVar, str2, i12);
                        sVar.o0(objQ);
                    }
                    z1.r rVarO = d0.n.o(rVarD, false, null, (fz.a) objQ, 15);
                    u uVarA = t.a(j0.i.f35310h, z1.c.P, sVar, 54);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarO);
                    k.J.getClass();
                    y2.i iVar = j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(j.f56917f, uVarA, sVar);
                    l1.t.J(j.f56916e, q1VarL, sVar);
                    y2.h hVar = j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(j.f56915d, rVarC, sVar);
                    ua.b(str2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), se.i.k(sVar, R.color.primary_black), j3.A(18), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar, 0, 0, 65534);
                    sVar.p(true);
                }
                break;
            case 1:
                n nVar2 = (n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i14 = IDNSyllableIntroductionActivity.P;
                kotlin.jvm.internal.m.f((v) obj, str);
                s sVar2 = (s) nVar2;
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    sVar2.W();
                } else {
                    z1.r rVarD2 = e2.d(oVar, 1.0f);
                    boolean zF3 = sVar2.f(cVar);
                    String str3 = this.f34471c;
                    boolean zF4 = zF3 | sVar2.f(str3);
                    Object objQ2 = sVar2.Q();
                    if (zF4 || objQ2 == gVar) {
                        objQ2 = new h(cVar, str3, 20);
                        sVar2.o0(objQ2);
                    }
                    z1.r rVarO2 = d0.n.o(rVarD2, false, null, (fz.a) objQ2, 15);
                    u uVarA2 = t.a(j0.i.f35310h, z1.c.P, sVar2, 54);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    q1 q1VarL2 = sVar2.l();
                    z1.r rVarC2 = z1.a.c(sVar2, rVarO2);
                    k.J.getClass();
                    y2.i iVar2 = j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar2);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(j.f56917f, uVarA2, sVar2);
                    l1.t.J(j.f56916e, q1VarL2, sVar2);
                    y2.h hVar2 = j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
                    }
                    l1.t.J(j.f56915d, rVarC2, sVar2);
                    ua.b(str3, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), se.i.k(sVar2, R.color.primary_black), j3.A(18), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar2, 0, 0, 65534);
                    sVar2.p(true);
                }
                break;
            case 2:
                n nVar3 = (n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i15 = TURSyllableIntroductionActivity.H;
                kotlin.jvm.internal.m.f((v) obj, str);
                s sVar3 = (s) nVar3;
                if (!sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    sVar3.W();
                } else {
                    z1.r rVarD3 = e2.d(oVar, 1.0f);
                    boolean zF5 = sVar3.f(cVar);
                    String str4 = this.f34471c;
                    boolean zF6 = zF5 | sVar3.f(str4);
                    Object objQ3 = sVar3.Q();
                    if (zF6 || objQ3 == gVar) {
                        objQ3 = new h(cVar, str4, 21);
                        sVar3.o0(objQ3);
                    }
                    z1.r rVarO3 = d0.n.o(rVarD3, false, null, (fz.a) objQ3, 15);
                    q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode3 = Long.hashCode(sVar3.T);
                    q1 q1VarL3 = sVar3.l();
                    z1.r rVarC3 = z1.a.c(sVar3, rVarO3);
                    k.J.getClass();
                    y2.i iVar3 = j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar3);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(j.f56917f, q0VarD, sVar3);
                    l1.t.J(j.f56916e, q1VarL3, sVar3);
                    y2.h hVar3 = j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar3);
                    }
                    l1.t.J(j.f56915d, rVarC3, sVar3);
                    ua.b(str4, rVar.a(oVar, z1.c.f58467e), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar3.j(ua.f31167a), se.i.k(sVar3, R.color.primary_black), j3.A(18), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar3, 0, 0, 65532);
                    sVar3.p(true);
                }
                break;
            case 3:
                n nVar4 = (n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i16 = TURSyllableIntroductionActivity.H;
                kotlin.jvm.internal.m.f((v) obj, str);
                s sVar4 = (s) nVar4;
                if (!sVar4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    sVar4.W();
                } else {
                    z1.r rVarD4 = e2.d(oVar, 1.0f);
                    boolean zF7 = sVar4.f(cVar);
                    String str5 = this.f34471c;
                    boolean zF8 = zF7 | sVar4.f(str5);
                    Object objQ4 = sVar4.Q();
                    if (zF8 || objQ4 == gVar) {
                        objQ4 = new h(cVar, str5, 22);
                        sVar4.o0(objQ4);
                    }
                    z1.r rVarO4 = d0.n.o(rVarD4, false, null, (fz.a) objQ4, 15);
                    q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
                    int iHashCode4 = Long.hashCode(sVar4.T);
                    q1 q1VarL4 = sVar4.l();
                    z1.r rVarC4 = z1.a.c(sVar4, rVarO4);
                    k.J.getClass();
                    y2.i iVar4 = j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar4);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(j.f56917f, q0VarD2, sVar4);
                    l1.t.J(j.f56916e, q1VarL4, sVar4);
                    y2.h hVar4 = j.f56918g;
                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar4);
                    }
                    l1.t.J(j.f56915d, rVarC4, sVar4);
                    ua.b(str5, rVar.a(oVar, z1.c.f58467e), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(ua.f31167a), se.i.k(sVar4, R.color.primary_black), j3.A(18), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar4, 0, 0, 65532);
                    sVar4.p(true);
                }
                break;
            case 4:
                n nVar5 = (n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f((v) obj, str);
                s sVar5 = (s) nVar5;
                if (!sVar5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    sVar5.W();
                } else {
                    z1.r rVarD5 = e2.d(oVar, 1.0f);
                    boolean zF9 = sVar5.f(cVar);
                    String str6 = this.f34471c;
                    boolean zF10 = zF9 | sVar5.f(str6);
                    Object objQ5 = sVar5.Q();
                    if (zF10 || objQ5 == gVar) {
                        objQ5 = new h(cVar, str6, 27);
                        sVar5.o0(objQ5);
                    }
                    z1.r rVarO5 = d0.n.o(rVarD5, false, null, (fz.a) objQ5, 15);
                    u uVarA3 = t.a(j0.i.f35310h, z1.c.P, sVar5, 54);
                    int iHashCode5 = Long.hashCode(sVar5.T);
                    q1 q1VarL5 = sVar5.l();
                    z1.r rVarC5 = z1.a.c(sVar5, rVarO5);
                    k.J.getClass();
                    y2.i iVar5 = j.f56913b;
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar5);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(j.f56917f, uVarA3, sVar5);
                    l1.t.J(j.f56916e, q1VarL5, sVar5);
                    y2.h hVar5 = j.f56918g;
                    if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode5))) {
                        defpackage.e.A(iHashCode5, sVar5, iHashCode5, hVar5);
                    }
                    l1.t.J(j.f56915d, rVarC5, sVar5);
                    ua.b(str6, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar5.j(ua.f31167a), se.i.k(sVar5, R.color.primary_black), j3.A(18), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar5, 0, 0, 65534);
                    sVar5.p(true);
                }
                break;
            default:
                n nVar6 = (n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f((v) obj, str);
                s sVar6 = (s) nVar6;
                if (!sVar6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    sVar6.W();
                } else {
                    z1.r rVarD6 = e2.d(oVar, 1.0f);
                    boolean zF11 = sVar6.f(cVar);
                    String str7 = this.f34471c;
                    boolean zF12 = zF11 | sVar6.f(str7);
                    Object objQ6 = sVar6.Q();
                    if (zF12 || objQ6 == gVar) {
                        objQ6 = new h(cVar, str7, 23);
                        sVar6.o0(objQ6);
                    }
                    z1.r rVarO6 = d0.n.o(rVarD6, false, null, (fz.a) objQ6, 15);
                    u uVarA4 = t.a(j0.i.f35310h, z1.c.P, sVar6, 54);
                    int iHashCode6 = Long.hashCode(sVar6.T);
                    q1 q1VarL6 = sVar6.l();
                    z1.r rVarC6 = z1.a.c(sVar6, rVarO6);
                    k.J.getClass();
                    y2.i iVar6 = j.f56913b;
                    sVar6.h0();
                    if (sVar6.S) {
                        sVar6.k(iVar6);
                    } else {
                        sVar6.r0();
                    }
                    l1.t.J(j.f56917f, uVarA4, sVar6);
                    l1.t.J(j.f56916e, q1VarL6, sVar6);
                    y2.h hVar6 = j.f56918g;
                    if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode6))) {
                        defpackage.e.A(iHashCode6, sVar6, iHashCode6, hVar6);
                    }
                    l1.t.J(j.f56915d, rVarC6, sVar6);
                    ua.b(str7, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar6.j(ua.f31167a), se.i.k(sVar6, R.color.primary_black), j3.A(18), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar6, 0, 0, 65534);
                    sVar6.p(true);
                }
                break;
        }
        return b0Var;
    }
}
