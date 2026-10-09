package ex;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k extends AtomicLong implements uw.e, n20.c {
    private static final long serialVersionUID = 7326289992464377023L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n20.b f26036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zw.c f26037b = new zw.c();

    public k(n20.b bVar) {
        this.f26036a = bVar;
    }

    public final void a() {
        zw.c cVar = this.f26037b;
        if (cVar.a()) {
            return;
        }
        try {
            this.f26036a.onComplete();
        } finally {
            zw.a.a(cVar);
        }
    }

    public final boolean b(Throwable th2) {
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        zw.c cVar = this.f26037b;
        if (cVar.a()) {
            return false;
        }
        try {
            this.f26036a.onError(th2);
            return true;
        } finally {
            zw.a.a(cVar);
        }
    }

    public final void c(Throwable th2) {
        if (f(th2)) {
            return;
        }
        qx.b.B(th2);
    }

    @Override // n20.c
    public final void cancel() {
        zw.c cVar = this.f26037b;
        cVar.getClass();
        zw.a.a(cVar);
        e();
    }

    public boolean f(Throwable th2) {
        return b(th2);
    }

    @Override // n20.c
    public final void request(long j11) {
        if (mx.g.c(j11)) {
            ue.f.i(this, j11);
            d();
        }
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return nv.p.r(getClass().getSimpleName(), "{", super.toString(), "}");
    }

    public void d() {
    }

    public void e() {
    }
}
