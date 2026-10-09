package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m4 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30670a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f30671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f30672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qy.e f30673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f30674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f30675f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f30676t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(fz.a aVar, z1.r rVar, g2.w0 w0Var, long j11, long j12, h4 h4Var, int i11) {
        super(2);
        this.f30673d = aVar;
        this.f30674e = rVar;
        this.f30675f = w0Var;
        this.f30671b = j11;
        this.f30672c = j12;
        this.f30676t = h4Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30670a) {
            case 0:
                ((Number) obj2).intValue();
                fz.a aVar = (fz.a) this.f30673d;
                z1.r rVar = (z1.r) this.f30674e;
                g2.w0 w0Var = (g2.w0) this.f30675f;
                h4 h4Var = (h4) this.f30676t;
                n4.a(aVar, rVar, w0Var, this.f30671b, this.f30672c, h4Var, (l1.n) obj, l1.t.M(12582961));
                break;
            default:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar = (l1.s) nVar;
                    if (sVar.F()) {
                        sVar.W();
                    } else {
                        l1.s sVar2 = (l1.s) nVar;
                        sVar2.d0(-810701708);
                        d9.c((t1.d) this.f30674e, (fz.e) this.f30673d, (fz.e) this.f30675f, (j3.y0) this.f30676t, this.f30671b, this.f30672c, sVar2, 0);
                        sVar2.p(false);
                    }
                } else {
                    l1.s sVar3 = (l1.s) nVar;
                    sVar3.d0(-810701708);
                    d9.c((t1.d) this.f30674e, (fz.e) this.f30673d, (fz.e) this.f30675f, (j3.y0) this.f30676t, this.f30671b, this.f30672c, sVar3, 0);
                    sVar3.p(false);
                }
                break;
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(fz.e eVar, t1.d dVar, fz.e eVar2, j3.y0 y0Var, long j11, long j12) {
        super(2);
        this.f30673d = eVar;
        this.f30674e = dVar;
        this.f30675f = eVar2;
        this.f30676t = y0Var;
        this.f30671b = j11;
        this.f30672c = j12;
    }
}
