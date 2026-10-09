package at;

import km.b1;
import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2907a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.r f2909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f2910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2912f;

    public /* synthetic */ n(long j11, String str, z1.r rVar, int i11, int i12) {
        this.f2910d = j11;
        this.f2908b = str;
        this.f2909c = rVar;
        this.f2911e = i11;
        this.f2912f = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2907a) {
            case 0:
                ((Integer) obj2).getClass();
                b.e(t.M(this.f2911e | 1), this.f2912f, this.f2910d, this.f2908b, (l1.n) obj, this.f2909c);
                break;
            default:
                ((Integer) obj2).getClass();
                b1.a(t.M(this.f2911e | 1), this.f2912f, this.f2910d, this.f2908b, (l1.n) obj, this.f2909c);
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ n(String str, z1.r rVar, long j11, int i11, int i12) {
        this.f2908b = str;
        this.f2909c = rVar;
        this.f2910d = j11;
        this.f2911e = i11;
        this.f2912f = i12;
    }
}
