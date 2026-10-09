package wz;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rz.x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r extends c implements x1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f55542d = AtomicIntegerFieldUpdater.newUpdater(r.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f55543c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public r(long j11, r rVar, int i11) {
        super(rVar);
        this.f55543c = j11;
        this.cleanedAndPointers$volatile = i11 << 16;
    }

    @Override // wz.c
    public final boolean d() {
        return f55542d.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return f55542d.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i11, vy.i iVar);

    public final void i() {
        if (f55542d.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f55542d;
            i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 65536 + i11));
        return true;
    }
}
