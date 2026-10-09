package w1;

import bt.c2;
import dt.e1;
import java.util.Arrays;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.m;
import l1.n;
import l1.s;
import l1.t;
import qp.o2;
import qx.p;
import rz.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o2 f54469a = new o2(6, new w(26), new vr.a(5));

    public static final String a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final o2 b(fz.e eVar, fz.c cVar) {
        int i11 = 6;
        e1 e1Var = new e1(i11, eVar);
        c0.d(1, cVar);
        return new o2(i11, e1Var, cVar);
    }

    public static final Object c(Object[] objArr, fz.a aVar, n nVar, int i11) {
        return e(Arrays.copyOf(objArr, objArr.length), f54469a, aVar, nVar, ((i11 << 6) & 7168) | 384, 0);
    }

    public static final Object d(Object[] objArr, i iVar, fz.a aVar, n nVar, int i11) {
        return e(Arrays.copyOf(objArr, objArr.length), iVar, aVar, nVar, 384 | ((i11 << 3) & 7168), 0);
    }

    public static final Object e(Object[] objArr, i iVar, fz.a aVar, n nVar, int i11, int i12) {
        Object[] objArr2;
        Object obj;
        Object objB;
        if ((i12 & 2) != 0) {
            iVar = f54469a;
        }
        i iVar2 = iVar;
        s sVar = (s) nVar;
        long j11 = sVar.T;
        p.k(36);
        String string = Long.toString(j11, 36);
        m.e(string, "toString(...)");
        m.d(iVar2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        e eVar = (e) sVar.j(g.f54465a);
        Object objQ = sVar.Q();
        l1.g gVar = l1.m.f39353a;
        if (objQ == gVar) {
            Object objA = (eVar == null || (objB = eVar.b(string)) == null) ? null : iVar2.a(objB);
            if (objA == null) {
                objA = aVar.invoke();
            }
            objArr2 = objArr;
            a aVar2 = new a(iVar2, eVar, string, objA, objArr2);
            sVar.o0(aVar2);
            objQ = aVar2;
        } else {
            objArr2 = objArr;
        }
        a aVar3 = (a) objQ;
        Object objInvoke = Arrays.equals(objArr2, aVar3.f54454e) ? aVar3.f54453d : null;
        if (objInvoke == null) {
            objInvoke = aVar.invoke();
        }
        boolean zH = sVar.h(aVar3) | ((((i11 & 112) ^ 48) > 32 && sVar.h(iVar2)) || (i11 & 48) == 32) | sVar.h(eVar) | sVar.f(string) | sVar.h(objInvoke) | sVar.h(objArr2);
        Object objQ2 = sVar.Q();
        if (zH || objQ2 == gVar) {
            Object[] objArr3 = objArr2;
            obj = objInvoke;
            c2 c2Var = new c2(aVar3, iVar2, eVar, string, obj, objArr3, 4);
            sVar.o0(c2Var);
            objQ2 = c2Var;
        } else {
            obj = objInvoke;
        }
        t.j((fz.a) objQ2, sVar);
        return obj;
    }

    public static final c f(n nVar) {
        s sVar = (s) nVar;
        sVar.d0(1967007413);
        Object[] objArr = new Object[0];
        Object objQ = sVar.Q();
        if (objQ == l1.m.f39353a) {
            objQ = new uu.f(7);
            sVar.o0(objQ);
        }
        c cVar = (c) d(objArr, c.f54457e, (fz.a) objQ, sVar, 384);
        cVar.f54460c = (e) sVar.j(g.f54465a);
        sVar.p(false);
        return cVar;
    }
}
