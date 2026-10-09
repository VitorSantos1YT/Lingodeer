package pr;

import j3.y0;
import java.util.List;
import s0.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47089a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f47090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f47091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f47092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f47093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f47094f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f47095t;

    public /* synthetic */ r(String str, z1.r rVar, y0 y0Var, int i11, boolean z11, int i12, int i13, int i14) {
        this.f47090b = str;
        this.H = rVar;
        this.K = y0Var;
        this.f47091c = i11;
        this.f47092d = z11;
        this.f47093e = i12;
        this.f47094f = i13;
        this.f47095t = i14;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f47089a) {
            case 0:
                ((Integer) obj2).getClass();
                f0.d(this.f47092d, (qr.a) this.H, this.f47091c, this.f47093e, this.f47094f, (List) this.K, this.f47090b, (l1.n) obj, l1.t.M(this.f47095t | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                o0.d(this.f47090b, (z1.r) this.H, (y0) this.K, this.f47091c, this.f47092d, this.f47093e, this.f47094f, (l1.n) obj, l1.t.M(this.f47095t | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ r(boolean z11, qr.a aVar, int i11, int i12, int i13, List list, String str, int i14) {
        this.f47092d = z11;
        this.H = aVar;
        this.f47091c = i11;
        this.f47093e = i12;
        this.f47094f = i13;
        this.K = list;
        this.f47090b = str;
        this.f47095t = i14;
    }
}
