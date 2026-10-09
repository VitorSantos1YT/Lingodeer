package ad;

import fr.j3;
import wc.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ int H;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wc.h f607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z1.r f609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z1.e f611f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w2.j f612t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(wc.h hVar, fz.a aVar, z1.r rVar, e0 e0Var, t tVar, z1.e eVar, w2.j jVar, wc.a aVar2, int i11, int i12, int i13, int i14) {
        super(2);
        this.f606a = i14;
        this.f607b = hVar;
        this.f608c = aVar;
        this.f609d = rVar;
        this.f610e = tVar;
        this.f611f = eVar;
        this.f612t = jVar;
        this.H = i11;
        this.K = i12;
        this.L = i13;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f606a) {
            case 0:
                ((Number) obj2).intValue();
                j3.a(this.f607b, this.f608c, this.f609d, this.f610e, this.f611f, this.f612t, (l1.n) obj, l1.t.M(this.H | 1), l1.t.M(this.K), this.L);
                break;
            default:
                ((Number) obj2).intValue();
                j3.a(this.f607b, this.f608c, this.f609d, this.f610e, this.f611f, this.f612t, (l1.n) obj, l1.t.M(this.H | 1), l1.t.M(this.K), this.L);
                break;
        }
        return qy.b0.f48488a;
    }
}
