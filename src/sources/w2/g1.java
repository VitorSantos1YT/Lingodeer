package w2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f54501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f54503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f54504d = i1.f54526a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f54505e = 0;

    public g1() {
        long j11 = 0;
        this.f54503c = (j11 & 4294967295L) | (j11 << 32);
    }

    public Object G() {
        return null;
    }

    public abstract int X(n nVar);

    public int a0() {
        return (int) (this.f54503c & 4294967295L);
    }

    public int g0() {
        return (int) (this.f54503c >> 32);
    }

    public final void h0() {
        this.f54501a = hz.b.l((int) (this.f54503c >> 32), v3.a.j(this.f54504d), v3.a.h(this.f54504d));
        int iL = hz.b.l((int) (this.f54503c & 4294967295L), v3.a.i(this.f54504d), v3.a.g(this.f54504d));
        this.f54502b = iL;
        int i11 = this.f54501a;
        long j11 = this.f54503c;
        this.f54505e = (((long) ((i11 - ((int) (j11 >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iL - ((int) (j11 & 4294967295L))) / 2)));
    }

    public abstract void i0(long j11, float f5, fz.c cVar);

    public final void l0(long j11) {
        if (v3.l.a(this.f54503c, j11)) {
            return;
        }
        this.f54503c = j11;
        h0();
    }

    public final void m0(long j11) {
        if (v3.a.b(this.f54504d, j11)) {
            return;
        }
        this.f54504d = j11;
        h0();
    }
}
