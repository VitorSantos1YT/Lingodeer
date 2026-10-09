package nv;

import bp.d1;
import java.util.ArrayList;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f44124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f44125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f44126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f44127e;

    public /* synthetic */ e(ArrayList arrayList, String str, fz.a aVar, fz.c cVar, int i11) {
        this.f44123a = i11;
        this.f44124b = arrayList;
        this.f44125c = str;
        this.f44126d = aVar;
        this.f44127e = cVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        l0.h LazyColumn = (l0.h) obj;
        switch (this.f44123a) {
            case 0:
                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                ArrayList arrayList = this.f44124b;
                LazyColumn.q(arrayList.size(), null, new d1(4, arrayList), new t1.d(new j(arrayList, this.f44125c, this.f44126d, this.f44127e, 1), true, 802480018));
                break;
            default:
                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                ArrayList arrayList2 = this.f44124b;
                LazyColumn.q(arrayList2.size(), null, new d1(5, arrayList2), new t1.d(new j(arrayList2, this.f44125c, this.f44126d, this.f44127e, 2), true, 802480018));
                break;
        }
        return b0.f48488a;
    }
}
