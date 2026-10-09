package m00;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public interface h0 extends Closeable, Flushable {
    void K0(i iVar, long j11);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    k0 timeout();
}
