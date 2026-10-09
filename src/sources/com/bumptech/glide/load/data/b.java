package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f7652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f7653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.n f7654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7655d;

    public b(FileOutputStream fileOutputStream, m0.n nVar) {
        this.f7652a = fileOutputStream;
        this.f7654c = nVar;
        this.f7653b = (byte[]) nVar.d(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f7652a;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f7653b;
            if (bArr != null) {
                this.f7654c.i(bArr);
                this.f7653b = null;
            }
        } catch (Throwable th2) {
            fileOutputStream.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i11 = this.f7655d;
        FileOutputStream fileOutputStream = this.f7652a;
        if (i11 > 0) {
            fileOutputStream.write(this.f7653b, 0, i11);
            this.f7655d = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i11) throws IOException {
        byte[] bArr = this.f7653b;
        int i12 = this.f7655d;
        int i13 = i12 + 1;
        this.f7655d = i13;
        bArr[i12] = (byte) i11;
        if (i13 != bArr.length || i13 <= 0) {
            return;
        }
        this.f7652a.write(bArr, 0, i13);
        this.f7655d = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = 0;
        do {
            int i14 = i12 - i13;
            int i15 = i11 + i13;
            int i16 = this.f7655d;
            FileOutputStream fileOutputStream = this.f7652a;
            if (i16 == 0 && i14 >= this.f7653b.length) {
                fileOutputStream.write(bArr, i15, i14);
                return;
            }
            int iMin = Math.min(i14, this.f7653b.length - i16);
            System.arraycopy(bArr, i15, this.f7653b, this.f7655d, iMin);
            int i17 = this.f7655d + iMin;
            this.f7655d = i17;
            i13 += iMin;
            byte[] bArr2 = this.f7653b;
            if (i17 == bArr2.length && i17 > 0) {
                fileOutputStream.write(bArr2, 0, i17);
                this.f7655d = 0;
            }
        } while (i13 < i12);
    }
}
