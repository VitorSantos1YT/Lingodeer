package pe;

import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46825a;

    public j(e eVar) {
        super(eVar);
        this.f46825a = Integer.MIN_VALUE;
    }

    public final long a(long j11) {
        int i11 = this.f46825a;
        if (i11 == 0) {
            return -1L;
        }
        return (i11 == Integer.MIN_VALUE || j11 <= ((long) i11)) ? j11 : i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i11 = this.f46825a;
        return i11 == Integer.MIN_VALUE ? super.available() : Math.min(i11, super.available());
    }

    public final void b(long j11) {
        int i11 = this.f46825a;
        if (i11 == Integer.MIN_VALUE || j11 == -1) {
            return;
        }
        this.f46825a = (int) (((long) i11) - j11);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i11) {
        super.mark(i11);
        this.f46825a = i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (a(1L) == -1) {
            return -1;
        }
        int i11 = super.read();
        b(1L);
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f46825a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j11) throws IOException {
        long jA = a(j11);
        if (jA == -1) {
            return 0L;
        }
        long jSkip = super.skip(jA);
        b(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        int iA = (int) a(i12);
        if (iA == -1) {
            return -1;
        }
        int i13 = super.read(bArr, i11, iA);
        b(i13);
        return i13;
    }
}
