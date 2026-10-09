package rz;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n1 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n1 f50937a = new n1(3, q1.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object objK;
        q1 q1Var = (q1) obj;
        zz.i iVar = (zz.i) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q1.f50945a;
        q1Var.getClass();
        do {
            objK = q1.f50945a.get(q1Var);
            if (!(objK instanceof d1)) {
                if (!(objK instanceof v)) {
                    objK = e0.K(objK);
                }
                ((zz.h) iVar).f59664e = objK;
            }
            return qy.b0.f48488a;
        } while (q1Var.S(objK) < 0);
        ((zz.h) iVar).f59662c = e0.v(q1Var, true, new m1(q1Var, iVar, 0));
        return qy.b0.f48488a;
    }
}
