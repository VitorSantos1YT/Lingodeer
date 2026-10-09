package jr;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements fz.e {
    public final /* synthetic */ qy.e H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36661a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f36663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f36664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f36665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f36666f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f36667t;

    public /* synthetic */ k(kr.n nVar, int i11, fz.a aVar, fz.a aVar2, fz.a aVar3, int i12, int i13) {
        this.f36665e = nVar;
        this.f36662b = i11;
        this.f36666f = aVar;
        this.f36667t = aVar2;
        this.H = aVar3;
        this.f36663c = i12;
        this.f36664d = i13;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36661a) {
            case 0:
                ((Integer) obj2).getClass();
                a.h((kr.n) this.f36665e, this.f36662b, (fz.a) this.f36666f, (fz.a) this.f36667t, (fz.a) this.H, (l1.n) obj, l1.t.M(this.f36663c | 1), this.f36664d);
                break;
            default:
                ((Integer) obj2).getClass();
                tg.u.a((tg.i0) this.f36665e, (tg.d0) this.f36666f, (List) this.f36667t, this.f36662b, (t1.d) this.H, (l1.n) obj, l1.t.M(this.f36663c | 1), this.f36664d);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ k(tg.i0 i0Var, tg.d0 d0Var, List list, int i11, t1.d dVar, int i12, int i13) {
        this.f36665e = i0Var;
        this.f36666f = d0Var;
        this.f36667t = list;
        this.f36662b = i11;
        this.H = dVar;
        this.f36663c = i12;
        this.f36664d = i13;
    }
}
