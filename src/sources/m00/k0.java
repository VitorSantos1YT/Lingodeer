package m00;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j0 f40719d = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f40720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f40721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f40722c;

    public k0 a() {
        this.f40720a = false;
        return this;
    }

    public k0 b() {
        this.f40722c = 0L;
        return this;
    }

    public long c() {
        if (this.f40720a) {
            return this.f40721b;
        }
        throw new IllegalStateException("No deadline");
    }

    public k0 d(long j11) {
        this.f40720a = true;
        this.f40721b = j11;
        return this;
    }

    public boolean e() {
        return this.f40720a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f40720a && this.f40721b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public k0 g(long j11, TimeUnit unit) {
        kotlin.jvm.internal.m.f(unit, "unit");
        if (j11 < 0) {
            throw new IllegalArgumentException(defpackage.e.h(j11, "timeout < 0: ").toString());
        }
        this.f40722c = unit.toNanos(j11);
        return this;
    }
}
