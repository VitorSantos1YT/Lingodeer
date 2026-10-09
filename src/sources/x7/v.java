package x7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b7.o f55946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b7.o f55947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f55948c;

    public v(long j11, long[] jArr, long[] jArr2) {
        b7.a.d(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f55946a = new b7.o(length);
            this.f55947b = new b7.o(length);
        } else {
            int i11 = length + 1;
            b7.o oVar = new b7.o(i11);
            this.f55946a = oVar;
            b7.o oVar2 = new b7.o(i11);
            this.f55947b = oVar2;
            oVar.a(0L);
            oVar2.a(0L);
        }
        this.f55946a.b(jArr);
        this.f55947b.b(jArr2);
        this.f55948c = j11;
    }

    @Override // x7.y
    public final boolean d() {
        return this.f55947b.f4013b > 0;
    }

    @Override // x7.y
    public final x i(long j11) {
        b7.o oVar = this.f55947b;
        if (oVar.f4013b == 0) {
            z zVar = z.f55958c;
            return new x(zVar, zVar);
        }
        int iB = b7.f0.b(oVar, j11);
        long jD = oVar.d(iB);
        b7.o oVar2 = this.f55946a;
        z zVar2 = new z(jD, oVar2.d(iB));
        if (jD == j11 || iB == oVar.f4013b - 1) {
            return new x(zVar2, zVar2);
        }
        int i11 = iB + 1;
        return new x(zVar2, new z(oVar.d(i11), oVar2.d(i11)));
    }

    @Override // x7.y
    public final long k() {
        return this.f55948c;
    }
}
