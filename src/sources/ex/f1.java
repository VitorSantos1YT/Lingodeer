package ex;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f1 extends uw.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uw.d f26007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f26008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c1 f26010e;

    public f1(c1 c1Var, uw.d dVar, AtomicReference atomicReference, int i11) {
        this.f26010e = c1Var;
        this.f26007b = dVar;
        this.f26008c = atomicReference;
        this.f26009d = i11;
    }

    @Override // uw.d
    public final void e(n20.b bVar) {
        this.f26010e.a(bVar);
    }

    public final void f() {
        e1 e1Var;
        loop0: while (true) {
            AtomicReference atomicReference = this.f26008c;
            e1Var = (e1) atomicReference.get();
            if (e1Var != null && !e1Var.e()) {
                break;
            }
            e1 e1Var2 = new e1(atomicReference, this.f26009d);
            do {
                if (atomicReference.compareAndSet(e1Var, e1Var2)) {
                    e1Var = e1Var2;
                    break loop0;
                }
            } while (atomicReference.get() == e1Var);
        }
        AtomicBoolean atomicBoolean = e1Var.f26000d;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        this.f26007b.d(e1Var);
    }
}
