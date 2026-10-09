package dt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f24342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qy.l f24344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j3.y0 f24345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z1.r f24346f;

    public /* synthetic */ x0(List list, int i11, qy.l lVar, j3.y0 y0Var, z1.r rVar, int i12, int i13) {
        this.f24341a = i13;
        this.f24342b = list;
        this.f24343c = i11;
        this.f24344d = lVar;
        this.f24345e = y0Var;
        this.f24346f = rVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24341a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(1);
                e.m(this.f24342b, this.f24343c, this.f24344d, this.f24345e, this.f24346f, (l1.n) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = l1.t.M(1);
                e.n(this.f24342b, this.f24343c, this.f24344d, this.f24345e, this.f24346f, (l1.n) obj, iM2);
                break;
        }
        return qy.b0.f48488a;
    }
}
