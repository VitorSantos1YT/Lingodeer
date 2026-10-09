package yz;

import java.util.concurrent.Executor;
import rz.y;
import rz.z0;
import wz.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends z0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f58387a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f58388b;

    static {
        m mVar = m.f58401a;
        int i11 = t.f55545a;
        if (64 >= i11) {
            i11 = 64;
        }
        f58388b = y.limitedParallelism$default(mVar, wz.b.l(i11, 12, "kotlinx.coroutines.io.parallelism"), null, 2, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // rz.y
    public final void dispatch(vy.i iVar, Runnable runnable) {
        f58388b.dispatch(iVar, runnable);
    }

    @Override // rz.y
    public final void dispatchYield(vy.i iVar, Runnable runnable) {
        f58388b.dispatchYield(iVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dispatch(vy.j.f54321a, runnable);
    }

    @Override // rz.y
    public final y limitedParallelism(int i11, String str) {
        return m.f58401a.limitedParallelism(i11, str);
    }

    @Override // rz.y
    public final String toString() {
        return "Dispatchers.IO";
    }
}
