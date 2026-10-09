package ce;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile byte[] f6833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m0.n f6838f;

    public a0(InputStream inputStream, m0.n nVar) {
        super(inputStream);
        this.f6836d = -1;
        this.f6838f = nVar;
        this.f6833a = (byte[]) nVar.d(65536, byte[].class);
    }

    public static void b() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i11 = this.f6836d;
        if (i11 != -1) {
            int i12 = this.f6837e - i11;
            int i13 = this.f6835c;
            if (i12 < i13) {
                if (i11 == 0 && i13 > bArr.length && this.f6834b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i13) {
                        i13 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f6838f.d(i13, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f6833a = bArr2;
                    this.f6838f.i(bArr);
                    bArr = bArr2;
                } else if (i11 > 0) {
                    System.arraycopy(bArr, i11, bArr, 0, bArr.length - i11);
                }
                int i14 = this.f6837e - this.f6836d;
                this.f6837e = i14;
                this.f6836d = 0;
                this.f6834b = 0;
                int i15 = inputStream.read(bArr, i14, bArr.length - i14);
                int i16 = this.f6837e;
                if (i15 > 0) {
                    i16 += i15;
                }
                this.f6834b = i16;
                return i15;
            }
        }
        int i17 = inputStream.read(bArr);
        if (i17 > 0) {
            this.f6836d = -1;
            this.f6837e = 0;
            this.f6834b = i17;
        }
        return i17;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f6833a == null || inputStream == null) {
            b();
            throw null;
        }
        return (this.f6834b - this.f6837e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f6833a != null) {
            this.f6838f.i(this.f6833a);
            this.f6833a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i11) {
        this.f6835c = Math.max(this.f6835c, i11);
        this.f6836d = this.f6837e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f6833a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            b();
            throw null;
        }
        if (this.f6837e >= this.f6834b && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f6833a && (bArr = this.f6833a) == null) {
            b();
            throw null;
        }
        int i11 = this.f6834b;
        int i12 = this.f6837e;
        if (i11 - i12 <= 0) {
            return -1;
        }
        this.f6837e = i12 + 1;
        return bArr[i12] & 255;
    }

    public final synchronized void release() {
        if (this.f6833a != null) {
            this.f6838f.i(this.f6833a);
            this.f6833a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f6833a == null) {
            throw new IOException("Stream is closed");
        }
        int i11 = this.f6836d;
        if (-1 == i11) {
            throw new z("Mark has been invalidated, pos: " + this.f6837e + " markLimit: " + this.f6835c);
        }
        this.f6837e = i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j11) {
        if (j11 < 1) {
            return 0L;
        }
        byte[] bArr = this.f6833a;
        if (bArr == null) {
            b();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            b();
            throw null;
        }
        int i11 = this.f6834b;
        int i12 = this.f6837e;
        if (i11 - i12 >= j11) {
            this.f6837e = (int) (((long) i12) + j11);
            return j11;
        }
        long j12 = ((long) i11) - ((long) i12);
        this.f6837e = i11;
        if (this.f6836d == -1 || j11 > this.f6835c) {
            long jSkip = inputStream.skip(j11 - j12);
            if (jSkip > 0) {
                this.f6836d = -1;
            }
            return j12 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j12;
        }
        int i13 = this.f6834b;
        int i14 = this.f6837e;
        if (i13 - i14 >= j11 - j12) {
            this.f6837e = (int) ((((long) i14) + j11) - j12);
            return j11;
        }
        long j13 = (j12 + ((long) i13)) - ((long) i14);
        this.f6837e = i13;
        return j13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        byte[] bArr2 = this.f6833a;
        if (bArr2 == null) {
            b();
            throw null;
        }
        if (i12 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i15 = this.f6837e;
            int i16 = this.f6834b;
            if (i15 < i16) {
                int i17 = i16 - i15;
                if (i17 >= i12) {
                    i17 = i12;
                }
                System.arraycopy(bArr2, i15, bArr, i11, i17);
                this.f6837e += i17;
                if (i17 == i12 || inputStream.available() == 0) {
                    return i17;
                }
                i11 += i17;
                i13 = i12 - i17;
            } else {
                i13 = i12;
            }
            while (true) {
                if (this.f6836d == -1 && i13 >= bArr2.length) {
                    i14 = inputStream.read(bArr, i11, i13);
                    if (i14 == -1) {
                        return i13 != i12 ? i12 - i13 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i13 != i12 ? i12 - i13 : -1;
                    }
                    if (bArr2 != this.f6833a && (bArr2 = this.f6833a) == null) {
                        b();
                        throw null;
                    }
                    int i18 = this.f6834b;
                    int i19 = this.f6837e;
                    i14 = i18 - i19;
                    if (i14 >= i13) {
                        i14 = i13;
                    }
                    System.arraycopy(bArr2, i19, bArr, i11, i14);
                    this.f6837e += i14;
                }
                i13 -= i14;
                if (i13 == 0) {
                    return i12;
                }
                if (inputStream.available() == 0) {
                    return i12 - i13;
                }
                i11 += i14;
            }
        } else {
            b();
            throw null;
        }
    }
}
