package x7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class q implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f55914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f55915c;

    public /* synthetic */ q(Object obj, long j11, int i11) {
        this.f55913a = i11;
        this.f55915c = obj;
        this.f55914b = j11;
    }

    @Override // x7.y
    public final boolean d() {
        switch (this.f55913a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // x7.y
    public final x i(long j11) {
        switch (this.f55913a) {
            case 0:
                r rVar = (r) this.f55915c;
                b7.a.k(rVar.f55926k);
                qp.b bVar = rVar.f55926k;
                long[] jArr = (long[]) bVar.f47832b;
                long[] jArr2 = (long[]) bVar.f47833c;
                int iD = b7.f0.d(jArr, b7.f0.h((((long) rVar.f55920e) * j11) / 1000000, 0L, rVar.f55925j - 1), false);
                long j12 = iD == -1 ? 0L : jArr[iD];
                long j13 = iD != -1 ? jArr2[iD] : 0L;
                int i11 = rVar.f55920e;
                long j14 = (j12 * 1000000) / ((long) i11);
                long j15 = this.f55914b;
                z zVar = new z(j14, j13 + j15);
                if (j14 == j11 || iD == jArr.length - 1) {
                    return new x(zVar, zVar);
                }
                int i12 = iD + 1;
                return new x(zVar, new z((jArr[i12] * 1000000) / ((long) i11), j15 + jArr2[i12]));
            case 1:
                return (x) this.f55915c;
            default:
                z7.b bVar2 = (z7.b) this.f55915c;
                x xVarB = bVar2.f58995i[0].b(j11);
                int i13 = 1;
                while (true) {
                    z7.e[] eVarArr = bVar2.f58995i;
                    if (i13 >= eVarArr.length) {
                        return xVarB;
                    }
                    x xVarB2 = eVarArr[i13].b(j11);
                    if (xVarB2.f55956a.f55960b < xVarB.f55956a.f55960b) {
                        xVarB = xVarB2;
                    }
                    i13++;
                }
                break;
        }
    }

    @Override // x7.y
    public final long k() {
        switch (this.f55913a) {
            case 0:
                return ((r) this.f55915c).b();
            case 1:
                return this.f55914b;
            default:
                return this.f55914b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(long j11) {
        this(j11, 0L);
        this.f55913a = 1;
    }

    public q(long j11, long j12) {
        this.f55913a = 1;
        this.f55914b = j11;
        z zVar = j12 == 0 ? z.f55958c : new z(0L, j12);
        this.f55915c = new x(zVar, zVar);
    }
}
