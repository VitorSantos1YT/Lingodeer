package z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f58458a = new g(-1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f58459b = new g(1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f58460c = new f(-1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f58461d = new f(1.0f);

    public static final r a(r rVar, fz.f fVar) {
        return rVar.i(new m(fVar));
    }

    public static final r b(l1.n nVar, r rVar) {
        if (rVar.c(n.f58480a)) {
            return rVar;
        }
        l1.s sVar = (l1.s) nVar;
        sVar.e0(1219399079);
        r rVar2 = (r) rVar.a(o.f58481a, new a0.h(sVar, 8));
        sVar.p(false);
        return rVar2;
    }

    public static final r c(l1.n nVar, r rVar) {
        l1.s sVar = (l1.s) nVar;
        sVar.d0(439770924);
        r rVarB = b(sVar, rVar);
        sVar.p(false);
        return rVarB;
    }

    public static final r d(r rVar, float f5) {
        return rVar.i(new u(f5));
    }
}
