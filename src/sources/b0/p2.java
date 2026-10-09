package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 implements l2, s8.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3639d;

    public p2(long j11, int i11) {
        b7.a.j(((t7.a) this.f3638c) == null);
        this.f3636a = j11;
        this.f3637b = j11 + ((long) i11);
    }

    public long a(long j11) {
        long j12 = this.f3637b;
        if (j11 + j12 <= 0) {
            return 0L;
        }
        long j13 = j11 + j12;
        long j14 = this.f3636a;
        long j15 = j13 / j14;
        return (((u0) this.f3639d) == u0.Restart || j15 % ((long) 2) == 0) ? j13 - (j15 * j14) : ((j15 + 1) * j14) - j13;
    }

    public s b(long j11, s sVar, s sVar2, s sVar3) {
        long j12 = this.f3637b;
        long j13 = j11 + j12;
        long j14 = this.f3636a;
        return j13 > j14 ? ((n2) this.f3638c).m(j14 - j12, sVar, sVar3, sVar2) : sVar2;
    }

    @Override // b0.l2
    public boolean c() {
        return true;
    }

    @Override // b0.l2
    public long e(s sVar, s sVar2, s sVar3) {
        return Long.MAX_VALUE;
    }

    @Override // s8.g
    public long f(x7.n nVar) {
        long j11 = this.f3637b;
        if (j11 < 0) {
            return -1L;
        }
        long j12 = -(j11 + 2);
        this.f3637b = -1L;
        return j12;
    }

    @Override // s8.g
    public x7.y h() {
        b7.a.j(this.f3636a != -1);
        return new x7.q((x7.r) this.f3638c, this.f3636a, 0);
    }

    @Override // b0.l2
    public s i(long j11, s sVar, s sVar2, s sVar3) {
        return ((n2) this.f3638c).i(a(j11), sVar, sVar2, b(j11, sVar, sVar3, sVar2));
    }

    @Override // s8.g
    public void k(long j11) {
        long[] jArr = (long[]) ((qp.b) this.f3639d).f47832b;
        this.f3637b = jArr[b7.f0.d(jArr, j11, true)];
    }

    @Override // b0.l2
    public s m(long j11, s sVar, s sVar2, s sVar3) {
        return ((n2) this.f3638c).m(a(j11), sVar, sVar2, b(j11, sVar, sVar3, sVar2));
    }

    public p2(String str, byte[] bArr, long j11, long j12) {
        this.f3638c = str;
        this.f3639d = bArr;
        this.f3636a = j11;
        this.f3637b = j12;
    }
}
