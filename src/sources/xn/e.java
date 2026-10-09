package xn;

import java.util.List;
import kotlin.jvm.internal.m;
import qy.b0;
import w2.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f56130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f56131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v3.c f56132d;

    public /* synthetic */ e(List list, List list2, v3.c cVar, int i11) {
        this.f56129a = i11;
        this.f56130b = list;
        this.f56131c = list2;
        this.f56132d = cVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        x it = (x) obj;
        switch (this.f56129a) {
            case 0:
                m.f(it, "it");
                List list = this.f56130b;
                if (list.size() < ((List) this.f56131c.get(0)).size()) {
                    list.add(new v3.f(this.f56132d.Q((int) (it.m() & 4294967295L))));
                }
                break;
            case 1:
                m.f(it, "it");
                List list2 = this.f56130b;
                if (list2.size() < ((List) this.f56131c.get(1)).size()) {
                    list2.add(new v3.f(this.f56132d.Q((int) (it.m() & 4294967295L))));
                }
                break;
            case 2:
                m.f(it, "it");
                List list3 = this.f56130b;
                if (list3.size() < ((List) this.f56131c.get(0)).size()) {
                    list3.add(new v3.f(this.f56132d.Q((int) (it.m() & 4294967295L))));
                }
                break;
            case 3:
                m.f(it, "it");
                List list4 = this.f56130b;
                if (list4.size() < ((List) this.f56131c.get(1)).size()) {
                    list4.add(new v3.f(this.f56132d.Q((int) (it.m() & 4294967295L))));
                }
                break;
            default:
                m.f(it, "it");
                List list5 = this.f56130b;
                if (list5.size() < ((List) this.f56131c.get(2)).size()) {
                    list5.add(new v3.f(this.f56132d.Q((int) (it.m() & 4294967295L))));
                }
                break;
        }
        return b0.f48488a;
    }
}
