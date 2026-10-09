package d0;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends f {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final y.a0 f22695m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final y.a0 f22696n0;

    public f0(fz.a aVar, h0.i iVar) {
        super(iVar, null, false, true, null, null, aVar);
        int i11 = y.p.f56747a;
        this.f22695m0 = new y.a0(6);
        this.f22696n0 = new y.a0(6);
    }

    @Override // z1.q
    public final void N0() {
        g1();
    }

    @Override // d0.f
    public final s2.m0 X0() {
        a1.d dVar = new a1.d(this, 3);
        s2.l lVar = s2.g0.f51302a;
        return new s2.m0(null, null, null, dVar);
    }

    @Override // d0.f
    public final void c1() {
        g1();
    }

    @Override // d0.f
    public final boolean d1(KeyEvent keyEvent) {
        return false;
    }

    @Override // d0.f
    public final void e1(KeyEvent keyEvent) {
        long jB = q2.c.b(keyEvent);
        y.a0 a0Var = this.f22695m0;
        boolean z11 = false;
        if (a0Var.d(jB) != null) {
            rz.g1 g1Var = (rz.g1) a0Var.d(jB);
            if (g1Var != null) {
                if (g1Var.isActive()) {
                    g1Var.cancel(null);
                } else {
                    z11 = true;
                }
            }
            a0Var.f(jB);
        }
        if (z11) {
            return;
        }
        this.Y.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00af A[LOOP:2: B:24:0x007f->B:35:0x00af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2 A[EDGE_INSN: B:44:0x00b2->B:36:0x00b2 BREAK  A[LOOP:2: B:24:0x007f->B:35:0x00af], SYNTHETIC] */
    public final void g1() {
        char c11;
        long j11;
        long j12;
        long j13;
        y.a0 a0Var = this.f22695m0;
        Object[] objArr = a0Var.f56656c;
        long[] jArr = a0Var.f56654a;
        int length = jArr.length - 2;
        char c12 = 7;
        long j14 = -9187201950435737472L;
        if (length >= 0) {
            int i11 = 0;
            j12 = 128;
            while (true) {
                long j15 = jArr[i11];
                j13 = 255;
                if ((((~j15) << c12) & j15 & j14) != j14) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j15 & 255) < 128) {
                            ((rz.g1) objArr[(i11 << 3) + i13]).cancel(null);
                        }
                        j15 >>= 8;
                        i13++;
                        c12 = c12;
                        j14 = j14;
                    }
                    c11 = c12;
                    j11 = j14;
                    if (i12 != 8) {
                        break;
                    }
                } else {
                    c11 = c12;
                    j11 = j14;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                c12 = c11;
                j14 = j11;
            }
        } else {
            c11 = 7;
            j11 = -9187201950435737472L;
            j12 = 128;
            j13 = 255;
        }
        a0Var.a();
        y.a0 a0Var2 = this.f22696n0;
        Object[] objArr2 = a0Var2.f56656c;
        long[] jArr2 = a0Var2.f56654a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i14 = 0;
            while (true) {
                long j16 = jArr2[i14];
                if ((((~j16) << c11) & j16 & j11) == j11) {
                    if (i14 != length2) {
                        break;
                        break;
                    }
                    i14++;
                } else {
                    int i15 = 8 - ((~(i14 - length2)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((j16 & j13) < j12) {
                            ((d0) objArr2[(i14 << 3) + i16]).getClass();
                            throw null;
                        }
                        j16 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    } else if (i14 != length2) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
        }
        a0Var2.a();
    }

    @Override // d0.f
    public final void W0(g3.b0 b0Var) {
    }
}
