package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.logging.Level;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzem extends zzep {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f12353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12355f;

    public zzem(byte[] bArr, int i11) {
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(p.p("Array range is invalid. Buffer.length=", length, i11, ", offset=0, length="));
        }
        this.f12353d = bArr;
        this.f12355f = 0;
        this.f12354e = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void d(byte b3) throws zzen {
        int i11 = this.f12355f;
        try {
            int i12 = i11 + 1;
            try {
                this.f12353d[i11] = b3;
                this.f12355f = i12;
            } catch (IndexOutOfBoundsException e8) {
                e = e8;
                i11 = i12;
                throw new zzen(i11, this.f12354e, 1, e);
            }
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void e(int i11, boolean z11) throws zzen {
        s(i11 << 3);
        d(z11 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void f(int i11, zzei zzeiVar) throws zzen {
        s((i11 << 3) | 2);
        s(zzeiVar.e());
        zzeiVar.h(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void g(int i11, int i12) throws zzen {
        s((i11 << 3) | 5);
        h(i12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void h(int i11) throws zzen {
        int i12 = this.f12355f;
        try {
            byte[] bArr = this.f12353d;
            bArr[i12] = (byte) i11;
            bArr[i12 + 1] = (byte) (i11 >> 8);
            bArr[i12 + 2] = (byte) (i11 >> 16);
            bArr[i12 + 3] = (byte) (i11 >> 24);
            this.f12355f = i12 + 4;
        } catch (IndexOutOfBoundsException e8) {
            throw new zzen(i12, this.f12354e, 4, e8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void i(int i11, long j11) throws zzen {
        s((i11 << 3) | 1);
        j(j11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void j(long j11) throws zzen {
        int i11 = this.f12355f;
        try {
            byte[] bArr = this.f12353d;
            bArr[i11] = (byte) j11;
            bArr[i11 + 1] = (byte) (j11 >> 8);
            bArr[i11 + 2] = (byte) (j11 >> 16);
            bArr[i11 + 3] = (byte) (j11 >> 24);
            bArr[i11 + 4] = (byte) (j11 >> 32);
            bArr[i11 + 5] = (byte) (j11 >> 40);
            bArr[i11 + 6] = (byte) (j11 >> 48);
            bArr[i11 + 7] = (byte) (j11 >> 56);
            this.f12355f = i11 + 8;
        } catch (IndexOutOfBoundsException e8) {
            throw new zzen(i11, this.f12354e, 8, e8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void k(int i11, int i12) throws zzen {
        s(i11 << 3);
        l(i12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void l(int i11) throws zzen {
        if (i11 >= 0) {
            s(i11);
        } else {
            u(i11);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void m(int i11, zzgl zzglVar, zzgv zzgvVar) throws zzen {
        s((i11 << 3) | 2);
        s(((zzds) zzglVar).d(zzgvVar));
        zzgvVar.b(zzglVar, this.f12358a);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void n(int i11, zzgl zzglVar) throws zzen {
        s(11);
        r(2, i11);
        s(26);
        s(zzglVar.zzj());
        zzglVar.c(this);
        s(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void o(int i11, zzei zzeiVar) throws zzen {
        s(11);
        r(2, i11);
        f(3, zzeiVar);
        s(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void p(int i11, String str) throws zzen {
        s((i11 << 3) | 2);
        int i12 = this.f12355f;
        try {
            int iB = zzep.b(str.length() * 3);
            int iB2 = zzep.b(str.length());
            int i13 = this.f12354e;
            byte[] bArr = this.f12353d;
            if (iB2 != iB) {
                s(zzhr.c(str));
                int i14 = this.f12355f;
                this.f12355f = zzhr.b(str, bArr, i14, i13 - i14);
            } else {
                int i15 = i12 + iB2;
                this.f12355f = i15;
                int iB3 = zzhr.b(str, bArr, i15, i13 - i15);
                this.f12355f = i12;
                s((iB3 - i12) - iB2);
                this.f12355f = iB3;
            }
        } catch (zzhq e8) {
            this.f12355f = i12;
            zzep.f12356b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e8);
            byte[] bytes = str.getBytes(zzfo.f12383a);
            try {
                int length = bytes.length;
                s(length);
                w(bytes, length);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzen(e10);
            }
        } catch (IndexOutOfBoundsException e11) {
            throw new zzen(e11);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void q(int i11, int i12) throws zzen {
        s((i11 << 3) | i12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void r(int i11, int i12) throws zzen {
        s(i11 << 3);
        s(i12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void s(int i11) throws zzen {
        int i12;
        int i13 = this.f12355f;
        while (true) {
            int i14 = i11 & (-128);
            byte[] bArr = this.f12353d;
            if (i14 == 0) {
                i12 = i13 + 1;
                bArr[i13] = (byte) i11;
                this.f12355f = i12;
                return;
            } else {
                i12 = i13 + 1;
                try {
                    bArr[i13] = (byte) (i11 | 128);
                    i11 >>>= 7;
                    i13 = i12;
                } catch (IndexOutOfBoundsException e8) {
                    throw new zzen(i12, this.f12354e, 1, e8);
                }
            }
            throw new zzen(i12, this.f12354e, 1, e8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void t(int i11, long j11) throws zzen {
        s(i11 << 3);
        u(j11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void u(long j11) throws zzen {
        int i11;
        int i12 = this.f12355f;
        boolean z11 = zzep.f12357c;
        int i13 = this.f12354e;
        byte[] bArr = this.f12353d;
        if (!z11 || i13 - i12 < 10) {
            long j12 = j11;
            while ((j12 & (-128)) != 0) {
                i11 = i12 + 1;
                try {
                    bArr[i12] = (byte) (((int) j12) | 128);
                    j12 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e8) {
                    throw new zzen(i11, i13, 1, e8);
                }
            }
            i11 = i12 + 1;
            bArr[i12] = (byte) j12;
        } else {
            long j13 = j11;
            while ((j13 & (-128)) != 0) {
                zzho.f12458c.d(bArr, zzho.f12461f + ((long) i12), (byte) (((int) j13) | 128));
                j13 >>>= 7;
                i12++;
            }
            i11 = i12 + 1;
            zzho.f12458c.d(bArr, zzho.f12461f + ((long) i12), (byte) j13);
        }
        this.f12355f = i11;
    }

    public final int v() {
        return this.f12354e - this.f12355f;
    }

    public final void w(byte[] bArr, int i11) {
        try {
            System.arraycopy(bArr, 0, this.f12353d, this.f12355f, i11);
            this.f12355f += i11;
        } catch (IndexOutOfBoundsException e8) {
            throw new zzen(this.f12355f, this.f12354e, i11, e8);
        }
    }
}
