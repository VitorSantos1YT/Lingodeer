package tg;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t1.d f52332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f52333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f52334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f52335d;

    public p(t1.d dVar, i0 i0Var, List list, int i11) {
        this.f52332a = dVar;
        this.f52333b = i0Var;
        this.f52334c = list;
        this.f52335d = i11;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            l1.s sVar = (l1.s) nVar;
            if (sVar.F()) {
                sVar.W();
            } else {
                this.f52332a.f(this.f52333b, this.f52334c.get(this.f52335d), nVar, 0);
            }
        } else {
            this.f52332a.f(this.f52333b, this.f52334c.get(this.f52335d), nVar, 0);
        }
        return qy.b0.f48488a;
    }
}
