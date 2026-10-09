package y2;

import java.util.Map;
import pt.ImS.aYZzTH;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 extends w2.g1 implements e1, w2.s0 {
    public x1 H;
    public boolean K;
    public boolean L;
    public boolean M;
    public final w2.n0 N = new w2.n0(this, 0);
    public b7.c O;
    public y.i0 P;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n0 f56996f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public fz.c f56997t;

    public static void O0(k1 k1Var) {
        j0 j0Var;
        k1 k1Var2 = k1Var.R;
        i0 i0Var = k1Var.Q;
        if (!kotlin.jvm.internal.m.a(k1Var2 != null ? k1Var2.Q : null, i0Var)) {
            i0Var.f56893j0.f56974p.Z.f();
            return;
        }
        a aVarI = i0Var.f56893j0.f56974p.i();
        if (aVarI == null || (j0Var = ((b1) aVarI).Z) == null) {
            return;
        }
        j0Var.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C0(x1 x1Var, long j11, long j12) {
        boolean z11;
        char c11;
        long j13;
        long j14;
        long j15;
        i0 i0Var;
        boolean z12;
        int i11;
        char c12;
        long j16;
        v1 snapshotObserver;
        y.i0 i0Var2 = this.P;
        b7.c cVar = this.O;
        if (cVar == null) {
            cVar = new b7.c();
            this.O = cVar;
        }
        b7.c cVar2 = cVar;
        t1 t1Var = J0().Q;
        if (t1Var != null && (snapshotObserver = t1Var.getSnapshotObserver()) != null) {
            snapshotObserver.f57019a.d(x1Var, e.f56846d, new o0(this, j11, j12, x1Var));
        }
        boolean zC0 = c0();
        y.j0 j0Var = (y.j0) cVar2.f3962e;
        y.j0 j0Var2 = (y.j0) cVar2.f3963f;
        int i12 = cVar2.f3958a;
        for (int i13 = 0; i13 < i12; i13++) {
            byte b3 = ((byte[]) cVar2.f3961d)[i13];
            if (b3 == 3) {
                w2.p pVar = ((w2.p[]) cVar2.f3959b)[i13];
                kotlin.jvm.internal.m.c(pVar);
                j0Var2.j(pVar);
            } else if (b3 != 0 && i0Var2 != null) {
                w2.p pVar2 = ((w2.p[]) cVar2.f3959b)[i13];
                kotlin.jvm.internal.m.c(pVar2);
                y.j0 j0Var3 = (y.j0) i0Var2.k(pVar2);
                if (j0Var3 != null) {
                    j0Var.k(j0Var3);
                }
            }
        }
        int i14 = cVar2.f3958a;
        int i15 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            byte[] bArr = (byte[]) cVar2.f3961d;
            if (bArr[i16] == 2) {
                i15++;
            } else if (i15 > 0) {
                w2.p[] pVarArr = (w2.p[]) cVar2.f3959b;
                pVarArr[i16 - i15] = pVarArr[i16];
            }
            bArr[i16] = 2;
        }
        int i17 = cVar2.f3958a;
        for (int i18 = i17 - i15; i18 < i17; i18++) {
            ((w2.p[]) cVar2.f3959b)[i18] = null;
        }
        cVar2.f3958a -= i15;
        q0 q0VarL0 = L0();
        Object[] objArr = j0Var2.f56721b;
        long[] jArr = j0Var2.f56720a;
        int length = jArr.length - 2;
        char c13 = 7;
        long j17 = -9187201950435737472L;
        int i19 = 8;
        if (length >= 0) {
            j14 = 128;
            int i21 = 0;
            while (true) {
                long j18 = jArr[i21];
                j15 = 255;
                if ((((~j18) << c13) & j18 & j17) != j17) {
                    int i22 = 8 - ((~(i21 - length)) >>> 31);
                    int i23 = 0;
                    while (i23 < i22) {
                        if ((j18 & 255) < 128) {
                            c12 = c13;
                            w2.p pVar3 = (w2.p) objArr[(i21 << 3) + i23];
                            j16 = j17;
                            q0 q0Var = q0VarL0 == null ? this : q0VarL0;
                            i11 = i19;
                            q0 q0Var2 = q0Var;
                            while (true) {
                                b7.c cVar3 = q0Var2.O;
                                if (cVar3 != null) {
                                    z12 = zC0;
                                    if (ry.l.D((w2.p[]) cVar3.f3959b, pVar3)) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                z12 = zC0;
                                q0 q0VarL1 = q0Var2.L0();
                                if (q0VarL1 == null) {
                                    break;
                                }
                                q0Var2 = q0VarL1;
                                zC0 = z12;
                            }
                            y.i0 i0Var3 = q0Var2.P;
                            y.j0 j0Var4 = i0Var3 != null ? (y.j0) i0Var3.k(pVar3) : null;
                            if (j0Var4 != null) {
                                q0Var.P0(j0Var4);
                            }
                        } else {
                            z12 = zC0;
                            i11 = i19;
                            c12 = c13;
                            j16 = j17;
                        }
                        j18 >>= i11;
                        i23++;
                        c13 = c12;
                        j17 = j16;
                        i19 = i11;
                        zC0 = z12;
                    }
                    z11 = zC0;
                    c11 = c13;
                    j13 = j17;
                    if (i22 != i19) {
                        break;
                    }
                } else {
                    z11 = zC0;
                    c11 = c13;
                    j13 = j17;
                }
                if (i21 == length) {
                    break;
                }
                i21++;
                c13 = c11;
                j17 = j13;
                zC0 = z11;
                i19 = 8;
            }
        } else {
            z11 = zC0;
            c11 = 7;
            j13 = -9187201950435737472L;
            j14 = 128;
            j15 = 255;
        }
        j0Var2.b();
        Object[] objArr2 = j0Var.f56721b;
        long[] jArr2 = j0Var.f56720a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i24 = 0;
            while (true) {
                long j19 = jArr2[i24];
                if ((((~j19) << c11) & j19 & j13) != j13) {
                    int i25 = 8 - ((~(i24 - length2)) >>> 31);
                    for (int i26 = 0; i26 < i25; i26++) {
                        if ((j19 & j15) < j14 && (i0Var = (i0) ((i2) objArr2[(i24 << 3) + i26]).get()) != null) {
                            if (z11) {
                                i0Var.V(false);
                            } else {
                                i0Var.X(false);
                            }
                        }
                        j19 >>= 8;
                    }
                    if (i25 != 8) {
                        break;
                    }
                }
                if (i24 == length2) {
                    break;
                } else {
                    i24++;
                }
            }
        }
        j0Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0053 A[LOOP:0: B:11:0x001c->B:21:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0056 A[EDGE_INSN: B:48:0x0056->B:22:0x0056 BREAK  A[LOOP:0: B:11:0x001c->B:21:0x0053], SYNTHETIC] */
    public final void F0(w2.r0 r0Var) {
        long j11;
        long j12;
        y.i0 i0Var = this.P;
        if (!this.M) {
            fz.c cVarC = r0Var.c();
            if (cVarC != null) {
                boolean z11 = this.f56997t != cVarC;
                if (z11 || !N0().f56976a) {
                    j11 = 0;
                    j12 = 9223372034707292159L;
                } else {
                    w2.x xVarH0 = H0();
                    long jB = ew.a.B(xVarH0.x(0L));
                    long jM = xVarH0.m();
                    j12 = jB;
                    j11 = jM;
                    z11 = (v3.j.c(jB, N0().f56977b) && v3.l.a(jM, N0().f56978c)) ? false : true;
                }
                if (z11) {
                    x1 x1Var = this.H;
                    if (x1Var != null) {
                        x1Var.f57038a = r0Var;
                    } else {
                        x1Var = new x1(r0Var, this);
                        this.H = x1Var;
                    }
                    C0(x1Var, j12, j11);
                    this.f56997t = r0Var.c();
                }
            } else if (i0Var != null) {
                Object[] objArr = i0Var.f56715c;
                long[] jArr = i0Var.f56713a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j13 = jArr[i11];
                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i11 != length) {
                                break;
                                break;
                            }
                            i11++;
                        } else {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((255 & j13) < 128) {
                                    P0((y.j0) objArr[(i11 << 3) + i13]);
                                }
                                j13 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            } else if (i11 != length) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                i0Var.a();
            }
        }
    }

    public abstract q0 G0();

    public abstract w2.x H0();

    public abstract boolean I0();

    @Override // y2.e1
    public final void J(boolean z11) {
        q0 q0VarL0 = L0();
        i0 i0VarJ0 = q0VarL0 != null ? q0VarL0.J0() : null;
        if (kotlin.jvm.internal.m.a(i0VarJ0, J0())) {
            this.K = z11;
            return;
        }
        if ((i0VarJ0 != null ? i0VarJ0.f56893j0.f56963d : null) != e0.LayingOut) {
            if ((i0VarJ0 != null ? i0VarJ0.f56893j0.f56963d : null) != e0.LookaheadLayingOut) {
                return;
            }
        }
        this.K = z11;
    }

    public abstract i0 J0();

    public abstract w2.r0 K0();

    public abstract q0 L0();

    public abstract long M0();

    public final n0 N0() {
        n0 n0Var = this.f56996f;
        if (n0Var != null) {
            return n0Var;
        }
        n0 n0Var2 = new n0(this);
        this.f56996f = n0Var2;
        return n0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P0(y.j0 j0Var) {
        i0 i0Var;
        Object[] objArr = j0Var.f56721b;
        long[] jArr = j0Var.f56720a;
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
                    if ((255 & j11) < 128 && (i0Var = (i0) ((i2) objArr[(i11 << 3) + i13]).get()) != null) {
                        if (c0()) {
                            i0Var.V(false);
                        } else {
                            i0Var.X(false);
                        }
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

    public abstract void Q0();

    @Override // w2.g1
    public final int X(w2.n nVar) {
        int iX0;
        if (I0() && (iX0 = x0(nVar)) != Integer.MIN_VALUE) {
            return iX0 + ((int) (this.f54505e & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    @Override // w2.s
    public boolean c0() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void s0(i0 i0Var, w2.p pVar) {
        char c11;
        long j11;
        long j12;
        long j13;
        long[] jArr;
        long[] jArr2;
        long j14;
        int i11;
        char c12;
        long j15;
        long j16;
        int i12;
        int i13;
        int i14;
        y.i0 i0Var2 = this.P;
        char c13 = 7;
        long j17 = -9187201950435737472L;
        int i15 = 8;
        if (i0Var2 != null) {
            Object[] objArr = i0Var2.f56715c;
            long[] jArr3 = i0Var2.f56713a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i16 = 0;
                long j18 = 128;
                while (true) {
                    long j19 = jArr3[i16];
                    j12 = 255;
                    if ((((~j19) << c13) & j19 & j17) != j17) {
                        int i17 = 8 - ((~(i16 - length)) >>> 31);
                        int i18 = 0;
                        while (i18 < i17) {
                            if ((j19 & 255) < j18) {
                                c12 = c13;
                                y.j0 j0Var = (y.j0) objArr[(i16 << 3) + i18];
                                j15 = j17;
                                Object[] objArr2 = j0Var.f56721b;
                                long[] jArr4 = j0Var.f56720a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j16 = j18;
                                    int i19 = 0;
                                    int i21 = i15;
                                    while (true) {
                                        int i22 = length2;
                                        long j21 = jArr4[i19];
                                        jArr2 = jArr3;
                                        j14 = j19;
                                        if ((((~j21) << c12) & j21 & j15) != j15) {
                                            int i23 = 8 - ((~(i19 - i22)) >>> 31);
                                            int i24 = 0;
                                            while (i24 < i23) {
                                                if ((j21 & 255) < j16) {
                                                    int i25 = (i19 << 3) + i24;
                                                    i0 i0Var3 = (i0) ((i2) objArr2[i25]).get();
                                                    i13 = i24;
                                                    if (i0Var3 != null) {
                                                        boolean zI = i0Var3.I();
                                                        i14 = i18;
                                                        if (zI) {
                                                        }
                                                    } else {
                                                        i14 = i18;
                                                    }
                                                    j0Var.m(i25);
                                                } else {
                                                    i13 = i24;
                                                    i14 = i18;
                                                }
                                                j21 >>= i21;
                                                i24 = i13 + 1;
                                                i18 = i14;
                                            }
                                            i11 = i18;
                                            if (i23 != i21) {
                                                break;
                                            }
                                        } else {
                                            i11 = i18;
                                        }
                                        length2 = i22;
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        jArr3 = jArr2;
                                        j19 = j14;
                                        i18 = i11;
                                        i21 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j14 = j19;
                                    i11 = i18;
                                    j16 = j18;
                                }
                                i12 = 8;
                            } else {
                                jArr2 = jArr3;
                                j14 = j19;
                                i11 = i18;
                                c12 = c13;
                                j15 = j17;
                                j16 = j18;
                                i12 = i15;
                            }
                            i15 = i12;
                            j19 = j14 >> i12;
                            c13 = c12;
                            j17 = j15;
                            j18 = j16;
                            i18 = i11 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c11 = c13;
                        j11 = j17;
                        j13 = j18;
                        if (i17 != i15) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c11 = c13;
                        j11 = j17;
                        j13 = j18;
                    }
                    if (i16 == length) {
                        break;
                    }
                    i16++;
                    c13 = c11;
                    j17 = j11;
                    j18 = j13;
                    jArr3 = jArr;
                    i15 = 8;
                }
            } else {
                c11 = 7;
                j11 = -9187201950435737472L;
                j12 = 255;
                j13 = 128;
            }
        } else {
            c11 = 7;
            j11 = -9187201950435737472L;
            j12 = 255;
            j13 = 128;
        }
        y.i0 i0Var4 = this.P;
        if (i0Var4 != null) {
            long[] jArr5 = i0Var4.f56713a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i26 = 0;
                while (true) {
                    long j22 = jArr5[i26];
                    if ((((~j22) << c11) & j22 & j11) != j11) {
                        int i27 = 8 - ((~(i26 - length3)) >>> 31);
                        for (int i28 = 0; i28 < i27; i28++) {
                            if ((j22 & j12) < j13) {
                                int i29 = (i26 << 3) + i28;
                                if (((y.j0) i0Var4.f56715c[i29]).g()) {
                                    i0Var4.l(i29);
                                }
                            }
                            j22 >>= 8;
                        }
                        if (i27 != 8) {
                            break;
                        }
                    }
                    if (i26 == length3) {
                        break;
                    } else {
                        i26++;
                    }
                }
            }
        }
        y.i0 i0Var5 = this.P;
        if (i0Var5 == null) {
            i0Var5 = new y.i0();
            this.P = i0Var5;
        }
        Object objG = i0Var5.g(pVar);
        if (objG == null) {
            objG = new y.j0();
            i0Var5.m(pVar, objG);
        }
        ((y.j0) objG).j(new i2(i0Var));
    }

    public abstract int x0(w2.n nVar);

    @Override // w2.s0
    public final w2.r0 O(int i11, int i12, Map map, fz.c cVar, fz.c cVar2) {
        if ((i11 & (-16777216)) != 0 || ((-16777216) & i12) != 0) {
            v2.a.b("Size(" + i11 + aYZzTH.iiIATkoab + i12 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new p0(i11, i12, map, cVar, cVar2, this);
    }
}
