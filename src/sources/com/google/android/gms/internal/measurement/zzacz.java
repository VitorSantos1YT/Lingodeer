package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzacz extends zzada {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f11239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final OutputStream f11242f;

    public zzacz(OutputStream outputStream, int i11) {
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f11242f = outputStream;
        if (i11 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i11, 20)];
        this.f11239c = bArr;
        this.f11240d = bArr.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final int A() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public final void B(long j11) {
        boolean z11 = zzada.f11245b;
        byte[] bArr = this.f11239c;
        if (z11) {
            while (true) {
                int i11 = (int) j11;
                if ((j11 & (-128)) == 0) {
                    int i12 = this.f11241e;
                    this.f11241e = i12 + 1;
                    zzagg.k(bArr, i12, (byte) i11);
                    return;
                } else {
                    int i13 = this.f11241e;
                    this.f11241e = i13 + 1;
                    zzagg.k(bArr, i13, (byte) (i11 | 128));
                    j11 >>>= 7;
                }
            }
        } else {
            while (true) {
                int i14 = (int) j11;
                if ((j11 & (-128)) == 0) {
                    int i15 = this.f11241e;
                    this.f11241e = i15 + 1;
                    bArr[i15] = (byte) i14;
                    return;
                } else {
                    int i16 = this.f11241e;
                    this.f11241e = i16 + 1;
                    bArr[i16] = (byte) (i14 | 128);
                    j11 >>>= 7;
                }
            }
        }
    }

    public final void C(int i11) {
        int i12 = this.f11241e;
        byte[] bArr = this.f11239c;
        bArr[i12] = (byte) i11;
        bArr[i12 + 1] = (byte) (i11 >> 8);
        bArr[i12 + 2] = (byte) (i11 >> 16);
        bArr[i12 + 3] = (byte) (i11 >> 24);
        this.f11241e = i12 + 4;
    }

    public final void D(long j11) {
        int i11 = this.f11241e;
        byte[] bArr = this.f11239c;
        bArr[i11] = (byte) j11;
        bArr[i11 + 1] = (byte) (j11 >> 8);
        bArr[i11 + 2] = (byte) (j11 >> 16);
        bArr[i11 + 3] = (byte) (j11 >> 24);
        bArr[i11 + 4] = (byte) (j11 >> 32);
        bArr[i11 + 5] = (byte) (j11 >> 40);
        bArr[i11 + 6] = (byte) (j11 >> 48);
        bArr[i11 + 7] = (byte) (j11 >> 56);
        this.f11241e = i11 + 8;
    }

    public final void E(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = this.f11241e;
        int i14 = this.f11240d;
        int i15 = i14 - i13;
        byte[] bArr2 = this.f11239c;
        if (i15 >= i12) {
            System.arraycopy(bArr, i11, bArr2, i13, i12);
            this.f11241e += i12;
            return;
        }
        System.arraycopy(bArr, i11, bArr2, i13, i15);
        int i16 = i11 + i15;
        this.f11241e = i14;
        G();
        int i17 = i12 - i15;
        if (i17 > i14) {
            this.f11242f.write(bArr, i16, i17);
        } else {
            System.arraycopy(bArr, i16, bArr2, 0, i17);
            this.f11241e = i17;
        }
    }

    public final void F(int i11) {
        if (this.f11240d - this.f11241e < i11) {
            G();
        }
    }

    public final void G() {
        this.f11242f.write(this.f11239c, 0, this.f11241e);
        this.f11241e = 0;
    }

    public final void H(int i11) {
        boolean z11 = zzada.f11245b;
        byte[] bArr = this.f11239c;
        if (z11) {
            while ((i11 & (-128)) != 0) {
                int i12 = this.f11241e;
                this.f11241e = i12 + 1;
                zzagg.k(bArr, i12, (byte) (i11 | 128));
                i11 >>>= 7;
            }
            int i13 = this.f11241e;
            this.f11241e = i13 + 1;
            zzagg.k(bArr, i13, (byte) i11);
            return;
        }
        while ((i11 & (-128)) != 0) {
            int i14 = this.f11241e;
            this.f11241e = i14 + 1;
            bArr[i14] = (byte) (i11 | 128);
            i11 >>>= 7;
        }
        int i15 = this.f11241e;
        this.f11241e = i15 + 1;
        bArr[i15] = (byte) i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzacj
    public final void a(byte[] bArr, int i11, int i12) throws IOException {
        E(bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void f(int i11, int i12) {
        v((i11 << 3) | i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void g(int i11, int i12) {
        F(20);
        H(i11 << 3);
        if (i12 >= 0) {
            H(i12);
        } else {
            B(i12);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void h(int i11, int i12) {
        F(20);
        H(i11 << 3);
        H(i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void i(int i11, int i12) {
        F(14);
        H((i11 << 3) | 5);
        C(i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void j(int i11, long j11) {
        F(20);
        H(i11 << 3);
        B(j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void k(int i11, long j11) {
        F(18);
        H((i11 << 3) | 1);
        D(j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void l(int i11, boolean z11) {
        F(11);
        H(i11 << 3);
        int i12 = this.f11241e;
        this.f11239c[i12] = z11 ? (byte) 1 : (byte) 0;
        this.f11241e = i12 + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void m(int i11, String str) throws IOException {
        v((i11 << 3) | 2);
        z(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void n(int i11, zzacr zzacrVar) {
        v((i11 << 3) | 2);
        o(zzacrVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void o(zzacr zzacrVar) {
        v(zzacrVar.d());
        zzacrVar.g(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void p(byte[] bArr, int i11) throws IOException {
        v(i11);
        E(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void q(int i11, zzafc zzafcVar) {
        v(11);
        h(2, i11);
        v(26);
        s(zzafcVar);
        v(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void r(int i11, zzacr zzacrVar) {
        v(11);
        h(2, i11);
        n(3, zzacrVar);
        v(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void s(zzafc zzafcVar) {
        v(zzafcVar.h());
        zzafcVar.i(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void t(byte b3) {
        if (this.f11241e == this.f11240d) {
            G();
        }
        int i11 = this.f11241e;
        this.f11239c[i11] = b3;
        this.f11241e = i11 + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void u(int i11) {
        if (i11 >= 0) {
            v(i11);
        } else {
            x(i11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void v(int i11) {
        F(5);
        H(i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void w(int i11) {
        F(4);
        C(i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void x(long j11) {
        F(10);
        B(j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void y(long j11) {
        F(8);
        D(j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void z(String str) throws IOException {
        int length = str.length() * 3;
        int iB = zzada.b(length);
        int i11 = iB + length;
        int i12 = this.f11240d;
        if (i11 > i12) {
            byte[] bArr = new byte[length];
            int iC = zzagl.c(str, bArr, 0, length);
            v(iC);
            E(bArr, 0, iC);
            return;
        }
        if (i11 > i12 - this.f11241e) {
            G();
        }
        int iB2 = zzada.b(str.length());
        int i13 = this.f11241e;
        byte[] bArr2 = this.f11239c;
        try {
            if (iB2 == iB) {
                int i14 = i13 + iB2;
                this.f11241e = i14;
                int iC2 = zzagl.c(str, bArr2, i14, i12 - i14);
                this.f11241e = i13;
                H((iC2 - i13) - iB2);
                this.f11241e = iC2;
            } else {
                int iB3 = zzagl.b(str);
                H(iB3);
                this.f11241e = zzagl.c(str, bArr2, this.f11241e, iB3);
            }
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw new zzacy(e8);
        }
    }
}
