package com.google.android.gms.internal.measurement;

import java.util.Locale;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzacx extends zzada {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f11236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11238e;

    public zzacx(byte[] bArr, int i11) {
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(p.p("Array range is invalid. Buffer.length=", length, i11, ", offset=0, length="));
        }
        this.f11236c = bArr;
        this.f11238e = 0;
        this.f11237d = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final int A() {
        return this.f11237d - this.f11238e;
    }

    public final void B(byte[] bArr, int i11, int i12) throws zzacy {
        try {
            System.arraycopy(bArr, i11, this.f11236c, this.f11238e, i12);
            this.f11238e += i12;
        } catch (IndexOutOfBoundsException e8) {
            throw new zzacy(this.f11238e, this.f11237d, i12, e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacj
    public final void a(byte[] bArr, int i11, int i12) throws zzacy {
        B(bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void f(int i11, int i12) throws zzacy {
        v((i11 << 3) | i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void g(int i11, int i12) throws zzacy {
        v(i11 << 3);
        u(i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void h(int i11, int i12) throws zzacy {
        v(i11 << 3);
        v(i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void i(int i11, int i12) throws zzacy {
        v((i11 << 3) | 5);
        w(i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void j(int i11, long j11) throws zzacy {
        v(i11 << 3);
        x(j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void k(int i11, long j11) throws zzacy {
        v((i11 << 3) | 1);
        y(j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void l(int i11, boolean z11) throws zzacy {
        v(i11 << 3);
        t(z11 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void m(int i11, String str) throws zzacy {
        v((i11 << 3) | 2);
        z(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void n(int i11, zzacr zzacrVar) throws zzacy {
        v((i11 << 3) | 2);
        o(zzacrVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void o(zzacr zzacrVar) throws zzacy {
        v(zzacrVar.d());
        zzacrVar.g(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void p(byte[] bArr, int i11) throws zzacy {
        v(i11);
        B(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void q(int i11, zzafc zzafcVar) throws zzacy {
        v(11);
        h(2, i11);
        v(26);
        s(zzafcVar);
        v(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void r(int i11, zzacr zzacrVar) throws zzacy {
        v(11);
        h(2, i11);
        n(3, zzacrVar);
        v(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void s(zzafc zzafcVar) throws zzacy {
        v(zzafcVar.h());
        zzafcVar.i(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void t(byte b3) throws zzacy {
        int i11 = this.f11238e;
        try {
            int i12 = i11 + 1;
            try {
                this.f11236c[i11] = b3;
                this.f11238e = i12;
            } catch (IndexOutOfBoundsException e8) {
                e = e8;
                i11 = i12;
                throw new zzacy(i11, this.f11237d, 1, e);
            }
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void u(int i11) throws zzacy {
        if (i11 >= 0) {
            v(i11);
        } else {
            x(i11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void v(int i11) throws zzacy {
        int i12;
        int i13 = this.f11238e;
        while (true) {
            int i14 = i11 & (-128);
            byte[] bArr = this.f11236c;
            if (i14 == 0) {
                i12 = i13 + 1;
                bArr[i13] = (byte) i11;
                this.f11238e = i12;
                return;
            } else {
                i12 = i13 + 1;
                try {
                    bArr[i13] = (byte) (i11 | 128);
                    i11 >>>= 7;
                    i13 = i12;
                } catch (IndexOutOfBoundsException e8) {
                    throw new zzacy(i12, this.f11237d, 1, e8);
                }
            }
            throw new zzacy(i12, this.f11237d, 1, e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void w(int i11) throws zzacy {
        int i12 = this.f11238e;
        try {
            byte[] bArr = this.f11236c;
            bArr[i12] = (byte) i11;
            bArr[i12 + 1] = (byte) (i11 >> 8);
            bArr[i12 + 2] = (byte) (i11 >> 16);
            bArr[i12 + 3] = (byte) (i11 >> 24);
            this.f11238e = i12 + 4;
        } catch (IndexOutOfBoundsException e8) {
            throw new zzacy(i12, this.f11237d, 4, e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void x(long j11) throws zzacy {
        int i11;
        int i12 = this.f11238e;
        int i13 = this.f11237d;
        byte[] bArr = this.f11236c;
        if (!zzada.f11245b || i13 - i12 < 10) {
            long j12 = j11;
            while ((j12 & (-128)) != 0) {
                int i14 = i12 + 1;
                try {
                    bArr[i12] = (byte) (((int) j12) | 128);
                    j12 >>>= 7;
                    i12 = i14;
                } catch (IndexOutOfBoundsException e8) {
                    e = e8;
                    i11 = i14;
                    throw new zzacy(i11, i13, 1, e);
                }
            }
            i11 = i12 + 1;
            try {
                bArr[i12] = (byte) j12;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                throw new zzacy(i11, i13, 1, e);
            }
        } else {
            long j13 = j11;
            while ((j13 & (-128)) != 0) {
                zzagg.k(bArr, i12, (byte) (((int) j13) | 128));
                j13 >>>= 7;
                i12++;
            }
            i11 = i12 + 1;
            zzagg.k(bArr, i12, (byte) j13);
        }
        this.f11238e = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void y(long j11) throws zzacy {
        int i11 = this.f11238e;
        try {
            byte[] bArr = this.f11236c;
            bArr[i11] = (byte) j11;
            bArr[i11 + 1] = (byte) (j11 >> 8);
            bArr[i11 + 2] = (byte) (j11 >> 16);
            bArr[i11 + 3] = (byte) (j11 >> 24);
            bArr[i11 + 4] = (byte) (j11 >> 32);
            bArr[i11 + 5] = (byte) (j11 >> 40);
            bArr[i11 + 6] = (byte) (j11 >> 48);
            bArr[i11 + 7] = (byte) (j11 >> 56);
            this.f11238e = i11 + 8;
        } catch (IndexOutOfBoundsException e8) {
            throw new zzacy(i11, this.f11237d, 8, e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void z(String str) throws zzacy {
        int i11 = this.f11238e;
        try {
            int iB = zzada.b(str.length() * 3);
            int iB2 = zzada.b(str.length());
            byte[] bArr = this.f11236c;
            if (iB2 != iB) {
                v(zzagl.b(str));
                int i12 = this.f11238e;
                this.f11238e = zzagl.c(str, bArr, i12, bArr.length - i12);
            } else {
                int i13 = i11 + iB2;
                this.f11238e = i13;
                int iC = zzagl.c(str, bArr, i13, bArr.length - i13);
                this.f11238e = i11;
                v((iC - i11) - iB2);
                this.f11238e = iC;
            }
        } catch (IndexOutOfBoundsException e8) {
            throw new zzacy(e8);
        }
    }
}
