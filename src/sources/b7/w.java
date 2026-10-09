package b7;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f4036d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f4037e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ImmutableSet f4038f = ImmutableSet.l(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f4039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4041c;

    public w() {
        this.f4039a = f0.f3976b;
    }

    public static int b(int i11, int i12, int i13, int i14) {
        byte b3 = (byte) i13;
        return Ints.d((byte) 0, UnsignedBytes.a(((i11 & 7) << 2) | ((i12 & 48) >> 4)), UnsignedBytes.a(((((byte) i12) & 15) << 4) | ((b3 & 60) >> 2)), UnsignedBytes.a(((b3 & 3) << 6) | (((byte) i14) & 63)));
    }

    public static int d(Charset charset) {
        a.c("Unsupported charset: " + charset, f4038f.contains(charset));
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean e(byte b3) {
        return (b3 & 192) == 128;
    }

    public final int A() {
        int iJ = j();
        if (iJ >= 0) {
            return iJ;
        }
        throw new IllegalStateException(nv.p.j(iJ, "Top bit not zero: "));
    }

    public final long B() {
        long jQ = q();
        if (jQ >= 0) {
            return jQ;
        }
        throw new IllegalStateException(defpackage.e.h(jQ, "Top bit not zero: "));
    }

    public final int C() {
        byte[] bArr = this.f4039a;
        int i11 = this.f4040b;
        int i12 = i11 + 1;
        this.f4040b = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.f4040b = i11 + 2;
        return (bArr[i12] & 255) | i13;
    }

    public final long D() {
        int i11;
        int i12;
        long j11 = this.f4039a[this.f4040b];
        int i13 = 7;
        while (true) {
            if (i13 >= 0) {
                int i14 = 1 << i13;
                if ((((long) i14) & j11) == 0) {
                    if (i13 < 6) {
                        j11 &= (long) (i14 - 1);
                        i12 = 7 - i13;
                        break;
                    }
                    if (i13 == 7) {
                        i12 = 1;
                        break;
                    }
                } else {
                    i13--;
                }
            }
            i12 = 0;
            break;
        }
        if (i12 == 0) {
            throw new NumberFormatException(defpackage.e.h(j11, "Invalid UTF-8 sequence first byte: "));
        }
        for (i11 = 1; i11 < i12; i11++) {
            byte b3 = this.f4039a[this.f4040b + i11];
            if ((b3 & 192) != 128) {
                throw new NumberFormatException(defpackage.e.h(j11, "Invalid UTF-8 sequence continuation byte: "));
            }
            j11 = (j11 << 6) | ((long) (b3 & 63));
        }
        this.f4040b += i12;
        return j11;
    }

    public final Charset E() {
        if (a() >= 3) {
            byte[] bArr = this.f4039a;
            int i11 = this.f4040b;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f4040b = i11 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f4039a;
        int i12 = this.f4040b;
        byte b3 = bArr2[i12];
        if (b3 == -2 && bArr2[i12 + 1] == -1) {
            this.f4040b = i12 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b3 != -1 || bArr2[i12 + 1] != -2) {
            return null;
        }
        this.f4040b = i12 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void F(int i11) {
        byte[] bArr = this.f4039a;
        if (bArr.length < i11) {
            bArr = new byte[i11];
        }
        G(bArr, i11);
    }

    public final void G(byte[] bArr, int i11) {
        this.f4039a = bArr;
        this.f4041c = i11;
        this.f4040b = 0;
    }

    public final void H(int i11) {
        a.d(i11 >= 0 && i11 <= this.f4039a.length);
        this.f4041c = i11;
    }

    public final void I(int i11) {
        a.d(i11 >= 0 && i11 <= this.f4041c);
        this.f4040b = i11;
    }

    public final void J(int i11) {
        I(this.f4040b + i11);
    }

    public final int a() {
        return Math.max(this.f4041c - this.f4040b, 0);
    }

    public final void c(int i11) {
        byte[] bArr = this.f4039a;
        if (i11 > bArr.length) {
            this.f4039a = Arrays.copyOf(bArr, i11);
        }
    }

    public final char f(int i11, ByteOrder byteOrder) {
        byte b3;
        byte b11;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f4039a;
            int i12 = this.f4040b + i11;
            b3 = bArr[i12];
            b11 = bArr[i12 + 1];
        } else {
            byte[] bArr2 = this.f4039a;
            int i13 = this.f4040b + i11;
            b3 = bArr2[i13 + 1];
            b11 = bArr2[i13];
        }
        return (char) ((b3 << 8) | (b11 & 255));
    }

    public final int g(Charset charset) {
        int codePoint;
        int i11;
        int iB;
        a.c("Unsupported charset: " + charset, f4038f.contains(charset));
        if (a() < d(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.f4040b + ", limit=" + this.f4041c);
        }
        int i12 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b3 = this.f4039a[this.f4040b];
            if ((b3 & 128) == 0) {
                codePoint = b3 & 255;
                return (codePoint << 8) | i12;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b11 = this.f4039a[this.f4040b];
            if ((b11 & 128) == 0) {
                i11 = 1;
            } else if ((b11 & 224) == 192 && a() >= 2 && e(this.f4039a[this.f4040b + 1])) {
                i11 = 2;
            } else if ((this.f4039a[this.f4040b] & 240) == 224 && a() >= 3 && e(this.f4039a[this.f4040b + 1]) && e(this.f4039a[this.f4040b + 2])) {
                i11 = 3;
            } else {
                i11 = ((this.f4039a[this.f4040b] & 248) == 240 && a() >= 4 && e(this.f4039a[this.f4040b + 1]) && e(this.f4039a[this.f4040b + 2]) && e(this.f4039a[this.f4040b + 3])) ? 4 : 0;
            }
            if (i11 == 1) {
                iB = this.f4039a[this.f4040b] & 255;
            } else if (i11 == 2) {
                byte[] bArr = this.f4039a;
                int i13 = this.f4040b;
                iB = b(0, 0, bArr[i13], bArr[i13 + 1]);
            } else {
                if (i11 != 3) {
                    if (i11 == 4) {
                        byte[] bArr2 = this.f4039a;
                        int i14 = this.f4040b;
                        iB = b(bArr2[i14], bArr2[i14 + 1], bArr2[i14 + 2], bArr2[i14 + 3]);
                    }
                    return 0;
                }
                byte[] bArr3 = this.f4039a;
                int i15 = this.f4040b;
                iB = b(0, bArr3[i15] & 15, bArr3[i15 + 1], bArr3[i15 + 2]);
            }
            i12 = i11;
            codePoint = iB;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cF = f(0, byteOrder);
            if (!Character.isHighSurrogate(cF) || a() < 4) {
                codePoint = cF;
                i12 = 2;
            } else {
                codePoint = Character.toCodePoint(cF, f(2, byteOrder));
                i12 = 4;
            }
        }
        return (codePoint << 8) | i12;
    }

    public final void h(byte[] bArr, int i11, int i12) {
        System.arraycopy(this.f4039a, this.f4040b, bArr, i11, i12);
        this.f4040b += i12;
    }

    public final char i(Charset charset, char[] cArr) {
        int iG;
        if (a() >= d(charset) && (iG = g(charset)) != 0) {
            long j11 = iG >>> 8;
            Preconditions.d(j11, "out of range: %s", (j11 >> 32) == 0);
            int i11 = (int) j11;
            if (!Character.isSupplementaryCodePoint(i11)) {
                long j12 = i11;
                char c11 = (char) j12;
                Preconditions.d(j12, "Out of range: %s", ((long) c11) == j12);
                for (char c12 : cArr) {
                    if (c12 == c11) {
                        this.f4040b = Ints.b(iG & 255) + this.f4040b;
                        return c11;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int j() {
        byte[] bArr = this.f4039a;
        int i11 = this.f4040b;
        int i12 = i11 + 1;
        this.f4040b = i12;
        int i13 = (bArr[i11] & 255) << 24;
        int i14 = i11 + 2;
        this.f4040b = i14;
        int i15 = ((bArr[i12] & 255) << 16) | i13;
        int i16 = i11 + 3;
        this.f4040b = i16;
        int i17 = i15 | ((bArr[i14] & 255) << 8);
        this.f4040b = i11 + 4;
        return (bArr[i16] & 255) | i17;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x00cd A[ADDED_TO_REGION, EDGE_INSN: B:66:0x00cd->B:56:0x00cd BREAK  A[LOOP:0: B:26:0x0069->B:54:0x00ca], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00cd A[ADDED_TO_REGION, EDGE_INSN: B:68:0x00cd->B:56:0x00cd BREAK  A[LOOP:0: B:26:0x0069->B:54:0x00ca], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca A[SYNTHETIC] */
    public final String k(Charset charset) {
        int i11;
        byte[] bArr;
        byte b3;
        byte[] bArr2;
        byte b11;
        a.c("Unsupported charset: " + charset, f4038f.contains(charset));
        if (a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            E();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i11 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i11 = 2;
        }
        int i12 = this.f4040b;
        while (true) {
            int i13 = this.f4041c;
            if (i12 >= i13 - (i11 - 1)) {
                i12 = i13;
                break;
            }
            if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
                byte b12 = this.f4039a[i12];
                String str = f0.f3975a;
                if (b12 == 10 || b12 == 13) {
                    break;
                }
                if (!charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    bArr = this.f4039a;
                    if (bArr[i12] == 0) {
                        b3 = bArr[i12 + 1];
                        String str2 = f0.f3975a;
                        if (b3 != 10 || b3 == 13) {
                            break;
                        }
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr2 = this.f4039a;
                            if (bArr2[i12 + 1] == 0) {
                                b11 = bArr2[i12];
                                String str3 = f0.f3975a;
                                if (b11 != 10 || b11 == 13) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i12 += i11;
                    } else {
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr2 = this.f4039a;
                            if (bArr2[i12 + 1] == 0) {
                                b11 = bArr2[i12];
                                String str4 = f0.f3975a;
                                if (b11 != 10) {
                                    break;
                                }
                                break;
                                break;
                            }
                            continue;
                        }
                        i12 += i11;
                    }
                } else {
                    if (charset.equals(StandardCharsets.UTF_16LE)) {
                        bArr2 = this.f4039a;
                        if (bArr2[i12 + 1] == 0) {
                            b11 = bArr2[i12];
                            String str5 = f0.f3975a;
                            if (b11 != 10) {
                                break;
                                break;
                            }
                            break;
                            break;
                        }
                        continue;
                    }
                    i12 += i11;
                }
            } else if (charset.equals(StandardCharsets.UTF_16)) {
                bArr = this.f4039a;
                if (bArr[i12] == 0) {
                    b3 = bArr[i12 + 1];
                    String str6 = f0.f3975a;
                    if (b3 != 10) {
                        break;
                    }
                    break;
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr2 = this.f4039a;
                    if (bArr2[i12 + 1] == 0) {
                        b11 = bArr2[i12];
                        String str7 = f0.f3975a;
                        if (b11 != 10) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    continue;
                }
                i12 += i11;
            } else {
                bArr = this.f4039a;
                if (bArr[i12] == 0) {
                    b3 = bArr[i12 + 1];
                    String str8 = f0.f3975a;
                    if (b3 != 10) {
                        break;
                        break;
                    }
                    break;
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr2 = this.f4039a;
                    if (bArr2[i12 + 1] == 0) {
                        b11 = bArr2[i12];
                        String str9 = f0.f3975a;
                        if (b11 != 10) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    continue;
                }
                i12 += i11;
            }
        }
        String strU = u(i12 - this.f4040b, charset);
        if (this.f4040b != this.f4041c && i(charset, f4036d) == '\r') {
            i(charset, f4037e);
        }
        return strU;
    }

    public final int l() {
        byte[] bArr = this.f4039a;
        int i11 = this.f4040b;
        int i12 = i11 + 1;
        this.f4040b = i12;
        int i13 = bArr[i11] & 255;
        int i14 = i11 + 2;
        this.f4040b = i14;
        int i15 = ((bArr[i12] & 255) << 8) | i13;
        int i16 = i11 + 3;
        this.f4040b = i16;
        int i17 = i15 | ((bArr[i14] & 255) << 16);
        this.f4040b = i11 + 4;
        return ((bArr[i16] & 255) << 24) | i17;
    }

    public final long m() {
        byte[] bArr = this.f4039a;
        int i11 = this.f4040b;
        int i12 = i11 + 1;
        this.f4040b = i12;
        long j11 = ((long) bArr[i11]) & 255;
        int i13 = i11 + 2;
        this.f4040b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        int i14 = i11 + 3;
        this.f4040b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 16);
        int i15 = i11 + 4;
        this.f4040b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i11 + 5;
        this.f4040b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 32);
        int i17 = i11 + 6;
        this.f4040b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 40);
        int i18 = i11 + 7;
        this.f4040b = i18;
        long j17 = j16 | ((((long) bArr[i17]) & 255) << 48);
        this.f4040b = i11 + 8;
        return ((((long) bArr[i18]) & 255) << 56) | j17;
    }

    public final long n() {
        byte[] bArr = this.f4039a;
        int i11 = this.f4040b;
        int i12 = i11 + 1;
        this.f4040b = i12;
        long j11 = ((long) bArr[i11]) & 255;
        int i13 = i11 + 2;
        this.f4040b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        int i14 = i11 + 3;
        this.f4040b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 16);
        this.f4040b = i11 + 4;
        return ((((long) bArr[i14]) & 255) << 24) | j13;
    }

    public final int o() {
        int iL = l();
        if (iL >= 0) {
            return iL;
        }
        throw new IllegalStateException(nv.p.j(iL, "Top bit not zero: "));
    }

    public final int p() {
        byte[] bArr = this.f4039a;
        int i11 = this.f4040b;
        int i12 = i11 + 1;
        this.f4040b = i12;
        int i13 = bArr[i11] & 255;
        this.f4040b = i11 + 2;
        return ((bArr[i12] & 255) << 8) | i13;
    }

    public final long q() {
        byte[] bArr = this.f4039a;
        int i11 = this.f4040b;
        int i12 = i11 + 1;
        this.f4040b = i12;
        long j11 = (((long) bArr[i11]) & 255) << 56;
        int i13 = i11 + 2;
        this.f4040b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 48);
        int i14 = i11 + 3;
        this.f4040b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 40);
        int i15 = i11 + 4;
        this.f4040b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i11 + 5;
        this.f4040b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 24);
        int i17 = i11 + 6;
        this.f4040b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 16);
        int i18 = i11 + 7;
        this.f4040b = i18;
        long j17 = j16 | ((((long) bArr[i17]) & 255) << 8);
        this.f4040b = i11 + 8;
        return (((long) bArr[i18]) & 255) | j17;
    }

    public final String r() {
        if (a() == 0) {
            return null;
        }
        int i11 = this.f4040b;
        while (i11 < this.f4041c && this.f4039a[i11] != 0) {
            i11++;
        }
        byte[] bArr = this.f4039a;
        int i12 = this.f4040b;
        String str = f0.f3975a;
        String str2 = new String(bArr, i12, i11 - i12, StandardCharsets.UTF_8);
        this.f4040b = i11;
        if (i11 < this.f4041c) {
            this.f4040b = i11 + 1;
        }
        return str2;
    }

    public final String s(int i11) {
        if (i11 == 0) {
            return BuildConfig.VERSION_NAME;
        }
        int i12 = this.f4040b;
        int i13 = (i12 + i11) - 1;
        int i14 = (i13 >= this.f4041c || this.f4039a[i13] != 0) ? i11 : i11 - 1;
        byte[] bArr = this.f4039a;
        String str = f0.f3975a;
        String str2 = new String(bArr, i12, i14, StandardCharsets.UTF_8);
        this.f4040b += i11;
        return str2;
    }

    public final short t() {
        byte[] bArr = this.f4039a;
        int i11 = this.f4040b;
        int i12 = i11 + 1;
        this.f4040b = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.f4040b = i11 + 2;
        return (short) ((bArr[i12] & 255) | i13);
    }

    public final String u(int i11, Charset charset) {
        String str = new String(this.f4039a, this.f4040b, i11, charset);
        this.f4040b += i11;
        return str;
    }

    public final int v() {
        return (w() << 21) | (w() << 14) | (w() << 7) | w();
    }

    public final int w() {
        byte[] bArr = this.f4039a;
        int i11 = this.f4040b;
        this.f4040b = i11 + 1;
        return bArr[i11] & 255;
    }

    public final int x() {
        byte[] bArr = this.f4039a;
        int i11 = this.f4040b;
        int i12 = i11 + 1;
        this.f4040b = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.f4040b = i11 + 2;
        int i14 = (bArr[i12] & 255) | i13;
        this.f4040b = i11 + 4;
        return i14;
    }

    public final long y() {
        byte[] bArr = this.f4039a;
        int i11 = this.f4040b;
        int i12 = i11 + 1;
        this.f4040b = i12;
        long j11 = (((long) bArr[i11]) & 255) << 24;
        int i13 = i11 + 2;
        this.f4040b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i11 + 3;
        this.f4040b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 8);
        this.f4040b = i11 + 4;
        return (((long) bArr[i14]) & 255) | j13;
    }

    public final int z() {
        byte[] bArr = this.f4039a;
        int i11 = this.f4040b;
        int i12 = i11 + 1;
        this.f4040b = i12;
        int i13 = (bArr[i11] & 255) << 16;
        int i14 = i11 + 2;
        this.f4040b = i14;
        int i15 = ((bArr[i12] & 255) << 8) | i13;
        this.f4040b = i11 + 3;
        return (bArr[i14] & 255) | i15;
    }

    public w(int i11) {
        this.f4039a = new byte[i11];
        this.f4041c = i11;
    }

    public w(byte[] bArr) {
        this.f4039a = bArr;
        this.f4041c = bArr.length;
    }

    public w(byte[] bArr, int i11) {
        this.f4039a = bArr;
        this.f4041c = i11;
    }
}
