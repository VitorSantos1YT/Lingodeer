package xu;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f56332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f56333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f56334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f56335e;

    public /* synthetic */ b1(List list, fz.c cVar, fz.c cVar2, fz.c cVar3, int i11) {
        this.f56331a = i11;
        this.f56332b = list;
        this.f56333c = cVar;
        this.f56334d = cVar2;
        this.f56335e = cVar3;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        l0.h LazyColumn = (l0.h) obj;
        switch (this.f56331a) {
            case 0:
                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                l0.h.p(LazyColumn, null, c.Z, 3);
                List list = this.f56332b;
                LazyColumn.q(list.size(), null, new qu.m(15, list), new t1.d(new g1(list, this.f56333c, this.f56334d, this.f56335e, list, 0), true, 2039820996));
                break;
            default:
                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                List list2 = this.f56332b;
                LazyColumn.q(list2.size(), null, new qu.m(16, list2), new t1.d(new g1(list2, this.f56333c, this.f56334d, this.f56335e, list2, 1), true, 2039820996));
                break;
        }
        return qy.b0.f48488a;
    }
}
