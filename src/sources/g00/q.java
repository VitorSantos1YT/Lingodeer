package g00;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements p1, c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f28450a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qy.e f28451b;

    public q(fz.c cVar) {
        this.f28451b = cVar;
    }

    @Override // g00.c1
    public Object g(mz.c cVar, ArrayList arrayList) {
        Object objL;
        Object obj = this.f28450a.get(qx.b.p(cVar));
        kotlin.jvm.internal.m.e(obj, "get(...)");
        v0 v0Var = (v0) obj;
        Object b1Var = v0Var.reference.get();
        if (b1Var == null) {
            synchronized (v0Var) {
                b1Var = v0Var.reference.get();
                if (b1Var == null) {
                    b1Var = new b1();
                    v0Var.reference = new SoftReference<>(b1Var);
                }
            }
        }
        b1 b1Var2 = (b1) b1Var;
        ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            arrayList2.add(new n0((mz.k) obj2));
        }
        ConcurrentHashMap concurrentHashMap = b1Var2.f28364a;
        Object obj3 = concurrentHashMap.get(arrayList2);
        if (obj3 == null) {
            try {
                objL = (c00.a) ((fz.e) this.f28451b).invoke(cVar, arrayList);
            } catch (Throwable th2) {
                objL = com.bumptech.glide.e.l(th2);
            }
            qy.o oVar = new qy.o(objL);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, oVar);
            obj3 = objPutIfAbsent == null ? oVar : objPutIfAbsent;
        }
        return ((qy.o) obj3).f48498a;
    }

    @Override // g00.p1
    public c00.a i(mz.c cVar) {
        Object obj = this.f28450a.get(qx.b.p(cVar));
        kotlin.jvm.internal.m.e(obj, "get(...)");
        v0 v0Var = (v0) obj;
        Object kVar = v0Var.reference.get();
        if (kVar == null) {
            synchronized (v0Var) {
                kVar = v0Var.reference.get();
                if (kVar == null) {
                    kVar = new k((c00.a) ((fz.c) this.f28451b).invoke(cVar));
                    v0Var.reference = new SoftReference<>(kVar);
                }
            }
        }
        return ((k) kVar).f28426a;
    }

    public q(fz.e eVar) {
        this.f28451b = eVar;
    }
}
