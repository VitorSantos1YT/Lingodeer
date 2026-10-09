package rz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v0 implements Runnable, Comparable, q0 {
    private volatile Object _heap;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f50962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50963b = -1;

    public v0(long j11) {
        this.f50962a = j11;
    }

    public final int b(long j11, w0 w0Var, x0 x0Var) {
        synchronized (this) {
            if (this._heap == e0.f50883b) {
                return 2;
            }
            synchronized (w0Var) {
                try {
                    v0[] v0VarArr = w0Var.f55551a;
                    v0 v0Var = v0VarArr != null ? v0VarArr[0] : null;
                    if (x0.f50972t.get(x0Var) == 1) {
                        return 1;
                    }
                    if (v0Var == null) {
                        w0Var.f50966c = j11;
                    } else {
                        long j12 = v0Var.f50962a;
                        if (j12 - j11 < 0) {
                            j11 = j12;
                        }
                        if (j11 - w0Var.f50966c > 0) {
                            w0Var.f50966c = j11;
                        }
                    }
                    long j13 = this.f50962a;
                    long j14 = w0Var.f50966c;
                    if (j13 - j14 < 0) {
                        this.f50962a = j14;
                    }
                    w0Var.a(this);
                    return 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void c(w0 w0Var) {
        if (this._heap == e0.f50883b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = w0Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j11 = this.f50962a - ((v0) obj).f50962a;
        if (j11 > 0) {
            return 1;
        }
        return j11 < 0 ? -1 : 0;
    }

    @Override // rz.q0
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                com.android.billingclient.api.a aVar = e0.f50883b;
                if (obj == aVar) {
                    return;
                }
                w0 w0Var = obj instanceof w0 ? (w0) obj : null;
                if (w0Var != null) {
                    synchronized (w0Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof wz.w ? (wz.w) obj2 : null) != null) {
                            w0Var.b(this.f50963b);
                        }
                    }
                }
                this._heap = aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f50962a + ']';
    }
}
