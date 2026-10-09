package y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f56720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f56721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f56724e;

    public j0(int i11) {
        this.f56720a = r0.f56756a;
        this.f56721b = z.a.f58409c;
        if (i11 >= 0) {
            f(r0.d(i11));
        } else {
            z.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i11 = this.f56723d;
        this.f56721b[d(obj)] = obj;
        return this.f56723d != i11;
    }

    public final void b() {
        this.f56723d = 0;
        long[] jArr = this.f56720a;
        if (jArr != r0.f56756a) {
            ry.l.R(jArr, -9187201950435737472L);
            long[] jArr2 = this.f56720a;
            int i11 = this.f56722c;
            int i12 = i11 >> 3;
            long j11 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j11)) | j11;
        }
        ry.l.P(0, this.f56722c, null, this.f56721b);
        this.f56724e = r0.a(this.f56722c) - this.f56723d;
    }

    public final boolean c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f56722c;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f56720a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = (((long) i12) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (kotlin.jvm.internal.m.a(this.f56721b[iNumberOfTrailingZeros], obj)) {
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
        int i15 = this.f56722c;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr2 = this.f56720a;
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
                if (kotlin.jvm.internal.m.a(this.f56721b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j17 &= j17 - 1;
                i11 = i22;
            }
            int i23 = i11;
            if ((((~j14) << 6) & j14 & (-9187201950435737472L)) != 0) {
                int iE = e(i13);
                long j18 = 255;
                if (this.f56724e != 0 || ((this.f56720a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j11 = 255;
                    j12 = j15;
                    j13 = 128;
                } else {
                    int i24 = this.f56722c;
                    if (i24 > 8) {
                        int i25 = 8;
                        if (Long.compare((((long) this.f56723d) * 32) ^ Long.MIN_VALUE, (((long) i24) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f56720a;
                            int i26 = this.f56722c;
                            Object[] objArr2 = this.f56721b;
                            int i27 = (i26 + 7) >> 3;
                            int i28 = 0;
                            j13 = 128;
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
                            long j22 = 72057594037927935L;
                            jArr3[i30] = (jArr3[i30] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iW] = jArr3[0];
                            int i31 = 0;
                            while (i31 != i26) {
                                int i32 = i31 >> 3;
                                int i33 = (i31 & 7) << 3;
                                long j23 = (jArr3[i32] >> i33) & j11;
                                if (j23 != 128 && j23 == 254) {
                                    Object obj2 = objArr2[i31];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i23;
                                    int i34 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i35 = i34 >>> 7;
                                    int iE2 = e(i35);
                                    int i36 = i35 & i26;
                                    if (((iE2 - i36) & i26) / i29 == ((i31 - i36) & i26) / i29) {
                                        long j24 = j22;
                                        jArr3[i32] = (((long) (i34 & 127)) << i33) | ((~(j11 << i33)) & jArr3[i32]);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j24) | Long.MIN_VALUE;
                                        i31++;
                                        j22 = j24;
                                    } else {
                                        long j25 = j22;
                                        int i37 = iE2 >> 3;
                                        long j26 = jArr3[i37];
                                        int i38 = (iE2 & 7) << 3;
                                        if (((j26 >> i38) & j11) == 128) {
                                            objArr = objArr2;
                                            jArr3[i37] = ((~(j11 << i38)) & j26) | (((long) (i34 & 127)) << i38);
                                            jArr3[i32] = (jArr3[i32] & (~(j11 << i33))) | (128 << i33);
                                            objArr[iE2] = objArr[i31];
                                            objArr[i31] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i37] = (((long) (i34 & 127)) << i38) | ((~(j11 << i38)) & j26);
                                            Object obj3 = objArr[iE2];
                                            objArr[iE2] = objArr[i31];
                                            objArr[i31] = obj3;
                                            i31--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j25) | Long.MIN_VALUE;
                                        i31++;
                                        j22 = j25;
                                        i29 = i29;
                                        i26 = i26;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i31++;
                                }
                            }
                            this.f56724e = r0.a(this.f56722c) - this.f56723d;
                        }
                        iE = e(i13);
                    }
                    j11 = 255;
                    j12 = j15;
                    j13 = 128;
                    int iB = r0.b(this.f56722c);
                    long[] jArr4 = this.f56720a;
                    Object[] objArr3 = this.f56721b;
                    int i39 = this.f56722c;
                    f(iB);
                    long[] jArr5 = this.f56720a;
                    Object[] objArr4 = this.f56721b;
                    int i40 = this.f56722c;
                    int i41 = 0;
                    while (i41 < i39) {
                        if (((jArr4[i41 >> 3] >> ((i41 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i41];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i23;
                            int i42 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i42 >>> 7);
                            long j27 = i42 & 127;
                            int i43 = iE3 >> 3;
                            int i44 = (iE3 & 7) << 3;
                            jArr = jArr5;
                            long j28 = (jArr5[i43] & (~(255 << i44))) | (j27 << i44);
                            jArr[i43] = j28;
                            jArr[(((iE3 - 7) & i40) + (i40 & 7)) >> 3] = j28;
                            objArr4[iE3] = obj4;
                        } else {
                            jArr = jArr5;
                        }
                        i41++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iE = e(i13);
                }
                this.f56723d++;
                int i45 = this.f56724e;
                long[] jArr6 = this.f56720a;
                int i46 = iE >> 3;
                long j29 = jArr6[i46];
                int i47 = (iE & 7) << 3;
                this.f56724e = i45 - (((j29 >> i47) & j11) == j13 ? 1 : 0);
                int i48 = this.f56722c;
                long j30 = (j29 & (~(j11 << i47))) | (j12 << i47);
                jArr6[i46] = j30;
                jArr6[(((iE - 7) & i48) + (i48 & 7)) >> 3] = j30;
                return iE;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i14 = i21;
            i11 = i23;
        }
    }

    public final int e(int i11) {
        int i12 = this.f56722c;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f56720a;
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
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (j0Var.f56723d != this.f56723d) {
            return false;
        }
        Object[] objArr = this.f56721b;
        long[] jArr = this.f56720a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128 && !j0Var.c(objArr[(i11 << 3) + i13])) {
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
        int iMax = i11 > 0 ? Math.max(7, r0.c(i11)) : 0;
        this.f56722c = iMax;
        if (iMax == 0) {
            jArr = r0.f56756a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ry.l.R(jArr, -9187201950435737472L);
        }
        this.f56720a = jArr;
        int i12 = iMax >> 3;
        long j11 = 255 << ((iMax & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j11)) | j11;
        this.f56724e = r0.a(this.f56722c) - this.f56723d;
        this.f56721b = iMax == 0 ? z.a.f58409c : new Object[iMax];
    }

    public final boolean g() {
        return this.f56723d == 0;
    }

    public final boolean h() {
        return this.f56723d != 0;
    }

    public final int hashCode() {
        int iHashCode = (this.f56722c * 31) + this.f56723d;
        Object[] objArr = this.f56721b;
        long[] jArr = this.f56720a;
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

    public final void i(Object obj) {
        int iNumberOfTrailingZeros;
        int i11 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 & 127;
        int i14 = this.f56722c;
        int i15 = i12 >>> 7;
        loop0: while (true) {
            int i16 = i15 & i14;
            long[] jArr = this.f56720a;
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j12 = (((long) i13) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i16) & i14;
                if (kotlin.jvm.internal.m.a(this.f56721b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i11 += 8;
                i15 = i16 + i11;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            m(iNumberOfTrailingZeros);
        }
    }

    public final void j(Object obj) {
        this.f56721b[d(obj)] = obj;
    }

    public final void k(j0 elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        Object[] objArr = elements.f56721b;
        long[] jArr = elements.f56720a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        j(objArr[(i11 << 3) + i13]);
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final boolean l(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f56722c;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f56720a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = (((long) i12) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (kotlin.jvm.internal.m.a(this.f56721b[iNumberOfTrailingZeros], obj)) {
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
            m(iNumberOfTrailingZeros);
        }
        return z11;
    }

    public final void m(int i11) {
        this.f56723d--;
        long[] jArr = this.f56720a;
        int i12 = this.f56722c;
        int i13 = i11 >> 3;
        int i14 = (i11 & 7) << 3;
        long j11 = (jArr[i13] & (~(255 << i14))) | (254 << i14);
        jArr[i13] = j11;
        jArr[(((i11 - 7) & i12) + (i12 & 7)) >> 3] = j11;
        this.f56721b[i11] = null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0066 A[DONT_INVERT, PHI: r8
      0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:6:0x0029, B:18:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0068 A[LOOP:0: B:5:0x001b->B:20:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x006b A[SYNTHETIC] */
    public final String toString() {
        p0 p0Var = new p0(this, 1);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f56721b;
        long[] jArr = this.f56720a;
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
                        Object obj = objArr[(i11 << 3) + i14];
                        if (i12 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append((CharSequence) ", ");
                        }
                        sb2.append((CharSequence) p0Var.invoke(obj));
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

    public /* synthetic */ j0() {
        this(6);
    }
}
