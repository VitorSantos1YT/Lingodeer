package rz;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rt.v7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y extends vy.a implements vy.f {
    public static final x Key = new x(vy.e.f54320a, new v7(14));

    public y() {
        super(vy.e.f54320a);
    }

    public static /* synthetic */ y limitedParallelism$default(y yVar, int i11, String str, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i12 & 2) != 0) {
            str = null;
        }
        return yVar.limitedParallelism(i11, str);
    }

    public abstract void dispatch(vy.i iVar, Runnable runnable);

    public void dispatchYield(vy.i iVar, Runnable runnable) {
        wz.b.i(this, iVar, runnable);
    }

    @Override // vy.a, vy.i
    public <E extends vy.g> E get(vy.h key) {
        E e8;
        kotlin.jvm.internal.m.f(key, "key");
        if (key instanceof x) {
            x xVar = (x) key;
            vy.h key2 = getKey();
            kotlin.jvm.internal.m.f(key2, "key");
            if ((key2 == xVar || xVar.f50969b == key2) && (e8 = (E) xVar.f50968a.invoke(this)) != null) {
                return e8;
            }
        } else if (vy.e.f54320a == key) {
            return this;
        }
        return null;
    }

    @Override // vy.f
    public final <T> vy.d<T> interceptContinuation(vy.d<? super T> dVar) {
        return new wz.f(this, dVar);
    }

    public boolean isDispatchNeeded(vy.i iVar) {
        return !(this instanceof g2);
    }

    public y limitedParallelism(int i11, String str) {
        wz.b.a(i11);
        return new wz.g(this, i11, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (((vy.g) r3.f50968a.invoke(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (vy.e.f54320a == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        return vy.j.f54321a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        return r2;
     */
    @Override // vy.a, vy.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vy.i minusKey(vy.h r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.m.f(r3, r0)
            boolean r1 = r3 instanceof rz.x
            if (r1 == 0) goto L25
            rz.x r3 = (rz.x) r3
            vy.h r1 = r2.getKey()
            kotlin.jvm.internal.m.f(r1, r0)
            if (r1 == r3) goto L1a
            vy.h r0 = r3.f50969b
            if (r0 != r1) goto L19
            goto L1a
        L19:
            return r2
        L1a:
            fz.c r3 = r3.f50968a
            java.lang.Object r3 = r3.invoke(r2)
            vy.g r3 = (vy.g) r3
            if (r3 == 0) goto L2c
            goto L29
        L25:
            vy.e r0 = vy.e.f54320a
            if (r0 != r3) goto L2c
        L29:
            vy.j r3 = vy.j.f54321a
            return r3
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rz.y.minusKey(vy.h):vy.i");
    }

    @Override // vy.f
    public final void releaseInterceptedContinuation(vy.d<?> dVar) {
        kotlin.jvm.internal.m.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        wz.f fVar = (wz.f) dVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = wz.f.H;
        while (atomicReferenceFieldUpdater.get(fVar) == wz.b.f55503c) {
        }
        Object obj = atomicReferenceFieldUpdater.get(fVar);
        m mVar = obj instanceof m ? (m) obj : null;
        if (mVar != null) {
            mVar.o();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + e0.r(this);
    }

    @qy.c
    public /* synthetic */ y limitedParallelism(int i11) {
        return limitedParallelism(i11, null);
    }

    @qy.c
    public final y plus(y yVar) {
        return yVar;
    }
}
