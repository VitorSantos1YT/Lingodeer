package androidx.glance.appwidget.protobuf;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends ob.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f1958h = Logger.getLogger(l.class.getName());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f1959i = f1.f1928e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h0 f1960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f1961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m00.h f1964g;

    public l(m00.h hVar, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i11, 20);
        this.f1961d = new byte[iMax];
        this.f1962e = iMax;
        this.f1964g = hVar;
    }

    public static int Y(int i11, h hVar) {
        int iA0 = a0(i11);
        int size = hVar.size();
        return b0(size) + size + iA0;
    }

    public static int Z(String str) {
        int length;
        try {
            length = i1.a(str);
        } catch (h1 unused) {
            length = str.getBytes(b0.f1912a).length;
        }
        return b0(length) + length;
    }

    public static int a0(int i11) {
        return b0(i11 << 3);
    }

    public static int b0(int i11) {
        return (352 - (Integer.numberOfLeadingZeros(i11) * 9)) >>> 6;
    }

    public static int c0(long j11) {
        return (640 - (Long.numberOfLeadingZeros(j11) * 9)) >>> 6;
    }

    @Override // ob.f
    public final void S(byte[] bArr, int i11, int i12) throws IOException {
        f0(bArr, i11, i12);
    }

    public final void T(int i11) {
        int i12 = this.f1963f;
        int i13 = i12 + 1;
        this.f1963f = i13;
        byte[] bArr = this.f1961d;
        bArr[i12] = (byte) (i11 & 255);
        int i14 = i12 + 2;
        this.f1963f = i14;
        bArr[i13] = (byte) ((i11 >> 8) & 255);
        int i15 = i12 + 3;
        this.f1963f = i15;
        bArr[i14] = (byte) ((i11 >> 16) & 255);
        this.f1963f = i12 + 4;
        bArr[i15] = (byte) ((i11 >> 24) & 255);
    }

    public final void U(long j11) {
        int i11 = this.f1963f;
        int i12 = i11 + 1;
        this.f1963f = i12;
        byte[] bArr = this.f1961d;
        bArr[i11] = (byte) (j11 & 255);
        int i13 = i11 + 2;
        this.f1963f = i13;
        bArr[i12] = (byte) ((j11 >> 8) & 255);
        int i14 = i11 + 3;
        this.f1963f = i14;
        bArr[i13] = (byte) ((j11 >> 16) & 255);
        int i15 = i11 + 4;
        this.f1963f = i15;
        bArr[i14] = (byte) (255 & (j11 >> 24));
        int i16 = i11 + 5;
        this.f1963f = i16;
        bArr[i15] = (byte) (((int) (j11 >> 32)) & 255);
        int i17 = i11 + 6;
        this.f1963f = i17;
        bArr[i16] = (byte) (((int) (j11 >> 40)) & 255);
        int i18 = i11 + 7;
        this.f1963f = i18;
        bArr[i17] = (byte) (((int) (j11 >> 48)) & 255);
        this.f1963f = i11 + 8;
        bArr[i18] = (byte) (((int) (j11 >> 56)) & 255);
    }

    public final void V(int i11, int i12) {
        W((i11 << 3) | i12);
    }

    public final void W(int i11) {
        boolean z11 = f1959i;
        byte[] bArr = this.f1961d;
        if (z11) {
            while ((i11 & (-128)) != 0) {
                int i12 = this.f1963f;
                this.f1963f = i12 + 1;
                f1.j(bArr, i12, (byte) ((i11 | 128) & 255));
                i11 >>>= 7;
            }
            int i13 = this.f1963f;
            this.f1963f = i13 + 1;
            f1.j(bArr, i13, (byte) i11);
            return;
        }
        while ((i11 & (-128)) != 0) {
            int i14 = this.f1963f;
            this.f1963f = i14 + 1;
            bArr[i14] = (byte) ((i11 | 128) & 255);
            i11 >>>= 7;
        }
        int i15 = this.f1963f;
        this.f1963f = i15 + 1;
        bArr[i15] = (byte) i11;
    }

    public final void X(long j11) {
        boolean z11 = f1959i;
        byte[] bArr = this.f1961d;
        if (z11) {
            while ((j11 & (-128)) != 0) {
                int i11 = this.f1963f;
                this.f1963f = i11 + 1;
                f1.j(bArr, i11, (byte) ((((int) j11) | 128) & 255));
                j11 >>>= 7;
            }
            int i12 = this.f1963f;
            this.f1963f = i12 + 1;
            f1.j(bArr, i12, (byte) j11);
            return;
        }
        while ((j11 & (-128)) != 0) {
            int i13 = this.f1963f;
            this.f1963f = i13 + 1;
            bArr[i13] = (byte) ((((int) j11) | 128) & 255);
            j11 >>>= 7;
        }
        int i14 = this.f1963f;
        this.f1963f = i14 + 1;
        bArr[i14] = (byte) j11;
    }

    public final void d0() throws IOException {
        this.f1964g.write(this.f1961d, 0, this.f1963f);
        this.f1963f = 0;
    }

    public final void e0(int i11) throws IOException {
        if (this.f1962e - this.f1963f < i11) {
            d0();
        }
    }

    public final void f0(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = this.f1963f;
        int i14 = this.f1962e;
        int i15 = i14 - i13;
        byte[] bArr2 = this.f1961d;
        if (i15 >= i12) {
            System.arraycopy(bArr, i11, bArr2, i13, i12);
            this.f1963f += i12;
            return;
        }
        System.arraycopy(bArr, i11, bArr2, i13, i15);
        int i16 = i11 + i15;
        int i17 = i12 - i15;
        this.f1963f = i14;
        d0();
        if (i17 > i14) {
            this.f1964g.write(bArr, i16, i17);
        } else {
            System.arraycopy(bArr, i16, bArr2, 0, i17);
            this.f1963f = i17;
        }
    }

    public final void g0(int i11, boolean z11) throws IOException {
        e0(11);
        V(i11, 0);
        byte b3 = z11 ? (byte) 1 : (byte) 0;
        int i12 = this.f1963f;
        this.f1963f = i12 + 1;
        this.f1961d[i12] = b3;
    }

    public final void h0(int i11, h hVar) {
        q0(i11, 2);
        s0(hVar.size());
        g gVar = (g) hVar;
        S(gVar.f1931d, gVar.g(), gVar.size());
    }

    public final void i0(int i11, int i12) {
        e0(14);
        V(i11, 5);
        T(i12);
    }

    public final void j0(int i11) throws IOException {
        e0(4);
        T(i11);
    }

    public final void k0(int i11, long j11) {
        e0(18);
        V(i11, 1);
        U(j11);
    }

    public final void l0(long j11) throws IOException {
        e0(8);
        U(j11);
    }

    public final void m0(int i11, int i12) throws IOException {
        e0(20);
        V(i11, 0);
        if (i12 >= 0) {
            W(i12);
        } else {
            X(i12);
        }
    }

    public final void n0(int i11) throws IOException {
        if (i11 >= 0) {
            s0(i11);
        } else {
            u0(i11);
        }
    }

    public final void o0(int i11, a aVar, w0 w0Var) throws IOException {
        q0(i11, 2);
        s0(aVar.a(w0Var));
        w0Var.h(aVar, this.f1960c);
    }

    public final void p0(int i11, String str) throws IOException {
        q0(i11, 2);
        try {
            int length = str.length() * 3;
            int iB0 = b0(length);
            int i12 = iB0 + length;
            int i13 = this.f1962e;
            if (i12 > i13) {
                byte[] bArr = new byte[length];
                int iM = i1.f1946a.m(str, bArr, 0, length);
                s0(iM);
                f0(bArr, 0, iM);
                return;
            }
            if (i12 > i13 - this.f1963f) {
                d0();
            }
            int iB1 = b0(str.length());
            int i14 = this.f1963f;
            byte[] bArr2 = this.f1961d;
            try {
                if (iB1 != iB0) {
                    int iA = i1.a(str);
                    W(iA);
                    this.f1963f = i1.f1946a.m(str, bArr2, this.f1963f, iA);
                    return;
                }
                int i15 = i14 + iB1;
                this.f1963f = i15;
                int iM2 = i1.f1946a.m(str, bArr2, i15, i13 - i15);
                this.f1963f = i14;
                W((iM2 - i14) - iB1);
                this.f1963f = iM2;
            } catch (h1 e8) {
                this.f1963f = i14;
                throw e8;
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new CodedOutputStream$OutOfSpaceException(e10);
            }
        } catch (h1 e11) {
            f1958h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e11);
            byte[] bytes = str.getBytes(b0.f1912a);
            try {
                s0(bytes.length);
                S(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e12) {
                throw new CodedOutputStream$OutOfSpaceException(e12);
            }
        }
    }

    public final void q0(int i11, int i12) {
        s0((i11 << 3) | i12);
    }

    public final void r0(int i11, int i12) throws IOException {
        e0(20);
        V(i11, 0);
        W(i12);
    }

    public final void s0(int i11) throws IOException {
        e0(5);
        W(i11);
    }

    public final void t0(int i11, long j11) {
        e0(20);
        V(i11, 0);
        X(j11);
    }

    public final void u0(long j11) throws IOException {
        e0(10);
        X(j11);
    }
}
