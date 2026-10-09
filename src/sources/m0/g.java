package m0;

import f0.t0;
import j0.v1;
import java.util.List;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ fz.c L;
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;
    public final /* synthetic */ Object O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40549a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f40550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f40551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f40552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f40553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f40554f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f40555t;

    public /* synthetic */ g(Object obj, List list, rt.p pVar, boolean z11, String str, fz.e eVar, fz.e eVar2, fz.a aVar, fz.c cVar, fz.a aVar2, int i11, int i12) {
        this.O = obj;
        this.f40550b = list;
        this.f40551c = pVar;
        this.f40554f = z11;
        this.f40552d = str;
        this.H = eVar;
        this.K = eVar2;
        this.f40553e = aVar;
        this.L = cVar;
        this.f40555t = aVar2;
        this.M = i11;
        this.N = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f40549a) {
            case 0:
                ((Integer) obj2).getClass();
                md.a.a((c) this.O, (z1.r) this.f40550b, (x) this.f40551c, (v1) this.f40552d, (j0.h) this.H, (j0.f) this.K, (t0) this.f40553e, this.f40554f, (d0.i) this.f40555t, this.L, (l1.n) obj, l1.t.M(this.M | 1), this.N);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ns.o.a((z1.r) this.f40550b, (x) this.f40551c, (e) this.O, (v1) this.f40552d, (t0) this.f40553e, this.f40554f, (d0.i) this.f40555t, (j0.h) this.H, (j0.f) this.K, this.L, (l1.n) obj, l1.t.M(this.M | 1), l1.t.M(this.N));
                break;
            default:
                ((Integer) obj2).getClass();
                mt.g.i(this.O, (List) this.f40550b, (rt.p) this.f40551c, this.f40554f, (String) this.f40552d, (fz.e) this.H, (fz.e) this.K, (fz.a) this.f40553e, this.L, (fz.a) this.f40555t, (l1.n) obj, l1.t.M(this.M | 1), this.N);
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ g(c cVar, z1.r rVar, x xVar, v1 v1Var, j0.h hVar, j0.f fVar, t0 t0Var, boolean z11, d0.i iVar, fz.c cVar2, int i11, int i12) {
        this.O = cVar;
        this.f40550b = rVar;
        this.f40551c = xVar;
        this.f40552d = v1Var;
        this.H = hVar;
        this.K = fVar;
        this.f40553e = t0Var;
        this.f40554f = z11;
        this.f40555t = iVar;
        this.L = cVar2;
        this.M = i11;
        this.N = i12;
    }

    public /* synthetic */ g(z1.r rVar, x xVar, e eVar, v1 v1Var, t0 t0Var, boolean z11, d0.i iVar, j0.h hVar, j0.f fVar, fz.c cVar, int i11, int i12) {
        this.f40550b = rVar;
        this.f40551c = xVar;
        this.O = eVar;
        this.f40552d = v1Var;
        this.f40553e = t0Var;
        this.f40554f = z11;
        this.f40555t = iVar;
        this.H = hVar;
        this.K = fVar;
        this.L = cVar;
        this.M = i11;
        this.N = i12;
    }
}
