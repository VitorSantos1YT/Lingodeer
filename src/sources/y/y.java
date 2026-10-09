package y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f56785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f56786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f56789e;

    public y(int i11) {
        this.f56785a = r0.f56756a;
        this.f56786b = o.f56744a;
        if (i11 >= 0) {
            d(r0.d(i11));
        } else {
            z.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final boolean a(int i11) {
        long j11;
        boolean z11;
        long j12;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int[] iArr;
        int i12;
        int i13 = this.f56788d;
        int i14 = -862048943;
        int iHashCode = Integer.hashCode(i11) * (-862048943);
        int i15 = iHashCode ^ (iHashCode << 16);
        int i16 = i15 >>> 7;
        int i17 = i15 & 127;
        int i18 = this.f56787c;
        int i19 = i16 & i18;
        int i21 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f56785a;
            int i22 = i19 >> 3;
            int i23 = (i19 & 7) << 3;
            boolean z12 = true;
            int i24 = i21;
            long j13 = (((-i23) >> 63) & (jArr2[i22 + 1] << (64 - i23))) | (jArr2[i22] >>> i23);
            long j14 = i17;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (j15 - 72340172838076673L) & (~j15) & (-9187201950435737472L);
            while (j16 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i19) & i18;
                int i25 = i14;
                if (this.f56786b[iNumberOfTrailingZeros] == i11) {
                    z11 = true;
                    break loop0;
                }
                j16 &= j16 - 1;
                i14 = i25;
            }
            int i26 = i14;
            long j17 = j13 & ((~j13) << 6) & (-9187201950435737472L);
            char c11 = '\b';
            if (j17 != 0) {
                int iC = c(i16);
                long j18 = 255;
                if (this.f56789e != 0 || ((this.f56785a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    j11 = 255;
                    z11 = true;
                    j12 = 128;
                } else {
                    int i27 = this.f56787c;
                    if (i27 > 8) {
                        j12 = 128;
                        if (Long.compare((((long) this.f56788d) * 32) ^ Long.MIN_VALUE, (((long) i27) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f56785a;
                            int i28 = this.f56787c;
                            int[] iArr2 = this.f56786b;
                            int i29 = (i28 + 7) >> 3;
                            int i30 = 0;
                            while (i30 < i29) {
                                char c12 = c11;
                                long j19 = jArr3[i30] & (-9187201950435737472L);
                                jArr3[i30] = (-72340172838076674L) & ((~j19) + (j19 >>> 7));
                                i30++;
                                j18 = j18;
                                c11 = c12;
                            }
                            j11 = j18;
                            int iW = ry.l.W(jArr3);
                            int i31 = iW - 1;
                            jArr3[i31] = (jArr3[i31] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iW] = jArr3[0];
                            int i32 = 0;
                            while (i32 != i28) {
                                int i33 = i32 >> 3;
                                int i34 = (i32 & 7) << 3;
                                long j21 = (jArr3[i33] >> i34) & j11;
                                if (j21 != 128 && j21 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i32]) * i26;
                                    int i35 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i36 = i35 >>> 7;
                                    int iC2 = c(i36);
                                    int i37 = i36 & i28;
                                    boolean z13 = z12;
                                    if (((iC2 - i37) & i28) / 8 == ((i32 - i37) & i28) / 8) {
                                        iArr = iArr2;
                                        jArr3[i33] = ((~(j11 << i34)) & jArr3[i33]) | (((long) (i35 & 127)) << i34);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i32++;
                                    } else {
                                        iArr = iArr2;
                                        int i38 = i32;
                                        int i39 = iC2 >> 3;
                                        long j22 = jArr3[i39];
                                        int i40 = (iC2 & 7) << 3;
                                        if (((j22 >> i40) & j11) == 128) {
                                            jArr3[i39] = (j22 & (~(j11 << i40))) | (((long) (i35 & 127)) << i40);
                                            jArr3[i33] = (jArr3[i33] & (~(j11 << i34))) | (128 << i34);
                                            iArr[iC2] = iArr[i38];
                                            iArr[i38] = 0;
                                            i12 = i38;
                                        } else {
                                            jArr3[i39] = (((long) (i35 & 127)) << i40) | (j22 & (~(j11 << i40)));
                                            int i41 = iArr[iC2];
                                            iArr[iC2] = iArr[i38];
                                            iArr[i38] = i41;
                                            i12 = i38 - 1;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i32 = i12 + 1;
                                    }
                                    iArr2 = iArr;
                                    z12 = z13;
                                } else {
                                    i32++;
                                }
                            }
                            z11 = z12;
                            this.f56789e = r0.a(this.f56787c) - this.f56788d;
                        }
                        iC = c(i16);
                    } else {
                        j12 = 128;
                    }
                    j11 = 255;
                    z11 = true;
                    int iB = r0.b(this.f56787c);
                    long[] jArr4 = this.f56785a;
                    int[] iArr3 = this.f56786b;
                    int i42 = this.f56787c;
                    d(iB);
                    long[] jArr5 = this.f56785a;
                    int[] iArr4 = this.f56786b;
                    int i43 = this.f56787c;
                    int i44 = 0;
                    while (i44 < i42) {
                        if (((jArr4[i44 >> 3] >> ((i44 & 7) << 3)) & 255) < j12) {
                            int i45 = iArr3[i44];
                            int iHashCode3 = Integer.hashCode(i45) * i26;
                            int i46 = iHashCode3 ^ (iHashCode3 << 16);
                            int iC3 = c(i46 >>> 7);
                            jArr = jArr5;
                            long j23 = i46 & 127;
                            int i47 = iC3 >> 3;
                            int i48 = (iC3 & 7) << 3;
                            long j24 = (jArr[i47] & (~(255 << i48))) | (j23 << i48);
                            jArr[i47] = j24;
                            jArr[(((iC3 - 7) & i43) + (i43 & 7)) >> 3] = j24;
                            iArr4[iC3] = i45;
                        } else {
                            jArr = jArr5;
                        }
                        i44++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iC = c(i16);
                }
                iNumberOfTrailingZeros = iC;
                this.f56788d++;
                int i49 = this.f56789e;
                long[] jArr6 = this.f56785a;
                int i50 = iNumberOfTrailingZeros >> 3;
                long j25 = jArr6[i50];
                int i51 = (iNumberOfTrailingZeros & 7) << 3;
                this.f56789e = i49 - (((j25 >> i51) & j11) == j12 ? z11 : 0);
                int i52 = this.f56787c;
                long j26 = (j25 & (~(j11 << i51))) | (j14 << i51);
                jArr6[i50] = j26;
                jArr6[(((iNumberOfTrailingZeros - 7) & i52) + (i52 & 7)) >> 3] = j26;
                break;
            }
            i21 = i24 + 8;
            i19 = (i19 + i21) & i18;
            i14 = i26;
        }
        this.f56786b[iNumberOfTrailingZeros] = i11;
        if (this.f56788d != i13) {
            return z11;
        }
        return false;
    }

    public final boolean b(int i11) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i11) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 & 127;
        int i14 = this.f56787c;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f56785a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j12 = (((long) i13) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i15) & i14;
                if (this.f56786b[iNumberOfTrailingZeros] == i11) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    public final int c(int i11) {
        int i12 = this.f56787c;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f56785a;
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

    public final void d(int i11) {
        long[] jArr;
        int iMax = i11 > 0 ? Math.max(7, r0.c(i11)) : 0;
        this.f56787c = iMax;
        if (iMax == 0) {
            jArr = r0.f56756a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ry.l.R(jArr, -9187201950435737472L);
        }
        this.f56785a = jArr;
        int i12 = iMax >> 3;
        long j11 = 255 << ((iMax & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j11)) | j11;
        this.f56789e = r0.a(this.f56787c) - this.f56788d;
        this.f56786b = new int[iMax];
    }

    public final boolean e(int i11) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i11) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 & 127;
        int i14 = this.f56787c;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f56785a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j12 = (((long) i13) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i15) & i14;
                if (this.f56786b[iNumberOfTrailingZeros] == i11) {
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
        boolean z11 = iNumberOfTrailingZeros >= 0;
        if (z11) {
            f(iNumberOfTrailingZeros);
        }
        return z11;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (yVar.f56788d != this.f56788d) {
            return false;
        }
        int[] iArr = this.f56786b;
        long[] jArr = this.f56785a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128 && !yVar.b(iArr[(i11 << 3) + i13])) {
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
        this.f56788d--;
        long[] jArr = this.f56785a;
        int i12 = this.f56787c;
        int i13 = i11 >> 3;
        int i14 = (i11 & 7) << 3;
        long j11 = (jArr[i13] & (~(255 << i14))) | (254 << i14);
        jArr[i13] = j11;
        jArr[(((i11 - 7) & i12) + (i12 & 7)) >> 3] = j11;
    }

    public final int hashCode() {
        int[] iArr = this.f56786b;
        long[] jArr = this.f56785a;
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
                        iHashCode = Integer.hashCode(iArr[(i11 << 3) + i13]) + iHashCode;
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

    /* JADX WARN: Code duplicated, block: B:19:0x005d A[DONT_INVERT, PHI: r7
      0x005d: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005f A[LOOP:0: B:5:0x0018->B:20:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[SYNTHETIC] */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f56786b;
        long[] jArr = this.f56785a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "]");
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j11) < 128) {
                        int i15 = iArr[(i11 << 3) + i14];
                        if (i12 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append((CharSequence) ", ");
                        }
                        sb2.append(i15);
                        i12++;
                    }
                    j11 >>= 8;
                }
                if (i13 == 8) {
                    if (i11 == length) {
                        i11++;
                    }
                }
                sb2.append((CharSequence) "]");
                break;
            }
            if (i11 == length) {
                sb2.append((CharSequence) "]");
                break;
            }
            i11++;
        }
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        return string;
    }

    public /* synthetic */ y() {
        this(6);
    }
}
