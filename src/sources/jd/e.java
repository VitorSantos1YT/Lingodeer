package jd;

import b1.p;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import fr.p3;
import java.io.EOFException;
import m00.d0;
import m00.i;
import m00.l;
import m00.z;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends d {
    public static final l N;
    public static final l O;
    public static final l P;
    public int H;
    public long K;
    public int L;
    public String M;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0 f36307f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f36308t;

    static {
        l lVar = l.f40723d;
        N = p3.l("'\\");
        O = p3.l("\"\\");
        P = p3.l("{}[]:, \n\t\r\f/\\;#=");
        p3.l("\n\r");
        p3.l("*/");
    }

    public e(d0 d0Var) {
        this.f36304b = new int[32];
        this.f36305c = new String[32];
        this.f36306d = new int[32];
        this.H = 0;
        this.f36307f = d0Var;
        this.f36308t = d0Var.f40691b;
        x(6);
    }

    @Override // jd.d
    public final void B() {
        int i11 = 0;
        do {
            int iF = this.H;
            if (iF == 0) {
                iF = F();
            }
            if (iF == 3) {
                x(1);
            } else {
                if (iF == 1) {
                    x(3);
                } else {
                    String str = anrPHlQ.IofbO;
                    if (iF == 4) {
                        i11--;
                        if (i11 < 0) {
                            throw new a(str + v() + " at path " + e());
                        }
                        this.f36303a--;
                    } else if (iF == 2) {
                        i11--;
                        if (i11 < 0) {
                            throw new a(str + v() + " at path " + e());
                        }
                        this.f36303a--;
                    } else {
                        i iVar = this.f36308t;
                        if (iF == 14 || iF == 10) {
                            long jB = this.f36307f.b(P);
                            if (jB == -1) {
                                jB = iVar.f40718b;
                            }
                            iVar.skip(jB);
                        } else if (iF == 9 || iF == 13) {
                            U(O);
                        } else if (iF == 8 || iF == 12) {
                            U(N);
                        } else if (iF == 17) {
                            iVar.skip(this.L);
                        } else if (iF == 18) {
                            throw new a(str + v() + " at path " + e());
                        }
                    }
                }
                this.H = 0;
            }
            i11++;
            this.H = 0;
        } while (i11 != 0);
        int[] iArr = this.f36306d;
        int i12 = this.f36303a - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f36305c[i12] = "null";
    }

    public final void D() throws b {
        C("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x01b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:162:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:164:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:167:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:172:0x01ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:173:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:175:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:177:0x0200  */
    /* JADX WARN: Code duplicated, block: B:230:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0115 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x0116  */
    /* JADX WARN: Code duplicated, block: B:92:0x0127  */
    /* JADX WARN: Code duplicated, block: B:94:0x0130  */
    public final int F() throws EOFException, b {
        int i11;
        String str;
        String str2;
        long j11;
        char cH;
        char c11;
        int i12;
        int i13;
        int i14;
        byte bH;
        char c12;
        int[] iArr = this.f36304b;
        int i15 = this.f36303a - 1;
        int i16 = iArr[i15];
        i iVar = this.f36308t;
        if (i16 == 1) {
            iArr[i15] = 2;
        } else if (i16 == 2) {
            int iJ = J(true);
            iVar.readByte();
            if (iJ != 44) {
                if (iJ == 59) {
                    D();
                    throw null;
                }
                if (iJ == 93) {
                    this.H = 4;
                    return 4;
                }
                C("Unterminated array");
                throw null;
            }
        } else {
            if (i16 == 3 || i16 == 5) {
                iArr[i15] = 4;
                if (i16 == 5) {
                    int iJ2 = J(true);
                    iVar.readByte();
                    if (iJ2 != 44) {
                        if (iJ2 == 59) {
                            D();
                            throw null;
                        }
                        if (iJ2 == 125) {
                            this.H = 2;
                            return 2;
                        }
                        C("Unterminated object");
                        throw null;
                    }
                }
                int iJ3 = J(true);
                if (iJ3 == 34) {
                    iVar.readByte();
                    this.H = 13;
                    return 13;
                }
                if (iJ3 == 39) {
                    iVar.readByte();
                    D();
                    throw null;
                }
                if (iJ3 != 125) {
                    D();
                    throw null;
                }
                if (i16 == 5) {
                    C("Expected name");
                    throw null;
                }
                iVar.readByte();
                this.H = 2;
                return 2;
            }
            if (i16 == 4) {
                iArr[i15] = 5;
                int iJ4 = J(true);
                iVar.readByte();
                if (iJ4 != 58) {
                    if (iJ4 != 61) {
                        C("Expected ':'");
                        throw null;
                    }
                    D();
                    throw null;
                }
            } else if (i16 == 6) {
                iArr[i15] = 7;
            } else {
                if (i16 == 7) {
                    if (J(false) == -1) {
                        this.H = 18;
                        return 18;
                    }
                    D();
                    throw null;
                }
                if (i16 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iJ5 = J(true);
        if (iJ5 == 34) {
            iVar.readByte();
            this.H = 9;
            return 9;
        }
        if (iJ5 == 39) {
            D();
            throw null;
        }
        if (iJ5 != 44 && iJ5 != 59) {
            if (iJ5 == 91) {
                iVar.readByte();
                this.H = 3;
                return 3;
            }
            if (iJ5 != 93) {
                if (iJ5 == 123) {
                    iVar.readByte();
                    this.H = 1;
                    return 1;
                }
                byte bH2 = iVar.h(0L);
                d0 d0Var = this.f36307f;
                if (bH2 == 116 || bH2 == 84) {
                    i11 = 5;
                    str2 = "true";
                    str = "TRUE";
                } else {
                    if (bH2 != 102 && bH2 != 70) {
                        if (bH2 == 110 || bH2 == 78) {
                            i11 = 7;
                            str2 = "null";
                            str = "NULL";
                        } else {
                            j11 = 0;
                            i11 = 0;
                        }
                        if (i11 != 0) {
                            return i11;
                        }
                        boolean z11 = true;
                        long j12 = j11;
                        c11 = 0;
                        i12 = 0;
                        boolean z12 = false;
                        while (true) {
                            i13 = i12 + 1;
                            if (d0Var.request(i13)) {
                                bH = iVar.h(i12);
                                if (bH != 43) {
                                    if (bH != 69 || bH == 101) {
                                        c12 = 6;
                                        if (c11 != 2 || c11 == 4) {
                                            c11 = 5;
                                            i12 = i13;
                                        } else {
                                            i14 = 0;
                                        }
                                    } else if (bH == 45) {
                                        c12 = 6;
                                        if (c11 == 0) {
                                            c11 = 1;
                                            z12 = true;
                                        } else {
                                            if (c11 != 5) {
                                                i14 = 0;
                                            }
                                            c11 = c12;
                                        }
                                        i12 = i13;
                                    } else if (bH != 46) {
                                        if (bH >= 48 && bH <= 57) {
                                            if (c11 == 1 || c11 == 0) {
                                                c12 = 6;
                                                j12 = -(bH - 48);
                                                c11 = 2;
                                            } else {
                                                if (c11 == 2) {
                                                    if (j12 != j11) {
                                                        long j13 = (10 * j12) - ((long) (bH - 48));
                                                        z11 &= j12 > -922337203685477580L || (j12 == -922337203685477580L && j13 < j12);
                                                        j12 = j13;
                                                    }
                                                } else if (c11 == 3) {
                                                    c11 = 4;
                                                } else {
                                                    c12 = 6;
                                                    if (c11 == 5 || c11 == 6) {
                                                        c11 = 7;
                                                    }
                                                }
                                                c12 = 6;
                                                i12 = i13;
                                            }
                                            i12 = i13;
                                        } else if (!H(bH)) {
                                        }
                                        i14 = 0;
                                    } else {
                                        c12 = 6;
                                        if (c11 == 2) {
                                            c11 = 3;
                                            i12 = i13;
                                        } else {
                                            i14 = 0;
                                        }
                                    }
                                    if (i14 != 0) {
                                        return i14;
                                    }
                                    if (H(iVar.h(j11))) {
                                        D();
                                        throw null;
                                    }
                                    C("Expected value");
                                    throw null;
                                }
                                c12 = 6;
                                if (c11 != 5) {
                                    i14 = 0;
                                    if (i14 != 0) {
                                        return i14;
                                    }
                                    if (H(iVar.h(j11))) {
                                        C("Expected value");
                                        throw null;
                                    }
                                    D();
                                    throw null;
                                }
                                c11 = c12;
                                i12 = i13;
                            }
                            if (c11 != 2 && z11 && ((j12 != Long.MIN_VALUE || z12) && (j12 != j11 || !z12))) {
                                if (!z12) {
                                    j12 = -j12;
                                }
                                this.K = j12;
                                iVar.skip(i12);
                                i14 = 16;
                                this.H = 16;
                            } else if (c11 != 2 || c11 == 4 || c11 == 7) {
                                this.L = i12;
                                i14 = 17;
                                this.H = 17;
                            } else {
                                i14 = 0;
                            }
                            if (i14 != 0) {
                                return i14;
                            }
                            if (H(iVar.h(j11))) {
                                C("Expected value");
                                throw null;
                            }
                            D();
                            throw null;
                        }
                    }
                    i11 = 6;
                    str2 = "false";
                    str = "FALSE";
                }
                int length = str2.length();
                j11 = 0;
                int i17 = 1;
                while (true) {
                    if (i17 >= length) {
                        if (!d0Var.request(length + 1) || !H(iVar.h(length))) {
                            iVar.skip(length);
                            this.H = i11;
                            break;
                        }
                    } else {
                        int i18 = i17 + 1;
                        if (d0Var.request(i18) && ((cH = iVar.h(i17)) == str2.charAt(i17) || cH == str.charAt(i17))) {
                            i17 = i18;
                        }
                    }
                    i11 = 0;
                    break;
                }
                if (i11 != 0) {
                    return i11;
                }
                boolean z13 = true;
                long j14 = j11;
                c11 = 0;
                i12 = 0;
                boolean z14 = false;
                while (true) {
                    i13 = i12 + 1;
                    if (d0Var.request(i13)) {
                        bH = iVar.h(i12);
                        if (bH != 43) {
                            if (bH != 69) {
                                c12 = 6;
                                if (c11 != 2) {
                                }
                                c11 = 5;
                                i12 = i13;
                            } else {
                                c12 = 6;
                                if (c11 != 2) {
                                }
                                c11 = 5;
                                i12 = i13;
                            }
                            if (i14 != 0) {
                                return i14;
                            }
                            if (H(iVar.h(j11))) {
                                C("Expected value");
                                throw null;
                            }
                            D();
                            throw null;
                        }
                        c12 = 6;
                        if (c11 != 5) {
                            i14 = 0;
                            if (i14 != 0) {
                                return i14;
                            }
                            if (H(iVar.h(j11))) {
                                C("Expected value");
                                throw null;
                            }
                            D();
                            throw null;
                        }
                        c11 = c12;
                        i12 = i13;
                    }
                    if (c11 != 2) {
                        if (c11 != 2) {
                        }
                        this.L = i12;
                        i14 = 17;
                        this.H = 17;
                    } else {
                        if (c11 != 2) {
                        }
                        this.L = i12;
                        i14 = 17;
                        this.H = 17;
                    }
                    if (i14 != 0) {
                        return i14;
                    }
                    if (H(iVar.h(j11))) {
                        C("Expected value");
                        throw null;
                    }
                    D();
                    throw null;
                }
            }
            if (i16 == 1) {
                iVar.readByte();
                this.H = 4;
                return 4;
            }
        }
        if (i16 == 1 || i16 == 2) {
            D();
            throw null;
        }
        C("Unexpected value");
        throw null;
    }

    public final int G(String str, p pVar) {
        int length = ((String[]) pVar.f3800b).length;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(((String[]) pVar.f3800b)[i11])) {
                this.H = 0;
                this.f36305c[this.f36303a - 1] = str;
                return i11;
            }
        }
        return -1;
    }

    public final boolean H(int i11) throws b {
        if (i11 == 9 || i11 == 10 || i11 == 12 || i11 == 13 || i11 == 32) {
            return false;
        }
        if (i11 != 35) {
            if (i11 == 44) {
                return false;
            }
            if (i11 != 47 && i11 != 61) {
                if (i11 == 123 || i11 == 125 || i11 == 58) {
                    return false;
                }
                if (i11 != 59) {
                    switch (i11) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        D();
        throw null;
    }

    public final String I() {
        String strN;
        int iF = this.H;
        if (iF == 0) {
            iF = F();
        }
        if (iF == 14) {
            strN = S();
        } else if (iF == 13) {
            strN = N(O);
        } else if (iF == 12) {
            strN = N(N);
        } else {
            if (iF != 15) {
                throw new a("Expected a name but was " + v() + " at path " + e());
            }
            strN = this.M;
        }
        this.H = 0;
        this.f36305c[this.f36303a - 1] = strN;
        return strN;
    }

    public final int J(boolean z11) throws EOFException, b {
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            d0 d0Var = this.f36307f;
            if (!d0Var.request(i12)) {
                if (z11) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j11 = i11;
            i iVar = this.f36308t;
            byte bH = iVar.h(j11);
            if (bH != 10 && bH != 32 && bH != 13 && bH != 9) {
                iVar.skip(j11);
                if (bH == 47) {
                    if (d0Var.request(2L)) {
                        D();
                        throw null;
                    }
                } else if (bH == 35) {
                    D();
                    throw null;
                }
                return bH;
            }
            i11 = i12;
        }
    }

    public final String N(l lVar) throws EOFException, b {
        StringBuilder sb2 = null;
        while (true) {
            long jB = this.f36307f.b(lVar);
            if (jB == -1) {
                C("Unterminated string");
                throw null;
            }
            i iVar = this.f36308t;
            if (iVar.h(jB) != 92) {
                if (sb2 == null) {
                    String strA = iVar.A(jB, oz.a.f46133a);
                    iVar.readByte();
                    return strA;
                }
                sb2.append(iVar.A(jB, oz.a.f46133a));
                iVar.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(iVar.A(jB, oz.a.f46133a));
            iVar.readByte();
            sb2.append(T());
        }
    }

    public final String S() {
        long jB = this.f36307f.b(P);
        i iVar = this.f36308t;
        if (jB == -1) {
            return iVar.B();
        }
        iVar.getClass();
        return iVar.A(jB, oz.a.f46133a);
    }

    public final void U(l lVar) throws EOFException, b {
        while (true) {
            long jB = this.f36307f.b(lVar);
            if (jB == -1) {
                C("Unterminated string");
                throw null;
            }
            i iVar = this.f36308t;
            if (iVar.h(jB) != 92) {
                iVar.skip(jB + 1);
                return;
            } else {
                iVar.skip(jB + 1);
                T();
            }
        }
    }

    @Override // jd.d
    public final void a() {
        int iF = this.H;
        if (iF == 0) {
            iF = F();
        }
        if (iF == 3) {
            x(1);
            this.f36306d[this.f36303a - 1] = 0;
            this.H = 0;
        } else {
            throw new a("Expected BEGIN_ARRAY but was " + v() + " at path " + e());
        }
    }

    @Override // jd.d
    public final void b() {
        int iF = this.H;
        if (iF == 0) {
            iF = F();
        }
        if (iF == 1) {
            x(3);
            this.H = 0;
        } else {
            throw new a("Expected BEGIN_OBJECT but was " + v() + " at path " + e());
        }
    }

    @Override // jd.d
    public final void c() {
        int iF = this.H;
        if (iF == 0) {
            iF = F();
        }
        if (iF != 4) {
            throw new a("Expected END_ARRAY but was " + v() + " at path " + e());
        }
        int i11 = this.f36303a;
        this.f36303a = i11 - 1;
        int[] iArr = this.f36306d;
        int i12 = i11 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.H = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        this.H = 0;
        this.f36304b[0] = 8;
        this.f36303a = 1;
        this.f36308t.a();
        this.f36307f.close();
    }

    @Override // jd.d
    public final void d() {
        int iF = this.H;
        if (iF == 0) {
            iF = F();
        }
        if (iF != 2) {
            throw new a("Expected END_OBJECT but was " + v() + " at path " + e());
        }
        int i11 = this.f36303a;
        int i12 = i11 - 1;
        this.f36303a = i12;
        this.f36305c[i12] = null;
        int[] iArr = this.f36306d;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.H = 0;
    }

    @Override // jd.d
    public final boolean f() throws EOFException, b {
        int iF = this.H;
        if (iF == 0) {
            iF = F();
        }
        return (iF == 2 || iF == 4 || iF == 18) ? false : true;
    }

    @Override // jd.d
    public final boolean h() {
        int iF = this.H;
        if (iF == 0) {
            iF = F();
        }
        if (iF == 5) {
            this.H = 0;
            int[] iArr = this.f36306d;
            int i11 = this.f36303a - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (iF == 6) {
            this.H = 0;
            int[] iArr2 = this.f36306d;
            int i12 = this.f36303a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        }
        throw new a("Expected a boolean but was " + v() + " at path " + e());
    }

    @Override // jd.d
    public final double i() throws EOFException, b {
        int iF = this.H;
        if (iF == 0) {
            iF = F();
        }
        if (iF == 16) {
            this.H = 0;
            int[] iArr = this.f36306d;
            int i11 = this.f36303a - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.K;
        }
        if (iF == 17) {
            long j11 = this.L;
            i iVar = this.f36308t;
            iVar.getClass();
            this.M = iVar.A(j11, oz.a.f46133a);
        } else if (iF == 9) {
            this.M = N(O);
        } else if (iF == 8) {
            this.M = N(N);
        } else if (iF == 10) {
            this.M = S();
        } else if (iF != 11) {
            throw new a("Expected a double but was " + v() + " at path " + e());
        }
        this.H = 11;
        try {
            double d5 = Double.parseDouble(this.M);
            if (Double.isNaN(d5) || Double.isInfinite(d5)) {
                throw new b("JSON forbids NaN and infinities: " + d5 + " at path " + e());
            }
            this.M = null;
            this.H = 0;
            int[] iArr2 = this.f36306d;
            int i12 = this.f36303a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return d5;
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.M + " at path " + e());
        }
    }

    @Override // jd.d
    public final int p() {
        int iF = this.H;
        if (iF == 0) {
            iF = F();
        }
        if (iF == 16) {
            long j11 = this.K;
            int i11 = (int) j11;
            if (j11 == i11) {
                this.H = 0;
                int[] iArr = this.f36306d;
                int i12 = this.f36303a - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new a("Expected an int but was " + this.K + " at path " + e());
        }
        if (iF == 17) {
            long j12 = this.L;
            i iVar = this.f36308t;
            iVar.getClass();
            this.M = iVar.A(j12, oz.a.f46133a);
        } else if (iF == 9 || iF == 8) {
            String strN = iF == 9 ? N(O) : N(N);
            this.M = strN;
            try {
                int i13 = Integer.parseInt(strN);
                this.H = 0;
                int[] iArr2 = this.f36306d;
                int i14 = this.f36303a - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return i13;
            } catch (NumberFormatException unused) {
            }
        } else if (iF != 11) {
            throw new a("Expected an int but was " + v() + " at path " + e());
        }
        this.H = 11;
        try {
            double d5 = Double.parseDouble(this.M);
            int i15 = (int) d5;
            if (i15 != d5) {
                throw new a("Expected an int but was " + this.M + " at path " + e());
            }
            this.M = null;
            this.H = 0;
            int[] iArr3 = this.f36306d;
            int i16 = this.f36303a - 1;
            iArr3[i16] = iArr3[i16] + 1;
            return i15;
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.M + " at path " + e());
        }
    }

    @Override // jd.d
    public final String q() {
        String strA;
        int iF = this.H;
        if (iF == 0) {
            iF = F();
        }
        if (iF == 10) {
            strA = S();
        } else if (iF == 9) {
            strA = N(O);
        } else if (iF == 8) {
            strA = N(N);
        } else if (iF == 11) {
            strA = this.M;
            this.M = null;
        } else if (iF == 16) {
            strA = Long.toString(this.K);
        } else {
            if (iF != 17) {
                throw new a("Expected a string but was " + v() + " at path " + e());
            }
            long j11 = this.L;
            i iVar = this.f36308t;
            iVar.getClass();
            strA = iVar.A(j11, oz.a.f46133a);
        }
        this.H = 0;
        int[] iArr = this.f36306d;
        int i11 = this.f36303a - 1;
        iArr[i11] = iArr[i11] + 1;
        return strA;
    }

    public final String toString() {
        return "JsonReader(" + this.f36307f + ")";
    }

    @Override // jd.d
    public final c v() throws EOFException, b {
        int iF = this.H;
        if (iF == 0) {
            iF = F();
        }
        switch (iF) {
            case 1:
                return c.BEGIN_OBJECT;
            case 2:
                return c.END_OBJECT;
            case 3:
                return c.BEGIN_ARRAY;
            case 4:
                return c.END_ARRAY;
            case 5:
            case 6:
                return c.BOOLEAN;
            case 7:
                return c.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return c.NAME;
            case 16:
            case 17:
                return c.NUMBER;
            case 18:
                return c.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // jd.d
    public final int y(p pVar) {
        int iF = this.H;
        if (iF == 0) {
            iF = F();
        }
        if (iF < 12 || iF > 15) {
            return -1;
        }
        if (iF == 15) {
            return G(this.M, pVar);
        }
        int iQ = this.f36307f.Q((z) pVar.f3801c);
        if (iQ != -1) {
            this.H = 0;
            this.f36305c[this.f36303a - 1] = ((String[]) pVar.f3800b)[iQ];
            return iQ;
        }
        String str = this.f36305c[this.f36303a - 1];
        String strI = I();
        int iG = G(strI, pVar);
        if (iG == -1) {
            this.H = 15;
            this.M = strI;
            this.f36305c[this.f36303a - 1] = str;
        }
        return iG;
    }

    @Override // jd.d
    public final void A() {
        int iF = this.H;
        if (iF == 0) {
            iF = F();
        }
        if (iF == 14) {
            long jB = this.f36307f.b(P);
            i iVar = this.f36308t;
            if (jB == -1) {
                jB = iVar.f40718b;
            }
            iVar.skip(jB);
        } else if (iF == 13) {
            U(O);
        } else if (iF == 12) {
            U(N);
        } else if (iF != 15) {
            throw new a(bjXGJ.UajQHc + v() + " at path " + e());
        }
        this.H = 0;
        this.f36305c[this.f36303a - 1] = "null";
    }

    public final char T() throws EOFException, b {
        int i11;
        d0 d0Var = this.f36307f;
        if (!d0Var.request(1L)) {
            C(anrPHlQ.blA);
            throw null;
        }
        i iVar = this.f36308t;
        byte b3 = iVar.readByte();
        if (b3 == 10 || b3 == 34 || b3 == 39 || b3 == 47 || b3 == 92) {
            return (char) b3;
        }
        if (b3 == 98) {
            return '\b';
        }
        if (b3 == 102) {
            return '\f';
        }
        if (b3 == 110) {
            return '\n';
        }
        if (b3 == 114) {
            return '\r';
        }
        if (b3 == 116) {
            return '\t';
        }
        if (b3 != 117) {
            C("Invalid escape sequence: \\" + ((char) b3));
            throw null;
        }
        if (!d0Var.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + e());
        }
        char c11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            byte bH = iVar.h(i12);
            char c12 = (char) (c11 << 4);
            if (bH >= 48 && bH <= 57) {
                i11 = bH - 48;
            } else if (bH >= 97 && bH <= 102) {
                i11 = bH - 87;
            } else {
                if (bH < 65 || bH > 70) {
                    C("\\u".concat(iVar.A(4L, oz.a.f46133a)));
                    throw null;
                }
                i11 = bH - 55;
            }
            c11 = (char) (i11 + c12);
        }
        iVar.skip(4L);
        return c11;
    }
}
