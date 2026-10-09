package rz;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y0 extends y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f50973d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f50974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f50975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ry.k f50976c;

    public final void d(boolean z11) {
        long j11 = this.f50974a - (z11 ? 4294967296L : 1L);
        this.f50974a = j11;
        if (j11 <= 0 && this.f50975b) {
            shutdown();
        }
    }

    public final void f(m0 m0Var) {
        ry.k kVar = this.f50976c;
        if (kVar == null) {
            kVar = new ry.k();
            this.f50976c = kVar;
        }
        kVar.addLast(m0Var);
    }

    public abstract Thread h();

    public final void i(boolean z11) {
        this.f50974a = (z11 ? 4294967296L : 1L) + this.f50974a;
        if (z11) {
            return;
        }
        this.f50975b = true;
    }

    @Override // rz.y
    public final y limitedParallelism(int i11, String str) {
        wz.b.a(i11);
        return str != null ? new wz.n(this, str) : this;
    }

    public abstract long q();

    public abstract void shutdown();

    public final boolean v() throws IllegalAccessException, InvocationTargetException {
        ry.k kVar = this.f50976c;
        if (kVar == null) {
            return false;
        }
        m0 m0Var = (m0) (kVar.isEmpty() ? null : kVar.removeFirst());
        if (m0Var == null) {
            return false;
        }
        m0Var.run();
        return true;
    }

    public void x(long j11, v0 v0Var) {
        f0.H.D(j11, v0Var);
    }
}
