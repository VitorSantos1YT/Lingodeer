package com.google.common.io;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class LittleEndianDataOutputStream extends FilterOutputStream implements DataOutput {
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public final void write(byte[] bArr, int i11, int i12) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i11, i12);
    }

    @Override // java.io.DataOutput
    public final void writeBoolean(boolean z11) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBoolean(z11);
    }

    @Override // java.io.DataOutput
    public final void writeByte(int i11) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeByte(i11);
    }

    @Override // java.io.DataOutput
    public final void writeBytes(String str) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBytes(str);
    }

    @Override // java.io.DataOutput
    public final void writeChar(int i11) throws IOException {
        writeShort(i11);
    }

    @Override // java.io.DataOutput
    public final void writeChars(String str) throws IOException {
        for (int i11 = 0; i11 < str.length(); i11++) {
            writeShort(str.charAt(i11));
        }
    }

    @Override // java.io.DataOutput
    public final void writeDouble(double d5) throws IOException {
        writeLong(Double.doubleToLongBits(d5));
    }

    @Override // java.io.DataOutput
    public final void writeFloat(float f5) throws IOException {
        writeInt(Float.floatToIntBits(f5));
    }

    @Override // java.io.DataOutput
    public final void writeInt(int i11) throws IOException {
        ((FilterOutputStream) this).out.write(i11 & 255);
        ((FilterOutputStream) this).out.write((i11 >> 8) & 255);
        ((FilterOutputStream) this).out.write((i11 >> 16) & 255);
        ((FilterOutputStream) this).out.write((i11 >> 24) & 255);
    }

    @Override // java.io.DataOutput
    public final void writeLong(long j11) throws IOException {
        long jReverseBytes = Long.reverseBytes(j11);
        byte[] bArr = new byte[8];
        for (int i11 = 7; i11 >= 0; i11--) {
            bArr[i11] = (byte) (255 & jReverseBytes);
            jReverseBytes >>= 8;
        }
        write(bArr, 0, 8);
    }

    @Override // java.io.DataOutput
    public final void writeShort(int i11) throws IOException {
        ((FilterOutputStream) this).out.write(i11 & 255);
        ((FilterOutputStream) this).out.write((i11 >> 8) & 255);
    }

    @Override // java.io.DataOutput
    public final void writeUTF(String str) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeUTF(str);
    }
}
