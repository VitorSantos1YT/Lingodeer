package dt;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l2 implements fz.e {
    public final /* synthetic */ qy.e H;
    public final /* synthetic */ qy.e K;
    public final /* synthetic */ qy.e L;
    public final /* synthetic */ qy.e M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23971a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f23973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f23976f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f23977t;

    public /* synthetic */ l2(List list, List list2, ArrayList arrayList, boolean z11, fz.c cVar, fz.c cVar2, fz.c cVar3, fz.c cVar4, fz.c cVar5, int i11) {
        this.f23975e = list;
        this.f23976f = list2;
        this.f23977t = arrayList;
        this.f23972b = z11;
        this.f23973c = cVar;
        this.H = cVar2;
        this.K = cVar3;
        this.L = cVar4;
        this.M = cVar5;
        this.f23974d = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23971a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(805306369);
                v2.j(this.f23972b, (ht.l) this.f23975e, this.f23974d, (z1.r) this.f23976f, (ns.z) this.f23977t, (fz.a) this.H, (fz.a) this.K, this.f23973c, (t1.d) this.L, (fz.e) this.M, (l1.n) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                pr.f0.l((List) this.f23975e, (List) this.f23976f, (ArrayList) this.f23977t, this.f23972b, this.f23973c, (fz.c) this.H, (fz.c) this.K, (fz.c) this.L, (fz.c) this.M, (l1.n) obj, l1.t.M(this.f23974d | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ l2(boolean z11, ht.l lVar, int i11, z1.r rVar, ns.z zVar, fz.a aVar, fz.a aVar2, fz.c cVar, t1.d dVar, fz.e eVar, int i12) {
        this.f23972b = z11;
        this.f23975e = lVar;
        this.f23974d = i11;
        this.f23976f = rVar;
        this.f23977t = zVar;
        this.H = aVar;
        this.K = aVar2;
        this.f23973c = cVar;
        this.L = dVar;
        this.M = eVar;
    }
}
