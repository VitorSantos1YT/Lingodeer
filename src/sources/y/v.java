package y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f56774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f56775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f56776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f56778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f56779f;

    public v(int i11) {
        this.f56774a = r0.f56756a;
        int[] iArr = o.f56744a;
        this.f56775b = iArr;
        this.f56776c = iArr;
        if (i11 >= 0) {
            e(r0.d(i11));
        } else {
            z.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f56778e = 0;
        long[] jArr = this.f56774a;
        if (jArr != r0.f56756a) {
            ry.l.R(jArr, -9187201950435737472L);
            long[] jArr2 = this.f56774a;
            int i11 = this.f56777d;
            int i12 = i11 >> 3;
            long j11 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j11)) | j11;
        }
        this.f56779f = r0.a(this.f56777d) - this.f56778e;
    }

    public final int b(int i11) {
        int i12 = this.f56777d;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f56774a;
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

    public final int c(int i11) {
        int iHashCode = Integer.hashCode(i11) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 & 127;
        int i14 = this.f56777d;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f56774a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j12 = (((long) i13) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i15) & i14;
                if (this.f56775b[iNumberOfTrailingZeros] == i11) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
    }

    public final int d(int i11) {
        int iC = c(i11);
        if (iC >= 0) {
            return this.f56776c[iC];
        }
        return -1;
    }

    public final void e(int i11) {
        long[] jArr;
        int iMax = i11 > 0 ? Math.max(7, r0.c(i11)) : 0;
        this.f56777d = iMax;
        if (iMax == 0) {
            jArr = r0.f56756a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ry.l.R(jArr, -9187201950435737472L);
        }
        this.f56774a = jArr;
        int i12 = iMax >> 3;
        long j11 = 255 << ((iMax & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j11)) | j11;
        this.f56779f = r0.a(this.f56777d) - this.f56778e;
        this.f56775b = new int[iMax];
        this.f56776c = new int[iMax];
    }

    public final boolean equals(Object obj) {
        boolean z11;
        boolean z12 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (vVar.f56778e != this.f56778e) {
            return false;
        }
        int[] iArr = this.f56775b;
        int[] iArr2 = this.f56776c;
        long[] jArr = this.f56774a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i11 = 0;
        loop0: while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        int i15 = iArr[i14];
                        int i16 = iArr2[i14];
                        int iC = vVar.c(i15);
                        if (iC < 0 || i16 != vVar.f56776c[iC]) {
                            break loop0;
                        }
                    }
                    j11 >>= 8;
                    i13++;
                    z12 = z12;
                }
                z11 = z12;
                if (i12 != 8) {
                    return z11;
                }
            } else {
                z11 = z12;
            }
            if (i11 == length) {
                return z11;
            }
            i11++;
            z12 = z11;
        }
        return false;
    }

    public final void f(int i11, int i12) {
        long j11;
        long j12;
        int i13;
        int i14;
        long j13;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int[] iArr;
        int[] iArr2;
        int i15 = i11;
        int i16 = -862048943;
        int iHashCode = Integer.hashCode(i15) * (-862048943);
        int i17 = iHashCode ^ (iHashCode << 16);
        int i18 = i17 >>> 7;
        int i19 = i17 & 127;
        int i21 = this.f56777d;
        int i22 = i18 & i21;
        int i23 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f56774a;
            int i24 = i22 >> 3;
            int i25 = (i22 & 7) << 3;
            int i26 = 1;
            int i27 = i23;
            int i28 = 0;
            long j14 = (((-i25) >> 63) & (jArr2[i24 + 1] << (64 - i25))) | (jArr2[i24] >>> i25);
            long j15 = i19;
            long j16 = j14 ^ (j15 * 72340172838076673L);
            long j17 = (j16 - 72340172838076673L) & (~j16) & (-9187201950435737472L);
            while (j17 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j17) >> 3) + i22) & i21;
                int i29 = i16;
                if (this.f56775b[iNumberOfTrailingZeros] == i15) {
                    break loop0;
                }
                j17 &= j17 - 1;
                i16 = i29;
            }
            int i30 = i16;
            if ((j14 & ((~j14) << 6) & (-9187201950435737472L)) != 0) {
                int iB = b(i18);
                long j18 = 255;
                if (this.f56779f != 0 || ((this.f56774a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j11 = j15;
                    j12 = 255;
                    i13 = 1;
                    i14 = 0;
                    j13 = 128;
                } else {
                    int i31 = this.f56777d;
                    if (i31 > 8) {
                        j13 = 128;
                        if (Long.compare((((long) this.f56778e) * 32) ^ Long.MIN_VALUE, (((long) i31) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f56774a;
                            int i32 = this.f56777d;
                            int[] iArr3 = this.f56775b;
                            int[] iArr4 = this.f56776c;
                            int i33 = (i32 + 7) >> 3;
                            int i34 = 0;
                            while (i34 < i33) {
                                long j19 = jArr3[i34] & (-9187201950435737472L);
                                jArr3[i34] = (-72340172838076674L) & ((~j19) + (j19 >>> 7));
                                i34++;
                                j18 = j18;
                                j15 = j15;
                            }
                            j11 = j15;
                            j12 = j18;
                            char c11 = 7;
                            int iW = ry.l.W(jArr3);
                            int i35 = iW - 1;
                            jArr3[i35] = (jArr3[i35] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iW] = jArr3[0];
                            int i36 = 0;
                            while (i36 != i32) {
                                int i37 = i36 >> 3;
                                int i38 = (i36 & 7) << 3;
                                long j21 = (jArr3[i37] >> i38) & j12;
                                if (j21 != 128 && j21 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr3[i36]) * i30;
                                    int i39 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i40 = i39 >>> 7;
                                    int iB2 = b(i40);
                                    int i41 = i40 & i32;
                                    char c12 = c11;
                                    if (((iB2 - i41) & i32) / 8 == ((i36 - i41) & i32) / 8) {
                                        int i42 = i28;
                                        jArr3[i37] = (((long) (i39 & 127)) << i38) | (jArr3[i37] & (~(j12 << i38)));
                                        jArr3[jArr3.length - 1] = (jArr3[i42] & 72057594037927935L) | Long.MIN_VALUE;
                                        i36++;
                                        i26 = i26;
                                        c11 = c12;
                                        i28 = i42;
                                    } else {
                                        int i43 = i26;
                                        int i44 = i28;
                                        int i45 = iB2 >> 3;
                                        long j22 = jArr3[i45];
                                        int i46 = (iB2 & 7) << 3;
                                        if (((j22 >> i46) & j12) == 128) {
                                            iArr = iArr3;
                                            iArr2 = iArr4;
                                            jArr3[i45] = ((~(j12 << i46)) & j22) | (((long) (i39 & 127)) << i46);
                                            jArr3[i37] = (jArr3[i37] & (~(j12 << i38))) | (128 << i38);
                                            iArr[iB2] = iArr[i36];
                                            iArr[i36] = i44;
                                            iArr2[iB2] = iArr2[i36];
                                            iArr2[i36] = i44;
                                        } else {
                                            iArr = iArr3;
                                            iArr2 = iArr4;
                                            jArr3[i45] = (((long) (i39 & 127)) << i46) | ((~(j12 << i46)) & j22);
                                            int i47 = iArr[iB2];
                                            iArr[iB2] = iArr[i36];
                                            iArr[i36] = i47;
                                            int i48 = iArr2[iB2];
                                            iArr2[iB2] = iArr2[i36];
                                            iArr2[i36] = i48;
                                            i36--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i44] & 72057594037927935L) | Long.MIN_VALUE;
                                        i36++;
                                        i26 = i43;
                                        c11 = c12;
                                        i28 = i44;
                                        iArr3 = iArr;
                                        iArr4 = iArr2;
                                    }
                                } else {
                                    i36++;
                                }
                            }
                            i13 = i26;
                            i14 = i28;
                            this.f56779f = r0.a(this.f56777d) - this.f56778e;
                        }
                        iB = b(i18);
                    } else {
                        j13 = 128;
                    }
                    j11 = j15;
                    j12 = 255;
                    i13 = 1;
                    i14 = 0;
                    int iB3 = r0.b(this.f56777d);
                    long[] jArr4 = this.f56774a;
                    int[] iArr5 = this.f56775b;
                    int[] iArr6 = this.f56776c;
                    int i49 = this.f56777d;
                    e(iB3);
                    long[] jArr5 = this.f56774a;
                    int[] iArr7 = this.f56775b;
                    int[] iArr8 = this.f56776c;
                    int i50 = this.f56777d;
                    int i51 = 0;
                    while (i51 < i49) {
                        if (((jArr4[i51 >> 3] >> ((i51 & 7) << 3)) & 255) < j13) {
                            int i52 = iArr5[i51];
                            int iHashCode3 = Integer.hashCode(i52) * i30;
                            int i53 = iHashCode3 ^ (iHashCode3 << 16);
                            int iB4 = b(i53 >>> 7);
                            jArr = jArr5;
                            long j23 = i53 & 127;
                            int i54 = iB4 >> 3;
                            int i55 = (iB4 & 7) << 3;
                            long j24 = (jArr[i54] & (~(255 << i55))) | (j23 << i55);
                            jArr[i54] = j24;
                            jArr[(((iB4 - 7) & i50) + (i50 & 7)) >> 3] = j24;
                            iArr7[iB4] = i52;
                            iArr8[iB4] = iArr6[i51];
                        } else {
                            jArr = jArr5;
                        }
                        i51++;
                        jArr5 = jArr;
                    }
                    iB = b(i18);
                }
                this.f56778e++;
                int i56 = this.f56779f;
                long[] jArr6 = this.f56774a;
                int i57 = iB >> 3;
                long j25 = jArr6[i57];
                int i58 = (iB & 7) << 3;
                if (((j25 >> i58) & j12) == j13) {
                    i14 = i13;
                }
                this.f56779f = i56 - i14;
                int i59 = this.f56777d;
                long j26 = (j25 & (~(j12 << i58))) | (j11 << i58);
                jArr6[i57] = j26;
                jArr6[(((iB - 7) & i59) + (i59 & 7)) >> 3] = j26;
                iNumberOfTrailingZeros = ~iB;
                break;
            }
            i23 = i27 + 8;
            i22 = (i22 + i23) & i21;
            i15 = i11;
            i16 = i30;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.f56775b[iNumberOfTrailingZeros] = i11;
        this.f56776c[iNumberOfTrailingZeros] = i12;
    }

    public final int hashCode() {
        int[] iArr = this.f56775b;
        int[] iArr2 = this.f56776c;
        long[] jArr = this.f56774a;
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
                        int i15 = iArr[i14];
                        iHashCode += Integer.hashCode(iArr2[i14]) ^ Integer.hashCode(i15);
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

    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[DONT_INVERT, PHI: r8
      0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0068 A[LOOP:0: B:9:0x001e->B:21:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x006b A[EDGE_INSN: B:25:0x006b->B:22:0x006b BREAK  A[LOOP:0: B:9:0x001e->B:21:0x0068], SYNTHETIC] */
    public final String toString() {
        if (this.f56778e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        int[] iArr = this.f56775b;
        int[] iArr2 = this.f56776c;
        long[] jArr = this.f56774a;
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
                            int i16 = iArr[i15];
                            int i17 = iArr2[i15];
                            sb2.append(i16);
                            sb2.append("=");
                            sb2.append(i17);
                            i12++;
                            if (i12 < this.f56778e) {
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

    public /* synthetic */ v() {
        this(6);
    }
}
