package a00;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import qu.s;
import qy.b0;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends j implements a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater H = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public e() {
        super(1);
        this.owner$volatile = f.f252a;
    }

    @Override // a00.a
    public final void a(Object obj) {
        while (f()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = H;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            com.android.billingclient.api.a aVar = f.f252a;
            if (obj2 != aVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, aVar)) {
                        e();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    @Override // a00.a
    public final Object b(vy.d dVar) {
        boolean zG = g();
        b0 b0Var = b0.f48488a;
        if (!zG) {
            rz.m mVarT = e0.t(ue.f.x(dVar));
            try {
                d dVar2 = new d(this, mVarT);
                while (true) {
                    int andDecrement = j.f259t.getAndDecrement(this);
                    if (andDecrement <= this.f260a) {
                        if (andDecrement > 0) {
                            e eVar = dVar2.f251b;
                            H.set(eVar, null);
                            rz.m mVar = dVar2.f250a;
                            mVar.C(b0Var, mVar.f50932c, new s(new c(eVar, dVar2), 1));
                            break;
                        }
                        if (d(dVar2)) {
                            break;
                        }
                    }
                }
                Object objR = mVarT.r();
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                if (objR != aVar) {
                    objR = b0Var;
                }
                if (objR == aVar) {
                    return objR;
                }
            } catch (Throwable th2) {
                mVarT.B();
                throw th2;
            }
        }
        return b0Var;
    }

    public final boolean f() {
        return Math.max(j.f259t.get(this), 0) == 0;
    }

    public final boolean g() {
        int i11;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j.f259t;
            int i12 = atomicIntegerFieldUpdater.get(this);
            int i13 = this.f260a;
            if (i12 > i13) {
                do {
                    i11 = atomicIntegerFieldUpdater.get(this);
                    if (i11 <= i13) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, i13));
            } else {
                if (i12 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i12, i12 - 1)) {
                    H.set(this, null);
                    return true;
                }
            }
        }
    }

    public final String toString() {
        return "Mutex@" + e0.r(this) + "[isLocked=" + f() + ",owner=" + H.get(this) + ']';
    }
}
