package p7;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements s7.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s7.s f46398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y6.p0 f46399b;

    public i0(s7.s sVar, y6.p0 p0Var) {
        this.f46398a = sVar;
        this.f46399b = p0Var;
    }

    @Override // s7.s
    public final boolean a(int i11, long j11) {
        return this.f46398a.a(i11, j11);
    }

    @Override // s7.s
    public final y6.p0 b() {
        return this.f46399b;
    }

    @Override // s7.s
    public final int c() {
        return this.f46398a.c();
    }

    @Override // s7.s
    public final int d(y6.p pVar) {
        int i11 = 0;
        while (true) {
            y6.p[] pVarArr = this.f46399b.f57307d;
            if (i11 >= pVarArr.length) {
                i11 = -1;
                break;
            }
            if (pVar == pVarArr[i11]) {
                break;
            }
            i11++;
        }
        return this.f46398a.u(i11);
    }

    @Override // s7.s
    public final void e(boolean z11) {
        this.f46398a.e(z11);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof i0)) {
            return this.f46399b.equals(((i0) obj).f46399b);
        }
        return false;
    }

    @Override // s7.s
    public final y6.p f(int i11) {
        return this.f46399b.f57307d[this.f46398a.h(i11)];
    }

    @Override // s7.s
    public final void g() {
        this.f46398a.g();
    }

    @Override // s7.s
    public final int h(int i11) {
        return this.f46398a.h(i11);
    }

    public final int hashCode() {
        return this.f46399b.hashCode() + (this.f46398a.hashCode() * 31);
    }

    @Override // s7.s
    public final void i(long j11, long j12, long j13, List list, q7.j[] jVarArr) {
        this.f46398a.i(j11, j12, j13, list, jVarArr);
    }

    @Override // s7.s
    public final int j(long j11, List list) {
        return this.f46398a.j(j11, list);
    }

    @Override // s7.s
    public final void k() {
        this.f46398a.k();
    }

    @Override // s7.s
    public final int l() {
        return this.f46398a.l();
    }

    @Override // s7.s
    public final int length() {
        return this.f46398a.length();
    }

    @Override // s7.s
    public final y6.p m() {
        return this.f46399b.f57307d[this.f46398a.l()];
    }

    @Override // s7.s
    public final int n() {
        return this.f46398a.n();
    }

    @Override // s7.s
    public final boolean o(int i11, long j11) {
        return this.f46398a.o(i11, j11);
    }

    @Override // s7.s
    public final void p(float f5) {
        this.f46398a.p(f5);
    }

    @Override // s7.s
    public final Object q() {
        return this.f46398a.q();
    }

    @Override // s7.s
    public final void r() {
        this.f46398a.r();
    }

    @Override // s7.s
    public final boolean s(long j11, q7.d dVar, List list) {
        return this.f46398a.s(j11, dVar, list);
    }

    @Override // s7.s
    public final void t() {
        this.f46398a.t();
    }

    @Override // s7.s
    public final int u(int i11) {
        return this.f46398a.u(i11);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            return this.f46398a.equals(((i0) obj).f46398a);
        }
        return false;
    }
}
