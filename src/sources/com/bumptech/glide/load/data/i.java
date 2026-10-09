package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends FilterInputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f7660c = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f7661d = 31;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f7662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7663b;

    public i(InputStream inputStream, int i11) {
        super(inputStream);
        if (i11 < -1 || i11 > 8) {
            throw new IllegalArgumentException(p.j(i11, "Cannot add invalid orientation: "));
        }
        this.f7662a = (byte) i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i11;
        int i12;
        int i13 = this.f7663b;
        if (i13 < 2 || i13 > (i12 = f7661d)) {
            i11 = super.read();
        } else {
            i11 = i13 == i12 ? this.f7662a : f7660c[i13 - 2] & 255;
        }
        if (i11 != -1) {
            this.f7663b++;
        }
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j11) throws IOException {
        long jSkip = super.skip(j11);
        if (jSkip > 0) {
            this.f7663b = (int) (((long) this.f7663b) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13;
        int i14 = this.f7663b;
        int i15 = f7661d;
        if (i14 > i15) {
            i13 = super.read(bArr, i11, i12);
        } else if (i14 == i15) {
            bArr[i11] = this.f7662a;
            i13 = 1;
        } else if (i14 < 2) {
            i13 = super.read(bArr, i11, 2 - i14);
        } else {
            int iMin = Math.min(i15 - i14, i12);
            System.arraycopy(f7660c, this.f7663b - 2, bArr, i11, iMin);
            i13 = iMin;
        }
        if (i13 > 0) {
            this.f7663b += i13;
        }
        return i13;
    }
}
