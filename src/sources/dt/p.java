package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f24070c;

    public /* synthetic */ p(l1.b1 b1Var, float f5, int i11) {
        this.f24068a = i11;
        this.f24069b = b1Var;
        this.f24070c = f5;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f24068a;
        j0.q CourseTestModelClickableBox = (j0.q) obj;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i11) {
            case 0:
                kotlin.jvm.internal.m.f(CourseTestModelClickableBox, "$this$CourseTestModelClickableBox");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    h1.r4.b((k2.b) this.f24069b.getValue(), null, j0.e2.d(j0.c.A(z1.o.f58481a, this.f24070c), 1.0f), ((h1.s1) sVar.j(h1.v1.f31180a)).f31033p, sVar, 48, 0);
                } else {
                    sVar.W();
                }
                break;
            default:
                kotlin.jvm.internal.m.f(CourseTestModelClickableBox, "$this$CourseTestModelClickableBox");
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    h1.r4.b((k2.b) this.f24069b.getValue(), null, j0.e2.d(d2.h.i(j0.c.A(z1.o.f58481a, this.f24070c), iu.k.p(sVar2), 1.0f), 1.0f), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31033p, sVar2, 48, 0);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
