package m00;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends k0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k0 f40741e;

    public s(k0 delegate) {
        kotlin.jvm.internal.m.f(delegate, "delegate");
        this.f40741e = delegate;
    }

    @Override // m00.k0
    public final k0 a() {
        return this.f40741e.a();
    }

    @Override // m00.k0
    public final k0 b() {
        return this.f40741e.b();
    }

    @Override // m00.k0
    public final long c() {
        return this.f40741e.c();
    }

    @Override // m00.k0
    public final k0 d(long j11) {
        return this.f40741e.d(j11);
    }

    @Override // m00.k0
    public final boolean e() {
        return this.f40741e.e();
    }

    @Override // m00.k0
    public final void f() throws InterruptedIOException {
        this.f40741e.f();
    }

    @Override // m00.k0
    public final k0 g(long j11, TimeUnit unit) {
        kotlin.jvm.internal.m.f(unit, "unit");
        return this.f40741e.g(j11, unit);
    }
}
