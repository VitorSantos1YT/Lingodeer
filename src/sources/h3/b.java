package h3;

import a0.c0;
import android.os.Handler;
import com.yalantis.ucrop.view.CropImageView;
import g2.f0;
import g2.k0;
import ij.d;
import n1.e;
import rt.mc;
import rt.qf;
import v3.j;
import v3.l;
import y.e0;
import y.x;
import y2.b1;
import y2.i0;
import y2.k1;
import y2.s1;
import y2.v;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f31536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f31537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f31538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f31540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f31541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qf f31542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f31543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c0 f31544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f2.a f31545j;

    public b() {
        d dVar = new d(7, false);
        dVar.f34422c = new long[192];
        dVar.f34423d = new long[192];
        this.f31536a = dVar;
        this.f31537b = new c();
        this.f31538c = new e0();
        this.f31543h = -1L;
        this.f31544i = new c0(this, 12);
        this.f31545j = new f2.a();
    }

    public static long f(i0 i0Var) {
        mc mcVar = i0Var.f56892i0;
        k1 k1Var = (k1) mcVar.f50087e;
        long jE = 0;
        for (k1 k1Var2 = (v) mcVar.f50086d; k1Var2 != null && k1Var2 != k1Var; k1Var2 = k1Var2.S) {
            s1 s1Var = k1Var2.f56957n0;
            if (s1Var != null && !f0.t(s1Var.mo6getUnderlyingMatrixsQKQjiQ())) {
                return 9223372034707292159L;
            }
            jE = j.e(jE, k1Var2.f56945b0);
        }
        return jE;
    }

    public static void h(i0 i0Var) {
        if (i0Var.f56882c) {
            s1 s1Var = ((k1) i0Var.f56892i0.f50087e).f56957n0;
            if (s1Var == null || f0.t(s1Var.mo6getUnderlyingMatrixsQKQjiQ())) {
                i0Var.f56882c = false;
                if (i0Var.f56903t) {
                    i0Var.f56888f = f(i0Var);
                    i0Var.f56903t = false;
                }
                if (j.c(i0Var.f56888f, 9223372034707292159L)) {
                    return;
                }
                e eVarA = i0Var.A();
                Object[] objArr = eVarA.f43112a;
                int i11 = eVarA.f43114c;
                for (int i12 = 0; i12 < i11; i12++) {
                    h((i0) objArr[i12]);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x00f1 A[EDGE_INSN: B:106:0x00f1->B:56:0x00f1 BREAK  A[LOOP:3: B:39:0x00ab->B:53:0x00e3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0183 A[EDGE_INSN: B:117:0x0183->B:92:0x0183 BREAK  A[LOOP:6: B:77:0x014e->B:91:0x0180], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0183 A[EDGE_INSN: B:118:0x0183->B:92:0x0183 BREAK  A[LOOP:6: B:77:0x014e->B:91:0x0180], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e3 A[LOOP:3: B:39:0x00ab->B:53:0x00e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:68:0x011e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0142  */
    /* JADX WARN: Code duplicated, block: B:76:0x014d  */
    /* JADX WARN: Code duplicated, block: B:79:0x015a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0164  */
    /* JADX WARN: Code duplicated, block: B:90:0x017e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0180 A[LOOP:6: B:77:0x014e->B:91:0x0180, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x018f  */
    public final void a() {
        char c11;
        long j11;
        long j12;
        long j13;
        long[] jArr;
        int length;
        int i11;
        long j14;
        int i12;
        int i13;
        long[] jArr2;
        long[] jArr3;
        int i14;
        int i15;
        int i16;
        qf qfVar = this.f31542g;
        if (qfVar != null) {
            z1.b.f58462a.removeCallbacks(qfVar);
            this.f31542g = null;
        }
        Handler handler = z1.b.f58462a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z11 = this.f31539d;
        boolean z12 = z11 || this.f31540e;
        d dVar = this.f31536a;
        c cVar = this.f31537b;
        if (z11) {
            this.f31539d = false;
            e0 e0Var = this.f31538c;
            Object[] objArr = e0Var.f56686a;
            int i17 = e0Var.f56687b;
            for (int i18 = 0; i18 < i17; i18++) {
                ((fz.a) objArr[i18]).invoke();
            }
            long[] jArr4 = (long[]) dVar.f34422c;
            int i19 = dVar.f34421b;
            for (int i21 = 0; i21 < jArr4.length - 2 && i21 < i19; i21 += 3) {
                long j15 = jArr4[i21 + 2];
                if ((((int) (j15 >> 60)) & 1) != 0) {
                    long j16 = jArr4[i21];
                    long j17 = jArr4[i21 + 1];
                    if (cVar.f31546a.b(((int) j15) & 33554431) != null) {
                        throw new ClassCastException();
                    }
                }
            }
            long[] jArr5 = (long[]) dVar.f34422c;
            int i22 = dVar.f34421b;
            for (int i23 = 0; i23 < jArr5.length - 2 && i23 < i22; i23 += 3) {
                int i24 = i23 + 2;
                jArr5[i24] = jArr5[i24] & (-1152921504606846977L);
            }
        }
        if (this.f31540e) {
            this.f31540e = false;
            x xVar = cVar.f31546a;
            c11 = 7;
            Object[] objArr2 = xVar.f56738c;
            long[] jArr6 = xVar.f56736a;
            j11 = 128;
            int length2 = jArr6.length - 2;
            if (length2 >= 0) {
                int i25 = 0;
                j12 = 255;
                while (true) {
                    long j18 = jArr6[i25];
                    j13 = -9187201950435737472L;
                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i25 != length2) {
                            break;
                            break;
                        }
                        i25++;
                    } else {
                        int i26 = 8 - ((~(i25 - length2)) >>> 31);
                        for (int i27 = 0; i27 < i26; i27++) {
                            if ((j18 & 255) < 128 && objArr2[(i25 << 3) + i27] != null) {
                                throw new ClassCastException();
                            }
                            j18 >>= 8;
                        }
                        if (i26 != 8) {
                            break;
                        } else if (i25 != length2) {
                            break;
                        } else {
                            i25++;
                        }
                    }
                }
            }
            if (z12) {
                cVar.getClass();
            }
            if (this.f31541f) {
                this.f31541f = false;
                jArr2 = (long[]) dVar.f34422c;
                int i28 = dVar.f34421b;
                jArr3 = (long[]) dVar.f34423d;
                i15 = 0;
                for (i14 = 0; i14 < jArr2.length - 2 && i15 < jArr3.length - 2 && i14 < i28; i14 += 3) {
                    i16 = i14 + 2;
                    if (jArr2[i16] != a.f31535c) {
                        jArr3[i15] = jArr2[i14];
                        jArr3[i15 + 1] = jArr2[i14 + 1];
                        jArr3[i15 + 2] = jArr2[i16];
                        i15 += 3;
                    }
                }
                dVar.f34421b = i15;
                dVar.f34422c = jArr3;
                dVar.f34423d = jArr2;
            }
            if (cVar.f31547b <= jCurrentTimeMillis) {
                x xVar2 = cVar.f31546a;
                Object[] objArr3 = xVar2.f56738c;
                jArr = xVar2.f56736a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i11 = 0;
                    while (true) {
                        j14 = jArr[i11];
                        if ((((~j14) << c11) & j14 & j13) != j13) {
                            if (i11 != length) {
                                break;
                                break;
                            }
                            i11++;
                        } else {
                            i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (i13 = 0; i13 < i12; i13++) {
                                if ((j14 & j12) >= j11 && objArr3[(i11 << 3) + i13] != null) {
                                    throw new ClassCastException();
                                }
                                j14 >>= 8;
                            }
                            if (i12 == 8) {
                                break;
                            } else if (i11 != length) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                cVar.f31547b = -1L;
            }
            if (cVar.f31547b > 0) {
                i();
            }
        }
        c11 = 7;
        j11 = 128;
        j12 = 255;
        j13 = -9187201950435737472L;
        if (z12) {
            cVar.getClass();
        }
        if (this.f31541f) {
            this.f31541f = false;
            jArr2 = (long[]) dVar.f34422c;
            int i29 = dVar.f34421b;
            jArr3 = (long[]) dVar.f34423d;
            i15 = 0;
            while (i14 < jArr2.length - 2) {
                i16 = i14 + 2;
                if (jArr2[i16] != a.f31535c) {
                    jArr3[i15] = jArr2[i14];
                    jArr3[i15 + 1] = jArr2[i14 + 1];
                    jArr3[i15 + 2] = jArr2[i16];
                    i15 += 3;
                }
            }
            dVar.f34421b = i15;
            dVar.f34422c = jArr3;
            dVar.f34423d = jArr2;
        }
        if (cVar.f31547b <= jCurrentTimeMillis) {
            x xVar3 = cVar.f31546a;
            Object[] objArr4 = xVar3.f56738c;
            jArr = xVar3.f56736a;
            length = jArr.length - 2;
            if (length >= 0) {
                i11 = 0;
                while (true) {
                    j14 = jArr[i11];
                    if ((((~j14) << c11) & j14 & j13) != j13) {
                        if (i11 != length) {
                            break;
                            break;
                        }
                        i11++;
                    } else {
                        i12 = 8 - ((~(i11 - length)) >>> 31);
                        while (i13 < i12) {
                            if ((j14 & j12) >= j11) {
                            }
                            j14 >>= 8;
                        }
                        if (i12 == 8) {
                            break;
                            break;
                        } else {
                            if (i11 != length) {
                                break;
                                break;
                            }
                            i11++;
                        }
                    }
                }
            }
            cVar.f31547b = -1L;
        }
        if (cVar.f31547b > 0) {
            i();
        }
    }

    public final long b(i0 i0Var) {
        long j11;
        int i11 = i0Var.f56880b & 33554431;
        d dVar = this.f31536a;
        long[] jArr = (long[]) dVar.f34422c;
        int i12 = dVar.f34421b;
        int i13 = 0;
        while (true) {
            if (i13 >= jArr.length - 2 || i13 >= i12) {
                j11 = Long.MAX_VALUE;
                break;
            }
            if ((((int) jArr[i13 + 2]) & 33554431) == i11) {
                j11 = jArr[i13];
                break;
            }
            i13 += 3;
        }
        if (j11 == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((long) ((int) (j11 >> 32))) << 32) | (((long) ((int) j11)) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0107  */
    /* JADX WARN: Code duplicated, block: B:33:0x010c  */
    public final void c(i0 i0Var) {
        char c11;
        boolean z11;
        i0 i0VarW;
        int i11;
        boolean z12 = true;
        i0Var.f56882c = true;
        i0Var.f56884d = 9223372034707292159L;
        mc mcVar = i0Var.f56892i0;
        k1 k1Var = (k1) mcVar.f50087e;
        b1 b1Var = i0Var.f56893j0.f56974p;
        int iG0 = b1Var.g0();
        float fA0 = b1Var.a0();
        f2.a aVar = this.f31545j;
        aVar.f26566a = CropImageView.DEFAULT_ASPECT_RATIO;
        aVar.f26567b = CropImageView.DEFAULT_ASPECT_RATIO;
        aVar.f26568c = iG0;
        aVar.f26569d = fA0;
        while (true) {
            c11 = ' ';
            if (k1Var == null) {
                break;
            }
            i0 i0Var2 = k1Var.Q;
            if (k1Var == ((k1) i0Var2.f56892i0.f50087e) && !i0Var2.f56882c) {
                long jB = b(i0Var2);
                if (!j.c(jB, 9223372034707292159L)) {
                    aVar.c((((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (jB >> 32)) << 32));
                    break;
                }
            }
            s1 s1Var = k1Var.f56957n0;
            if (s1Var != null) {
                float[] fArrMo6getUnderlyingMatrixsQKQjiQ = s1Var.mo6getUnderlyingMatrixsQKQjiQ();
                if (!f0.t(fArrMo6getUnderlyingMatrixsQKQjiQ)) {
                    k0.c(fArrMo6getUnderlyingMatrixsQKQjiQ, aVar);
                }
            }
            long j11 = k1Var.f56945b0;
            aVar.c((4294967295L & ((long) Float.floatToRawIntBits((int) (j11 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j11 >> 32)) << 32));
            k1Var = k1Var.S;
        }
        int i12 = (int) aVar.f26566a;
        int i13 = (int) aVar.f26567b;
        int i14 = (int) aVar.f26568c;
        int i15 = (int) aVar.f26569d;
        int i16 = i0Var.f56880b;
        boolean z13 = i0Var.H;
        i0Var.H = true;
        d dVar = this.f31536a;
        if (z13) {
            int i17 = i16 & 33554431;
            long[] jArr = (long[]) dVar.f34422c;
            int i18 = dVar.f34421b;
            int i19 = 0;
            while (true) {
                if (i19 >= jArr.length - 2 || i19 >= i18) {
                    z11 = z12;
                    d dVar2 = dVar;
                    i0VarW = i0Var.w();
                    if (i0VarW != null) {
                        i11 = i0VarW.f56880b;
                    } else {
                        i11 = -1;
                    }
                    dVar2.w(i16, i12, i13, i14, i15, (512 & 32) != 0 ? -1 : i11, mcVar.g(1024), mcVar.g(16), this.f31537b.f31546a.a(i16), -1);
                } else {
                    int i21 = i19 + 2;
                    char c12 = c11;
                    d dVar3 = dVar;
                    long j12 = jArr[i21];
                    z11 = z12;
                    if ((((int) j12) & 33554431) == i17) {
                        jArr[i19] = (((long) i12) << c12) | (((long) i13) & 4294967295L);
                        jArr[i19 + 1] = (((long) i15) & 4294967295L) | (((long) i14) << c12);
                        jArr[i21] = (((j12 >> 63) & 1) << 60) | j12;
                    } else {
                        i19 += 3;
                        c11 = c12;
                        dVar = dVar3;
                        z12 = z11;
                    }
                }
            }
        } else {
            z11 = z12;
            d dVar4 = dVar;
            i0VarW = i0Var.w();
            if (i0VarW != null) {
                i11 = i0VarW.f56880b;
            } else {
                i11 = -1;
            }
            dVar4.w(i16, i12, i13, i14, i15, (512 & 32) != 0 ? -1 : i11, mcVar.g(1024), mcVar.g(16), this.f31537b.f31546a.a(i16), -1);
        }
        this.f31539d = z11;
        e eVarA = i0Var.A();
        Object[] objArr = eVarA.f43112a;
        int i22 = eVarA.f43114c;
        for (int i23 = 0; i23 < i22; i23++) {
            i0 i0Var3 = (i0) objArr[i23];
            if (i0Var3.J()) {
                c(i0Var3);
            }
        }
    }

    public final void d(i0 i0Var) {
        if (i0Var.H) {
            this.f31539d = true;
            int i11 = i0Var.f56880b & 33554431;
            d dVar = this.f31536a;
            long[] jArr = (long[]) dVar.f34422c;
            int i12 = dVar.f34421b;
            for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
                int i14 = i13 + 2;
                long j11 = jArr[i14];
                if ((((int) j11) & 33554431) == i11) {
                    jArr[i14] = (((j11 >> 63) & 1) << 60) | j11;
                    break;
                }
            }
        }
        i();
    }

    public final void e(i0 i0Var, boolean z11) {
        long j11;
        s1 s1Var;
        int i11;
        int i12;
        int i13;
        boolean zJ = i0Var.J();
        mc mcVar = i0Var.f56892i0;
        if (zJ) {
            i0 i0VarW = i0Var.w();
            if (i0VarW == null || i0VarW.f56882c) {
                j11 = i0VarW == null ? 0L : 9223372034707292159L;
            } else {
                if (i0VarW.f56903t) {
                    i0VarW.f56903t = false;
                    i0VarW.f56888f = f(i0VarW);
                }
                j11 = i0VarW.f56888f;
            }
            k1 k1Var = (k1) mcVar.f50087e;
            if (j.c(j11, 9223372034707292159L) || !((s1Var = k1Var.f56957n0) == null || f0.t(s1Var.mo6getUnderlyingMatrixsQKQjiQ()))) {
                c(i0Var);
                return;
            }
            if (i0Var.f56882c) {
                c(i0Var);
                h(i0Var);
                return;
            }
            long jE = j.e(j11, k1Var.f56945b0);
            b1 b1Var = i0Var.f56893j0.f56974p;
            int iG0 = b1Var.g0();
            int iA0 = b1Var.a0();
            long j12 = (((long) iG0) << 32) | (((long) iA0) & 4294967295L);
            int i14 = i0Var.f56880b;
            boolean z12 = i0Var.H;
            int i15 = 33554431;
            d dVar = this.f31536a;
            if (!z12) {
                i0Var.H = true;
                boolean zG = mcVar.g(1024);
                boolean zG2 = mcVar.g(16);
                boolean zA = this.f31537b.f31546a.a(i14);
                if (i0VarW != null) {
                    int i16 = i0VarW.f56880b;
                    int i17 = (int) (jE >> 32);
                    int i18 = (int) (jE & 4294967295L);
                    char c11 = ' ';
                    int i19 = i14 & 33554431;
                    long[] jArr = (long[]) dVar.f34422c;
                    int i21 = dVar.f34421b;
                    int i22 = 0;
                    while (i22 < jArr.length - 2 && i22 < i21) {
                        char c12 = c11;
                        long[] jArr2 = jArr;
                        if ((((int) jArr2[i22 + 2]) & i15) == i16) {
                            long j13 = jArr2[i22];
                            int i23 = ((int) (j13 >> c12)) + i17;
                            int i24 = ((int) j13) + i18;
                            dVar.w(i19, i23, i24, i23 + iG0, i24 + iA0, i16, zG, zG2, zA, i22);
                            break;
                        }
                        i22 += 3;
                        c11 = c12;
                        jArr = jArr2;
                        i15 = i15;
                        i16 = i16;
                    }
                } else {
                    int i25 = (int) (jE >> 32);
                    int i26 = (int) (jE & 4294967295L);
                    dVar.w(i14, i25, i26, i25 + iG0, i26 + iA0, (512 & 32) != 0 ? -1 : 0, zG, zG2, zA, -1);
                }
                this.f31539d = true;
            } else if (z11 || !j.c(jE, i0Var.f56884d) || !l.a(j12, i0Var.f56886e)) {
                if (i0VarW != null) {
                    int i27 = i0VarW.f56880b;
                    int i28 = (int) (jE >> 32);
                    int i29 = (int) (jE & 4294967295L);
                    int i30 = i14 & 33554431;
                    long[] jArr3 = (long[]) dVar.f34422c;
                    int i31 = dVar.f34421b;
                    int i32 = 0;
                    loop0: while (i32 < jArr3.length - 2 && i32 < i31) {
                        int i33 = iG0;
                        if ((((int) jArr3[i32 + 2]) & 33554431) == i27) {
                            long j14 = jArr3[i32];
                            i12 = i28;
                            i13 = i29;
                            int i34 = ((int) (j14 >> 32)) + i12;
                            int i35 = ((int) j14) + i13;
                            int i36 = i34 + i33;
                            int i37 = i35 + iA0;
                            int i38 = i32 + 3;
                            while (i38 < jArr3.length - 2 && i38 < i31) {
                                int i39 = i38 + 2;
                                int i40 = i31;
                                long j15 = jArr3[i39];
                                int i41 = i38;
                                if ((((int) j15) & 33554431) == i30) {
                                    long j16 = jArr3[i41];
                                    int i42 = i34 - ((int) (j16 >> 32));
                                    int i43 = i35 - ((int) j16);
                                    jArr3[i41] = (((long) i34) << 32) | (((long) i35) & 4294967295L);
                                    jArr3[i41 + 1] = (((long) i36) << 32) | (((long) i37) & 4294967295L);
                                    jArr3[i39] = j15 | (((j15 >> 63) & 1) << 60);
                                    if (i42 != 0 || i43 != 0) {
                                        dVar.F((j15 & a.f31534b) | (((long) ((i41 + 3) & 33554431)) << 25), i42, i43);
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                i38 = i41 + 3;
                                i31 = i40;
                            }
                            i11 = i31;
                            i32 = i38;
                        } else {
                            i11 = i31;
                            i12 = i28;
                            i13 = i29;
                        }
                        i32 += 3;
                        iG0 = i33;
                        i28 = i12;
                        i29 = i13;
                        i27 = i27;
                        i31 = i11;
                    }
                } else {
                    int i44 = (int) (jE >> 32);
                    int i45 = (int) (jE & 4294967295L);
                    int i46 = i44 + iG0;
                    int i47 = i45 + iA0;
                    int i48 = i14 & 33554431;
                    long[] jArr4 = (long[]) dVar.f34422c;
                    int i49 = dVar.f34421b;
                    int i50 = 0;
                    while (i50 < jArr4.length - 2 && i50 < i49) {
                        int i51 = i50 + 2;
                        int i52 = i49;
                        int i53 = i50;
                        long j17 = jArr4[i51];
                        long[] jArr5 = jArr4;
                        if ((((int) j17) & 33554431) == i48) {
                            long j18 = jArr5[i53];
                            jArr5[i53] = (((long) i44) << 32) | (((long) i45) & 4294967295L);
                            jArr5[i53 + 1] = (((long) i46) << 32) | (((long) i47) & 4294967295L);
                            jArr5[i51] = j17 | (((j17 >> 63) & 1) << 60);
                            int i54 = i44 - ((int) (j18 >> 32));
                            int i55 = i45 - ((int) j18);
                            if (!(i54 != 0) && !(i55 != 0)) {
                                break;
                            }
                            dVar.F((j17 & a.f31534b) | (((long) ((i53 + 3) & 33554431)) << 25), i54, i55);
                            break;
                        }
                        i50 = i53 + 3;
                        i49 = i52;
                        jArr4 = jArr5;
                    }
                }
                this.f31539d = true;
            }
            i0Var.f56886e = j12;
            i0Var.f56884d = jE;
        }
    }

    public final void g(i0 i0Var) {
        if (i0Var.H) {
            int i11 = i0Var.f56880b & 33554431;
            d dVar = this.f31536a;
            long[] jArr = (long[]) dVar.f34422c;
            int i12 = dVar.f34421b;
            for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
                int i14 = i13 + 2;
                if ((((int) jArr[i14]) & 33554431) == i11) {
                    jArr[i13] = -1;
                    jArr[i13 + 1] = -1;
                    jArr[i14] = a.f31535c;
                    break;
                }
            }
            i0Var.H = false;
            this.f31539d = true;
            this.f31541f = true;
        }
    }

    public final void i() {
        qf qfVar = this.f31542g;
        boolean z11 = qfVar != null;
        long j11 = this.f31537b.f31547b;
        if (j11 >= 0 || !z11) {
            if (this.f31543h == j11 && z11) {
                return;
            }
            if (qfVar != null) {
                Handler handler = z1.b.f58462a;
                z1.b.f58462a.removeCallbacks(qfVar);
            }
            Handler handler2 = z1.b.f58462a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j11, ((long) 16) + jCurrentTimeMillis);
            this.f31543h = jMax;
            long j12 = jMax - jCurrentTimeMillis;
            qf qfVar2 = new qf(5, this.f31544i);
            z1.b.f58462a.postDelayed(qfVar2, j12);
            this.f31542g = qfVar2;
        }
    }
}
