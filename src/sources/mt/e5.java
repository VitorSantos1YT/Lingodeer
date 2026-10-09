package mt;

import rt.gc;
import rt.h9;
import rt.rc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e5 implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ qy.e K;
    public final /* synthetic */ qy.e L;
    public final /* synthetic */ qy.e M;
    public final /* synthetic */ qy.e N;
    public final /* synthetic */ qy.e O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41384a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f41386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f41387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f41388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f41389f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f41390t;

    public /* synthetic */ e5(int i11, rt.x4 x4Var, fz.c cVar, fz.c cVar2, fz.c cVar3, fz.c cVar4, fz.c cVar5, fz.c cVar6, fz.c cVar7, fz.c cVar8, fz.c cVar9, fz.c cVar10, int i12) {
        this.f41385b = i11;
        this.f41389f = x4Var;
        this.f41386c = cVar;
        this.f41387d = cVar2;
        this.f41388e = cVar3;
        this.f41390t = cVar4;
        this.H = cVar5;
        this.K = cVar6;
        this.L = cVar7;
        this.M = cVar8;
        this.N = cVar9;
        this.O = cVar10;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41384a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(1);
                l5.m(this.f41385b, (rt.x4) this.f41389f, this.f41386c, this.f41387d, this.f41388e, (fz.c) this.f41390t, (fz.c) this.H, (fz.c) this.K, (fz.c) this.L, (fz.c) this.M, (fz.c) this.N, (fz.c) this.O, (l1.n) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = l1.t.M(1);
                nv.r.w((rc) this.f41389f, (h9) this.f41390t, (gc) this.H, this.f41385b, (fz.a) this.K, (fz.a) this.L, this.f41386c, (fz.e) this.M, this.f41387d, (fz.a) this.N, this.f41388e, (fz.a) this.O, (l1.n) obj, iM2);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ e5(rc rcVar, h9 h9Var, gc gcVar, int i11, fz.a aVar, fz.a aVar2, fz.c cVar, fz.e eVar, fz.c cVar2, fz.a aVar3, fz.c cVar3, fz.a aVar4, int i12) {
        this.f41389f = rcVar;
        this.f41390t = h9Var;
        this.H = gcVar;
        this.f41385b = i11;
        this.K = aVar;
        this.L = aVar2;
        this.f41386c = cVar;
        this.M = eVar;
        this.f41387d = cVar2;
        this.N = aVar3;
        this.f41388e = cVar3;
        this.O = aVar4;
    }
}
