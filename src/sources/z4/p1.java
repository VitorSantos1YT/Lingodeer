package z4;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class p1 extends o1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public r4.d f58879o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r4.d f58880p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public r4.d f58881q;

    public p1(v1 v1Var, WindowInsets windowInsets) {
        super(v1Var, windowInsets);
        this.f58879o = null;
        this.f58880p = null;
        this.f58881q = null;
    }

    @Override // z4.s1
    public r4.d i() {
        if (this.f58880p == null) {
            this.f58880p = r4.d.d(this.f58867c.getMandatorySystemGestureInsets());
        }
        return this.f58880p;
    }

    @Override // z4.s1
    public r4.d k() {
        if (this.f58879o == null) {
            this.f58879o = r4.d.d(this.f58867c.getSystemGestureInsets());
        }
        return this.f58879o;
    }

    @Override // z4.s1
    public r4.d m() {
        if (this.f58881q == null) {
            this.f58881q = r4.d.d(this.f58867c.getTappableElementInsets());
        }
        return this.f58881q;
    }

    @Override // z4.m1, z4.s1
    public v1 n(int i11, int i12, int i13, int i14) {
        return v1.h(null, this.f58867c.inset(i11, i12, i13, i14));
    }

    public p1(v1 v1Var, p1 p1Var) {
        super(v1Var, p1Var);
        this.f58879o = null;
        this.f58880p = null;
        this.f58881q = null;
    }

    @Override // z4.n1, z4.s1
    public void u(r4.d dVar) {
    }
}
