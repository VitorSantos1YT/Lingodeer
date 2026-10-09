package mt;

import h1.p8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t4 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41925a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f41926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f41927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f41928d;

    public /* synthetic */ t4(float f5, long j11, long j12) {
        this.f41926b = f5;
        this.f41927c = j11;
        this.f41928d = j12;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f41925a;
        p8 it = (p8) obj;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i11) {
            case 0:
                kotlin.jvm.internal.m.f(it, "it");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    z1.r rVarG = j0.e2.g(j0.e2.e(z1.o.f58481a, 1.0f), 20);
                    long j11 = this.f41927c;
                    boolean zE = sVar.e(j11);
                    long j12 = this.f41928d;
                    boolean zE2 = zE | sVar.e(j12);
                    float f5 = this.f41926b;
                    boolean zC = zE2 | sVar.c(f5);
                    Object objQ = sVar.Q();
                    if (zC || objQ == l1.m.f39353a) {
                        objQ = new dt.g1(j11, j12, f5, 1);
                        sVar.o0(objQ);
                    }
                    d0.n.b(6, (fz.c) objQ, sVar, rVarG);
                } else {
                    sVar.W();
                }
                break;
            default:
                kotlin.jvm.internal.m.f(it, "it");
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    z1.r rVarG2 = j0.e2.g(j0.e2.e(z1.o.f58481a, 1.0f), 8);
                    float f11 = this.f41926b;
                    boolean zC2 = sVar2.c(f11);
                    long j13 = this.f41927c;
                    boolean zE3 = zC2 | sVar2.e(j13);
                    long j14 = this.f41928d;
                    boolean zE4 = zE3 | sVar2.e(j14);
                    Object objQ2 = sVar2.Q();
                    if (zE4 || objQ2 == l1.m.f39353a) {
                        objQ2 = new dt.g1(f11, j13, j14, 3);
                        sVar2.o0(objQ2);
                    }
                    d0.n.b(6, (fz.c) objQ2, sVar2, rVarG2);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ t4(long j11, long j12, float f5) {
        this.f41927c = j11;
        this.f41928d = j12;
        this.f41926b = f5;
    }
}
