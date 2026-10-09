package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzakc extends zzakb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f10107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ByteArrayOutputStream f10110f;

    public zzakc(ByteArrayOutputStream byteArrayOutputStream, int i11) {
        super(0);
        this.f10110f = byteArrayOutputStream;
        if (i11 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i11, 20);
        this.f10107c = new byte[iMax];
        this.f10108d = iMax;
    }

    public final void A(long j11) {
        int i11 = this.f10109e;
        byte[] bArr = this.f10107c;
        bArr[i11] = (byte) j11;
        bArr[i11 + 1] = (byte) (j11 >> 8);
        bArr[i11 + 2] = (byte) (j11 >> 16);
        bArr[i11 + 3] = (byte) (j11 >> 24);
        bArr[i11 + 4] = (byte) (j11 >> 32);
        bArr[i11 + 5] = (byte) (j11 >> 40);
        bArr[i11 + 6] = (byte) (j11 >> 48);
        bArr[i11 + 7] = (byte) (j11 >> 56);
        this.f10109e = i11 + 8;
    }

    public final void B(long j11) {
        boolean z11 = zzakb.f10105b;
        byte[] bArr = this.f10107c;
        if (z11) {
            while ((j11 & (-128)) != 0) {
                int i11 = this.f10109e;
                this.f10109e = i11 + 1;
                zzank.e(bArr, i11, (byte) (((int) j11) | 128));
                j11 >>>= 7;
            }
            int i12 = this.f10109e;
            this.f10109e = i12 + 1;
            zzank.e(bArr, i12, (byte) j11);
            return;
        }
        while ((j11 & (-128)) != 0) {
            int i13 = this.f10109e;
            this.f10109e = i13 + 1;
            bArr[i13] = (byte) (((int) j11) | 128);
            j11 >>>= 7;
        }
        int i14 = this.f10109e;
        this.f10109e = i14 + 1;
        bArr[i14] = (byte) j11;
    }

    public final void C(int i11, int i12) {
        E((i11 << 3) | i12);
    }

    public final void D(int i11) {
        int i12 = this.f10109e;
        byte[] bArr = this.f10107c;
        bArr[i12] = (byte) i11;
        bArr[i12 + 1] = (byte) (i11 >> 8);
        bArr[i12 + 2] = (byte) (i11 >> 16);
        bArr[i12 + 3] = i11 >> 24;
        this.f10109e = i12 + 4;
    }

    public final void E(int i11) {
        boolean z11 = zzakb.f10105b;
        byte[] bArr = this.f10107c;
        if (z11) {
            while ((i11 & (-128)) != 0) {
                int i12 = this.f10109e;
                this.f10109e = i12 + 1;
                zzank.e(bArr, i12, (byte) (i11 | 128));
                i11 >>>= 7;
            }
            int i13 = this.f10109e;
            this.f10109e = i13 + 1;
            zzank.e(bArr, i13, (byte) i11);
            return;
        }
        while ((i11 & (-128)) != 0) {
            int i14 = this.f10109e;
            this.f10109e = i14 + 1;
            bArr[i14] = (byte) (i11 | 128);
            i11 >>>= 7;
        }
        int i15 = this.f10109e;
        this.f10109e = i15 + 1;
        bArr[i15] = (byte) i11;
    }

    public final void F(int i11) throws IOException {
        if (this.f10108d - this.f10109e < i11) {
            z();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajf
    public final void a(byte[] bArr, int i11, int i12) throws IOException {
        y(bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int b() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void c(byte b3) throws IOException {
        if (this.f10109e == this.f10108d) {
            z();
        }
        int i11 = this.f10109e;
        this.f10107c[i11] = b3;
        this.f10109e = i11 + 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void d(int i11) throws IOException {
        F(4);
        D(i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void e(int i11, int i12) throws IOException {
        F(14);
        C(i11, 5);
        D(i12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void f(int i11, long j11) throws IOException {
        F(18);
        C(i11, 1);
        A(j11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void g(int i11, zzaje zzajeVar) throws IOException {
        s(i11, 2);
        r(zzajeVar.d());
        zzajeVar.h(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void h(int i11, zzaly zzalyVar) throws IOException {
        s(1, 3);
        t(2, i11);
        s(3, 2);
        r(zzalyVar.zzl());
        zzalyVar.a(this);
        s(1, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void i(int i11, String str) throws IOException {
        s(i11, 2);
        int length = str.length() * 3;
        int iX = zzakb.x(length);
        int i12 = iX + length;
        int i13 = this.f10108d;
        if (i12 > i13) {
            byte[] bArr = new byte[length];
            int iB = zzanl.b(str, bArr, 0, length);
            r(iB);
            y(bArr, 0, iB);
            return;
        }
        if (i12 > i13 - this.f10109e) {
            z();
        }
        int iX2 = zzakb.x(str.length());
        int i14 = this.f10109e;
        byte[] bArr2 = this.f10107c;
        try {
            if (iX2 == iX) {
                int i15 = i14 + iX2;
                this.f10109e = i15;
                int iB2 = zzanl.b(str, bArr2, i15, i13 - i15);
                this.f10109e = i14;
                E((iB2 - i14) - iX2);
                this.f10109e = iB2;
            } else {
                int iA = zzanl.a(str);
                E(iA);
                this.f10109e = zzanl.b(str, bArr2, this.f10109e, iA);
            }
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw new zzakd(e8);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void j(int i11, boolean z11) throws IOException {
        F(11);
        C(i11, 0);
        byte b3 = z11 ? (byte) 1 : (byte) 0;
        int i12 = this.f10109e;
        this.f10107c[i12] = b3;
        this.f10109e = i12 + 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void k(long j11) throws IOException {
        F(8);
        A(j11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void l(int i11) throws IOException {
        if (i11 >= 0) {
            r(i11);
        } else {
            p(i11);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void m(int i11, int i12) throws IOException {
        F(20);
        C(i11, 0);
        if (i12 >= 0) {
            E(i12);
        } else {
            B(i12);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void n(int i11, long j11) throws IOException {
        F(20);
        C(i11, 0);
        B(j11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void o(int i11, zzaje zzajeVar) throws IOException {
        s(1, 3);
        t(2, i11);
        g(3, zzajeVar);
        s(1, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void p(long j11) throws IOException {
        F(10);
        B(j11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void r(int i11) throws IOException {
        F(5);
        E(i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void s(int i11, int i12) throws IOException {
        r((i11 << 3) | i12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void t(int i11, int i12) throws IOException {
        F(20);
        C(i11, 0);
        E(i12);
    }

    public final void y(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = this.f10109e;
        int i14 = this.f10108d;
        int i15 = i14 - i13;
        byte[] bArr2 = this.f10107c;
        if (i15 >= i12) {
            System.arraycopy(bArr, i11, bArr2, i13, i12);
            this.f10109e += i12;
            return;
        }
        System.arraycopy(bArr, i11, bArr2, i13, i15);
        int i16 = i11 + i15;
        int i17 = i12 - i15;
        this.f10109e = i14;
        z();
        if (i17 > i14) {
            this.f10110f.write(bArr, i16, i17);
        } else {
            System.arraycopy(bArr, i16, bArr2, 0, i17);
            this.f10109e = i17;
        }
    }

    public final void z() throws IOException {
        this.f10110f.write(this.f10107c, 0, this.f10109e);
        this.f10109e = 0;
    }
}
