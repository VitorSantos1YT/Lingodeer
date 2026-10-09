package s0;

import java.util.ArrayList;
import java.util.List;
import l1.x1;
import qp.n2;
import rt.v7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1.k1 f51143a = l1.t.B(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j3.h f51144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x1.p f51145c;

    public q1(j3.h hVar) {
        v7 v7Var = new v7(24);
        hVar.getClass();
        j3.e eVar = new j3.e(hVar);
        ArrayList arrayList = eVar.f35685c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list = (List) v7Var.invoke(((j3.d) arrayList.get(i11)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                j3.f fVar = (j3.f) list.get(i12);
                arrayList3.add(new j3.d(fVar.f35690b, fVar.f35691c, fVar.f35689a, fVar.f35692d));
            }
            ry.m.d0(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.f51144b = eVar.j();
        this.f51145c = new x1.p();
    }

    public static j3.f c(j3.f fVar, j3.u0 u0Var) {
        j3.x xVar = u0Var.f35798b;
        int iC = xVar.c(xVar.f35818f - 1, false);
        if (fVar.f35690b < iC) {
            return j3.f.a(fVar, null, Math.min(fVar.f35691c, iC), 11);
        }
        return null;
    }

    public final void a(l1.n nVar, int i11) {
        boolean z11;
        Object objF;
        boolean z12;
        Object obj;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1154651354);
        char c11 = 2;
        int i12 = (sVar.h(this) ? 4 : 2) | i11;
        boolean z13 = false;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            z2.r0 r0Var = (z2.r0) sVar.j(z2.g1.f58556r);
            j3.h hVar = this.f51144b;
            List listA = hVar.a(hVar.f35700b.length());
            int size = listA.size();
            int i13 = 0;
            while (i13 < size) {
                j3.f fVar = (j3.f) listA.get(i13);
                int i14 = fVar.f35690b;
                Object obj2 = fVar.f35689a;
                if (i14 != fVar.f35691c) {
                    sVar.d0(725478935);
                    Object objQ = sVar.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (objQ == gVar) {
                        objF = objQ;
                        objF = com.google.android.material.datepicker.d.f(sVar);
                    }
                    objF = objQ;
                    h0.i iVar = (h0.i) objF;
                    z1.r rVarQ = g2.f0.q(z1.o.f58481a, new n2(16, this, fVar));
                    Object objQ2 = sVar.Q();
                    if (objQ2 == gVar) {
                        z12 = true;
                        v7 v7Var = new v7(25);
                        sVar.o0(v7Var);
                        obj = v7Var;
                    } else {
                        z12 = true;
                        obj = objQ2;
                    }
                    z1.r rVarR = d0.n.r(g3.r.b(rVarQ, z13, (fz.c) obj).i(new s1(new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(19, this, fVar))), iVar);
                    s2.q.f51338a.getClass();
                    z1.r rVarF = s2.s.f(rVarR, s2.s.f51341c);
                    boolean zH = sVar.h(this) | sVar.f(fVar) | sVar.h(r0Var);
                    Object objQ3 = sVar.Q();
                    Object obj3 = objQ3;
                    if (zH || objQ3 == gVar) {
                        pv.c cVar = new pv.c(this, fVar, r0Var);
                        sVar.o0(cVar);
                        obj3 = cVar;
                    }
                    j0.o.a(d0.n.p(rVarF, iVar, (fz.a) obj3), sVar, 0);
                    j3.w wVar = (j3.w) obj2;
                    j3.v0 v0VarB = wVar.b();
                    if (v0VarB == null || (v0VarB.f35805a == null && v0VarB.f35806b == null && v0VarB.f35807c == null && v0VarB.f35808d == null)) {
                        z11 = false;
                        sVar.d0(728331710);
                        sVar.p(false);
                    } else {
                        sVar.d0(726303039);
                        Object objQ4 = sVar.Q();
                        Object obj4 = objQ4;
                        if (objQ4 == gVar) {
                            t0 t0Var = new t0(iVar);
                            sVar.o0(t0Var);
                            obj4 = t0Var;
                        }
                        t0 t0Var2 = (t0) obj4;
                        Object objQ5 = sVar.Q();
                        boolean z14 = false;
                        Object obj5 = objQ5;
                        if (objQ5 == gVar) {
                            mv.f0 f0Var = new mv.f0(t0Var2, z14 ? 1 : 0, 23);
                            sVar.o0(f0Var);
                            obj5 = f0Var;
                        }
                        l1.t.f((fz.e) obj5, qy.b0.f48488a, sVar);
                        l1.h1 h1Var = t0Var2.f51195b;
                        l1.h1 h1Var2 = t0Var2.f51195b;
                        Boolean boolValueOf = Boolean.valueOf((h1Var.l() & 2) != 0 ? z12 : false);
                        Boolean boolValueOf2 = Boolean.valueOf((h1Var2.l() & 1) != 0 ? z12 : false);
                        Boolean boolValueOf3 = Boolean.valueOf((h1Var2.l() & 4) != 0 ? z12 : false);
                        j3.v0 v0VarB2 = wVar.b();
                        j3.p0 p0Var = v0VarB2 != null ? v0VarB2.f35805a : null;
                        j3.v0 v0VarB3 = wVar.b();
                        j3.p0 p0Var2 = v0VarB3 != null ? v0VarB3.f35806b : null;
                        j3.v0 v0VarB4 = wVar.b();
                        j3.p0 p0Var3 = v0VarB4 != null ? v0VarB4.f35807c : null;
                        j3.v0 v0VarB5 = wVar.b();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, p0Var, p0Var2, p0Var3, v0VarB5 != null ? v0VarB5.f35808d : null};
                        boolean zH2 = sVar.h(this) | sVar.f(fVar);
                        Object objQ6 = sVar.Q();
                        Object obj6 = objQ6;
                        if (zH2 || objQ6 == gVar) {
                            n2 n2Var = new n2(this, fVar, t0Var2);
                            sVar.o0(n2Var);
                            obj6 = n2Var;
                        }
                        b(objArr, (fz.c) obj6, sVar, (i12 << 6) & 896);
                        z11 = false;
                        sVar.p(false);
                    }
                    sVar.p(z11);
                } else {
                    z11 = z13;
                    sVar.d0(728345598);
                    sVar.p(z11);
                }
                i13++;
                z13 = z11;
                c11 = c11;
            }
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new mt.r(this, i11, 15);
        }
    }

    public final void b(Object[] objArr, fz.c cVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-2083052099);
        int i12 = (i11 & 48) == 0 ? (sVar.h(cVar) ? 32 : 16) | i11 : i11;
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(this) ? 256 : 128;
        }
        sVar.a0(-358305778, Integer.valueOf(objArr.length));
        int i13 = i12 | (sVar.d(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i13 |= sVar.h(obj) ? 4 : 0;
        }
        sVar.p(false);
        if ((i13 & 14) == 0) {
            i13 |= 2;
        }
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            com.android.billingclient.api.m mVar = new com.android.billingclient.api.m(2);
            ArrayList arrayList = mVar.f7554a;
            arrayList.add(cVar);
            mVar.h(objArr);
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zH = sVar.h(this) | ((i13 & 112) == 32);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new o(this, cVar, 1);
                sVar.o0(objQ);
            }
            l1.t.e(array, (fz.c) objQ, sVar);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new qg.d(this, objArr, cVar, i11, 1);
        }
    }
}
