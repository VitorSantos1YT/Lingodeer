package yg;

import java.util.List;
import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57837a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f57838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f57839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f57840d;

    public /* synthetic */ q(int i11, int i12, long j11, z1.r rVar) {
        this.f57838b = i11;
        this.f57839c = j11;
        this.f57840d = rVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f57837a) {
            case 0:
                ((Integer) obj2).intValue();
                int iM = t.M(this.f57838b | 1);
                r.c((List) this.f57840d, this.f57839c, (l1.n) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = t.M(385);
                ys.a.o(this.f57838b, this.f57839c, (z1.r) this.f57840d, (l1.n) obj, iM2);
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ q(List list, int i11, long j11) {
        this.f57840d = list;
        this.f57839c = j11;
        this.f57838b = i11;
    }
}
