package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j3 extends kotlin.jvm.internal.n implements fz.f {
    public final /* synthetic */ p2 H;
    public final /* synthetic */ t7 K;
    public final /* synthetic */ m2 L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Long f30465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f30466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f30467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.e f30468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f30469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i1.x f30470f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ lz.g f30471t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(Long l9, Long l11, long j11, fz.e eVar, fz.c cVar, i1.x xVar, lz.g gVar, p2 p2Var, t7 t7Var, m2 m2Var) {
        super(3);
        this.f30465a = l9;
        this.f30466b = l11;
        this.f30467c = j11;
        this.f30468d = eVar;
        this.f30469e = cVar;
        this.f30470f = xVar;
        this.f30471t = gVar;
        this.H = p2Var;
        this.K = t7Var;
        this.L = m2Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x0086  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = ((x3) obj).f31299a;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((l1.s) nVar).d(i11) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18) {
            l1.s sVar = (l1.s) nVar;
            if (sVar.F()) {
                sVar.W();
            } else if (i11 == 0) {
                l1.s sVar2 = (l1.s) nVar;
                sVar2.d0(-1871299185);
                s3.c(this.f30465a, this.f30466b, this.f30467c, this.f30468d, this.f30469e, this.f30470f, this.f30471t, this.H, this.K, this.L, sVar2, 0);
                sVar2.p(false);
            } else if (i11 == 1) {
                l1.s sVar3 = (l1.s) nVar;
                sVar3.d0(-1871277944);
                e3.a(this.f30465a, this.f30466b, this.f30468d, this.f30470f, this.f30471t, this.H, this.K, this.L, sVar3, 0);
                sVar3.p(false);
            } else {
                l1.s sVar4 = (l1.s) nVar;
                sVar4.d0(2120399965);
                sVar4.p(false);
            }
        } else if (i11 == 0) {
            l1.s sVar5 = (l1.s) nVar;
            sVar5.d0(-1871299185);
            s3.c(this.f30465a, this.f30466b, this.f30467c, this.f30468d, this.f30469e, this.f30470f, this.f30471t, this.H, this.K, this.L, sVar5, 0);
            sVar5.p(false);
        } else if (i11 == 1) {
            l1.s sVar6 = (l1.s) nVar;
            sVar6.d0(-1871277944);
            e3.a(this.f30465a, this.f30466b, this.f30468d, this.f30470f, this.f30471t, this.H, this.K, this.L, sVar6, 0);
            sVar6.p(false);
        } else {
            l1.s sVar7 = (l1.s) nVar;
            sVar7.d0(2120399965);
            sVar7.p(false);
        }
        return qy.b0.f48488a;
    }
}
