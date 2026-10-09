package tz;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.JobCancellationException;
import rz.e0;
import rz.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends rz.a implements t, l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f52713d;

    public s(vy.i iVar, h hVar) {
        super(iVar, true);
        this.f52713d = hVar;
    }

    @Override // rz.a
    public final void X(Throwable th2, boolean z11) throws IllegalAccessException, InvocationTargetException {
        if (this.f52713d.l(th2, false) || z11) {
            return;
        }
        e0.u(th2, this.f50863c);
    }

    @Override // rz.a
    public final void Y(Object obj) {
        this.f52713d.k(null);
    }

    public final boolean a0(Throwable th2) {
        return this.f52713d.l(th2, false);
    }

    @Override // tz.v
    public final zz.e b() {
        return this.f52713d.b();
    }

    public final void b0(av.t tVar) {
        h hVar = this.f52713d;
        hVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.L;
        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, null, tVar)) {
            if (atomicReferenceFieldUpdater.get(hVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(hVar);
                    com.android.billingclient.api.a aVar = j.f52700q;
                    if (obj != aVar) {
                        if (obj == j.f52701r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    com.android.billingclient.api.a aVar2 = j.f52701r;
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, aVar2)) {
                            tVar.invoke(hVar.q());
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(hVar) == aVar);
                }
            }
        }
    }

    @Override // rz.q1, rz.g1
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(t(), null, this);
        }
        r(cancellationException);
    }

    @Override // tz.v
    public final Object d() {
        return this.f52713d.d();
    }

    @Override // tz.w
    public final Object f(Object obj, vy.d dVar) {
        return this.f52713d.f(obj, dVar);
    }

    @Override // tz.v
    public final Object g(vy.d dVar) {
        return this.f52713d.g(dVar);
    }

    @Override // tz.w
    public final Object i(Object obj) {
        return this.f52713d.i(obj);
    }

    @Override // tz.v
    public final c iterator() {
        h hVar = this.f52713d;
        hVar.getClass();
        return new c(hVar);
    }

    @Override // tz.v
    public final Object j(mi.b bVar) {
        h hVar = this.f52713d;
        hVar.getClass();
        Object objC = h.C(hVar, bVar);
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        return objC;
    }

    @Override // rz.q1
    public final void r(CancellationException cancellationException) {
        CancellationException cancellationExceptionU = q1.U(this, cancellationException);
        this.f52713d.l(cancellationExceptionU, true);
        q(cancellationExceptionU);
    }
}
