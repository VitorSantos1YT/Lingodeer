package y5;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f57098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteOrder f57099b;

    public c(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f57098a = outputStream;
        this.f57099b = byteOrder;
    }

    public final void a(int i11) throws IOException {
        this.f57098a.write(i11);
    }

    public final void b(int i11) throws IOException {
        ByteOrder byteOrder = this.f57099b;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.f57098a;
        if (byteOrder == byteOrder2) {
            outputStream.write(i11 & 255);
            outputStream.write((i11 >>> 8) & 255);
            outputStream.write((i11 >>> 16) & 255);
            outputStream.write((i11 >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((i11 >>> 24) & 255);
            outputStream.write((i11 >>> 16) & 255);
            outputStream.write((i11 >>> 8) & 255);
            outputStream.write(i11 & 255);
        }
    }

    public final void c(short s3) throws IOException {
        ByteOrder byteOrder = this.f57099b;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.f57098a;
        if (byteOrder == byteOrder2) {
            outputStream.write(s3 & 255);
            outputStream.write((s3 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((s3 >>> 8) & 255);
            outputStream.write(s3 & 255);
        }
    }

    public final void d(long j11) throws IOException {
        if (j11 > 4294967295L) {
            throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
        }
        b((int) j11);
    }

    public final void e(int i11) throws IOException {
        if (i11 > 65535) {
            throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
        }
        c((short) i11);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f57098a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i11, int i12) throws IOException {
        this.f57098a.write(bArr, i11, i12);
    }
}
