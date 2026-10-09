package w2;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements q1, s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f54480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f54481b;

    public e0(m0 m0Var) {
        this.f54481b = m0Var;
        this.f54480a = m0Var.H;
    }

    @Override // w2.q1
    public final List C(Object obj, fz.e eVar) {
        m0 m0Var = this.f54481b;
        y.i0 i0Var = m0Var.L;
        y.i0 i0Var2 = m0Var.N;
        y2.i0 i0Var3 = m0Var.f54542a;
        y.i0 i0Var4 = m0Var.f54548t;
        y2.i0 i0Var5 = (y2.i0) i0Var4.g(obj);
        if (i0Var5 != null && ((n1.e) ((n1.b) i0Var3.p()).f43104b).j(i0Var5) < m0Var.f54545d) {
            return i0Var5.n();
        }
        n1.e eVar2 = m0Var.O;
        if (eVar2.f43114c < m0Var.f54546e) {
            v2.a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        y2.i0 i0Var6 = (y2.i0) i0Var4.g(obj);
        int i11 = eVar2.f43114c;
        int i12 = m0Var.f54546e;
        if (i11 == i12) {
            eVar2.c(obj);
        } else {
            Object[] objArr = eVar2.f43112a;
            Object obj2 = objArr[i12];
            objArr[i12] = obj;
        }
        m0Var.f54546e++;
        boolean zB = i0Var.b(obj);
        if (zB || i0Var6 != null) {
            if (!zB && i0Var6 != null) {
                m0Var.i(((n1.e) ((n1.b) i0Var3.p()).f43104b).j(i0Var6), ((n1.e) ((n1.b) i0Var3.p()).f43104b).f43114c);
                m0Var.Q++;
                i0Var4.k(obj);
                i0Var.m(obj, i0Var6);
                i0Var2.m(obj, m0Var.e(obj));
                if (i0Var3.I()) {
                    m0Var.g();
                }
            }
            y2.i0 i0Var7 = (y2.i0) i0Var.g(obj);
            f0 f0Var = i0Var7 != null ? (f0) m0Var.f54547f.g(i0Var7) : null;
            if (f0Var != null && f0Var.f54487d) {
                m0Var.l(i0Var7, obj, false, eVar);
            }
            if ((f0Var != null ? f0Var.f54489f : null) != null) {
                m0Var.c(f0Var, true);
            }
        } else {
            if (i0Var3.I()) {
                m0Var.g();
                if (!i0Var4.c(obj)) {
                    i0Var2.k(obj);
                    Object objG = i0Var.g(obj);
                    if (objG == null) {
                        objG = m0Var.m(obj);
                        if (objG != null) {
                            m0Var.i(((n1.e) ((n1.b) i0Var3.p()).f43104b).j(objG), ((n1.e) ((n1.b) i0Var3.p()).f43104b).f43114c);
                            m0Var.Q++;
                        } else {
                            int i13 = ((n1.e) ((n1.b) i0Var3.p()).f43104b).f43114c;
                            y2.i0 i0Var8 = new y2.i0(2);
                            i0Var3.T = true;
                            i0Var3.C(i13, i0Var8);
                            i0Var3.T = false;
                            m0Var.Q++;
                            objG = i0Var8;
                        }
                        i0Var.m(obj, objG);
                    }
                    m0Var.l((y2.i0) objG, obj, false, eVar);
                }
            }
            i0Var2.m(obj, m0Var.e(obj));
        }
        y2.i0 i0Var9 = (y2.i0) i0Var.g(obj);
        if (i0Var9 == null) {
            return ry.r.f50854a;
        }
        List listS0 = i0Var9.f56893j0.f56974p.s0();
        n1.b bVar = (n1.b) listS0;
        int i14 = ((n1.e) bVar.f43104b).f43114c;
        for (int i15 = 0; i15 < i14; i15++) {
            ((y2.b1) bVar.get(i15)).f56832f.f56961b = true;
        }
        return listS0;
    }

    @Override // v3.c
    public final long I(int i11) {
        return this.f54480a.I(i11);
    }

    @Override // v3.c
    public final long K(float f5) {
        return this.f54480a.K(f5);
    }

    @Override // w2.s0
    public final r0 O(int i11, int i12, Map map, fz.c cVar, fz.c cVar2) {
        return this.f54480a.O(i11, i12, map, cVar, cVar2);
    }

    @Override // v3.c
    public final float Q(int i11) {
        return this.f54480a.Q(i11);
    }

    @Override // v3.c
    public final float T(float f5) {
        return f5 / this.f54480a.getDensity();
    }

    @Override // v3.c
    public final float Z() {
        return this.f54480a.f54509c;
    }

    @Override // w2.s
    public final boolean c0() {
        return this.f54480a.c0();
    }

    @Override // v3.c
    public final float e0(float f5) {
        return this.f54480a.getDensity() * f5;
    }

    @Override // v3.c
    public final float getDensity() {
        return this.f54480a.f54508b;
    }

    @Override // w2.s
    public final v3.m getLayoutDirection() {
        return this.f54480a.f54507a;
    }

    @Override // v3.c
    public final int k0(long j11) {
        return this.f54480a.k0(j11);
    }

    @Override // v3.c
    public final long n(float f5) {
        return this.f54480a.n(f5);
    }

    @Override // v3.c
    public final int n0(float f5) {
        return this.f54480a.n0(f5);
    }

    @Override // v3.c
    public final long o(long j11) {
        return this.f54480a.o(j11);
    }

    @Override // w2.s0
    public final r0 q0(int i11, int i12, Map map, fz.c cVar) {
        return this.f54480a.O(i11, i12, map, null, cVar);
    }

    @Override // v3.c
    public final long v0(long j11) {
        return this.f54480a.v0(j11);
    }

    @Override // v3.c
    public final float w(long j11) {
        return this.f54480a.w(j11);
    }

    @Override // v3.c
    public final float y0(long j11) {
        return this.f54480a.y0(j11);
    }
}
