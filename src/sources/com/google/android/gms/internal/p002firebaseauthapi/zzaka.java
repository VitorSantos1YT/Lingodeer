package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Locale;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaka extends zzakb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f10102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10104e;

    public zzaka(byte[] bArr, int i11) {
        super(0);
        if (((bArr.length - i11) | i11) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(p.p("Array range is invalid. Buffer.length=", bArr.length, i11, ", offset=0, length="));
        }
        this.f10102c = bArr;
        this.f10104e = 0;
        this.f10103d = i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajf
    public final void a(byte[] bArr, int i11, int i12) throws zzakd {
        try {
            System.arraycopy(bArr, i11, this.f10102c, this.f10104e, i12);
            this.f10104e += i12;
        } catch (IndexOutOfBoundsException e8) {
            throw new zzakd(this.f10104e, this.f10103d, i12, e8);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int b() {
        return this.f10103d - this.f10104e;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void c(byte b3) throws zzakd {
        int i11 = this.f10104e;
        try {
            int i12 = i11 + 1;
            try {
                this.f10102c[i11] = b3;
                this.f10104e = i12;
            } catch (IndexOutOfBoundsException e8) {
                e = e8;
                i11 = i12;
                throw new zzakd(i11, this.f10103d, 1, e);
            }
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void d(int i11) throws zzakd {
        int i12 = this.f10104e;
        try {
            byte[] bArr = this.f10102c;
            bArr[i12] = (byte) i11;
            bArr[i12 + 1] = (byte) (i11 >> 8);
            bArr[i12 + 2] = (byte) (i11 >> 16);
            bArr[i12 + 3] = i11 >> 24;
            this.f10104e = i12 + 4;
        } catch (IndexOutOfBoundsException e8) {
            throw new zzakd(i12, this.f10103d, 4, e8);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void e(int i11, int i12) throws zzakd {
        s(i11, 5);
        d(i12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void f(int i11, long j11) throws zzakd {
        s(i11, 1);
        k(j11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void g(int i11, zzaje zzajeVar) throws zzakd {
        s(i11, 2);
        r(zzajeVar.d());
        zzajeVar.h(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void h(int i11, zzaly zzalyVar) throws zzakd {
        s(1, 3);
        t(2, i11);
        s(3, 2);
        r(zzalyVar.zzl());
        zzalyVar.a(this);
        s(1, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void i(int i11, String str) throws zzakd {
        s(i11, 2);
        int i12 = this.f10104e;
        try {
            int iX = zzakb.x(str.length() * 3);
            int iX2 = zzakb.x(str.length());
            byte[] bArr = this.f10102c;
            if (iX2 != iX) {
                r(zzanl.a(str));
                int i13 = this.f10104e;
                this.f10104e = zzanl.b(str, bArr, i13, bArr.length - i13);
            } else {
                int i14 = i12 + iX2;
                this.f10104e = i14;
                int iB = zzanl.b(str, bArr, i14, bArr.length - i14);
                this.f10104e = i12;
                r((iB - i12) - iX2);
                this.f10104e = iB;
            }
        } catch (IndexOutOfBoundsException e8) {
            throw new zzakd(e8);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void j(int i11, boolean z11) throws zzakd {
        s(i11, 0);
        c(z11 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void k(long j11) throws zzakd {
        int i11 = this.f10104e;
        try {
            byte[] bArr = this.f10102c;
            bArr[i11] = (byte) j11;
            bArr[i11 + 1] = (byte) (j11 >> 8);
            bArr[i11 + 2] = (byte) (j11 >> 16);
            bArr[i11 + 3] = (byte) (j11 >> 24);
            bArr[i11 + 4] = (byte) (j11 >> 32);
            bArr[i11 + 5] = (byte) (j11 >> 40);
            bArr[i11 + 6] = (byte) (j11 >> 48);
            bArr[i11 + 7] = (byte) (j11 >> 56);
            this.f10104e = i11 + 8;
        } catch (IndexOutOfBoundsException e8) {
            throw new zzakd(i11, this.f10103d, 8, e8);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void l(int i11) throws zzakd {
        if (i11 >= 0) {
            r(i11);
        } else {
            p(i11);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void m(int i11, int i12) throws zzakd {
        s(i11, 0);
        l(i12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void n(int i11, long j11) throws zzakd {
        s(i11, 0);
        p(j11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void o(int i11, zzaje zzajeVar) throws zzakd {
        s(1, 3);
        t(2, i11);
        g(3, zzajeVar);
        s(1, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void p(long j11) throws zzakd {
        int i11;
        int i12 = this.f10104e;
        boolean z11 = zzakb.f10105b;
        byte[] bArr = this.f10102c;
        if (!z11 || b() < 10) {
            while ((j11 & (-128)) != 0) {
                i11 = i12 + 1;
                try {
                    bArr[i12] = (byte) (((int) j11) | 128);
                    j11 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e8) {
                    throw new zzakd(i11, this.f10103d, 1, e8);
                }
            }
            i11 = i12 + 1;
            bArr[i12] = (byte) j11;
        } else {
            while ((j11 & (-128)) != 0) {
                zzank.e(bArr, i12, (byte) (((int) j11) | 128));
                j11 >>>= 7;
                i12++;
            }
            i11 = i12 + 1;
            zzank.e(bArr, i12, (byte) j11);
        }
        this.f10104e = i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void r(int i11) throws zzakd {
        int i12;
        int i13 = this.f10104e;
        while (true) {
            int i14 = i11 & (-128);
            byte[] bArr = this.f10102c;
            if (i14 == 0) {
                i12 = i13 + 1;
                bArr[i13] = (byte) i11;
                this.f10104e = i12;
                return;
            } else {
                i12 = i13 + 1;
                try {
                    bArr[i13] = (byte) (i11 | 128);
                    i11 >>>= 7;
                    i13 = i12;
                } catch (IndexOutOfBoundsException e8) {
                    throw new zzakd(i12, this.f10103d, 1, e8);
                }
            }
            throw new zzakd(i12, this.f10103d, 1, e8);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void s(int i11, int i12) throws zzakd {
        r((i11 << 3) | i12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void t(int i11, int i12) throws zzakd {
        s(i11, 0);
        r(i12);
    }
}
