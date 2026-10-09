package mw;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements Closeable {
    public final void a(int i11) {
        if (p() < i11) {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean c() {
        return this instanceof e4;
    }

    public abstract d d(int i11);

    public abstract void e(OutputStream outputStream, int i11);

    public abstract void f(ByteBuffer byteBuffer);

    public abstract void h(byte[] bArr, int i11, int i12);

    public abstract int i();

    public abstract int p();

    public abstract void q(int i11);

    public void reset() {
        throw new UnsupportedOperationException();
    }

    public void b() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
