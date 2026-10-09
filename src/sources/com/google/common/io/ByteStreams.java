package com.google.common.io;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import hh.p0;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class ByteStreams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f17440a = 0;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ByteArrayDataInputStream implements ByteArrayDataInput {
        @Override // java.io.DataInput
        public final boolean readBoolean() {
            throw null;
        }

        @Override // java.io.DataInput
        public final byte readByte() {
            throw null;
        }

        @Override // java.io.DataInput
        public final char readChar() {
            throw null;
        }

        @Override // java.io.DataInput
        public final double readDouble() {
            throw null;
        }

        @Override // java.io.DataInput
        public final float readFloat() {
            throw null;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) {
            throw null;
        }

        @Override // java.io.DataInput
        public final int readInt() {
            throw null;
        }

        @Override // java.io.DataInput
        public final String readLine() {
            throw null;
        }

        @Override // java.io.DataInput
        public final long readLong() {
            throw null;
        }

        @Override // java.io.DataInput
        public final short readShort() {
            throw null;
        }

        @Override // java.io.DataInput
        public final String readUTF() {
            throw null;
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() {
            throw null;
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() {
            throw null;
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i11) {
            throw null;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i11, int i12) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ByteArrayDataOutputStream implements ByteArrayDataOutput {
        @Override // java.io.DataOutput
        public final void write(int i11) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeBoolean(boolean z11) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeByte(int i11) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeBytes(String str) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeChar(int i11) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeChars(String str) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeDouble(double d5) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeFloat(float f5) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeInt(int i11) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeLong(long j11) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeShort(int i11) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeUTF(String str) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void write(byte[] bArr) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void write(byte[] bArr, int i11, int i12) {
            throw null;
        }
    }

    static {
        new OutputStream() { // from class: com.google.common.io.ByteStreams.1
            public final String toString() {
                return "ByteStreams.nullOutputStream()";
            }

            @Override // java.io.OutputStream
            public final void write(int i11) {
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr) {
                bArr.getClass();
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr, int i11, int i12) {
                bArr.getClass();
                Preconditions.m(i11, i12 + i11, bArr.length);
            }
        };
    }

    private ByteStreams() {
    }

    public static byte[] a(ArrayDeque arrayDeque, int i11) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i11) {
            return bArr;
        }
        int length = i11 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i11);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i11 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static void b(LittleEndianDataInputStream littleEndianDataInputStream, byte[] bArr, int i11, int i12) {
        bArr.getClass();
        if (i12 < 0) {
            throw new IndexOutOfBoundsException(p0.h(i12, "len (", ") cannot be negative"));
        }
        Preconditions.m(i11, i11 + i12, bArr.length);
        int i13 = 0;
        while (i13 < i12) {
            int i14 = littleEndianDataInputStream.read(bArr, i11 + i13, i12 - i13);
            if (i14 == -1) {
                break;
            } else {
                i13 += i14;
            }
        }
        if (i13 != i12) {
            throw new EOFException(p0.l("reached end of stream after reading ", i13, " bytes; ", i12, " bytes expected"));
        }
    }

    public static byte[] c(InputStream inputStream) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(OSSConstants.DEFAULT_BUFFER_SIZE, Math.max(128, Integer.highestOneBit(0) * 2));
        int i11 = 0;
        while (i11 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i11);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i12 = 0;
            while (i12 < iMin2) {
                int i13 = inputStream.read(bArr, i12, iMin2 - i12);
                if (i13 == -1) {
                    return a(arrayDeque, i11);
                }
                i12 += i13;
                i11 += i13;
            }
            iMin = Ints.e(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class LimitedInputStream extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f17441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f17442b;

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f17441a);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void mark(int i11) {
            ((FilterInputStream) this).in.mark(i11);
            this.f17442b = this.f17441a;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            if (this.f17441a == 0) {
                return -1;
            }
            int i11 = ((FilterInputStream) this).in.read();
            if (i11 != -1) {
                this.f17441a--;
            }
            return i11;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f17442b == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f17441a = this.f17442b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final long skip(long j11) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(j11, this.f17441a));
            this.f17441a -= jSkip;
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i11, int i12) throws IOException {
            long j11 = this.f17441a;
            if (j11 == 0) {
                return -1;
            }
            int i13 = ((FilterInputStream) this).in.read(bArr, i11, (int) Math.min(i12, j11));
            if (i13 != -1) {
                this.f17441a -= (long) i13;
            }
            return i13;
        }
    }
}
