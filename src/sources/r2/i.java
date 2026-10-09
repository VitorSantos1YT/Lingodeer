package r2;

import a0.c0;
import kotlin.jvm.internal.y;
import rz.b0;
import rz.e0;
import y2.g2;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends q implements g2, a {
    public a Q;
    public d R;
    public i S;
    public final String T;

    public i(a aVar, d dVar) {
        this.Q = aVar;
        this.R = dVar == null ? new d() : dVar;
        this.T = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // r2.a
    public final Object D(long j11, long j12, vy.d dVar) {
        g gVar;
        long j13;
        long j14;
        long j15;
        i iVar;
        long j16;
        long j17;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i11 = gVar.f48759e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f48759e = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, (xy.c) dVar);
            }
        } else {
            gVar = new g(this, (xy.c) dVar);
        }
        g gVar2 = gVar;
        Object objD = gVar2.f48757c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = gVar2.f48759e;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objD);
            a aVar2 = this.Q;
            gVar2.f48755a = j11;
            gVar2.f48756b = j12;
            gVar2.f48759e = 1;
            objD = aVar2.D(j11, j12, gVar2);
            if (objD != aVar) {
                j13 = j11;
                j14 = j12;
            }
            return aVar;
        }
        if (i12 == 1) {
            j14 = gVar2.f48756b;
            j13 = gVar2.f48755a;
            com.bumptech.glide.e.F(objD);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j17 = gVar2.f48755a;
            com.bumptech.glide.e.F(objD);
        }
        j16 = ((v3.q) objD).f53504a;
        j15 = j17;
        return new v3.q(v3.q.e(j15, j16));
        j15 = ((v3.q) objD).f53504a;
        boolean z11 = this.P;
        if (z11) {
            iVar = null;
            if (z11 && z11) {
                iVar = (i) y2.f.j(this);
            }
        } else {
            iVar = this.S;
        }
        if (iVar != null) {
            long jE = v3.q.e(j13, j15);
            long jD = v3.q.d(j14, j15);
            gVar2.f48755a = j15;
            gVar2.f48759e = 2;
            objD = iVar.D(jE, jD, gVar2);
            if (objD != aVar) {
                j17 = j15;
                j16 = ((v3.q) objD).f53504a;
                j15 = j17;
            }
            return aVar;
        }
        j16 = 0;
        return new v3.q(v3.q.e(j15, j16));
    }

    @Override // z1.q
    public final void L0() {
        d dVar = this.R;
        dVar.f48749a = this;
        dVar.f48750b = null;
        this.S = null;
        dVar.f48751c = new c0(this, 27);
        dVar.f48752d = H0();
    }

    @Override // r2.a
    public final long M(int i11, long j11) {
        boolean z11 = this.P;
        i iVar = null;
        if (z11 && z11) {
            iVar = (i) y2.f.j(this);
        }
        long jM = iVar != null ? iVar.M(i11, j11) : 0L;
        return f2.b.h(jM, this.Q.M(i11, f2.b.g(j11, jM)));
    }

    @Override // z1.q
    public final void M0() {
        y yVar = new y();
        y2.f.B(this, new j(yVar, 0));
        i iVar = (i) ((g2) yVar.f38361a);
        this.S = iVar;
        d dVar = this.R;
        dVar.f48750b = iVar;
        if (dVar.f48749a == this) {
            dVar.f48749a = null;
        }
    }

    public final b0 T0() {
        i iVar = this.P ? (i) y2.f.j(this) : null;
        b0 b0VarT0 = iVar != null ? iVar.T0() : null;
        if (b0VarT0 != null && e0.w(b0VarT0)) {
            return b0VarT0;
        }
        b0 b0Var = this.R.f48752d;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r11 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (r11 == r1) goto L29;
     */
    @Override // r2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W(long r9, vy.d r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof r2.h
            if (r0 == 0) goto L13
            r0 = r11
            r2.h r0 = (r2.h) r0
            int r1 = r0.f48763d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48763d = r1
            goto L1a
        L13:
            r2.h r0 = new r2.h
            xy.c r11 = (xy.c) r11
            r0.<init>(r8, r11)
        L1a:
            java.lang.Object r11 = r0.f48761b
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f48763d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r9 = r0.f48760a
            com.bumptech.glide.e.F(r11)
            goto L76
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            long r9 = r0.f48760a
            com.bumptech.glide.e.F(r11)
            goto L5a
        L3c:
            com.bumptech.glide.e.F(r11)
            boolean r11 = r8.P
            r2 = 0
            if (r11 == 0) goto L4d
            if (r11 == 0) goto L4d
            y2.g2 r11 = y2.f.j(r8)
            r2 = r11
            r2.i r2 = (r2.i) r2
        L4d:
            if (r2 == 0) goto L62
            r0.f48760a = r9
            r0.f48763d = r4
            java.lang.Object r11 = r2.W(r9, r0)
            if (r11 != r1) goto L5a
            goto L75
        L5a:
            v3.q r11 = (v3.q) r11
            long r4 = r11.f53504a
        L5e:
            r6 = r4
            r4 = r9
            r9 = r6
            goto L65
        L62:
            r4 = 0
            goto L5e
        L65:
            r2.a r11 = r8.Q
            long r4 = v3.q.d(r4, r9)
            r0.f48760a = r9
            r0.f48763d = r3
            java.lang.Object r11 = r11.W(r4, r0)
            if (r11 != r1) goto L76
        L75:
            return r1
        L76:
            v3.q r11 = (v3.q) r11
            long r0 = r11.f53504a
            long r9 = v3.q.e(r9, r0)
            v3.q r11 = new v3.q
            r11.<init>(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.i.W(long, vy.d):java.lang.Object");
    }

    @Override // y2.g2
    public final Object h() {
        return this.T;
    }

    @Override // r2.a
    public final long x(long j11, int i11, long j12) {
        long jX = this.Q.x(j11, i11, j12);
        boolean z11 = this.P;
        i iVar = null;
        if (z11 && z11) {
            iVar = (i) y2.f.j(this);
        }
        i iVar2 = iVar;
        return f2.b.h(jX, iVar2 != null ? iVar2.x(f2.b.h(j11, jX), i11, f2.b.g(j12, jX)) : 0L);
    }
}
