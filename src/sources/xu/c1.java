package xu;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c1 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f56378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f56379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f56380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f56381e;

    public /* synthetic */ c1(List list, fz.c cVar, fz.c cVar2, fz.c cVar3, int i11, int i12) {
        this.f56377a = i12;
        this.f56378b = list;
        this.f56379c = cVar;
        this.f56380d = cVar2;
        this.f56381e = cVar3;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56377a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(1);
                h1.a(this.f56378b, this.f56379c, this.f56380d, this.f56381e, (l1.n) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = l1.t.M(1);
                h1.e(this.f56378b, this.f56379c, this.f56380d, this.f56381e, (l1.n) obj, iM2);
                break;
        }
        return qy.b0.f48488a;
    }
}
