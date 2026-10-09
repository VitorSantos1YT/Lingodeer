package y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f56677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f56678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f56679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f56681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f56682f;

    public d0(int i11) {
        this.f56677a = r0.f56756a;
        this.f56678b = z.a.f58409c;
        this.f56679c = o.f56744a;
        if (i11 >= 0) {
            e(r0.d(i11));
        } else {
            z.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f56681e = 0;
        long[] jArr = this.f56677a;
        if (jArr != r0.f56756a) {
            ry.l.R(jArr, -9187201950435737472L);
            long[] jArr2 = this.f56677a;
            int i11 = this.f56680d;
            int i12 = i11 >> 3;
            long j11 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j11)) | j11;
        }
        ry.l.P(0, this.f56680d, null, this.f56678b);
        this.f56682f = r0.a(this.f56680d) - this.f56681e;
    }

    public final int b(int i11) {
        int i12 = this.f56680d;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f56677a;
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

    public final int c(Object obj) {
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
        int i15 = this.f56680d;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr2 = this.f56677a;
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
                if (kotlin.jvm.internal.m.a(this.f56678b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j17 &= j17 - 1;
                i11 = i22;
            }
            int i23 = i11;
            if ((((~j14) << 6) & j14 & (-9187201950435737472L)) != 0) {
                int iB = b(i13);
                long j18 = 255;
                if (this.f56682f != 0 || ((this.f56677a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j11 = 255;
                    j12 = j15;
                    j13 = 128;
                } else {
                    int i24 = this.f56680d;
                    if (i24 > 8) {
                        int i25 = 8;
                        if (Long.compare((((long) this.f56681e) * 32) ^ Long.MIN_VALUE, (((long) i24) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f56677a;
                            int i26 = this.f56680d;
                            Object[] objArr2 = this.f56678b;
                            int[] iArr = this.f56679c;
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
                                    int iB2 = b(i35);
                                    int i36 = i35 & i26;
                                    long j24 = j22;
                                    if (((iB2 - i36) & i26) / 8 == ((i31 - i36) & i26) / i29) {
                                        jArr3[i32] = (((long) (i34 & 127)) << i33) | (jArr3[i32] & (~(j11 << i33)));
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j24) | Long.MIN_VALUE;
                                        i31++;
                                        j22 = j24;
                                        i29 = i29;
                                    } else {
                                        int i37 = i29;
                                        int i38 = iB2 >> 3;
                                        long j25 = jArr3[i38];
                                        int i39 = (iB2 & 7) << 3;
                                        if (((j25 >> i39) & j11) == 128) {
                                            objArr = objArr2;
                                            jArr3[i38] = ((~(j11 << i39)) & j25) | (((long) (i34 & 127)) << i39);
                                            jArr3[i32] = (jArr3[i32] & (~(j11 << i33))) | (128 << i33);
                                            objArr[iB2] = objArr[i31];
                                            objArr[i31] = null;
                                            iArr[iB2] = iArr[i31];
                                            iArr[i31] = 0;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i38] = (((long) (i34 & 127)) << i39) | ((~(j11 << i39)) & j25);
                                            Object obj3 = objArr[iB2];
                                            objArr[iB2] = objArr[i31];
                                            objArr[i31] = obj3;
                                            int i40 = iArr[iB2];
                                            iArr[iB2] = iArr[i31];
                                            iArr[i31] = i40;
                                            i31--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j24) | Long.MIN_VALUE;
                                        i31++;
                                        i26 = i26;
                                        j22 = j24;
                                        i29 = i37;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i31++;
                                }
                            }
                            this.f56682f = r0.a(this.f56680d) - this.f56681e;
                        }
                        iB = b(i13);
                    }
                    j11 = 255;
                    j12 = j15;
                    j13 = 128;
                    int iB3 = r0.b(this.f56680d);
                    long[] jArr4 = this.f56677a;
                    Object[] objArr3 = this.f56678b;
                    int[] iArr2 = this.f56679c;
                    int i41 = this.f56680d;
                    e(iB3);
                    long[] jArr5 = this.f56677a;
                    Object[] objArr4 = this.f56678b;
                    int[] iArr3 = this.f56679c;
                    int i42 = this.f56680d;
                    int i43 = 0;
                    while (i43 < i41) {
                        if (((jArr4[i43 >> 3] >> ((i43 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i43];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i23;
                            int i44 = iHashCode3 ^ (iHashCode3 << 16);
                            int iB4 = b(i44 >>> 7);
                            jArr = jArr5;
                            long j26 = i44 & 127;
                            int i45 = iB4 >> 3;
                            int i46 = (iB4 & 7) << 3;
                            long j27 = (jArr[i45] & (~(255 << i46))) | (j26 << i46);
                            jArr[i45] = j27;
                            jArr[(((iB4 - 7) & i42) + (i42 & 7)) >> 3] = j27;
                            objArr4[iB4] = obj4;
                            iArr3[iB4] = iArr2[i43];
                        } else {
                            jArr = jArr5;
                        }
                        i43++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iB = b(i13);
                }
                this.f56681e++;
                int i47 = this.f56682f;
                long[] jArr6 = this.f56677a;
                int i48 = iB >> 3;
                long j28 = jArr6[i48];
                int i49 = (iB & 7) << 3;
                this.f56682f = i47 - (((j28 >> i49) & j11) == j13 ? 1 : 0);
                int i50 = this.f56680d;
                long j29 = (j28 & (~(j11 << i49))) | (j12 << i49);
                jArr6[i48] = j29;
                jArr6[(((iB - 7) & i50) + (i50 & 7)) >> 3] = j29;
                return ~iB;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i14 = i21;
            i11 = i23;
        }
    }

    public final int d(Object obj) {
        int i11 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 & 127;
        int i14 = this.f56680d;
        int i15 = i12 >>> 7;
        while (true) {
            int i16 = i15 & i14;
            long[] jArr = this.f56677a;
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j12 = (((long) i13) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i16) & i14;
                if (kotlin.jvm.internal.m.a(this.f56678b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i11 += 8;
            i15 = i16 + i11;
        }
    }

    public final void e(int i11) {
        long[] jArr;
        int iMax = i11 > 0 ? Math.max(7, r0.c(i11)) : 0;
        this.f56680d = iMax;
        if (iMax == 0) {
            jArr = r0.f56756a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ry.l.R(jArr, -9187201950435737472L);
        }
        this.f56677a = jArr;
        int i12 = iMax >> 3;
        long j11 = 255 << ((iMax & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j11)) | j11;
        this.f56682f = r0.a(this.f56680d) - this.f56681e;
        this.f56678b = new Object[iMax];
        this.f56679c = new int[iMax];
    }

    public final boolean equals(Object obj) {
        boolean z11;
        boolean z12 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (d0Var.f56681e != this.f56681e) {
            return false;
        }
        Object[] objArr = this.f56678b;
        int[] iArr = this.f56679c;
        long[] jArr = this.f56677a;
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
                        Object obj2 = objArr[i14];
                        int i15 = iArr[i14];
                        int iD = d0Var.d(obj2);
                        if (iD < 0 || i15 != d0Var.f56679c[iD]) {
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

    public final void f(int i11) {
        this.f56681e--;
        long[] jArr = this.f56677a;
        int i12 = this.f56680d;
        int i13 = i11 >> 3;
        int i14 = (i11 & 7) << 3;
        long j11 = (jArr[i13] & (~(255 << i14))) | (254 << i14);
        jArr[i13] = j11;
        jArr[(((i11 - 7) & i12) + (i12 & 7)) >> 3] = j11;
        this.f56678b[i11] = null;
    }

    public final void g(int i11, Object obj) {
        int iC = c(obj);
        if (iC < 0) {
            iC = ~iC;
        }
        this.f56678b[iC] = obj;
        this.f56679c[iC] = i11;
    }

    public final int hashCode() {
        Object[] objArr = this.f56678b;
        int[] iArr = this.f56679c;
        long[] jArr = this.f56677a;
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
                        iHashCode += Integer.hashCode(iArr[i14]) ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
      0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    public final String toString() {
        if (this.f56681e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f56678b;
        int[] iArr = this.f56679c;
        long[] jArr = this.f56677a;
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
                            int i16 = iArr[i15];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(i16);
                            i12++;
                            if (i12 < this.f56681e) {
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

    public /* synthetic */ d0() {
        this(6);
    }
}
