package d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23025a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f23030f;

    public /* synthetic */ y(int i11, int i12, fz.a aVar, fz.a aVar2, l1.b1 b1Var) {
        this.f23026b = i11;
        this.f23027c = i12;
        this.f23028d = aVar;
        this.f23029e = aVar2;
        this.f23030f = b1Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, qy.h] */
    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f23025a;
        ?? r9 = this.f23030f;
        Object obj = this.f23029e;
        Object obj2 = this.f23028d;
        int i12 = this.f23027c;
        int i13 = this.f23026b;
        switch (i11) {
            case 0:
                t tVar = (t) obj2;
                j3.u0 u0Var = (j3.u0) tVar.f22994e;
                ie.o oVar = (ie.o) obj;
                int iIntValue = ((Number) r9.getValue()).intValue();
                boolean z11 = oVar.f34405b;
                boolean z12 = oVar.e() == j.CROSSED;
                long j11 = u0Var.j(i13);
                j3.x xVar = u0Var.f35798b;
                int i14 = j3.x0.f35822c;
                int iG = (int) (j11 >> 32);
                int iD = xVar.d(iG);
                int i15 = xVar.f35818f;
                if (iD != iIntValue) {
                    iG = iIntValue >= i15 ? u0Var.g(i15 - 1) : u0Var.g(iIntValue);
                }
                int iC = (int) (j11 & 4294967295L);
                if (xVar.d(iC) != iIntValue) {
                    iC = iIntValue >= i15 ? xVar.c(i15 - 1, false) : xVar.c(iIntValue, false);
                }
                if (iG == i12) {
                    return tVar.b(iC);
                }
                if (iC == i12) {
                    return tVar.b(iG);
                }
                if (!(z11 ^ z12) ? i13 >= iG : i13 > iC) {
                    iG = iC;
                }
                return tVar.b(iG);
            default:
                fz.a aVar = (fz.a) obj2;
                fz.a aVar2 = (fz.a) obj;
                ((l1.b1) r9).setValue(Boolean.FALSE);
                if (i13 + i12 > 0) {
                    aVar.invoke();
                } else {
                    aVar2.invoke();
                }
                return qy.b0.f48488a;
        }
    }

    public /* synthetic */ y(t tVar, int i11, int i12, ie.o oVar, qy.h hVar) {
        this.f23028d = tVar;
        this.f23026b = i11;
        this.f23027c = i12;
        this.f23029e = oVar;
        this.f23030f = hVar;
    }
}
