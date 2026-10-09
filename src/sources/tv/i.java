package tv;

import l1.n;
import l1.t;
import qy.b0;
import xu.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52654a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f52655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f52656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f52657d;

    public /* synthetic */ i(int i11, String str, fz.a aVar, int i12) {
        this.f52657d = i11;
        this.f52655b = str;
        this.f52656c = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f52654a;
        n nVar = (n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                j.a(this.f52657d, t.M(391), this.f52656c, this.f52655b, nVar);
                break;
            case 1:
                u.c(this.f52655b, this.f52656c, nVar, t.M(this.f52657d | 1));
                break;
            default:
                ys.a.C(this.f52657d, t.M(1), this.f52656c, this.f52655b, nVar);
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ i(String str, int i11, fz.a aVar, int i12) {
        this.f52655b = str;
        this.f52657d = i11;
        this.f52656c = aVar;
    }

    public /* synthetic */ i(String str, fz.a aVar, int i11) {
        this.f52655b = str;
        this.f52656c = aVar;
        this.f52657d = i11;
    }
}
