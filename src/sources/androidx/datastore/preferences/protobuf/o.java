package androidx.datastore.preferences.protobuf;

import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends hz.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f1523f = Logger.getLogger(o.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f1524g = q1.f1543e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l0 f1525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f1526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m00.h f1529e;

    public static int d0(int i11, i iVar) {
        int iF0 = f0(i11);
        int size = iVar.size();
        return g0(size) + size + iF0;
    }

    public static int e0(String str) {
        int length;
        try {
            length = t1.a(str);
        } catch (s1 unused) {
            length = str.getBytes(e0.f1463a).length;
        }
        return g0(length) + length;
    }

    public static int f0(int i11) {
        return g0(i11 << 3);
    }

    public static int g0(int i11) {
        return (352 - (Integer.numberOfLeadingZeros(i11) * 9)) >>> 6;
    }

    public static int h0(long j11) {
        return (640 - (Long.numberOfLeadingZeros(j11) * 9)) >>> 6;
    }

    public final void A0(int i11) throws IOException {
        j0(5);
        b0(i11);
    }

    public final void B0(int i11, long j11) {
        j0(20);
        a0(i11, 0);
        c0(j11);
    }

    public final void C0(long j11) throws IOException {
        j0(10);
        c0(j11);
    }

    @Override // hz.b
    public final void X(byte[] bArr, int i11, int i12) throws IOException {
        l0(bArr, i11, i12);
    }

    public final void Y(int i11) {
        int i12 = this.f1528d;
        int i13 = i12 + 1;
        this.f1528d = i13;
        byte[] bArr = this.f1526b;
        bArr[i12] = (byte) (i11 & 255);
        int i14 = i12 + 2;
        this.f1528d = i14;
        bArr[i13] = (byte) ((i11 >> 8) & 255);
        int i15 = i12 + 3;
        this.f1528d = i15;
        bArr[i14] = (byte) ((i11 >> 16) & 255);
        this.f1528d = i12 + 4;
        bArr[i15] = (byte) ((i11 >> 24) & 255);
    }

    public final void Z(long j11) {
        int i11 = this.f1528d;
        int i12 = i11 + 1;
        this.f1528d = i12;
        byte[] bArr = this.f1526b;
        bArr[i11] = (byte) (j11 & 255);
        int i13 = i11 + 2;
        this.f1528d = i13;
        bArr[i12] = (byte) ((j11 >> 8) & 255);
        int i14 = i11 + 3;
        this.f1528d = i14;
        bArr[i13] = (byte) ((j11 >> 16) & 255);
        int i15 = i11 + 4;
        this.f1528d = i15;
        bArr[i14] = (byte) (255 & (j11 >> 24));
        int i16 = i11 + 5;
        this.f1528d = i16;
        bArr[i15] = (byte) (((int) (j11 >> 32)) & 255);
        int i17 = i11 + 6;
        this.f1528d = i17;
        bArr[i16] = (byte) (((int) (j11 >> 40)) & 255);
        int i18 = i11 + 7;
        this.f1528d = i18;
        bArr[i17] = (byte) (((int) (j11 >> 48)) & 255);
        this.f1528d = i11 + 8;
        bArr[i18] = (byte) (((int) (j11 >> 56)) & 255);
    }

    public final void a0(int i11, int i12) {
        b0((i11 << 3) | i12);
    }

    public final void b0(int i11) {
        boolean z11 = f1524g;
        byte[] bArr = this.f1526b;
        if (z11) {
            while ((i11 & (-128)) != 0) {
                int i12 = this.f1528d;
                this.f1528d = i12 + 1;
                q1.j(bArr, i12, (byte) ((i11 | 128) & 255));
                i11 >>>= 7;
            }
            int i13 = this.f1528d;
            this.f1528d = i13 + 1;
            q1.j(bArr, i13, (byte) i11);
            return;
        }
        while ((i11 & (-128)) != 0) {
            int i14 = this.f1528d;
            this.f1528d = i14 + 1;
            bArr[i14] = (byte) ((i11 | 128) & 255);
            i11 >>>= 7;
        }
        int i15 = this.f1528d;
        this.f1528d = i15 + 1;
        bArr[i15] = (byte) i11;
    }

    public final void c0(long j11) {
        boolean z11 = f1524g;
        byte[] bArr = this.f1526b;
        if (z11) {
            while ((j11 & (-128)) != 0) {
                int i11 = this.f1528d;
                this.f1528d = i11 + 1;
                q1.j(bArr, i11, (byte) ((((int) j11) | 128) & 255));
                j11 >>>= 7;
            }
            int i12 = this.f1528d;
            this.f1528d = i12 + 1;
            q1.j(bArr, i12, (byte) j11);
            return;
        }
        while ((j11 & (-128)) != 0) {
            int i13 = this.f1528d;
            this.f1528d = i13 + 1;
            bArr[i13] = (byte) ((((int) j11) | 128) & 255);
            j11 >>>= 7;
        }
        int i14 = this.f1528d;
        this.f1528d = i14 + 1;
        bArr[i14] = (byte) j11;
    }

    public final void i0() throws IOException {
        this.f1529e.write(this.f1526b, 0, this.f1528d);
        this.f1528d = 0;
    }

    public final void j0(int i11) throws IOException {
        if (this.f1527c - this.f1528d < i11) {
            i0();
        }
    }

    public final void k0(byte b3) throws IOException {
        if (this.f1528d == this.f1527c) {
            i0();
        }
        int i11 = this.f1528d;
        this.f1528d = i11 + 1;
        this.f1526b[i11] = b3;
    }

    public final void l0(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = this.f1528d;
        int i14 = this.f1527c;
        int i15 = i14 - i13;
        byte[] bArr2 = this.f1526b;
        if (i15 >= i12) {
            System.arraycopy(bArr, i11, bArr2, i13, i12);
            this.f1528d += i12;
            return;
        }
        System.arraycopy(bArr, i11, bArr2, i13, i15);
        int i16 = i11 + i15;
        int i17 = i12 - i15;
        this.f1528d = i14;
        i0();
        if (i17 > i14) {
            this.f1529e.write(bArr, i16, i17);
        } else {
            System.arraycopy(bArr, i16, bArr2, 0, i17);
            this.f1528d = i17;
        }
    }

    public final void m0(int i11, boolean z11) throws IOException {
        j0(11);
        a0(i11, 0);
        byte b3 = z11 ? (byte) 1 : (byte) 0;
        int i12 = this.f1528d;
        this.f1528d = i12 + 1;
        this.f1526b[i12] = b3;
    }

    public final void n0(int i11, i iVar) throws IOException {
        y0(i11, 2);
        o0(iVar);
    }

    public final void o0(i iVar) throws IOException {
        A0(iVar.size());
        h hVar = (h) iVar;
        X(hVar.f1479d, hVar.h(), hVar.size());
    }

    public final void p0(int i11, int i12) {
        j0(14);
        a0(i11, 5);
        Y(i12);
    }

    public final void q0(int i11) throws IOException {
        j0(4);
        Y(i11);
    }

    public final void r0(int i11, long j11) {
        j0(18);
        a0(i11, 1);
        Z(j11);
    }

    public final void s0(long j11) throws IOException {
        j0(8);
        Z(j11);
    }

    public final void t0(int i11, int i12) throws IOException {
        j0(20);
        a0(i11, 0);
        if (i12 >= 0) {
            b0(i12);
        } else {
            c0(i12);
        }
    }

    public final void u0(int i11) throws IOException {
        if (i11 >= 0) {
            A0(i11);
        } else {
            C0(i11);
        }
    }

    public final void v0(int i11, a aVar, d1 d1Var) throws IOException {
        y0(i11, 2);
        A0(aVar.a(d1Var));
        d1Var.e(aVar, this.f1525a);
    }

    public final void w0(int i11, String str) throws IOException {
        y0(i11, 2);
        x0(str);
    }

    public final void x0(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iG0 = g0(length);
            int i11 = iG0 + length;
            int i12 = this.f1527c;
            if (i11 > i12) {
                byte[] bArr = new byte[length];
                int iT = t1.f1566a.t(str, bArr, 0, length);
                A0(iT);
                l0(bArr, 0, iT);
                return;
            }
            if (i11 > i12 - this.f1528d) {
                i0();
            }
            int iG1 = g0(str.length());
            int i13 = this.f1528d;
            byte[] bArr2 = this.f1526b;
            try {
                try {
                    if (iG1 == iG0) {
                        int i14 = i13 + iG1;
                        this.f1528d = i14;
                        int iT2 = t1.f1566a.t(str, bArr2, i14, i12 - i14);
                        this.f1528d = i13;
                        b0((iT2 - i13) - iG1);
                        this.f1528d = iT2;
                    } else {
                        int iA = t1.a(str);
                        b0(iA);
                        this.f1528d = t1.f1566a.t(str, bArr2, this.f1528d, iA);
                    }
                } catch (s1 e8) {
                    this.f1528d = i13;
                    throw e8;
                }
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new CodedOutputStream$OutOfSpaceException(e10);
            }
        } catch (s1 e11) {
            f1523f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e11);
            byte[] bytes = str.getBytes(e0.f1463a);
            try {
                A0(bytes.length);
                X(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e12) {
                throw new CodedOutputStream$OutOfSpaceException(e12);
            }
        }
    }

    public final void y0(int i11, int i12) {
        A0((i11 << 3) | i12);
    }

    public final void z0(int i11, int i12) throws IOException {
        j0(20);
        a0(i11, 0);
        b0(i12);
    }

    public o(m00.h hVar, int i11) {
        if (i11 >= 0) {
            int iMax = Math.max(i11, 20);
            this.f1526b = new byte[iMax];
            this.f1527c = iMax;
            this.f1529e = hVar;
            return;
        }
        throw new IllegalArgumentException(gkbGsXmgaxRjJ.zUzAPWfTbZxb);
    }
}
