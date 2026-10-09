package y;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f56692a = r0.f56756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f56693b = z.a.f58409c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f56694c = s.f56758b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56695d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f56696e = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f56697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f56698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f56699h;

    public f0(int i11) {
        if (i11 >= 0) {
            f(r0.d(i11));
        } else {
            z.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i11 = this.f56698g;
        int iD = d(obj);
        this.f56693b[iD] = obj;
        long[] jArr = this.f56694c;
        int i12 = this.f56695d;
        jArr[iD] = (((long) i12) & 2147483647L) | 4611686016279904256L;
        if (i12 != Integer.MAX_VALUE) {
            jArr[i12] = ((((long) iD) & 2147483647L) << 31) | (jArr[i12] & (-4611686016279904257L));
        }
        this.f56695d = iD;
        if (this.f56696e == Integer.MAX_VALUE) {
            this.f56696e = iD;
        }
        return this.f56698g != i11;
    }

    public final void b() {
        this.f56698g = 0;
        long[] jArr = this.f56692a;
        if (jArr != r0.f56756a) {
            ry.l.R(jArr, -9187201950435737472L);
            long[] jArr2 = this.f56692a;
            int i11 = this.f56697f;
            int i12 = i11 >> 3;
            long j11 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j11)) | j11;
        }
        ry.l.P(0, this.f56697f, null, this.f56693b);
        ry.l.R(this.f56694c, 4611686018427387903L);
        this.f56695d = Integer.MAX_VALUE;
        this.f56696e = Integer.MAX_VALUE;
        this.f56699h = r0.a(this.f56697f) - this.f56698g;
    }

    public final boolean c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f56697f;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f56692a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = (((long) i12) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (kotlin.jvm.internal.m.a(this.f56693b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int d(Object obj) {
        int i11;
        long j11;
        long j12;
        long j13;
        char c11;
        long[] jArr;
        int i12 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f56697f;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr2 = this.f56692a;
            int i19 = i17 >> 3;
            int i21 = (i17 & 7) << 3;
            long j14 = ((jArr2[i19 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr2[i19] >>> i21);
            long j15 = i15;
            long j16 = j14 ^ (j15 * 72340172838076673L);
            long j17 = (j16 - 72340172838076673L) & (~j16) & (-9187201950435737472L);
            while (j17 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j17) >> 3) + i17) & i16;
                int i22 = i12;
                if (kotlin.jvm.internal.m.a(this.f56693b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j17 &= j17 - 1;
                i12 = i22;
            }
            int i23 = i12;
            if ((j14 & ((~j14) << 6) & (-9187201950435737472L)) != 0) {
                int iE = e(i14);
                long j18 = 255;
                if (this.f56699h != 0 || ((this.f56692a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    i11 = 0;
                    j11 = j15;
                    j12 = 255;
                    j13 = 128;
                } else {
                    int i24 = this.f56697f;
                    if (i24 > 8) {
                        c11 = 31;
                        j13 = 128;
                        if (Long.compare((((long) this.f56698g) * 32) ^ Long.MIN_VALUE, (((long) i24) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f56692a;
                            if (jArr3 == null) {
                                i11 = 0;
                                j11 = j15;
                                j12 = 255;
                            } else {
                                int i25 = this.f56697f;
                                Object[] objArr = this.f56693b;
                                long[] jArr4 = this.f56694c;
                                long[] jArr5 = new long[i25];
                                Arrays.fill(jArr5, 0, i25, 9223372034707292159L);
                                i11 = 0;
                                int i26 = (i25 + 7) >> 3;
                                int i27 = 0;
                                while (i27 < i26) {
                                    long j19 = j18;
                                    long j21 = jArr3[i27] & (-9187201950435737472L);
                                    int i28 = i27;
                                    jArr3[i28] = ((~j21) + (j21 >>> 7)) & (-72340172838076674L);
                                    i27 = i28 + 1;
                                    j18 = j19;
                                }
                                j12 = j18;
                                int length = jArr3.length;
                                int i29 = length - 1;
                                int i30 = length - 2;
                                jArr3[i30] = (jArr3[i30] & 72057594037927935L) | (-72057594037927936L);
                                jArr3[i29] = jArr3[0];
                                int i31 = 0;
                                while (i31 != i25) {
                                    int i32 = i31 >> 3;
                                    int i33 = (i31 & 7) << 3;
                                    long j22 = (jArr3[i32] >> i33) & j12;
                                    if (j22 != 128 && j22 == 254) {
                                        Object obj2 = objArr[i31];
                                        int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i23;
                                        int i34 = iHashCode2 ^ (iHashCode2 << 16);
                                        int i35 = i34 >>> 7;
                                        int iE2 = e(i35);
                                        int i36 = i35 & i25;
                                        if (((iE2 - i36) & i25) / 8 == ((i31 - i36) & i25) / 8) {
                                            int i37 = i25;
                                            Object[] objArr2 = objArr;
                                            jArr3[i32] = (jArr3[i32] & (~(j12 << i33))) | (((long) (i34 & 127)) << i33);
                                            if (jArr5[i31] == 9223372034707292159L) {
                                                long j23 = i31;
                                                jArr5[i31] = j23 | (j23 << 32);
                                            }
                                            jArr3[jArr3.length - 1] = jArr3[0];
                                            i31++;
                                            i25 = i37;
                                            objArr = objArr2;
                                        } else {
                                            int i38 = i25;
                                            Object[] objArr3 = objArr;
                                            int i39 = iE2 >> 3;
                                            long j24 = jArr3[i39];
                                            int i40 = (iE2 & 7) << 3;
                                            if (((j24 >> i40) & j12) == 128) {
                                                jArr3[i39] = (j24 & (~(j12 << i40))) | (((long) (i34 & 127)) << i40);
                                                jArr3[i32] = (jArr3[i32] & (~(j12 << i33))) | (128 << i33);
                                                objArr3[iE2] = objArr3[i31];
                                                objArr3[i31] = null;
                                                jArr4[iE2] = jArr4[i31];
                                                jArr4[i31] = 4611686018427387903L;
                                                int i41 = (int) ((jArr5[i31] >> 32) & 4294967295L);
                                                int i42 = Integer.MAX_VALUE;
                                                if (i41 != Integer.MAX_VALUE) {
                                                    jArr5[i41] = ((long) iE2) | (jArr5[i41] & (-4294967296L));
                                                    jArr5[i31] = (jArr5[i31] & 4294967295L) | (-4294967296L);
                                                    i42 = Integer.MAX_VALUE;
                                                } else {
                                                    jArr5[i31] = (((long) Integer.MAX_VALUE) << 32) | ((long) iE2);
                                                }
                                                jArr5[iE2] = (((long) i31) << 32) | ((long) i42);
                                            } else {
                                                j15 = j15;
                                                jArr3[i39] = (((long) (i34 & 127)) << i40) | (j24 & (~(j12 << i40)));
                                                Object obj3 = objArr3[iE2];
                                                objArr3[iE2] = objArr3[i31];
                                                objArr3[i31] = obj3;
                                                long j25 = jArr4[iE2];
                                                jArr4[iE2] = jArr4[i31];
                                                jArr4[i31] = j25;
                                                int i43 = (int) ((jArr5[i31] >> 32) & 4294967295L);
                                                if (i43 != Integer.MAX_VALUE) {
                                                    long j26 = iE2;
                                                    jArr5[i43] = (jArr5[i43] & (-4294967296L)) | j26;
                                                    jArr5[i31] = (jArr5[i31] & 4294967295L) | (j26 << 32);
                                                } else {
                                                    long j27 = iE2;
                                                    jArr5[i31] = j27 | (j27 << 32);
                                                    i43 = i31;
                                                }
                                                jArr5[iE2] = (((long) i43) << 32) | ((long) i31);
                                                i31--;
                                            }
                                            jArr3[jArr3.length - 1] = jArr3[0];
                                            i31++;
                                            i25 = i38;
                                            objArr = objArr3;
                                            j15 = j15;
                                        }
                                    } else {
                                        i31++;
                                    }
                                }
                                j11 = j15;
                                this.f56699h = r0.a(this.f56697f) - this.f56698g;
                                long[] jArr6 = this.f56694c;
                                int length2 = jArr6.length;
                                for (int i44 = 0; i44 < length2; i44++) {
                                    long j28 = jArr6[i44];
                                    int i45 = (int) ((j28 >> 31) & 2147483647L);
                                    int i46 = (int) (j28 & 2147483647L);
                                    jArr6[i44] = (((j28 & (-4611686018427387904L)) | ((long) (i45 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr5[i45] & 4294967295L)))) << 31) | ((long) (i46 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr5[i46] & 4294967295L)));
                                }
                                int i47 = this.f56695d;
                                if (i47 != Integer.MAX_VALUE) {
                                    this.f56695d = (int) (jArr5[i47] & 4294967295L);
                                }
                                int i48 = this.f56696e;
                                if (i48 != Integer.MAX_VALUE) {
                                    this.f56696e = (int) (jArr5[i48] & 4294967295L);
                                }
                            }
                        }
                        iE = e(i14);
                    } else {
                        c11 = 31;
                        j13 = 128;
                    }
                    i11 = 0;
                    j11 = j15;
                    j12 = 255;
                    int iB = r0.b(this.f56697f);
                    long[] jArr7 = this.f56692a;
                    Object[] objArr4 = this.f56693b;
                    long[] jArr8 = this.f56694c;
                    int i49 = this.f56697f;
                    int[] iArr = new int[i49];
                    f(iB);
                    long[] jArr9 = this.f56692a;
                    Object[] objArr5 = this.f56693b;
                    long[] jArr10 = this.f56694c;
                    int i50 = this.f56697f;
                    int i51 = 0;
                    while (i51 < i49) {
                        if (((jArr7[i51 >> 3] >> ((i51 & 7) << 3)) & 255) < j13) {
                            Object obj4 = objArr4[i51];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i23;
                            int i52 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i52 >>> 7);
                            jArr = jArr9;
                            long j29 = i52 & 127;
                            int i53 = iE3 >> 3;
                            int i54 = (iE3 & 7) << 3;
                            long j30 = (jArr[i53] & (~(255 << i54))) | (j29 << i54);
                            jArr[i53] = j30;
                            jArr[(((iE3 - 7) & i50) + (i50 & 7)) >> 3] = j30;
                            objArr5[iE3] = obj4;
                            jArr10[iE3] = jArr8[i51];
                            iArr[i51] = iE3;
                        } else {
                            jArr = jArr9;
                        }
                        i51++;
                        jArr7 = jArr7;
                        jArr9 = jArr;
                    }
                    long[] jArr11 = this.f56694c;
                    int length3 = jArr11.length;
                    for (int i55 = 0; i55 < length3; i55++) {
                        long j31 = jArr11[i55];
                        int i56 = (int) ((j31 >> c11) & 2147483647L);
                        int i57 = (int) (j31 & 2147483647L);
                        jArr11[i55] = (((j31 & (-4611686018427387904L)) | ((long) (i56 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i56]))) << c11) | ((long) (i57 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i57]));
                    }
                    int i58 = this.f56695d;
                    if (i58 != Integer.MAX_VALUE) {
                        this.f56695d = iArr[i58];
                    }
                    int i59 = this.f56696e;
                    if (i59 != Integer.MAX_VALUE) {
                        this.f56696e = iArr[i59];
                    }
                    iE = e(i14);
                }
                this.f56698g++;
                int i60 = this.f56699h;
                long[] jArr12 = this.f56692a;
                int i61 = iE >> 3;
                long j32 = jArr12[i61];
                int i62 = (iE & 7) << 3;
                if (((j32 >> i62) & j12) == j13) {
                    i11 = 1;
                }
                this.f56699h = i60 - i11;
                int i63 = this.f56697f;
                long j33 = (j32 & (~(j12 << i62))) | (j11 << i62);
                jArr12[i61] = j33;
                jArr12[(((iE - 7) & i63) + (i63 & 7)) >> 3] = j33;
                return iE;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            i12 = i23;
        }
    }

    public final int e(int i11) {
        int i12 = this.f56697f;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f56692a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j12 = j11 & ((~j11) << 7) & (-9187201950435737472L);
            if (j12 != 0) {
                return (i13 + (Long.numberOfTrailingZeros(j12) >> 3)) & i12;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (f0Var.f56698g != this.f56698g) {
            return false;
        }
        Object[] objArr = this.f56693b;
        long[] jArr = this.f56692a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128 && !f0Var.c(objArr[(i11 << 3) + i13])) {
                            return false;
                        }
                        j11 >>= 8;
                    }
                    if (i12 == 8) {
                        if (i11 != length) {
                            i11++;
                        }
                    }
                } else if (i11 != length) {
                    i11++;
                }
            }
        }
        return true;
    }

    public final void f(int i11) {
        long[] jArr;
        long[] jArr2;
        int iMax = i11 > 0 ? Math.max(7, r0.c(i11)) : 0;
        this.f56697f = iMax;
        if (iMax == 0) {
            jArr = r0.f56756a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ry.l.R(jArr, -9187201950435737472L);
        }
        this.f56692a = jArr;
        int i12 = iMax >> 3;
        long j11 = 255 << ((iMax & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j11)) | j11;
        this.f56699h = r0.a(this.f56697f) - this.f56698g;
        this.f56693b = iMax == 0 ? z.a.f58409c : new Object[iMax];
        if (iMax == 0) {
            jArr2 = s.f56758b;
        } else {
            jArr2 = new long[iMax];
            ry.l.R(jArr2, 4611686018427387903L);
        }
        this.f56694c = jArr2;
    }

    public final boolean g(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f56697f;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f56692a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = (((long) i12) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (kotlin.jvm.internal.m.a(this.f56693b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        boolean z11 = iNumberOfTrailingZeros >= 0;
        if (z11) {
            h(iNumberOfTrailingZeros);
        }
        return z11;
    }

    public final void h(int i11) {
        this.f56698g--;
        long[] jArr = this.f56692a;
        int i12 = this.f56697f;
        int i13 = i11 >> 3;
        int i14 = (i11 & 7) << 3;
        long j11 = (jArr[i13] & (~(255 << i14))) | (254 << i14);
        jArr[i13] = j11;
        jArr[(((i11 - 7) & i12) + (i12 & 7)) >> 3] = j11;
        this.f56693b[i11] = null;
        long[] jArr2 = this.f56694c;
        long j12 = jArr2[i11];
        int i15 = (int) ((j12 >> 31) & 2147483647L);
        int i16 = (int) (j12 & 2147483647L);
        if (i15 != Integer.MAX_VALUE) {
            jArr2[i15] = (jArr2[i15] & (-2147483648L)) | (((long) i16) & 2147483647L);
        } else {
            this.f56695d = i16;
        }
        if (i16 != Integer.MAX_VALUE) {
            jArr2[i16] = ((((long) i15) & 2147483647L) << 31) | (jArr2[i16] & (-4611686016279904257L));
        } else {
            this.f56696e = i15;
        }
        jArr2[i11] = 4611686018427387903L;
    }

    public final int hashCode() {
        int iHashCode = (this.f56697f * 31) + this.f56698g;
        Object[] objArr = this.f56693b;
        long[] jArr = this.f56692a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            Object obj = objArr[(i11 << 3) + i13];
                            if (!kotlin.jvm.internal.m.a(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        return iHashCode;
                    }
                }
                if (i11 != length) {
                    i11++;
                }
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[LOOP:0: B:5:0x0016->B:17:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[EDGE_INSN: B:24:0x0057->B:18:0x0057 BREAK  A[LOOP:0: B:5:0x0016->B:17:0x0054], SYNTHETIC] */
    public final boolean i(Collection elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        Object[] objArr = this.f56693b;
        int i11 = this.f56698g;
        long[] jArr = this.f56692a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j11 = jArr[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i12 != length) {
                        break;
                        break;
                    }
                    i12++;
                } else {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j11) < 128) {
                            int i15 = (i12 << 3) + i14;
                            if (!ry.m.i0(elements, objArr[i15])) {
                                h(i15);
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    }
                    if (i12 != length) {
                        break;
                    }
                    i12++;
                }
            }
        }
        return i11 != this.f56698g;
    }

    public final String toString() {
        p0 p0Var = new p0(this, 0);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f56693b;
        long[] jArr = this.f56694c;
        int i11 = this.f56696e;
        int i12 = 0;
        while (i11 != Integer.MAX_VALUE) {
            int i13 = (int) ((jArr[i11] >> 31) & 2147483647L);
            Object obj = objArr[i11];
            if (i12 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                kotlin.jvm.internal.m.e(string, "toString(...)");
                return string;
            }
            if (i12 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) p0Var.invoke(obj));
            i12++;
            i11 = i13;
        }
        sb2.append((CharSequence) "]");
        String string2 = sb2.toString();
        kotlin.jvm.internal.m.e(string2, "toString(...)");
        return string2;
    }
}
