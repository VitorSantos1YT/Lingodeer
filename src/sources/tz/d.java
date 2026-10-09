package tz;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import qy.b0;
import rz.j2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f52669a = new d(3, h.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p pVar;
        h hVar = (h) obj;
        zz.i iVar = (zz.i) obj2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = h.f52677b;
        hVar.getClass();
        p pVar2 = (p) h.f52682t.get(hVar);
        while (!hVar.w()) {
            long andIncrement = h.f52678c.getAndIncrement(hVar);
            long j11 = j.f52686b;
            long j12 = andIncrement / j11;
            int i11 = (int) (andIncrement % j11);
            if (pVar2.f55543c != j12) {
                p pVarP = hVar.p(j12, pVar2);
                if (pVarP == null) {
                    continue;
                } else {
                    pVar = pVarP;
                }
            } else {
                pVar = pVar2;
            }
            Object objH = hVar.H(pVar, i11, andIncrement, iVar);
            p pVar3 = pVar;
            if (objH == j.m) {
                j2 j2Var = iVar instanceof j2 ? (j2) iVar : null;
                if (j2Var != null) {
                    j2Var.b(pVar3, i11);
                }
            } else if (objH == j.f52698o) {
                if (andIncrement < hVar.t()) {
                    pVar3.b();
                }
                pVar2 = pVar3;
            } else {
                if (objH == j.f52697n) {
                    throw new IllegalStateException("unexpected");
                }
                pVar3.b();
                ((zz.h) iVar).f59664e = objH;
            }
            return b0.f48488a;
        }
        ((zz.h) iVar).f59664e = j.f52696l;
        return b0.f48488a;
    }
}
