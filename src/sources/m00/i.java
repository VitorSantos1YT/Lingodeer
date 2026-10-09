package m00;

import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements k, j, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e0 f40717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f40718b;

    public final String A(long j11, Charset charset) throws EOFException {
        kotlin.jvm.internal.m.f(charset, "charset");
        if (j11 < 0 || j11 > 2147483647L) {
            throw new IllegalArgumentException(defpackage.e.h(j11, "byteCount: ").toString());
        }
        if (this.f40718b < j11) {
            throw new EOFException();
        }
        if (j11 == 0) {
            return BuildConfig.VERSION_NAME;
        }
        e0 e0Var = this.f40717a;
        kotlin.jvm.internal.m.c(e0Var);
        int i11 = e0Var.f40702b;
        if (((long) i11) + j11 > e0Var.f40703c) {
            return new String(x(j11), charset);
        }
        int i12 = (int) j11;
        String str = new String(e0Var.f40701a, i11, i12, charset);
        int i13 = e0Var.f40702b + i12;
        e0Var.f40702b = i13;
        this.f40718b -= j11;
        if (i13 == e0Var.f40703c) {
            this.f40717a = e0Var.a();
            f0.a(e0Var);
        }
        return str;
    }

    @Override // m00.j
    public final /* bridge */ /* synthetic */ j A0(long j11) {
        S(j11);
        return this;
    }

    public final String B() {
        return A(this.f40718b, oz.a.f46133a);
    }

    public final int C() throws EOFException {
        int i11;
        int i12;
        int i13;
        if (this.f40718b == 0) {
            throw new EOFException();
        }
        byte bH = h(0L);
        if ((bH & 128) == 0) {
            i11 = bH & 127;
            i13 = 0;
            i12 = 1;
        } else if ((bH & 224) == 192) {
            i11 = bH & 31;
            i12 = 2;
            i13 = 128;
        } else if ((bH & 240) == 224) {
            i11 = bH & 15;
            i12 = 3;
            i13 = 2048;
        } else {
            if ((bH & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i11 = bH & 7;
            i12 = 4;
            i13 = 65536;
        }
        long j11 = i12;
        if (this.f40718b < j11) {
            StringBuilder sbI = w4.c.i(i12, "size < ", ": ");
            sbI.append(this.f40718b);
            sbI.append(" (to read code point prefixed 0x");
            sbI.append(b.k(bH));
            sbI.append(')');
            throw new EOFException(sbI.toString());
        }
        for (int i14 = 1; i14 < i12; i14++) {
            long j12 = i14;
            byte bH2 = h(j12);
            if ((bH2 & 192) != 128) {
                skip(j12);
                return 65533;
            }
            i11 = (i11 << 6) | (bH2 & 63);
        }
        skip(j11);
        if (i11 > 1114111) {
            return 65533;
        }
        if ((55296 > i11 || i11 >= 57344) && i11 >= i13) {
            return i11;
        }
        return 65533;
    }

    @Override // m00.k
    public final InputStream C1() {
        return new g(this, 0);
    }

    public final l D() {
        long j11 = this.f40718b;
        if (j11 <= 2147483647L) {
            return F((int) j11);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f40718b).toString());
    }

    @Override // m00.k
    public final l D0() {
        return z(this.f40718b);
    }

    public final l F(int i11) {
        if (i11 == 0) {
            return l.f40723d;
        }
        b.e(this.f40718b, 0L, i11);
        e0 e0Var = this.f40717a;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            kotlin.jvm.internal.m.c(e0Var);
            int i15 = e0Var.f40703c;
            int i16 = e0Var.f40702b;
            if (i15 == i16) {
                throw new AssertionError("s.limit == s.pos");
            }
            i13 += i15 - i16;
            i14++;
            e0Var = e0Var.f40706f;
        }
        byte[][] bArr = new byte[i14][];
        int[] iArr = new int[i14 * 2];
        e0 e0Var2 = this.f40717a;
        int i17 = 0;
        while (i12 < i11) {
            kotlin.jvm.internal.m.c(e0Var2);
            bArr[i17] = e0Var2.f40701a;
            i12 += e0Var2.f40703c - e0Var2.f40702b;
            iArr[i17] = Math.min(i12, i11);
            iArr[i17 + i14] = e0Var2.f40702b;
            e0Var2.f40704d = true;
            i17++;
            e0Var2 = e0Var2.f40706f;
        }
        return new g0(bArr, iArr);
    }

    public final e0 G(int i11) {
        if (i11 < 1 || i11 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        e0 e0Var = this.f40717a;
        if (e0Var == null) {
            e0 e0VarB = f0.b();
            this.f40717a = e0VarB;
            e0VarB.f40707g = e0VarB;
            e0VarB.f40706f = e0VarB;
            return e0VarB;
        }
        e0 e0Var2 = e0Var.f40707g;
        kotlin.jvm.internal.m.c(e0Var2);
        if (e0Var2.f40703c + i11 <= 8192 && e0Var2.f40705e) {
            return e0Var2;
        }
        e0 e0VarB2 = f0.b();
        e0Var2.b(e0VarB2);
        return e0VarB2;
    }

    public final void I(l byteString) {
        kotlin.jvm.internal.m.f(byteString, "byteString");
        byteString.w(this, byteString.e());
    }

    public final void J(int i11) {
        e0 e0VarG = G(1);
        byte[] bArr = e0VarG.f40701a;
        int i12 = e0VarG.f40703c;
        e0VarG.f40703c = i12 + 1;
        bArr[i12] = (byte) i11;
        this.f40718b++;
    }

    @Override // m00.h0
    public final void K0(i source, long j11) {
        e0 e0VarB;
        kotlin.jvm.internal.m.f(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        b.e(source.f40718b, 0L, j11);
        while (j11 > 0) {
            e0 e0Var = source.f40717a;
            kotlin.jvm.internal.m.c(e0Var);
            int i11 = e0Var.f40703c;
            e0 e0Var2 = source.f40717a;
            kotlin.jvm.internal.m.c(e0Var2);
            long j12 = i11 - e0Var2.f40702b;
            int i12 = 0;
            if (j11 < j12) {
                e0 e0Var3 = this.f40717a;
                e0 e0Var4 = e0Var3 != null ? e0Var3.f40707g : null;
                if (e0Var4 != null && e0Var4.f40705e) {
                    if ((((long) e0Var4.f40703c) + j11) - ((long) (e0Var4.f40704d ? 0 : e0Var4.f40702b)) <= 8192) {
                        e0 e0Var5 = source.f40717a;
                        kotlin.jvm.internal.m.c(e0Var5);
                        e0Var5.d(e0Var4, (int) j11);
                        source.f40718b -= j11;
                        this.f40718b += j11;
                        return;
                    }
                }
                e0 e0Var6 = source.f40717a;
                kotlin.jvm.internal.m.c(e0Var6);
                int i13 = (int) j11;
                if (i13 <= 0 || i13 > e0Var6.f40703c - e0Var6.f40702b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i13 >= 1024) {
                    e0VarB = e0Var6.c();
                } else {
                    e0VarB = f0.b();
                    byte[] bArr = e0Var6.f40701a;
                    byte[] bArr2 = e0VarB.f40701a;
                    int i14 = e0Var6.f40702b;
                    ry.l.F(0, i14, i14 + i13, bArr, bArr2);
                }
                e0VarB.f40703c = e0VarB.f40702b + i13;
                e0Var6.f40702b += i13;
                e0 e0Var7 = e0Var6.f40707g;
                kotlin.jvm.internal.m.c(e0Var7);
                e0Var7.b(e0VarB);
                source.f40717a = e0VarB;
            }
            e0 e0Var8 = source.f40717a;
            kotlin.jvm.internal.m.c(e0Var8);
            long j13 = e0Var8.f40703c - e0Var8.f40702b;
            source.f40717a = e0Var8.a();
            e0 e0Var9 = this.f40717a;
            if (e0Var9 == null) {
                this.f40717a = e0Var8;
                e0Var8.f40707g = e0Var8;
                e0Var8.f40706f = e0Var8;
            } else {
                e0 e0Var10 = e0Var9.f40707g;
                kotlin.jvm.internal.m.c(e0Var10);
                e0Var10.b(e0Var8);
                e0 e0Var11 = e0Var8.f40707g;
                if (e0Var11 == e0Var8) {
                    throw new IllegalStateException("cannot compact");
                }
                kotlin.jvm.internal.m.c(e0Var11);
                if (e0Var11.f40705e) {
                    int i15 = e0Var8.f40703c - e0Var8.f40702b;
                    e0 e0Var12 = e0Var8.f40707g;
                    kotlin.jvm.internal.m.c(e0Var12);
                    int i16 = 8192 - e0Var12.f40703c;
                    e0 e0Var13 = e0Var8.f40707g;
                    kotlin.jvm.internal.m.c(e0Var13);
                    if (!e0Var13.f40704d) {
                        e0 e0Var14 = e0Var8.f40707g;
                        kotlin.jvm.internal.m.c(e0Var14);
                        i12 = e0Var14.f40702b;
                    }
                    if (i15 <= i16 + i12) {
                        e0 e0Var15 = e0Var8.f40707g;
                        kotlin.jvm.internal.m.c(e0Var15);
                        e0Var8.d(e0Var15, i15);
                        e0Var8.a();
                        f0.a(e0Var8);
                    }
                }
            }
            source.f40718b -= j13;
            this.f40718b += j13;
            j11 -= j13;
        }
    }

    @Override // m00.k
    public final byte[] M() {
        return x(this.f40718b);
    }

    public final void N(long j11) {
        boolean z11;
        if (j11 == 0) {
            J(48);
            return;
        }
        if (j11 < 0) {
            j11 = -j11;
            if (j11 < 0) {
                Y("-9223372036854775808");
                return;
            }
            z11 = true;
        } else {
            z11 = false;
        }
        byte[] bArr = n00.a.f43057a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j11)) * 10) >>> 5;
        int i11 = iNumberOfLeadingZeros + (j11 > n00.a.f43058b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z11) {
            i11++;
        }
        e0 e0VarG = G(i11);
        byte[] bArr2 = e0VarG.f40701a;
        int i12 = e0VarG.f40703c + i11;
        while (j11 != 0) {
            long j12 = 10;
            i12--;
            bArr2[i12] = n00.a.f43057a[(int) (j11 % j12)];
            j11 /= j12;
        }
        if (z11) {
            bArr2[i12 - 1] = 45;
        }
        e0VarG.f40703c += i11;
        this.f40718b += (long) i11;
    }

    @Override // m00.k
    public final long O(h0 h0Var) {
        long j11 = this.f40718b;
        if (j11 > 0) {
            h0Var.K0(this, j11);
        }
        return j11;
    }

    @Override // m00.k
    public final int Q(z options) throws EOFException {
        kotlin.jvm.internal.m.f(options, "options");
        int iD = n00.a.d(this, options, false);
        if (iD == -1) {
            return -1;
        }
        skip(options.f40760a[iD].e());
        return iD;
    }

    @Override // m00.j
    public final /* bridge */ /* synthetic */ j Q0(l lVar) {
        I(lVar);
        return this;
    }

    @Override // m00.k
    public final boolean R() {
        return this.f40718b == 0;
    }

    @Override // m00.k
    public final String R0() {
        return c0(Long.MAX_VALUE);
    }

    public final void S(long j11) {
        if (j11 == 0) {
            J(48);
            return;
        }
        long j12 = (j11 >>> 1) | j11;
        long j13 = j12 | (j12 >>> 2);
        long j14 = j13 | (j13 >>> 4);
        long j15 = j14 | (j14 >>> 8);
        long j16 = j15 | (j15 >>> 16);
        long j17 = j16 | (j16 >>> 32);
        long j18 = j17 - ((j17 >>> 1) & 6148914691236517205L);
        long j19 = ((j18 >>> 2) & 3689348814741910323L) + (j18 & 3689348814741910323L);
        long j21 = ((j19 >>> 4) + j19) & 1085102592571150095L;
        long j22 = j21 + (j21 >>> 8);
        long j23 = j22 + (j22 >>> 16);
        int i11 = (int) ((((j23 & 63) + ((j23 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        e0 e0VarG = G(i11);
        byte[] bArr = e0VarG.f40701a;
        int i12 = e0VarG.f40703c;
        for (int i13 = (i12 + i11) - 1; i13 >= i12; i13--) {
            bArr[i13] = n00.a.f43057a[(int) (15 & j11)];
            j11 >>>= 4;
        }
        e0VarG.f40703c += i11;
        this.f40718b += (long) i11;
    }

    public final void T(int i11) {
        e0 e0VarG = G(4);
        byte[] bArr = e0VarG.f40701a;
        int i12 = e0VarG.f40703c;
        bArr[i12] = (byte) ((i11 >>> 24) & 255);
        bArr[i12 + 1] = (byte) ((i11 >>> 16) & 255);
        bArr[i12 + 2] = (byte) ((i11 >>> 8) & 255);
        bArr[i12 + 3] = (byte) (i11 & 255);
        e0VarG.f40703c = i12 + 4;
        this.f40718b += 4;
    }

    public final void U(int i11) {
        e0 e0VarG = G(2);
        byte[] bArr = e0VarG.f40701a;
        int i12 = e0VarG.f40703c;
        bArr[i12] = (byte) ((i11 >>> 8) & 255);
        bArr[i12 + 1] = (byte) (i11 & 255);
        e0VarG.f40703c = i12 + 2;
        this.f40718b += 2;
    }

    public final void V(OutputStream out, long j11) throws IOException {
        kotlin.jvm.internal.m.f(out, "out");
        b.e(this.f40718b, 0L, j11);
        e0 e0Var = this.f40717a;
        long j12 = j11;
        while (j12 > 0) {
            kotlin.jvm.internal.m.c(e0Var);
            int iMin = (int) Math.min(j12, e0Var.f40703c - e0Var.f40702b);
            out.write(e0Var.f40701a, e0Var.f40702b, iMin);
            int i11 = e0Var.f40702b + iMin;
            e0Var.f40702b = i11;
            long j13 = iMin;
            this.f40718b -= j13;
            j12 -= j13;
            if (i11 == e0Var.f40703c) {
                e0 e0VarA = e0Var.a();
                this.f40717a = e0VarA;
                f0.a(e0Var);
                e0Var = e0VarA;
            }
        }
    }

    public final void W(int i11, int i12, String string) {
        char cCharAt;
        kotlin.jvm.internal.m.f(string, "string");
        if (i11 < 0) {
            throw new IllegalArgumentException(nv.p.j(i11, "beginIndex < 0: ").toString());
        }
        if (i12 < i11) {
            throw new IllegalArgumentException(nv.p.p("endIndex < beginIndex: ", i12, i11, " < ").toString());
        }
        if (i12 > string.length()) {
            StringBuilder sbI = w4.c.i(i12, "endIndex > string.length: ", " > ");
            sbI.append(string.length());
            throw new IllegalArgumentException(sbI.toString().toString());
        }
        while (i11 < i12) {
            char cCharAt2 = string.charAt(i11);
            if (cCharAt2 < 128) {
                e0 e0VarG = G(1);
                byte[] bArr = e0VarG.f40701a;
                int i13 = e0VarG.f40703c - i11;
                int iMin = Math.min(i12, 8192 - i13);
                int i14 = i11 + 1;
                bArr[i11 + i13] = (byte) cCharAt2;
                while (true) {
                    i11 = i14;
                    if (i11 >= iMin || (cCharAt = string.charAt(i11)) >= 128) {
                        break;
                    }
                    i14 = i11 + 1;
                    bArr[i11 + i13] = (byte) cCharAt;
                }
                int i15 = e0VarG.f40703c;
                int i16 = (i13 + i11) - i15;
                e0VarG.f40703c = i15 + i16;
                this.f40718b += (long) i16;
            } else {
                if (cCharAt2 < 2048) {
                    e0 e0VarG2 = G(2);
                    byte[] bArr2 = e0VarG2.f40701a;
                    int i17 = e0VarG2.f40703c;
                    bArr2[i17] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i17 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    e0VarG2.f40703c = i17 + 2;
                    this.f40718b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    e0 e0VarG3 = G(3);
                    byte[] bArr3 = e0VarG3.f40701a;
                    int i18 = e0VarG3.f40703c;
                    bArr3[i18] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i18 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i18 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    e0VarG3.f40703c = i18 + 3;
                    this.f40718b += 3;
                } else {
                    int i19 = i11 + 1;
                    char cCharAt3 = i19 < i12 ? string.charAt(i19) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        J(63);
                        i11 = i19;
                    } else {
                        int i21 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        e0 e0VarG4 = G(4);
                        byte[] bArr4 = e0VarG4.f40701a;
                        int i22 = e0VarG4.f40703c;
                        bArr4[i22] = (byte) ((i21 >> 18) | 240);
                        bArr4[i22 + 1] = (byte) (((i21 >> 12) & 63) | 128);
                        bArr4[i22 + 2] = (byte) (((i21 >> 6) & 63) | 128);
                        bArr4[i22 + 3] = (byte) ((i21 & 63) | 128);
                        e0VarG4.f40703c = i22 + 4;
                        this.f40718b += 4;
                        i11 += 2;
                    }
                }
                i11++;
            }
        }
    }

    public final void Y(String string) {
        kotlin.jvm.internal.m.f(string, "string");
        W(0, string.length(), string);
    }

    public final void Z(int i11) {
        if (i11 < 128) {
            J(i11);
            return;
        }
        if (i11 < 2048) {
            e0 e0VarG = G(2);
            byte[] bArr = e0VarG.f40701a;
            int i12 = e0VarG.f40703c;
            bArr[i12] = (byte) ((i11 >> 6) | 192);
            bArr[i12 + 1] = (byte) ((i11 & 63) | 128);
            e0VarG.f40703c = i12 + 2;
            this.f40718b += 2;
            return;
        }
        if (55296 <= i11 && i11 < 57344) {
            J(63);
            return;
        }
        if (i11 < 65536) {
            e0 e0VarG2 = G(3);
            byte[] bArr2 = e0VarG2.f40701a;
            int i13 = e0VarG2.f40703c;
            bArr2[i13] = (byte) ((i11 >> 12) | 224);
            bArr2[i13 + 1] = (byte) (((i11 >> 6) & 63) | 128);
            bArr2[i13 + 2] = (byte) ((i11 & 63) | 128);
            e0VarG2.f40703c = i13 + 3;
            this.f40718b += 3;
            return;
        }
        if (i11 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(b.l(i11)));
        }
        e0 e0VarG3 = G(4);
        byte[] bArr3 = e0VarG3.f40701a;
        int i14 = e0VarG3.f40703c;
        bArr3[i14] = (byte) ((i11 >> 18) | 240);
        bArr3[i14 + 1] = (byte) (((i11 >> 12) & 63) | 128);
        bArr3[i14 + 2] = (byte) (((i11 >> 6) & 63) | 128);
        bArr3[i14 + 3] = (byte) ((i11 & 63) | 128);
        e0VarG3.f40703c = i14 + 4;
        this.f40718b += 4;
    }

    public final void a() throws EOFException {
        skip(this.f40718b);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final i clone() {
        i iVar = new i();
        if (this.f40718b == 0) {
            return iVar;
        }
        e0 e0Var = this.f40717a;
        kotlin.jvm.internal.m.c(e0Var);
        e0 e0VarC = e0Var.c();
        iVar.f40717a = e0VarC;
        e0VarC.f40707g = e0VarC;
        e0VarC.f40706f = e0VarC;
        for (e0 e0Var2 = e0Var.f40706f; e0Var2 != e0Var; e0Var2 = e0Var2.f40706f) {
            e0 e0Var3 = e0VarC.f40707g;
            kotlin.jvm.internal.m.c(e0Var3);
            kotlin.jvm.internal.m.c(e0Var2);
            e0Var3.b(e0Var2.c());
        }
        iVar.f40718b = this.f40718b;
        return iVar;
    }

    @Override // m00.k
    public final String c0(long j11) throws EOFException {
        if (j11 < 0) {
            throw new IllegalArgumentException(defpackage.e.h(j11, "limit < 0: ").toString());
        }
        long j12 = j11 != Long.MAX_VALUE ? j11 + 1 : Long.MAX_VALUE;
        long jI = i((byte) 10, 0L, j12);
        if (jI != -1) {
            return n00.a.c(this, jI);
        }
        if (j12 < this.f40718b && h(j12 - 1) == 13 && h(j12) == 10) {
            return n00.a.c(this, j12);
        }
        i iVar = new i();
        f(iVar, 0L, Math.min(32, this.f40718b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f40718b, j11) + " content=" + iVar.z(iVar.f40718b).f() + (char) 8230);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, m00.h0
    public final void close() {
    }

    public final long d() {
        long j11 = this.f40718b;
        if (j11 == 0) {
            return 0L;
        }
        e0 e0Var = this.f40717a;
        kotlin.jvm.internal.m.c(e0Var);
        e0 e0Var2 = e0Var.f40707g;
        kotlin.jvm.internal.m.c(e0Var2);
        int i11 = e0Var2.f40703c;
        return (i11 >= 8192 || !e0Var2.f40705e) ? j11 : j11 - ((long) (i11 - e0Var2.f40702b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        long j11 = this.f40718b;
        i iVar = (i) obj;
        if (j11 != iVar.f40718b) {
            return false;
        }
        if (j11 == 0) {
            return true;
        }
        e0 e0Var = this.f40717a;
        kotlin.jvm.internal.m.c(e0Var);
        e0 e0Var2 = iVar.f40717a;
        kotlin.jvm.internal.m.c(e0Var2);
        int i11 = e0Var.f40702b;
        int i12 = e0Var2.f40702b;
        long j12 = 0;
        while (j12 < this.f40718b) {
            long jMin = Math.min(e0Var.f40703c - i11, e0Var2.f40703c - i12);
            long j13 = 0;
            while (j13 < jMin) {
                int i13 = i11 + 1;
                int i14 = i12 + 1;
                if (e0Var.f40701a[i11] != e0Var2.f40701a[i12]) {
                    return false;
                }
                j13++;
                i11 = i13;
                i12 = i14;
            }
            if (i11 == e0Var.f40703c) {
                e0Var = e0Var.f40706f;
                kotlin.jvm.internal.m.c(e0Var);
                i11 = e0Var.f40702b;
            }
            if (i12 == e0Var2.f40703c) {
                e0Var2 = e0Var2.f40706f;
                kotlin.jvm.internal.m.c(e0Var2);
                i12 = e0Var2.f40702b;
            }
            j12 += jMin;
        }
        return true;
    }

    public final void f(i out, long j11, long j12) {
        kotlin.jvm.internal.m.f(out, "out");
        long j13 = j11;
        b.e(this.f40718b, j13, j12);
        if (j12 == 0) {
            return;
        }
        out.f40718b += j12;
        e0 e0Var = this.f40717a;
        while (true) {
            kotlin.jvm.internal.m.c(e0Var);
            long j14 = e0Var.f40703c - e0Var.f40702b;
            if (j13 < j14) {
                break;
            }
            j13 -= j14;
            e0Var = e0Var.f40706f;
        }
        e0 e0Var2 = e0Var;
        long j15 = j12;
        while (j15 > 0) {
            kotlin.jvm.internal.m.c(e0Var2);
            e0 e0VarC = e0Var2.c();
            int i11 = e0VarC.f40702b + ((int) j13);
            e0VarC.f40702b = i11;
            e0VarC.f40703c = Math.min(i11 + ((int) j15), e0VarC.f40703c);
            e0 e0Var3 = out.f40717a;
            if (e0Var3 == null) {
                e0VarC.f40707g = e0VarC;
                e0VarC.f40706f = e0VarC;
                out.f40717a = e0VarC;
            } else {
                e0 e0Var4 = e0Var3.f40707g;
                kotlin.jvm.internal.m.c(e0Var4);
                e0Var4.b(e0VarC);
            }
            j15 -= (long) (e0VarC.f40703c - e0VarC.f40702b);
            e0Var2 = e0Var2.f40706f;
            j13 = 0;
        }
    }

    @Override // m00.j, m00.h0, java.io.Flushable
    public final void flush() {
    }

    public final byte h(long j11) {
        b.e(this.f40718b, j11, 1L);
        e0 e0Var = this.f40717a;
        if (e0Var == null) {
            kotlin.jvm.internal.m.c(null);
            throw null;
        }
        long j12 = this.f40718b;
        if (j12 - j11 < j11) {
            while (j12 > j11) {
                e0Var = e0Var.f40707g;
                kotlin.jvm.internal.m.c(e0Var);
                j12 -= (long) (e0Var.f40703c - e0Var.f40702b);
            }
            return e0Var.f40701a[(int) ((((long) e0Var.f40702b) + j11) - j12)];
        }
        long j13 = 0;
        while (true) {
            int i11 = e0Var.f40703c;
            int i12 = e0Var.f40702b;
            long j14 = ((long) (i11 - i12)) + j13;
            if (j14 > j11) {
                return e0Var.f40701a[(int) ((((long) i12) + j11) - j13)];
            }
            e0Var = e0Var.f40706f;
            kotlin.jvm.internal.m.c(e0Var);
            j13 = j14;
        }
    }

    public final int hashCode() {
        e0 e0Var = this.f40717a;
        if (e0Var == null) {
            return 0;
        }
        int i11 = 1;
        do {
            int i12 = e0Var.f40703c;
            for (int i13 = e0Var.f40702b; i13 < i12; i13++) {
                i11 = (i11 * 31) + e0Var.f40701a[i13];
            }
            e0Var = e0Var.f40706f;
            kotlin.jvm.internal.m.c(e0Var);
        } while (e0Var != this.f40717a);
        return i11;
    }

    public final long i(byte b3, long j11, long j12) {
        e0 e0Var;
        long j13 = 0;
        if (0 > j11 || j11 > j12) {
            StringBuilder sb2 = new StringBuilder("size=");
            sb2.append(this.f40718b);
            ep.a.y(j11, " fromIndex=", " toIndex=", sb2);
            sb2.append(j12);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        long j14 = this.f40718b;
        if (j12 > j14) {
            j12 = j14;
        }
        if (j11 == j12 || (e0Var = this.f40717a) == null) {
            return -1L;
        }
        if (j14 - j11 < j11) {
            while (j14 > j11) {
                e0Var = e0Var.f40707g;
                kotlin.jvm.internal.m.c(e0Var);
                j14 -= (long) (e0Var.f40703c - e0Var.f40702b);
            }
            while (j14 < j12) {
                byte[] bArr = e0Var.f40701a;
                int iMin = (int) Math.min(e0Var.f40703c, (((long) e0Var.f40702b) + j12) - j14);
                for (int i11 = (int) ((((long) e0Var.f40702b) + j11) - j14); i11 < iMin; i11++) {
                    if (bArr[i11] == b3) {
                        return ((long) (i11 - e0Var.f40702b)) + j14;
                    }
                }
                j14 += (long) (e0Var.f40703c - e0Var.f40702b);
                e0Var = e0Var.f40706f;
                kotlin.jvm.internal.m.c(e0Var);
                j11 = j14;
            }
            return -1L;
        }
        while (true) {
            long j15 = ((long) (e0Var.f40703c - e0Var.f40702b)) + j13;
            if (j15 > j11) {
                break;
            }
            e0Var = e0Var.f40706f;
            kotlin.jvm.internal.m.c(e0Var);
            j13 = j15;
        }
        while (j13 < j12) {
            byte[] bArr2 = e0Var.f40701a;
            int iMin2 = (int) Math.min(e0Var.f40703c, (((long) e0Var.f40702b) + j12) - j13);
            for (int i12 = (int) ((((long) e0Var.f40702b) + j11) - j13); i12 < iMin2; i12++) {
                if (bArr2[i12] == b3) {
                    return ((long) (i12 - e0Var.f40702b)) + j13;
                }
            }
            j13 += (long) (e0Var.f40703c - e0Var.f40702b);
            e0Var = e0Var.f40706f;
            kotlin.jvm.internal.m.c(e0Var);
            j11 = j13;
        }
        return -1L;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // m00.j
    public final /* bridge */ /* synthetic */ j l0(String str) {
        Y(str);
        return this;
    }

    @Override // m00.j
    public final long m0(i0 source) {
        kotlin.jvm.internal.m.f(source, "source");
        long j11 = 0;
        while (true) {
            long j12 = source.read(this, 8192L);
            if (j12 == -1) {
                return j11;
            }
            j11 += j12;
        }
    }

    @Override // m00.k
    public final i n() {
        return this;
    }

    public final long p(l targetBytes) {
        kotlin.jvm.internal.m.f(targetBytes, "targetBytes");
        return q(targetBytes, 0L);
    }

    public final long q(l targetBytes, long j11) {
        kotlin.jvm.internal.m.f(targetBytes, "targetBytes");
        long j12 = 0;
        if (j11 < 0) {
            throw new IllegalArgumentException(defpackage.e.h(j11, "fromIndex < 0: ").toString());
        }
        e0 e0Var = this.f40717a;
        if (e0Var == null) {
            return -1L;
        }
        long j13 = this.f40718b;
        if (j13 - j11 < j11) {
            while (j13 > j11) {
                e0Var = e0Var.f40707g;
                kotlin.jvm.internal.m.c(e0Var);
                j13 -= (long) (e0Var.f40703c - e0Var.f40702b);
            }
            if (targetBytes.e() == 2) {
                byte bK = targetBytes.k(0);
                byte bK2 = targetBytes.k(1);
                while (j13 < this.f40718b) {
                    byte[] bArr = e0Var.f40701a;
                    int i11 = e0Var.f40703c;
                    for (int i12 = (int) ((((long) e0Var.f40702b) + j11) - j13); i12 < i11; i12++) {
                        byte b3 = bArr[i12];
                        if (b3 == bK || b3 == bK2) {
                            return ((long) (i12 - e0Var.f40702b)) + j13;
                        }
                    }
                    j13 += (long) (e0Var.f40703c - e0Var.f40702b);
                    e0Var = e0Var.f40706f;
                    kotlin.jvm.internal.m.c(e0Var);
                    j11 = j13;
                }
            } else {
                byte[] bArrJ = targetBytes.j();
                while (j13 < this.f40718b) {
                    byte[] bArr2 = e0Var.f40701a;
                    int i13 = e0Var.f40703c;
                    for (int i14 = (int) ((((long) e0Var.f40702b) + j11) - j13); i14 < i13; i14++) {
                        byte b11 = bArr2[i14];
                        for (byte b12 : bArrJ) {
                            if (b11 == b12) {
                                return ((long) (i14 - e0Var.f40702b)) + j13;
                            }
                        }
                    }
                    j13 += (long) (e0Var.f40703c - e0Var.f40702b);
                    e0Var = e0Var.f40706f;
                    kotlin.jvm.internal.m.c(e0Var);
                    j11 = j13;
                }
            }
            return -1L;
        }
        while (true) {
            long j14 = ((long) (e0Var.f40703c - e0Var.f40702b)) + j12;
            if (j14 > j11) {
                break;
            }
            e0Var = e0Var.f40706f;
            kotlin.jvm.internal.m.c(e0Var);
            j12 = j14;
        }
        if (targetBytes.e() == 2) {
            byte bK3 = targetBytes.k(0);
            byte bK4 = targetBytes.k(1);
            while (j12 < this.f40718b) {
                byte[] bArr3 = e0Var.f40701a;
                int i15 = e0Var.f40703c;
                for (int i16 = (int) ((((long) e0Var.f40702b) + j11) - j12); i16 < i15; i16++) {
                    byte b13 = bArr3[i16];
                    if (b13 == bK3 || b13 == bK4) {
                        return ((long) (i16 - e0Var.f40702b)) + j12;
                    }
                }
                j12 += (long) (e0Var.f40703c - e0Var.f40702b);
                e0Var = e0Var.f40706f;
                kotlin.jvm.internal.m.c(e0Var);
                j11 = j12;
            }
        } else {
            byte[] bArrJ2 = targetBytes.j();
            while (j12 < this.f40718b) {
                byte[] bArr4 = e0Var.f40701a;
                int i17 = e0Var.f40703c;
                for (int i18 = (int) ((((long) e0Var.f40702b) + j11) - j12); i18 < i17; i18++) {
                    byte b14 = bArr4[i18];
                    for (byte b15 : bArrJ2) {
                        if (b14 == b15) {
                            return ((long) (i18 - e0Var.f40702b)) + j12;
                        }
                    }
                }
                j12 += (long) (e0Var.f40703c - e0Var.f40702b);
                e0Var = e0Var.f40706f;
                kotlin.jvm.internal.m.c(e0Var);
                j11 = j12;
            }
        }
        return -1L;
    }

    @Override // m00.i0
    public final long read(i sink, long j11) {
        kotlin.jvm.internal.m.f(sink, "sink");
        if (j11 < 0) {
            throw new IllegalArgumentException(defpackage.e.h(j11, "byteCount < 0: ").toString());
        }
        long j12 = this.f40718b;
        if (j12 == 0) {
            return -1L;
        }
        if (j11 > j12) {
            j11 = j12;
        }
        sink.K0(this, j11);
        return j11;
    }

    @Override // m00.k
    public final byte readByte() throws EOFException {
        if (this.f40718b == 0) {
            throw new EOFException();
        }
        e0 e0Var = this.f40717a;
        kotlin.jvm.internal.m.c(e0Var);
        int i11 = e0Var.f40702b;
        int i12 = e0Var.f40703c;
        int i13 = i11 + 1;
        byte b3 = e0Var.f40701a[i11];
        this.f40718b--;
        if (i13 != i12) {
            e0Var.f40702b = i13;
            return b3;
        }
        this.f40717a = e0Var.a();
        f0.a(e0Var);
        return b3;
    }

    @Override // m00.k
    public final int readInt() throws EOFException {
        if (this.f40718b < 4) {
            throw new EOFException();
        }
        e0 e0Var = this.f40717a;
        kotlin.jvm.internal.m.c(e0Var);
        int i11 = e0Var.f40702b;
        int i12 = e0Var.f40703c;
        if (i12 - i11 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = e0Var.f40701a;
        int i13 = i11 + 3;
        int i14 = ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 2] & 255) << 8);
        int i15 = i11 + 4;
        int i16 = (bArr[i13] & 255) | i14;
        this.f40718b -= 4;
        if (i15 != i12) {
            e0Var.f40702b = i15;
            return i16;
        }
        this.f40717a = e0Var.a();
        f0.a(e0Var);
        return i16;
    }

    @Override // m00.k
    public final short readShort() throws EOFException {
        if (this.f40718b < 2) {
            throw new EOFException();
        }
        e0 e0Var = this.f40717a;
        kotlin.jvm.internal.m.c(e0Var);
        int i11 = e0Var.f40702b;
        int i12 = e0Var.f40703c;
        if (i12 - i11 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = e0Var.f40701a;
        int i13 = i11 + 1;
        int i14 = (bArr[i11] & 255) << 8;
        int i15 = i11 + 2;
        int i16 = (bArr[i13] & 255) | i14;
        this.f40718b -= 2;
        if (i15 == i12) {
            this.f40717a = e0Var.a();
            f0.a(e0Var);
        } else {
            e0Var.f40702b = i15;
        }
        return (short) i16;
    }

    @Override // m00.k
    public final boolean request(long j11) {
        return this.f40718b >= j11;
    }

    @Override // m00.k
    public final String s0(Charset charset) {
        kotlin.jvm.internal.m.f(charset, "charset");
        return A(this.f40718b, charset);
    }

    @Override // m00.k
    public final void s1(long j11) throws EOFException {
        if (this.f40718b < j11) {
            throw new EOFException();
        }
    }

    @Override // m00.k
    public final void skip(long j11) throws EOFException {
        while (j11 > 0) {
            e0 e0Var = this.f40717a;
            if (e0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j11, e0Var.f40703c - e0Var.f40702b);
            long j12 = iMin;
            this.f40718b -= j12;
            j11 -= j12;
            int i11 = e0Var.f40702b + iMin;
            e0Var.f40702b = i11;
            if (i11 == e0Var.f40703c) {
                this.f40717a = e0Var.a();
                f0.a(e0Var);
            }
        }
    }

    @Override // m00.i0
    public final k0 timeout() {
        return k0.f40719d;
    }

    public final String toString() {
        return D().toString();
    }

    public final boolean v(long j11, l bytes, int i11) {
        kotlin.jvm.internal.m.f(bytes, "bytes");
        if (i11 >= 0 && j11 >= 0 && ((long) i11) + j11 <= this.f40718b && i11 <= bytes.e()) {
            return i11 == 0 || n00.a.a(this, bytes, j11, j11 + 1, i11) != -1;
        }
        return false;
    }

    @Override // m00.j
    public final i w() {
        return this;
    }

    @Override // m00.j
    public final /* bridge */ /* synthetic */ j write(byte[] bArr) {
        m228write(bArr);
        return this;
    }

    @Override // m00.j
    public final /* bridge */ /* synthetic */ j writeByte(int i11) {
        J(i11);
        return this;
    }

    @Override // m00.j
    public final /* bridge */ /* synthetic */ j writeInt(int i11) {
        T(i11);
        return this;
    }

    @Override // m00.j
    public final /* bridge */ /* synthetic */ j writeShort(int i11) {
        U(i11);
        return this;
    }

    public final byte[] x(long j11) throws EOFException {
        if (j11 < 0 || j11 > 2147483647L) {
            throw new IllegalArgumentException(defpackage.e.h(j11, "byteCount: ").toString());
        }
        if (this.f40718b < j11) {
            throw new EOFException();
        }
        byte[] sink = new byte[(int) j11];
        kotlin.jvm.internal.m.f(sink, "sink");
        int i11 = 0;
        while (i11 < sink.length) {
            int i12 = read(sink, i11, sink.length - i11);
            if (i12 == -1) {
                throw new EOFException();
            }
            i11 += i12;
        }
        return sink;
    }

    public final short y() throws EOFException {
        short s3 = readShort();
        return (short) (((s3 & 255) << 8) | ((65280 & s3) >>> 8));
    }

    @Override // m00.k
    public final l z(long j11) throws EOFException {
        if (j11 < 0 || j11 > 2147483647L) {
            throw new IllegalArgumentException(defpackage.e.h(j11, "byteCount: ").toString());
        }
        if (this.f40718b < j11) {
            throw new EOFException();
        }
        if (j11 < 4096) {
            return new l(x(j11));
        }
        l lVarF = F((int) j11);
        skip(j11);
        return lVarF;
    }

    @Override // m00.k
    public final long z1() throws EOFException {
        int i11;
        if (this.f40718b == 0) {
            throw new EOFException();
        }
        int i12 = 0;
        boolean z11 = false;
        long j11 = 0;
        do {
            e0 e0Var = this.f40717a;
            kotlin.jvm.internal.m.c(e0Var);
            byte[] bArr = e0Var.f40701a;
            int i13 = e0Var.f40702b;
            int i14 = e0Var.f40703c;
            while (i13 < i14) {
                byte b3 = bArr[i13];
                if (b3 >= 48 && b3 <= 57) {
                    i11 = b3 - 48;
                } else if (b3 >= 97 && b3 <= 102) {
                    i11 = b3 - 87;
                } else {
                    if (b3 < 65 || b3 > 70) {
                        if (i12 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(b.k(b3)));
                        }
                        z11 = true;
                        break;
                    }
                    i11 = b3 - 55;
                }
                if (((-1152921504606846976L) & j11) != 0) {
                    i iVar = new i();
                    iVar.S(j11);
                    iVar.J(b3);
                    throw new NumberFormatException("Number too large: ".concat(iVar.B()));
                }
                j11 = (j11 << 4) | ((long) i11);
                i13++;
                i12++;
            }
            if (i13 == i14) {
                this.f40717a = e0Var.a();
                f0.a(e0Var);
            } else {
                e0Var.f40702b = i13;
            }
            if (z11) {
                break;
            }
        } while (this.f40717a != null);
        this.f40718b -= (long) i12;
        return j11;
    }

    @Override // m00.j
    public final /* bridge */ /* synthetic */ j write(byte[] bArr, int i11, int i12) {
        m229write(bArr, i11, i12);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.m.f(source, "source");
        int iRemaining = source.remaining();
        int i11 = iRemaining;
        while (i11 > 0) {
            e0 e0VarG = G(1);
            int iMin = Math.min(i11, 8192 - e0VarG.f40703c);
            source.get(e0VarG.f40701a, e0VarG.f40703c, iMin);
            i11 -= iMin;
            e0VarG.f40703c += iMin;
        }
        this.f40718b += (long) iRemaining;
        return iRemaining;
    }

    /* JADX INFO: renamed from: write, reason: collision with other method in class */
    public final void m228write(byte[] source) {
        kotlin.jvm.internal.m.f(source, "source");
        m229write(source, 0, source.length);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.m.f(sink, "sink");
        e0 e0Var = this.f40717a;
        if (e0Var == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), e0Var.f40703c - e0Var.f40702b);
        sink.put(e0Var.f40701a, e0Var.f40702b, iMin);
        int i11 = e0Var.f40702b + iMin;
        e0Var.f40702b = i11;
        this.f40718b -= (long) iMin;
        if (i11 == e0Var.f40703c) {
            this.f40717a = e0Var.a();
            f0.a(e0Var);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: write, reason: collision with other method in class */
    public final void m229write(byte[] bArr, int i11, int i12) {
        kotlin.jvm.internal.m.f(bArr, bjXGJ.cNWdtHJTRIG);
        long j11 = i12;
        b.e(bArr.length, i11, j11);
        int i13 = i12 + i11;
        while (i11 < i13) {
            e0 e0VarG = G(1);
            int iMin = Math.min(i13 - i11, 8192 - e0VarG.f40703c);
            int i14 = i11 + iMin;
            ry.l.F(e0VarG.f40703c, i11, i14, bArr, e0VarG.f40701a);
            e0VarG.f40703c += iMin;
            i11 = i14;
        }
        this.f40718b += j11;
    }

    public final int read(byte[] sink, int i11, int i12) {
        kotlin.jvm.internal.m.f(sink, "sink");
        b.e(sink.length, i11, i12);
        e0 e0Var = this.f40717a;
        if (e0Var == null) {
            return -1;
        }
        int iMin = Math.min(i12, e0Var.f40703c - e0Var.f40702b);
        byte[] bArr = e0Var.f40701a;
        int i13 = e0Var.f40702b;
        ry.l.F(i11, i13, i13 + iMin, bArr, sink);
        int i14 = e0Var.f40702b + iMin;
        e0Var.f40702b = i14;
        this.f40718b -= (long) iMin;
        if (i14 == e0Var.f40703c) {
            this.f40717a = e0Var.a();
            f0.a(e0Var);
        }
        return iMin;
    }
}
