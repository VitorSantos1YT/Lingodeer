package tv;

import l1.n;
import l1.t;
import qy.b0;
import xu.a2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52638a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f52640c;

    public /* synthetic */ b(int i11, int i12) {
        this.f52639b = i11;
        this.f52640c = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f52638a;
        n nVar = (n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.b(this.f52639b, nVar, t.M(this.f52640c | 1));
                break;
            default:
                a2.d(this.f52639b, this.f52640c, nVar, t.M(1));
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ b(int i11, int i12, int i13) {
        this.f52639b = i11;
        this.f52640c = i12;
    }
}
