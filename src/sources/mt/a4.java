package mt;

import rt.l9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a4 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41244a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rt.e3 f41245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l9 f41246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f41247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f41248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j9.v f41249f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz.c f41250t;

    public /* synthetic */ a4(fz.c cVar, rt.e3 e3Var, l9 l9Var, fz.a aVar, j9.v vVar, fz.c cVar2) {
        this.f41248e = cVar;
        this.f41245b = e3Var;
        this.f41246c = l9Var;
        this.f41247d = aVar;
        this.f41249f = vVar;
        this.f41250t = cVar2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f41244a;
        l1.n nVar = (l1.n) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l1.c3 c3Var = ys.e.f57981a;
                    fz.c cVar = this.f41248e;
                    l1.t.b(new l1.w1[]{c3Var.a(cVar), ys.w.f58298a.a(new ys.v(-1L, -1L))}, t1.e.d(-1058129758, new a4(this.f41245b, this.f41246c, this.f41247d, cVar, this.f41249f, this.f41250t), sVar), sVar, 56);
                } else {
                    sVar.W();
                }
                break;
            default:
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j9.v vVar = this.f41249f;
                    boolean zH = sVar2.h(vVar);
                    Object objQ = sVar2.Q();
                    if (zH || objQ == l1.m.f39353a) {
                        objQ = new j9.g(vVar, 14);
                        sVar2.o0(objQ);
                    }
                    j4.b(this.f41245b, this.f41246c, this.f41247d, this.f41248e, (fz.a) objQ, this.f41250t, sVar2, 0);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ a4(rt.e3 e3Var, l9 l9Var, fz.a aVar, fz.c cVar, j9.v vVar, fz.c cVar2) {
        this.f41245b = e3Var;
        this.f41246c = l9Var;
        this.f41247d = aVar;
        this.f41248e = cVar;
        this.f41249f = vVar;
        this.f41250t = cVar2;
    }
}
