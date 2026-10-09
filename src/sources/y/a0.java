package y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f56654a = r0.f56756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f56655b = q.f56750a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f56656c = z.a.f58409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f56658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f56659f;

    public a0(int i11) {
        if (i11 >= 0) {
            e(r0.d(i11));
        } else {
            z.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f56658e = 0;
        long[] jArr = this.f56654a;
        if (jArr != r0.f56756a) {
            ry.l.R(jArr, -9187201950435737472L);
            long[] jArr2 = this.f56654a;
            int i11 = this.f56657d;
            int i12 = i11 >> 3;
            long j11 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j11)) | j11;
        }
        ry.l.P(0, this.f56657d, null, this.f56656c);
        this.f56659f = r0.a(this.f56657d) - this.f56658e;
    }

    public final boolean b(long j11) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j11) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f56657d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f56654a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j12 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j13 = (((long) i12) * 72340172838076673L) ^ j12;
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i14) & i13;
                if (this.f56655b[iNumberOfTrailingZeros] == j11) {
                    break loop0;
                }
            }
            if ((j12 & ((~j12) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int c(int i11) {
        int i12 = this.f56657d;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f56654a;
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

    public final Object d(long j11) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j11) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f56657d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f56654a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j12 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j13 = (((long) i12) * 72340172838076673L) ^ j12;
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i14) & i13;
                if (this.f56655b[iNumberOfTrailingZeros] == j11) {
                    break loop0;
                }
            }
            if ((j12 & ((~j12) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f56656c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final void e(int i11) {
        long[] jArr;
        int iMax = i11 > 0 ? Math.max(7, r0.c(i11)) : 0;
        this.f56657d = iMax;
        if (iMax == 0) {
            jArr = r0.f56756a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ry.l.R(jArr, -9187201950435737472L);
        }
        this.f56654a = jArr;
        int i12 = iMax >> 3;
        long j11 = 255 << ((iMax & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j11)) | j11;
        this.f56659f = r0.a(this.f56657d) - this.f56658e;
        this.f56655b = new long[iMax];
        this.f56656c = new Object[iMax];
    }

    public final boolean equals(Object obj) {
        boolean z11;
        long[] jArr;
        boolean z12;
        long[] jArr2;
        boolean z13 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (a0Var.f56658e != this.f56658e) {
            return false;
        }
        long[] jArr3 = this.f56655b;
        Object[] objArr = this.f56656c;
        long[] jArr4 = this.f56654a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i11 = 0;
        loop0: while (true) {
            long j11 = jArr4[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        z12 = z13;
                        jArr2 = jArr3;
                        long j12 = jArr2[i14];
                        Object obj2 = objArr[i14];
                        if (obj2 == null) {
                            if (a0Var.d(j12) != null || !a0Var.b(j12)) {
                                break loop0;
                            }
                        } else if (!obj2.equals(a0Var.d(j12))) {
                            return false;
                        }
                    } else {
                        z12 = z13;
                        jArr2 = jArr3;
                    }
                    j11 >>= 8;
                    i13++;
                    z13 = z12;
                    jArr3 = jArr2;
                }
                z11 = z13;
                jArr = jArr3;
                if (i12 != 8) {
                    return z11;
                }
            } else {
                z11 = z13;
                jArr = jArr3;
            }
            if (i11 == length) {
                return z11;
            }
            i11++;
            z13 = z11;
            jArr3 = jArr;
        }
        return false;
    }

    public final Object f(long j11) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j11) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f56657d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f56654a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j12 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j13 = (((long) i12) * 72340172838076673L) ^ j12;
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i14) & i13;
                if (this.f56655b[iNumberOfTrailingZeros] == j11) {
                    break loop0;
                }
            }
            if ((j12 & ((~j12) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f56658e--;
        long[] jArr2 = this.f56654a;
        int i18 = this.f56657d;
        int i19 = iNumberOfTrailingZeros >> 3;
        int i21 = (iNumberOfTrailingZeros & 7) << 3;
        long j15 = (jArr2[i19] & (~(255 << i21))) | (254 << i21);
        jArr2[i19] = j15;
        jArr2[(((iNumberOfTrailingZeros - 7) & i18) + (i18 & 7)) >> 3] = j15;
        Object[] objArr = this.f56656c;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    public final void g(long j11, Object obj) {
        long j12;
        long j13;
        int i11;
        int i12;
        long j14;
        int iNumberOfTrailingZeros;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        int i13 = -862048943;
        int iHashCode = Long.hashCode(j11) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f56657d;
        int i18 = i15 & i17;
        int i19 = 0;
        loop0: while (true) {
            long[] jArr3 = this.f56654a;
            int i21 = i18 >> 3;
            int i22 = (i18 & 7) << 3;
            int i23 = 1;
            long j15 = ((jArr3[i21 + 1] << (64 - i22)) & ((-i22) >> 63)) | (jArr3[i21] >>> i22);
            long j16 = i16;
            int i24 = i19;
            int i25 = 0;
            long j17 = j15 ^ (j16 * 72340172838076673L);
            long j18 = (~j17) & (j17 - 72340172838076673L) & (-9187201950435737472L);
            while (j18 != 0) {
                iNumberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j18) >> 3)) & i17;
                int i26 = i13;
                if (this.f56655b[iNumberOfTrailingZeros] == j11) {
                    break loop0;
                }
                j18 &= j18 - 1;
                i13 = i26;
            }
            int i27 = i13;
            if ((((~j15) << 6) & j15 & (-9187201950435737472L)) != 0) {
                int iC = c(i15);
                if (this.f56659f != 0 || ((this.f56654a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    j12 = 255;
                    j13 = j16;
                    i11 = 0;
                    i12 = 1;
                    j14 = 128;
                } else {
                    int i28 = this.f56657d;
                    if (i28 > 8) {
                        j14 = 128;
                        if (Long.compare((((long) this.f56658e) * 32) ^ Long.MIN_VALUE, (((long) i28) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f56654a;
                            int i29 = this.f56657d;
                            long[] jArr5 = this.f56655b;
                            Object[] objArr2 = this.f56656c;
                            int i30 = (i29 + 7) >> 3;
                            j12 = 255;
                            int i31 = 0;
                            while (i31 < i30) {
                                long j19 = jArr4[i31] & (-9187201950435737472L);
                                jArr4[i31] = (-72340172838076674L) & ((~j19) + (j19 >>> 7));
                                i31++;
                                i23 = i23;
                                i25 = i25;
                                j16 = j16;
                            }
                            j13 = j16;
                            i11 = i25;
                            int i32 = i23;
                            char c11 = 7;
                            int iW = ry.l.W(jArr4);
                            int i33 = iW - 1;
                            long j21 = 72057594037927935L;
                            jArr4[i33] = (jArr4[i33] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iW] = jArr4[i11];
                            int i34 = i11;
                            while (i34 != i29) {
                                int i35 = i34 >> 3;
                                int i36 = (i34 & 7) << 3;
                                long j22 = (jArr4[i35] >> i36) & 255;
                                if (j22 != 128 && j22 == 254) {
                                    int iHashCode2 = Long.hashCode(jArr5[i34]) * i27;
                                    int i37 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i38 = i37 >>> 7;
                                    int iC2 = c(i38);
                                    int i39 = i38 & i29;
                                    char c12 = c11;
                                    if (((iC2 - i39) & i29) / 8 == ((i34 - i39) & i29) / 8) {
                                        int i40 = i32;
                                        long j23 = j21;
                                        jArr4[i35] = (((long) (i37 & 127)) << i36) | (jArr4[i35] & (~(255 << i36)));
                                        jArr4[jArr4.length - i40] = (jArr4[i11] & j23) | Long.MIN_VALUE;
                                        i34++;
                                        i32 = i40;
                                        c11 = c12;
                                        j21 = j23;
                                    } else {
                                        int i41 = i32;
                                        long j24 = j21;
                                        int i42 = iC2 >> 3;
                                        long j25 = jArr4[i42];
                                        int i43 = (iC2 & 7) << 3;
                                        if (((j25 >> i43) & 255) == 128) {
                                            jArr2 = jArr5;
                                            objArr = objArr2;
                                            jArr4[i42] = (j25 & (~(255 << i43))) | (((long) (i37 & 127)) << i43);
                                            jArr4[i35] = (jArr4[i35] & (~(255 << i36))) | (128 << i36);
                                            jArr2[iC2] = jArr2[i34];
                                            jArr2[i34] = 0;
                                            objArr[iC2] = objArr[i34];
                                            objArr[i34] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr2 = jArr5;
                                            jArr4[i42] = (((long) (i37 & 127)) << i43) | (j25 & (~(255 << i43)));
                                            long j26 = jArr2[iC2];
                                            jArr2[iC2] = jArr2[i34];
                                            jArr2[i34] = j26;
                                            Object obj2 = objArr[iC2];
                                            objArr[iC2] = objArr[i34];
                                            objArr[i34] = obj2;
                                            i34--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i11] & j24) | Long.MIN_VALUE;
                                        i34++;
                                        jArr5 = jArr2;
                                        i32 = i41;
                                        c11 = c12;
                                        j21 = j24;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i34++;
                                }
                            }
                            i12 = i32;
                            this.f56659f = r0.a(this.f56657d) - this.f56658e;
                        }
                        iC = c(i15);
                    } else {
                        j14 = 128;
                    }
                    j12 = 255;
                    j13 = j16;
                    i11 = 0;
                    i12 = 1;
                    int iB = r0.b(this.f56657d);
                    long[] jArr6 = this.f56654a;
                    long[] jArr7 = this.f56655b;
                    Object[] objArr3 = this.f56656c;
                    int i44 = this.f56657d;
                    e(iB);
                    long[] jArr8 = this.f56654a;
                    long[] jArr9 = this.f56655b;
                    Object[] objArr4 = this.f56656c;
                    int i45 = this.f56657d;
                    int i46 = 0;
                    while (i46 < i44) {
                        if (((jArr6[i46 >> 3] >> ((i46 & 7) << 3)) & 255) < j14) {
                            long j27 = jArr7[i46];
                            int iHashCode3 = Long.hashCode(j27) * i27;
                            int i47 = iHashCode3 ^ (iHashCode3 << 16);
                            int iC3 = c(i47 >>> 7);
                            jArr = jArr8;
                            long j28 = i47 & 127;
                            int i48 = iC3 >> 3;
                            int i49 = (iC3 & 7) << 3;
                            long j29 = (jArr[i48] & (~(255 << i49))) | (j28 << i49);
                            jArr[i48] = j29;
                            jArr[(((iC3 - 7) & i45) + (i45 & 7)) >> 3] = j29;
                            jArr9[iC3] = j27;
                            objArr4[iC3] = objArr3[i46];
                        } else {
                            jArr = jArr8;
                        }
                        i46++;
                        jArr6 = jArr6;
                        jArr8 = jArr;
                    }
                    iC = c(i15);
                }
                iNumberOfTrailingZeros = iC;
                this.f56658e++;
                int i50 = this.f56659f;
                long[] jArr10 = this.f56654a;
                int i51 = iNumberOfTrailingZeros >> 3;
                long j30 = jArr10[i51];
                int i52 = (iNumberOfTrailingZeros & 7) << 3;
                if (((j30 >> i52) & j12) == j14) {
                    i11 = i12;
                }
                this.f56659f = i50 - i11;
                int i53 = this.f56657d;
                long j31 = (j30 & (~(j12 << i52))) | (j13 << i52);
                jArr10[i51] = j31;
                jArr10[(((iNumberOfTrailingZeros - 7) & i53) + (i53 & 7)) >> 3] = j31;
                break;
            }
            i19 = i24 + 8;
            i18 = (i18 + i19) & i17;
            i13 = i27;
        }
        this.f56655b[iNumberOfTrailingZeros] = j11;
        this.f56656c[iNumberOfTrailingZeros] = obj;
    }

    public final int hashCode() {
        long[] jArr = this.f56655b;
        Object[] objArr = this.f56656c;
        long[] jArr2 = this.f56654a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i11 = 0;
        int iHashCode = 0;
        while (true) {
            long j11 = jArr2[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        long j12 = jArr[i14];
                        Object obj = objArr[i14];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j12);
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

    public final String toString() {
        int i11;
        int i12;
        if (this.f56658e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        long[] jArr = this.f56655b;
        Object[] objArr = this.f56656c;
        long[] jArr2 = this.f56654a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                long j11 = jArr2[i13];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((255 & j11) < 128) {
                            int i17 = (i13 << 3) + i16;
                            i12 = i13;
                            long j12 = jArr[i17];
                            Object obj = objArr[i17];
                            sb2.append(j12);
                            sb2.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            i14++;
                            if (i14 < this.f56658e) {
                                sb2.append(", ");
                            }
                        } else {
                            i12 = i13;
                        }
                        j11 >>= 8;
                        i16++;
                        i13 = i12;
                    }
                    int i18 = i13;
                    if (i15 != 8) {
                        break;
                    }
                    i11 = i18;
                } else {
                    i11 = i13;
                }
                if (i11 == length) {
                    break;
                }
                i13 = i11 + 1;
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        return string;
    }
}
