package nw;

import hh.p0;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends mw.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m00.i f44277a;

    public u(m00.i iVar) {
        this.f44277a = iVar;
    }

    @Override // mw.d, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f44277a.a();
    }

    @Override // mw.d
    public final mw.d d(int i11) {
        m00.i iVar = new m00.i();
        iVar.K0(this.f44277a, i11);
        return new u(iVar);
    }

    @Override // mw.d
    public final void e(OutputStream outputStream, int i11) throws IOException {
        this.f44277a.V(outputStream, i11);
    }

    @Override // mw.d
    public final void f(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // mw.d
    public final void h(byte[] bArr, int i11, int i12) {
        while (i12 > 0) {
            int i13 = this.f44277a.read(bArr, i11, i12);
            if (i13 == -1) {
                throw new IndexOutOfBoundsException(p0.h(i12, "EOF trying to read ", " bytes"));
            }
            i12 -= i13;
            i11 += i13;
        }
    }

    @Override // mw.d
    public final int i() {
        try {
            return this.f44277a.readByte() & 255;
        } catch (EOFException e8) {
            throw new IndexOutOfBoundsException(e8.getMessage());
        }
    }

    @Override // mw.d
    public final int p() {
        return (int) this.f44277a.f40718b;
    }

    @Override // mw.d
    public final void q(int i11) {
        try {
            this.f44277a.skip(i11);
        } catch (EOFException e8) {
            throw new IndexOutOfBoundsException(e8.getMessage());
        }
    }
}
