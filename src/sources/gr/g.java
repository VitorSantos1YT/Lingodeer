package gr;

import android.content.res.Resources;
import gp.l1;
import java.util.List;
import java.util.Set;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements fz.e {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29682a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f29683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f29684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f29685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f29686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f29687f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f29688t;

    public /* synthetic */ g(float f5, Resources resources, ni.m mVar, l1 l1Var, fz.c cVar, fz.a aVar, fz.a aVar2, int i11) {
        this.f29683b = f5;
        this.f29687f = resources;
        this.f29688t = mVar;
        this.H = l1Var;
        this.f29686e = cVar;
        this.f29684c = aVar;
        this.f29685d = aVar2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29682a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(1);
                n.g(this.f29683b, (Resources) this.f29687f, (ni.m) this.f29688t, (l1) this.H, this.f29686e, this.f29684c, this.f29685d, (l1.n) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = l1.t.M(221185);
                mt.g.e((List) this.f29687f, (String) this.f29688t, this.f29683b, (Set) this.H, this.f29684c, this.f29685d, this.f29686e, (l1.n) obj, iM2);
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ g(List list, String str, float f5, Set set, fz.a aVar, fz.a aVar2, fz.c cVar, int i11) {
        this.f29687f = list;
        this.f29688t = str;
        this.f29683b = f5;
        this.H = set;
        this.f29684c = aVar;
        this.f29685d = aVar2;
        this.f29686e = cVar;
    }
}
