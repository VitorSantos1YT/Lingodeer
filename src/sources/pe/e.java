package pe;

import ce.a0;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends InputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayDeque f46817c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0 f46818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IOException f46819b;

    static {
        char[] cArr = m.f46830a;
        f46817c = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f46818a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f46818a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i11) {
        this.f46818a.mark(i11);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f46818a.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f46818a.read();
        } catch (IOException e8) {
            this.f46819b = e8;
            throw e8;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f46818a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j11) throws IOException {
        try {
            return this.f46818a.skip(j11);
        } catch (IOException e8) {
            this.f46819b = e8;
            throw e8;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f46818a.read(bArr);
        } catch (IOException e8) {
            this.f46819b = e8;
            throw e8;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        try {
            return this.f46818a.read(bArr, i11, i12);
        } catch (IOException e8) {
            this.f46819b = e8;
            throw e8;
        }
    }
}
