package rz;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i1 extends wz.i implements q0, d1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q1 f50913d;

    @Override // rz.d1
    public final u1 b() {
        return null;
    }

    @Override // rz.q0
    public final void dispose() {
        q1 q1VarH = h();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q1.f50945a;
            Object obj = atomicReferenceFieldUpdater.get(q1VarH);
            if (obj instanceof i1) {
                if (obj != this) {
                    return;
                }
                s0 s0Var = e0.f50891j;
                while (!atomicReferenceFieldUpdater.compareAndSet(q1VarH, obj, s0Var)) {
                    if (atomicReferenceFieldUpdater.get(q1VarH) != obj) {
                    }
                }
                return;
            }
            if (!(obj instanceof d1) || ((d1) obj).b() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = wz.i.f55524a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof wz.o) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                wz.i iVar = (wz.i) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = wz.i.f55526c;
                wz.o oVar = (wz.o) atomicReferenceFieldUpdater3.get(iVar);
                if (oVar == null) {
                    oVar = new wz.o(iVar);
                    atomicReferenceFieldUpdater3.set(iVar, oVar);
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, oVar)) {
                        iVar.d();
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj2);
            }
        }
    }

    public g1 getParent() {
        return h();
    }

    public final q1 h() {
        q1 q1Var = this.f50913d;
        if (q1Var != null) {
            return q1Var;
        }
        kotlin.jvm.internal.m.n("job");
        throw null;
    }

    public abstract boolean i();

    @Override // rz.d1
    public final boolean isActive() {
        return true;
    }

    public abstract void j(Throwable th2);

    @Override // wz.i
    public final String toString() {
        return getClass().getSimpleName() + '@' + e0.r(this) + "[job@" + e0.r(h()) + ']';
    }
}
