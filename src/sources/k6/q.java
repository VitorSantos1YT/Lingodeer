package k6;

import qy.b0;
import w2.a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37947a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f37949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f37950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.e f37951e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(c6.l lVar, int i11, int i12, t1.d dVar, int i13) {
        super(2);
        this.f37950d = lVar;
        this.f37948b = i11;
        this.f37949c = i12;
        this.f37951e = dVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37947a) {
            case 0:
                ((Number) obj2).intValue();
                c6.l lVar = (c6.l) this.f37950d;
                t1.d dVar = (t1.d) this.f37951e;
                v10.c.d(lVar, this.f37948b, this.f37949c, dVar, (l1.n) obj, 3073);
                break;
            default:
                ((Number) obj2).intValue();
                z1.r rVar = (z1.r) this.f37950d;
                int iM = l1.t.M(this.f37948b | 1);
                int i11 = this.f37949c;
                a0.b(rVar, this.f37951e, (l1.n) obj, iM, i11);
                break;
        }
        return b0.f48488a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z1.r rVar, fz.e eVar, int i11, int i12) {
        super(2);
        this.f37950d = rVar;
        this.f37951e = eVar;
        this.f37948b = i11;
        this.f37949c = i12;
    }
}
