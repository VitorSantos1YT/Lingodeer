package a0;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ qy.e H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.r f170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f174f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f175t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(Object obj, z1.r rVar, Object obj2, Object obj3, qy.e eVar, int i11, int i12, int i13) {
        super(2);
        this.f169a = i13;
        this.f173e = obj;
        this.f170b = rVar;
        this.f174f = obj2;
        this.f175t = obj3;
        this.H = eVar;
        this.f171c = i11;
        this.f172d = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f169a) {
            case 0:
                ((Number) obj2).intValue();
                b0.c0 c0Var = (b0.c0) this.f174f;
                String str = (String) this.f175t;
                t1.d dVar = (t1.d) this.H;
                j0.g(this.f173e, this.f170b, c0Var, str, dVar, (l1.n) obj, l1.t.M(this.f171c | 1), this.f172d);
                break;
            default:
                ((Number) obj2).intValue();
                Class cls = (Class) this.f173e;
                b6.f fVar = (b6.f) this.f174f;
                Bundle bundle = (Bundle) this.f175t;
                fz.c cVar = (fz.c) this.H;
                ub.a.H(cls, this.f170b, fVar, bundle, cVar, (l1.n) obj, l1.t.M(this.f171c | 1), this.f172d);
                break;
        }
        return qy.b0.f48488a;
    }
}
