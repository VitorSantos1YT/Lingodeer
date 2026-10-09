package m00;

import hh.p0;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient byte[][] f40713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int[] f40714f;

    public g0(byte[][] bArr, int[] iArr) {
        super(l.f40723d.f40724a);
        this.f40713e = bArr;
        this.f40714f = iArr;
    }

    private final Object writeReplace() {
        return z();
    }

    @Override // m00.l
    public final String a() {
        throw null;
    }

    @Override // m00.l
    public final l c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f40713e;
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int[] iArr = this.f40714f;
            int i13 = iArr[length + i11];
            int i14 = iArr[i11];
            messageDigest.update(bArr[i11], i13, i14 - i12);
            i11++;
            i12 = i14;
        }
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.m.c(bArrDigest);
        return new l(bArrDigest);
    }

    @Override // m00.l
    public final int e() {
        return this.f40714f[this.f40713e.length - 1];
    }

    @Override // m00.l
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (lVar.e() == e() && n(0, lVar, e())) {
                return true;
            }
        }
        return false;
    }

    @Override // m00.l
    public final String f() {
        return z().f();
    }

    @Override // m00.l
    public final int g(byte[] other, int i11) {
        kotlin.jvm.internal.m.f(other, "other");
        return z().g(other, i11);
    }

    @Override // m00.l
    public final int hashCode() {
        int i11 = this.f40725b;
        if (i11 != 0) {
            return i11;
        }
        byte[][] bArr = this.f40713e;
        int length = bArr.length;
        int i12 = 0;
        int i13 = 1;
        int i14 = 0;
        while (i12 < length) {
            int[] iArr = this.f40714f;
            int i15 = iArr[length + i12];
            int i16 = iArr[i12];
            byte[] bArr2 = bArr[i12];
            int i17 = (i16 - i14) + i15;
            while (i15 < i17) {
                i13 = (i13 * 31) + bArr2[i15];
                i15++;
            }
            i12++;
            i14 = i16;
        }
        this.f40725b = i13;
        return i13;
    }

    @Override // m00.l
    public final byte[] j() {
        return u();
    }

    @Override // m00.l
    public final byte k(int i11) {
        byte[][] bArr = this.f40713e;
        int length = bArr.length - 1;
        int[] iArr = this.f40714f;
        b.e(iArr[length], i11, 1L);
        int iG = n00.b.g(this, i11);
        return bArr[iG][(i11 - (iG == 0 ? 0 : iArr[iG - 1])) + iArr[bArr.length + iG]];
    }

    @Override // m00.l
    public final int l(byte[] other) {
        kotlin.jvm.internal.m.f(other, "other");
        return z().l(other);
    }

    @Override // m00.l
    public final boolean n(int i11, l other, int i12) {
        kotlin.jvm.internal.m.f(other, "other");
        if (i11 >= 0 && i11 <= e() - i12) {
            int i13 = i12 + i11;
            int iG = n00.b.g(this, i11);
            int i14 = 0;
            while (i11 < i13) {
                int[] iArr = this.f40714f;
                int i15 = iG == 0 ? 0 : iArr[iG - 1];
                int i16 = iArr[iG] - i15;
                byte[][] bArr = this.f40713e;
                int i17 = iArr[bArr.length + iG];
                int iMin = Math.min(i13, i16 + i15) - i11;
                if (other.o(i14, bArr[iG], (i11 - i15) + i17, iMin)) {
                    i14 += iMin;
                    i11 += iMin;
                    iG++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // m00.l
    public final boolean o(int i11, byte[] other, int i12, int i13) {
        kotlin.jvm.internal.m.f(other, "other");
        if (i11 < 0 || i11 > e() - i13 || i12 < 0 || i12 > other.length - i13) {
            return false;
        }
        int i14 = i13 + i11;
        int iG = n00.b.g(this, i11);
        while (i11 < i14) {
            int[] iArr = this.f40714f;
            int i15 = iG == 0 ? 0 : iArr[iG - 1];
            int i16 = iArr[iG] - i15;
            byte[][] bArr = this.f40713e;
            int i17 = iArr[bArr.length + iG];
            int iMin = Math.min(i14, i16 + i15) - i11;
            if (!b.a((i11 - i15) + i17, i12, iMin, bArr[iG], other)) {
                return false;
            }
            i12 += iMin;
            i11 += iMin;
            iG++;
        }
        return true;
    }

    @Override // m00.l
    public final String q(Charset charset) {
        kotlin.jvm.internal.m.f(charset, "charset");
        return z().q(charset);
    }

    @Override // m00.l
    public final l r(int i11, int i12) {
        if (i12 == -1234567890) {
            i12 = e();
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(p0.h(i11, "beginIndex=", " < 0").toString());
        }
        if (i12 > e()) {
            StringBuilder sbI = w4.c.i(i12, "endIndex=", " > length(");
            sbI.append(e());
            sbI.append(')');
            throw new IllegalArgumentException(sbI.toString().toString());
        }
        int i13 = i12 - i11;
        if (i13 < 0) {
            throw new IllegalArgumentException(nv.p.p("endIndex=", i12, i11, " < beginIndex=").toString());
        }
        if (i11 == 0 && i12 == e()) {
            return this;
        }
        if (i11 == i12) {
            return l.f40723d;
        }
        int iG = n00.b.g(this, i11);
        int iG2 = n00.b.g(this, i12 - 1);
        byte[][] bArr = this.f40713e;
        byte[][] bArr2 = (byte[][]) ry.l.N(iG, iG2 + 1, bArr);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f40714f;
        if (iG <= iG2) {
            int i14 = iG;
            int i15 = 0;
            while (true) {
                iArr[i15] = Math.min(iArr2[i14] - i11, i13);
                int i16 = i15 + 1;
                iArr[i15 + bArr2.length] = iArr2[bArr.length + i14];
                if (i14 == iG2) {
                    break;
                }
                i14++;
                i15 = i16;
            }
        }
        int i17 = iG != 0 ? iArr2[iG - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i11 - i17) + iArr[length];
        return new g0(bArr2, iArr);
    }

    @Override // m00.l
    public final l t() {
        return z().t();
    }

    @Override // m00.l
    public final String toString() {
        return z().toString();
    }

    @Override // m00.l
    public final byte[] u() {
        byte[] bArr = new byte[e()];
        byte[][] bArr2 = this.f40713e;
        int length = bArr2.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < length) {
            int[] iArr = this.f40714f;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = i15 - i12;
            ry.l.F(i13, i14, i14 + i16, bArr2[i11], bArr);
            i13 += i16;
            i11++;
            i12 = i15;
        }
        return bArr;
    }

    @Override // m00.l
    public final void w(i iVar, int i11) {
        int iG = n00.b.g(this, 0);
        int i12 = 0;
        while (i12 < i11) {
            int[] iArr = this.f40714f;
            int i13 = iG == 0 ? 0 : iArr[iG - 1];
            int i14 = iArr[iG] - i13;
            byte[][] bArr = this.f40713e;
            int i15 = iArr[bArr.length + iG];
            int iMin = Math.min(i11, i14 + i13) - i12;
            int i16 = (i12 - i13) + i15;
            e0 e0Var = new e0(bArr[iG], i16, i16 + iMin, true, false);
            e0 e0Var2 = iVar.f40717a;
            if (e0Var2 == null) {
                e0Var.f40707g = e0Var;
                e0Var.f40706f = e0Var;
                iVar.f40717a = e0Var;
            } else {
                e0 e0Var3 = e0Var2.f40707g;
                kotlin.jvm.internal.m.c(e0Var3);
                e0Var3.b(e0Var);
            }
            i12 += iMin;
            iG++;
        }
        iVar.f40718b += (long) i11;
    }

    public final l z() {
        return new l(u());
    }
}
