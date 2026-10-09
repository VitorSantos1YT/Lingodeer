package gs;

import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bs.f f29780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f29782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.a f29783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.c f29784f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f29785t;

    public /* synthetic */ e(bs.f fVar, String str, fz.a aVar, fz.a aVar2, fz.c cVar, int i11, int i12) {
        this.f29779a = i12;
        this.f29780b = fVar;
        this.f29781c = str;
        this.f29782d = aVar;
        this.f29783e = aVar2;
        this.f29784f = cVar;
        this.f29785t = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29779a) {
            case 0:
                ((Integer) obj2).intValue();
                a.b(this.f29780b, this.f29781c, this.f29782d, this.f29783e, this.f29784f, (l1.n) obj, t.M(this.f29785t | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                a.d(this.f29780b, this.f29781c, this.f29782d, this.f29783e, this.f29784f, (l1.n) obj, t.M(this.f29785t | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                a.f(this.f29780b, this.f29781c, this.f29782d, this.f29783e, this.f29784f, (l1.n) obj, t.M(this.f29785t | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                a.i(this.f29780b, this.f29781c, this.f29782d, this.f29783e, this.f29784f, (l1.n) obj, t.M(this.f29785t | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                a.k(this.f29780b, this.f29781c, this.f29782d, this.f29783e, this.f29784f, (l1.n) obj, t.M(this.f29785t | 1));
                break;
        }
        return b0.f48488a;
    }
}
