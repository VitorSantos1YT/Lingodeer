package iu;

import j3.y0;
import java.util.Map;
import l1.t;
import mt.y3;
import qy.b0;
import tg.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements fz.e {
    public final /* synthetic */ int H;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f34562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f34563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f34564f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f34565t;

    public /* synthetic */ a(j3.h hVar, z1.r rVar, y0 y0Var, int i11, boolean z11, int i12, int i13, Object obj, int i14, int i15) {
        this.f34559a = i15;
        this.f34560b = hVar;
        this.f34561c = rVar;
        this.f34562d = y0Var;
        this.f34563e = i11;
        this.f34564f = z11;
        this.f34565t = i12;
        this.H = i13;
        this.L = obj;
        this.K = i14;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f34559a) {
            case 0:
                ((Integer) obj2).getClass();
                k.b((j3.h) this.f34560b, (z1.r) this.f34561c, (y0) this.f34562d, this.f34563e, this.f34564f, this.f34565t, this.H, (s0.g) this.L, (l1.n) obj, t.M(this.K | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                k.a((j3.h) this.f34560b, (z1.r) this.f34561c, (y0) this.f34562d, this.f34563e, this.f34564f, this.f34565t, this.H, (Map) this.L, (l1.n) obj, t.M(this.K | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM = t.M(1);
                y3.k(this.f34564f, this.f34563e, this.f34565t, this.H, this.K, (fz.a) this.f34560b, (fz.a) this.f34561c, (fz.a) this.f34562d, (fz.a) this.L, (l1.n) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                c.a.c((i0) this.f34560b, (vg.m) this.f34562d, (z1.r) this.f34561c, (fz.c) this.L, this.f34564f, this.f34563e, this.f34565t, (l1.n) obj, t.M(this.H | 1), this.K);
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ a(i0 i0Var, vg.m mVar, z1.r rVar, fz.c cVar, boolean z11, int i11, int i12, int i13, int i14) {
        this.f34559a = 3;
        this.f34560b = i0Var;
        this.f34562d = mVar;
        this.f34561c = rVar;
        this.L = cVar;
        this.f34564f = z11;
        this.f34563e = i11;
        this.f34565t = i12;
        this.H = i13;
        this.K = i14;
    }

    public /* synthetic */ a(boolean z11, int i11, int i12, int i13, int i14, fz.a aVar, fz.a aVar2, fz.a aVar3, fz.a aVar4, int i15) {
        this.f34559a = 2;
        this.f34564f = z11;
        this.f34563e = i11;
        this.f34565t = i12;
        this.H = i13;
        this.K = i14;
        this.f34560b = aVar;
        this.f34561c = aVar2;
        this.f34562d = aVar3;
        this.L = aVar4;
    }
}
