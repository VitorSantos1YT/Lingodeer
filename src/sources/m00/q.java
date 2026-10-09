package m00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f40740a;

    public q(h0 delegate) {
        kotlin.jvm.internal.m.f(delegate, "delegate");
        this.f40740a = delegate;
    }

    @Override // m00.h0
    public void K0(i source, long j11) {
        kotlin.jvm.internal.m.f(source, "source");
        this.f40740a.K0(source, j11);
    }

    @Override // m00.h0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f40740a.close();
    }

    @Override // m00.h0, java.io.Flushable
    public void flush() {
        this.f40740a.flush();
    }

    @Override // m00.h0
    public final k0 timeout() {
        return this.f40740a.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f40740a + ')';
    }
}
