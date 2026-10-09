package yc;

import fd.w;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements c, zc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f57728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f57729b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f57730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zc.g f57731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zc.g f57732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zc.g f57733f;

    public v(gd.c cVar, fd.n nVar) {
        this.f57728a = nVar.f27190d;
        this.f57730c = (w) nVar.f27188b;
        zc.g gVarI = nVar.f27189c.I();
        this.f57731d = gVarI;
        zc.g gVarI2 = ((ed.b) nVar.f27191e).I();
        this.f57732e = gVarI2;
        zc.g gVarI3 = ((ed.b) nVar.f27192f).I();
        this.f57733f = gVarI3;
        cVar.g(gVarI);
        cVar.g(gVarI2);
        cVar.g(gVarI3);
        gVarI.a(this);
        gVarI2.a(this);
        gVarI3.a(this);
    }

    @Override // zc.a
    public final void b() {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f57729b;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((zc.a) arrayList.get(i11)).b();
            i11++;
        }
    }

    public final void f(zc.a aVar) {
        this.f57729b.add(aVar);
    }

    @Override // yc.c
    public final void c(List list, List list2) {
    }
}
