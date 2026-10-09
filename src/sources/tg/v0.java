package tg;

import fr.j3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l1.x1;
import mt.k4;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j3.y0 f52385a = new j3.y0(0, 0, n3.s.L, null, 0, 0, 0, 16777211);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f52386b = j3.A(8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f52387c = g2.x.f28622i;

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, java.util.List] */
    public static final void a(i0 i0Var, z1.r rVar, fz.c cVar, fz.c bodyRows, l1.n nVar, int i11) {
        int i12;
        Object next;
        int i13;
        z1.r rVar2;
        i0 i0Var2 = i0Var;
        kotlin.jvm.internal.m.f(i0Var2, "<this>");
        kotlin.jvm.internal.m.f(bodyRows, "bodyRows");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-750323390);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(i0Var2) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i14 = i12 | 48;
        if ((i11 & 384) == 0) {
            i14 |= sVar.h(cVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i14 |= sVar.h(bodyRows) ? 2048 : 1024;
        }
        if ((i14 & 1171) == 1170 && sVar.F()) {
            sVar.W();
            rVar2 = rVar;
        } else {
            y0 y0Var = k0.c(k0.b(i0Var2, sVar)).f52304f;
            kotlin.jvm.internal.m.c(y0Var);
            long jC = h0.c(i0Var2, sVar);
            sVar.d0(1636511210);
            boolean z11 = (i14 & 896) == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                if (cVar != null) {
                    o0 o0Var = new o0();
                    cVar.invoke(o0Var);
                    objQ = o0Var.f52331a;
                } else {
                    objQ = null;
                }
                sVar.o0(objQ);
            }
            x0 x0Var = (x0) objQ;
            sVar.p(false);
            sVar.d0(1636514279);
            boolean z12 = (i14 & 7168) == 2048;
            Object objQ2 = sVar.Q();
            Object obj = objQ2;
            if (z12 || objQ2 == gVar) {
                r0 r0Var = new r0();
                bodyRows.invoke(r0Var);
                ArrayList arrayList = r0Var.f52357a;
                ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    arrayList2.add(((o0) obj2).f52331a);
                }
                sVar.o0(arrayList2);
                obj = arrayList2;
            }
            List list = (List) obj;
            sVar.p(false);
            sVar.d0(1636517410);
            boolean zF = sVar.f(x0Var) | sVar.f(list);
            Object objQ3 = sVar.Q();
            if (zF || objQ3 == gVar) {
                int size2 = x0Var != null ? x0Var.f52394a.size() : 0;
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int size3 = ((x0) next).f52394a.size();
                        while (true) {
                            Object next2 = it.next();
                            i13 = i14;
                            int size4 = ((x0) next2).f52394a.size();
                            if (size3 < size4) {
                                size3 = size4;
                                next = next2;
                            }
                            if (!it.hasNext()) {
                                break;
                            }
                            i0Var2 = i0Var;
                            i14 = i13;
                        }
                    } else {
                        i13 = i14;
                    }
                } else {
                    i13 = i14;
                    next = null;
                }
                x0 x0Var2 = (x0) next;
                objQ3 = Integer.valueOf(Math.max(size2, x0Var2 != null ? x0Var2.f52394a.size() : 0));
                sVar.o0(objQ3);
            } else {
                i13 = i14;
            }
            int iIntValue = ((Number) objQ3).intValue();
            sVar.p(false);
            j3.y0 y0VarD = h0.d(i0Var2, sVar).d(y0Var.f52397a);
            v3.c cVar2 = (v3.c) sVar.j(g1.f58547h);
            v3.o oVar = y0Var.f52398b;
            kotlin.jvm.internal.m.c(oVar);
            float fW = cVar2.w(oVar.f53502a);
            z1.o oVar2 = z1.o.f58481a;
            z1.r rVarA = j0.c.A(d2.h.c(oVar2), fW);
            sVar.d0(1636530935);
            boolean zF2 = sVar.f(x0Var) | sVar.f(list) | sVar.f(rVarA);
            Object objQ4 = sVar.Q();
            if (zF2 || objQ4 == gVar) {
                sy.c cVarO = ns.o.o();
                if (x0Var != null) {
                    ?? r11 = x0Var.f52394a;
                    ArrayList arrayList3 = new ArrayList(ry.n.W(r11, 10));
                    Iterator it2 = r11.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(new t1.d(new u0(i0Var2, y0VarD, rVarA, (fz.f) it2.next()), true, -1928061582));
                        i0Var2 = i0Var;
                        y0VarD = y0VarD;
                    }
                    cVarO.add(arrayList3);
                }
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    ?? r9 = ((x0) it3.next()).f52394a;
                    ArrayList arrayList4 = new ArrayList(ry.n.W(r9, 10));
                    Iterator it4 = r9.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(new t1.d(new t0(rVarA, (fz.f) it4.next(), 1), true, -978043317));
                    }
                    cVarO.add(arrayList4);
                }
                objQ4 = ns.o.e(cVarO);
                sVar.o0(objQ4);
            }
            List list2 = (List) objQ4;
            sVar.p(false);
            Float f5 = y0Var.f52400d;
            kotlin.jvm.internal.m.c(f5);
            float fFloatValue = f5.floatValue();
            sVar.d0(1636566517);
            boolean zF3 = sVar.f(y0Var) | sVar.e(jC);
            Object objQ5 = sVar.Q();
            if (zF3 || objQ5 == gVar) {
                objQ5 = new k4(y0Var, jC, 6);
                sVar.o0(objQ5);
            }
            sVar.p(false);
            v.f(iIntValue, list2, (fz.c) objQ5, fFloatValue, oVar2, sVar, (i13 << 9) & 57344);
            rVar2 = oVar2;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new cs.a(i0Var, rVar2, cVar, bodyRows, i11, 17);
        }
    }
}
