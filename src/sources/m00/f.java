package m00;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements h0 {
    @Override // m00.h0
    public final void K0(i source, long j11) throws EOFException {
        kotlin.jvm.internal.m.f(source, "source");
        source.skip(j11);
    }

    @Override // m00.h0
    public final k0 timeout() {
        return k0.f40719d;
    }

    @Override // m00.h0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // m00.h0, java.io.Flushable
    public final void flush() {
    }
}
