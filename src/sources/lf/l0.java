package lf;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f40058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BufferedOutputStream f40059b;

    public l0(u0 u0Var, BufferedOutputStream bufferedOutputStream) {
        this.f40058a = u0Var;
        this.f40059b = bufferedOutputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f40058a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        BufferedOutputStream bufferedOutputStream = this.f40059b;
        try {
            this.f40058a.close();
        } finally {
            bufferedOutputStream.close();
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final int read(byte[] buffer) throws IOException {
        kotlin.jvm.internal.m.f(buffer, "buffer");
        int i11 = this.f40058a.read(buffer);
        if (i11 > 0) {
            this.f40059b.write(buffer, 0, i11);
        }
        return i11;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public final long skip(long j11) {
        int i11;
        byte[] bArr = new byte[1024];
        long j12 = 0;
        while (j12 < j11 && (i11 = read(bArr, 0, (int) Math.min(j11 - j12, 1024))) >= 0) {
            j12 += (long) i11;
        }
        return j12;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i11 = this.f40058a.read();
        if (i11 >= 0) {
            this.f40059b.write(i11);
        }
        return i11;
    }

    @Override // java.io.InputStream
    public final int read(byte[] buffer, int i11, int i12) throws IOException {
        kotlin.jvm.internal.m.f(buffer, "buffer");
        int i13 = this.f40058a.read(buffer, i11, i12);
        if (i13 > 0) {
            this.f40059b.write(buffer, i11, i13);
        }
        return i13;
    }
}
