package gr;

import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f29672c;

    public /* synthetic */ d(int i11, int i12, long j11, String str) {
        this.f29670a = i12;
        this.f29671b = str;
        this.f29672c = j11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f29670a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                n.d(this.f29671b, this.f29672c, nVar, l1.t.M(1));
                break;
            case 1:
                iv.o.g(this.f29671b, this.f29672c, nVar, l1.t.M(55));
                break;
            case 2:
                yg.o.f(this.f29671b, this.f29672c, nVar, l1.t.M(1));
                break;
            default:
                yg.o.j(this.f29671b, this.f29672c, nVar, l1.t.M(1));
                break;
        }
        return b0.f48488a;
    }
}
