package m00;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r implements i0 {
    private final i0 delegate;

    public r(i0 delegate) {
        kotlin.jvm.internal.m.f(delegate, "delegate");
        this.delegate = delegate;
    }

    @qy.c
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final i0 m230deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final i0 delegate() {
        return this.delegate;
    }

    @Override // m00.i0
    public long read(i sink, long j11) {
        kotlin.jvm.internal.m.f(sink, "sink");
        return this.delegate.read(sink, j11);
    }

    @Override // m00.i0
    public k0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
