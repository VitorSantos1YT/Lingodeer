package pe;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46816b;

    public d(InputStream inputStream, long j11) {
        super(inputStream);
        this.f46815a = j11;
    }

    public final void a(int i11) throws IOException {
        if (i11 >= 0) {
            this.f46816b += i11;
            return;
        }
        long j11 = this.f46816b;
        long j12 = this.f46815a;
        if (j12 - j11 <= 0) {
            return;
        }
        StringBuilder sbJ = w4.c.j(j12, "Failed to read all expected data, expected: ", ", but read: ");
        sbJ.append(this.f46816b);
        throw new IOException(sbJ.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f46815a - ((long) this.f46816b), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i11;
        i11 = super.read();
        a(i11 >= 0 ? 1 : -1);
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i11, int i12) {
        int i13;
        i13 = super.read(bArr, i11, i12);
        a(i13);
        return i13;
    }
}
