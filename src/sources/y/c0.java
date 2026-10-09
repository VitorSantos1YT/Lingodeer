package y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f56670a = r0.f56756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f56671b = z.a.f58409c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f56672c = i.f56712a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f56674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f56675f;

    public c0(int i11) {
        if (i11 >= 0) {
            c(r0.d(i11));
        } else {
            z.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i11) {
        int i12 = this.f56673d;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f56670a;
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

    public final int b(Object obj) {
        int i11 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 & 127;
        int i14 = this.f56673d;
        int i15 = i12 >>> 7;
        while (true) {
            int i16 = i15 & i14;
            long[] jArr = this.f56670a;
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j12 = (((long) i13) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i16) & i14;
                if (kotlin.jvm.internal.m.a(this.f56671b[iNumberOfTrailingZeros], obj)) {
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

    public final void c(int i11) {
        long[] jArr;
        int iMax = i11 > 0 ? Math.max(7, r0.c(i11)) : 0;
        this.f56673d = iMax;
        if (iMax == 0) {
            jArr = r0.f56756a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ry.l.R(jArr, -9187201950435737472L);
        }
        this.f56670a = jArr;
        int i12 = iMax >> 3;
        long j11 = 255 << ((iMax & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j11)) | j11;
        this.f56675f = r0.a(this.f56673d) - this.f56674e;
        this.f56671b = new Object[iMax];
        this.f56672c = new float[iMax];
    }

    public final void d(String str, float f5) {
        long j11;
        long j12;
        long j13;
        int i11;
        long[] jArr;
        Object[] objArr;
        String str2 = str;
        int i12 = -862048943;
        int iHashCode = (str2 != null ? str2.hashCode() : 0) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f56673d;
        int i17 = i14 & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f56670a;
            int i19 = i17 >> 3;
            int i21 = (i17 & 7) << 3;
            long j14 = ((jArr2[i19 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr2[i19] >>> i21);
            long j15 = i15;
            int i22 = i15;
            long j16 = j14 ^ (j15 * 72340172838076673L);
            long j17 = -9187201950435737472L;
            long j18 = (~j16) & (j16 - 72340172838076673L) & (-9187201950435737472L);
            while (j18 != 0) {
                int iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j18) >> 3)) & i16;
                int i23 = i12;
                if (kotlin.jvm.internal.m.a(this.f56671b[iNumberOfTrailingZeros], str2)) {
                    i11 = iNumberOfTrailingZeros;
                    break loop0;
                } else {
                    j18 &= j18 - 1;
                    i12 = i23;
                }
            }
            int i24 = i12;
            if ((((~j14) << 6) & j14 & (-9187201950435737472L)) != 0) {
                int iA = a(i14);
                if (this.f56675f != 0 || ((this.f56670a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    j11 = 255;
                    j12 = j15;
                    j13 = 128;
                } else {
                    int i25 = this.f56673d;
                    if (i25 > 8) {
                        j13 = 128;
                        if (Long.compare((((long) this.f56674e) * 32) ^ Long.MIN_VALUE, (((long) i25) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f56670a;
                            int i26 = this.f56673d;
                            Object[] objArr2 = this.f56671b;
                            float[] fArr = this.f56672c;
                            int i27 = (i26 + 7) >> 3;
                            j11 = 255;
                            int i28 = 0;
                            while (i28 < i27) {
                                long j19 = jArr3[i28] & j17;
                                jArr3[i28] = (-72340172838076674L) & ((~j19) + (j19 >>> 7));
                                i28++;
                                j15 = j15;
                                j17 = -9187201950435737472L;
                            }
                            j12 = j15;
                            char c11 = 7;
                            int iW = ry.l.W(jArr3);
                            int i29 = iW - 1;
                            long j21 = 72057594037927935L;
                            jArr3[i29] = (jArr3[i29] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iW] = jArr3[0];
                            int i30 = 0;
                            while (i30 != i26) {
                                int i31 = i30 >> 3;
                                int i32 = (i30 & 7) << 3;
                                long j22 = (jArr3[i31] >> i32) & 255;
                                if (j22 != 128 && j22 == 254) {
                                    Object obj = objArr2[i30];
                                    int iHashCode2 = (obj != null ? obj.hashCode() : 0) * i24;
                                    int i33 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i34 = i33 >>> 7;
                                    int iA2 = a(i34);
                                    int i35 = i34 & i26;
                                    char c12 = c11;
                                    if (((iA2 - i35) & i26) / 8 == ((i30 - i35) & i26) / 8) {
                                        long j23 = j21;
                                        jArr3[i31] = (((long) (i33 & 127)) << i32) | (jArr3[i31] & (~(255 << i32)));
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j23) | Long.MIN_VALUE;
                                        i30++;
                                        c11 = c12;
                                        j21 = j23;
                                    } else {
                                        long j24 = j21;
                                        int i36 = iA2 >> 3;
                                        long j25 = jArr3[i36];
                                        int i37 = (iA2 & 7) << 3;
                                        if (((j25 >> i37) & 255) == 128) {
                                            objArr = objArr2;
                                            jArr3[i36] = ((~(255 << i37)) & j25) | (((long) (i33 & 127)) << i37);
                                            jArr3[i31] = (jArr3[i31] & (~(255 << i32))) | (128 << i32);
                                            objArr[iA2] = objArr[i30];
                                            objArr[i30] = null;
                                            fArr[iA2] = fArr[i30];
                                            fArr[i30] = 0.0f;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i36] = ((~(255 << i37)) & j25) | (((long) (i33 & 127)) << i37);
                                            Object obj2 = objArr[iA2];
                                            objArr[iA2] = objArr[i30];
                                            objArr[i30] = obj2;
                                            float f11 = fArr[iA2];
                                            fArr[iA2] = fArr[i30];
                                            fArr[i30] = f11;
                                            i30--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j24) | Long.MIN_VALUE;
                                        i30++;
                                        i26 = i26;
                                        c11 = c12;
                                        j21 = j24;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i30++;
                                }
                            }
                            this.f56675f = r0.a(this.f56673d) - this.f56674e;
                        }
                        iA = a(i14);
                    } else {
                        j13 = 128;
                    }
                    j11 = 255;
                    j12 = j15;
                    int iB = r0.b(this.f56673d);
                    long[] jArr4 = this.f56670a;
                    Object[] objArr3 = this.f56671b;
                    float[] fArr2 = this.f56672c;
                    int i38 = this.f56673d;
                    c(iB);
                    long[] jArr5 = this.f56670a;
                    Object[] objArr4 = this.f56671b;
                    float[] fArr3 = this.f56672c;
                    int i39 = this.f56673d;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr4[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < j13) {
                            Object obj3 = objArr3[i40];
                            int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i24;
                            int i41 = iHashCode3 ^ (iHashCode3 << 16);
                            int iA3 = a(i41 >>> 7);
                            jArr = jArr5;
                            long j26 = i41 & 127;
                            int i42 = iA3 >> 3;
                            int i43 = (iA3 & 7) << 3;
                            long j27 = (jArr[i42] & (~(255 << i43))) | (j26 << i43);
                            jArr[i42] = j27;
                            jArr[(((iA3 - 7) & i39) + (i39 & 7)) >> 3] = j27;
                            objArr4[iA3] = obj3;
                            fArr3[iA3] = fArr2[i40];
                        } else {
                            jArr = jArr5;
                        }
                        i40++;
                        jArr5 = jArr;
                    }
                    iA = a(i14);
                }
                this.f56674e++;
                int i44 = this.f56675f;
                long[] jArr6 = this.f56670a;
                int i45 = iA >> 3;
                long j28 = jArr6[i45];
                int i46 = (iA & 7) << 3;
                this.f56675f = i44 - (((j28 >> i46) & j11) == j13 ? 1 : 0);
                int i47 = this.f56673d;
                long j29 = (j28 & (~(j11 << i46))) | (j12 << i46);
                jArr6[i45] = j29;
                jArr6[(((iA - 7) & i47) + (i47 & 7)) >> 3] = j29;
                i11 = ~iA;
                break;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            str2 = str;
            i15 = i22;
            i12 = i24;
        }
        if (i11 < 0) {
            i11 = ~i11;
        }
        this.f56671b[i11] = str;
        this.f56672c[i11] = f5;
    }

    public final boolean equals(Object obj) {
        boolean z11;
        boolean z12 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (c0Var.f56674e != this.f56674e) {
            return false;
        }
        Object[] objArr = this.f56671b;
        float[] fArr = this.f56672c;
        long[] jArr = this.f56670a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        Object obj2 = objArr[i14];
                        float f5 = fArr[i14];
                        int iB = c0Var.b(obj2);
                        if (iB < 0 || f5 != c0Var.f56672c[iB]) {
                            return false;
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
    }

    public final int hashCode() {
        Object[] objArr = this.f56671b;
        float[] fArr = this.f56672c;
        long[] jArr = this.f56670a;
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
                        iHashCode += Float.hashCode(fArr[i14]) ^ (obj != null ? obj.hashCode() : 0);
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
        if (this.f56674e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f56671b;
        float[] fArr = this.f56672c;
        long[] jArr = this.f56670a;
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
                            float f5 = fArr[i15];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(f5);
                            i12++;
                            if (i12 < this.f56674e) {
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
}
