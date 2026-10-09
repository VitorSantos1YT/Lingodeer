package e6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24991a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.e f24992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f24993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t1 f24994d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(int i11, long j11, t1 t1Var, fz.e eVar) {
        super(2);
        this.f24994d = t1Var;
        this.f24993c = j11;
        this.f24992b = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        p1 p1Var;
        l1.s sVar;
        switch (this.f24991a) {
            case 0:
                ((Number) obj2).intValue();
                fz.e eVar = this.f24992b;
                com.bumptech.glide.f.a(1, this.f24993c, this.f24994d, eVar, (l1.n) obj);
                return qy.b0.f48488a;
            default:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar2 = (l1.s) nVar;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        p1Var = p1.f25017a;
                        sVar = (l1.s) nVar;
                        sVar.e0(578571862);
                        sVar.e0(-548224868);
                        if (sVar.f39434a instanceof c6.b) {
                            l1.t.z();
                            throw null;
                        }
                        sVar.b0();
                        if (sVar.S) {
                            sVar.k(p1Var);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(z0.V, new v3.h(this.f24993c), sVar);
                        l1.t.J(z0.W, this.f24994d, sVar);
                        this.f24992b.invoke(sVar, 0);
                        sVar.p(true);
                        sVar.p(false);
                        sVar.p(false);
                    }
                } else {
                    p1Var = p1.f25017a;
                    sVar = (l1.s) nVar;
                    sVar.e0(578571862);
                    sVar.e0(-548224868);
                    if (sVar.f39434a instanceof c6.b) {
                        l1.t.z();
                        throw null;
                    }
                    sVar.b0();
                    if (sVar.S) {
                        sVar.k(p1Var);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(z0.V, new v3.h(this.f24993c), sVar);
                    l1.t.J(z0.W, this.f24994d, sVar);
                    this.f24992b.invoke(sVar, 0);
                    sVar.p(true);
                    sVar.p(false);
                    sVar.p(false);
                }
                return qy.b0.f48488a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(fz.e eVar, long j11, t1 t1Var) {
        super(2);
        this.f24992b = eVar;
        this.f24993c = j11;
        this.f24994d = t1Var;
    }
}
