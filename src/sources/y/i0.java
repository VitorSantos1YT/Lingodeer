package y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f56713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f56714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f56715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f56717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f56718f;

    public i0(int i11) {
        this.f56713a = r0.f56756a;
        Object[] objArr = z.a.f58409c;
        this.f56714b = objArr;
        this.f56715c = objArr;
        if (i11 >= 0) {
            h(r0.d(i11));
        } else {
            z.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f56717e = 0;
        long[] jArr = this.f56713a;
        if (jArr != r0.f56756a) {
            ry.l.R(jArr, -9187201950435737472L);
            long[] jArr2 = this.f56713a;
            int i11 = this.f56716d;
            int i12 = i11 >> 3;
            long j11 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j11)) | j11;
        }
        ry.l.P(0, this.f56716d, null, this.f56715c);
        ry.l.P(0, this.f56716d, null, this.f56714b);
        this.f56718f = r0.a(this.f56716d) - this.f56717e;
    }

    public final boolean b(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f56716d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f56713a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = (((long) i12) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (kotlin.jvm.internal.m.a(this.f56714b[iNumberOfTrailingZeros], obj)) {
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

    public final boolean c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f56716d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f56713a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = (((long) i12) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (kotlin.jvm.internal.m.a(this.f56714b[iNumberOfTrailingZeros], obj)) {
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

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[LOOP:0: B:5:0x000b->B:18:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[SYNTHETIC] */
    public final boolean d(Object obj) {
        Object[] objArr = this.f56715c;
        long[] jArr = this.f56713a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128 && kotlin.jvm.internal.m.a(obj, objArr[(i11 << 3) + i13])) {
                            return true;
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
        return false;
    }

    public final int e(int i11) {
        int i12 = this.f56716d;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f56713a;
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

    /* JADX WARN: Code duplicated, block: B:32:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[LOOP:0: B:14:0x0023->B:33:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[EDGE_INSN: B:35:0x0074->B:34:0x0074 BREAK  A[LOOP:0: B:14:0x0023->B:33:0x0071], SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (i0Var.f56717e != this.f56717e) {
            return false;
        }
        Object[] objArr = this.f56714b;
        Object[] objArr2 = this.f56715c;
        long[] jArr = this.f56713a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj2 = objArr[i14];
                            Object obj3 = objArr2[i14];
                            if (obj3 == null) {
                                if (i0Var.g(obj2) != null || !i0Var.c(obj2)) {
                                    return false;
                                }
                            } else if (!obj3.equals(i0Var.g(obj2))) {
                                return false;
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i11 != length) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return true;
    }

    public final int f(Object obj) {
        long j11;
        long j12;
        long j13;
        long[] jArr;
        Object[] objArr;
        int i11 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f56716d;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr2 = this.f56713a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j14 = ((jArr2[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr2[i18] >>> i19);
            long j15 = i14;
            int i21 = i14;
            long j16 = j14 ^ (j15 * 72340172838076673L);
            long j17 = (~j16) & (j16 - 72340172838076673L) & (-9187201950435737472L);
            while (j17 != 0) {
                int iNumberOfTrailingZeros = (i16 + (Long.numberOfTrailingZeros(j17) >> 3)) & i15;
                int i22 = i11;
                if (kotlin.jvm.internal.m.a(this.f56714b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j17 &= j17 - 1;
                i11 = i22;
            }
            int i23 = i11;
            if ((((~j14) << 6) & j14 & (-9187201950435737472L)) != 0) {
                int iE = e(i13);
                long j18 = 255;
                if (this.f56718f != 0 || ((this.f56713a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j11 = 255;
                    j12 = j15;
                    j13 = 128;
                } else {
                    int i24 = this.f56716d;
                    if (i24 > 8) {
                        int i25 = 8;
                        if (Long.compare((((long) this.f56717e) * 32) ^ Long.MIN_VALUE, (((long) i24) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f56713a;
                            int i26 = this.f56716d;
                            Object[] objArr2 = this.f56714b;
                            Object[] objArr3 = this.f56715c;
                            j13 = 128;
                            int i27 = (i26 + 7) >> 3;
                            int i28 = 0;
                            while (i28 < i27) {
                                long j19 = j18;
                                long j21 = jArr3[i28] & (-9187201950435737472L);
                                jArr3[i28] = (-72340172838076674L) & ((~j21) + (j21 >>> 7));
                                i28++;
                                i25 = i25;
                                j15 = j15;
                                j18 = j19;
                            }
                            j11 = j18;
                            j12 = j15;
                            int i29 = i25;
                            int iW = ry.l.W(jArr3);
                            int i30 = iW - 1;
                            jArr3[i30] = (jArr3[i30] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iW] = jArr3[0];
                            int i31 = 0;
                            while (i31 != i26) {
                                int i32 = i31 >> 3;
                                int i33 = (i31 & 7) << 3;
                                long j22 = (jArr3[i32] >> i33) & j11;
                                if (j22 != 128 && j22 == 254) {
                                    Object obj2 = objArr2[i31];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i23;
                                    int i34 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i35 = i34 >>> 7;
                                    int iE2 = e(i35);
                                    int i36 = i35 & i26;
                                    if (((iE2 - i36) & i26) / i29 == ((i31 - i36) & i26) / i29) {
                                        jArr3[i32] = (((long) (i34 & 127)) << i33) | (jArr3[i32] & (~(j11 << i33)));
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i31++;
                                        i29 = i29;
                                    } else {
                                        int i37 = i29;
                                        int i38 = iE2 >> 3;
                                        long j23 = jArr3[i38];
                                        int i39 = (iE2 & 7) << 3;
                                        if (((j23 >> i39) & j11) == 128) {
                                            objArr = objArr2;
                                            jArr3[i38] = ((~(j11 << i39)) & j23) | (((long) (i34 & 127)) << i39);
                                            jArr3[i32] = (jArr3[i32] & (~(j11 << i33))) | (128 << i33);
                                            objArr[iE2] = objArr[i31];
                                            objArr[i31] = null;
                                            objArr3[iE2] = objArr3[i31];
                                            objArr3[i31] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i38] = (((long) (i34 & 127)) << i39) | ((~(j11 << i39)) & j23);
                                            Object obj3 = objArr[iE2];
                                            objArr[iE2] = objArr[i31];
                                            objArr[i31] = obj3;
                                            Object obj4 = objArr3[iE2];
                                            objArr3[iE2] = objArr3[i31];
                                            objArr3[i31] = obj4;
                                            i31--;
                                        }
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i31++;
                                        i29 = i37;
                                        i26 = i26;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i31++;
                                }
                            }
                            this.f56718f = r0.a(this.f56716d) - this.f56717e;
                        }
                        iE = e(i13);
                    }
                    j11 = 255;
                    j12 = j15;
                    j13 = 128;
                    int iB = r0.b(this.f56716d);
                    long[] jArr4 = this.f56713a;
                    Object[] objArr4 = this.f56714b;
                    Object[] objArr5 = this.f56715c;
                    int i40 = this.f56716d;
                    h(iB);
                    long[] jArr5 = this.f56713a;
                    Object[] objArr6 = this.f56714b;
                    Object[] objArr7 = this.f56715c;
                    int i41 = this.f56716d;
                    int i42 = 0;
                    while (i42 < i40) {
                        if (((jArr4[i42 >> 3] >> ((i42 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i42];
                            int iHashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i23;
                            int i43 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i43 >>> 7);
                            jArr = jArr5;
                            long j24 = i43 & 127;
                            int i44 = iE3 >> 3;
                            int i45 = (iE3 & 7) << 3;
                            long j25 = (jArr[i44] & (~(255 << i45))) | (j24 << i45);
                            jArr[i44] = j25;
                            jArr[(((iE3 - 7) & i41) + (i41 & 7)) >> 3] = j25;
                            objArr6[iE3] = obj5;
                            objArr7[iE3] = objArr5[i42];
                        } else {
                            jArr = jArr5;
                        }
                        i42++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iE = e(i13);
                }
                this.f56717e++;
                int i46 = this.f56718f;
                long[] jArr6 = this.f56713a;
                int i47 = iE >> 3;
                long j26 = jArr6[i47];
                int i48 = (iE & 7) << 3;
                this.f56718f = i46 - (((j26 >> i48) & j11) == j13 ? 1 : 0);
                int i49 = this.f56716d;
                long j27 = (j26 & (~(j11 << i48))) | (j12 << i48);
                jArr6[i47] = j27;
                jArr6[(((iE - 7) & i49) + (i49 & 7)) >> 3] = j27;
                return ~iE;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i14 = i21;
            i11 = i23;
        }
    }

    public final Object g(Object obj) {
        int iNumberOfTrailingZeros;
        int i11 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 & 127;
        int i14 = this.f56716d;
        int i15 = i12 >>> 7;
        loop0: while (true) {
            int i16 = i15 & i14;
            long[] jArr = this.f56713a;
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j12 = (((long) i13) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i16) & i14;
                if (kotlin.jvm.internal.m.a(this.f56714b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i11 += 8;
            i15 = i16 + i11;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f56715c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final void h(int i11) {
        long[] jArr;
        int iMax = i11 > 0 ? Math.max(7, r0.c(i11)) : 0;
        this.f56716d = iMax;
        if (iMax == 0) {
            jArr = r0.f56756a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ry.l.R(jArr, -9187201950435737472L);
            int i12 = iMax >> 3;
            long j11 = 255 << ((iMax & 7) << 3);
            jArr[i12] = (jArr[i12] & (~j11)) | j11;
        }
        this.f56713a = jArr;
        this.f56718f = r0.a(this.f56716d) - this.f56717e;
        Object[] objArr = z.a.f58409c;
        this.f56714b = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.f56715c = objArr;
    }

    public final int hashCode() {
        Object[] objArr = this.f56714b;
        Object[] objArr2 = this.f56715c;
        long[] jArr = this.f56713a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i11 = 0;
        int iHashCode = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        Object obj = objArr[i14];
                        Object obj2 = objArr2[i14];
                        iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return iHashCode;
                }
            }
            if (i11 == length) {
                return iHashCode;
            }
            i11++;
        }
    }

    public final boolean i() {
        return this.f56717e == 0;
    }

    public final boolean j() {
        return this.f56717e != 0;
    }

    public final Object k(Object obj) {
        int iNumberOfTrailingZeros;
        int i11 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 & 127;
        int i14 = this.f56716d;
        int i15 = i12 >>> 7;
        loop0: while (true) {
            int i16 = i15 & i14;
            long[] jArr = this.f56713a;
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j12 = (((long) i13) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i16) & i14;
                if (kotlin.jvm.internal.m.a(this.f56714b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i11 += 8;
            i15 = i16 + i11;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return l(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final Object l(int i11) {
        this.f56717e--;
        long[] jArr = this.f56713a;
        int i12 = this.f56716d;
        int i13 = i11 >> 3;
        int i14 = (i11 & 7) << 3;
        long j11 = (jArr[i13] & (~(255 << i14))) | (254 << i14);
        jArr[i13] = j11;
        jArr[(((i11 - 7) & i12) + (i12 & 7)) >> 3] = j11;
        this.f56714b[i11] = null;
        Object[] objArr = this.f56715c;
        Object obj = objArr[i11];
        objArr[i11] = null;
        return obj;
    }

    public final void m(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF < 0) {
            iF = ~iF;
        }
        this.f56714b[iF] = obj;
        this.f56715c[iF] = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[DONT_INVERT, PHI: r8
      0x0072: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:25:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0074 A[LOOP:0: B:9:0x0020->B:27:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0077 A[EDGE_INSN: B:31:0x0077->B:28:0x0077 BREAK  A[LOOP:0: B:9:0x0020->B:27:0x0074], SYNTHETIC] */
    public final String toString() {
        if (i()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f56714b;
        Object[] objArr2 = this.f56715c;
        long[] jArr = this.f56713a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j11) < 128) {
                            int i15 = (i11 << 3) + i14;
                            Object obj = objArr[i15];
                            Object obj2 = objArr2[i15];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb2.append(obj2);
                            i12++;
                            if (i12 < this.f56717e) {
                                sb2.append(", ");
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    }
                    if (i11 != length) {
                        break;
                    }
                    i11++;
                }
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        return string;
    }

    public /* synthetic */ i0() {
        this(6);
    }
}
