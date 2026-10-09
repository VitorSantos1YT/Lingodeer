package xn;

import java.util.List;
import l1.n;
import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f56134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f56135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f56136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f56137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f56138f;

    public /* synthetic */ f(String str, List list, List list2, fz.c cVar, int i11, int i12) {
        this.f56133a = i12;
        this.f56134b = str;
        this.f56135c = list;
        this.f56136d = list2;
        this.f56137e = cVar;
        this.f56138f = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56133a) {
            case 0:
                ((Integer) obj2).intValue();
                a.n(this.f56134b, this.f56135c, this.f56136d, this.f56137e, (n) obj, t.M(this.f56138f | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                a.o(this.f56134b, this.f56135c, this.f56136d, this.f56137e, (n) obj, t.M(this.f56138f | 1));
                break;
        }
        return b0.f48488a;
    }
}
