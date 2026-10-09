package fu;

import mt.y3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements fz.e {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28066a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f28067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f28070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.a f28071f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz.a f28072t;

    public /* synthetic */ c(z1.r rVar, int i11, int i12, int i13, boolean z11, fz.a aVar, fz.a aVar2, int i14) {
        this.H = rVar;
        this.f28068c = i11;
        this.f28069d = i12;
        this.f28070e = i13;
        this.f28067b = z11;
        this.f28071f = aVar;
        this.f28072t = aVar2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28066a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(7);
                a.f((z1.r) this.H, this.f28068c, this.f28069d, this.f28070e, this.f28067b, this.f28071f, this.f28072t, (l1.n) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = l1.t.M(1);
                y3.q(this.f28067b, this.f28068c, this.f28069d, this.f28070e, this.f28071f, this.f28072t, (fz.a) this.H, (l1.n) obj, iM2);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ c(boolean z11, int i11, int i12, int i13, fz.a aVar, fz.a aVar2, fz.a aVar3, int i14) {
        this.f28067b = z11;
        this.f28068c = i11;
        this.f28069d = i12;
        this.f28070e = i13;
        this.f28071f = aVar;
        this.f28072t = aVar2;
        this.H = aVar3;
    }
}
