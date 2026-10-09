package pe;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46810a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46811b = 1073741824;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f46812c;

    public a(InputStream inputStream) {
        this.f46812c = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.f46810a) {
            case 0:
                return ((ByteBuffer) this.f46812c).remaining();
            default:
                return this.f46811b;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f46810a) {
            case 1:
                ((InputStream) this.f46812c).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i11) {
        switch (this.f46810a) {
            case 0:
                synchronized (this) {
                    this.f46811b = ((ByteBuffer) this.f46812c).position();
                }
                return;
            default:
                super.mark(i11);
                return;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        switch (this.f46810a) {
            case 0:
                return true;
            default:
                return super.markSupported();
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f46810a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) this.f46812c;
                if (byteBuffer.hasRemaining()) {
                    return byteBuffer.get() & 255;
                }
                return -1;
            default:
                int i11 = ((InputStream) this.f46812c).read();
                if (i11 == -1) {
                    this.f46811b = 0;
                }
                return i11;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.f46810a) {
            case 0:
                synchronized (this) {
                    int i11 = this.f46811b;
                    if (i11 == -1) {
                        throw new IOException("Cannot reset to unset mark position");
                    }
                    ((ByteBuffer) this.f46812c).position(i11);
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j11) {
        switch (this.f46810a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) this.f46812c;
                if (!byteBuffer.hasRemaining()) {
                    return -1L;
                }
                long jMin = Math.min(j11, byteBuffer.remaining());
                byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
                return jMin;
            default:
                return ((InputStream) this.f46812c).skip(j11);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f46812c = byteBuffer;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        switch (this.f46810a) {
            case 1:
                int i11 = ((InputStream) this.f46812c).read(bArr);
                if (i11 == -1) {
                    this.f46811b = 0;
                }
                return i11;
            default:
                return super.read(bArr);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        switch (this.f46810a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) this.f46812c;
                if (!byteBuffer.hasRemaining()) {
                    return -1;
                }
                int iMin = Math.min(i12, byteBuffer.remaining());
                byteBuffer.get(bArr, i11, iMin);
                return iMin;
            default:
                int i13 = ((InputStream) this.f46812c).read(bArr, i11, i12);
                if (i13 == -1) {
                    this.f46811b = 0;
                }
                return i13;
        }
    }
}
