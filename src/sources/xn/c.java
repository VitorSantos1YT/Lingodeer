package xn;

import l1.n;
import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f56123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f56124c;

    public /* synthetic */ c(String str, fz.c cVar, int i11, int i12) {
        this.f56122a = i12;
        this.f56123b = str;
        this.f56124c = cVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f56122a;
        n nVar = (n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.k(this.f56123b, this.f56124c, nVar, t.M(7));
                break;
            default:
                a.j(this.f56123b, this.f56124c, nVar, t.M(1));
                break;
        }
        return b0.f48488a;
    }
}
