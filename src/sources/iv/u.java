package iv;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f34836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f34837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f34838d;

    public /* synthetic */ u(List list, fz.c cVar, l1.b1 b1Var, int i11) {
        this.f34835a = i11;
        this.f34836b = list;
        this.f34837c = cVar;
        this.f34838d = b1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        l0.h LazyColumn = (l0.h) obj;
        switch (this.f34835a) {
            case 0:
                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                List list = this.f34836b;
                LazyColumn.q(list.size(), null, new bp.p0(7, list), new t1.d(new v(list, this.f34837c, this.f34838d, 0), true, 802480018));
                break;
            default:
                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                List list2 = this.f34836b;
                LazyColumn.q(list2.size(), null, new bp.p0(29, list2), new t1.d(new v(list2, this.f34837c, this.f34838d, 2), true, 802480018));
                break;
        }
        return qy.b0.f48488a;
    }
}
