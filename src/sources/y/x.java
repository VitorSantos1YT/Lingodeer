package y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f56784f;

    public x(int i11) {
        this.f56736a = r0.f56756a;
        this.f56737b = o.f56744a;
        this.f56738c = z.a.f58409c;
        if (i11 >= 0) {
            f(r0.d(i11));
        } else {
            z.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f56740e = 0;
        long[] jArr = this.f56736a;
        if (jArr != r0.f56756a) {
            ry.l.R(jArr, -9187201950435737472L);
            long[] jArr2 = this.f56736a;
            int i11 = this.f56739d;
            int i12 = i11 >> 3;
            long j11 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j11)) | j11;
        }
        ry.l.P(0, this.f56739d, null, this.f56738c);
        this.f56784f = r0.a(this.f56739d) - this.f56740e;
    }

    public final int d(int i11) {
        long j11;
        long j12;
        int i12;
        long j13;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        int i13 = -862048943;
        int iHashCode = Integer.hashCode(i11) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f56739d;
        int i18 = i15 & i17;
        int i19 = 0;
        while (true) {
            long[] jArr2 = this.f56736a;
            int i21 = i18 >> 3;
            int i22 = (i18 & 7) << 3;
            int i23 = 1;
            long j14 = ((jArr2[i21 + 1] << (64 - i22)) & ((-i22) >> 63)) | (jArr2[i21] >>> i22);
            long j15 = i16;
            int i24 = i19;
            int i25 = 0;
            long j16 = j14 ^ (j15 * 72340172838076673L);
            long j17 = (~j16) & (j16 - 72340172838076673L) & (-9187201950435737472L);
            while (j17 != 0) {
                int iNumberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j17) >> 3)) & i17;
                int i26 = i13;
                int i27 = i25;
                if (this.f56737b[iNumberOfTrailingZeros] == i11) {
                    return iNumberOfTrailingZeros;
                }
                j17 &= j17 - 1;
                i13 = i26;
                i25 = i27;
            }
            int i28 = i13;
            int i29 = i25;
            if ((((~j14) << 6) & j14 & (-9187201950435737472L)) != 0) {
                int iE = e(i15);
                long j18 = 255;
                if (this.f56784f != 0 || ((this.f56736a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j11 = 255;
                    j12 = j15;
                    i12 = 1;
                    j13 = 128;
                } else {
                    int i30 = this.f56739d;
                    if (i30 > 8) {
                        j13 = 128;
                        if (Long.compare((((long) this.f56740e) * 32) ^ Long.MIN_VALUE, (((long) i30) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f56736a;
                            int i31 = this.f56739d;
                            int[] iArr2 = this.f56737b;
                            Object[] objArr2 = this.f56738c;
                            int i32 = (i31 + 7) >> 3;
                            int i33 = i29;
                            while (i33 < i32) {
                                long j19 = j18;
                                long j21 = jArr3[i33] & (-9187201950435737472L);
                                jArr3[i33] = (-72340172838076674L) & ((~j21) + (j21 >>> 7));
                                i33++;
                                j15 = j15;
                                j18 = j19;
                            }
                            j11 = j18;
                            j12 = j15;
                            int iW = ry.l.W(jArr3);
                            int i34 = iW - 1;
                            long j22 = 72057594037927935L;
                            jArr3[i34] = (jArr3[i34] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iW] = jArr3[i29];
                            int i35 = i29;
                            while (i35 != i31) {
                                int i36 = i35 >> 3;
                                int i37 = (i35 & 7) << 3;
                                long j23 = (jArr3[i36] >> i37) & j11;
                                if (j23 != 128 && j23 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i35]) * i28;
                                    int i38 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i39 = i38 >>> 7;
                                    int iE2 = e(i39);
                                    int i40 = i39 & i31;
                                    if (((iE2 - i40) & i31) / 8 == ((i35 - i40) & i31) / 8) {
                                        long j24 = j22;
                                        jArr3[i36] = (((long) (i38 & 127)) << i37) | ((~(j11 << i37)) & jArr3[i36]);
                                        jArr3[jArr3.length - i23] = (jArr3[i29] & j24) | Long.MIN_VALUE;
                                        i35++;
                                        j22 = j24;
                                    } else {
                                        long j25 = j22;
                                        int i41 = iE2 >> 3;
                                        long j26 = jArr3[i41];
                                        int i42 = (iE2 & 7) << 3;
                                        if (((j26 >> i42) & j11) == 128) {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr3[i41] = ((~(j11 << i42)) & j26) | (((long) (i38 & 127)) << i42);
                                            jArr3[i36] = (jArr3[i36] & (~(j11 << i37))) | (128 << i37);
                                            iArr[iE2] = iArr[i35];
                                            iArr[i35] = i29;
                                            objArr[iE2] = objArr[i35];
                                            objArr[i35] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr3[i41] = (((long) (i38 & 127)) << i42) | ((~(j11 << i42)) & j26);
                                            int i43 = iArr[iE2];
                                            iArr[iE2] = iArr[i35];
                                            iArr[i35] = i43;
                                            Object obj = objArr[iE2];
                                            objArr[iE2] = objArr[i35];
                                            objArr[i35] = obj;
                                            i35--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i29] & j25) | Long.MIN_VALUE;
                                        i35++;
                                        j22 = j25;
                                        i23 = i23;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i35++;
                                }
                            }
                            i12 = i23;
                            this.f56784f = r0.a(this.f56739d) - this.f56740e;
                        }
                        iE = e(i15);
                    } else {
                        j13 = 128;
                    }
                    j11 = 255;
                    j12 = j15;
                    i12 = 1;
                    int iB = r0.b(this.f56739d);
                    long[] jArr4 = this.f56736a;
                    int[] iArr3 = this.f56737b;
                    Object[] objArr3 = this.f56738c;
                    int i44 = this.f56739d;
                    f(iB);
                    long[] jArr5 = this.f56736a;
                    int[] iArr4 = this.f56737b;
                    Object[] objArr4 = this.f56738c;
                    int i45 = this.f56739d;
                    int i46 = i29;
                    while (i46 < i44) {
                        if (((jArr4[i46 >> 3] >> ((i46 & 7) << 3)) & 255) < j13) {
                            int i47 = iArr3[i46];
                            int iHashCode3 = Integer.hashCode(i47) * i28;
                            int i48 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i48 >>> 7);
                            long j27 = i48 & 127;
                            int i49 = iE3 >> 3;
                            int i50 = (iE3 & 7) << 3;
                            jArr = jArr5;
                            long j28 = (jArr5[i49] & (~(255 << i50))) | (j27 << i50);
                            jArr[i49] = j28;
                            jArr[(((iE3 - 7) & i45) + (i45 & 7)) >> 3] = j28;
                            iArr4[iE3] = i47;
                            objArr4[iE3] = objArr3[i46];
                        } else {
                            jArr = jArr5;
                        }
                        i46++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iE = e(i15);
                }
                this.f56740e++;
                int i51 = this.f56784f;
                long[] jArr6 = this.f56736a;
                int i52 = iE >> 3;
                long j29 = jArr6[i52];
                int i53 = (iE & 7) << 3;
                if (((j29 >> i53) & j11) != j13) {
                    i12 = i29;
                }
                this.f56784f = i51 - i12;
                int i54 = this.f56739d;
                long j30 = (j29 & (~(j11 << i53))) | (j12 << i53);
                jArr6[i52] = j30;
                jArr6[(((iE - 7) & i54) + (i54 & 7)) >> 3] = j30;
                return iE;
            }
            i19 = i24 + 8;
            i18 = (i18 + i19) & i17;
            i13 = i28;
        }
    }

    public final int e(int i11) {
        int i12 = this.f56739d;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f56736a;
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

    public final void f(int i11) {
        long[] jArr;
        int iMax = i11 > 0 ? Math.max(7, r0.c(i11)) : 0;
        this.f56739d = iMax;
        if (iMax == 0) {
            jArr = r0.f56756a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ry.l.R(jArr, -9187201950435737472L);
        }
        this.f56736a = jArr;
        int i12 = iMax >> 3;
        long j11 = 255 << ((iMax & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j11)) | j11;
        this.f56784f = r0.a(this.f56739d) - this.f56740e;
        this.f56737b = new int[iMax];
        this.f56738c = new Object[iMax];
    }

    public final Object g(int i11) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i11) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 & 127;
        int i14 = this.f56739d;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f56736a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j12 = (((long) i13) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i15) & i14;
                if (this.f56737b[iNumberOfTrailingZeros] == i11) {
                    break loop0;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f56740e--;
        long[] jArr2 = this.f56736a;
        int i19 = this.f56739d;
        int i21 = iNumberOfTrailingZeros >> 3;
        int i22 = (iNumberOfTrailingZeros & 7) << 3;
        long j14 = (jArr2[i21] & (~(255 << i22))) | (254 << i22);
        jArr2[i21] = j14;
        jArr2[(((iNumberOfTrailingZeros - 7) & i19) + (i19 & 7)) >> 3] = j14;
        Object[] objArr = this.f56738c;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    public final void h(int i11, Object obj) {
        int iD = d(i11);
        this.f56737b[iD] = i11;
        this.f56738c[iD] = obj;
    }

    public /* synthetic */ x() {
        this(6);
    }
}
