package xn;

import com.lingo.lingoskill.ukrskill.ui.learn.UKRSyllableIntroductionActivity;
import com.lingodeer.R;
import fr.j3;
import g2.v0;
import h1.ua;
import j0.e2;
import j0.i;
import j0.t;
import j0.u;
import j0.v;
import j3.p0;
import j3.y0;
import java.util.Iterator;
import java.util.List;
import l1.m;
import l1.n;
import l1.q1;
import l1.s;
import n3.p;
import oz.q;
import qy.b0;
import u3.l;
import y2.j;
import y2.k;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f56126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f56127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f56128d;

    public /* synthetic */ d(fz.c cVar, List list, List list2, int i11) {
        this.f56125a = i11;
        this.f56126b = cVar;
        this.f56127c = list;
        this.f56128d = list2;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        s sVar;
        long j11;
        s sVar2;
        long jK;
        int i11 = this.f56125a;
        int i12 = 2;
        l1.g gVar = m.f39353a;
        o oVar = o.f58481a;
        int i13 = 1;
        List list = this.f56128d;
        List list2 = this.f56127c;
        fz.c cVar = this.f56126b;
        Throwable th2 = null;
        switch (i11) {
            case 0:
                v Card = (v) obj;
                n nVar = (n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                s sVar3 = (s) nVar;
                if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    r rVarD = e2.d(oVar, 1.0f);
                    boolean zF = sVar3.f(cVar) | sVar3.h(list2);
                    Object objQ = sVar3.Q();
                    if (zF || objQ == gVar) {
                        objQ = new dl.m(3, cVar, list2);
                        sVar3.o0(objQ);
                    }
                    r rVarO = d0.n.o(rVarD, false, null, (fz.a) objQ, 15);
                    u uVarA = t.a(i.f35310h, z1.c.P, sVar3, 54);
                    int iHashCode = Long.hashCode(sVar3.T);
                    q1 q1VarL = sVar3.l();
                    r rVarC = z1.a.c(sVar3, rVarO);
                    k.J.getClass();
                    y2.i iVar = j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(j.f56917f, uVarA, sVar3);
                    l1.t.J(j.f56916e, q1VarL, sVar3);
                    y2.h hVar = j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
                    }
                    Iterator itO = com.google.android.material.datepicker.d.o(sVar3, rVarC, j.f56915d, -1813424489, list2);
                    int i14 = 0;
                    while (itO.hasNext()) {
                        Object next = itO.next();
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            Throwable th3 = th2;
                            ns.o.V();
                            throw th3;
                        }
                        String str = (String) next;
                        if (i14 < i12) {
                            sVar3.d0(1143689685);
                            sVar3.d0(1560915347);
                            j3.e eVar = new j3.e();
                            eVar.d(str);
                            int iI0 = q.I0(str, "/", 0, false, 6);
                            if (iI0 != -1) {
                                sVar3.d0(112534395);
                                eVar.a(new p0(se.i.k(sVar3, R.color.second_black), j3.A(12), (n3.s) null, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (l) null, (v0) null, 65532), iI0, str.length());
                            } else {
                                sVar3.d0(51184930);
                            }
                            sVar3.p(false);
                            if (i14 == 0) {
                                sVar3.d0(112999085);
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    int iIntValue2 = ((Number) it.next()).intValue();
                                    eVar.a(new p0(se.i.k(sVar3, R.color.colorAccent), 0L, (n3.s) null, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (l) null, (v0) null, 65534), iIntValue2, iIntValue2 + 1);
                                }
                            } else {
                                sVar3.d0(51184930);
                            }
                            sVar3.p(false);
                            j3.h hVarJ = eVar.j();
                            sVar3.p(false);
                            y0 y0Var = (y0) sVar3.j(ua.f31167a);
                            if (i14 == 1) {
                                sVar3.d0(1560952833);
                                long jK2 = se.i.k(sVar3, R.color.second_black);
                                sVar3.p(false);
                                j11 = jK2;
                            } else {
                                sVar3.d0(1560954368);
                                long jK3 = se.i.k(sVar3, R.color.primary_black);
                                sVar3.p(false);
                                j11 = jK3;
                            }
                            s sVar4 = sVar3;
                            ua.c(hVarJ, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, y0.a(y0Var, j11, i14 == 0 ? j3.A(18) : j3.A(12), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar4, 0, 0, 131070);
                            sVar = sVar4;
                        } else {
                            sVar = sVar3;
                            sVar.d0(1082546153);
                        }
                        sVar.p(false);
                        sVar3 = sVar;
                        i14 = i15;
                        th2 = th2;
                        i12 = 2;
                    }
                    s sVar5 = sVar3;
                    sVar5.p(false);
                    sVar5.p(true);
                } else {
                    sVar3.W();
                }
                return b0.f48488a;
            default:
                v Card2 = (v) obj;
                n nVar2 = (n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i16 = UKRSyllableIntroductionActivity.H;
                kotlin.jvm.internal.m.f(Card2, "$this$Card");
                s sVar6 = (s) nVar2;
                if (sVar6.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    r rVarD2 = e2.d(oVar, 1.0f);
                    boolean zF2 = sVar6.f(cVar) | sVar6.h(list2);
                    Object objQ2 = sVar6.Q();
                    if (zF2 || objQ2 == gVar) {
                        objQ2 = new dl.m(4, cVar, list2);
                        sVar6.o0(objQ2);
                    }
                    r rVarO2 = d0.n.o(rVarD2, false, null, (fz.a) objQ2, 15);
                    u uVarA2 = t.a(i.f35310h, z1.c.P, sVar6, 54);
                    int iHashCode2 = Long.hashCode(sVar6.T);
                    q1 q1VarL2 = sVar6.l();
                    r rVarC2 = z1.a.c(sVar6, rVarO2);
                    k.J.getClass();
                    y2.i iVar2 = j.f56913b;
                    sVar6.h0();
                    if (sVar6.S) {
                        sVar6.k(iVar2);
                    } else {
                        sVar6.r0();
                    }
                    l1.t.J(j.f56917f, uVarA2, sVar6);
                    l1.t.J(j.f56916e, q1VarL2, sVar6);
                    y2.h hVar2 = j.f56918g;
                    if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar6, iHashCode2, hVar2);
                    }
                    Iterator itO2 = com.google.android.material.datepicker.d.o(sVar6, rVarC2, j.f56915d, -102280488, list2);
                    int i17 = 0;
                    while (itO2.hasNext()) {
                        Object next2 = itO2.next();
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        String str2 = (String) next2;
                        if (i17 < 2) {
                            sVar6.d0(2051065404);
                            sVar6.d0(2144375024);
                            j3.e eVar2 = new j3.e();
                            eVar2.d(str2);
                            int iI1 = q.I0(str2, "/", 0, false, 6);
                            if (iI1 != -1) {
                                sVar6.d0(106639154);
                                eVar2.a(new p0(se.i.k(sVar6, R.color.second_black), j3.A(12), (n3.s) null, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (l) null, (v0) null, 65532), iI1, str2.length());
                            } else {
                                sVar6.d0(80634649);
                            }
                            sVar6.p(false);
                            if (i17 == 0) {
                                sVar6.d0(107139556);
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    int iIntValue4 = ((Number) it2.next()).intValue();
                                    eVar2.a(new p0(se.i.k(sVar6, R.color.colorAccent), 0L, (n3.s) null, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (l) null, (v0) null, 65534), iIntValue4, iIntValue4 + 1);
                                }
                            } else {
                                sVar6.d0(80634649);
                            }
                            sVar6.p(false);
                            j3.h hVarJ2 = eVar2.j();
                            sVar6.p(false);
                            y0 y0Var2 = (y0) sVar6.j(ua.f31167a);
                            if (i17 == i13) {
                                sVar6.d0(2144416138);
                                jK = se.i.k(sVar6, R.color.second_black);
                            } else {
                                sVar6.d0(2144417681);
                                jK = se.i.k(sVar6, R.color.primary_black);
                            }
                            sVar6.p(false);
                            s sVar7 = sVar6;
                            ua.c(hVarJ2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, y0.a(y0Var2, jK, i17 == 0 ? j3.A(18) : j3.A(12), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar7, 0, 0, 131070);
                            sVar2 = sVar7;
                        } else {
                            sVar2 = sVar6;
                            sVar2.d0(2025282208);
                        }
                        sVar2.p(false);
                        sVar6 = sVar2;
                        i17 = i18;
                        i13 = 1;
                    }
                    s sVar8 = sVar6;
                    sVar8.p(false);
                    sVar8.p(true);
                } else {
                    sVar6.W();
                }
                return b0.f48488a;
        }
    }
}
