package rt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d8 {
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(boolean z11, uz.i1 i1Var, v8 v8Var, vt.n0 n0Var, vt.k0 k0Var, x8 x8Var, List list, boolean z12, xy.c cVar) {
        a8 a8Var;
        if (cVar instanceof a8) {
            a8Var = (a8) cVar;
            int i11 = a8Var.f49448c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                a8Var.f49448c = i11 - Integer.MIN_VALUE;
            } else {
                a8Var = new a8(cVar);
            }
        } else {
            a8Var = new a8(cVar);
        }
        Object obj = a8Var.f49447b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = a8Var.f49448c;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ArrayList arrayList = a8Var.f49446a;
            com.bumptech.glide.e.F(obj);
            return arrayList;
        }
        com.bumptech.glide.e.F(obj);
        ArrayList arrayList2 = new ArrayList(ry.n.W(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y8 y8Var = (y8) it.next();
            arrayList2.add(y8.a(y8Var, 0, 0, false, false, fb.g0.g(((fr.o0) n0Var).f27733a.keyLanguage, y8Var.f50692b, z12), null, 767));
        }
        if (!arrayList2.isEmpty() && !z11) {
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                if (((y8) obj2).f50699i) {
                    arrayList3.add(obj2);
                }
            }
            if (arrayList3.isEmpty()) {
                i1Var.k(u8.f50486b);
                return arrayList2;
            }
            b8 b8Var = new b8(k0Var, n0Var, x8Var, arrayList3, z12, null);
            a8Var.f49446a = arrayList2;
            a8Var.f49448c = 1;
            if (ef.e.C(i1Var, v8Var, b8Var, a8Var) == aVar) {
                return aVar;
            }
        } else if (arrayList2.isEmpty() && !((u8) i1Var.getValue()).f50487a.keySet().isEmpty()) {
            i1Var.k(u8.f50486b);
        }
        return arrayList2;
    }

    public static final o8 b(n8 input) {
        boolean z11;
        List list;
        kotlin.jvm.internal.m.f(input, "input");
        List listU0 = input.f50135a;
        if (listU0 != null && listU0.isEmpty()) {
            z11 = false;
            break;
        }
        Iterator it = listU0.iterator();
        while (true) {
            if (!it.hasNext()) {
                z11 = false;
                break;
            }
            if (((k6) it.next()).f49972c.getLastStudyStatus() == wt.o.WRONG) {
                z11 = true;
                break;
            }
        }
        sy.k kVar = new sy.k();
        p8 p8Var = p8.ALL;
        kVar.add(p8Var);
        if (z11) {
            kVar.add(p8.WEAK_ONLY);
        }
        if (listU0.size() > 20) {
            kVar.add(p8.SHUFFLE_20);
            kVar.add(p8.SHUFFLE_40);
        }
        sy.k kVarF = qx.b.f(kVar);
        p8 p8Var2 = input.f50138d;
        if (!kVarF.f51957a.containsKey(p8Var2)) {
            p8Var2 = null;
        }
        p8 p8Var3 = p8Var2 == null ? p8Var : p8Var2;
        List list2 = input.f50139e;
        List list3 = input.f50140f;
        int i11 = w7.f50577a[p8Var3.ordinal()];
        if (i11 == 1) {
            list = listU0;
        } else if (i11 == 2) {
            list = list2;
        } else if (i11 == 3) {
            list = list3;
        } else {
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : listU0) {
                if (((k6) obj).f49972c.getLastStudyStatus() == wt.o.WRONG) {
                    arrayList.add(obj);
                }
            }
            listU0 = ry.m.U0(arrayList, 40);
            list = listU0;
        }
        boolean zIsEmpty = ot.l1.d(nz.n.Z(nz.n.W(nz.n.X(ry.m.g0(list), new v7(0)), new v7(1))), new v7(2)).isEmpty();
        List list4 = input.f50136b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj2 : list4) {
            if (((r8) obj2) != r8.WORD_MATCH || !zIsEmpty) {
                linkedHashSet.add(obj2);
            }
        }
        r8 r8Var = input.f50137c;
        r8 r8Var2 = linkedHashSet.contains(r8Var) ? r8Var : null;
        if (r8Var2 == null && (r8Var2 = (r8) ry.m.r0(linkedHashSet)) == null) {
            r8Var2 = r8.COMPREHENSIVE;
        }
        return new o8(list, kVarF, p8Var3, p8Var3 == p8.SHUFFLE_20 || p8Var3 == p8.SHUFFLE_40, input.f50136b, linkedHashSet, r8Var2);
    }

    public static final n8 c(n8 n8Var) {
        o8 o8VarB = b(n8Var);
        return n8.a(n8Var, o8VarB.f50204g, o8VarB.f50200c, null, null, 51);
    }
}
