package gr;

import mt.y3;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f29698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z1.r f29699d;

    public /* synthetic */ i(long j11, String str, z1.r rVar, int i11, int i12) {
        this.f29696a = i12;
        this.f29698c = j11;
        this.f29697b = str;
        this.f29699d = rVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29696a) {
            case 0:
                ((Integer) obj2).getClass();
                n.a(l1.t.M(1), this.f29698c, this.f29697b, (l1.n) obj, this.f29699d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                iv.o.h(l1.t.M(55), this.f29698c, this.f29697b, (l1.n) obj, this.f29699d);
                break;
            default:
                ((Integer) obj2).getClass();
                y3.p(l1.t.M(385), this.f29698c, this.f29697b, (l1.n) obj, this.f29699d);
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ i(String str, long j11, z1.r rVar, int i11) {
        this.f29696a = 1;
        this.f29697b = str;
        this.f29698c = j11;
        this.f29699d = rVar;
    }
}
