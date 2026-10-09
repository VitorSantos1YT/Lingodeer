package y5;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import hh.p0;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataInputStream f57093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f57094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteOrder f57095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f57096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f57097e;

    public b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        this.f57097e = bArr.length;
    }

    public final void a(int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i11 - i12;
            DataInputStream dataInputStream = this.f57093a;
            int iSkip = (int) dataInputStream.skip(i13);
            if (iSkip <= 0) {
                if (this.f57096d == null) {
                    this.f57096d = new byte[OSSConstants.DEFAULT_BUFFER_SIZE];
                }
                iSkip = dataInputStream.read(this.f57096d, 0, Math.min(OSSConstants.DEFAULT_BUFFER_SIZE, i13));
                if (iSkip == -1) {
                    throw new EOFException(p0.h(i11, "Reached EOF while skipping ", " bytes."));
                }
            }
            i12 += iSkip;
        }
        this.f57094b += i12;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f57093a.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i11) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f57094b++;
        return this.f57093a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f57094b++;
        return this.f57093a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f57094b++;
        int i11 = this.f57093a.read();
        if (i11 >= 0) {
            return (byte) i11;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f57094b += 2;
        return this.f57093a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i11, int i12) throws IOException {
        this.f57094b += i12;
        this.f57093a.readFully(bArr, i11, i12);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f57094b += 4;
        DataInputStream dataInputStream = this.f57093a;
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        if ((i11 | i12 | i13 | i14) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f57095c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i14 << 24) + (i13 << 16) + (i12 << 8) + i11;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
        }
        throw new IOException("Invalid byte order: " + this.f57095c);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j11;
        long j12;
        this.f57094b += 8;
        DataInputStream dataInputStream = this.f57093a;
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        int i15 = dataInputStream.read();
        int i16 = dataInputStream.read();
        int i17 = dataInputStream.read();
        int i18 = dataInputStream.read();
        if ((i11 | i12 | i13 | i14 | i15 | i16 | i17 | i18) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f57095c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j11 = (((long) i18) << 56) + (((long) i17) << 48) + (((long) i16) << 40) + (((long) i15) << 32) + (((long) i14) << 24) + (((long) i13) << 16) + (((long) i12) << 8);
            j12 = i11;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f57095c);
            }
            j11 = (((long) i11) << 56) + (((long) i12) << 48) + (((long) i13) << 40) + (((long) i14) << 32) + (((long) i15) << 24) + (((long) i16) << 16) + (((long) i17) << 8);
            j12 = i18;
        }
        return j11 + j12;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f57094b += 2;
        DataInputStream dataInputStream = this.f57093a;
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        if ((i11 | i12) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f57095c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((i12 << 8) + i11);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((i11 << 8) + i12);
        }
        throw new IOException("Invalid byte order: " + this.f57095c);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f57094b += 2;
        return this.f57093a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f57094b++;
        return this.f57093a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f57094b += 2;
        DataInputStream dataInputStream = this.f57093a;
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        if ((i11 | i12) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f57095c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i12 << 8) + i11;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i11 << 8) + i12;
        }
        throw new IOException("Invalid byte order: " + this.f57095c);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i11) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = this.f57093a.read(bArr, i11, i12);
        this.f57094b += i13;
        return i13;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f57094b += bArr.length;
        this.f57093a.readFully(bArr);
    }

    public b(InputStream inputStream, ByteOrder byteOrder) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f57093a = dataInputStream;
        dataInputStream.mark(0);
        this.f57094b = 0;
        this.f57095c = byteOrder;
        this.f57097e = inputStream instanceof b ? ((b) inputStream).f57097e : -1;
    }
}
