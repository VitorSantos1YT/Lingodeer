package kt;

import l1.n;
import l1.t;
import qy.b0;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38643a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f38644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f38645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f38646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f38647e;

    public /* synthetic */ c(boolean z11, long j11, fz.a aVar, r rVar, int i11) {
        this.f38644b = z11;
        this.f38645c = j11;
        this.f38646d = aVar;
        this.f38647e = rVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38643a) {
            case 0:
                ((Integer) obj2).getClass();
                l.a(t.M(1), this.f38645c, this.f38646d, (n) obj, this.f38647e, this.f38644b);
                break;
            default:
                ((Integer) obj2).getClass();
                ew.a.a(t.M(3073), this.f38645c, this.f38646d, (n) obj, this.f38647e, this.f38644b);
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ c(boolean z11, fz.a aVar, r rVar, long j11, int i11) {
        this.f38644b = z11;
        this.f38646d = aVar;
        this.f38647e = rVar;
        this.f38645c = j11;
    }
}
