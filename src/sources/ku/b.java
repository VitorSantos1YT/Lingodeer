package ku;

import fz.e;
import l1.n;
import l1.t;
import mt.y3;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f38698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f38699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.a f38700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f38701f;

    public /* synthetic */ b(int i11, fz.a aVar, fz.a aVar2, fz.a aVar3, int i12, int i13) {
        this.f38696a = i13;
        this.f38697b = i11;
        this.f38698c = aVar;
        this.f38699d = aVar2;
        this.f38700e = aVar3;
        this.f38701f = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38696a) {
            case 0:
                ((Integer) obj2).getClass();
                a.h(this.f38697b, this.f38698c, this.f38699d, this.f38700e, (n) obj, t.M(this.f38701f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                y3.s(this.f38697b, this.f38698c, this.f38699d, this.f38700e, (n) obj, t.M(this.f38701f | 1));
                break;
        }
        return b0.f48488a;
    }
}
