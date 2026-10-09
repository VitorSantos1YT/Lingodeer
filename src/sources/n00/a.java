package n00;

import java.io.EOFException;
import kotlin.jvm.internal.m;
import m00.e0;
import m00.l;
import m00.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f43057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f43058b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(oz.a.f46133a);
        m.e(bytes, "getBytes(...)");
        f43057a = bytes;
        f43058b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(m00.i iVar, l bytes, long j11, long j12, int i11) {
        e0 e0Var;
        byte[] bArr;
        long j13 = j11;
        long j14 = j12;
        m.f(bytes, "bytes");
        long j15 = i11;
        m00.b.e(bytes.e(), 0, j15);
        if (i11 <= 0) {
            throw new IllegalArgumentException("byteCount == 0");
        }
        long j16 = 0;
        if (j13 < 0) {
            throw new IllegalArgumentException(defpackage.e.h(j13, "fromIndex < 0: ").toString());
        }
        if (j13 > j14) {
            StringBuilder sbJ = w4.c.j(j13, "fromIndex > toIndex: ", " > ");
            sbJ.append(j14);
            throw new IllegalArgumentException(sbJ.toString().toString());
        }
        long j17 = iVar.f40718b;
        if (j14 > j17) {
            j14 = j17;
        }
        if (j13 == j14 || (e0Var = iVar.f40717a) == null) {
            return -1L;
        }
        if (j17 - j13 >= j13) {
            while (true) {
                long j18 = ((long) (e0Var.f40703c - e0Var.f40702b)) + j16;
                if (j18 > j13) {
                    break;
                }
                e0Var = e0Var.f40706f;
                m.c(e0Var);
                j16 = j18;
            }
            byte[] bArrJ = bytes.j();
            byte b3 = bArrJ[0];
            long jMin = Math.min(j14, (iVar.f40718b - j15) + 1);
            while (j16 < jMin) {
                byte[] bArr2 = e0Var.f40701a;
                int iMin = (int) Math.min(e0Var.f40703c, (((long) e0Var.f40702b) + jMin) - j16);
                for (int i12 = (int) ((((long) e0Var.f40702b) + j13) - j16); i12 < iMin; i12++) {
                    if (bArr2[i12] == b3 && b(e0Var, i12 + 1, bArrJ, 1, i11)) {
                        return ((long) (i12 - e0Var.f40702b)) + j16;
                    }
                }
                j16 += (long) (e0Var.f40703c - e0Var.f40702b);
                e0Var = e0Var.f40706f;
                m.c(e0Var);
                j13 = j16;
            }
            return -1L;
        }
        while (j17 > j13) {
            e0Var = e0Var.f40707g;
            m.c(e0Var);
            j17 -= (long) (e0Var.f40703c - e0Var.f40702b);
        }
        byte[] bArrJ2 = bytes.j();
        byte b11 = bArrJ2[0];
        byte[] bArr3 = bArrJ2;
        long jMin2 = Math.min(j14, (iVar.f40718b - j15) + 1);
        while (j17 < jMin2) {
            byte[] bArr4 = e0Var.f40701a;
            int iMin2 = (int) Math.min(e0Var.f40703c, (((long) e0Var.f40702b) + jMin2) - j17);
            int i13 = (int) ((((long) e0Var.f40702b) + j13) - j17);
            while (i13 < iMin2) {
                if (bArr4[i13] == b11) {
                    bArr = bArr3;
                    if (b(e0Var, i13 + 1, bArr, 1, i11)) {
                        return ((long) (i13 - e0Var.f40702b)) + j17;
                    }
                } else {
                    bArr = bArr3;
                }
                i13++;
                bArr3 = bArr;
            }
            j17 += (long) (e0Var.f40703c - e0Var.f40702b);
            e0Var = e0Var.f40706f;
            m.c(e0Var);
            j13 = j17;
        }
        return -1L;
    }

    public static final boolean b(e0 e0Var, int i11, byte[] bArr, int i12, int i13) {
        int i14 = e0Var.f40703c;
        byte[] bArr2 = e0Var.f40701a;
        while (i12 < i13) {
            if (i11 == i14) {
                e0Var = e0Var.f40706f;
                m.c(e0Var);
                byte[] bArr3 = e0Var.f40701a;
                bArr2 = bArr3;
                i11 = e0Var.f40702b;
                i14 = e0Var.f40703c;
            }
            if (bArr2[i11] != bArr[i12]) {
                return false;
            }
            i11++;
            i12++;
        }
        return true;
    }

    public static final String c(m00.i iVar, long j11) throws EOFException {
        if (j11 > 0) {
            long j12 = j11 - 1;
            if (iVar.h(j12) == 13) {
                String strA = iVar.A(j12, oz.a.f46133a);
                iVar.skip(2L);
                return strA;
            }
        }
        String strA2 = iVar.A(j11, oz.a.f46133a);
        iVar.skip(1L);
        return strA2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a3 A[LOOP:0: B:8:0x001e->B:49:0x00a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2 A[SYNTHETIC] */
    public static final int d(m00.i iVar, z options, boolean z11) {
        int i11;
        int i12;
        int i13;
        e0 e0Var;
        int i14;
        m.f(options, "options");
        e0 e0Var2 = iVar.f40717a;
        if (e0Var2 == null) {
            return z11 ? -2 : -1;
        }
        byte[] bArr = e0Var2.f40701a;
        int i15 = e0Var2.f40702b;
        int i16 = e0Var2.f40703c;
        int[] iArr = options.f40761b;
        e0 e0Var3 = e0Var2;
        int i17 = -1;
        int i18 = 0;
        loop0: while (true) {
            int i19 = i18 + 1;
            int i21 = iArr[i18];
            int i22 = i18 + 2;
            int i23 = iArr[i19];
            if (i23 != -1) {
                i17 = i23;
            }
            if (e0Var3 == null) {
                break;
            }
            if (i21 >= 0) {
                int i24 = i15 + 1;
                int i25 = bArr[i15] & 255;
                int i26 = i22 + i21;
                while (i22 != i26) {
                    if (i25 == iArr[i22]) {
                        i11 = iArr[i22 + i21];
                        if (i24 == i16) {
                            e0Var3 = e0Var3.f40706f;
                            m.c(e0Var3);
                            int i27 = e0Var3.f40702b;
                            byte[] bArr2 = e0Var3.f40701a;
                            i12 = e0Var3.f40703c;
                            if (e0Var3 == e0Var2) {
                                i13 = i27;
                                bArr = bArr2;
                                e0Var3 = null;
                            } else {
                                i13 = i27;
                                bArr = bArr2;
                            }
                        } else {
                            i12 = i16;
                            i13 = i24;
                        }
                        if (i11 >= 0) {
                            return i11;
                        }
                        int i28 = i12;
                        i18 = -i11;
                        i15 = i13;
                        i16 = i28;
                    } else {
                        i22++;
                    }
                }
                return i17;
            }
            int i29 = (i21 * (-1)) + i22;
            while (true) {
                int i30 = i15 + 1;
                int i31 = i22 + 1;
                if ((bArr[i15] & 255) == iArr[i22]) {
                    boolean z12 = i31 == i29;
                    if (i30 == i16) {
                        m.c(e0Var3);
                        e0 e0Var4 = e0Var3.f40706f;
                        m.c(e0Var4);
                        i13 = e0Var4.f40702b;
                        byte[] bArr3 = e0Var4.f40701a;
                        i14 = e0Var4.f40703c;
                        if (e0Var4 != e0Var2) {
                            e0Var = e0Var4;
                            bArr = bArr3;
                        } else {
                            if (!z12) {
                                break loop0;
                            }
                            bArr = bArr3;
                            e0Var = null;
                        }
                    } else {
                        e0Var = e0Var3;
                        i14 = i16;
                        i13 = i30;
                    }
                    if (z12) {
                        i11 = iArr[i31];
                        int i32 = i14;
                        e0Var3 = e0Var;
                        i12 = i32;
                        break;
                    }
                    i15 = i13;
                    i16 = i14;
                    e0Var3 = e0Var;
                    i22 = i31;
                }
                return i17;
            }
            if (i11 >= 0) {
                return i11;
            }
            int i210 = i12;
            i18 = -i11;
            i15 = i13;
            i16 = i210;
        }
        if (z11) {
            return -2;
        }
        return i17;
    }
}
