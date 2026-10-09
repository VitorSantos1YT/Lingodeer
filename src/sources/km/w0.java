package km;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f38299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f38300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z1.r f38301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38302e;

    public /* synthetic */ w0(List list, fz.c cVar, z1.r rVar, int i11, int i12) {
        this.f38298a = i12;
        this.f38299b = list;
        this.f38300c = cVar;
        this.f38301d = rVar;
        this.f38302e = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f38298a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                b1.v(l1.t.M(this.f38302e | 1), this.f38300c, this.f38299b, nVar, this.f38301d);
                break;
            case 1:
                b1.u(l1.t.M(this.f38302e | 1), this.f38300c, this.f38299b, nVar, this.f38301d);
                break;
            case 2:
                b1.q(l1.t.M(this.f38302e | 1), this.f38300c, this.f38299b, nVar, this.f38301d);
                break;
            case 3:
                pv.a.d(l1.t.M(this.f38302e | 1), this.f38300c, this.f38299b, nVar, this.f38301d);
                break;
            default:
                vr.i.b(l1.t.M(this.f38302e | 1), this.f38300c, this.f38299b, nVar, this.f38301d);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ w0(List list, z1.r rVar, fz.c cVar, int i11) {
        this.f38298a = 3;
        this.f38299b = list;
        this.f38301d = rVar;
        this.f38300c = cVar;
        this.f38302e = i11;
    }
}
