package rz;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p1 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1 f50943a = new p1(3, q1.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        qy.b0 b0Var;
        q1 q1Var = (q1) obj;
        zz.i iVar = (zz.i) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q1.f50945a;
        q1Var.getClass();
        do {
            obj4 = q1.f50945a.get(q1Var);
            boolean z11 = obj4 instanceof d1;
            b0Var = qy.b0.f48488a;
            if (!z11) {
                ((zz.h) iVar).f59664e = b0Var;
                return b0Var;
            }
        } while (q1Var.S(obj4) < 0);
        ((zz.h) iVar).f59662c = e0.v(q1Var, true, new m1(q1Var, iVar, 1));
        return b0Var;
    }
}
