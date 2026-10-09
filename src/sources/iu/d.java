package iu;

import bp.p0;
import java.util.List;
import mt.h6;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f34576b;

    public /* synthetic */ d(int i11, List list) {
        this.f34575a = i11;
        this.f34576b = list;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f34575a) {
            case 0:
                return this.f34576b.get(((Integer) obj).intValue());
            case 1:
                l0.h LazyColumn = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                mt.k kVar = new mt.k(9, (byte) 0);
                List list = this.f34576b;
                LazyColumn.q(list.size(), new av.r(13, kVar, list), new p0(22, list), new t1.d(new h6(0, list, list), true, 2039820996));
                return b0.f48488a;
            default:
                l0.h LazyColumn2 = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn2, "$this$LazyColumn");
                List list2 = this.f34576b;
                LazyColumn2.q(list2.size(), null, new qu.m(14, list2), new t1.d(new h6(1, list2, list2), true, 2039820996));
                return b0.f48488a;
        }
    }
}
