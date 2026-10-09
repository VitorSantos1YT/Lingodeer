package x1;

import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f55669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f55670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f55671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55672d;

    public f(long j11, j jVar) {
        int iA;
        int iNumberOfTrailingZeros;
        this.f55669a = jVar;
        this.f55670b = j11;
        vr.a aVar = l.f55689a;
        if (j11 != 0) {
            j jVarD = d();
            long j12 = jVarD.f55684c;
            long[] jArr = jVarD.f55685d;
            if (jArr != null) {
                j11 = jArr[0];
            } else {
                long j13 = jVarD.f55683b;
                if (j13 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j13);
                } else {
                    long j14 = jVarD.f55682a;
                    if (j14 != 0) {
                        j12 += (long) 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j14);
                    }
                }
                j11 = ((long) iNumberOfTrailingZeros) + j12;
            }
            synchronized (l.f55691c) {
                iA = l.f55694f.a(j11);
            }
        } else {
            iA = -1;
        }
        this.f55672d = iA;
    }

    public static void q(f fVar) {
        l.f55690b.m(fVar);
    }

    public final void a() {
        synchronized (l.f55691c) {
            b();
            p();
        }
    }

    public void b() {
        l.f55692d = l.f55692d.d(g());
    }

    public abstract void c();

    public j d() {
        return this.f55669a;
    }

    public abstract fz.c e();

    public abstract boolean f();

    public long g() {
        return this.f55670b;
    }

    public int h() {
        return 0;
    }

    public abstract fz.c i();

    public final f j() {
        m4 m4Var = l.f55690b;
        f fVar = (f) m4Var.e();
        m4Var.m(this);
        return fVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(y yVar);

    public final void o() {
        int i11 = this.f55672d;
        if (i11 >= 0) {
            l.u(i11);
            this.f55672d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(j jVar) {
        this.f55669a = jVar;
    }

    public void s(long j11) {
        this.f55670b = j11;
    }

    public void t(int i11) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract f u(fz.c cVar);
}
