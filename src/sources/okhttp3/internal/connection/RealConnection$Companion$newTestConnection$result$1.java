package okhttp3.internal.connection;

import kotlin.jvm.internal.m;
import m00.i;
import m00.i0;
import m00.k0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class RealConnection$Companion$newTestConnection$result$1 implements i0 {
    @Override // m00.i0
    public final long read(i sink, long j11) {
        m.f(sink, "sink");
        throw new UnsupportedOperationException();
    }

    @Override // m00.i0
    public final k0 timeout() {
        return k0.f40719d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
