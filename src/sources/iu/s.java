package iu;

import h1.ac;
import j0.n2;
import java.util.List;
import l1.t;
import qy.b0;
import xu.a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s implements fz.e {
    public final /* synthetic */ qy.e H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34654a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f34656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f34657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f34658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f34659f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ qy.e f34660t;

    public /* synthetic */ s(int i11, List list, List list2, fz.a aVar, fz.a aVar2, fz.c cVar, fz.c cVar2, fz.c cVar3, fz.c cVar4, int i12) {
        this.f34655b = i11;
        this.f34658e = list;
        this.f34659f = list2;
        this.f34656c = aVar;
        this.f34660t = aVar2;
        this.H = cVar;
        this.K = cVar2;
        this.L = cVar3;
        this.M = cVar4;
        this.f34657d = i12;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f34654a) {
            case 0:
                ((Integer) obj2).getClass();
                k.g(this.f34656c, (z1.r) this.f34658e, (fz.e) this.f34659f, (fz.e) this.f34660t, (fz.f) this.H, (n2) this.K, (ac) this.L, (a9.i) this.M, (l1.n) obj, t.M(this.f34655b | 1), this.f34657d);
                break;
            default:
                ((Integer) obj2).getClass();
                a0.d(this.f34655b, (List) this.f34658e, this.f34659f, this.f34656c, (fz.a) this.f34660t, (fz.c) this.H, (fz.c) this.K, (fz.c) this.L, (fz.c) this.M, (l1.n) obj, t.M(this.f34657d | 1));
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ s(fz.a aVar, z1.r rVar, fz.e eVar, fz.e eVar2, fz.f fVar, n2 n2Var, ac acVar, a9.i iVar, int i11, int i12) {
        this.f34656c = aVar;
        this.f34658e = rVar;
        this.f34659f = eVar;
        this.f34660t = eVar2;
        this.H = fVar;
        this.K = n2Var;
        this.L = acVar;
        this.M = iVar;
        this.f34655b = i11;
        this.f34657d = i12;
    }
}
