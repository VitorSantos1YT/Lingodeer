package gr;

import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f29758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f29759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f29760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.a f29761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f29762f;

    public /* synthetic */ x(int i11, int i12, fz.a aVar, fz.a aVar2, fz.a aVar3, boolean z11) {
        this.f29757a = i12;
        this.f29758b = z11;
        this.f29759c = aVar;
        this.f29760d = aVar2;
        this.f29761e = aVar3;
        this.f29762f = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29757a) {
            case 0:
                ((Integer) obj2).getClass();
                n.j(this.f29758b, this.f29759c, this.f29760d, this.f29761e, (l1.n) obj, l1.t.M(this.f29762f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                tv.a.i(this.f29758b, this.f29759c, this.f29760d, this.f29761e, (l1.n) obj, l1.t.M(this.f29762f | 1));
                break;
        }
        return b0.f48488a;
    }
}
