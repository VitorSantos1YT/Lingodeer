package pr;

import bp.p0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f46993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f46994c;

    public /* synthetic */ a(int i11, fz.c cVar, List list) {
        this.f46992a = i11;
        this.f46993b = list;
        this.f46994c = cVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f46992a) {
            case 0:
                m0.j LazyVerticalGrid = (m0.j) obj;
                kotlin.jvm.internal.m.f(LazyVerticalGrid, "$this$LazyVerticalGrid");
                List list = this.f46993b;
                LazyVerticalGrid.q(list.size(), null, null, new p0(25, list), new t1.d(new e(0, this.f46994c, list), true, -1117249557));
                break;
            case 1:
                l0.h LazyColumn = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                List list2 = this.f46993b;
                LazyColumn.q(list2.size(), null, new qu.m(9, list2), new t1.d(new e(4, this.f46994c, list2), true, 802480018));
                break;
            case 2:
                m0.j LazyVerticalGrid2 = (m0.j) obj;
                kotlin.jvm.internal.m.f(LazyVerticalGrid2, "$this$LazyVerticalGrid");
                m0.j.p(LazyVerticalGrid2, new vr.a(18), xn.a.f56117b, 5);
                List list3 = this.f46993b;
                int size = list3.size();
                qu.m mVar = new qu.m(11, list3);
                fz.c cVar = this.f46994c;
                LazyVerticalGrid2.q(size, null, null, mVar, new t1.d(new e(5, cVar, list3), true, -1117249557));
                m0.j.p(LazyVerticalGrid2, new vr.a(19), xn.a.f56118c, 5);
                m0.j.p(LazyVerticalGrid2, new vr.a(20), new t1.d(new f0.t(cVar, 10), true, -1543590655), 5);
                m0.j.p(LazyVerticalGrid2, new vr.a(21), new t1.d(new f0.t(cVar, 11), true, 1055353282), 5);
                m0.j.p(LazyVerticalGrid2, new vr.a(22), xn.a.f56119d, 5);
                m0.j.p(LazyVerticalGrid2, new vr.a(23), new t1.d(new f0.t(cVar, 12), true, 1958273860), 5);
                break;
            default:
                l0.h LazyColumn2 = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn2, "$this$LazyColumn");
                List list4 = this.f46993b;
                LazyColumn2.q(list4.size(), null, new qu.m(13, list4), new t1.d(new e(6, this.f46994c, list4), true, 2039820996));
                break;
        }
        return qy.b0.f48488a;
    }
}
