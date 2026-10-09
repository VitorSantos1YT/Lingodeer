package mw;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d4 extends InputStream implements lw.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f42391a;

    @Override // java.io.InputStream
    public final int available() {
        return this.f42391a.p();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f42391a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i11) {
        this.f42391a.b();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f42391a.c();
    }

    @Override // java.io.InputStream
    public final int read() {
        d dVar = this.f42391a;
        if (dVar.p() == 0) {
            return -1;
        }
        return dVar.i();
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f42391a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j11) {
        d dVar = this.f42391a;
        int iMin = (int) Math.min(dVar.p(), j11);
        dVar.q(iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) {
        d dVar = this.f42391a;
        if (dVar.p() == 0) {
            return -1;
        }
        int iMin = Math.min(dVar.p(), i12);
        dVar.h(bArr, i11, iMin);
        return iMin;
    }
}
