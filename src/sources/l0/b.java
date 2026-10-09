package l0;

import com.lingodeer.data.model.CoursePracticeType;
import f0.t0;
import j0.t1;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39094a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f39095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f39096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f39097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f39098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f39099f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f39100t;

    public /* synthetic */ b(CoursePracticeType coursePracticeType, sr.e eVar, hu.m mVar, fz.c cVar, fz.a aVar, boolean z11, fz.a aVar2, fz.e eVar2, t1.d dVar, int i11, int i12) {
        this.f39099f = coursePracticeType;
        this.f39100t = eVar;
        this.H = mVar;
        this.f39095b = cVar;
        this.K = aVar;
        this.f39096c = z11;
        this.L = aVar2;
        this.M = eVar2;
        this.N = dVar;
        this.f39097d = i11;
        this.f39098e = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f39094a) {
            case 0:
                ((Integer) obj2).getClass();
                ue.f.a((z1.r) this.f39099f, (w) this.f39100t, (t1) this.H, (j0.h) this.K, (z1.d) this.L, (t0) this.M, this.f39096c, (d0.i) this.N, this.f39095b, (l1.n) obj, l1.t.M(this.f39097d | 1), this.f39098e);
                break;
            default:
                ((Integer) obj2).getClass();
                ys.a.a((CoursePracticeType) this.f39099f, (sr.e) this.f39100t, (hu.m) this.H, this.f39095b, (fz.a) this.K, this.f39096c, (fz.a) this.L, (fz.e) this.M, (t1.d) this.N, (l1.n) obj, l1.t.M(this.f39097d | 1), this.f39098e);
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ b(z1.r rVar, w wVar, t1 t1Var, j0.h hVar, z1.d dVar, t0 t0Var, boolean z11, d0.i iVar, fz.c cVar, int i11, int i12) {
        this.f39099f = rVar;
        this.f39100t = wVar;
        this.H = t1Var;
        this.K = hVar;
        this.L = dVar;
        this.M = t0Var;
        this.f39096c = z11;
        this.N = iVar;
        this.f39095b = cVar;
        this.f39097d = i11;
        this.f39098e = i12;
    }
}
